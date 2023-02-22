// Generated from /Users/veronika/Desktop/mt-homeworks/lab-4/src/inputGrammar.g4 by ANTLR 4.9.2
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
public class inputGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUM=5, SPACES=6;
	public static final int
		RULE_expr = 0, RULE_exprP = 1, RULE_term = 2, RULE_termP = 3, RULE_factor = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "exprP", "term", "termP", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUM", "SPACES"
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
	public String getGrammarFileName() { return "inputGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public inputGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public int val;
		public TermContext term;
		public ExprPContext exprP;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPContext exprP() {
			return getRuleContext(ExprPContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputGrammarVisitor ) return ((inputGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((ExprContext)_localctx).term = term();
			setState(11);
			((ExprContext)_localctx).exprP = exprP(((ExprContext)_localctx).term.val);
			((ExprContext)_localctx).val =  ((ExprContext)_localctx).exprP.val;
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

	public static class ExprPContext extends ParserRuleContext {
		public int acc;
		public int val;
		public TermContext term;
		public ExprPContext exprP;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPContext exprP() {
			return getRuleContext(ExprPContext.class,0);
		}
		public ExprPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprPContext(ParserRuleContext parent, int invokingState, int acc) {
			super(parent, invokingState);
			this.acc = acc;
		}
		@Override public int getRuleIndex() { return RULE_exprP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).enterExprP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).exitExprP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputGrammarVisitor ) return ((inputGrammarVisitor<? extends T>)visitor).visitExprP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPContext exprP(int acc) throws RecognitionException {
		ExprPContext _localctx = new ExprPContext(_ctx, getState(), acc);
		enterRule(_localctx, 2, RULE_exprP);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				((ExprPContext)_localctx).val =  _localctx.acc;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__0);
				setState(16);
				((ExprPContext)_localctx).term = term();
				setState(17);
				((ExprPContext)_localctx).exprP = exprP(_localctx.acc + ((ExprPContext)_localctx).term.val);
				((ExprPContext)_localctx).val =  ((ExprPContext)_localctx).exprP.val;
				}
				break;
			case T__2:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				((ExprPContext)_localctx).term = term();
				((ExprPContext)_localctx).val =  ((ExprPContext)_localctx).term.val;
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

	public static class TermContext extends ParserRuleContext {
		public int val;
		public FactorContext factor;
		public TermPContext termP;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermPContext termP() {
			return getRuleContext(TermPContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputGrammarVisitor ) return ((inputGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((TermContext)_localctx).factor = factor();
			setState(26);
			((TermContext)_localctx).termP = termP(((TermContext)_localctx).factor.val);
			((TermContext)_localctx).val =  ((TermContext)_localctx).termP.val;
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

	public static class TermPContext extends ParserRuleContext {
		public int acc;
		public int val;
		public FactorContext factor;
		public TermPContext termP;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermPContext termP() {
			return getRuleContext(TermPContext.class,0);
		}
		public TermPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermPContext(ParserRuleContext parent, int invokingState, int acc) {
			super(parent, invokingState);
			this.acc = acc;
		}
		@Override public int getRuleIndex() { return RULE_termP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).enterTermP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).exitTermP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputGrammarVisitor ) return ((inputGrammarVisitor<? extends T>)visitor).visitTermP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermPContext termP(int acc) throws RecognitionException {
		TermPContext _localctx = new TermPContext(_ctx, getState(), acc);
		enterRule(_localctx, 6, RULE_termP);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((TermPContext)_localctx).val =  _localctx.acc;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__1);
				setState(31);
				((TermPContext)_localctx).factor = factor();
				setState(32);
				((TermPContext)_localctx).termP = termP(_localctx.acc * ((TermPContext)_localctx).factor.val);
				((TermPContext)_localctx).val =  ((TermPContext)_localctx).termP.val;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				((TermPContext)_localctx).factor = factor();
				((TermPContext)_localctx).val =  ((TermPContext)_localctx).factor.val;
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

	public static class FactorContext extends ParserRuleContext {
		public int val;
		public ExprContext expr;
		public Token NUM;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(inputGrammarParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputGrammarListener ) ((inputGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputGrammarVisitor ) return ((inputGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__2);
				setState(41);
				((FactorContext)_localctx).expr = expr();
				setState(42);
				match(T__3);
				((FactorContext)_localctx).val =  ((FactorContext)_localctx).expr.val;
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((FactorContext)_localctx).NUM = match(NUM);
				((FactorContext)_localctx).val =  Integer.parseInt((((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5)\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\2\2\7\2\4\6\b"+
		"\n\2\2\2\63\2\f\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b(\3\2\2\2\n\61\3\2"+
		"\2\2\f\r\5\6\4\2\r\16\5\4\3\2\16\17\b\2\1\2\17\3\3\2\2\2\20\32\b\3\1\2"+
		"\21\22\7\3\2\2\22\23\5\6\4\2\23\24\5\4\3\2\24\25\b\3\1\2\25\32\3\2\2\2"+
		"\26\27\5\6\4\2\27\30\b\3\1\2\30\32\3\2\2\2\31\20\3\2\2\2\31\21\3\2\2\2"+
		"\31\26\3\2\2\2\32\5\3\2\2\2\33\34\5\n\6\2\34\35\5\b\5\2\35\36\b\4\1\2"+
		"\36\7\3\2\2\2\37)\b\5\1\2 !\7\4\2\2!\"\5\n\6\2\"#\5\b\5\2#$\b\5\1\2$)"+
		"\3\2\2\2%&\5\n\6\2&\'\b\5\1\2\')\3\2\2\2(\37\3\2\2\2( \3\2\2\2(%\3\2\2"+
		"\2)\t\3\2\2\2*+\7\5\2\2+,\5\2\2\2,-\7\6\2\2-.\b\6\1\2.\62\3\2\2\2/\60"+
		"\7\7\2\2\60\62\b\6\1\2\61*\3\2\2\2\61/\3\2\2\2\62\13\3\2\2\2\5\31(\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}