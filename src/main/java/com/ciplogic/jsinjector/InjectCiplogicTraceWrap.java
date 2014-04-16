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
        wrapFunction("<anonymous>", ctx.unnamedFunction());
    }

    @Override
    public void enterAssignedFunction(@NotNull JavaScriptParser.AssignedFunctionContext ctx) {
        String name = ctx.getChild(0).getText();

        JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext = (JavaScriptParser.UnnamedFunctionContext) ctx.getChild(2);

        wrapFunction(name, unnamedFunctionContext);
    }

    @Override
    public void enterObjectFunction(@NotNull JavaScriptParser.ObjectFunctionContext ctx) {
        String name = null;

        if (ctx.string() != null) {
            String text = ctx.string().getText();
            name = text.substring(1, text.length() - 1);
        } else if (ctx.identifier() != null) {
            name = ctx.identifier().getText();
        }

        JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext = (JavaScriptParser.UnnamedFunctionContext) ctx.getChild(2);

        wrapFunction(name, unnamedFunctionContext);
    }

    @Override
    public void enterNamedFunction(@NotNull JavaScriptParser.NamedFunctionContext ctx) {
        String name = ctx.getChild(1).getText();

        String prefixWrap = String.format("function %s() { return ftrace.wrap('%s', '" + getLocation(ctx) + "', function() {", name, name);
        String suffixWrap = String.format(" return __ciplogic_%s.apply(this,arguments); }).apply(this,arguments); }", name);

        tokenStreamRewriter.insertBefore(ctx.identifier().start, "__ciplogic_");

        tokenStreamRewriter.insertBefore(ctx.start, prefixWrap);
        tokenStreamRewriter.insertAfter(ctx.stop, suffixWrap);
    }

    private void wrapFunction(String name, JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext) {
        if (unnamedFunctionContext.unnamedSimpleFunction() != null) {
            wrapSimpleFunction(name, unnamedFunctionContext);
        } else if (unnamedFunctionContext.unnamedContextFunction() != null) {
            wrapFunctionCall(name, unnamedFunctionContext);
        }
    }

    private void wrapSimpleFunction(String name, JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext) {
        String prefixWrap = String.format("ftrace.wrap('%s','" + getLocation(unnamedFunctionContext) + "',", name);
        String suffixWrap = ")";

        tokenStreamRewriter.insertBefore(unnamedFunctionContext.start, prefixWrap);
        tokenStreamRewriter.insertAfter(unnamedFunctionContext.stop, suffixWrap);
    }

    private void wrapFunctionCall(String name, JavaScriptParser.UnnamedFunctionContext unnamedFunctionContext) {
        String prefixWrap = String.format("ftrace.wrap('%s','" + getLocation(unnamedFunctionContext) + "',", name);
        JavaScriptParser.InvocationExpressionsContext invocationsExpression = unnamedFunctionContext.unnamedContextFunction().invocationExpressions();
        String suffixWrap = ")(" + invocationsExpression.expressions().getText() + ")";

        tokenStreamRewriter.delete( invocationsExpression.start, invocationsExpression.stop );
        tokenStreamRewriter.insertBefore(unnamedFunctionContext.start, prefixWrap);
        tokenStreamRewriter.insertAfter(unnamedFunctionContext.stop, suffixWrap);
    }

    public String getFinalSource() {
        return tokenStreamRewriter.getText();
    }

    private String getLocation(ParserRuleContext ctx) {
        return String.format("%s:%s", sourceFile, ctx.getStart().getLine());
    }
}
