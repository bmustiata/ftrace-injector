package com.ciplogic.jsinjector;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ParsedFile parsedFile = new ParsedFile("C:/Users/bmustiata/AppData/Roaming/npm/node_modules/yogi/lib/cmds/serve.js",
                "cmds/serve.js");
        ANTLRInputStream inputStream = new ANTLRInputStream(new FileReader(parsedFile.getPath()));

        JavaScriptLexer lexer = new JavaScriptLexer(inputStream);

        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        JavaScriptParser javaScriptParser = new JavaScriptParser(commonTokenStream);

        JavaScriptParser.ProgramContext tree = javaScriptParser.program();

//        new ParseTreeWalker().walk(new DisplayMethodsDefined(), tree);
        InjectCiplogicTraceWrap traceWrapInjector = new InjectCiplogicTraceWrap(parsedFile.getDebugName(), commonTokenStream);
        new ParseTreeWalker().walk(traceWrapInjector, tree);

        System.out.println(traceWrapInjector.getFinalSource());
    }
}
