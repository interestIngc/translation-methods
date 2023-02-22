// Generated from /Users/veronika/Desktop/mt-homeworks/lab-4/src/InputGrammar.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InputGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NAME=9, 
		TERMINAL_NAME=10, ASSIGNMENT=11, ARGUMENT=12, STRING=13, SPACE=14;
	public static final int
		RULE_file = 0, RULE_nonTerminalRule = 1, RULE_statement = 2, RULE_returnsStatement = 3, 
		RULE_nonTerminal = 4, RULE_nonTerminalWithArg = 5, RULE_terminalRule = 6, 
		RULE_string = 7, RULE_argument = 8, RULE_assignment = 9, RULE_regex = 10, 
		RULE_terminal = 11, RULE_colon = 12, RULE_semicolon = 13, RULE_skipToken = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "nonTerminalRule", "statement", "returnsStatement", "nonTerminal", 
			"nonTerminalWithArg", "terminalRule", "string", "argument", "assignment", 
			"regex", "terminal", "colon", "semicolon", "skipToken"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'returns'", "'+'", "'*'", "'?'", "':'", "';'", "'-> skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NAME", "TERMINAL_NAME", 
			"ASSIGNMENT", "ARGUMENT", "STRING", "SPACE"
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
	public String getGrammarFileName() { return "InputGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InputGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<NonTerminalRuleContext> nonTerminalRule() {
			return getRuleContexts(NonTerminalRuleContext.class);
		}
		public NonTerminalRuleContext nonTerminalRule(int i) {
			return getRuleContext(NonTerminalRuleContext.class,i);
		}
		public List<TerminalRuleContext> terminalRule() {
			return getRuleContexts(TerminalRuleContext.class);
		}
		public TerminalRuleContext terminalRule(int i) {
			return getRuleContext(TerminalRuleContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitFile(this);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(30);
				nonTerminalRule();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERMINAL_NAME) {
				{
				{
				setState(36);
				terminalRule();
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

	public static class NonTerminalRuleContext extends ParserRuleContext {
		public NonTerminalContext nonTerminal() {
			return getRuleContext(NonTerminalContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ReturnsStatementContext returnsStatement() {
			return getRuleContext(ReturnsStatementContext.class,0);
		}
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterNonTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitNonTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitNonTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalRuleContext nonTerminalRule() throws RecognitionException {
		NonTerminalRuleContext _localctx = new NonTerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nonTerminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			nonTerminal();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARGUMENT) {
				{
				setState(43);
				argument();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(46);
				returnsStatement();
				}
			}

			setState(49);
			colon();
			{
			setState(50);
			statement();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				statement();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(58);
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

	public static class StatementContext extends ParserRuleContext {
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public List<NonTerminalWithArgContext> nonTerminalWithArg() {
			return getRuleContexts(NonTerminalWithArgContext.class);
		}
		public NonTerminalWithArgContext nonTerminalWithArg(int i) {
			return getRuleContext(NonTerminalWithArgContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==TERMINAL_NAME) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TERMINAL_NAME:
					{
					setState(60);
					terminal();
					}
					break;
				case NAME:
					{
					setState(61);
					nonTerminalWithArg();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(67);
				assignment();
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

	public static class ReturnsStatementContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ReturnsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterReturnsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitReturnsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitReturnsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnsStatementContext returnsStatement() throws RecognitionException {
		ReturnsStatementContext _localctx = new ReturnsStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__1);
			setState(71);
			argument();
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

	public static class NonTerminalContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(InputGrammarParser.NAME, 0); }
		public NonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitNonTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalContext nonTerminal() throws RecognitionException {
		NonTerminalContext _localctx = new NonTerminalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nonTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(NAME);
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

	public static class NonTerminalWithArgContext extends ParserRuleContext {
		public NonTerminalContext nonTerminal() {
			return getRuleContext(NonTerminalContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public NonTerminalWithArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalWithArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterNonTerminalWithArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitNonTerminalWithArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitNonTerminalWithArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalWithArgContext nonTerminalWithArg() throws RecognitionException {
		NonTerminalWithArgContext _localctx = new NonTerminalWithArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonTerminalWithArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			nonTerminal();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARGUMENT) {
				{
				setState(76);
				argument();
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

	public static class TerminalRuleContext extends ParserRuleContext {
		public TerminalContext currName;
		public StringContext parsedString;
		public SkipTokenContext toSkip;
		public RegexContext parsedRegex;
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SkipTokenContext skipToken() {
			return getRuleContext(SkipTokenContext.class,0);
		}
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalRuleContext terminalRule() throws RecognitionException {
		TerminalRuleContext _localctx = new TerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminalRule);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((TerminalRuleContext)_localctx).currName = terminal();
				setState(80);
				colon();
				setState(81);
				((TerminalRuleContext)_localctx).parsedString = string();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(82);
					((TerminalRuleContext)_localctx).toSkip = skipToken();
					}
				}

				setState(85);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((TerminalRuleContext)_localctx).currName = terminal();
				setState(88);
				colon();
				setState(89);
				((TerminalRuleContext)_localctx).parsedRegex = regex();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(90);
					((TerminalRuleContext)_localctx).toSkip = skipToken();
					}
				}

				setState(93);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(InputGrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(STRING);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode ARGUMENT() { return getToken(InputGrammarParser.ARGUMENT, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ARGUMENT);
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
		public TerminalNode ASSIGNMENT() { return getToken(InputGrammarParser.ASSIGNMENT, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ASSIGNMENT);
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

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode ARGUMENT() { return getToken(InputGrammarParser.ARGUMENT, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ARGUMENT);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TERMINAL_NAME() { return getToken(InputGrammarParser.TERMINAL_NAME, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_terminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(TERMINAL_NAME);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__5);
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
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__6);
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

	public static class SkipTokenContext extends ParserRuleContext {
		public SkipTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).enterSkipToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputGrammarListener ) ((InputGrammarListener)listener).exitSkipToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputGrammarVisitor ) return ((InputGrammarVisitor<? extends T>)visitor).visitSkipToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipTokenContext skipToken() throws RecognitionException {
		SkipTokenContext _localctx = new SkipTokenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skipToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\5\3/\n\3\3\3\5\3\62\n\3\3\3\3\3"+
		"\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\4\3\4\7\4A\n\4\f\4\16\4D\13"+
		"\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\5"+
		"\bV\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\b\3\b\5\bb\n\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\5\fl\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\5\7\2s\2#"+
		"\3\2\2\2\4,\3\2\2\2\6B\3\2\2\2\bH\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16a\3"+
		"\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32"+
		"o\3\2\2\2\34q\3\2\2\2\36s\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\5\16\b\2\'&\3\2\2\2(+\3\2\2\2)"+
		"\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,.\5\n\6\2-/\5\22\n\2.-\3\2\2"+
		"\2./\3\2\2\2/\61\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\5\32\16\2\649\5\6\4\2\65\66\7\3\2\2\668\5\6\4\2\67\65"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\34\17"+
		"\2=\5\3\2\2\2>A\5\30\r\2?A\5\f\7\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2EG\5\24\13\2FE\3\2\2\2FG\3\2\2\2G\7"+
		"\3\2\2\2HI\7\4\2\2IJ\5\22\n\2J\t\3\2\2\2KL\7\13\2\2L\13\3\2\2\2MO\5\n"+
		"\6\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2P\r\3\2\2\2QR\5\30\r\2RS\5\32\16\2"+
		"SU\5\20\t\2TV\5\36\20\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\34\17\2Xb\3"+
		"\2\2\2YZ\5\30\r\2Z[\5\32\16\2[]\5\26\f\2\\^\5\36\20\2]\\\3\2\2\2]^\3\2"+
		"\2\2^_\3\2\2\2_`\5\34\17\2`b\3\2\2\2aQ\3\2\2\2aY\3\2\2\2b\17\3\2\2\2c"+
		"d\7\17\2\2d\21\3\2\2\2ef\7\16\2\2f\23\3\2\2\2gh\7\r\2\2h\25\3\2\2\2ik"+
		"\7\16\2\2jl\t\2\2\2kj\3\2\2\2kl\3\2\2\2l\27\3\2\2\2mn\7\f\2\2n\31\3\2"+
		"\2\2op\7\b\2\2p\33\3\2\2\2qr\7\t\2\2r\35\3\2\2\2st\7\n\2\2t\37\3\2\2\2"+
		"\17#).\619@BFOU]ak";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}