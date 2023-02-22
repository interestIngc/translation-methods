// Generated from /Users/veronika/Desktop/mt-homeworks/lab-3/src/obfuscation.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class obfuscationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		EQ=10, EQUALS=11, NOT_EQUALS=12, SEMICOLON=13, PLUS=14, MINUS=15, MUL=16, 
		DIV=17, MORE_STRICT=18, MORE_OR_EQ=19, LESS_STRICT=20, LESS_OR_EQ=21, 
		TYPE=22, NUMBER=23, STRING=24, IDENTIFIER=25, SPACE=26;
	public static final int
		RULE_file = 0, RULE_function = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_ifStatement = 4, RULE_elseStatement = 5, RULE_returnStatement = 6, 
		RULE_expr = 7, RULE_compare = 8, RULE_addOrSub = 9, RULE_term = 10, RULE_subexpr = 11, 
		RULE_functionCall = 12, RULE_identifier = 13, RULE_variable = 14, RULE_eq = 15, 
		RULE_equals = 16, RULE_notEquals = 17, RULE_semicolon = 18, RULE_openParen = 19, 
		RULE_closeParen = 20, RULE_openCurlyBrace = 21, RULE_closeCurlyBrace = 22, 
		RULE_comma = 23, RULE_plus = 24, RULE_minus = 25, RULE_mul = 26, RULE_div = 27, 
		RULE_moreStrict = 28, RULE_moreOrEq = 29, RULE_lessStrict = 30, RULE_lessOrEq = 31, 
		RULE_number = 32, RULE_string = 33, RULE_reference = 34, RULE_type = 35, 
		RULE_spaces = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "function", "statements", "statement", "ifStatement", "elseStatement", 
			"returnStatement", "expr", "compare", "addOrSub", "term", "subexpr", 
			"functionCall", "identifier", "variable", "eq", "equals", "notEquals", 
			"semicolon", "openParen", "closeParen", "openCurlyBrace", "closeCurlyBrace", 
			"comma", "plus", "minus", "mul", "div", "moreStrict", "moreOrEq", "lessStrict", 
			"lessOrEq", "number", "string", "reference", "type", "spaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'return'", "'('", "')'", "'{'", "'}'", "','", 
			"'&'", "'='", "'=='", "'!='", "';'", "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "EQ", "EQUALS", 
			"NOT_EQUALS", "SEMICOLON", "PLUS", "MINUS", "MUL", "DIV", "MORE_STRICT", 
			"MORE_OR_EQ", "LESS_STRICT", "LESS_OR_EQ", "TYPE", "NUMBER", "STRING", 
			"IDENTIFIER", "SPACE"
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
	public String getGrammarFileName() { return "obfuscation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public obfuscationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			spaces();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(75);
				function();
				}
				}
				setState(80);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public OpenCurlyBraceContext openCurlyBrace() {
			return getRuleContext(OpenCurlyBraceContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CloseCurlyBraceContext closeCurlyBrace() {
			return getRuleContext(CloseCurlyBraceContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			type();
			setState(82);
			identifier();
			setState(83);
			openParen();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(84);
				type();
				setState(85);
				variable();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(86);
					comma();
					setState(87);
					type();
					setState(88);
					variable();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			closeParen();
			setState(98);
			openCurlyBrace();
			setState(99);
			statements();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(100);
				returnStatement();
				}
			}

			setState(103);
			closeCurlyBrace();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
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

	public static class StatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				type();
				setState(112);
				variable();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(113);
					comma();
					setState(114);
					variable();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				functionCall();
				setState(125);
				semicolon();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(127);
					type();
					}
				}

				setState(130);
				variable();
				setState(131);
				eq();
				setState(132);
				expr(0);
				setState(133);
				semicolon();
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

	public static class IfStatementContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public OpenCurlyBraceContext openCurlyBrace() {
			return getRuleContext(OpenCurlyBraceContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CloseCurlyBraceContext closeCurlyBrace() {
			return getRuleContext(CloseCurlyBraceContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__0);
			setState(138);
			spaces();
			setState(139);
			openParen();
			setState(140);
			expr(0);
			setState(141);
			closeParen();
			setState(142);
			openCurlyBrace();
			setState(143);
			statements();
			setState(144);
			closeCurlyBrace();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(145);
				elseStatement();
				}
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

	public static class ElseStatementContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public OpenCurlyBraceContext openCurlyBrace() {
			return getRuleContext(OpenCurlyBraceContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CloseCurlyBraceContext closeCurlyBrace() {
			return getRuleContext(CloseCurlyBraceContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__1);
			setState(149);
			spaces();
			setState(150);
			openCurlyBrace();
			setState(151);
			statements();
			setState(152);
			closeCurlyBrace();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__2);
			setState(155);
			spaces();
			setState(156);
			expr(0);
			setState(157);
			semicolon();
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

	public static class ExprContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public NotEqualsContext notEquals() {
			return getRuleContext(NotEqualsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(160);
			compare(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(163);
						equals();
						setState(164);
						compare(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						notEquals();
						setState(168);
						compare(0);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class CompareContext extends ParserRuleContext {
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public MoreStrictContext moreStrict() {
			return getRuleContext(MoreStrictContext.class,0);
		}
		public MoreOrEqContext moreOrEq() {
			return getRuleContext(MoreOrEqContext.class,0);
		}
		public LessStrictContext lessStrict() {
			return getRuleContext(LessStrictContext.class,0);
		}
		public LessOrEqContext lessOrEq() {
			return getRuleContext(LessOrEqContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		return compare(0);
	}

	private CompareContext compare(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompareContext _localctx = new CompareContext(_ctx, _parentState);
		CompareContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_compare, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			addOrSub(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new CompareContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						moreStrict();
						setState(180);
						addOrSub(0);
						}
						break;
					case 2:
						{
						_localctx = new CompareContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(182);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(183);
						moreOrEq();
						setState(184);
						addOrSub(0);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(186);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(187);
						lessStrict();
						setState(188);
						addOrSub(0);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						lessOrEq();
						setState(192);
						addOrSub(0);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class AddOrSubContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public AddOrSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterAddOrSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitAddOrSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitAddOrSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubContext addOrSub() throws RecognitionException {
		return addOrSub(0);
	}

	private AddOrSubContext addOrSub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddOrSubContext _localctx = new AddOrSubContext(_ctx, _parentState);
		AddOrSubContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_addOrSub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AddOrSubContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addOrSub);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						plus();
						setState(204);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addOrSub);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						minus();
						setState(208);
						term(0);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public SubexprContext subexpr() {
			return getRuleContext(SubexprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			subexpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(218);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(219);
						mul();
						setState(220);
						subexpr();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223);
						div();
						setState(224);
						subexpr();
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class SubexprContext extends ParserRuleContext {
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SubexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterSubexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitSubexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitSubexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubexprContext subexpr() throws RecognitionException {
		SubexprContext _localctx = new SubexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subexpr);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				openParen();
				setState(232);
				addOrSub(0);
				setState(233);
				closeParen();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(237);
					reference();
					}
				}

				setState(240);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(241);
					reference();
					}
				}

				setState(244);
				variable();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			identifier();
			setState(248);
			openParen();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << NUMBER) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(249);
				expr(0);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(250);
					comma();
					setState(251);
					expr(0);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(260);
			closeParen();
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
		public TerminalNode IDENTIFIER() { return getToken(obfuscationParser.IDENTIFIER, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			setState(263);
			spaces();
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

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			identifier();
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

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(obfuscationParser.EQ, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(EQ);
			setState(268);
			spaces();
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

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(obfuscationParser.EQUALS, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(EQUALS);
			setState(271);
			spaces();
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

	public static class NotEqualsContext extends ParserRuleContext {
		public TerminalNode NOT_EQUALS() { return getToken(obfuscationParser.NOT_EQUALS, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public NotEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualsContext notEquals() throws RecognitionException {
		NotEqualsContext _localctx = new NotEqualsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_notEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(NOT_EQUALS);
			setState(274);
			spaces();
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

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(obfuscationParser.SEMICOLON, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(SEMICOLON);
			setState(277);
			spaces();
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

	public static class OpenParenContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public OpenParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterOpenParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitOpenParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitOpenParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenParenContext openParen() throws RecognitionException {
		OpenParenContext _localctx = new OpenParenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_openParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__3);
			setState(280);
			spaces();
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

	public static class CloseParenContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public CloseParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterCloseParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitCloseParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitCloseParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseParenContext closeParen() throws RecognitionException {
		CloseParenContext _localctx = new CloseParenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_closeParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__4);
			setState(283);
			spaces();
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

	public static class OpenCurlyBraceContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public OpenCurlyBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCurlyBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterOpenCurlyBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitOpenCurlyBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitOpenCurlyBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCurlyBraceContext openCurlyBrace() throws RecognitionException {
		OpenCurlyBraceContext _localctx = new OpenCurlyBraceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_openCurlyBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__5);
			setState(286);
			spaces();
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

	public static class CloseCurlyBraceContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public CloseCurlyBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCurlyBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterCloseCurlyBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitCloseCurlyBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitCloseCurlyBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseCurlyBraceContext closeCurlyBrace() throws RecognitionException {
		CloseCurlyBraceContext _localctx = new CloseCurlyBraceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_closeCurlyBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__6);
			setState(289);
			spaces();
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

	public static class CommaContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__7);
			setState(292);
			spaces();
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

	public static class PlusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(obfuscationParser.PLUS, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(PLUS);
			setState(295);
			spaces();
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

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(obfuscationParser.MINUS, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(MINUS);
			setState(298);
			spaces();
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

	public static class MulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(obfuscationParser.MUL, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(MUL);
			setState(301);
			spaces();
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(obfuscationParser.DIV, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(DIV);
			setState(304);
			spaces();
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

	public static class MoreStrictContext extends ParserRuleContext {
		public TerminalNode MORE_STRICT() { return getToken(obfuscationParser.MORE_STRICT, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public MoreStrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreStrict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterMoreStrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitMoreStrict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitMoreStrict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreStrictContext moreStrict() throws RecognitionException {
		MoreStrictContext _localctx = new MoreStrictContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_moreStrict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(MORE_STRICT);
			setState(307);
			spaces();
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

	public static class MoreOrEqContext extends ParserRuleContext {
		public TerminalNode MORE_OR_EQ() { return getToken(obfuscationParser.MORE_OR_EQ, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public MoreOrEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreOrEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterMoreOrEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitMoreOrEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitMoreOrEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreOrEqContext moreOrEq() throws RecognitionException {
		MoreOrEqContext _localctx = new MoreOrEqContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_moreOrEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(MORE_OR_EQ);
			setState(310);
			spaces();
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

	public static class LessStrictContext extends ParserRuleContext {
		public TerminalNode LESS_STRICT() { return getToken(obfuscationParser.LESS_STRICT, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public LessStrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessStrict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterLessStrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitLessStrict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitLessStrict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessStrictContext lessStrict() throws RecognitionException {
		LessStrictContext _localctx = new LessStrictContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lessStrict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LESS_STRICT);
			setState(313);
			spaces();
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

	public static class LessOrEqContext extends ParserRuleContext {
		public TerminalNode LESS_OR_EQ() { return getToken(obfuscationParser.LESS_OR_EQ, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public LessOrEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessOrEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterLessOrEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitLessOrEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitLessOrEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessOrEqContext lessOrEq() throws RecognitionException {
		LessOrEqContext _localctx = new LessOrEqContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lessOrEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LESS_OR_EQ);
			setState(316);
			spaces();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(obfuscationParser.NUMBER, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(NUMBER);
			setState(319);
			spaces();
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
		public TerminalNode STRING() { return getToken(obfuscationParser.STRING, 0); }
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(STRING);
			setState(322);
			spaces();
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

	public static class ReferenceContext extends ParserRuleContext {
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__8);
			setState(325);
			spaces();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(obfuscationParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(TYPE);
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

	public static class SpacesContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(obfuscationParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(obfuscationParser.SPACE, i);
		}
		public SpacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).enterSpaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof obfuscationListener ) ((obfuscationListener)listener).exitSpaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof obfuscationVisitor ) return ((obfuscationVisitor<? extends T>)visitor).visitSpaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacesContext spaces() throws RecognitionException {
		SpacesContext _localctx = new SpacesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_spaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					match(SPACE);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return compare_sempred((CompareContext)_localctx, predIndex);
		case 9:
			return addOrSub_sempred((AddOrSubContext)_localctx, predIndex);
		case 10:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean compare_sempred(CompareContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addOrSub_sempred(AddOrSubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0152\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\5\3b\n\3\3"+
		"\3\3\3\3\3\3\3\5\3h\n\3\3\3\3\3\3\4\7\4m\n\4\f\4\16\4p\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0095\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00d5\n\13\f\13\16\13\u00d8\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e5\n\f\f\f\16\f\u00e8\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f1\n\r\3\r\3\r\5\r\u00f5\n\r\3\r"+
		"\5\r\u00f8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0100\n\16\f\16\16\16"+
		"\u0103\13\16\5\16\u0105\n\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\7&\u014d"+
		"\n&\f&\16&\u0150\13&\3&\2\6\20\22\24\26\'\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u014a\2L\3\2\2\2\4S\3\2"+
		"\2\2\6n\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u0096\3\2\2\2\16\u009c"+
		"\3\2\2\2\20\u00a1\3\2\2\2\22\u00b1\3\2\2\2\24\u00c9\3\2\2\2\26\u00d9\3"+
		"\2\2\2\30\u00f7\3\2\2\2\32\u00f9\3\2\2\2\34\u0108\3\2\2\2\36\u010b\3\2"+
		"\2\2 \u010d\3\2\2\2\"\u0110\3\2\2\2$\u0113\3\2\2\2&\u0116\3\2\2\2(\u0119"+
		"\3\2\2\2*\u011c\3\2\2\2,\u011f\3\2\2\2.\u0122\3\2\2\2\60\u0125\3\2\2\2"+
		"\62\u0128\3\2\2\2\64\u012b\3\2\2\2\66\u012e\3\2\2\28\u0131\3\2\2\2:\u0134"+
		"\3\2\2\2<\u0137\3\2\2\2>\u013a\3\2\2\2@\u013d\3\2\2\2B\u0140\3\2\2\2D"+
		"\u0143\3\2\2\2F\u0146\3\2\2\2H\u0149\3\2\2\2J\u014e\3\2\2\2LP\5J&\2MO"+
		"\5\4\3\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\3\3\2\2\2RP\3\2\2\2"+
		"ST\5H%\2TU\5\34\17\2Ua\5(\25\2VW\5H%\2W^\5\36\20\2XY\5\60\31\2YZ\5H%\2"+
		"Z[\5\36\20\2[]\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2aV\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5*\26\2de\5,\27\2eg\5\6"+
		"\4\2fh\5\16\b\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5.\30\2j\5\3\2\2\2km\5"+
		"\b\5\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\7\3\2\2\2pn\3\2\2\2qr"+
		"\5H%\2rx\5\36\20\2st\5\60\31\2tu\5\36\20\2uw\3\2\2\2vs\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\5&\24\2|\u008a\3\2\2\2}\u008a"+
		"\5\n\6\2~\177\5\32\16\2\177\u0080\5&\24\2\u0080\u008a\3\2\2\2\u0081\u0083"+
		"\5H%\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\5\36\20\2\u0085\u0086\5 \21\2\u0086\u0087\5\20\t\2\u0087\u0088"+
		"\5&\24\2\u0088\u008a\3\2\2\2\u0089q\3\2\2\2\u0089}\3\2\2\2\u0089~\3\2"+
		"\2\2\u0089\u0082\3\2\2\2\u008a\t\3\2\2\2\u008b\u008c\7\3\2\2\u008c\u008d"+
		"\5J&\2\u008d\u008e\5(\25\2\u008e\u008f\5\20\t\2\u008f\u0090\5*\26\2\u0090"+
		"\u0091\5,\27\2\u0091\u0092\5\6\4\2\u0092\u0094\5.\30\2\u0093\u0095\5\f"+
		"\7\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\13\3\2\2\2\u0096\u0097"+
		"\7\4\2\2\u0097\u0098\5J&\2\u0098\u0099\5,\27\2\u0099\u009a\5\6\4\2\u009a"+
		"\u009b\5.\30\2\u009b\r\3\2\2\2\u009c\u009d\7\5\2\2\u009d\u009e\5J&\2\u009e"+
		"\u009f\5\20\t\2\u009f\u00a0\5&\24\2\u00a0\17\3\2\2\2\u00a1\u00a2\b\t\1"+
		"\2\u00a2\u00a3\5\22\n\2\u00a3\u00ae\3\2\2\2\u00a4\u00a5\f\5\2\2\u00a5"+
		"\u00a6\5\"\22\2\u00a6\u00a7\5\22\n\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\f"+
		"\4\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\5\22\n\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a4\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2"+
		"\b\n\1\2\u00b2\u00b3\5\24\13\2\u00b3\u00c6\3\2\2\2\u00b4\u00b5\f\7\2\2"+
		"\u00b5\u00b6\5:\36\2\u00b6\u00b7\5\24\13\2\u00b7\u00c5\3\2\2\2\u00b8\u00b9"+
		"\f\6\2\2\u00b9\u00ba\5<\37\2\u00ba\u00bb\5\24\13\2\u00bb\u00c5\3\2\2\2"+
		"\u00bc\u00bd\f\5\2\2\u00bd\u00be\5> \2\u00be\u00bf\5\24\13\2\u00bf\u00c5"+
		"\3\2\2\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\5@!\2\u00c2\u00c3\5\24\13\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bc\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\23\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\13\1"+
		"\2\u00ca\u00cb\5\26\f\2\u00cb\u00d6\3\2\2\2\u00cc\u00cd\f\5\2\2\u00cd"+
		"\u00ce\5\62\32\2\u00ce\u00cf\5\26\f\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1"+
		"\f\4\2\2\u00d1\u00d2\5\64\33\2\u00d2\u00d3\5\26\f\2\u00d3\u00d5\3\2\2"+
		"\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\b\f\1\2\u00da\u00db\5\30\r\2\u00db\u00e6\3\2\2\2\u00dc\u00dd\f"+
		"\5\2\2\u00dd\u00de\5\66\34\2\u00de\u00df\5\30\r\2\u00df\u00e5\3\2\2\2"+
		"\u00e0\u00e1\f\4\2\2\u00e1\u00e2\58\35\2\u00e2\u00e3\5\30\r\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\27\3\2\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e9\u00ea\5(\25\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\5*\26\2\u00ec"+
		"\u00f8\3\2\2\2\u00ed\u00f8\5B\"\2\u00ee\u00f8\5D#\2\u00ef\u00f1\5F$\2"+
		"\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f8"+
		"\5\32\16\2\u00f3\u00f5\5F$\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\5\36\20\2\u00f7\u00e9\3\2\2\2\u00f7\u00ed\3"+
		"\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8"+
		"\31\3\2\2\2\u00f9\u00fa\5\34\17\2\u00fa\u0104\5(\25\2\u00fb\u0101\5\20"+
		"\t\2\u00fc\u00fd\5\60\31\2\u00fd\u00fe\5\20\t\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u00fb\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5*\26\2\u0107\33\3\2\2"+
		"\2\u0108\u0109\7\33\2\2\u0109\u010a\5J&\2\u010a\35\3\2\2\2\u010b\u010c"+
		"\5\34\17\2\u010c\37\3\2\2\2\u010d\u010e\7\f\2\2\u010e\u010f\5J&\2\u010f"+
		"!\3\2\2\2\u0110\u0111\7\r\2\2\u0111\u0112\5J&\2\u0112#\3\2\2\2\u0113\u0114"+
		"\7\16\2\2\u0114\u0115\5J&\2\u0115%\3\2\2\2\u0116\u0117\7\17\2\2\u0117"+
		"\u0118\5J&\2\u0118\'\3\2\2\2\u0119\u011a\7\6\2\2\u011a\u011b\5J&\2\u011b"+
		")\3\2\2\2\u011c\u011d\7\7\2\2\u011d\u011e\5J&\2\u011e+\3\2\2\2\u011f\u0120"+
		"\7\b\2\2\u0120\u0121\5J&\2\u0121-\3\2\2\2\u0122\u0123\7\t\2\2\u0123\u0124"+
		"\5J&\2\u0124/\3\2\2\2\u0125\u0126\7\n\2\2\u0126\u0127\5J&\2\u0127\61\3"+
		"\2\2\2\u0128\u0129\7\20\2\2\u0129\u012a\5J&\2\u012a\63\3\2\2\2\u012b\u012c"+
		"\7\21\2\2\u012c\u012d\5J&\2\u012d\65\3\2\2\2\u012e\u012f\7\22\2\2\u012f"+
		"\u0130\5J&\2\u0130\67\3\2\2\2\u0131\u0132\7\23\2\2\u0132\u0133\5J&\2\u0133"+
		"9\3\2\2\2\u0134\u0135\7\24\2\2\u0135\u0136\5J&\2\u0136;\3\2\2\2\u0137"+
		"\u0138\7\25\2\2\u0138\u0139\5J&\2\u0139=\3\2\2\2\u013a\u013b\7\26\2\2"+
		"\u013b\u013c\5J&\2\u013c?\3\2\2\2\u013d\u013e\7\27\2\2\u013e\u013f\5J"+
		"&\2\u013fA\3\2\2\2\u0140\u0141\7\31\2\2\u0141\u0142\5J&\2\u0142C\3\2\2"+
		"\2\u0143\u0144\7\32\2\2\u0144\u0145\5J&\2\u0145E\3\2\2\2\u0146\u0147\7"+
		"\13\2\2\u0147\u0148\5J&\2\u0148G\3\2\2\2\u0149\u014a\7\30\2\2\u014aI\3"+
		"\2\2\2\u014b\u014d\7\34\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fK\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\31P^agnx\u0082\u0089\u0094\u00ac\u00ae\u00c4\u00c6\u00d4\u00d6\u00e4"+
		"\u00e6\u00f0\u00f4\u00f7\u0101\u0104\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}