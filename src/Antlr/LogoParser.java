// Generated from C:/Users/mikol/Desktop/Studia/MIAK/src/Interpreter\Logo.g4 by ANTLR 4.9.2
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, EQUALS=3, GREATER_THAN=4, GREATER_EQUAL=5, SMALLER_THAN=6, 
		SMALLER_EQUAL=7, WHILE=8, IF=9, PLUS=10, MINUS=11, STAR=12, SLASH=13, 
		MODULO=14, OPEN_BRACKET=15, CLOSE_BRACKET=16, TO=17, END=18, REPREAT=19, 
		MAKE=20, PRINT=21, PENUP=22, PENDOWN=23, FORWARD=24, BACK=25, RIGHT=26, 
		LEFT=27, NUMBER=28, STRING=29, VARIABLE=30, PROCEDURE_NAME=31, WHITESPACE=32;
	public static final int
		RULE_input = 0, RULE_command = 1, RULE_expresion = 2, RULE_printExpresion = 3, 
		RULE_condition = 4, RULE_variableDeclare = 5, RULE_repeat = 6, RULE_whileRule = 7, 
		RULE_ifRule = 8, RULE_printCommand = 9, RULE_turtleMoveCommand = 10, RULE_turtleOtherCommand = 11, 
		RULE_procedureDeclare = 12, RULE_procedureExecute = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "command", "expresion", "printExpresion", "condition", "variableDeclare", 
			"repeat", "whileRule", "ifRule", "printCommand", "turtleMoveCommand", 
			"turtleOtherCommand", "procedureDeclare", "procedureExecute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'>'", "'>='", "'<'", "'<='", null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "EQUALS", "GREATER_THAN", "GREATER_EQUAL", "SMALLER_THAN", 
			"SMALLER_EQUAL", "WHILE", "IF", "PLUS", "MINUS", "STAR", "SLASH", "MODULO", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "TO", "END", "REPREAT", "MAKE", "PRINT", 
			"PENUP", "PENDOWN", "FORWARD", "BACK", "RIGHT", "LEFT", "NUMBER", "STRING", 
			"VARIABLE", "PROCEDURE_NAME", "WHITESPACE"
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
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				command();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << TO) | (1L << REPREAT) | (1L << MAKE) | (1L << PRINT) | (1L << PENUP) | (1L << PENDOWN) | (1L << FORWARD) | (1L << BACK) | (1L << RIGHT) | (1L << LEFT) | (1L << PROCEDURE_NAME))) != 0) );
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

	public static class CommandContext extends ParserRuleContext {
		public ProcedureDeclareContext procedureDeclare() {
			return getRuleContext(ProcedureDeclareContext.class,0);
		}
		public WhileRuleContext whileRule() {
			return getRuleContext(WhileRuleContext.class,0);
		}
		public IfRuleContext ifRule() {
			return getRuleContext(IfRuleContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public VariableDeclareContext variableDeclare() {
			return getRuleContext(VariableDeclareContext.class,0);
		}
		public PrintCommandContext printCommand() {
			return getRuleContext(PrintCommandContext.class,0);
		}
		public TurtleMoveCommandContext turtleMoveCommand() {
			return getRuleContext(TurtleMoveCommandContext.class,0);
		}
		public TurtleOtherCommandContext turtleOtherCommand() {
			return getRuleContext(TurtleOtherCommandContext.class,0);
		}
		public ProcedureExecuteContext procedureExecute() {
			return getRuleContext(ProcedureExecuteContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				procedureDeclare();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				whileRule();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				ifRule();
				}
				break;
			case REPREAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				repeat();
				}
				break;
			case MAKE:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				variableDeclare();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				printCommand();
				}
				break;
			case FORWARD:
			case BACK:
			case RIGHT:
			case LEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				turtleMoveCommand();
				}
				break;
			case PENUP:
			case PENDOWN:
				enterOuterAlt(_localctx, 8);
				{
				setState(40);
				turtleOtherCommand();
				}
				break;
			case PROCEDURE_NAME:
				enterOuterAlt(_localctx, 9);
				{
				setState(41);
				procedureExecute();
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableUseContext extends ExpresionContext {
		public TerminalNode VARIABLE() { return getToken(LogoParser.VARIABLE, 0); }
		public VariableUseContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVariableUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVariableUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVariableUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpresionContext {
		public TerminalNode NUMBER() { return getToken(LogoParser.NUMBER, 0); }
		public NumberContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(LogoParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(LogoParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(LogoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogoParser.MINUS, 0); }
		public OperationContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(LogoParser.MODULO, 0); }
		public ModuloContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BracketsContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				match(T__0);
				setState(46);
				expresion(0);
				setState(47);
				match(T__1);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableUseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						expresion(6);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expresion(5);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(59);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(60);
						match(MODULO);
						setState(61);
						expresion(4);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class PrintExpresionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LogoParser.STRING, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public PrintExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPrintExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPrintExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPrintExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpresionContext printExpresion() throws RecognitionException {
		PrintExpresionContext _localctx = new PrintExpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printExpresion);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(STRING);
				}
				break;
			case T__0:
			case NUMBER:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				expresion(0);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterThanConditionContext extends ConditionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(LogoParser.GREATER_THAN, 0); }
		public GreaterThanConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterGreaterThanCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitGreaterThanCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitGreaterThanCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsConditionContext extends ConditionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(LogoParser.EQUALS, 0); }
		public EqualsConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterEqualsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitEqualsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitEqualsCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualConditionContext extends ConditionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(LogoParser.GREATER_EQUAL, 0); }
		public GreaterEqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterGreaterEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitGreaterEqualCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitGreaterEqualCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerEqualConditionContext extends ConditionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SMALLER_EQUAL() { return getToken(LogoParser.SMALLER_EQUAL, 0); }
		public SmallerEqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSmallerEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSmallerEqualCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSmallerEqualCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerThanConditionContext extends ConditionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SMALLER_THAN() { return getToken(LogoParser.SMALLER_THAN, 0); }
		public SmallerThanConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSmallerThanCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSmallerThanCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSmallerThanCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new EqualsConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				expresion(0);
				setState(72);
				match(EQUALS);
				setState(73);
				expresion(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				expresion(0);
				setState(76);
				match(GREATER_THAN);
				setState(77);
				expresion(0);
				}
				break;
			case 3:
				_localctx = new SmallerThanConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				expresion(0);
				setState(80);
				match(SMALLER_THAN);
				setState(81);
				expresion(0);
				}
				break;
			case 4:
				_localctx = new SmallerEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				expresion(0);
				setState(84);
				match(SMALLER_EQUAL);
				setState(85);
				expresion(0);
				}
				break;
			case 5:
				_localctx = new GreaterEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				expresion(0);
				setState(88);
				match(GREATER_EQUAL);
				setState(89);
				expresion(0);
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

	public static class VariableDeclareContext extends ParserRuleContext {
		public TerminalNode MAKE() { return getToken(LogoParser.MAKE, 0); }
		public TerminalNode STRING() { return getToken(LogoParser.STRING, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public VariableDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVariableDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVariableDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVariableDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclareContext variableDeclare() throws RecognitionException {
		VariableDeclareContext _localctx = new VariableDeclareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(MAKE);
			setState(94);
			match(STRING);
			setState(95);
			expresion(0);
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPREAT() { return getToken(LogoParser.REPREAT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LogoParser.OPEN_BRACKET, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LogoParser.CLOSE_BRACKET, 0); }
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(REPREAT);
			setState(98);
			expresion(0);
			setState(99);
			match(OPEN_BRACKET);
			setState(100);
			input();
			setState(101);
			match(CLOSE_BRACKET);
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

	public static class WhileRuleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LogoParser.WHILE, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(LogoParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(LogoParser.OPEN_BRACKET, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(LogoParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(LogoParser.CLOSE_BRACKET, i);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public WhileRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterWhileRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitWhileRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitWhileRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileRuleContext whileRule() throws RecognitionException {
		WhileRuleContext _localctx = new WhileRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WHILE);
			setState(104);
			match(OPEN_BRACKET);
			setState(105);
			condition();
			setState(106);
			match(CLOSE_BRACKET);
			setState(107);
			match(OPEN_BRACKET);
			setState(108);
			input();
			setState(109);
			match(CLOSE_BRACKET);
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

	public static class IfRuleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LogoParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LogoParser.OPEN_BRACKET, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LogoParser.CLOSE_BRACKET, 0); }
		public IfRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRuleContext ifRule() throws RecognitionException {
		IfRuleContext _localctx = new IfRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IF);
			setState(112);
			condition();
			setState(113);
			match(OPEN_BRACKET);
			setState(114);
			input();
			setState(115);
			match(CLOSE_BRACKET);
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

	public static class PrintCommandContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LogoParser.PRINT, 0); }
		public List<PrintExpresionContext> printExpresion() {
			return getRuleContexts(PrintExpresionContext.class);
		}
		public PrintExpresionContext printExpresion(int i) {
			return getRuleContext(PrintExpresionContext.class,i);
		}
		public PrintCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPrintCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPrintCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPrintCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCommandContext printCommand() throws RecognitionException {
		PrintCommandContext _localctx = new PrintCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PRINT);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				printExpresion();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << STRING) | (1L << VARIABLE))) != 0) );
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

	public static class TurtleMoveCommandContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FORWARD() { return getToken(LogoParser.FORWARD, 0); }
		public TerminalNode BACK() { return getToken(LogoParser.BACK, 0); }
		public TerminalNode RIGHT() { return getToken(LogoParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(LogoParser.LEFT, 0); }
		public TurtleMoveCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleMoveCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTurtleMoveCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTurtleMoveCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTurtleMoveCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleMoveCommandContext turtleMoveCommand() throws RecognitionException {
		TurtleMoveCommandContext _localctx = new TurtleMoveCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_turtleMoveCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORWARD) | (1L << BACK) | (1L << RIGHT) | (1L << LEFT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			expresion(0);
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

	public static class TurtleOtherCommandContext extends ParserRuleContext {
		public TerminalNode PENUP() { return getToken(LogoParser.PENUP, 0); }
		public TerminalNode PENDOWN() { return getToken(LogoParser.PENDOWN, 0); }
		public TurtleOtherCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleOtherCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTurtleOtherCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTurtleOtherCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTurtleOtherCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleOtherCommandContext turtleOtherCommand() throws RecognitionException {
		TurtleOtherCommandContext _localctx = new TurtleOtherCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_turtleOtherCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==PENUP || _la==PENDOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ProcedureDeclareContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(LogoParser.TO, 0); }
		public TerminalNode PROCEDURE_NAME() { return getToken(LogoParser.PROCEDURE_NAME, 0); }
		public TerminalNode END() { return getToken(LogoParser.END, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(LogoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(LogoParser.VARIABLE, i);
		}
		public ProcedureDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProcedureDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProcedureDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProcedureDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclareContext procedureDeclare() throws RecognitionException {
		ProcedureDeclareContext _localctx = new ProcedureDeclareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedureDeclare);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(TO);
			setState(129);
			match(PROCEDURE_NAME);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(130);
					match(VARIABLE);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			{
			setState(136);
			input();
			}
			setState(137);
			match(END);
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

	public static class ProcedureExecuteContext extends ParserRuleContext {
		public TerminalNode PROCEDURE_NAME() { return getToken(LogoParser.PROCEDURE_NAME, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ProcedureExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureExecute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProcedureExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProcedureExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProcedureExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureExecuteContext procedureExecute() throws RecognitionException {
		ProcedureExecuteContext _localctx = new ProcedureExecuteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedureExecute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PROCEDURE_NAME);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(140);
				expresion(0);
				}
				}
				setState(145);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13\4\3"+
		"\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\6\13z\n\13\r\13\16\13{\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u0086"+
		"\n\16\f\16\16\16\u0089\13\16\3\16\3\16\3\16\3\17\3\17\7\17\u0090\n\17"+
		"\f\17\16\17\u0093\13\17\3\17\3\u0087\3\6\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\6\3\2\16\17\3\2\f\r\3\2\32\35\3\2\30\31\2\u009c\2\37\3\2\2"+
		"\2\4,\3\2\2\2\6\65\3\2\2\2\bG\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16c\3\2\2"+
		"\2\20i\3\2\2\2\22q\3\2\2\2\24w\3\2\2\2\26}\3\2\2\2\30\u0080\3\2\2\2\32"+
		"\u0082\3\2\2\2\34\u008d\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37"+
		"\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#-\5\32\16\2$-\5\20\t\2%-\5\22\n\2&-\5"+
		"\16\b\2\'-\5\f\7\2(-\5\24\13\2)-\5\26\f\2*-\5\30\r\2+-\5\34\17\2,#\3\2"+
		"\2\2,$\3\2\2\2,%\3\2\2\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3"+
		"\2\2\2,+\3\2\2\2-\5\3\2\2\2./\b\4\1\2/\60\7\3\2\2\60\61\5\6\4\2\61\62"+
		"\7\4\2\2\62\66\3\2\2\2\63\66\7\36\2\2\64\66\7 \2\2\65.\3\2\2\2\65\63\3"+
		"\2\2\2\65\64\3\2\2\2\66B\3\2\2\2\678\f\7\2\289\t\2\2\29A\5\6\4\b:;\f\6"+
		"\2\2;<\t\3\2\2<A\5\6\4\7=>\f\5\2\2>?\7\20\2\2?A\5\6\4\6@\67\3\2\2\2@:"+
		"\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2"+
		"EH\7\37\2\2FH\5\6\4\2GE\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\5\6\4\2JK\7\5\2"+
		"\2KL\5\6\4\2L^\3\2\2\2MN\5\6\4\2NO\7\6\2\2OP\5\6\4\2P^\3\2\2\2QR\5\6\4"+
		"\2RS\7\b\2\2ST\5\6\4\2T^\3\2\2\2UV\5\6\4\2VW\7\t\2\2WX\5\6\4\2X^\3\2\2"+
		"\2YZ\5\6\4\2Z[\7\7\2\2[\\\5\6\4\2\\^\3\2\2\2]I\3\2\2\2]M\3\2\2\2]Q\3\2"+
		"\2\2]U\3\2\2\2]Y\3\2\2\2^\13\3\2\2\2_`\7\26\2\2`a\7\37\2\2ab\5\6\4\2b"+
		"\r\3\2\2\2cd\7\25\2\2de\5\6\4\2ef\7\21\2\2fg\5\2\2\2gh\7\22\2\2h\17\3"+
		"\2\2\2ij\7\n\2\2jk\7\21\2\2kl\5\n\6\2lm\7\22\2\2mn\7\21\2\2no\5\2\2\2"+
		"op\7\22\2\2p\21\3\2\2\2qr\7\13\2\2rs\5\n\6\2st\7\21\2\2tu\5\2\2\2uv\7"+
		"\22\2\2v\23\3\2\2\2wy\7\27\2\2xz\5\b\5\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|\25\3\2\2\2}~\t\4\2\2~\177\5\6\4\2\177\27\3\2\2\2\u0080\u0081"+
		"\t\5\2\2\u0081\31\3\2\2\2\u0082\u0083\7\23\2\2\u0083\u0087\7!\2\2\u0084"+
		"\u0086\7 \2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\5\2\2\2\u008b\u008c\7\24\2\2\u008c\33\3\2\2\2\u008d\u0091\7!\2"+
		"\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\35\3\2\2\2\u0093\u0091\3\2\2\2\f!,"+
		"\65@BG]{\u0087\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}