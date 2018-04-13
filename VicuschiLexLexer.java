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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IF=11, ENDIF=12, FOR=13, ENDFOR=14, CASE=15, WHEN=16, WHILE=17, 
		ENDWHILE=18, ENDCASE=19, CONTINUE=20, ENDF=21, RETURN=22, INT=23, FLOAT=24, 
		STRING=25, BOOLEAN=26, MAJOR=27, MINOR=28, EQUALS=29, MAJOR_EQUALS=30, 
		MINOR_EQUALS=31, DIFFERENT=32, ATTRIBUTION=33, INCREMENT=34, DECREMENT=35, 
		LOGICAL_AND=36, LOGICAL_OR=37, SEMICOLON=38, INDEX=39, EACH=40, BOOL=41, 
		NUMBER=42, WORD=43, ARRAY=44, INTERVAL=45, ID=46, S_COMMENTARY=47, M_COMMENTARY=48, 
		WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "IF", "ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", 
		"ENDCASE", "CONTINUE", "ENDF", "RETURN", "INT", "FLOAT", "STRING", "BOOLEAN", 
		"MAJOR", "MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", 
		"ATTRIBUTION", "INCREMENT", "DECREMENT", "LOGICAL_AND", "LOGICAL_OR", 
		"SEMICOLON", "INDEX", "EACH", "BOOL", "NUMBER", "NUMBERTYPE", "WORD", 
		"ARRAY", "INTERVAL", "INCLUSIVE_TERMINAL", "NONINCLUSIVE_TERMINAL", "VAR", 
		"LETTER", "DIGIT", "SYMBOL", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "','", "'||'", 
		"'!'", "'if'", "'endif'", "'for'", "'endfor'", "'case'", "'when'", "'while'", 
		"'endwhile'", "'endcase'", "'continue'", "'endf'", "'return'", "'int'", 
		"'float'", "'string'", "'boolean'", "'>'", "'<'", "'=='", "'>='", "'<='", 
		"'!='", "'='", "'++'", "'--'", "'&&'", "'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IF", 
		"ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", 
		"CONTINUE", "ENDF", "RETURN", "INT", "FLOAT", "STRING", "BOOLEAN", "MAJOR", 
		"MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", 
		"INCREMENT", "DECREMENT", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INDEX", 
		"EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "INTERVAL", "ID", "S_COMMENTARY", 
		"M_COMMENTARY", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#"+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\6(\u0111\n(\r"+
		"(\16(\u0112\3(\3(\3(\3(\5(\u0119\n(\3)\3)\3*\3*\3*\3*\3*\5*\u0122\n*\3"+
		"+\5+\u0125\n+\3+\3+\3,\3,\6,\u012b\n,\r,\16,\u012c\3,\6,\u0130\n,\r,\16"+
		",\u0131\3,\3,\7,\u0136\n,\f,\16,\u0139\13,\3,\6,\u013c\n,\r,\16,\u013d"+
		"\5,\u0140\n,\3-\3-\3-\3-\3-\7-\u0147\n-\f-\16-\u014a\13-\3-\3-\3.\3.\3"+
		".\3.\5.\u0152\n.\3.\7.\u0155\n.\f.\16.\u0158\13.\3.\3.\3/\3/\5/\u015e"+
		"\n/\3\60\3\60\6\60\u0162\n\60\r\60\16\60\u0163\3\60\3\60\5\60\u0168\n"+
		"\60\3\60\6\60\u016b\n\60\r\60\16\60\u016c\3\60\3\60\3\61\3\61\6\61\u0173"+
		"\n\61\r\61\16\61\u0174\3\61\3\61\5\61\u0179\n\61\3\61\6\61\u017c\n\61"+
		"\r\61\16\61\u017d\3\61\3\61\3\62\3\62\3\62\5\62\u0185\n\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\66\7\66\u0190\n\66\f\66\16\66\u0193\13"+
		"\66\3\67\3\67\3\67\3\67\7\67\u0199\n\67\f\67\16\67\u019c\13\67\3\67\3"+
		"\67\38\38\38\38\78\u01a4\n8\f8\168\u01a7\138\38\38\38\38\38\39\69\u01af"+
		"\n9\r9\169\u01b0\39\39\3\u01a5\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y-[.]/"+
		"_\2a\2c\2e\2g\2i\2k\60m\61o\62q\63\3\2\b\4\2--//\4\2C\\c|\3\2\62;\13\2"+
		"##((*\61<@]]__aa}\177\u02c8\u02c8\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01cb"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2"+
		"\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u0086"+
		"\3\2\2\2\27\u0088\3\2\2\2\31\u008b\3\2\2\2\33\u0091\3\2\2\2\35\u0095\3"+
		"\2\2\2\37\u009c\3\2\2\2!\u00a1\3\2\2\2#\u00a6\3\2\2\2%\u00ac\3\2\2\2\'"+
		"\u00b5\3\2\2\2)\u00bd\3\2\2\2+\u00c6\3\2\2\2-\u00cb\3\2\2\2/\u00d2\3\2"+
		"\2\2\61\u00d6\3\2\2\2\63\u00dc\3\2\2\2\65\u00e3\3\2\2\2\67\u00eb\3\2\2"+
		"\29\u00ed\3\2\2\2;\u00ef\3\2\2\2=\u00f2\3\2\2\2?\u00f5\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u0100\3\2\2\2I\u0103\3\2\2\2K"+
		"\u0106\3\2\2\2M\u0108\3\2\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u0121\3\2"+
		"\2\2U\u0124\3\2\2\2W\u013f\3\2\2\2Y\u0141\3\2\2\2[\u014d\3\2\2\2]\u015d"+
		"\3\2\2\2_\u015f\3\2\2\2a\u0170\3\2\2\2c\u0184\3\2\2\2e\u0186\3\2\2\2g"+
		"\u0188\3\2\2\2i\u018a\3\2\2\2k\u018c\3\2\2\2m\u0194\3\2\2\2o\u019f\3\2"+
		"\2\2q\u01ae\3\2\2\2st\7-\2\2t\4\3\2\2\2uv\7/\2\2v\6\3\2\2\2wx\7,\2\2x"+
		"\b\3\2\2\2yz\7\61\2\2z\n\3\2\2\2{|\7`\2\2|\f\3\2\2\2}~\7*\2\2~\16\3\2"+
		"\2\2\177\u0080\7+\2\2\u0080\20\3\2\2\2\u0081\u0082\7.\2\2\u0082\22\3\2"+
		"\2\2\u0083\u0084\7~\2\2\u0084\u0085\7~\2\2\u0085\24\3\2\2\2\u0086\u0087"+
		"\7#\2\2\u0087\26\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\30"+
		"\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090\32\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\34\3\2\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098\u0099\7h\2\2\u0099\u009a\7q\2\2"+
		"\u009a\u009b\7t\2\2\u009b\36\3\2\2\2\u009c\u009d\7e\2\2\u009d\u009e\7"+
		"c\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0 \3\2\2\2\u00a1\u00a2"+
		"\7y\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\"\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2"+
		"\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4&\3\2\2"+
		"\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9"+
		"\7e\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7w\2\2"+
		"\u00c4\u00c5\7g\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2"+
		"\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7h\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7"+
		"t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7p\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db"+
		"\62\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7i\2\2\u00e2\64\3\2\2\2\u00e3"+
		"\u00e4\7d\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7n\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea\66\3\2"+
		"\2\2\u00eb\u00ec\7@\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee:\3\2\2"+
		"\2\u00ef\u00f0\7?\2\2\u00f0\u00f1\7?\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7"+
		"@\2\2\u00f3\u00f4\7?\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9\u00fa\7?\2\2\u00faB\3"+
		"\2\2\2\u00fb\u00fc\7?\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u00ff"+
		"\7-\2\2\u00ffF\3\2\2\2\u0100\u0101\7/\2\2\u0101\u0102\7/\2\2\u0102H\3"+
		"\2\2\2\u0103\u0104\7(\2\2\u0104\u0105\7(\2\2\u0105J\3\2\2\2\u0106\u0107"+
		"\7~\2\2\u0107L\3\2\2\2\u0108\u0109\7=\2\2\u0109N\3\2\2\2\u010a\u010b\7"+
		"]\2\2\u010b\u010c\5k\66\2\u010c\u010d\7_\2\2\u010d\u0119\3\2\2\2\u010e"+
		"\u0110\7]\2\2\u010f\u0111\5g\64\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\7_\2\2\u0115\u0119\3\2\2\2\u0116\u0117\7]\2\2\u0117\u0119\7_\2"+
		"\2\u0118\u010a\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u0116\3\2\2\2\u0119P"+
		"\3\2\2\2\u011a\u011b\7<\2\2\u011bR\3\2\2\2\u011c\u011d\7{\2\2\u011d\u011e"+
		"\7g\2\2\u011e\u0122\7u\2\2\u011f\u0120\7p\2\2\u0120\u0122\7q\2\2\u0121"+
		"\u011c\3\2\2\2\u0121\u011f\3\2\2\2\u0122T\3\2\2\2\u0123\u0125\t\2\2\2"+
		"\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\5W,\2\u0127V\3\2\2\2\u0128\u012a\7\60\2\2\u0129\u012b\5g\64\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0140\3\2\2\2\u012e\u0130\5g\64\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0137\7\60\2\2\u0134\u0136\5g\64\2\u0135\u0134\3\2\2\2\u0136\u0139\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0140\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\5g\64\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0128\3\2\2\2\u013f\u012f\3\2\2\2\u013f\u013b\3\2\2\2\u0140X\3\2\2\2"+
		"\u0141\u0148\7$\2\2\u0142\u0147\5U+\2\u0143\u0147\5e\63\2\u0144\u0147"+
		"\5q9\2\u0145\u0147\5i\65\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7$\2\2\u014cZ\3\2\2\2\u014d\u014e\7}\2\2\u014e\u0156\5c\62\2\u014f"+
		"\u0151\7.\2\2\u0150\u0152\5q9\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0155\5c\62\2\u0154\u014f\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\7\177\2\2\u015a\\\3\2\2\2\u015b\u015e\5_\60"+
		"\2\u015c\u015e\5a\61\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e^"+
		"\3\2\2\2\u015f\u0161\7]\2\2\u0160\u0162\5g\64\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0167\7.\2\2\u0166\u0168\5q9\2\u0167\u0166\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5g\64\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\7_\2\2\u016f`\3\2\2\2\u0170\u0172\7]\2\2\u0171\u0173"+
		"\5g\64\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7.\2\2\u0177\u0179\5q9"+
		"\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c"+
		"\5g\64\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7+\2\2\u0180b\3\2\2\2\u0181"+
		"\u0185\5\65\33\2\u0182\u0185\5U+\2\u0183\u0185\5k\66\2\u0184\u0181\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185d\3\2\2\2\u0186\u0187"+
		"\t\3\2\2\u0187f\3\2\2\2\u0188\u0189\t\4\2\2\u0189h\3\2\2\2\u018a\u018b"+
		"\t\5\2\2\u018bj\3\2\2\2\u018c\u0191\5e\63\2\u018d\u0190\5g\64\2\u018e"+
		"\u0190\5e\63\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192l\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0194\u0195\7\61\2\2\u0195\u0196\7\61\2\2\u0196\u019a\3\2\2\2"+
		"\u0197\u0199\n\6\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019e\b\67\2\2\u019en\3\2\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\7,\2\2"+
		"\u01a1\u01a5\3\2\2\2\u01a2\u01a4\13\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\b8\2\2\u01acp\3\2\2\2\u01ad\u01af\t\7\2\2\u01ae\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\b9\2\2\u01b3r\3\2\2\2\35\2\u0112\u0118\u0121"+
		"\u0124\u012c\u0131\u0137\u013d\u013f\u0146\u0148\u0151\u0156\u015d\u0163"+
		"\u0167\u016c\u0174\u0178\u017d\u0184\u018f\u0191\u019a\u01a5\u01b0\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}