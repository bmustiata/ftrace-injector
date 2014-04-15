package com.ciplogic.jsinjector;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            printUsage();
            System.exit(1);
        }

        String jsFile = args[0];
        String fileIdentifier = args[1];

        ParsedFile parsedFile = new ParsedFile(jsFile, fileIdentifier);
        ANTLRInputStream inputStream = new ANTLRInputStream(new FileReader(parsedFile.getPath()));

        JavaScriptLexer lexer = new JavaScriptLexer(inputStream);

        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        JavaScriptParser javaScriptParser = new JavaScriptParser(commonTokenStream);

        JavaScriptParser.ProgramContext tree = javaScriptParser.program();

        InjectCiplogicTraceWrap traceWrapInjector = new InjectCiplogicTraceWrap(parsedFile.getDebugName(), commonTokenStream);
        new ParseTreeWalker().walk(traceWrapInjector, tree);

        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(jsFile), "utf-8");
//            writer = new OutputStreamWriter(System.out, "utf-8");
            writer.write(traceWrapInjector.getFinalSource());
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }

    private static void printUsage() {
        System.out.println("Usage: \n\n" +
                "java -jar jsinjector.jar /path/to/file.js identifier.js\n\n" +
                "identifier.js is the name you want in the log. The line number is appended automatically.");
    }
}
