// Generated from /home/annopaolo/Scrivania/demo/app/src/main/antlr/com/demo/Demo.g4 by ANTLR 4.8
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
		T__24=25, T__25=26, T__26=27, ID=28, NUMBER=29, TF=30, WS=31, LINECOMMENTS=32, 
		BLOCKCOMMENTS=33;
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_print = 4, RULE_ifthenelse = 5, RULE_assignment = 6, RULE_declaration = 7, 
		RULE_loop = 8, RULE_spawn = 9, RULE_procedurecall = 10, RULE_exp = 11, 
		RULE_arithmExp = 12, RULE_boolExp = 13, RULE_variable = 14, RULE_integer = 15, 
		RULE_bool = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "procedure", "block", "statement", "print", "ifthenelse", 
			"assignment", "declaration", "loop", "spawn", "procedurecall", "exp", 
			"arithmExp", "boolExp", "variable", "integer", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'proc'", "'{'", "'}'", "';'", "'print'", "'if'", "'('", "')'", 
			"'else'", "'='", "':='", "'while'", "'spawn'", "'-'", "'*'", "'/'", "'+'", 
			"'NOT'", "'AND'", "'OR'", "'XOR'", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUMBER", "TF", "WS", "LINECOMMENTS", "BLOCKCOMMENTS"
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

	public static class ProgramContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(34);
				procedure();
				}
				}
				setState(39);
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

	public static class ProcedureContext extends ParserRuleContext {
		public VariableContext name;
		public BlockContext body;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			((ProcedureContext)_localctx).name = variable();
			setState(42);
			((ProcedureContext)_localctx).body = block();
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
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				statement();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				print();
				setState(54);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				ifthenelse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				spawn();
				setState(61);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				procedurecall();
				setState(64);
				match(T__3);
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
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			setState(69);
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
		enterRule(_localctx, 10, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			match(T__6);
			setState(73);
			boolExp(0);
			setState(74);
			match(T__7);
			setState(75);
			((IfthenelseContext)_localctx).then = block();
			setState(76);
			match(T__8);
			setState(77);
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			variable();
			setState(80);
			match(T__9);
			setState(81);
			exp();
			setState(82);
			match(T__3);
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
		enterRule(_localctx, 14, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			variable();
			setState(85);
			match(T__10);
			setState(86);
			exp();
			setState(87);
			match(T__3);
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
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__11);
			setState(90);
			match(T__6);
			setState(91);
			boolExp(0);
			setState(92);
			match(T__7);
			setState(93);
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
		enterRule(_localctx, 18, RULE_spawn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__12);
			setState(96);
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
		enterRule(_localctx, 20, RULE_procedurecall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 22, RULE_exp);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				arithmExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithmExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				_localctx = new BaseArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(T__6);
				setState(106);
				arithmExp(0);
				setState(107);
				match(T__7);
				}
				break;
			case T__13:
				{
				_localctx = new NegArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__13);
				setState(110);
				arithmExp(5);
				}
				break;
			case ID:
				{
				_localctx = new VarArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				variable();
				}
				break;
			case NUMBER:
				{
				_localctx = new ValArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BinArithmeticExpContext(new ArithmExpContext(_parentctx, _parentState));
						((BinArithmeticExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExp);
						setState(115);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(116);
						((BinArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((BinArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						((BinArithmeticExpContext)_localctx).right = arithmExp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinArithmeticExpContext(new ArithmExpContext(_parentctx, _parentState));
						((BinArithmeticExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExp);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119);
						((BinArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__16) ) {
							((BinArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((BinArithmeticExpContext)_localctx).right = arithmExp(4);
						}
						break;
					}
					} 
				}
				setState(125);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new BaseBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				match(T__6);
				setState(128);
				boolExp(0);
				setState(129);
				match(T__7);
				}
				break;
			case 2:
				{
				_localctx = new NegBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__17);
				setState(132);
				boolExp(6);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticComparisonExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				((ArithmeticComparisonExpContext)_localctx).left = arithmExp(0);
				setState(134);
				((ArithmeticComparisonExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((ArithmeticComparisonExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				((ArithmeticComparisonExpContext)_localctx).right = arithmExp(0);
				}
				break;
			case 4:
				{
				_localctx = new VarBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				variable();
				}
				break;
			case 5:
				{
				_localctx = new ValBoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BinBoolExpContext(new BoolExpContext(_parentctx, _parentState));
						((BinBoolExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						((BinBoolExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
							((BinBoolExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						((BinBoolExpContext)_localctx).right = boolExp(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolComparisonExpContext(new BoolExpContext(_parentctx, _parentState));
						((BoolComparisonExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						((BoolComparisonExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((BoolComparisonExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						((BoolComparisonExpContext)_localctx).right = boolExp(4);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		enterRule(_localctx, 32, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		case 12:
			return arithmExp_sempred((ArithmExpContext)_localctx, predIndex);
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4\61\n\4\f\4\16"+
		"\4\64\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5E\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\5\ri\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"t\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\4\32\34\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\7\3\2\21\22\4\2\20\20\23\23\3\2\30\35\3\2\25"+
		"\27\3\2\30\31\2\u00a3\2\'\3\2\2\2\4*\3\2\2\2\6.\3\2\2\2\bD\3\2\2\2\nF"+
		"\3\2\2\2\fI\3\2\2\2\16Q\3\2\2\2\20V\3\2\2\2\22[\3\2\2\2\24a\3\2\2\2\26"+
		"d\3\2\2\2\30h\3\2\2\2\32s\3\2\2\2\34\u008d\3\2\2\2\36\u009a\3\2\2\2 \u009c"+
		"\3\2\2\2\"\u009e\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3"+
		"\2\2\2(\3\3\2\2\2)\'\3\2\2\2*+\7\3\2\2+,\5\36\20\2,-\5\6\4\2-\5\3\2\2"+
		"\2.\62\7\4\2\2/\61\5\b\5\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\5\2\2\66\7\3\2\2\2\67"+
		"8\5\n\6\289\7\6\2\29E\3\2\2\2:E\5\f\7\2;E\5\16\b\2<E\5\20\t\2=E\5\22\n"+
		"\2>?\5\24\13\2?@\7\6\2\2@E\3\2\2\2AB\5\26\f\2BC\7\6\2\2CE\3\2\2\2D\67"+
		"\3\2\2\2D:\3\2\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2DA\3\2\2\2E"+
		"\t\3\2\2\2FG\7\7\2\2GH\5\30\r\2H\13\3\2\2\2IJ\7\b\2\2JK\7\t\2\2KL\5\34"+
		"\17\2LM\7\n\2\2MN\5\6\4\2NO\7\13\2\2OP\5\6\4\2P\r\3\2\2\2QR\5\36\20\2"+
		"RS\7\f\2\2ST\5\30\r\2TU\7\6\2\2U\17\3\2\2\2VW\5\36\20\2WX\7\r\2\2XY\5"+
		"\30\r\2YZ\7\6\2\2Z\21\3\2\2\2[\\\7\16\2\2\\]\7\t\2\2]^\5\34\17\2^_\7\n"+
		"\2\2_`\5\6\4\2`\23\3\2\2\2ab\7\17\2\2bc\5\36\20\2c\25\3\2\2\2de\5\36\20"+
		"\2e\27\3\2\2\2fi\5\32\16\2gi\5\34\17\2hf\3\2\2\2hg\3\2\2\2i\31\3\2\2\2"+
		"jk\b\16\1\2kl\7\t\2\2lm\5\32\16\2mn\7\n\2\2nt\3\2\2\2op\7\20\2\2pt\5\32"+
		"\16\7qt\5\36\20\2rt\5 \21\2sj\3\2\2\2so\3\2\2\2sq\3\2\2\2sr\3\2\2\2t}"+
		"\3\2\2\2uv\f\6\2\2vw\t\2\2\2w|\5\32\16\7xy\f\5\2\2yz\t\3\2\2z|\5\32\16"+
		"\6{u\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\33\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\b\17\1\2\u0081\u0082\7\t\2\2\u0082\u0083\5\34\17"+
		"\2\u0083\u0084\7\n\2\2\u0084\u008e\3\2\2\2\u0085\u0086\7\24\2\2\u0086"+
		"\u008e\5\34\17\b\u0087\u0088\5\32\16\2\u0088\u0089\t\4\2\2\u0089\u008a"+
		"\5\32\16\2\u008a\u008e\3\2\2\2\u008b\u008e\5\36\20\2\u008c\u008e\5\"\22"+
		"\2\u008d\u0080\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0097\3\2\2\2\u008f\u0090\f\7\2\2\u0090"+
		"\u0091\t\5\2\2\u0091\u0096\5\34\17\b\u0092\u0093\f\5\2\2\u0093\u0094\t"+
		"\6\2\2\u0094\u0096\5\34\17\6\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\35\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u009a\u009b\7\36\2\2\u009b\37\3\2\2\2\u009c\u009d"+
		"\7\37\2\2\u009d!\3\2\2\2\u009e\u009f\7 \2\2\u009f#\3\2\2\2\f\'\62Dhs{"+
		"}\u008d\u0095\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}