// Generated from /home/annopaolo/Scrivania/demo_1/app/src/main/antlr/com/demo/Demo.g4 by ANTLR 4.8
 package com.demo; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		NUMBER=18, TF=19, WS=20, LINECOMMENTS=21, BLOCKCOMMENTS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "CHAR", 
			"ID", "DIGIT", "NUMBER", "TF", "WS", "LINECOMMENTS", "BLOCKCOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "'*'", "'/'", "'+'", "'NOT'", "'AND'", "'OR'", 
			"'XOR'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "NUMBER", "TF", "WS", "LINECOMMENTS", 
			"BLOCKCOMMENTS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\7\23d\n\23\f\23\16\23g\13\23\3\24\3\24\3\25\6\25l\n\25\r\25\16"+
		"\25m\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26y\n\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0083\n\30\f\30\16\30\u0086\13\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0093\n\31"+
		"\f\31\16\31\u0096\13\31\3\31\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%"+
		"\23\'\2)\24+\25-\26/\27\61\30\3\2\b\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2"+
		"\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21C\3\2\2\2\23G\3\2"+
		"\2\2\25J\3\2\2\2\27N\3\2\2\2\31Q\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3"+
		"\2\2\2![\3\2\2\2#^\3\2\2\2%`\3\2\2\2\'h\3\2\2\2)k\3\2\2\2+x\3\2\2\2-z"+
		"\3\2\2\2/~\3\2\2\2\61\u0089\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65\66\7"+
		"+\2\2\66\6\3\2\2\2\678\7/\2\28\b\3\2\2\29:\7,\2\2:\n\3\2\2\2;<\7\61\2"+
		"\2<\f\3\2\2\2=>\7-\2\2>\16\3\2\2\2?@\7P\2\2@A\7Q\2\2AB\7V\2\2B\20\3\2"+
		"\2\2CD\7C\2\2DE\7P\2\2EF\7F\2\2F\22\3\2\2\2GH\7Q\2\2HI\7T\2\2I\24\3\2"+
		"\2\2JK\7Z\2\2KL\7Q\2\2LM\7T\2\2M\26\3\2\2\2NO\7?\2\2OP\7?\2\2P\30\3\2"+
		"\2\2QR\7#\2\2RS\7?\2\2S\32\3\2\2\2TU\7@\2\2U\34\3\2\2\2VW\7>\2\2W\36\3"+
		"\2\2\2XY\7@\2\2YZ\7?\2\2Z \3\2\2\2[\\\7>\2\2\\]\7?\2\2]\"\3\2\2\2^_\t"+
		"\2\2\2_$\3\2\2\2`e\5#\22\2ad\5#\22\2bd\5\'\24\2ca\3\2\2\2cb\3\2\2\2dg"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2f&\3\2\2\2ge\3\2\2\2hi\4\62;\2i(\3\2\2\2j"+
		"l\5\'\24\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n*\3\2\2\2op\7v\2\2"+
		"pq\7t\2\2qr\7w\2\2ry\7g\2\2st\7h\2\2tu\7c\2\2uv\7n\2\2vw\7u\2\2wy\7g\2"+
		"\2xo\3\2\2\2xs\3\2\2\2y,\3\2\2\2z{\t\3\2\2{|\3\2\2\2|}\b\27\2\2}.\3\2"+
		"\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\n\4\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\30"+
		"\2\2\u0088\60\3\2\2\2\u0089\u008a\7\61\2\2\u008a\u008b\7,\2\2\u008b\u0094"+
		"\3\2\2\2\u008c\u0093\n\5\2\2\u008d\u008e\7\61\2\2\u008e\u0093\n\6\2\2"+
		"\u008f\u0090\7,\2\2\u0090\u0093\n\7\2\2\u0091\u0093\5\61\31\2\u0092\u008c"+
		"\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099\7\61\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\b\31\2\2\u009b\62\3\2\2\2\n\2cemx\u0084\u0092"+
		"\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}