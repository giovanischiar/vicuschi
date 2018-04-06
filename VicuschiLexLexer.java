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
		T__0=1, T__1=2, T__2=3, LITERAL=4, IF=5, ENDIF=6, FOR=7, ENDFOR=8, CASE=9, 
		WHEN=10, WHILE=11, ENDWHILE=12, ENDCASE=13, CONTINUE=14, ENDF=15, RETURN=16, 
		INT=17, FLOAT=18, STRING=19, BOOLEAN=20, NOT_ID=21, MAJOR=22, MINOR=23, 
		EQUALS=24, MAJOR_EQUALS=25, MINOR_EQUALS=26, DIFFERENT=27, ATTRIBUTION=28, 
		INCREMENT=29, DECREMENT=30, LOGICAL_AND=31, LOGICAL_OR=32, SEMICOLON=33, 
		INDEX=34, EACH=35, BOOL=36, NUMBER=37, WORD=38, ARRAY=39, INTERVAL=40, 
		INTEGER_DECLARATION=41, FLOAT_DECLARATION=42, STRING_DECLARATION=43, BOOLEAN_DECLARATION=44, 
		INTEGER_ARRAY_DECLARATION=45, FLOAT_ARRAY_DECLARATION=46, STRING_ARRAY_DECLARATION=47, 
		BOOLEAN_ARRAY_DECLARATION=48, GENERIC_DECLARATION=49, GENERIC_ARRAY_DECLARATION=50, 
		DECLARATION_ATTRIBUITION=51, ATTRIBUITION=52, ID=53, S_COMMENTARY=54, 
		M_COMMENTARY=55, WS=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LITERAL", "IF", "ENDIF", "FOR", "ENDFOR", "CASE", 
		"WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", "ENDF", "RETURN", 
		"INT", "FLOAT", "STRING", "BOOLEAN", "NOT_ID", "MAJOR", "MINOR", "EQUALS", 
		"MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", "INCREMENT", 
		"DECREMENT", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INDEX", "EACH", 
		"BOOL", "NUMBER", "NUMBERTYPE", "WORD", "ARRAY", "INTERVAL", "INCLUSIVE_TERMINAL", 
		"NONINCLUSIVE_TERMINAL", "VAR", "INTEGER_DECLARATION", "FLOAT_DECLARATION", 
		"STRING_DECLARATION", "BOOLEAN_DECLARATION", "INTEGER_ARRAY_DECLARATION", 
		"FLOAT_ARRAY_DECLARATION", "STRING_ARRAY_DECLARATION", "BOOLEAN_ARRAY_DECLARATION", 
		"GENERIC_DECLARATION", "GENERIC_ARRAY_DECLARATION", "DECLARATION_ATTRIBUITION", 
		"ATTRIBUITION", "LETTER", "DIGIT", "SYMBOL", "ID", "S_COMMENTARY", "M_COMMENTARY", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'('", "')'", null, "'if'", "'endif'", "'for'", "'endfor'", 
		"'case'", "'when'", "'while'", "'endwhile'", "'endcase'", "'continue'", 
		"'endf'", "'return'", "'int'", "'float'", "'string'", "'boolean'", null, 
		"'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'++'", "'--'", "'&&'", 
		"'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "LITERAL", "IF", "ENDIF", "FOR", "ENDFOR", "CASE", 
		"WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", "ENDF", "RETURN", 
		"INT", "FLOAT", "STRING", "BOOLEAN", "NOT_ID", "MAJOR", "MINOR", "EQUALS", 
		"MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", "INCREMENT", 
		"DECREMENT", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INDEX", "EACH", 
		"BOOL", "NUMBER", "WORD", "ARRAY", "INTERVAL", "INTEGER_DECLARATION", 
		"FLOAT_DECLARATION", "STRING_DECLARATION", "BOOLEAN_DECLARATION", "INTEGER_ARRAY_DECLARATION", 
		"FLOAT_ARRAY_DECLARATION", "STRING_ARRAY_DECLARATION", "BOOLEAN_ARRAY_DECLARATION", 
		"GENERIC_DECLARATION", "GENERIC_ARRAY_DECLARATION", "DECLARATION_ATTRIBUITION", 
		"ATTRIBUITION", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u008d"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\6#\u011a\n#\r#\16#\u011b\3#\3#\5#\u0120\n#\3$\3$\3%\3%\3%\3%\3"+
		"%\5%\u0129\n%\3&\5&\u012c\n&\3&\3&\3\'\3\'\6\'\u0132\n\'\r\'\16\'\u0133"+
		"\3\'\6\'\u0137\n\'\r\'\16\'\u0138\3\'\3\'\7\'\u013d\n\'\f\'\16\'\u0140"+
		"\13\'\3\'\6\'\u0143\n\'\r\'\16\'\u0144\5\'\u0147\n\'\3(\3(\3(\3(\3(\7"+
		"(\u014e\n(\f(\16(\u0151\13(\3(\3(\3)\3)\3)\3)\5)\u0159\n)\3)\7)\u015c"+
		"\n)\f)\16)\u015f\13)\3)\3)\3*\3*\5*\u0165\n*\3+\3+\6+\u0169\n+\r+\16+"+
		"\u016a\3+\3+\5+\u016f\n+\3+\6+\u0172\n+\r+\16+\u0173\3+\3+\3,\3,\6,\u017a"+
		"\n,\r,\16,\u017b\3,\3,\5,\u0180\n,\3,\6,\u0183\n,\r,\16,\u0184\3,\3,\3"+
		"-\3-\3-\5-\u018c\n-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\5\66\u01ae\n\66\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\7=\u01c5\n=\f=\16=\u01c8"+
		"\13=\3>\3>\3>\3>\3>\3>\3>\7>\u01d1\n>\f>\16>\u01d4\13>\3>\3>\3>\3>\3?"+
		"\3?\3?\3?\3?\3?\3?\7?\u01e1\n?\f?\16?\u01e4\13?\3?\3?\3?\3?\3?\3@\6@\u01ec"+
		"\n@\r@\16@\u01ed\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O(Q)S*U\2W\2Y\2[+],_-a"+
		".c/e\60g\61i\62k\63m\64o\65q\66s\2u\2w\2y\67{8}9\177:\3\2\b\4\2--//\4"+
		"\2C\\c|\3\2\62;\13\2##((*+-\61<@]]__aa}\177\5\2\13\13\17\17\"\"\5\2\13"+
		"\f\17\17\"\"\2\u0217\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0084"+
		"\3\2\2\2\7\u0086\3\2\2\2\t\u008c\3\2\2\2\13\u008e\3\2\2\2\r\u0091\3\2"+
		"\2\2\17\u0097\3\2\2\2\21\u009b\3\2\2\2\23\u00a2\3\2\2\2\25\u00a7\3\2\2"+
		"\2\27\u00ac\3\2\2\2\31\u00b2\3\2\2\2\33\u00bb\3\2\2\2\35\u00c3\3\2\2\2"+
		"\37\u00cc\3\2\2\2!\u00d1\3\2\2\2#\u00d8\3\2\2\2%\u00dc\3\2\2\2\'\u00e2"+
		"\3\2\2\2)\u00e9\3\2\2\2+\u00f1\3\2\2\2-\u00f4\3\2\2\2/\u00f6\3\2\2\2\61"+
		"\u00f8\3\2\2\2\63\u00fb\3\2\2\2\65\u00fe\3\2\2\2\67\u0101\3\2\2\29\u0104"+
		"\3\2\2\2;\u0106\3\2\2\2=\u0109\3\2\2\2?\u010c\3\2\2\2A\u010f\3\2\2\2C"+
		"\u0111\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I\u0128\3\2\2\2K\u012b\3\2"+
		"\2\2M\u0146\3\2\2\2O\u0148\3\2\2\2Q\u0154\3\2\2\2S\u0164\3\2\2\2U\u0166"+
		"\3\2\2\2W\u0177\3\2\2\2Y\u018b\3\2\2\2[\u018d\3\2\2\2]\u0190\3\2\2\2_"+
		"\u0193\3\2\2\2a\u0196\3\2\2\2c\u0199\3\2\2\2e\u019c\3\2\2\2g\u019f\3\2"+
		"\2\2i\u01a2\3\2\2\2k\u01ad\3\2\2\2m\u01af\3\2\2\2o\u01b3\3\2\2\2q\u01b7"+
		"\3\2\2\2s\u01bb\3\2\2\2u\u01bd\3\2\2\2w\u01bf\3\2\2\2y\u01c1\3\2\2\2{"+
		"\u01c9\3\2\2\2}\u01d9\3\2\2\2\177\u01eb\3\2\2\2\u0081\u0082\7~\2\2\u0082"+
		"\u0083\7~\2\2\u0083\4\3\2\2\2\u0084\u0085\7*\2\2\u0085\6\3\2\2\2\u0086"+
		"\u0087\7+\2\2\u0087\b\3\2\2\2\u0088\u008d\5Q)\2\u0089\u008d\5)\25\2\u008a"+
		"\u008d\5K&\2\u008b\u008d\5\'\24\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\n\3\2\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7h\2\2\u0090\f\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7f\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096"+
		"\16\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e"+
		"\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\22\3\2\2\2\u00a2"+
		"\u00a3\7e\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\24\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7"+
		"g\2\2\u00aa\u00ab\7p\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae"+
		"\7j\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\30\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7f\2\2\u00b5"+
		"\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7n\2\2"+
		"\u00b9\u00ba\7g\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7"+
		"p\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7p\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7g\2\2\u00cb\36\3\2\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7h\2\2"+
		"\u00d0 \3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7v\2"+
		"\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7p\2\2\u00d7\"\3"+
		"\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db"+
		"$\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7v\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7\u00e8\7i\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7q\2"+
		"\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7p\2\2\u00f0*\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3"+
		"\5y=\2\u00f3,\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7"+
		">\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\7?\2\2\u00fa\62"+
		"\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fd\64\3\2\2\2\u00fe"+
		"\u00ff\7>\2\2\u00ff\u0100\7?\2\2\u0100\66\3\2\2\2\u0101\u0102\7#\2\2\u0102"+
		"\u0103\7?\2\2\u01038\3\2\2\2\u0104\u0105\7?\2\2\u0105:\3\2\2\2\u0106\u0107"+
		"\7-\2\2\u0107\u0108\7-\2\2\u0108<\3\2\2\2\u0109\u010a\7/\2\2\u010a\u010b"+
		"\7/\2\2\u010b>\3\2\2\2\u010c\u010d\7(\2\2\u010d\u010e\7(\2\2\u010e@\3"+
		"\2\2\2\u010f\u0110\7~\2\2\u0110B\3\2\2\2\u0111\u0112\7=\2\2\u0112D\3\2"+
		"\2\2\u0113\u0114\7]\2\2\u0114\u0115\5y=\2\u0115\u0116\7_\2\2\u0116\u0120"+
		"\3\2\2\2\u0117\u0119\7]\2\2\u0118\u011a\5u;\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\7_\2\2\u011e\u0120\3\2\2\2\u011f\u0113\3\2\2\2\u011f"+
		"\u0117\3\2\2\2\u0120F\3\2\2\2\u0121\u0122\7<\2\2\u0122H\3\2\2\2\u0123"+
		"\u0124\7{\2\2\u0124\u0125\7g\2\2\u0125\u0129\7u\2\2\u0126\u0127\7p\2\2"+
		"\u0127\u0129\7q\2\2\u0128\u0123\3\2\2\2\u0128\u0126\3\2\2\2\u0129J\3\2"+
		"\2\2\u012a\u012c\t\2\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\5M\'\2\u012eL\3\2\2\2\u012f\u0131\7\60\2\2"+
		"\u0130\u0132\5u;\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0147\3\2\2\2\u0135\u0137\5u;\2\u0136"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013e\7\60\2\2\u013b\u013d\5u;\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0147\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5u;\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u012f\3\2\2\2\u0146\u0136\3\2\2\2\u0146\u0142\3\2"+
		"\2\2\u0147N\3\2\2\2\u0148\u014f\7$\2\2\u0149\u014e\5K&\2\u014a\u014e\5"+
		"s:\2\u014b\u014e\5\177@\2\u014c\u014e\5w<\2\u014d\u0149\3\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0153\7$\2\2\u0153P\3\2\2\2\u0154\u0155\7}\2\2\u0155"+
		"\u015d\5Y-\2\u0156\u0158\7.\2\2\u0157\u0159\5\177@\2\u0158\u0157\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\5Y-\2\u015b\u0156"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\177\2\2\u0161R\3\2\2"+
		"\2\u0162\u0165\5U+\2\u0163\u0165\5W,\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165T\3\2\2\2\u0166\u0168\7]\2\2\u0167\u0169\5u;\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\7.\2\2\u016d\u016f\5\177@\2\u016e\u016d\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5u;\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7_\2\2\u0176V\3\2\2\2\u0177\u0179\7]\2\2\u0178"+
		"\u017a\5u;\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7.\2\2\u017e\u0180"+
		"\5\177@\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2"+
		"\u0181\u0183\5u;\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7+\2\2\u0187"+
		"X\3\2\2\2\u0188\u018c\5)\25\2\u0189\u018c\5K&\2\u018a\u018c\5y=\2\u018b"+
		"\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018cZ\3\2\2\2"+
		"\u018d\u018e\5#\22\2\u018e\u018f\5y=\2\u018f\\\3\2\2\2\u0190\u0191\5%"+
		"\23\2\u0191\u0192\5y=\2\u0192^\3\2\2\2\u0193\u0194\5\'\24\2\u0194\u0195"+
		"\5y=\2\u0195`\3\2\2\2\u0196\u0197\5)\25\2\u0197\u0198\5y=\2\u0198b\3\2"+
		"\2\2\u0199\u019a\5#\22\2\u019a\u019b\5m\67\2\u019bd\3\2\2\2\u019c\u019d"+
		"\5%\23\2\u019d\u019e\5m\67\2\u019ef\3\2\2\2\u019f\u01a0\5\'\24\2\u01a0"+
		"\u01a1\5m\67\2\u01a1h\3\2\2\2\u01a2\u01a3\5)\25\2\u01a3\u01a4\5m\67\2"+
		"\u01a4j\3\2\2\2\u01a5\u01ae\5[.\2\u01a6\u01ae\5]/\2\u01a7\u01ae\5_\60"+
		"\2\u01a8\u01ae\5a\61\2\u01a9\u01ae\5c\62\2\u01aa\u01ae\5e\63\2\u01ab\u01ae"+
		"\5g\64\2\u01ac\u01ae\5i\65\2\u01ad\u01a5\3\2\2\2\u01ad\u01a6\3\2\2\2\u01ad"+
		"\u01a7\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ael\3\2\2\2\u01af\u01b0"+
		"\5y=\2\u01b0\u01b1\7]\2\2\u01b1\u01b2\7_\2\2\u01b2n\3\2\2\2\u01b3\u01b4"+
		"\5k\66\2\u01b4\u01b5\7?\2\2\u01b5\u01b6\5\t\5\2\u01b6p\3\2\2\2\u01b7\u01b8"+
		"\5y=\2\u01b8\u01b9\7?\2\2\u01b9\u01ba\5\t\5\2\u01bar\3\2\2\2\u01bb\u01bc"+
		"\t\3\2\2\u01bct\3\2\2\2\u01bd\u01be\t\4\2\2\u01bev\3\2\2\2\u01bf\u01c0"+
		"\t\5\2\2\u01c0x\3\2\2\2\u01c1\u01c6\5s:\2\u01c2\u01c5\5u;\2\u01c3\u01c5"+
		"\5s:\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7z\3\2\2\2\u01c8\u01c6\3\2\2\2"+
		"\u01c9\u01ca\7\61\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01d2\3\2\2\2\u01cc\u01d1"+
		"\5K&\2\u01cd\u01d1\5s:\2\u01ce\u01d1\t\6\2\2\u01cf\u01d1\5w<\2\u01d0\u01cc"+
		"\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7\f\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\b>\2\2\u01d8|\3\2\2\2\u01d9\u01da\7\61\2\2\u01da\u01db\7,\2\2\u01db"+
		"\u01e2\3\2\2\2\u01dc\u01e1\5K&\2\u01dd\u01e1\5s:\2\u01de\u01e1\5\177@"+
		"\2\u01df\u01e1\5w<\2\u01e0\u01dc\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7,"+
		"\2\2\u01e6\u01e7\7\61\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\b?\2\2\u01e9"+
		"~\3\2\2\2\u01ea\u01ec\t\7\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2"+
		"\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0"+
		"\b@\2\2\u01f0\u0080\3\2\2\2!\2\u008c\u011b\u011f\u0128\u012b\u0133\u0138"+
		"\u013e\u0144\u0146\u014d\u014f\u0158\u015d\u0164\u016a\u016e\u0173\u017b"+
		"\u017f\u0184\u018b\u01ad\u01c4\u01c6\u01d0\u01d2\u01e0\u01e2\u01ed\3\b"+
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