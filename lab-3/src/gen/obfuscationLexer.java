// Generated from /Users/veronika/Desktop/mt-homeworks/lab-3/src/obfuscation.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class obfuscationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		EQ=10, EQUALS=11, NOT_EQUALS=12, SEMICOLON=13, PLUS=14, MINUS=15, MUL=16, 
		DIV=17, MORE_STRICT=18, MORE_OR_EQ=19, LESS_STRICT=20, LESS_OR_EQ=21, 
		TYPE=22, NUMBER=23, STRING=24, IDENTIFIER=25, SPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"DIGIT", "LETTER", "EQ", "EQUALS", "NOT_EQUALS", "SEMICOLON", "PLUS", 
			"MINUS", "MUL", "DIV", "MORE_STRICT", "MORE_OR_EQ", "LESS_STRICT", "LESS_OR_EQ", 
			"TYPE", "NUMBER", "STRING", "IDENTIFIER", "SPACE"
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


	public obfuscationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "obfuscation.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u008f\n\31\3\31\6\31\u0092\n\31\r\31\16\31\u0093\3\32"+
		"\6\32\u0097\n\32\r\32\16\32\u0098\3\32\3\32\6\32\u009d\n\32\r\32\16\32"+
		"\u009e\5\32\u00a1\n\32\3\33\3\33\7\33\u00a5\n\33\f\33\16\33\u00a8\13\33"+
		"\3\33\3\33\3\34\3\34\5\34\u00ae\n\34\3\34\3\34\3\34\7\34\u00b3\n\34\f"+
		"\34\16\34\u00b6\13\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\2\27\2\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26"+
		"/\27\61\30\63\31\65\32\67\339\34\3\2\6\3\2\62;\4\2C\\c|\4\2\f\f$$\4\2"+
		"\13\f\"\"\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5>\3"+
		"\2\2\2\7C\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3"+
		"\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35"+
		"_\3\2\2\2\37b\3\2\2\2!d\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'j\3\2\2\2)l\3\2\2"+
		"\2+n\3\2\2\2-q\3\2\2\2/s\3\2\2\2\61\u008e\3\2\2\2\63\u0096\3\2\2\2\65"+
		"\u00a2\3\2\2\2\67\u00ad\3\2\2\29\u00b7\3\2\2\2;<\7k\2\2<=\7h\2\2=\4\3"+
		"\2\2\2>?\7g\2\2?@\7n\2\2@A\7u\2\2AB\7g\2\2B\6\3\2\2\2CD\7t\2\2DE\7g\2"+
		"\2EF\7v\2\2FG\7w\2\2GH\7t\2\2HI\7p\2\2I\b\3\2\2\2JK\7*\2\2K\n\3\2\2\2"+
		"LM\7+\2\2M\f\3\2\2\2NO\7}\2\2O\16\3\2\2\2PQ\7\177\2\2Q\20\3\2\2\2RS\7"+
		".\2\2S\22\3\2\2\2TU\7(\2\2U\24\3\2\2\2VW\t\2\2\2W\26\3\2\2\2XY\t\3\2\2"+
		"Y\30\3\2\2\2Z[\7?\2\2[\32\3\2\2\2\\]\7?\2\2]^\7?\2\2^\34\3\2\2\2_`\7#"+
		"\2\2`a\7?\2\2a\36\3\2\2\2bc\7=\2\2c \3\2\2\2de\7-\2\2e\"\3\2\2\2fg\7/"+
		"\2\2g$\3\2\2\2hi\7,\2\2i&\3\2\2\2jk\7\61\2\2k(\3\2\2\2lm\7@\2\2m*\3\2"+
		"\2\2no\7@\2\2op\7?\2\2p,\3\2\2\2qr\7>\2\2r.\3\2\2\2st\7>\2\2tu\7?\2\2"+
		"u\60\3\2\2\2vw\7k\2\2wx\7p\2\2x\u008f\7v\2\2yz\7h\2\2z{\7n\2\2{|\7q\2"+
		"\2|}\7c\2\2}\u008f\7v\2\2~\177\7f\2\2\177\u0080\7q\2\2\u0080\u0081\7w"+
		"\2\2\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2\u0083\u008f\7g\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008f\7i\2\2\u008a\u008b\7x\2\2\u008b\u008c\7q\2\2"+
		"\u008c\u008d\7k\2\2\u008d\u008f\7f\2\2\u008ev\3\2\2\2\u008ey\3\2\2\2\u008e"+
		"~\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u008a\3\2\2\2\u008f\u0091\3\2\2\2"+
		"\u0090\u0092\59\35\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\62\3\2\2\2\u0095\u0097\5\25\13\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u00a0\3\2\2\2\u009a\u009c\7\60\2\2\u009b\u009d\5\25\13\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\64\3\2\2\2\u00a2\u00a6\7$\2\2\u00a3\u00a5\n\4\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa\66\3\2\2\2\u00ab"+
		"\u00ae\5\27\f\2\u00ac\u00ae\7a\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b4\3\2\2\2\u00af\u00b3\5\27\f\2\u00b0\u00b3\5\25\13\2\u00b1"+
		"\u00b3\7a\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b8:\3\2\2\2\f\2\u008e"+
		"\u0093\u0098\u009e\u00a0\u00a6\u00ad\u00b2\u00b4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}