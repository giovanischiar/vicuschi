// Generated from VicuschiLex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VicuschiLexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, FOR=3, ENDFOR=4, CASE=5, WHEN=6, WHILE=7, ENDWHILE=8, ENDCASE=9, 
		CONTINUE=10, ENDF=11, RETURN=12, INT=13, FLOAT=14, STRING=15, BOOLEAN=16, 
		NOT_ID=17, MAJOR=18, MINOR=19, EQUALS=20, MAJOR_EQUALS=21, MINOR_EQUALS=22, 
		DIFFERENT=23, ATTRIBUTION=24, INCREMENT=25, DECREMENT=26, LOGICAL_AND=27, 
		LOGICAL_OR=28, SEMICOLON=29, INDEX=30, EACH=31, BOOL=32, NUMBER=33, WORD=34, 
		ARRAY=35, INTERVAL=36, ID=37, S_COMMENTARY=38, M_COMMENTARY=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", 
		"CONTINUE", "ENDF", "RETURN", "INT", "FLOAT", "STRING", "BOOLEAN", "NOT_ID", 
		"MAJOR", "MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", 
		"ATTRIBUTION", "INCREMENT", "DECREMENT", "LOGICAL_AND", "LOGICAL_OR", 
		"SEMICOLON", "INDEX", "EACH", "BOOL", "NUMBER", "NUMBERTYPE", "WORD", 
		"ARRAY", "INTERVAL", "INCLUSIVE_TERMINAL", "NONINCLUSIVE_TERMINAL", "VAR", 
		"LETTER", "DIGIT", "SYMBOL", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'endif'", "'for'", "'endfor'", "'case'", "'when'", "'while'", 
		"'endwhile'", "'endcase'", "'continue'", "'endf'", "'return'", "'int'", 
		"'float'", "'string'", "'boolean'", null, "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'!='", "'='", "'++'", "'--'", "'&&'", "'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", 
		"ENDCASE", "CONTINUE", "ENDF", "RETURN", "INT", "FLOAT", "STRING", "BOOLEAN", 
		"NOT_ID", "MAJOR", "MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", 
		"DIFFERENT", "ATTRIBUTION", "INCREMENT", "DECREMENT", "LOGICAL_AND", "LOGICAL_OR", 
		"SEMICOLON", "INDEX", "EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "INTERVAL", 
		"ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
	};
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


	public VicuschiLexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VicuschiLex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0196\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u00ed\n\37\r\37\16\37\u00ee\3\37"+
		"\3\37\5\37\u00f3\n\37\3 \3 \3!\3!\3!\3!\3!\5!\u00fc\n!\3\"\5\"\u00ff\n"+
		"\"\3\"\3\"\3#\3#\6#\u0105\n#\r#\16#\u0106\3#\6#\u010a\n#\r#\16#\u010b"+
		"\3#\3#\7#\u0110\n#\f#\16#\u0113\13#\3#\6#\u0116\n#\r#\16#\u0117\5#\u011a"+
		"\n#\3$\3$\3$\3$\3$\7$\u0121\n$\f$\16$\u0124\13$\3$\3$\3%\3%\3%\3%\5%\u012c"+
		"\n%\3%\7%\u012f\n%\f%\16%\u0132\13%\3%\3%\3&\3&\5&\u0138\n&\3\'\3\'\6"+
		"\'\u013c\n\'\r\'\16\'\u013d\3\'\3\'\5\'\u0142\n\'\3\'\6\'\u0145\n\'\r"+
		"\'\16\'\u0146\3\'\3\'\3(\3(\6(\u014d\n(\r(\16(\u014e\3(\3(\5(\u0153\n"+
		"(\3(\6(\u0156\n(\r(\16(\u0157\3(\3(\3)\3)\3)\5)\u015f\n)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3-\7-\u016a\n-\f-\16-\u016d\13-\3.\3.\3.\3.\3.\3.\3.\7.\u0176"+
		"\n.\f.\16.\u0179\13.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\7/\u0186\n/\f/\16"+
		"/\u0189\13/\3/\3/\3/\3/\3/\3\60\6\60\u0191\n\60\r\60\16\60\u0192\3\60"+
		"\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E\2G$I%K&M\2O\2Q\2S\2U\2W\2Y\'[(])_*\3\2\b\4\2"+
		"--//\4\2C\\c|\3\2\62;\13\2##((*+-\61<@]]__aa}\177\5\2\13\13\17\17\"\""+
		"\5\2\13\f\17\17\"\"\2\u01b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\3a\3\2\2\2\5d\3\2\2\2\7j\3\2\2\2\tn\3\2\2\2\13u\3\2\2"+
		"\2\rz\3\2\2\2\17\177\3\2\2\2\21\u0085\3\2\2\2\23\u008e\3\2\2\2\25\u0096"+
		"\3\2\2\2\27\u009f\3\2\2\2\31\u00a4\3\2\2\2\33\u00ab\3\2\2\2\35\u00af\3"+
		"\2\2\2\37\u00b5\3\2\2\2!\u00bc\3\2\2\2#\u00c4\3\2\2\2%\u00c7\3\2\2\2\'"+
		"\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00ce\3\2\2\2-\u00d1\3\2\2\2/\u00d4\3\2"+
		"\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00dc\3\2\2\2\67\u00df\3\2\2"+
		"\29\u00e2\3\2\2\2;\u00e4\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00fb"+
		"\3\2\2\2C\u00fe\3\2\2\2E\u0119\3\2\2\2G\u011b\3\2\2\2I\u0127\3\2\2\2K"+
		"\u0137\3\2\2\2M\u0139\3\2\2\2O\u014a\3\2\2\2Q\u015e\3\2\2\2S\u0160\3\2"+
		"\2\2U\u0162\3\2\2\2W\u0164\3\2\2\2Y\u0166\3\2\2\2[\u016e\3\2\2\2]\u017e"+
		"\3\2\2\2_\u0190\3\2\2\2ab\7k\2\2bc\7h\2\2c\4\3\2\2\2de\7g\2\2ef\7p\2\2"+
		"fg\7f\2\2gh\7k\2\2hi\7h\2\2i\6\3\2\2\2jk\7h\2\2kl\7q\2\2lm\7t\2\2m\b\3"+
		"\2\2\2no\7g\2\2op\7p\2\2pq\7f\2\2qr\7h\2\2rs\7q\2\2st\7t\2\2t\n\3\2\2"+
		"\2uv\7e\2\2vw\7c\2\2wx\7u\2\2xy\7g\2\2y\f\3\2\2\2z{\7y\2\2{|\7j\2\2|}"+
		"\7g\2\2}~\7p\2\2~\16\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\20\3\2\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088\7f\2\2\u0088\u0089\7y\2\2"+
		"\u0089\u008a\7j\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7g\2\2\u008d\22\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7f\2\2\u0091\u0092\7e\2\2\u0092\u0093\7c\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7g\2\2\u0095\24\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2"+
		"\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e\26\3\2\2\2\u009f\u00a0\7"+
		"g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7h\2\2\u00a3\30"+
		"\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\32\3\2\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\34\3\2\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7c\2\2"+
		"\u00b3\u00b4\7v\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7"+
		"v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb"+
		"\7i\2\2\u00bb \3\2\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\5Y-\2\u00c6"+
		"$\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca("+
		"\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7?\2\2\u00cd*\3\2\2\2\u00ce\u00cf"+
		"\7@\2\2\u00cf\u00d0\7?\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7?\2\2\u00d6\60"+
		"\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7-\2\2\u00da"+
		"\u00db\7-\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd\u00de\7/\2\2\u00de"+
		"\66\3\2\2\2\u00df\u00e0\7(\2\2\u00e0\u00e1\7(\2\2\u00e18\3\2\2\2\u00e2"+
		"\u00e3\7~\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5<\3\2\2\2\u00e6\u00e7"+
		"\7]\2\2\u00e7\u00e8\5Y-\2\u00e8\u00e9\7_\2\2\u00e9\u00f3\3\2\2\2\u00ea"+
		"\u00ec\7]\2\2\u00eb\u00ed\5U+\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\7_\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3"+
		">\3\2\2\2\u00f4\u00f5\7<\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7{\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00fc\7u\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fc\7q\2\2\u00fb"+
		"\u00f6\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fcB\3\2\2\2\u00fd\u00ff\t\2\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\5E#\2\u0101D\3\2\2\2\u0102\u0104\7\60\2\2\u0103\u0105\5U+\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u011a\3\2\2\2\u0108\u010a\5U+\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0111"+
		"\7\60\2\2\u010e\u0110\5U+\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011a\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\5U+\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0102\3\2\2\2\u0119"+
		"\u0109\3\2\2\2\u0119\u0115\3\2\2\2\u011aF\3\2\2\2\u011b\u0122\7$\2\2\u011c"+
		"\u0121\5C\"\2\u011d\u0121\5S*\2\u011e\u0121\5_\60\2\u011f\u0121\5W,\2"+
		"\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7$\2\2\u0126H\3\2\2\2\u0127"+
		"\u0128\7}\2\2\u0128\u0130\5Q)\2\u0129\u012b\7.\2\2\u012a\u012c\5_\60\2"+
		"\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\5Q)\2\u012e\u0129\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\177"+
		"\2\2\u0134J\3\2\2\2\u0135\u0138\5M\'\2\u0136\u0138\5O(\2\u0137\u0135\3"+
		"\2\2\2\u0137\u0136\3\2\2\2\u0138L\3\2\2\2\u0139\u013b\7]\2\2\u013a\u013c"+
		"\5U+\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\7.\2\2\u0140\u0142\5_\60"+
		"\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0145"+
		"\5U+\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7_\2\2\u0149N\3\2\2\2\u014a"+
		"\u014c\7]\2\2\u014b\u014d\5U+\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2"+
		"\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152"+
		"\7.\2\2\u0151\u0153\5_\60\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0156\5U+\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\7+\2\2\u015aP\3\2\2\2\u015b\u015f\5!\21\2\u015c\u015f\5C\"\2\u015d\u015f"+
		"\5Y-\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"R\3\2\2\2\u0160\u0161\t\3\2\2\u0161T\3\2\2\2\u0162\u0163\t\4\2\2\u0163"+
		"V\3\2\2\2\u0164\u0165\t\5\2\2\u0165X\3\2\2\2\u0166\u016b\5S*\2\u0167\u016a"+
		"\5U+\2\u0168\u016a\5S*\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cZ\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\61\2\2\u0170\u0177"+
		"\3\2\2\2\u0171\u0176\5C\"\2\u0172\u0176\5S*\2\u0173\u0176\t\6\2\2\u0174"+
		"\u0176\5W,\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2"+
		"\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\f\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\b.\2\2\u017d\\\3\2\2\2\u017e\u017f\7\61\2\2"+
		"\u017f\u0180\7,\2\2\u0180\u0187\3\2\2\2\u0181\u0186\5C\"\2\u0182\u0186"+
		"\5S*\2\u0183\u0186\5_\60\2\u0184\u0186\5W,\2\u0185\u0181\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018b\7,\2\2\u018b\u018c\7\61\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018e\b/\2\2\u018e^\3\2\2\2\u018f\u0191\t\7\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\b\60\2\2\u0195`\3\2\2\2\37\2\u00ee\u00f2\u00fb"+
		"\u00fe\u0106\u010b\u0111\u0117\u0119\u0120\u0122\u012b\u0130\u0137\u013d"+
		"\u0141\u0146\u014e\u0152\u0157\u015e\u0169\u016b\u0175\u0177\u0185\u0187"+
		"\u0192\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}