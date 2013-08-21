package com.ciplogic.jsinjector;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.io.OutputStream;

public class IOInjectTraceWrap {
    private final String resourceName;
    private final InputStream inputStream;
    private final OutputStream outputStream;

    public IOInjectTraceWrap(String resourceName, InputStream inputStream, OutputStream outputStream) {
        this.resourceName = resourceName;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    public void write() {
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(this.inputStream);
            JavaScriptLexer lexer = new JavaScriptLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            JavaScriptParser javaScriptParser = new JavaScriptParser(commonTokenStream);
            JavaScriptParser.ProgramContext tree = javaScriptParser.program();

            InjectCiplogicTraceWrap traceWrapInjector = new InjectCiplogicTraceWrap(this.resourceName, commonTokenStream);
            new ParseTreeWalker().walk(traceWrapInjector, tree);

            IOUtils.write(traceWrapInjector.getFinalSource(), outputStream, "UTF-8");
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }
}
