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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IF=8, ENDIF=9, 
		FOR=10, ENDFOR=11, CASE=12, WHEN=13, WHILE=14, ENDWHILE=15, ENDCASE=16, 
		CONTINUE=17, ENDF=18, RETURN=19, IMPORT=20, INT=21, FLOAT=22, STRING=23, 
		BOOLEAN=24, MAJOR=25, MINOR=26, EQUALS=27, MAJOR_EQUALS=28, MINOR_EQUALS=29, 
		DIFFERENT=30, ATTRIBUTION=31, INCREMENT=32, DECREMENT=33, THEN=34, UNARY_PLUS=35, 
		UNARY_MINUS=36, LOGICAL_AND=37, LOGICAL_OR=38, SEMICOLON=39, INDEX=40, 
		EACH=41, BOOL=42, NUMBER=43, WORD=44, ARRAY=45, INTERVAL=46, ID=47, S_COMMENTARY=48, 
		M_COMMENTARY=49, WS=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IF", "ENDIF", 
		"FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", 
		"ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", "BOOLEAN", "MAJOR", 
		"MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", 
		"INCREMENT", "DECREMENT", "THEN", "UNARY_PLUS", "UNARY_MINUS", "LOGICAL_AND", 
		"LOGICAL_OR", "SEMICOLON", "INDEX", "EACH", "BOOL", "NUMBER", "NUMBERTYPE", 
		"WORD", "ARRAY", "INTERVAL", "INCLUSIVE_TERMINAL", "NONINCLUSIVE_TERMINAL", 
		"VAR", "LETTER", "DIGIT", "SYMBOL", "ID", "S_COMMENTARY", "M_COMMENTARY", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'^'", "'('", "')'", "','", "'!'", "'if'", "'endif'", 
		"'for'", "'endfor'", "'case'", "'when'", "'while'", "'endwhile'", "'endcase'", 
		"'continue'", "'endf'", "'return'", "'import'", "'int'", "'float'", "'string'", 
		"'boolean'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'++'", 
		"'--'", "'->'", "'+'", "'-'", "'&'", "'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "IF", "ENDIF", "FOR", 
		"ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", 
		"ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", "BOOLEAN", "MAJOR", 
		"MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", 
		"INCREMENT", "DECREMENT", "THEN", "UNARY_PLUS", "UNARY_MINUS", "LOGICAL_AND", 
		"LOGICAL_OR", "SEMICOLON", "INDEX", "EACH", "BOOL", "NUMBER", "WORD", 
		"ARRAY", "INTERVAL", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3)\3)\3)\6)\u0119\n)\r)\16)\u011a\3)\3)\3)\3)\5)\u0121\n)\3*\3"+
		"*\3+\3+\3+\3+\3+\5+\u012a\n+\3,\3,\3-\3-\6-\u0130\n-\r-\16-\u0131\3-\6"+
		"-\u0135\n-\r-\16-\u0136\3-\3-\7-\u013b\n-\f-\16-\u013e\13-\3-\6-\u0141"+
		"\n-\r-\16-\u0142\5-\u0145\n-\3.\3.\3.\3.\3.\7.\u014c\n.\f.\16.\u014f\13"+
		".\3.\3.\3/\3/\3/\3/\5/\u0157\n/\3/\7/\u015a\n/\f/\16/\u015d\13/\3/\3/"+
		"\3\60\3\60\5\60\u0163\n\60\3\61\3\61\6\61\u0167\n\61\r\61\16\61\u0168"+
		"\3\61\3\61\5\61\u016d\n\61\3\61\6\61\u0170\n\61\r\61\16\61\u0171\3\61"+
		"\3\61\3\62\3\62\6\62\u0178\n\62\r\62\16\62\u0179\3\62\3\62\5\62\u017e"+
		"\n\62\3\62\6\62\u0181\n\62\r\62\16\62\u0182\3\62\3\62\3\63\3\63\3\63\5"+
		"\63\u018a\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\7\67\u0195"+
		"\n\67\f\67\16\67\u0198\13\67\38\38\38\38\78\u019e\n8\f8\168\u01a1\138"+
		"\38\38\39\39\39\39\79\u01a9\n9\f9\169\u01ac\139\39\39\39\39\39\3:\6:\u01b4"+
		"\n:\r:\16:\u01b5\3:\3:\3\u01aa\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/"+
		"_\60a\2c\2e\2g\2i\2k\2m\61o\62q\63s\64\3\2\7\4\2C\\c|\3\2\62;\13\2##("+
		"(*\61<@]]__aa}\177\u02c8\u02c8\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01cf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2"+
		"\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23\u0086"+
		"\3\2\2\2\25\u008c\3\2\2\2\27\u0090\3\2\2\2\31\u0097\3\2\2\2\33\u009c\3"+
		"\2\2\2\35\u00a1\3\2\2\2\37\u00a7\3\2\2\2!\u00b0\3\2\2\2#\u00b8\3\2\2\2"+
		"%\u00c1\3\2\2\2\'\u00c6\3\2\2\2)\u00cd\3\2\2\2+\u00d4\3\2\2\2-\u00d8\3"+
		"\2\2\2/\u00de\3\2\2\2\61\u00e5\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2"+
		"\2\67\u00f1\3\2\2\29\u00f4\3\2\2\2;\u00f7\3\2\2\2=\u00fa\3\2\2\2?\u00fd"+
		"\3\2\2\2A\u00ff\3\2\2\2C\u0102\3\2\2\2E\u0105\3\2\2\2G\u0108\3\2\2\2I"+
		"\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0120\3\2"+
		"\2\2S\u0122\3\2\2\2U\u0129\3\2\2\2W\u012b\3\2\2\2Y\u0144\3\2\2\2[\u0146"+
		"\3\2\2\2]\u0152\3\2\2\2_\u0162\3\2\2\2a\u0164\3\2\2\2c\u0175\3\2\2\2e"+
		"\u0189\3\2\2\2g\u018b\3\2\2\2i\u018d\3\2\2\2k\u018f\3\2\2\2m\u0191\3\2"+
		"\2\2o\u0199\3\2\2\2q\u01a4\3\2\2\2s\u01b3\3\2\2\2uv\7,\2\2v\4\3\2\2\2"+
		"wx\7\61\2\2x\6\3\2\2\2yz\7`\2\2z\b\3\2\2\2{|\7*\2\2|\n\3\2\2\2}~\7+\2"+
		"\2~\f\3\2\2\2\177\u0080\7.\2\2\u0080\16\3\2\2\2\u0081\u0082\7#\2\2\u0082"+
		"\20\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085\22\3\2\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089\7f\2\2\u0089\u008a\7k\2\2"+
		"\u008a\u008b\7h\2\2\u008b\24\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7"+
		"q\2\2\u008e\u008f\7t\2\2\u008f\26\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7f\2\2\u0093\u0094\7h\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7t\2\2\u0096\30\3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\32\3\2\2\2\u009c\u009d\7y\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\34\3\2\2\2\u00a1"+
		"\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7n\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7"+
		"p\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad"+
		"\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7e\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\"\3\2\2\2\u00b8"+
		"\u00b9\7e\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2"+
		"\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7f\2\2\u00c4\u00c5\7h\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc(\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7o\2\2\u00cf"+
		"\u00d0\7r\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7v\2\2"+
		"\u00d3*\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2"+
		"\2\u00d7,\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7"+
		"q\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7v\2\2\u00dd.\3\2\2\2\u00de\u00df"+
		"\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u00e4\7i\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7c\2\2\u00eb\u00ec\7p\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7"+
		"@\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\66\3\2\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2\u00f3\7?\2\2\u00f38\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9<\3"+
		"\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7?\2\2\u00fc>\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe@\3\2\2\2\u00ff\u0100\7-\2\2\u0100\u0101\7-\2\2\u0101B\3"+
		"\2\2\2\u0102\u0103\7/\2\2\u0103\u0104\7/\2\2\u0104D\3\2\2\2\u0105\u0106"+
		"\7/\2\2\u0106\u0107\7@\2\2\u0107F\3\2\2\2\u0108\u0109\7-\2\2\u0109H\3"+
		"\2\2\2\u010a\u010b\7/\2\2\u010bJ\3\2\2\2\u010c\u010d\7(\2\2\u010dL\3\2"+
		"\2\2\u010e\u010f\7~\2\2\u010fN\3\2\2\2\u0110\u0111\7=\2\2\u0111P\3\2\2"+
		"\2\u0112\u0113\7]\2\2\u0113\u0114\5m\67\2\u0114\u0115\7_\2\2\u0115\u0121"+
		"\3\2\2\2\u0116\u0118\7]\2\2\u0117\u0119\5i\65\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\7_\2\2\u011d\u0121\3\2\2\2\u011e\u011f\7]\2\2\u011f\u0121"+
		"\7_\2\2\u0120\u0112\3\2\2\2\u0120\u0116\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"R\3\2\2\2\u0122\u0123\7<\2\2\u0123T\3\2\2\2\u0124\u0125\7{\2\2\u0125\u0126"+
		"\7g\2\2\u0126\u012a\7u\2\2\u0127\u0128\7p\2\2\u0128\u012a\7q\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0127\3\2\2\2\u012aV\3\2\2\2\u012b\u012c\5Y-\2\u012c"+
		"X\3\2\2\2\u012d\u012f\7\60\2\2\u012e\u0130\5i\65\2\u012f\u012e\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0145"+
		"\3\2\2\2\u0133\u0135\5i\65\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\7\60"+
		"\2\2\u0139\u013b\5i\65\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0145\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0141\5i\65\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u012d\3\2"+
		"\2\2\u0144\u0134\3\2\2\2\u0144\u0140\3\2\2\2\u0145Z\3\2\2\2\u0146\u014d"+
		"\7$\2\2\u0147\u014c\5W,\2\u0148\u014c\5g\64\2\u0149\u014c\5s:\2\u014a"+
		"\u014c\5k\66\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7$"+
		"\2\2\u0151\\\3\2\2\2\u0152\u0153\7}\2\2\u0153\u015b\5e\63\2\u0154\u0156"+
		"\7.\2\2\u0155\u0157\5s:\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\5e\63\2\u0159\u0154\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\7\177\2\2\u015f^\3\2\2\2\u0160\u0163\5a\61"+
		"\2\u0161\u0163\5c\62\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163`"+
		"\3\2\2\2\u0164\u0166\7]\2\2\u0165\u0167\5i\65\2\u0166\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016c\7.\2\2\u016b\u016d\5s:\2\u016c\u016b\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5i\65\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\7_\2\2\u0174b\3\2\2\2\u0175\u0177\7]\2\2\u0176\u0178"+
		"\5i\65\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\7.\2\2\u017c\u017e\5s:"+
		"\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0181"+
		"\5i\65\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7+\2\2\u0185d\3\2\2\2\u0186"+
		"\u018a\5\61\31\2\u0187\u018a\5W,\2\u0188\u018a\5m\67\2\u0189\u0186\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018af\3\2\2\2\u018b\u018c"+
		"\t\2\2\2\u018ch\3\2\2\2\u018d\u018e\t\3\2\2\u018ej\3\2\2\2\u018f\u0190"+
		"\t\4\2\2\u0190l\3\2\2\2\u0191\u0196\5g\64\2\u0192\u0195\5i\65\2\u0193"+
		"\u0195\5g\64\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197n\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b\7\61\2\2\u019b\u019f\3\2\2\2"+
		"\u019c\u019e\n\5\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a3\b8\2\2\u01a3p\3\2\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a6\7,\2\2\u01a6"+
		"\u01aa\3\2\2\2\u01a7\u01a9\13\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01ae\7,\2\2\u01ae\u01af\7\61\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b1\b9\2\2\u01b1r\3\2\2\2\u01b2\u01b4\t\6\2\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\b:\2\2\u01b8t\3\2\2\2\34\2\u011a\u0120\u0129"+
		"\u0131\u0136\u013c\u0142\u0144\u014b\u014d\u0156\u015b\u0162\u0168\u016c"+
		"\u0171\u0179\u017d\u0182\u0189\u0194\u0196\u019f\u01aa\u01b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}