package org.asiql.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class asiqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AND=3, OR=4, IS=5, NOT=6, SINCE=7, UNTIL=8, EQUALS=9, 
		GREATER_THAN=10, LOWER_THAN=11, COMMA=12, QUOTE=13, LBRACKET=14, RBRACKET=15, 
		ID=16, INT=17, DATE=18, DECIMAL=19, STR=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AND", "OR", "IS", "NOT", "SINCE", "UNTIL", "EQUALS", 
			"GREATER_THAN", "LOWER_THAN", "COMMA", "QUOTE", "LBRACKET", "RBRACKET", 
			"ID", "INT", "DATE", "DECIMAL", "STR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'and'", "'or'", "'is'", "'not'", "'since'", "'until'", 
			"'='", "'>'", "'<'", "','", "'\"'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AND", "OR", "IS", "NOT", "SINCE", "UNTIL", "EQUALS", 
			"GREATER_THAN", "LOWER_THAN", "COMMA", "QUOTE", "LBRACKET", "RBRACKET", 
			"ID", "INT", "DATE", "DECIMAL", "STR", "WS"
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


	public asiqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "asiql.g4"; }

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
		"\u0004\u0000\u0015\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000fZ\b\u000f\n\u000f\f\u000f]\t\u000f\u0001\u0010\u0004"+
		"\u0010`\b\u0010\u000b\u0010\f\u0010a\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012p\b\u0012\u000b\u0012"+
		"\f\u0012q\u0001\u0012\u0001\u0012\u0004\u0012v\b\u0012\u000b\u0012\f\u0012"+
		"w\u0001\u0013\u0001\u0013\u0004\u0013|\b\u0013\u000b\u0013\f\u0013}\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u0083\b\u0014\u000b\u0014\f"+
		"\u0014\u0084\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0005\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000--AZaz\u0003\u0000\t"+
		"\n\f\r  \u008d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t"+
		"6\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r=\u0001\u0000"+
		"\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000"+
		"\u0013K\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017O"+
		"\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000"+
		"\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000"+
		"!_\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%o\u0001\u0000\u0000"+
		"\u0000\'y\u0001\u0000\u0000\u0000)\u0082\u0001\u0000\u0000\u0000+,\u0005"+
		"(\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u0004"+
		"\u0001\u0000\u0000\u0000/0\u0005a\u0000\u000001\u0005n\u0000\u000012\u0005"+
		"d\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005o\u0000\u000045\u0005"+
		"r\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005i\u0000\u000078\u0005"+
		"s\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005n\u0000\u0000:;\u0005"+
		"o\u0000\u0000;<\u0005t\u0000\u0000<\f\u0001\u0000\u0000\u0000=>\u0005"+
		"s\u0000\u0000>?\u0005i\u0000\u0000?@\u0005n\u0000\u0000@A\u0005c\u0000"+
		"\u0000AB\u0005e\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005u\u0000"+
		"\u0000DE\u0005n\u0000\u0000EF\u0005t\u0000\u0000FG\u0005i\u0000\u0000"+
		"GH\u0005l\u0000\u0000H\u0010\u0001\u0000\u0000\u0000IJ\u0005=\u0000\u0000"+
		"J\u0012\u0001\u0000\u0000\u0000KL\u0005>\u0000\u0000L\u0014\u0001\u0000"+
		"\u0000\u0000MN\u0005<\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005"+
		",\u0000\u0000P\u0018\u0001\u0000\u0000\u0000QR\u0005\"\u0000\u0000R\u001a"+
		"\u0001\u0000\u0000\u0000ST\u0005[\u0000\u0000T\u001c\u0001\u0000\u0000"+
		"\u0000UV\u0005]\u0000\u0000V\u001e\u0001\u0000\u0000\u0000W[\u0007\u0000"+
		"\u0000\u0000XZ\u0007\u0001\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\ \u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0007\u0002\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0003"+
		"!\u0010\u0000de\u0003!\u0010\u0000ef\u0005/\u0000\u0000fg\u0003!\u0010"+
		"\u0000gh\u0003!\u0010\u0000hi\u0005/\u0000\u0000ij\u0003!\u0010\u0000"+
		"jk\u0003!\u0010\u0000kl\u0003!\u0010\u0000lm\u0003!\u0010\u0000m$\u0001"+
		"\u0000\u0000\u0000np\u0003!\u0010\u0000on\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0005.\u0000\u0000tv\u0003!\u0010\u0000u"+
		"t\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x&\u0001\u0000\u0000\u0000y{\u0003\u0019"+
		"\f\u0000z|\u0007\u0003\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0019\f\u0000\u0080(\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0007\u0004\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0006\u0014\u0000\u0000\u0087*\u0001\u0000"+
		"\u0000\u0000\u0007\u0000[aqw}\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}