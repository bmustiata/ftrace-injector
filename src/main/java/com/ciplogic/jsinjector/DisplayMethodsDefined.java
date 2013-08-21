package com.ciplogic.jsinjector;

import org.antlr.v4.runtime.misc.NotNull;

public class DisplayMethodsDefined extends JavaScriptBaseListener {
    @Override
    public void enterAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx) {
        System.out.println("<anonymous>:" + ctx.getStart().getLine());
    }

    @Override
    public void enterAssignedFunction(@NotNull JavaScriptParser.AssignedFunctionContext ctx) {
        String name = ctx.getChild(0).getText();
        System.out.println(name + ":" + ctx.getStart().getLine());
    }

    @Override
    public void enterObjectFunction(@NotNull JavaScriptParser.ObjectFunctionContext ctx) {
        String name = ctx.getChild(0).getText();
        System.out.println(name + ":" + ctx.getStart().getLine());
    }

    @Override
    public void enterNamedFunction(@NotNull JavaScriptParser.NamedFunctionContext ctx) {
        String name = ctx.getChild(1).getText();
        System.out.println(name + ":" + ctx.getStart().getLine());
    }
}
