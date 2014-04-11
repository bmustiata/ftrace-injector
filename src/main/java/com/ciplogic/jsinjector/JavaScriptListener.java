// Generated from JavaScript.g4 by ANTLR 4.2.2
package com.ciplogic.jsinjector;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaScriptParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#randomJunk}.
	 * @param ctx the parse tree
	 */
	void enterRandomJunk(@NotNull JavaScriptParser.RandomJunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#randomJunk}.
	 * @param ctx the parse tree
	 */
	void exitRandomJunk(@NotNull JavaScriptParser.RandomJunkContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParams(@NotNull JavaScriptParser.FunctionParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParams(@NotNull JavaScriptParser.FunctionParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaScriptParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#unnamedFunction}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedFunction(@NotNull JavaScriptParser.UnnamedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#unnamedFunction}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedFunction(@NotNull JavaScriptParser.UnnamedFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull JavaScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull JavaScriptParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#namedFunction}.
	 * @param ctx the parse tree
	 */
	void enterNamedFunction(@NotNull JavaScriptParser.NamedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#namedFunction}.
	 * @param ctx the parse tree
	 */
	void exitNamedFunction(@NotNull JavaScriptParser.NamedFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull JavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull JavaScriptParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#unnamedSimpleFunction}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedSimpleFunction(@NotNull JavaScriptParser.UnnamedSimpleFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#unnamedSimpleFunction}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedSimpleFunction(@NotNull JavaScriptParser.UnnamedSimpleFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull JavaScriptParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull JavaScriptParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull JavaScriptParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull JavaScriptParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#objectFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectFunction(@NotNull JavaScriptParser.ObjectFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#objectFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectFunction(@NotNull JavaScriptParser.ObjectFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull JavaScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull JavaScriptParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAssignedFunction(@NotNull JavaScriptParser.AssignedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAssignedFunction(@NotNull JavaScriptParser.AssignedFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#unnamedContextFunction}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedContextFunction(@NotNull JavaScriptParser.UnnamedContextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#unnamedContextFunction}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedContextFunction(@NotNull JavaScriptParser.UnnamedContextFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(@NotNull JavaScriptParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(@NotNull JavaScriptParser.RegexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx);
}