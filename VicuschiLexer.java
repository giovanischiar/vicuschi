// Generated from Vicuschi.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VicuschiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IF=11, ENDIF=12, FOR=13, ENDFOR=14, CASE=15, WHEN=16, WHILE=17, 
		ENDWHILE=18, ENDCASE=19, CONTINUE=20, ENDF=21, RETURN=22, IMPORT=23, INT=24, 
		FLOAT=25, STRING=26, BOOLEAN=27, MAJOR=28, MINOR=29, EQUALS=30, MAJOR_EQUALS=31, 
		MINOR_EQUALS=32, DIFFERENT=33, ATTRIBUTION=34, INCREMENT=35, DECREMENT=36, 
		THEN=37, UNARY_PLUS=38, UNARY_MINUS=39, LOGICAL_AND=40, LOGICAL_OR=41, 
		SEMICOLON=42, INT_NUMBER=43, FLOAT_NUMBER=44, EACH=45, BOOL=46, NUMBER=47, 
		WORD=48, ARRAY=49, ID=50, S_COMMENTARY=51, M_COMMENTARY=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "IF", "ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", 
		"ENDCASE", "CONTINUE", "ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", 
		"BOOLEAN", "MAJOR", "MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", 
		"DIFFERENT", "ATTRIBUTION", "INCREMENT", "DECREMENT", "THEN", "UNARY_PLUS", 
		"UNARY_MINUS", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INT_NUMBER", 
		"FLOAT_NUMBER", "EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "VAR", "LETTER", 
		"DIGIT", "SYMBOL", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'^'", "'('", "')'", "','", "'!'", "'['", "']'", "'[]'", 
		"'if'", "'endif'", "'for'", "'endfor'", "'case'", "'when'", "'while'", 
		"'endwhile'", "'endcase'", "'continue'", "'endf'", "'return'", "'import'", 
		"'int'", "'float'", "'string'", "'boolean'", "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'!='", "'='", "'++'", "'--'", "'->'", "'+'", "'-'", "'&'", "'|'", 
		"';'", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IF", 
		"ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", 
		"CONTINUE", "ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", "BOOLEAN", 
		"MAJOR", "MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", 
		"ATTRIBUTION", "INCREMENT", "DECREMENT", "THEN", "UNARY_PLUS", "UNARY_MINUS", 
		"LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INT_NUMBER", "FLOAT_NUMBER", 
		"EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "ID", "S_COMMENTARY", "M_COMMENTARY", 
		"WS"
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


	public VicuschiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vicuschi.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u018c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3,\6,\u011b\n,\r,\16,\u011c\3-\3-\6-\u0121\n-\r"+
		"-\16-\u0122\3-\6-\u0126\n-\r-\16-\u0127\3-\3-\7-\u012c\n-\f-\16-\u012f"+
		"\13-\5-\u0131\n-\3.\3.\3/\3/\3/\3/\3/\5/\u013a\n/\3\60\3\60\5\60\u013e"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\7\61\u0145\n\61\f\61\16\61\u0148\13\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u0150\n\62\3\62\7\62\u0153\n\62\f"+
		"\62\16\62\u0156\13\62\3\62\3\62\3\63\3\63\3\63\5\63\u015d\n\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\7\67\u0168\n\67\f\67\16\67\u016b"+
		"\13\67\38\38\38\38\78\u0171\n8\f8\168\u0174\138\38\38\39\39\39\39\79\u017c"+
		"\n9\f9\169\u017f\139\39\39\39\39\39\3:\6:\u0187\n:\r:\16:\u0188\3:\3:"+
		"\3\u017d\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2"+
		"k\2m\64o\65q\66s\67\3\2\7\4\2C\\c|\3\2\62;\13\2##((*\61<@]]__aa}\177\u02c8"+
		"\u02c8\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u019b\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2"+
		"\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2"+
		"\2\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u008a\3\2\2\2\31\u008d\3\2\2"+
		"\2\33\u0093\3\2\2\2\35\u0097\3\2\2\2\37\u009e\3\2\2\2!\u00a3\3\2\2\2#"+
		"\u00a8\3\2\2\2%\u00ae\3\2\2\2\'\u00b7\3\2\2\2)\u00bf\3\2\2\2+\u00c8\3"+
		"\2\2\2-\u00cd\3\2\2\2/\u00d4\3\2\2\2\61\u00db\3\2\2\2\63\u00df\3\2\2\2"+
		"\65\u00e5\3\2\2\2\67\u00ec\3\2\2\29\u00f4\3\2\2\2;\u00f6\3\2\2\2=\u00f8"+
		"\3\2\2\2?\u00fb\3\2\2\2A\u00fe\3\2\2\2C\u0101\3\2\2\2E\u0104\3\2\2\2G"+
		"\u0106\3\2\2\2I\u0109\3\2\2\2K\u010c\3\2\2\2M\u010f\3\2\2\2O\u0111\3\2"+
		"\2\2Q\u0113\3\2\2\2S\u0115\3\2\2\2U\u0117\3\2\2\2W\u011a\3\2\2\2Y\u0130"+
		"\3\2\2\2[\u0132\3\2\2\2]\u0139\3\2\2\2_\u013d\3\2\2\2a\u013f\3\2\2\2c"+
		"\u014b\3\2\2\2e\u015c\3\2\2\2g\u015e\3\2\2\2i\u0160\3\2\2\2k\u0162\3\2"+
		"\2\2m\u0164\3\2\2\2o\u016c\3\2\2\2q\u0177\3\2\2\2s\u0186\3\2\2\2uv\7,"+
		"\2\2v\4\3\2\2\2wx\7\61\2\2x\6\3\2\2\2yz\7`\2\2z\b\3\2\2\2{|\7*\2\2|\n"+
		"\3\2\2\2}~\7+\2\2~\f\3\2\2\2\177\u0080\7.\2\2\u0080\16\3\2\2\2\u0081\u0082"+
		"\7#\2\2\u0082\20\3\2\2\2\u0083\u0084\7]\2\2\u0084\22\3\2\2\2\u0085\u0086"+
		"\7_\2\2\u0086\24\3\2\2\2\u0087\u0088\7]\2\2\u0088\u0089\7_\2\2\u0089\26"+
		"\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\30\3\2\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f\u0090\7f\2\2\u0090\u0091\7k\2\2"+
		"\u0091\u0092\7h\2\2\u0092\32\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7"+
		"q\2\2\u0095\u0096\7t\2\2\u0096\34\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7f\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c"+
		"\u009d\7t\2\2\u009d\36\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7y\2\2\u00a4"+
		"\u00a5\7j\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7\"\3\2\2\2\u00a8"+
		"\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad$\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2"+
		"\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6&\3\2\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7e\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be(\3\2\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb"+
		"\7f\2\2\u00cb\u00cc\7h\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7p\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7o\2\2\u00d6"+
		"\u00d7\7r\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7v\2\2"+
		"\u00da\60\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7"+
		"v\2\2\u00de\62\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\64\3\2\2\2\u00e5\u00e6"+
		"\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7p\2\2\u00ea\u00eb\7i\2\2\u00eb\66\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f38\3\2\2\2\u00f4\u00f5\7@\2"+
		"\2\u00f5:\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7<\3\2\2\2\u00f8\u00f9\7?\2\2"+
		"\u00f9\u00fa\7?\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2"+
		"\2\u00fd@\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7?\2\2\u0100B\3\2\2\2"+
		"\u0101\u0102\7#\2\2\u0102\u0103\7?\2\2\u0103D\3\2\2\2\u0104\u0105\7?\2"+
		"\2\u0105F\3\2\2\2\u0106\u0107\7-\2\2\u0107\u0108\7-\2\2\u0108H\3\2\2\2"+
		"\u0109\u010a\7/\2\2\u010a\u010b\7/\2\2\u010bJ\3\2\2\2\u010c\u010d\7/\2"+
		"\2\u010d\u010e\7@\2\2\u010eL\3\2\2\2\u010f\u0110\7-\2\2\u0110N\3\2\2\2"+
		"\u0111\u0112\7/\2\2\u0112P\3\2\2\2\u0113\u0114\7(\2\2\u0114R\3\2\2\2\u0115"+
		"\u0116\7~\2\2\u0116T\3\2\2\2\u0117\u0118\7=\2\2\u0118V\3\2\2\2\u0119\u011b"+
		"\5i\65\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011dX\3\2\2\2\u011e\u0120\7\60\2\2\u011f\u0121\5i\65\2"+
		"\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0131\3\2\2\2\u0124\u0126\5i\65\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012d\7\60\2\2\u012a\u012c\5i\65\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u011e\3\2\2\2\u0130\u0125\3\2\2\2\u0131"+
		"Z\3\2\2\2\u0132\u0133\7<\2\2\u0133\\\3\2\2\2\u0134\u0135\7{\2\2\u0135"+
		"\u0136\7g\2\2\u0136\u013a\7u\2\2\u0137\u0138\7p\2\2\u0138\u013a\7q\2\2"+
		"\u0139\u0134\3\2\2\2\u0139\u0137\3\2\2\2\u013a^\3\2\2\2\u013b\u013e\5"+
		"W,\2\u013c\u013e\5Y-\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e`"+
		"\3\2\2\2\u013f\u0146\7$\2\2\u0140\u0145\5_\60\2\u0141\u0145\5g\64\2\u0142"+
		"\u0145\5s:\2\u0143\u0145\5k\66\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014a\7$\2\2\u014ab\3\2\2\2\u014b\u014c\7}\2\2\u014c\u0154\5e\63\2\u014d"+
		"\u014f\7.\2\2\u014e\u0150\5s:\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0153\5e\63\2\u0152\u014d\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7\177\2\2\u0158d\3\2\2\2\u0159\u015d\5\67\34"+
		"\2\u015a\u015d\5_\60\2\u015b\u015d\5m\67\2\u015c\u0159\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015b\3\2\2\2\u015df\3\2\2\2\u015e\u015f\t\2\2\2\u015f"+
		"h\3\2\2\2\u0160\u0161\t\3\2\2\u0161j\3\2\2\2\u0162\u0163\t\4\2\2\u0163"+
		"l\3\2\2\2\u0164\u0169\5g\64\2\u0165\u0168\5i\65\2\u0166\u0168\5g\64\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016an\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\7\61\2\2\u016d\u016e\7\61\2\2\u016e\u0172\3\2\2\2\u016f\u0171\n"+
		"\5\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\b8"+
		"\2\2\u0176p\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7,\2\2\u0179\u017d"+
		"\3\2\2\2\u017a\u017c\13\2\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0181\7,\2\2\u0181\u0182\7\61\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\b9\2\2\u0184r\3\2\2\2\u0185\u0187\t\6\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018b\b:\2\2\u018bt\3\2\2\2\24\2\u011c\u0122\u0127\u012d\u0130"+
		"\u0139\u013d\u0144\u0146\u014f\u0154\u015c\u0167\u0169\u0172\u017d\u0188"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}