// Generated from /home/annopaolo/Scrivania/demo_1/app/src/main/antlr/com/demo/Demo.g4 by ANTLR 4.8
 package com.demo; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		NUMBER=18, TF=19, WS=20, LINECOMMENTS=21, BLOCKCOMMENTS=22;
	public static final int
		RULE_exp = 0, RULE_arithmExp = 1, RULE_boolExp = 2, RULE_variable = 3, 
		RULE_integer = 4, RULE_bool = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"exp", "arithmExp", "boolExp", "variable", "integer", "bool"
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

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpContext extends ParserRuleContext {
		public ArithmExpContext arithmExp() {
			return getRuleContext(ArithmExpContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				arithmExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				boolExp(0);
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

	public static class ArithmExpContext extends ParserRuleContext {
		public ArithmExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmExp; }
	 
		public ArithmExpContext() { }
		public void copyFrom(ArithmExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegArithmeticExpContext extends ArithmExpContext {
		public ArithmExpContext arithmExp() {
			return getRuleContext(ArithmExpContext.class,0);
		}
		public NegArithmeticExpContext(ArithmExpContext ctx) { copyFrom(ctx); }
	}
	public static class ValArithmeticExpContext extends ArithmExpContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ValArithmeticExpContext(ArithmExpContext ctx) { copyFrom(ctx); }
	}
	public static class BinArithmeticExpContext extends ArithmExpContext {
		public ArithmExpContext left;
		public Token op;
		public ArithmExpContext right;
		public List<ArithmExpContext> arithmExp() {
			return getRuleContexts(ArithmExpContext.class);
		}
		public ArithmExpContext arithmExp(int i) {
			return getRuleContext(ArithmExpContext.class,i);
		}
		public BinArithmeticExpContext(ArithmExpContext ctx) { copyFrom(ctx); }
	}
	public static class BaseArithmeticExpContext extends ArithmExpContext {
		public ArithmExpContext arithmExp() {
			return getRuleContext(ArithmExpContext.class,0);
		}
		public BaseArithmeticExpContext(ArithmExpContext ctx) { copyFrom(ctx); }
	}
	public static class VarArithmeticExpContext extends ArithmExpContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarArithmeticExpContext(ArithmExpContext ctx) { copyFrom(ctx); }
	}

	public final ArithmExpContext arithmExp() throws RecognitionException {
		return arithmExp(0);
	}

	private ArithmExpContext arithmExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmExpContext _localctx = new ArithmExpContext(_ctx, _parentState);
		ArithmExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_arithmExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BaseArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				match(T__0);
				setState(18);
				arithmExp(0);
				setState(19);
				match(T__1);
				}
				break;
			case T__2:
				{
				_localctx = new NegArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__2);
				setState(22);
				arithmExp(5);
				}
				break;
			case ID:
				{
				_localctx = new VarArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				variable();
				}
				break;
			case NUMBER:
				{
				_localctx = new ValArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BinArithmeticExpContext(new ArithmExpContext(_parentctx, _parentState));
						((BinArithmeticExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExp);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
						((BinArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((BinArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(29);
						((BinArithmeticExpContext)_localctx).right = arithmExp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinArithmeticExpContext(new ArithmExpContext(_parentctx, _parentState));
						((BinArithmeticExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExp);
						setState(30);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(31);
						((BinArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__5) ) {
							((BinArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(32);
						((BinArithmeticExpContext)_localctx).right = arithmExp(4);
						}
						break;
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExpContext extends ParserRuleContext {
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
	 
		public BoolExpContext() { }
		public void copyFrom(BoolExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolComparisonExpContext extends BoolExpContext {
		public BoolExpContext left;
		public Token op;
		public BoolExpContext right;
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public BoolComparisonExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}
	public static class NegBoolExpContext extends BoolExpContext {
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public NegBoolExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}
	public static class ValBoolExpContext extends BoolExpContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValBoolExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}
	public static class BaseBoolExpContext extends BoolExpContext {
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public BaseBoolExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticComparisonExpContext extends BoolExpContext {
		public ArithmExpContext left;
		public Token op;
		public ArithmExpContext right;
		public List<ArithmExpContext> arithmExp() {
			return getRuleContexts(ArithmExpContext.class);
		}
		public ArithmExpContext arithmExp(int i) {
			return getRuleContext(ArithmExpContext.class,i);
		}
		public ArithmeticComparisonExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}
	public static class VarBoolExpContext extends BoolExpContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarBoolExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}
	public static class BinBoolExpContext extends BoolExpContext {
		public BoolExpContext left;
		public Token op;
		public BoolExpContext right;
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public BinBoolExpContext(BoolExpContext ctx) { copyFrom(ctx); }
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new BaseBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(T__0);
				setState(40);
				boolExp(0);
				setState(41);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new NegBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(T__6);
				setState(44);
				boolExp(6);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticComparisonExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				((ArithmeticComparisonExpContext)_localctx).left = arithmExp(0);
				setState(46);
				((ArithmeticComparisonExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
					((ArithmeticComparisonExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				((ArithmeticComparisonExpContext)_localctx).right = arithmExp(0);
				}
				break;
			case 4:
				{
				_localctx = new VarBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				variable();
				}
				break;
			case 5:
				{
				_localctx = new ValBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BinBoolExpContext(new BoolExpContext(_parentctx, _parentState));
						((BinBoolExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						((BinBoolExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
							((BinBoolExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						((BinBoolExpContext)_localctx).right = boolExp(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolComparisonExpContext(new BoolExpContext(_parentctx, _parentState));
						((BoolComparisonExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(57);
						((BoolComparisonExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((BoolComparisonExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						((BoolComparisonExpContext)_localctx).right = boolExp(4);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DemoParser.NUMBER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NUMBER);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TF() { return getToken(DemoParser.TF, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TF);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return arithmExp_sempred((ArithmExpContext)_localctx, predIndex);
		case 2:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmExp_sempred(ArithmExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16"+
		"\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\2\4\4\6\b\2\4\6\b\n\f\2\7\3\2\6\7\4\2\5\5\b\b\3\2\r\22\3\2\n"+
		"\f\3\2\r\16\2N\2\20\3\2\2\2\4\33\3\2\2\2\6\65\3\2\2\2\bB\3\2\2\2\nD\3"+
		"\2\2\2\fF\3\2\2\2\16\21\5\4\3\2\17\21\5\6\4\2\20\16\3\2\2\2\20\17\3\2"+
		"\2\2\21\3\3\2\2\2\22\23\b\3\1\2\23\24\7\3\2\2\24\25\5\4\3\2\25\26\7\4"+
		"\2\2\26\34\3\2\2\2\27\30\7\5\2\2\30\34\5\4\3\7\31\34\5\b\5\2\32\34\5\n"+
		"\6\2\33\22\3\2\2\2\33\27\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34%\3\2\2"+
		"\2\35\36\f\6\2\2\36\37\t\2\2\2\37$\5\4\3\7 !\f\5\2\2!\"\t\3\2\2\"$\5\4"+
		"\3\6#\35\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'"+
		"%\3\2\2\2()\b\4\1\2)*\7\3\2\2*+\5\6\4\2+,\7\4\2\2,\66\3\2\2\2-.\7\t\2"+
		"\2.\66\5\6\4\b/\60\5\4\3\2\60\61\t\4\2\2\61\62\5\4\3\2\62\66\3\2\2\2\63"+
		"\66\5\b\5\2\64\66\5\f\7\2\65(\3\2\2\2\65-\3\2\2\2\65/\3\2\2\2\65\63\3"+
		"\2\2\2\65\64\3\2\2\2\66?\3\2\2\2\678\f\7\2\289\t\5\2\29>\5\6\4\b:;\f\5"+
		"\2\2;<\t\6\2\2<>\5\6\4\6=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3"+
		"\2\2\2@\7\3\2\2\2A?\3\2\2\2BC\7\23\2\2C\t\3\2\2\2DE\7\24\2\2E\13\3\2\2"+
		"\2FG\7\25\2\2G\r\3\2\2\2\t\20\33#%\65=?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}