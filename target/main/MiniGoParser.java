// Generated from main/MiniGo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoParser extends Parser {
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
		ERROR_CHAR=63, ASSIGN_COLON=64;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_mainFuncDecl = 2, RULE_vardecl = 3, 
		RULE_constdecl = 4, RULE_typedecl = 5, RULE_funcdecl = 6, RULE_receiver = 7, 
		RULE_funcdecl_type_opt = 8, RULE_typeDef = 9, RULE_basictype = 10, RULE_structType = 11, 
		RULE_fieldList = 12, RULE_field = 13, RULE_interfaceType = 14, RULE_methodList = 15, 
		RULE_method = 16, RULE_method_param_opt = 17, RULE_method_type_opt = 18, 
		RULE_arrayType = 19, RULE_dim = 20, RULE_intExpr = 21, RULE_intTerm = 22, 
		RULE_intFactor = 23, RULE_paramList = 24, RULE_param = 25, RULE_block = 26, 
		RULE_stmt_list = 27, RULE_stmt = 28, RULE_assignment = 29, RULE_assign_op = 30, 
		RULE_ifStmt = 31, RULE_ifStmt_else_opt = 32, RULE_forStmt = 33, RULE_forClauseComplex = 34, 
		RULE_forClause_init = 35, RULE_forClause_cond = 36, RULE_forClause_update = 37, 
		RULE_forClauseSimple = 38, RULE_forRangeStmt = 39, RULE_forRange_tail = 40, 
		RULE_break_stmt = 41, RULE_continue_stmt = 42, RULE_return_stmt = 43, 
		RULE_return_expr = 44, RULE_expr_stmt = 45, RULE_expr = 46, RULE_logicalOrExpr = 47, 
		RULE_logicalAndExpr = 48, RULE_equalityExpr = 49, RULE_relationalExpr = 50, 
		RULE_additiveExpr = 51, RULE_multiplicativeExpr = 52, RULE_unaryExpr = 53, 
		RULE_primaryExpr = 54, RULE_arguments = 55, RULE_argumentList = 56, RULE_lhs = 57, 
		RULE_lhs_tail = 58, RULE_lhs_tail_item = 59, RULE_literal = 60, RULE_compositeLiteral = 61, 
		RULE_arrayCompositeLiteral = 62, RULE_arrayLiteralBody = 63, RULE_arrayLiteralElementList = 64, 
		RULE_arrayLiteralElement = 65, RULE_nestedNonArrayCompositeLiteral = 66, 
		RULE_nonArrayTypeDef = 67, RULE_structCompositeLiteral = 68, RULE_structLiteralBody = 69, 
		RULE_structLiteralElementList = 70, RULE_structLiteralElement = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "mainFuncDecl", "vardecl", "constdecl", "typedecl", 
			"funcdecl", "receiver", "funcdecl_type_opt", "typeDef", "basictype", 
			"structType", "fieldList", "field", "interfaceType", "methodList", "method", 
			"method_param_opt", "method_type_opt", "arrayType", "dim", "intExpr", 
			"intTerm", "intFactor", "paramList", "param", "block", "stmt_list", "stmt", 
			"assignment", "assign_op", "ifStmt", "ifStmt_else_opt", "forStmt", "forClauseComplex", 
			"forClause_init", "forClause_cond", "forClause_update", "forClauseSimple", 
			"forRangeStmt", "forRange_tail", "break_stmt", "continue_stmt", "return_stmt", 
			"return_expr", "expr_stmt", "expr", "logicalOrExpr", "logicalAndExpr", 
			"equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", 
			"unaryExpr", "primaryExpr", "arguments", "argumentList", "lhs", "lhs_tail", 
			"lhs_tail_item", "literal", "compositeLiteral", "arrayCompositeLiteral", 
			"arrayLiteralBody", "arrayLiteralElementList", "arrayLiteralElement", 
			"nestedNonArrayCompositeLiteral", "nonArrayTypeDef", "structCompositeLiteral", 
			"structLiteralBody", "structLiteralElementList", "structLiteralElement"
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
			"MULTI_LINE_COMMENT", "NL", "WS", "ERROR_CHAR", "ASSIGN_COLON"
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
	public String getGrammarFileName() { return "MiniGo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniGoParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				decl();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNCTION) | (1L << TYPE))) != 0) );
			setState(149);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public MainFuncDeclContext mainFuncDecl() {
			return getRuleContext(MainFuncDeclContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ConstdeclContext constdecl() {
			return getRuleContext(ConstdeclContext.class,0);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public FuncdeclContext funcdecl() {
			return getRuleContext(FuncdeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				mainFuncDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				vardecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				constdecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				typedecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				funcdecl();
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

	public static class MainFuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MiniGoParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public MainFuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFuncDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMainFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFuncDeclContext mainFuncDecl() throws RecognitionException {
		MainFuncDeclContext _localctx = new MainFuncDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFuncDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FUNCTION);
			setState(159);
			match(T__0);
			setState(160);
			match(LPAREN);
			setState(161);
			match(RPAREN);
			setState(162);
			block();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(163);
				match(SEMI_COLON);
				}
			}

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

	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(VAR);
			setState(167);
			match(IDENTIFIER);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INTERFACE:
			case STRING_TYPE:
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
			case LBRACK:
			case IDENTIFIER:
				{
				setState(168);
				typeDef();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(169);
					match(ASSIGN);
					setState(170);
					expr();
					}
				}

				}
				break;
			case ASSIGN:
				{
				setState(173);
				match(ASSIGN);
				setState(174);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			match(SEMI_COLON);
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

	public static class ConstdeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MiniGoParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitConstdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CONST);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(ASSIGN);
			setState(182);
			expr();
			setState(183);
			match(SEMI_COLON);
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

	public static class TypedeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MiniGoParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public TypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitTypedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclContext typedecl() throws RecognitionException {
		TypedeclContext _localctx = new TypedeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(TYPE);
			setState(186);
			match(IDENTIFIER);
			setState(187);
			typeDef();
			setState(188);
			match(SEMI_COLON);
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

	public static class FuncdeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MiniGoParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(MiniGoParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MiniGoParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MiniGoParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MiniGoParser.RPAREN, i);
		}
		public Funcdecl_type_optContext funcdecl_type_opt() {
			return getRuleContext(Funcdecl_type_optContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitFuncdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FUNCTION);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(191);
				match(LPAREN);
				setState(192);
				receiver();
				setState(193);
				match(RPAREN);
				}
			}

			setState(197);
			match(IDENTIFIER);
			setState(198);
			match(LPAREN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(199);
				paramList();
				}
			}

			setState(202);
			match(RPAREN);
			setState(203);
			funcdecl_type_opt();
			setState(204);
			block();
			setState(205);
			match(SEMI_COLON);
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

	public static class ReceiverContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniGoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniGoParser.IDENTIFIER, i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IDENTIFIER);
			setState(208);
			match(IDENTIFIER);
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

	public static class Funcdecl_type_optContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public Funcdecl_type_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl_type_opt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitFuncdecl_type_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcdecl_type_optContext funcdecl_type_opt() throws RecognitionException {
		Funcdecl_type_optContext _localctx = new Funcdecl_type_optContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcdecl_type_opt);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INTERFACE:
			case STRING_TYPE:
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
			case LBRACK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				typeDef();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeDefContext extends ParserRuleContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDef);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				basictype();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				structType();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				interfaceType();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				arrayType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(IDENTIFIER);
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

	public static class BasictypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(MiniGoParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MiniGoParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MiniGoParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(MiniGoParser.BOOLEAN_TYPE, 0); }
		public BasictypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basictype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitBasictype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasictypeContext basictype() throws RecognitionException {
		BasictypeContext _localctx = new BasictypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basictype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TYPE) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(MiniGoParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public List<FieldListContext> fieldList() {
			return getRuleContexts(FieldListContext.class);
		}
		public FieldListContext fieldList(int i) {
			return getRuleContext(FieldListContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(STRUCT);
			setState(224);
			match(LBRACE);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				fieldList();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(230);
			match(RBRACE);
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

	public static class FieldListContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MiniGoParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MiniGoParser.SEMI_COLON, i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			field();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(SEMI_COLON);
					setState(234);
					field();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(240);
			match(SEMI_COLON);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(IDENTIFIER);
			setState(243);
			typeDef();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(MiniGoParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public List<MethodListContext> methodList() {
			return getRuleContexts(MethodListContext.class);
		}
		public MethodListContext methodList(int i) {
			return getRuleContext(MethodListContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(INTERFACE);
			setState(246);
			match(LBRACE);
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				methodList();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(252);
			match(RBRACE);
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

	public static class MethodListContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MiniGoParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MiniGoParser.SEMI_COLON, i);
		}
		public MethodListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMethodList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodListContext methodList() throws RecognitionException {
		MethodListContext _localctx = new MethodListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			method();
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(SEMI_COLON);
					setState(256);
					method();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(262);
			match(SEMI_COLON);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public Method_param_optContext method_param_opt() {
			return getRuleContext(Method_param_optContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public Method_type_optContext method_type_opt() {
			return getRuleContext(Method_type_optContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IDENTIFIER);
			setState(265);
			match(LPAREN);
			setState(266);
			method_param_opt();
			setState(267);
			match(RPAREN);
			setState(268);
			method_type_opt();
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

	public static class Method_param_optContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public Method_param_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_param_opt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMethod_param_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_param_optContext method_param_opt() throws RecognitionException {
		Method_param_optContext _localctx = new Method_param_optContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_method_param_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(270);
				paramList();
				}
			}

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

	public static class Method_type_optContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public Method_type_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type_opt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMethod_type_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_type_optContext method_type_opt() throws RecognitionException {
		Method_type_optContext _localctx = new Method_type_optContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_type_opt);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INTERFACE:
			case STRING_TYPE:
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
			case LBRACK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				typeDef();
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public List<DimContext> dim() {
			return getRuleContexts(DimContext.class);
		}
		public DimContext dim(int i) {
			return getRuleContext(DimContext.class,i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(277);
					dim();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(282);
			typeDef();
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

	public static class DimContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(MiniGoParser.LBRACK, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(MiniGoParser.RBRACK, 0); }
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LBRACK);
			setState(285);
			intExpr(0);
			setState(286);
			match(RBRACK);
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

	public static class IntExprContext extends ParserRuleContext {
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
	 
		public IntExprContext() { }
		public void copyFrom(IntExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToIDContext extends IntExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public ToIDContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitToID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends IntExprContext {
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(MiniGoParser.SUB, 0); }
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public SubExprContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends IntExprContext {
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MiniGoParser.ADD, 0); }
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public AddExprContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToIntTermContext extends IntExprContext {
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public ToIntTermContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitToIntTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_intExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case INT:
				{
				_localctx = new ToIntTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(289);
				intTerm(0);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new ToIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new IntExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(293);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(294);
						match(ADD);
						setState(295);
						intTerm(0);
						}
						break;
					case 2:
						{
						_localctx = new SubExprContext(new IntExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(296);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(297);
						match(SUB);
						setState(298);
						intTerm(0);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntTermContext extends ParserRuleContext {
		public IntTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intTerm; }
	 
		public IntTermContext() { }
		public void copyFrom(IntTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToIntFactorContext extends IntTermContext {
		public IntFactorContext intFactor() {
			return getRuleContext(IntFactorContext.class,0);
		}
		public ToIntFactorContext(IntTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitToIntFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends IntTermContext {
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MiniGoParser.MUL, 0); }
		public IntFactorContext intFactor() {
			return getRuleContext(IntFactorContext.class,0);
		}
		public MulExprContext(IntTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends IntTermContext {
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(MiniGoParser.DIV, 0); }
		public IntFactorContext intFactor() {
			return getRuleContext(IntFactorContext.class,0);
		}
		public DivExprContext(IntTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExprContext extends IntTermContext {
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public TerminalNode MOD() { return getToken(MiniGoParser.MOD, 0); }
		public IntFactorContext intFactor() {
			return getRuleContext(IntFactorContext.class,0);
		}
		public ModExprContext(IntTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntTermContext intTerm() throws RecognitionException {
		return intTerm(0);
	}

	private IntTermContext intTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntTermContext _localctx = new IntTermContext(_ctx, _parentState);
		IntTermContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_intTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToIntFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(305);
			intFactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new IntTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intTerm);
						setState(307);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(308);
						match(MUL);
						setState(309);
						intFactor();
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new IntTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intTerm);
						setState(310);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(311);
						match(DIV);
						setState(312);
						intFactor();
						}
						break;
					case 3:
						{
						_localctx = new ModExprContext(new IntTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intTerm);
						setState(313);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(314);
						match(MOD);
						setState(315);
						intFactor();
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntFactorContext extends ParserRuleContext {
		public IntFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intFactor; }
	 
		public IntFactorContext() { }
		public void copyFrom(IntFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedContext extends IntFactorContext {
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public ParenthesizedContext(IntFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends IntFactorContext {
		public TerminalNode INT() { return getToken(MiniGoParser.INT, 0); }
		public IntLiteralContext(IntFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntFactorContext intFactor() throws RecognitionException {
		IntFactorContext _localctx = new IntFactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intFactor);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(INT);
				}
				break;
			case LPAREN:
				_localctx = new ParenthesizedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(LPAREN);
				setState(323);
				intExpr(0);
				setState(324);
				match(RPAREN);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			param();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				param();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParamContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniGoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniGoParser.IDENTIFIER, i);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(IDENTIFIER);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337);
				match(COMMA);
				setState(338);
				match(IDENTIFIER);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			typeDef();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LBRACE);
			setState(347);
			stmt_list();
			setState(348);
			match(RBRACE);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << STRUCT) | (1L << INTERFACE) | (1L << CONTINUE) | (1L << BREAK) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << SUB) | (1L << NEGATION) | (1L << LBRACK) | (1L << LBRACE) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRINGLIT) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(350);
				stmt();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ConstdeclContext constdecl() {
			return getRuleContext(ConstdeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stmt);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				block();
				setState(357);
				match(SEMI_COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				vardecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				constdecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				assignment();
				setState(362);
				match(SEMI_COLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				forStmt();
				setState(366);
				match(SEMI_COLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				break_stmt();
				setState(369);
				match(SEMI_COLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				continue_stmt();
				setState(372);
				match(SEMI_COLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
				return_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(375);
				expr_stmt();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			lhs();
			setState(379);
			assign_op();
			setState(380);
			expr();
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(MiniGoParser.ASSIGN_COLON, 0); }
		public TerminalNode ADDASSIGN() { return getToken(MiniGoParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(MiniGoParser.SUBASSIGN, 0); }
		public TerminalNode MULASSIGN() { return getToken(MiniGoParser.MULASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(MiniGoParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(MiniGoParser.MODASSIGN, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ASSIGN - 36)) | (1L << (ADDASSIGN - 36)) | (1L << (SUBASSIGN - 36)) | (1L << (MULASSIGN - 36)) | (1L << (DIVASSIGN - 36)) | (1L << (MODASSIGN - 36)) | (1L << (ASSIGN_COLON - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public IfStmt_else_optContext ifStmt_else_opt() {
			return getRuleContext(IfStmt_else_optContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IF);
			setState(385);
			match(LPAREN);
			setState(386);
			expr();
			setState(387);
			match(RPAREN);
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(388);
				block();
				}
				break;
			case 2:
				{
				setState(389);
				stmt();
				}
				break;
			}
			setState(392);
			ifStmt_else_opt();
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

	public static class IfStmt_else_optContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public IfStmt_else_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt_else_opt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitIfStmt_else_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmt_else_optContext ifStmt_else_opt() throws RecognitionException {
		IfStmt_else_optContext _localctx = new IfStmt_else_optContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStmt_else_opt);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(ELSE);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(395);
					ifStmt();
					}
					break;
				case 2:
					{
					setState(396);
					stmt();
					}
					break;
				}
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(SEMI_COLON);
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

	public static class ForStmtContext extends ParserRuleContext {
		public ForClauseComplexContext forClauseComplex() {
			return getRuleContext(ForClauseComplexContext.class,0);
		}
		public ForClauseSimpleContext forClauseSimple() {
			return getRuleContext(ForClauseSimpleContext.class,0);
		}
		public ForRangeStmtContext forRangeStmt() {
			return getRuleContext(ForRangeStmtContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forStmt);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				forClauseComplex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				forClauseSimple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				forRangeStmt();
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

	public static class ForClauseComplexContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public ForClause_initContext forClause_init() {
			return getRuleContext(ForClause_initContext.class,0);
		}
		public ForClause_condContext forClause_cond() {
			return getRuleContext(ForClause_condContext.class,0);
		}
		public ForClause_updateContext forClause_update() {
			return getRuleContext(ForClause_updateContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClauseComplex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForClauseComplex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseComplexContext forClauseComplex() throws RecognitionException {
		ForClauseComplexContext _localctx = new ForClauseComplexContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forClauseComplex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(FOR);
			setState(408);
			forClause_init();
			setState(409);
			forClause_cond();
			setState(410);
			forClause_update();
			setState(411);
			block();
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

	public static class ForClause_initContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForClause_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForClause_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClause_initContext forClause_init() throws RecognitionException {
		ForClause_initContext _localctx = new ForClause_initContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forClause_init);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				assignment();
				setState(415);
				match(SEMI_COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				expr();
				setState(418);
				match(SEMI_COLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				match(SEMI_COLON);
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

	public static class ForClause_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public ForClause_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForClause_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClause_condContext forClause_cond() throws RecognitionException {
		ForClause_condContext _localctx = new ForClause_condContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forClause_cond);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INTERFACE:
			case TRUE:
			case FALSE:
			case NIL:
			case SUB:
			case NEGATION:
			case LBRACK:
			case LPAREN:
			case IDENTIFIER:
			case STRINGLIT:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				expr();
				setState(424);
				match(SEMI_COLON);
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(SEMI_COLON);
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

	public static class ForClause_updateContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForClause_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause_update; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForClause_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClause_updateContext forClause_update() throws RecognitionException {
		ForClause_updateContext _localctx = new ForClause_updateContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forClause_update);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				expr();
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

	public static class ForClauseSimpleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClauseSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForClauseSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseSimpleContext forClauseSimple() throws RecognitionException {
		ForClauseSimpleContext _localctx = new ForClauseSimpleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forClauseSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(FOR);
			setState(434);
			expr();
			setState(435);
			block();
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

	public static class ForRangeStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public ForRange_tailContext forRange_tail() {
			return getRuleContext(ForRange_tailContext.class,0);
		}
		public TerminalNode ASSIGN_COLON() { return getToken(MiniGoParser.ASSIGN_COLON, 0); }
		public TerminalNode RANGE() { return getToken(MiniGoParser.RANGE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForRangeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForRangeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeStmtContext forRangeStmt() throws RecognitionException {
		ForRangeStmtContext _localctx = new ForRangeStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forRangeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(FOR);
			setState(438);
			match(IDENTIFIER);
			setState(439);
			forRange_tail();
			setState(440);
			match(ASSIGN_COLON);
			setState(441);
			match(RANGE);
			setState(442);
			expr();
			setState(443);
			block();
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

	public static class ForRange_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MiniGoParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public ForRange_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRange_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitForRange_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRange_tailContext forRange_tail() throws RecognitionException {
		ForRange_tailContext _localctx = new ForRange_tailContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forRange_tail);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(COMMA);
				setState(446);
				match(IDENTIFIER);
				}
				break;
			case ASSIGN_COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MiniGoParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(BREAK);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MiniGoParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(CONTINUE);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniGoParser.RETURN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public Return_exprContext return_expr() {
			return getRuleContext(Return_exprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(RETURN);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INTERFACE) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << SUB) | (1L << NEGATION) | (1L << LBRACK) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRINGLIT) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(455);
				return_expr();
				}
			}

			setState(458);
			match(SEMI_COLON);
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

	public static class Return_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitReturn_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_exprContext return_expr() throws RecognitionException {
		Return_exprContext _localctx = new Return_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_return_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			expr();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MiniGoParser.SEMI_COLON, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			expr();
			setState(463);
			match(SEMI_COLON);
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

	public static class ExprContext extends ParserRuleContext {
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			logicalOrExpr(0);
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

	public static class LogicalOrExprContext extends ParserRuleContext {
		public LogicalAndExprContext logicalAndExpr() {
			return getRuleContext(LogicalAndExprContext.class,0);
		}
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(MiniGoParser.OR, 0); }
		public LogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExprContext logicalOrExpr() throws RecognitionException {
		return logicalOrExpr(0);
	}

	private LogicalOrExprContext logicalOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExprContext _localctx = new LogicalOrExprContext(_ctx, _parentState);
		LogicalOrExprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_logicalOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			logicalAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpr);
					setState(470);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(471);
					match(OR);
					setState(472);
					logicalAndExpr(0);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExprContext extends ParserRuleContext {
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public LogicalAndExprContext logicalAndExpr() {
			return getRuleContext(LogicalAndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(MiniGoParser.AND, 0); }
		public LogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExprContext logicalAndExpr() throws RecognitionException {
		return logicalAndExpr(0);
	}

	private LogicalAndExprContext logicalAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExprContext _localctx = new LogicalAndExprContext(_ctx, _parentState);
		LogicalAndExprContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_logicalAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(479);
			equalityExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpr);
					setState(481);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(482);
					match(AND);
					setState(483);
					equalityExpr(0);
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MiniGoParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(MiniGoParser.NOT_EQ, 0); }
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		return equalityExpr(0);
	}

	private EqualityExprContext equalityExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, _parentState);
		EqualityExprContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_equalityExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(490);
			relationalExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
					setState(492);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(493);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NOT_EQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(494);
					relationalExpr(0);
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public TerminalNode LT() { return getToken(MiniGoParser.LT, 0); }
		public TerminalNode LTE() { return getToken(MiniGoParser.LTE, 0); }
		public TerminalNode GT() { return getToken(MiniGoParser.GT, 0); }
		public TerminalNode GTE() { return getToken(MiniGoParser.GTE, 0); }
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		return relationalExpr(0);
	}

	private RelationalExprContext relationalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, _parentState);
		RelationalExprContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_relationalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(501);
			additiveExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
					setState(503);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(504);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(505);
					additiveExpr(0);
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MiniGoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MiniGoParser.SUB, 0); }
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		return additiveExpr(0);
	}

	private AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(512);
			multiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(514);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(515);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(516);
					multiplicativeExpr(0);
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MiniGoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiniGoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniGoParser.MOD, 0); }
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		return multiplicativeExpr(0);
	}

	private MultiplicativeExprContext multiplicativeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, _parentState);
		MultiplicativeExprContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_multiplicativeExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(523);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
					setState(525);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(526);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(527);
					unaryExpr();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(MiniGoParser.NEGATION, 0); }
		public TerminalNode SUB() { return getToken(MiniGoParser.SUB, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unaryExpr);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==NEGATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(534);
				unaryExpr();
				}
				break;
			case STRUCT:
			case INTERFACE:
			case TRUE:
			case FALSE:
			case NIL:
			case LBRACK:
			case LPAREN:
			case IDENTIFIER:
			case STRINGLIT:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				primaryExpr(0);
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public CompositeLiteralContext compositeLiteral() {
			return getRuleContext(CompositeLiteralContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(MiniGoParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniGoParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(MiniGoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(539);
				compositeLiteral();
				}
				break;
			case 2:
				{
				setState(540);
				literal();
				}
				break;
			case 3:
				{
				setState(541);
				lhs();
				}
				break;
			case 4:
				{
				setState(542);
				match(LPAREN);
				setState(543);
				expr();
				setState(544);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(558);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(548);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(549);
						match(LBRACK);
						setState(550);
						expr();
						setState(551);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(553);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(554);
						match(DOT);
						setState(555);
						match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(556);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(557);
						arguments();
						}
						break;
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(LPAREN);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INTERFACE) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << SUB) | (1L << NEGATION) | (1L << LBRACK) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRINGLIT) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(564);
				argumentList();
				}
			}

			setState(567);
			match(RPAREN);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			expr();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(570);
				match(COMMA);
				setState(571);
				expr();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LhsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public Lhs_tailContext lhs_tail() {
			return getRuleContext(Lhs_tailContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(IDENTIFIER);
			setState(578);
			lhs_tail();
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

	public static class Lhs_tailContext extends ParserRuleContext {
		public List<Lhs_tail_itemContext> lhs_tail_item() {
			return getRuleContexts(Lhs_tail_itemContext.class);
		}
		public Lhs_tail_itemContext lhs_tail_item(int i) {
			return getRuleContext(Lhs_tail_itemContext.class,i);
		}
		public Lhs_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitLhs_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lhs_tailContext lhs_tail() throws RecognitionException {
		Lhs_tailContext _localctx = new Lhs_tailContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lhs_tail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(580);
					lhs_tail_item();
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
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

	public static class Lhs_tail_itemContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(MiniGoParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(MiniGoParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(MiniGoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public Lhs_tail_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_tail_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitLhs_tail_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lhs_tail_itemContext lhs_tail_item() throws RecognitionException {
		Lhs_tail_itemContext _localctx = new Lhs_tail_itemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lhs_tail_item);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(LBRACK);
				setState(587);
				expr();
				setState(588);
				match(RBRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(DOT);
				setState(591);
				match(IDENTIFIER);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniGoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiniGoParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(MiniGoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniGoParser.FALSE, 0); }
		public TerminalNode STRINGLIT() { return getToken(MiniGoParser.STRINGLIT, 0); }
		public TerminalNode NIL() { return getToken(MiniGoParser.NIL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << STRINGLIT) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompositeLiteralContext extends ParserRuleContext {
		public ArrayCompositeLiteralContext arrayCompositeLiteral() {
			return getRuleContext(ArrayCompositeLiteralContext.class,0);
		}
		public StructCompositeLiteralContext structCompositeLiteral() {
			return getRuleContext(StructCompositeLiteralContext.class,0);
		}
		public CompositeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitCompositeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeLiteralContext compositeLiteral() throws RecognitionException {
		CompositeLiteralContext _localctx = new CompositeLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_compositeLiteral);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				arrayCompositeLiteral();
				}
				break;
			case STRUCT:
			case INTERFACE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				structCompositeLiteral();
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

	public static class ArrayCompositeLiteralContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayLiteralBodyContext arrayLiteralBody() {
			return getRuleContext(ArrayLiteralBodyContext.class,0);
		}
		public ArrayCompositeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCompositeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArrayCompositeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCompositeLiteralContext arrayCompositeLiteral() throws RecognitionException {
		ArrayCompositeLiteralContext _localctx = new ArrayCompositeLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arrayCompositeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			arrayType();
			setState(601);
			arrayLiteralBody();
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

	public static class ArrayLiteralBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public ArrayLiteralElementListContext arrayLiteralElementList() {
			return getRuleContext(ArrayLiteralElementListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public ArrayLiteralBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArrayLiteralBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralBodyContext arrayLiteralBody() throws RecognitionException {
		ArrayLiteralBodyContext _localctx = new ArrayLiteralBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_arrayLiteralBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(LBRACE);
			setState(604);
			arrayLiteralElementList();
			setState(605);
			match(RBRACE);
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

	public static class ArrayLiteralElementListContext extends ParserRuleContext {
		public List<ArrayLiteralElementContext> arrayLiteralElement() {
			return getRuleContexts(ArrayLiteralElementContext.class);
		}
		public ArrayLiteralElementContext arrayLiteralElement(int i) {
			return getRuleContext(ArrayLiteralElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public ArrayLiteralElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralElementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArrayLiteralElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralElementListContext arrayLiteralElementList() throws RecognitionException {
		ArrayLiteralElementListContext _localctx = new ArrayLiteralElementListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_arrayLiteralElementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			arrayLiteralElement();
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(COMMA);
					setState(609);
					arrayLiteralElement();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(615);
				match(COMMA);
				}
			}

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

	public static class ArrayLiteralElementContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniGoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniGoParser.IDENTIFIER, i);
		}
		public NestedNonArrayCompositeLiteralContext nestedNonArrayCompositeLiteral() {
			return getRuleContext(NestedNonArrayCompositeLiteralContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniGoParser.COLON, 0); }
		public ArrayLiteralElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitArrayLiteralElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralElementContext arrayLiteralElement() throws RecognitionException {
		ArrayLiteralElementContext _localctx = new ArrayLiteralElementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayLiteralElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(618);
				match(IDENTIFIER);
				setState(619);
				match(COLON);
				}
				break;
			}
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(622);
				literal();
				}
				break;
			case 2:
				{
				setState(623);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(624);
				nestedNonArrayCompositeLiteral();
				}
				break;
			}
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

	public static class NestedNonArrayCompositeLiteralContext extends ParserRuleContext {
		public NonArrayTypeDefContext nonArrayTypeDef() {
			return getRuleContext(NonArrayTypeDefContext.class,0);
		}
		public StructLiteralBodyContext structLiteralBody() {
			return getRuleContext(StructLiteralBodyContext.class,0);
		}
		public NestedNonArrayCompositeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNonArrayCompositeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitNestedNonArrayCompositeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNonArrayCompositeLiteralContext nestedNonArrayCompositeLiteral() throws RecognitionException {
		NestedNonArrayCompositeLiteralContext _localctx = new NestedNonArrayCompositeLiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nestedNonArrayCompositeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			nonArrayTypeDef();
			setState(628);
			structLiteralBody();
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

	public static class NonArrayTypeDefContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public NonArrayTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonArrayTypeDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitNonArrayTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonArrayTypeDefContext nonArrayTypeDef() throws RecognitionException {
		NonArrayTypeDefContext _localctx = new NonArrayTypeDefContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nonArrayTypeDef);
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				structType();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				interfaceType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(IDENTIFIER);
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

	public static class StructCompositeLiteralContext extends ParserRuleContext {
		public NonArrayTypeDefContext nonArrayTypeDef() {
			return getRuleContext(NonArrayTypeDefContext.class,0);
		}
		public StructLiteralBodyContext structLiteralBody() {
			return getRuleContext(StructLiteralBodyContext.class,0);
		}
		public StructCompositeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCompositeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStructCompositeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructCompositeLiteralContext structCompositeLiteral() throws RecognitionException {
		StructCompositeLiteralContext _localctx = new StructCompositeLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_structCompositeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			nonArrayTypeDef();
			setState(636);
			structLiteralBody();
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

	public static class StructLiteralBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public StructLiteralElementListContext structLiteralElementList() {
			return getRuleContext(StructLiteralElementListContext.class,0);
		}
		public StructLiteralBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteralBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStructLiteralBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructLiteralBodyContext structLiteralBody() throws RecognitionException {
		StructLiteralBodyContext _localctx = new StructLiteralBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_structLiteralBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LBRACE);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INTERFACE) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << SUB) | (1L << NEGATION) | (1L << LBRACK) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRINGLIT) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(639);
				structLiteralElementList();
				}
			}

			setState(642);
			match(RBRACE);
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

	public static class StructLiteralElementListContext extends ParserRuleContext {
		public List<StructLiteralElementContext> structLiteralElement() {
			return getRuleContexts(StructLiteralElementContext.class);
		}
		public StructLiteralElementContext structLiteralElement(int i) {
			return getRuleContext(StructLiteralElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public StructLiteralElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteralElementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStructLiteralElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructLiteralElementListContext structLiteralElementList() throws RecognitionException {
		StructLiteralElementListContext _localctx = new StructLiteralElementListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_structLiteralElementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			structLiteralElement();
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(645);
					match(COMMA);
					setState(646);
					structLiteralElement();
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(652);
				match(COMMA);
				}
			}

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

	public static class StructLiteralElementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniGoParser.COLON, 0); }
		public StructLiteralElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteralElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniGoVisitor ) return ((MiniGoVisitor<? extends T>)visitor).visitStructLiteralElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructLiteralElementContext structLiteralElement() throws RecognitionException {
		StructLiteralElementContext _localctx = new StructLiteralElementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_structLiteralElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(655);
				match(IDENTIFIER);
				setState(656);
				match(COLON);
				}
				break;
			}
			setState(659);
			expr();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return intExpr_sempred((IntExprContext)_localctx, predIndex);
		case 22:
			return intTerm_sempred((IntTermContext)_localctx, predIndex);
		case 47:
			return logicalOrExpr_sempred((LogicalOrExprContext)_localctx, predIndex);
		case 48:
			return logicalAndExpr_sempred((LogicalAndExprContext)_localctx, predIndex);
		case 49:
			return equalityExpr_sempred((EqualityExprContext)_localctx, predIndex);
		case 50:
			return relationalExpr_sempred((RelationalExprContext)_localctx, predIndex);
		case 51:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 52:
			return multiplicativeExpr_sempred((MultiplicativeExprContext)_localctx, predIndex);
		case 54:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean intTerm_sempred(IntTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalOrExpr_sempred(LogicalOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalAndExpr_sempred(LogicalAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalityExpr_sempred(EqualityExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relationalExpr_sempred(RelationalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpr_sempred(MultiplicativeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0298\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\6\2\u0094\n\2\r\2\16\2\u0095\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u009f"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a7\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u00ae"+
		"\n\5\3\5\3\5\5\5\u00b2\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\b\3\b\3\b\5\b\u00cb\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u00d7\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00de\n\13\3\f\3\f\3\r\3\r\3\r\6\r\u00e5\n\r\r\r\16\r\u00e6"+
		"\3\r\3\r\3\16\3\16\3\16\7\16\u00ee\n\16\f\16\16\16\u00f1\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\6\20\u00fb\n\20\r\20\16\20\u00fc\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u0104\n\21\f\21\16\21\u0107\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\5\23\u0112\n\23\3\24\3\24\5\24\u0116"+
		"\n\24\3\25\6\25\u0119\n\25\r\25\16\25\u011a\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\5\27\u0126\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u012e\n\27\f\27\16\27\u0131\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u013f\n\30\f\30\16\30\u0142\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0149\n\31\3\32\3\32\3\32\7\32\u014e\n\32\f"+
		"\32\16\32\u0151\13\32\3\33\3\33\3\33\7\33\u0156\n\33\f\33\16\33\u0159"+
		"\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7\35\u0162\n\35\f\35\16\35\u0165"+
		"\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u017b\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3!\5!\u0189\n!\3!\3!\3\"\3\"\3\"\5\"\u0190\n\"\3"+
		"\"\5\"\u0193\n\"\3#\3#\3#\5#\u0198\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u01a8\n%\3&\3&\3&\3&\5&\u01ae\n&\3\'\3\'\5\'\u01b2\n\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u01c3\n*\3+\3+\3,\3,\3"+
		"-\3-\5-\u01cb\n-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\7\61\u01dc\n\61\f\61\16\61\u01df\13\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\7\62\u01e7\n\62\f\62\16\62\u01ea\13\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\7\63\u01f2\n\63\f\63\16\63\u01f5\13\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\7\64\u01fd\n\64\f\64\16\64\u0200\13\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\7\65\u0208\n\65\f\65\16\65\u020b\13\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\7\66\u0213\n\66\f\66\16\66\u0216\13\66\3\67\3\67\3\67\5\67\u021b"+
		"\n\67\38\38\38\38\38\38\38\38\58\u0225\n8\38\38\38\38\38\38\38\38\38\3"+
		"8\78\u0231\n8\f8\168\u0234\138\39\39\59\u0238\n9\39\39\3:\3:\3:\7:\u023f"+
		"\n:\f:\16:\u0242\13:\3;\3;\3;\3<\7<\u0248\n<\f<\16<\u024b\13<\3=\3=\3"+
		"=\3=\3=\3=\5=\u0253\n=\3>\3>\3?\3?\5?\u0259\n?\3@\3@\3@\3A\3A\3A\3A\3"+
		"B\3B\3B\7B\u0265\nB\fB\16B\u0268\13B\3B\5B\u026b\nB\3C\3C\5C\u026f\nC"+
		"\3C\3C\3C\5C\u0274\nC\3D\3D\3D\3E\3E\3E\5E\u027c\nE\3F\3F\3F\3G\3G\5G"+
		"\u0283\nG\3G\3G\3H\3H\3H\7H\u028a\nH\fH\16H\u028d\13H\3H\5H\u0290\nH\3"+
		"I\3I\5I\u0294\nI\3I\3I\3I\2\13,.`bdfhjnJ\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\2\n\3\2\16\21\4\2&+B"+
		"B\3\2\37 \3\2!$\3\2\30\31\3\2\32\34\4\2\31\31%%\5\2\25\2788;<\2\u02a1"+
		"\2\u0093\3\2\2\2\4\u009e\3\2\2\2\6\u00a0\3\2\2\2\b\u00a8\3\2\2\2\n\u00b5"+
		"\3\2\2\2\f\u00bb\3\2\2\2\16\u00c0\3\2\2\2\20\u00d1\3\2\2\2\22\u00d6\3"+
		"\2\2\2\24\u00dd\3\2\2\2\26\u00df\3\2\2\2\30\u00e1\3\2\2\2\32\u00ea\3\2"+
		"\2\2\34\u00f4\3\2\2\2\36\u00f7\3\2\2\2 \u0100\3\2\2\2\"\u010a\3\2\2\2"+
		"$\u0111\3\2\2\2&\u0115\3\2\2\2(\u0118\3\2\2\2*\u011e\3\2\2\2,\u0125\3"+
		"\2\2\2.\u0132\3\2\2\2\60\u0148\3\2\2\2\62\u014a\3\2\2\2\64\u0152\3\2\2"+
		"\2\66\u015c\3\2\2\28\u0163\3\2\2\2:\u017a\3\2\2\2<\u017c\3\2\2\2>\u0180"+
		"\3\2\2\2@\u0182\3\2\2\2B\u0192\3\2\2\2D\u0197\3\2\2\2F\u0199\3\2\2\2H"+
		"\u01a7\3\2\2\2J\u01ad\3\2\2\2L\u01b1\3\2\2\2N\u01b3\3\2\2\2P\u01b7\3\2"+
		"\2\2R\u01c2\3\2\2\2T\u01c4\3\2\2\2V\u01c6\3\2\2\2X\u01c8\3\2\2\2Z\u01ce"+
		"\3\2\2\2\\\u01d0\3\2\2\2^\u01d3\3\2\2\2`\u01d5\3\2\2\2b\u01e0\3\2\2\2"+
		"d\u01eb\3\2\2\2f\u01f6\3\2\2\2h\u0201\3\2\2\2j\u020c\3\2\2\2l\u021a\3"+
		"\2\2\2n\u0224\3\2\2\2p\u0235\3\2\2\2r\u023b\3\2\2\2t\u0243\3\2\2\2v\u0249"+
		"\3\2\2\2x\u0252\3\2\2\2z\u0254\3\2\2\2|\u0258\3\2\2\2~\u025a\3\2\2\2\u0080"+
		"\u025d\3\2\2\2\u0082\u0261\3\2\2\2\u0084\u026e\3\2\2\2\u0086\u0275\3\2"+
		"\2\2\u0088\u027b\3\2\2\2\u008a\u027d\3\2\2\2\u008c\u0280\3\2\2\2\u008e"+
		"\u0286\3\2\2\2\u0090\u0293\3\2\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\2\2\3\u0098\3\3\2\2\2\u0099\u009f\5\6\4\2"+
		"\u009a\u009f\5\b\5\2\u009b\u009f\5\n\6\2\u009c\u009f\5\f\7\2\u009d\u009f"+
		"\5\16\b\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\5\3\2\2\2\u00a0\u00a1\7"+
		"\n\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		"\u00a6\5\66\34\2\u00a5\u00a7\7\63\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\7\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00b1\7\67\2\2\u00aa"+
		"\u00ad\5\24\13\2\u00ab\u00ac\7&\2\2\u00ac\u00ae\5^\60\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b0\7&\2\2\u00b0"+
		"\u00b2\5^\60\2\u00b1\u00aa\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\7\63\2\2\u00b4\t\3\2\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7"+
		"\7\67\2\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\5^\60\2\u00b9\u00ba\7\63\2\2"+
		"\u00ba\13\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\7\67\2\2\u00bd\u00be"+
		"\5\24\13\2\u00be\u00bf\7\63\2\2\u00bf\r\3\2\2\2\u00c0\u00c5\7\n\2\2\u00c1"+
		"\u00c2\7\60\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c4\7\61\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7\67\2\2\u00c8\u00ca\7\60\2\2\u00c9\u00cb\5\62\32\2\u00ca\u00c9"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\61\2\2"+
		"\u00cd\u00ce\5\22\n\2\u00ce\u00cf\5\66\34\2\u00cf\u00d0\7\63\2\2\u00d0"+
		"\17\3\2\2\2\u00d1\u00d2\7\67\2\2\u00d2\u00d3\7\67\2\2\u00d3\21\3\2\2\2"+
		"\u00d4\u00d7\5\24\13\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\23\3\2\2\2\u00d8\u00de\5\26\f\2\u00d9\u00de\5\30\r\2\u00da"+
		"\u00de\5\36\20\2\u00db\u00de\5(\25\2\u00dc\u00de\7\67\2\2\u00dd\u00d8"+
		"\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\25\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0\27\3\2\2\2\u00e1"+
		"\u00e2\7\f\2\2\u00e2\u00e4\7.\2\2\u00e3\u00e5\5\32\16\2\u00e4\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\31\3\2\2\2\u00ea\u00ef\5\34\17"+
		"\2\u00eb\u00ec\7\63\2\2\u00ec\u00ee\5\34\17\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\63\2\2\u00f3\33\3\2\2\2\u00f4\u00f5"+
		"\7\67\2\2\u00f5\u00f6\5\24\13\2\u00f6\35\3\2\2\2\u00f7\u00f8\7\r\2\2\u00f8"+
		"\u00fa\7.\2\2\u00f9\u00fb\5 \21\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\7/\2\2\u00ff\37\3\2\2\2\u0100\u0105\5\"\22\2\u0101\u0102\7\63\2"+
		"\2\u0102\u0104\5\"\22\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\7\63\2\2\u0109!\3\2\2\2\u010a\u010b\7\67\2\2\u010b\u010c"+
		"\7\60\2\2\u010c\u010d\5$\23\2\u010d\u010e\7\61\2\2\u010e\u010f\5&\24\2"+
		"\u010f#\3\2\2\2\u0110\u0112\5\62\32\2\u0111\u0110\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112%\3\2\2\2\u0113\u0116\5\24\13\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\'\3\2\2\2\u0117\u0119\5*\26\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5\24\13\2\u011d)\3\2\2\2\u011e"+
		"\u011f\7,\2\2\u011f\u0120\5,\27\2\u0120\u0121\7-\2\2\u0121+\3\2\2\2\u0122"+
		"\u0123\b\27\1\2\u0123\u0126\5.\30\2\u0124\u0126\7\67\2\2\u0125\u0122\3"+
		"\2\2\2\u0125\u0124\3\2\2\2\u0126\u012f\3\2\2\2\u0127\u0128\f\6\2\2\u0128"+
		"\u0129\7\30\2\2\u0129\u012e\5.\30\2\u012a\u012b\f\5\2\2\u012b\u012c\7"+
		"\31\2\2\u012c\u012e\5.\30\2\u012d\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130-\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u0133\b\30\1\2\u0133\u0134\5\60\31\2\u0134"+
		"\u0140\3\2\2\2\u0135\u0136\f\6\2\2\u0136\u0137\7\32\2\2\u0137\u013f\5"+
		"\60\31\2\u0138\u0139\f\5\2\2\u0139\u013a\7\33\2\2\u013a\u013f\5\60\31"+
		"\2\u013b\u013c\f\4\2\2\u013c\u013d\7\34\2\2\u013d\u013f\5\60\31\2\u013e"+
		"\u0135\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141/\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0149\7;\2\2\u0144\u0145\7\60\2\2\u0145\u0146\5,\27\2\u0146"+
		"\u0147\7\61\2\2\u0147\u0149\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3"+
		"\2\2\2\u0149\61\3\2\2\2\u014a\u014f\5\64\33\2\u014b\u014c\7\62\2\2\u014c"+
		"\u014e\5\64\33\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\63\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0157\7\67\2\2\u0153\u0154\7\62\2\2\u0154\u0156\7\67\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\24\13\2\u015b\65\3\2"+
		"\2\2\u015c\u015d\7.\2\2\u015d\u015e\58\35\2\u015e\u015f\7/\2\2\u015f\67"+
		"\3\2\2\2\u0160\u0162\5:\36\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u01649\3\2\2\2\u0165\u0163\3\2\2\2"+
		"\u0166\u0167\5\66\34\2\u0167\u0168\7\63\2\2\u0168\u017b\3\2\2\2\u0169"+
		"\u017b\5\b\5\2\u016a\u017b\5\n\6\2\u016b\u016c\5<\37\2\u016c\u016d\7\63"+
		"\2\2\u016d\u017b\3\2\2\2\u016e\u017b\5@!\2\u016f\u0170\5D#\2\u0170\u0171"+
		"\7\63\2\2\u0171\u017b\3\2\2\2\u0172\u0173\5T+\2\u0173\u0174\7\63\2\2\u0174"+
		"\u017b\3\2\2\2\u0175\u0176\5V,\2\u0176\u0177\7\63\2\2\u0177\u017b\3\2"+
		"\2\2\u0178\u017b\5X-\2\u0179\u017b\5\\/\2\u017a\u0166\3\2\2\2\u017a\u0169"+
		"\3\2\2\2\u017a\u016a\3\2\2\2\u017a\u016b\3\2\2\2\u017a\u016e\3\2\2\2\u017a"+
		"\u016f\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u0179\3\2\2\2\u017b;\3\2\2\2\u017c\u017d\5t;\2\u017d\u017e"+
		"\5> \2\u017e\u017f\5^\60\2\u017f=\3\2\2\2\u0180\u0181\t\3\2\2\u0181?\3"+
		"\2\2\2\u0182\u0183\7\6\2\2\u0183\u0184\7\60\2\2\u0184\u0185\5^\60\2\u0185"+
		"\u0188\7\61\2\2\u0186\u0189\5\66\34\2\u0187\u0189\5:\36\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5B\"\2\u018b"+
		"A\3\2\2\2\u018c\u018f\7\7\2\2\u018d\u0190\5@!\2\u018e\u0190\5:\36\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u0193\7\63"+
		"\2\2\u0192\u018c\3\2\2\2\u0192\u0191\3\2\2\2\u0193C\3\2\2\2\u0194\u0198"+
		"\5F$\2\u0195\u0198\5N(\2\u0196\u0198\5P)\2\u0197\u0194\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198E\3\2\2\2\u0199\u019a\7\b\2\2\u019a"+
		"\u019b\5H%\2\u019b\u019c\5J&\2\u019c\u019d\5L\'\2\u019d\u019e\5\66\34"+
		"\2\u019eG\3\2\2\2\u019f\u01a8\5\b\5\2\u01a0\u01a1\5<\37\2\u01a1\u01a2"+
		"\7\63\2\2\u01a2\u01a8\3\2\2\2\u01a3\u01a4\5^\60\2\u01a4\u01a5\7\63\2\2"+
		"\u01a5\u01a8\3\2\2\2\u01a6\u01a8\7\63\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a0"+
		"\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8I\3\2\2\2\u01a9"+
		"\u01aa\5^\60\2\u01aa\u01ab\7\63\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\7"+
		"\63\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeK\3\2\2\2\u01af\u01b2"+
		"\5<\37\2\u01b0\u01b2\5^\60\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2"+
		"M\3\2\2\2\u01b3\u01b4\7\b\2\2\u01b4\u01b5\5^\60\2\u01b5\u01b6\5\66\34"+
		"\2\u01b6O\3\2\2\2\u01b7\u01b8\7\b\2\2\u01b8\u01b9\7\67\2\2\u01b9\u01ba"+
		"\5R*\2\u01ba\u01bb\7B\2\2\u01bb\u01bc\7\24\2\2\u01bc\u01bd\5^\60\2\u01bd"+
		"\u01be\5\66\34\2\u01beQ\3\2\2\2\u01bf\u01c0\7\62\2\2\u01c0\u01c3\7\67"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"S\3\2\2\2\u01c4\u01c5\7\23\2\2\u01c5U\3\2\2\2\u01c6\u01c7\7\22\2\2\u01c7"+
		"W\3\2\2\2\u01c8\u01ca\7\t\2\2\u01c9\u01cb\5Z.\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\63\2\2\u01cdY\3\2\2\2"+
		"\u01ce\u01cf\5^\60\2\u01cf[\3\2\2\2\u01d0\u01d1\5^\60\2\u01d1\u01d2\7"+
		"\63\2\2\u01d2]\3\2\2\2\u01d3\u01d4\5`\61\2\u01d4_\3\2\2\2\u01d5\u01d6"+
		"\b\61\1\2\u01d6\u01d7\5b\62\2\u01d7\u01dd\3\2\2\2\u01d8\u01d9\f\4\2\2"+
		"\u01d9\u01da\7\36\2\2\u01da\u01dc\5b\62\2\u01db\u01d8\3\2\2\2\u01dc\u01df"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01dea\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e1\b\62\1\2\u01e1\u01e2\5d\63\2\u01e2\u01e8\3"+
		"\2\2\2\u01e3\u01e4\f\4\2\2\u01e4\u01e5\7\35\2\2\u01e5\u01e7\5d\63\2\u01e6"+
		"\u01e3\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9c\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\b\63\1\2\u01ec\u01ed"+
		"\5f\64\2\u01ed\u01f3\3\2\2\2\u01ee\u01ef\f\4\2\2\u01ef\u01f0\t\4\2\2\u01f0"+
		"\u01f2\5f\64\2\u01f1\u01ee\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4e\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7"+
		"\b\64\1\2\u01f7\u01f8\5h\65\2\u01f8\u01fe\3\2\2\2\u01f9\u01fa\f\4\2\2"+
		"\u01fa\u01fb\t\5\2\2\u01fb\u01fd\5h\65\2\u01fc\u01f9\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffg\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0202\b\65\1\2\u0202\u0203\5j\66\2\u0203\u0209\3"+
		"\2\2\2\u0204\u0205\f\4\2\2\u0205\u0206\t\6\2\2\u0206\u0208\5j\66\2\u0207"+
		"\u0204\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020ai\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\b\66\1\2\u020d\u020e"+
		"\5l\67\2\u020e\u0214\3\2\2\2\u020f\u0210\f\4\2\2\u0210\u0211\t\7\2\2\u0211"+
		"\u0213\5l\67\2\u0212\u020f\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215k\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218"+
		"\t\b\2\2\u0218\u021b\5l\67\2\u0219\u021b\5n8\2\u021a\u0217\3\2\2\2\u021a"+
		"\u0219\3\2\2\2\u021bm\3\2\2\2\u021c\u021d\b8\1\2\u021d\u0225\5|?\2\u021e"+
		"\u0225\5z>\2\u021f\u0225\5t;\2\u0220\u0221\7\60\2\2\u0221\u0222\5^\60"+
		"\2\u0222\u0223\7\61\2\2\u0223\u0225\3\2\2\2\u0224\u021c\3\2\2\2\u0224"+
		"\u021e\3\2\2\2\u0224\u021f\3\2\2\2\u0224\u0220\3\2\2\2\u0225\u0232\3\2"+
		"\2\2\u0226\u0227\f\6\2\2\u0227\u0228\7,\2\2\u0228\u0229\5^\60\2\u0229"+
		"\u022a\7-\2\2\u022a\u0231\3\2\2\2\u022b\u022c\f\5\2\2\u022c\u022d\7\65"+
		"\2\2\u022d\u0231\7\67\2\2\u022e\u022f\f\4\2\2\u022f\u0231\5p9\2\u0230"+
		"\u0226\3\2\2\2\u0230\u022b\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233o\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0235\u0237\7\60\2\2\u0236\u0238\5r:\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\7\61\2\2\u023aq\3\2\2\2"+
		"\u023b\u0240\5^\60\2\u023c\u023d\7\62\2\2\u023d\u023f\5^\60\2\u023e\u023c"+
		"\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"s\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\7\67\2\2\u0244\u0245\5v<\2\u0245"+
		"u\3\2\2\2\u0246\u0248\5x=\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024aw\3\2\2\2\u024b\u0249\3\2\2\2"+
		"\u024c\u024d\7,\2\2\u024d\u024e\5^\60\2\u024e\u024f\7-\2\2\u024f\u0253"+
		"\3\2\2\2\u0250\u0251\7\65\2\2\u0251\u0253\7\67\2\2\u0252\u024c\3\2\2\2"+
		"\u0252\u0250\3\2\2\2\u0253y\3\2\2\2\u0254\u0255\t\t\2\2\u0255{\3\2\2\2"+
		"\u0256\u0259\5~@\2\u0257\u0259\5\u008aF\2\u0258\u0256\3\2\2\2\u0258\u0257"+
		"\3\2\2\2\u0259}\3\2\2\2\u025a\u025b\5(\25\2\u025b\u025c\5\u0080A\2\u025c"+
		"\177\3\2\2\2\u025d\u025e\7.\2\2\u025e\u025f\5\u0082B\2\u025f\u0260\7/"+
		"\2\2\u0260\u0081\3\2\2\2\u0261\u0266\5\u0084C\2\u0262\u0263\7\62\2\2\u0263"+
		"\u0265\5\u0084C\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026b\7\62\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0083\3"+
		"\2\2\2\u026c\u026d\7\67\2\2\u026d\u026f\7\64\2\2\u026e\u026c\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0273\3\2\2\2\u0270\u0274\5z>\2\u0271\u0274\7\67"+
		"\2\2\u0272\u0274\5\u0086D\2\u0273\u0270\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0272\3\2\2\2\u0274\u0085\3\2\2\2\u0275\u0276\5\u0088E\2\u0276\u0277"+
		"\5\u008cG\2\u0277\u0087\3\2\2\2\u0278\u027c\5\30\r\2\u0279\u027c\5\36"+
		"\20\2\u027a\u027c\7\67\2\2\u027b\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027a\3\2\2\2\u027c\u0089\3\2\2\2\u027d\u027e\5\u0088E\2\u027e\u027f"+
		"\5\u008cG\2\u027f\u008b\3\2\2\2\u0280\u0282\7.\2\2\u0281\u0283\5\u008e"+
		"H\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\7/\2\2\u0285\u008d\3\2\2\2\u0286\u028b\5\u0090I\2\u0287\u0288\7"+
		"\62\2\2\u0288\u028a\5\u0090I\2\u0289\u0287\3\2\2\2\u028a\u028d\3\2\2\2"+
		"\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0290\7\62\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2"+
		"\u0290\u008f\3\2\2\2\u0291\u0292\7\67\2\2\u0292\u0294\7\64\2\2\u0293\u0291"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\5^\60\2\u0296"+
		"\u0091\3\2\2\2=\u0095\u009e\u00a6\u00ad\u00b1\u00c5\u00ca\u00d6\u00dd"+
		"\u00e6\u00ef\u00fc\u0105\u0111\u0115\u011a\u0125\u012d\u012f\u013e\u0140"+
		"\u0148\u014f\u0157\u0163\u017a\u0188\u018f\u0192\u0197\u01a7\u01ad\u01b1"+
		"\u01c2\u01ca\u01dd\u01e8\u01f3\u01fe\u0209\u0214\u021a\u0224\u0230\u0232"+
		"\u0237\u0240\u0249\u0252\u0258\u0266\u026a\u026e\u0273\u027b\u0282\u028b"+
		"\u028f\u0293";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}