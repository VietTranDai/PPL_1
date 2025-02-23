// Generated from main/MiniGo.g4 by ANTLR 4.9.2

#2213951
from lexererr import *

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VAR=2, CONST=3, IF=4, ELSE=5, FOR=6, RETURN=7, FUNCTION=8, TYPE=9, 
		STRUCT=10, INTERFACE=11, STRING_TYPE=12, INT_TYPE=13, FLOAT_TYPE=14, BOOLEAN_TYPE=15, 
		CONTINUE=16, BREAK=17, RANGE=18, TRUE=19, FALSE=20, NIL=21, ADD=22, SUB=23, 
		MUL=24, DIV=25, MOD=26, AND=27, OR=28, EQ=29, NOT_EQ=30, LT=31, GT=32, 
		LTE=33, GTE=34, NEGATION=35, ASSIGN=36, ADDASSIGN=37, SUBASSIGN=38, MULASSIGN=39, 
		DIVASSIGN=40, MODASSIGN=41, LBRACK=42, RBRACK=43, LBRACE=44, RBRACE=45, 
		LPAREN=46, RPAREN=47, COMMA=48, SEMI_COLON=49, COLON=50, DOT=51, UNDERSCORE=52, 
		IDENTIFIER=53, STRINGLIT=54, UNCLOSE_STRING=55, ILLEGAL_ESCAPE=56, INT=57, 
		FLOAT=58, SINGLE_LINE_COMMENT=59, MULTI_LINE_COMMENT=60, NL=61, WS=62, 
		ERROR_CHAR=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "VAR", "CONST", "IF", "ELSE", "FOR", "RETURN", "FUNCTION", "TYPE", 
			"STRUCT", "INTERFACE", "STRING_TYPE", "INT_TYPE", "FLOAT_TYPE", "BOOLEAN_TYPE", 
			"CONTINUE", "BREAK", "RANGE", "TRUE", "FALSE", "NIL", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "AND", "OR", "EQ", "NOT_EQ", "LT", "GT", "LTE", "GTE", 
			"NEGATION", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"MODASSIGN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"COMMA", "SEMI_COLON", "COLON", "DOT", "UNDERSCORE", "IDENTIFIER", "ESC", 
			"VALID_CHAR", "STRINGLIT", "UNCLOSE_STRING", "ILLEGAL_ESCAPE", "DEC_INT", 
			"BIN_INT", "OCT_INT", "HEX_INT", "INT", "FLOAT", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "NL", "WS", "ERROR_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'var'", "'const'", "'if'", "'else'", "'for'", "'return'", 
			"'func'", "'type'", "'struct'", "'interface'", "'string'", "'int'", "'float'", 
			"'boolean'", "'continue'", "'break'", "'range'", "'true'", "'false'", 
			"'nil'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "';'", "':'", 
			"'.'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "VAR", "CONST", "IF", "ELSE", "FOR", "RETURN", "FUNCTION", 
			"TYPE", "STRUCT", "INTERFACE", "STRING_TYPE", "INT_TYPE", "FLOAT_TYPE", 
			"BOOLEAN_TYPE", "CONTINUE", "BREAK", "RANGE", "TRUE", "FALSE", "NIL", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "AND", "OR", "EQ", "NOT_EQ", "LT", 
			"GT", "LTE", "GTE", "NEGATION", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
			"DIVASSIGN", "MODASSIGN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "COMMA", "SEMI_COLON", "COLON", "DOT", "UNDERSCORE", "IDENTIFIER", 
			"STRINGLIT", "UNCLOSE_STRING", "ILLEGAL_ESCAPE", "INT", "FLOAT", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "NL", "WS", "ERROR_CHAR"
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


	def __init__(self, input: InputStream, output: TextIO = sys.stdout):
	    super().__init__(input, output)
	    self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
	    self._actions = None
	    self._predicates = None
	    self.previousTokenType = None  # Khởi tạo biến ghi nhớ token trước

	def emit(self):
	    tk = self.type
	    self.previousTokenType = tk
	    if tk == self.UNCLOSE_STRING:
	        result = super().emit()
	        raise UncloseString(result.text)
	    elif tk == self.ILLEGAL_ESCAPE:
	        result = super().emit()
	        raise IllegalEscape(result.text)
	    elif tk == self.ERROR_CHAR:
	        result = super().emit()
	        raise ErrorToken(result.text)
	    else:
	        return super().emit()


	public MiniGoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 56:
			UNCLOSE_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			ILLEGAL_ESCAPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		case 68:
			ERROR_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void UNCLOSE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 text = self.text;
			    if text.endswith("\r\n"): text = text[:-2];
			    elif text.endswith("\n"): text = text[:-1];
			    raise UncloseString(text); 
			break;
		}
	}
	private void ILLEGAL_ESCAPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 text = self.text;
			    raise IllegalEscape(text); 
			break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 ... 
			break;
		}
	}
	private void ERROR_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 raise ErrorToken(self.text); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u020a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\7\66\u0153\n\66\f\66\16\66\u0156\13\66\3\67\3\67\3\67\38\38\58\u015d"+
		"\n8\39\39\79\u0161\n9\f9\169\u0164\139\39\39\3:\3:\7:\u016a\n:\f:\16:"+
		"\u016d\13:\3:\3:\5:\u0171\n:\3:\5:\u0174\n:\3:\3:\3;\3;\7;\u017a\n;\f"+
		";\16;\u017d\13;\3;\3;\3;\3;\3<\3<\7<\u0185\n<\f<\16<\u0188\13<\3<\5<\u018b"+
		"\n<\3=\3=\3=\3=\6=\u0191\n=\r=\16=\u0192\3=\3=\3=\3=\6=\u0199\n=\r=\16"+
		"=\u019a\5=\u019d\n=\3>\3>\3>\3>\6>\u01a3\n>\r>\16>\u01a4\3>\3>\3>\3>\6"+
		">\u01ab\n>\r>\16>\u01ac\5>\u01af\n>\3?\3?\3?\3?\6?\u01b5\n?\r?\16?\u01b6"+
		"\3?\3?\3?\3?\6?\u01bd\n?\r?\16?\u01be\5?\u01c1\n?\3@\3@\3@\3@\5@\u01c7"+
		"\n@\3A\6A\u01ca\nA\rA\16A\u01cb\3A\3A\7A\u01d0\nA\fA\16A\u01d3\13A\3A"+
		"\3A\5A\u01d7\nA\3A\6A\u01da\nA\rA\16A\u01db\5A\u01de\nA\3B\3B\3B\3B\7"+
		"B\u01e4\nB\fB\16B\u01e7\13B\3B\3B\3C\3C\3C\3C\3C\7C\u01f0\nC\fC\16C\u01f3"+
		"\13C\3C\3C\3C\3C\3C\3D\5D\u01fb\nD\3D\3D\3D\3D\3E\6E\u0202\nE\rE\16E\u0203"+
		"\3E\3E\3F\3F\3F\3\u01f1\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m\2o\2q8s9u:w\2y\2{\2}\2\177;\u0081<\u0083=\u0085"+
		">\u0087?\u0089@\u008bA\3\2\17\5\2C\\aac|\6\2\62;C\\aac|\7\2$$^^ppttvv"+
		"\6\2\f\f\17\17$$^^\3\2\63;\3\2\62;\3\2\62\63\3\2\629\5\2\62;CHch\4\2G"+
		"Ggg\4\2--//\4\2\f\f\16\17\5\2\13\13\16\17\"\"\2\u0222\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0092"+
		"\3\2\2\2\7\u0096\3\2\2\2\t\u009c\3\2\2\2\13\u009f\3\2\2\2\r\u00a4\3\2"+
		"\2\2\17\u00a8\3\2\2\2\21\u00af\3\2\2\2\23\u00b4\3\2\2\2\25\u00b9\3\2\2"+
		"\2\27\u00c0\3\2\2\2\31\u00ca\3\2\2\2\33\u00d1\3\2\2\2\35\u00d5\3\2\2\2"+
		"\37\u00db\3\2\2\2!\u00e3\3\2\2\2#\u00ec\3\2\2\2%\u00f2\3\2\2\2\'\u00f8"+
		"\3\2\2\2)\u00fd\3\2\2\2+\u0103\3\2\2\2-\u0107\3\2\2\2/\u0109\3\2\2\2\61"+
		"\u010b\3\2\2\2\63\u010d\3\2\2\2\65\u010f\3\2\2\2\67\u0111\3\2\2\29\u0114"+
		"\3\2\2\2;\u0117\3\2\2\2=\u011a\3\2\2\2?\u011d\3\2\2\2A\u011f\3\2\2\2C"+
		"\u0121\3\2\2\2E\u0124\3\2\2\2G\u0127\3\2\2\2I\u0129\3\2\2\2K\u012b\3\2"+
		"\2\2M\u012e\3\2\2\2O\u0131\3\2\2\2Q\u0134\3\2\2\2S\u0137\3\2\2\2U\u013a"+
		"\3\2\2\2W\u013c\3\2\2\2Y\u013e\3\2\2\2[\u0140\3\2\2\2]\u0142\3\2\2\2_"+
		"\u0144\3\2\2\2a\u0146\3\2\2\2c\u0148\3\2\2\2e\u014a\3\2\2\2g\u014c\3\2"+
		"\2\2i\u014e\3\2\2\2k\u0150\3\2\2\2m\u0157\3\2\2\2o\u015c\3\2\2\2q\u015e"+
		"\3\2\2\2s\u0167\3\2\2\2u\u0177\3\2\2\2w\u018a\3\2\2\2y\u019c\3\2\2\2{"+
		"\u01ae\3\2\2\2}\u01c0\3\2\2\2\177\u01c6\3\2\2\2\u0081\u01c9\3\2\2\2\u0083"+
		"\u01df\3\2\2\2\u0085\u01ea\3\2\2\2\u0087\u01fa\3\2\2\2\u0089\u0201\3\2"+
		"\2\2\u008b\u0207\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091\4\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7t\2\2\u0095\6\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7p\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b"+
		"\b\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e\n\3\2\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\f\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t"+
		"\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\20\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\22\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7{\2\2\u00b6"+
		"\u00b7\7r\2\2\u00b7\u00b8\7g\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7e\2\2"+
		"\u00be\u00bf\7v\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7"+
		"p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\30\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7i\2\2\u00d0\32\3\2\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\34\3\2\2\2\u00d5"+
		"\u00d6\7h\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7c\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\36\3\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7"+
		"q\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7p\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7g\2\2\u00eb\"\3\2\2\2\u00ec"+
		"\u00ed\7d\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2"+
		"\u00f0\u00f1\7m\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7c\2"+
		"\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7i\2\2\u00f6\u00f7\7g\2\2\u00f7&\3\2"+
		"\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100"+
		"\7n\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u0102*\3\2\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7k\2\2\u0105\u0106\7n\2\2\u0106,\3\2\2\2\u0107\u0108"+
		"\7-\2\2\u0108.\3\2\2\2\u0109\u010a\7/\2\2\u010a\60\3\2\2\2\u010b\u010c"+
		"\7,\2\2\u010c\62\3\2\2\2\u010d\u010e\7\61\2\2\u010e\64\3\2\2\2\u010f\u0110"+
		"\7\'\2\2\u0110\66\3\2\2\2\u0111\u0112\7(\2\2\u0112\u0113\7(\2\2\u0113"+
		"8\3\2\2\2\u0114\u0115\7~\2\2\u0115\u0116\7~\2\2\u0116:\3\2\2\2\u0117\u0118"+
		"\7?\2\2\u0118\u0119\7?\2\2\u0119<\3\2\2\2\u011a\u011b\7#\2\2\u011b\u011c"+
		"\7?\2\2\u011c>\3\2\2\2\u011d\u011e\7>\2\2\u011e@\3\2\2\2\u011f\u0120\7"+
		"@\2\2\u0120B\3\2\2\2\u0121\u0122\7>\2\2\u0122\u0123\7?\2\2\u0123D\3\2"+
		"\2\2\u0124\u0125\7@\2\2\u0125\u0126\7?\2\2\u0126F\3\2\2\2\u0127\u0128"+
		"\7#\2\2\u0128H\3\2\2\2\u0129\u012a\7?\2\2\u012aJ\3\2\2\2\u012b\u012c\7"+
		"-\2\2\u012c\u012d\7?\2\2\u012dL\3\2\2\2\u012e\u012f\7/\2\2\u012f\u0130"+
		"\7?\2\2\u0130N\3\2\2\2\u0131\u0132\7,\2\2\u0132\u0133\7?\2\2\u0133P\3"+
		"\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7?\2\2\u0136R\3\2\2\2\u0137\u0138"+
		"\7\'\2\2\u0138\u0139\7?\2\2\u0139T\3\2\2\2\u013a\u013b\7]\2\2\u013bV\3"+
		"\2\2\2\u013c\u013d\7_\2\2\u013dX\3\2\2\2\u013e\u013f\7}\2\2\u013fZ\3\2"+
		"\2\2\u0140\u0141\7\177\2\2\u0141\\\3\2\2\2\u0142\u0143\7*\2\2\u0143^\3"+
		"\2\2\2\u0144\u0145\7+\2\2\u0145`\3\2\2\2\u0146\u0147\7.\2\2\u0147b\3\2"+
		"\2\2\u0148\u0149\7=\2\2\u0149d\3\2\2\2\u014a\u014b\7<\2\2\u014bf\3\2\2"+
		"\2\u014c\u014d\7\60\2\2\u014dh\3\2\2\2\u014e\u014f\7a\2\2\u014fj\3\2\2"+
		"\2\u0150\u0154\t\2\2\2\u0151\u0153\t\3\2\2\u0152\u0151\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155l\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7^\2\2\u0158\u0159\t\4\2\2\u0159n\3\2\2\2\u015a"+
		"\u015d\n\5\2\2\u015b\u015d\5m\67\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2"+
		"\2\2\u015dp\3\2\2\2\u015e\u0162\7$\2\2\u015f\u0161\5o8\2\u0160\u015f\3"+
		"\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7$\2\2\u0166r\3\2\2\2\u0167"+
		"\u016b\7$\2\2\u0168\u016a\5o8\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2"+
		"\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0173\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016e\u0174\7\2\2\3\u016f\u0171\7\17\2\2\u0170\u016f\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7\f\2\2\u0173\u016e"+
		"\3\2\2\2\u0173\u0170\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b:\2\2\u0176"+
		"t\3\2\2\2\u0177\u017b\7$\2\2\u0178\u017a\5o8\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7^\2\2\u017f\u0180\n\4\2\2\u0180"+
		"\u0181\b;\3\2\u0181v\3\2\2\2\u0182\u0186\t\6\2\2\u0183\u0185\t\7\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u018b\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\7\62\2\2\u018a"+
		"\u0182\3\2\2\2\u018a\u0189\3\2\2\2\u018bx\3\2\2\2\u018c\u018d\7\62\2\2"+
		"\u018d\u018e\7d\2\2\u018e\u0190\3\2\2\2\u018f\u0191\t\b\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u019d\3\2\2\2\u0194\u0195\7\62\2\2\u0195\u0196\7D\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0199\t\b\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u018c\3\2"+
		"\2\2\u019c\u0194\3\2\2\2\u019dz\3\2\2\2\u019e\u019f\7\62\2\2\u019f\u01a0"+
		"\7q\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\t\t\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01af\3\2"+
		"\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8\7Q\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01ab\t\t\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u019e\3\2\2\2\u01ae"+
		"\u01a6\3\2\2\2\u01af|\3\2\2\2\u01b0\u01b1\7\62\2\2\u01b1\u01b2\7z\2\2"+
		"\u01b2\u01b4\3\2\2\2\u01b3\u01b5\t\n\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01c1\3\2\2\2\u01b8"+
		"\u01b9\7\62\2\2\u01b9\u01ba\7Z\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\t\n"+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01b0\3\2\2\2\u01c0\u01b8\3\2"+
		"\2\2\u01c1~\3\2\2\2\u01c2\u01c7\5y=\2\u01c3\u01c7\5{>\2\u01c4\u01c7\5"+
		"}?\2\u01c5\u01c7\5w<\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u0080\3\2\2\2\u01c8\u01ca\t\7\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1\7\60\2\2\u01ce\u01d0\t\7\2\2\u01cf"+
		"\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01dd\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\t\13\2\2\u01d5"+
		"\u01d7\t\f\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01da\t\7\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d4\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u0082\3\2\2\2\u01df\u01e0\7\61\2\2\u01e0"+
		"\u01e1\7\61\2\2\u01e1\u01e5\3\2\2\2\u01e2\u01e4\n\r\2\2\u01e3\u01e2\3"+
		"\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\bB\4\2\u01e9\u0084\3\2"+
		"\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\7,\2\2\u01ec\u01f1\3\2\2\2\u01ed"+
		"\u01f0\5\u0085C\2\u01ee\u01f0\13\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7,\2\2\u01f5\u01f6\7\61"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\bC\4\2\u01f8\u0086\3\2\2\2\u01f9"+
		"\u01fb\7\17\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3"+
		"\2\2\2\u01fc\u01fd\7\f\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bD\5\2\u01ff"+
		"\u0088\3\2\2\2\u0200\u0202\t\16\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\bE\4\2\u0206\u008a\3\2\2\2\u0207\u0208\13\2\2\2\u0208\u0209\bF"+
		"\6\2\u0209\u008c\3\2\2\2 \2\u0154\u015c\u0162\u016b\u0170\u0173\u017b"+
		"\u0186\u018a\u0192\u019a\u019c\u01a4\u01ac\u01ae\u01b6\u01be\u01c0\u01c6"+
		"\u01cb\u01d1\u01d6\u01db\u01dd\u01e5\u01ef\u01f1\u01fa\u0203\7\3:\2\3"+
		";\3\b\2\2\3D\4\3F\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}