// Generated from JavaScript.g4 by ANTLR 4.2.2
package com.ciplogic.jsinjector;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOUBLE_QUOTE_STRING=1, SINGLE_QUOTE_STRING=2, ESC=3, LINE_COMMENT=4, MULTILINE_COMMENT=5, 
		REGEXP=6, REGEXP_ESC=7, FUNCTION=8, WORD=9, LETTER=10, DIGIT=11, START_BLOCK=12, 
		END_BLOCK=13, COMMA=14, LP=15, RP=16, EQ=17, COLON=18, WS=19, SYMBOL=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "ESC", "LINE_COMMENT", "MULTILINE_COMMENT", 
		"REGEXP", "'\\/'", "'function'", "WORD", "LETTER", "DIGIT", "'{'", "'}'", 
		"','", "'('", "')'", "'='", "':'", "WS", "SYMBOL"
	};
	public static final String[] ruleNames = {
		"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "ESC", "LINE_COMMENT", "MULTILINE_COMMENT", 
		"REGEXP", "REGEXP_ESC", "FUNCTION", "WORD", "LETTER", "DIGIT", "START_BLOCK", 
		"END_BLOCK", "COMMA", "LP", "RP", "EQ", "COLON", "WS", "SYMBOL"
	};


	    public static final int WHITESPACE = 1;
	    public static final int COMMENTS = 2;


	public JavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 4: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = COMMENTS; break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = WHITESPACE; break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = COMMENTS; break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4D\n\4\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7"+
		"\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\6\ny\n\n\r\n\16\nz\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u0090\n\24"+
		"\r\24\16\24\u0091\3\24\3\24\3\25\3\25\7\60:KXe\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\6\4\2\f\f``\6\2&&C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00a2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\65\3\2\2\2\7C\3\2"+
		"\2\2\tE\3\2\2\2\13R\3\2\2\2\r`\3\2\2\2\17j\3\2\2\2\21m\3\2\2\2\23x\3\2"+
		"\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2\2\33\u0082\3\2\2\2\35\u0084"+
		"\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2"+
		"\'\u008f\3\2\2\2)\u0095\3\2\2\2+\60\7$\2\2,/\5\7\4\2-/\13\2\2\2.,\3\2"+
		"\2\2.-\3\2\2\2/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\7$\2\2\64\4\3\2\2\2\65:\7)\2\2\669\5\7\4\2\679\13\2"+
		"\2\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2<"+
		":\3\2\2\2=>\7)\2\2>\6\3\2\2\2?@\7^\2\2@D\7)\2\2AB\7^\2\2BD\7$\2\2C?\3"+
		"\2\2\2CA\3\2\2\2D\b\3\2\2\2EF\7\61\2\2FG\7\61\2\2GK\3\2\2\2HJ\13\2\2\2"+
		"IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\f\2\2"+
		"OP\3\2\2\2PQ\b\5\2\2Q\n\3\2\2\2RS\7\61\2\2ST\7,\2\2TX\3\2\2\2UW\13\2\2"+
		"\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7,\2"+
		"\2\\]\7\61\2\2]^\3\2\2\2^_\b\6\3\2_\f\3\2\2\2`e\7\61\2\2ad\5\17\b\2bd"+
		"\t\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2g"+
		"e\3\2\2\2hi\7\61\2\2i\16\3\2\2\2jk\7^\2\2kl\7\61\2\2l\20\3\2\2\2mn\7h"+
		"\2\2no\7w\2\2op\7p\2\2pq\7e\2\2qr\7v\2\2rs\7k\2\2st\7q\2\2tu\7p\2\2u\22"+
		"\3\2\2\2vy\5\25\13\2wy\5\27\f\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{\24\3\2\2\2|}\t\3\2\2}\26\3\2\2\2~\177\t\4\2\2\177\30\3\2"+
		"\2\2\u0080\u0081\7}\2\2\u0081\32\3\2\2\2\u0082\u0083\7\177\2\2\u0083\34"+
		"\3\2\2\2\u0084\u0085\7.\2\2\u0085\36\3\2\2\2\u0086\u0087\7*\2\2\u0087"+
		" \3\2\2\2\u0088\u0089\7+\2\2\u0089\"\3\2\2\2\u008a\u008b\7?\2\2\u008b"+
		"$\3\2\2\2\u008c\u008d\7<\2\2\u008d&\3\2\2\2\u008e\u0090\t\5\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\24\4\2\u0094(\3\2\2\2\u0095\u0096"+
		"\13\2\2\2\u0096*\3\2\2\2\17\2.\608:CKXcexz\u0091\5\3\5\2\3\6\3\3\24\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}