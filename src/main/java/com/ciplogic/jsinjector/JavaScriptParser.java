package com.ciplogic.jsinjector;// Generated from JavaScript.g4 by ANTLR 4.1

// Generated from JavaScript.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOUBLE_QUOTE_STRING=1, SINGLE_QUOTE_STRING=2, ESC=3, LINE_COMMENT=4, MULTILINE_COMMENT=5, 
		REGEXP=6, REGEXP_ESC=7, FUNCTION=8, WORD=9, LETTER=10, DIGIT=11, START_BLOCK=12, 
		END_BLOCK=13, COMMA=14, LP=15, RP=16, EQ=17, COLON=18, WS=19, SYMBOL=20;
	public static final String[] tokenNames = {
		"<INVALID>", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "ESC", "LINE_COMMENT", 
		"MULTILINE_COMMENT", "REGEXP", "'\\/'", "'function'", "WORD", "LETTER", 
		"DIGIT", "'{'", "'}'", "','", "'('", "')'", "'='", "':'", "WS", "SYMBOL"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_function = 2, RULE_assignedFunction = 3, 
		RULE_objectFunction = 4, RULE_anonymousFunction = 5, RULE_unnamedFunction = 6, 
		RULE_unnamedContextFunction = 7, RULE_unnamedSimpleFunction = 8, RULE_namedFunction = 9, 
		RULE_functionParams = 10, RULE_functionParameter = 11, RULE_block = 12, 
		RULE_comment = 13, RULE_identifier = 14, RULE_randomJunk = 15, RULE_string = 16, 
		RULE_regexp = 17;
	public static final String[] ruleNames = {
		"program", "expression", "function", "assignedFunction", "objectFunction", 
		"anonymousFunction", "unnamedFunction", "unnamedContextFunction", "unnamedSimpleFunction", 
		"namedFunction", "functionParams", "functionParameter", "block", "comment", 
		"identifier", "randomJunk", "string", "regexp"
	};

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE_STRING) | (1L << SINGLE_QUOTE_STRING) | (1L << LINE_COMMENT) | (1L << MULTILINE_COMMENT) | (1L << REGEXP) | (1L << FUNCTION) | (1L << WORD) | (1L << START_BLOCK) | (1L << COMMA) | (1L << LP) | (1L << RP) | (1L << EQ) | (1L << COLON) | (1L << SYMBOL))) != 0)) {
				{
				{
				setState(36); expression();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RandomJunkContext randomJunk() {
			return getRuleContext(RandomJunkContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); function();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); comment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45); randomJunk();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); string();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47); regexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public AssignedFunctionContext assignedFunction() {
			return getRuleContext(AssignedFunctionContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public NamedFunctionContext namedFunction() {
			return getRuleContext(NamedFunctionContext.class,0);
		}
		public ObjectFunctionContext objectFunction() {
			return getRuleContext(ObjectFunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); anonymousFunction();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); assignedFunction();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); objectFunction();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); namedFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignedFunctionContext extends ParserRuleContext {
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterAssignedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitAssignedFunction(this);
		}
	}

	public final AssignedFunctionContext assignedFunction() throws RecognitionException {
		AssignedFunctionContext _localctx = new AssignedFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignedFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); identifier();
			setState(57); match(EQ);
			setState(58); unnamedFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectFunctionContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ObjectFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterObjectFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitObjectFunction(this);
		}
	}

	public final ObjectFunctionContext objectFunction() throws RecognitionException {
		ObjectFunctionContext _localctx = new ObjectFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objectFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE_STRING:
			case SINGLE_QUOTE_STRING:
				{
				setState(60); string();
				}
				break;
			case WORD:
				{
				setState(61); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64); match(COLON);
			setState(65); unnamedFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitAnonymousFunction(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anonymousFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); unnamedFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamedFunctionContext extends ParserRuleContext {
		public UnnamedContextFunctionContext unnamedContextFunction() {
			return getRuleContext(UnnamedContextFunctionContext.class,0);
		}
		public UnnamedSimpleFunctionContext unnamedSimpleFunction() {
			return getRuleContext(UnnamedSimpleFunctionContext.class,0);
		}
		public UnnamedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterUnnamedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitUnnamedFunction(this);
		}
	}

	public final UnnamedFunctionContext unnamedFunction() throws RecognitionException {
		UnnamedFunctionContext _localctx = new UnnamedFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unnamedFunction);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); unnamedContextFunction();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); unnamedSimpleFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamedContextFunctionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public UnnamedContextFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedContextFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterUnnamedContextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitUnnamedContextFunction(this);
		}
	}

	public final UnnamedContextFunctionContext unnamedContextFunction() throws RecognitionException {
		UnnamedContextFunctionContext _localctx = new UnnamedContextFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unnamedContextFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(LP);
			setState(74); match(FUNCTION);
			setState(75); match(LP);
			setState(77);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(76); functionParams();
				}
			}

			setState(79); match(RP);
			setState(80); block();
			setState(81); match(RP);
			setState(82); match(LP);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(83); expression();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(89); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamedSimpleFunctionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public UnnamedSimpleFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedSimpleFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterUnnamedSimpleFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitUnnamedSimpleFunction(this);
		}
	}

	public final UnnamedSimpleFunctionContext unnamedSimpleFunction() throws RecognitionException {
		UnnamedSimpleFunctionContext _localctx = new UnnamedSimpleFunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unnamedSimpleFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(FUNCTION);
			setState(92); match(LP);
			setState(94);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(93); functionParams();
				}
			}

			setState(96); match(RP);
			setState(97); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFunctionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterNamedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitNamedFunction(this);
		}
	}

	public final NamedFunctionContext namedFunction() throws RecognitionException {
		NamedFunctionContext _localctx = new NamedFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_namedFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(FUNCTION);
			setState(100); identifier();
			setState(101); match(LP);
			setState(103);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(102); functionParams();
				}
			}

			setState(105); match(RP);
			setState(106); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParamsContext extends ParserRuleContext {
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionParams(this);
		}
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); functionParameter();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109); match(COMMA);
				setState(110); functionParameter();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JavaScriptParser.WORD, 0); }
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionParameter(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(START_BLOCK);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE_STRING) | (1L << SINGLE_QUOTE_STRING) | (1L << LINE_COMMENT) | (1L << MULTILINE_COMMENT) | (1L << REGEXP) | (1L << FUNCTION) | (1L << WORD) | (1L << START_BLOCK) | (1L << COMMA) | (1L << LP) | (1L << RP) | (1L << EQ) | (1L << COLON) | (1L << SYMBOL))) != 0)) {
				{
				{
				setState(119); expression();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); match(END_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode MULTILINE_COMMENT() { return getToken(JavaScriptParser.MULTILINE_COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(JavaScriptParser.LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==MULTILINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JavaScriptParser.WORD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandomJunkContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JavaScriptParser.WORD, 0); }
		public TerminalNode SYMBOL() { return getToken(JavaScriptParser.SYMBOL, 0); }
		public TerminalNode LP() { return getToken(JavaScriptParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(JavaScriptParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(JavaScriptParser.RP, 0); }
		public TerminalNode COLON() { return getToken(JavaScriptParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(JavaScriptParser.EQ, 0); }
		public RandomJunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomJunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterRandomJunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitRandomJunk(this);
		}
	}

	public final RandomJunkContext randomJunk() throws RecognitionException {
		RandomJunkContext _localctx = new RandomJunkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_randomJunk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << COMMA) | (1L << LP) | (1L << RP) | (1L << EQ) | (1L << COLON) | (1L << SYMBOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(JavaScriptParser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(JavaScriptParser.DOUBLE_QUOTE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_QUOTE_STRING || _la==SINGLE_QUOTE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexpContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(JavaScriptParser.REGEXP, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitRegexp(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(REGEXP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\26\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6A\n\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\t\5\tP\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\tW\n\t\f\t\16\tZ\13\t\3\t\3\t\3\n\3\n\3\n\5\na\n\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13j\n\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fr\n\f\f"+
		"\f\16\fu\13\f\3\r\3\r\3\16\3\16\7\16{\n\16\f\16\16\16~\13\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\6\7\5\2\13\13\20\24\26\26\3"+
		"\2\3\4\u008a\2)\3\2\2\2\4\62\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n@\3\2\2\2"+
		"\fE\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22]\3\2\2\2\24e\3\2\2\2\26n\3\2\2"+
		"\2\30v\3\2\2\2\32x\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2\2 \u0085\3"+
		"\2\2\2\"\u0087\3\2\2\2$\u0089\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)"+
		"\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,\63\5\6\4\2-\63\5\32\16\2.\63"+
		"\5\34\17\2/\63\5 \21\2\60\63\5\"\22\2\61\63\5$\23\2\62,\3\2\2\2\62-\3"+
		"\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2"+
		"\2\649\5\f\7\2\659\5\b\5\2\669\5\n\6\2\679\5\24\13\28\64\3\2\2\28\65\3"+
		"\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\5\36\20\2;<\7\23\2\2<=\5\16"+
		"\b\2=\t\3\2\2\2>A\5\"\22\2?A\5\36\20\2@>\3\2\2\2@?\3\2\2\2AB\3\2\2\2B"+
		"C\7\24\2\2CD\5\16\b\2D\13\3\2\2\2EF\5\16\b\2F\r\3\2\2\2GJ\5\20\t\2HJ\5"+
		"\22\n\2IG\3\2\2\2IH\3\2\2\2J\17\3\2\2\2KL\7\21\2\2LM\7\n\2\2MO\7\21\2"+
		"\2NP\5\26\f\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\22\2\2RS\5\32\16\2ST\7"+
		"\22\2\2TX\7\21\2\2UW\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y"+
		"[\3\2\2\2ZX\3\2\2\2[\\\7\22\2\2\\\21\3\2\2\2]^\7\n\2\2^`\7\21\2\2_a\5"+
		"\26\f\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\22\2\2cd\5\32\16\2d\23\3\2\2"+
		"\2ef\7\n\2\2fg\5\36\20\2gi\7\21\2\2hj\5\26\f\2ih\3\2\2\2ij\3\2\2\2jk\3"+
		"\2\2\2kl\7\22\2\2lm\5\32\16\2m\25\3\2\2\2ns\5\30\r\2op\7\20\2\2pr\5\30"+
		"\r\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\27\3\2\2\2us\3\2\2\2vw\7"+
		"\13\2\2w\31\3\2\2\2x|\7\16\2\2y{\5\4\3\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\17\2\2\u0080\33\3\2\2\2"+
		"\u0081\u0082\t\2\2\2\u0082\35\3\2\2\2\u0083\u0084\7\13\2\2\u0084\37\3"+
		"\2\2\2\u0085\u0086\t\3\2\2\u0086!\3\2\2\2\u0087\u0088\t\4\2\2\u0088#\3"+
		"\2\2\2\u0089\u008a\7\b\2\2\u008a%\3\2\2\2\r)\628@IOX`is|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}