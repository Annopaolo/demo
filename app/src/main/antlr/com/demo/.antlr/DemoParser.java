// Generated from /home/annopaolo/Scrivania/demo_3/app/src/main/antlr/com/demo/Demo.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ID=27, NUMBER=28, TF=29, WS=30, LINECOMMENTS=31, BLOCKCOMMENTS=32;
	public static final int
		RULE_block = 0, RULE_statement = 1, RULE_print = 2, RULE_ifthenelse = 3, 
		RULE_assignment = 4, RULE_declaration = 5, RULE_loop = 6, RULE_spawn = 7, 
		RULE_procedurecall = 8, RULE_exp = 9, RULE_arithmExp = 10, RULE_boolExp = 11, 
		RULE_variable = 12, RULE_integer = 13, RULE_bool = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"block", "statement", "print", "ifthenelse", "assignment", "declaration", 
			"loop", "spawn", "procedurecall", "exp", "arithmExp", "boolExp", "variable", 
			"integer", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'print'", "'if'", "'('", "')'", "'else'", 
			"'='", "':='", "'while'", "'spawn'", "'-'", "'*'", "'/'", "'+'", "'NOT'", 
			"'AND'", "'OR'", "'XOR'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUMBER", "TF", "WS", "LINECOMMENTS", "BLOCKCOMMENTS"
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0)) {
				{
				{
				setState(31);
				statement();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__1);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public SpawnContext spawn() {
			return getRuleContext(SpawnContext.class,0);
		}
		public ProcedurecallContext procedurecall() {
			return getRuleContext(ProcedurecallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				print();
				setState(40);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				ifthenelse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				spawn();
				setState(47);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				procedurecall();
				setState(50);
				match(T__2);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			exp();
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

	public static class IfthenelseContext extends ParserRuleContext {
		public BlockContext then;
		public BlockContext els;
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfthenelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelse; }
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
			match(T__5);
			setState(59);
			boolExp(0);
			setState(60);
			match(T__6);
			setState(61);
			((IfthenelseContext)_localctx).then = block();
			setState(62);
			match(T__7);
			setState(63);
			((IfthenelseContext)_localctx).els = block();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			variable();
			setState(66);
			match(T__8);
			setState(67);
			exp();
			setState(68);
			match(T__2);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			variable();
			setState(71);
			match(T__9);
			setState(72);
			exp();
			setState(73);
			match(T__2);
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

	public static class LoopContext extends ParserRuleContext {
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__10);
			setState(76);
			match(T__5);
			setState(77);
			boolExp(0);
			setState(78);
			match(T__6);
			setState(79);
			block();
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

	public static class SpawnContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SpawnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawn; }
	}

	public final SpawnContext spawn() throws RecognitionException {
		SpawnContext _localctx = new SpawnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spawn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__11);
			setState(82);
			variable();
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

	public static class ProcedurecallContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ProcedurecallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedurecall; }
	}

	public final ProcedurecallContext procedurecall() throws RecognitionException {
		ProcedurecallContext _localctx = new ProcedurecallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedurecall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			variable();
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
		enterRule(_localctx, 18, RULE_exp);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				arithmExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				_localctx = new BaseArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				match(T__5);
				setState(92);
				arithmExp(0);
				setState(93);
				match(T__6);
				}
				break;
			case T__12:
				{
				_localctx = new NegArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__12);
				setState(96);
				arithmExp(5);
				}
				break;
			case ID:
				{
				_localctx = new VarArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				variable();
				}
				break;
			case NUMBER:
				{
				_localctx = new ValArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BinArithmeticExpContext(new ArithmExpContext(_parentctx, _parentState));
						((BinArithmeticExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExp);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((BinArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((BinArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						((BinArithmeticExpContext)_localctx).right = arithmExp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinArithmeticExpContext(new ArithmExpContext(_parentctx, _parentState));
						((BinArithmeticExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExp);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						((BinArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__15) ) {
							((BinArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						((BinArithmeticExpContext)_localctx).right = arithmExp(4);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new BaseBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(113);
				match(T__5);
				setState(114);
				boolExp(0);
				setState(115);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new NegBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__16);
				setState(118);
				boolExp(6);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticComparisonExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				((ArithmeticComparisonExpContext)_localctx).left = arithmExp(0);
				setState(120);
				((ArithmeticComparisonExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
					((ArithmeticComparisonExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				((ArithmeticComparisonExpContext)_localctx).right = arithmExp(0);
				}
				break;
			case 4:
				{
				_localctx = new VarBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				variable();
				}
				break;
			case 5:
				{
				_localctx = new ValBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinBoolExpContext(new BoolExpContext(_parentctx, _parentState));
						((BinBoolExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(127);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(128);
						((BinBoolExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
							((BinBoolExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						((BinBoolExpContext)_localctx).right = boolExp(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolComparisonExpContext(new BoolExpContext(_parentctx, _parentState));
						((BoolComparisonExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						((BoolComparisonExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((BoolComparisonExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						((BoolComparisonExpContext)_localctx).right = boolExp(4);
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 26, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 28, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		case 10:
			return arithmExp_sempred((ArithmExpContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0093\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\67\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\5\13[\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\ff\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0088\n\r\f\r\16\r\u008b\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\4"+
		"\26\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\20\21\4\2\17"+
		"\17\22\22\3\2\27\34\3\2\24\26\3\2\27\30\2\u0096\2 \3\2\2\2\4\66\3\2\2"+
		"\2\68\3\2\2\2\b;\3\2\2\2\nC\3\2\2\2\fH\3\2\2\2\16M\3\2\2\2\20S\3\2\2\2"+
		"\22V\3\2\2\2\24Z\3\2\2\2\26e\3\2\2\2\30\177\3\2\2\2\32\u008c\3\2\2\2\34"+
		"\u008e\3\2\2\2\36\u0090\3\2\2\2 $\7\3\2\2!#\5\4\3\2\"!\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\4\2\2(\3\3\2\2\2)*\5"+
		"\6\4\2*+\7\5\2\2+\67\3\2\2\2,\67\5\b\5\2-\67\5\n\6\2.\67\5\f\7\2/\67\5"+
		"\16\b\2\60\61\5\20\t\2\61\62\7\5\2\2\62\67\3\2\2\2\63\64\5\22\n\2\64\65"+
		"\7\5\2\2\65\67\3\2\2\2\66)\3\2\2\2\66,\3\2\2\2\66-\3\2\2\2\66.\3\2\2\2"+
		"\66/\3\2\2\2\66\60\3\2\2\2\66\63\3\2\2\2\67\5\3\2\2\289\7\6\2\29:\5\24"+
		"\13\2:\7\3\2\2\2;<\7\7\2\2<=\7\b\2\2=>\5\30\r\2>?\7\t\2\2?@\5\2\2\2@A"+
		"\7\n\2\2AB\5\2\2\2B\t\3\2\2\2CD\5\32\16\2DE\7\13\2\2EF\5\24\13\2FG\7\5"+
		"\2\2G\13\3\2\2\2HI\5\32\16\2IJ\7\f\2\2JK\5\24\13\2KL\7\5\2\2L\r\3\2\2"+
		"\2MN\7\r\2\2NO\7\b\2\2OP\5\30\r\2PQ\7\t\2\2QR\5\2\2\2R\17\3\2\2\2ST\7"+
		"\16\2\2TU\5\32\16\2U\21\3\2\2\2VW\5\32\16\2W\23\3\2\2\2X[\5\26\f\2Y[\5"+
		"\30\r\2ZX\3\2\2\2ZY\3\2\2\2[\25\3\2\2\2\\]\b\f\1\2]^\7\b\2\2^_\5\26\f"+
		"\2_`\7\t\2\2`f\3\2\2\2ab\7\17\2\2bf\5\26\f\7cf\5\32\16\2df\5\34\17\2e"+
		"\\\3\2\2\2ea\3\2\2\2ec\3\2\2\2ed\3\2\2\2fo\3\2\2\2gh\f\6\2\2hi\t\2\2\2"+
		"in\5\26\f\7jk\f\5\2\2kl\t\3\2\2ln\5\26\f\6mg\3\2\2\2mj\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2p\27\3\2\2\2qo\3\2\2\2rs\b\r\1\2st\7\b\2\2tu\5\30"+
		"\r\2uv\7\t\2\2v\u0080\3\2\2\2wx\7\23\2\2x\u0080\5\30\r\byz\5\26\f\2z{"+
		"\t\4\2\2{|\5\26\f\2|\u0080\3\2\2\2}\u0080\5\32\16\2~\u0080\5\36\20\2\177"+
		"r\3\2\2\2\177w\3\2\2\2\177y\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0089"+
		"\3\2\2\2\u0081\u0082\f\7\2\2\u0082\u0083\t\5\2\2\u0083\u0088\5\30\r\b"+
		"\u0084\u0085\f\5\2\2\u0085\u0086\t\6\2\2\u0086\u0088\5\30\r\6\u0087\u0081"+
		"\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\31\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\35\2"+
		"\2\u008d\33\3\2\2\2\u008e\u008f\7\36\2\2\u008f\35\3\2\2\2\u0090\u0091"+
		"\7\37\2\2\u0091\37\3\2\2\2\13$\66Zemo\177\u0087\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}