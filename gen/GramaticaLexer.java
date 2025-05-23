// Generated from C:/Users/anamo/IdeaProjects/miCompilador/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NUM=21, IDENTIFICADOR=22, SI=23, CONTRARIO=24, 
		FUNCION=25, RETORNAR=26, VERDADERO=27, FALSO=28, ESPACIOS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "NUM", "IDENTIFICADOR", "SI", "CONTRARIO", 
			"FUNCION", "RETORNAR", "VERDADERO", "FALSO", "ESPACIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'{'", "'}'", "'*'", "'/'", "'+'", 
			"'-'", "'!'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", 
			"','", null, null, "'SI'", "'CONTRARIO'", "'FUNCION'", "'RETORNAR'", 
			"'VERDADERO'", "'FALSO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NUM", "IDENTIFICADOR", 
			"SI", "CONTRARIO", "FUNCION", "RETORNAR", "VERDADERO", "FALSO", "ESPACIOS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\u0004\u0000\u001d\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0004\u0014l\b\u0014\u000b\u0014\f\u0014m\u0001\u0015\u0004\u0015q\b"+
		"\u0015\u000b\u0015\f\u0015r\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0004\u001c\u00a4\b\u001c\u000b\u001c\f\u001c\u00a5"+
		"\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d\u0001\u0000\u0003\u0001\u000009\u0001\u0000az\u0003\u0000"+
		"\t\n\r\r  \u00ab\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000"+
		"\u0000\u0003=\u0001\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007"+
		"B\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000"+
		"\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000"+
		"\u0011L\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000\u0015P"+
		"\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019U\u0001\u0000"+
		"\u0000\u0000\u001bX\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000"+
		"\u001f^\u0001\u0000\u0000\u0000!`\u0001\u0000\u0000\u0000#c\u0001\u0000"+
		"\u0000\u0000%e\u0001\u0000\u0000\u0000\'h\u0001\u0000\u0000\u0000)k\u0001"+
		"\u0000\u0000\u0000+p\u0001\u0000\u0000\u0000-t\u0001\u0000\u0000\u0000"+
		"/w\u0001\u0000\u0000\u00001\u0081\u0001\u0000\u0000\u00003\u0089\u0001"+
		"\u0000\u0000\u00005\u0092\u0001\u0000\u0000\u00007\u009c\u0001\u0000\u0000"+
		"\u00009\u00a3\u0001\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0002\u0001"+
		"\u0000\u0000\u0000=>\u0005:\u0000\u0000>?\u0005=\u0000\u0000?\u0004\u0001"+
		"\u0000\u0000\u0000@A\u0005(\u0000\u0000A\u0006\u0001\u0000\u0000\u0000"+
		"BC\u0005)\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005{\u0000\u0000"+
		"E\n\u0001\u0000\u0000\u0000FG\u0005}\u0000\u0000G\f\u0001\u0000\u0000"+
		"\u0000HI\u0005*\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005/\u0000"+
		"\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005+\u0000\u0000M\u0012\u0001"+
		"\u0000\u0000\u0000NO\u0005-\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PQ\u0005!\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005&\u0000\u0000"+
		"ST\u0005&\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005|\u0000\u0000"+
		"VW\u0005|\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005=\u0000\u0000"+
		"YZ\u0005=\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005!\u0000\u0000"+
		"\\]\u0005=\u0000\u0000]\u001e\u0001\u0000\u0000\u0000^_\u0005>\u0000\u0000"+
		"_ \u0001\u0000\u0000\u0000`a\u0005>\u0000\u0000ab\u0005=\u0000\u0000b"+
		"\"\u0001\u0000\u0000\u0000cd\u0005<\u0000\u0000d$\u0001\u0000\u0000\u0000"+
		"ef\u0005<\u0000\u0000fg\u0005=\u0000\u0000g&\u0001\u0000\u0000\u0000h"+
		"i\u0005,\u0000\u0000i(\u0001\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n*\u0001\u0000\u0000\u0000oq\u0007\u0001"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s,\u0001\u0000\u0000\u0000"+
		"tu\u0005S\u0000\u0000uv\u0005I\u0000\u0000v.\u0001\u0000\u0000\u0000w"+
		"x\u0005C\u0000\u0000xy\u0005O\u0000\u0000yz\u0005N\u0000\u0000z{\u0005"+
		"T\u0000\u0000{|\u0005R\u0000\u0000|}\u0005A\u0000\u0000}~\u0005R\u0000"+
		"\u0000~\u007f\u0005I\u0000\u0000\u007f\u0080\u0005O\u0000\u0000\u0080"+
		"0\u0001\u0000\u0000\u0000\u0081\u0082\u0005F\u0000\u0000\u0082\u0083\u0005"+
		"U\u0000\u0000\u0083\u0084\u0005N\u0000\u0000\u0084\u0085\u0005C\u0000"+
		"\u0000\u0085\u0086\u0005I\u0000\u0000\u0086\u0087\u0005O\u0000\u0000\u0087"+
		"\u0088\u0005N\u0000\u0000\u00882\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"R\u0000\u0000\u008a\u008b\u0005E\u0000\u0000\u008b\u008c\u0005T\u0000"+
		"\u0000\u008c\u008d\u0005O\u0000\u0000\u008d\u008e\u0005R\u0000\u0000\u008e"+
		"\u008f\u0005N\u0000\u0000\u008f\u0090\u0005A\u0000\u0000\u0090\u0091\u0005"+
		"R\u0000\u0000\u00914\u0001\u0000\u0000\u0000\u0092\u0093\u0005V\u0000"+
		"\u0000\u0093\u0094\u0005E\u0000\u0000\u0094\u0095\u0005R\u0000\u0000\u0095"+
		"\u0096\u0005D\u0000\u0000\u0096\u0097\u0005A\u0000\u0000\u0097\u0098\u0005"+
		"D\u0000\u0000\u0098\u0099\u0005E\u0000\u0000\u0099\u009a\u0005R\u0000"+
		"\u0000\u009a\u009b\u0005O\u0000\u0000\u009b6\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005F\u0000\u0000\u009d\u009e\u0005A\u0000\u0000\u009e\u009f\u0005"+
		"L\u0000\u0000\u009f\u00a0\u0005S\u0000\u0000\u00a0\u00a1\u0005O\u0000"+
		"\u0000\u00a18\u0001\u0000\u0000\u0000\u00a2\u00a4\u0007\u0002\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006\u001c\u0000\u0000"+
		"\u00a8:\u0001\u0000\u0000\u0000\u0004\u0000mr\u00a5\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}