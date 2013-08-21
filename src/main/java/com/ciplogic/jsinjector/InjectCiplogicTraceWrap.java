package com.ciplogic.jsinjector;// Generated from JavaScript.g4 by ANTLR 4.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;

public class InjectCiplogicTraceWrap extends JavaScriptBaseListener {
    private final TokenStreamRewriter tokenStreamRewriter;
    private final String sourceFile;

    public InjectCiplogicTraceWrap(String sourceFile, TokenStream tokenStream) {
        this.sourceFile = sourceFile;
        this.tokenStreamRewriter = new TokenStreamRewriter(tokenStream);
    }

    @Override
    public void enterAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx) {
        tokenStreamRewriter.insertBefore(ctx.start, "ftrace.wrap('<anonymous>','"  +  getLocation(ctx) + "',");
        tokenStreamRewriter.insertAfter(ctx.stop, ")");
    }

    @Override
    public void enterAssignedFunction(@NotNull JavaScriptParser.AssignedFunctionContext ctx) {
        String name = ctx.getChild(0).getText();

        JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext = (JavaScriptParser.UnnamedFunctionContext) ctx.getChild(2);

        String prefixWrap = String.format("ftrace.wrap('%s','" + getLocation(unnamedFunctionContext) + "',", name);
        String suffixWrap = ")";

        tokenStreamRewriter.insertBefore(unnamedFunctionContext.start, prefixWrap);
        tokenStreamRewriter.insertAfter(unnamedFunctionContext.stop, suffixWrap);
    }

    @Override
    public void enterObjectFunction(@NotNull JavaScriptParser.ObjectFunctionContext ctx) {
        String name = ctx.getChild(0).getText();

        JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext = (JavaScriptParser.UnnamedFunctionContext) ctx.getChild(2);

        String prefixWrap = String.format("ftrace.wrap('%s','" + getLocation(unnamedFunctionContext) + "',", name);
        String suffixWrap = ")";

        tokenStreamRewriter.insertBefore(unnamedFunctionContext.start, prefixWrap);
        tokenStreamRewriter.insertAfter(unnamedFunctionContext.stop, suffixWrap);
    }

    @Override
    public void enterNamedFunction(@NotNull JavaScriptParser.NamedFunctionContext ctx) {
        String name = ctx.getChild(1).getText();

        String prefixWrap = String.format("function %s() { return ftrace.wrap('%s', '" + getLocation(ctx) + "', function() {", name, name);
        String suffixWrap = String.format(" return %s.apply(this,arguments); }); }", name);

        tokenStreamRewriter.insertBefore(ctx.start, prefixWrap);
        tokenStreamRewriter.insertAfter(ctx.stop, suffixWrap);
    }

    public String getFinalSource() {
        return tokenStreamRewriter.getText();
    }

    private String getLocation(ParserRuleContext ctx) {
        return String.format("%s:%s", sourceFile, ctx.getStart().getLine());
    }
}
