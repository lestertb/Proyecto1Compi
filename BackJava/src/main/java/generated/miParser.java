// Generated from C:/Users/marco/OneDrive/Escritorio/New folder (3)/proyecto1compi/BackJava/src/main/java\miParser.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyComa=1, COMA=2, UNDERSC=3, POINT=4, COMIDOBLES=5, ASSIGN=6, VIR=7, DOSPUN=8, 
		PIZQ=9, PDER=10, LLAIZQ=11, LLADER=12, PCIZQ=13, PCDER=14, ROPERATOR=15, 
		STYPE=16, BTYPE=17, AOP=18, MOP=19, UNARY=20, IF=21, ELSE=22, WHILE=23, 
		LET=24, THEN=25, RETURN=26, CLASS=27, PRINT=28, NEW=29, LENGTH=30, ID=31, 
		PRINTABLE=32, INTLITERAL=33, REALLITERAL=34, STRINGLITERAL=35, BOOLLITERAL=36, 
		WS=37;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_functionDeclaration = 3, 
		RULE_formalParams = 4, RULE_formalParam = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_returnStatement = 8, RULE_printStatement = 9, 
		RULE_classDeclaration = 10, RULE_classVariableDeclaration = 11, RULE_variableDeclaration = 12, 
		RULE_type = 13, RULE_arrayType = 14, RULE_assignment = 15, RULE_arrayAssignment = 16, 
		RULE_expression = 17, RULE_simpleExpression = 18, RULE_term = 19, RULE_factor = 20, 
		RULE_unary = 21, RULE_allocationExpression = 22, RULE_arrayAllocationExpression = 23, 
		RULE_subExpression = 24, RULE_functionCall = 25, RULE_actualParams = 26, 
		RULE_arrayLookup = 27, RULE_arrayLength = 28, RULE_literal = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "functionDeclaration", "formalParams", 
			"formalParam", "whileStatement", "ifStatement", "returnStatement", "printStatement", 
			"classDeclaration", "classVariableDeclaration", "variableDeclaration", 
			"type", "arrayType", "assignment", "arrayAssignment", "expression", "simpleExpression", 
			"term", "factor", "unary", "allocationExpression", "arrayAllocationExpression", 
			"subExpression", "functionCall", "actualParams", "arrayLookup", "arrayLength", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'_'", "'.'", "'\"'", "'='", "'~'", "':'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", null, null, null, null, null, null, 
			"'if'", "'else'", "'while'", "'let'", "'then'", "'return'", "'class'", 
			"'print'", "'new'", "'lenght'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyComa", "COMA", "UNDERSC", "POINT", "COMIDOBLES", "ASSIGN", "VIR", 
			"DOSPUN", "PIZQ", "PDER", "LLAIZQ", "LLADER", "PCIZQ", "PCDER", "ROPERATOR", 
			"STYPE", "BTYPE", "AOP", "MOP", "UNARY", "IF", "ELSE", "WHILE", "LET", 
			"THEN", "RETURN", "CLASS", "PRINT", "NEW", "LENGTH", "ID", "PRINTABLE", 
			"INTLITERAL", "REALLITERAL", "STRINGLITERAL", "BOOLLITERAL", "WS"
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
	public String getGrammarFileName() { return "miParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAIZQ) | (1L << STYPE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CLASS) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				variableDeclaration();
				setState(67);
				match(PyComa);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				classDeclaration();
				setState(70);
				match(PyComa);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				assignment();
				setState(73);
				match(PyComa);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				arrayAssignment();
				setState(76);
				match(PyComa);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				printStatement();
				setState(79);
				match(PyComa);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				returnStatement();
				setState(84);
				match(PyComa);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				functionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LLAIZQ() { return getToken(miParser.LLAIZQ, 0); }
		public TerminalNode LLADER() { return getToken(miParser.LLADER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LLAIZQ);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAIZQ) | (1L << STYPE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CLASS) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				statement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(LLADER);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			type();
			setState(100);
			match(ID);
			setState(101);
			match(PIZQ);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYPE || _la==ID) {
				{
				setState(102);
				formalParams();
				}
			}

			setState(105);
			match(PDER);
			setState(106);
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

	public static class FormalParamsContext extends ParserRuleContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFormalParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			formalParam();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				formalParam();
				}
				}
				setState(115);
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

	public static class FormalParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			type();
			setState(117);
			match(ID);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miParser.WHILE, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHILE);
			setState(120);
			match(PIZQ);
			setState(121);
			expression();
			setState(122);
			match(PDER);
			setState(123);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miParser.IF, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IF);
			setState(126);
			match(PIZQ);
			setState(127);
			expression();
			setState(128);
			match(PDER);
			setState(129);
			block();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(130);
				match(ELSE);
				setState(131);
				block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(miParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(RETURN);
			setState(135);
			expression();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(miParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PRINT);
			setState(138);
			expression();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(miParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode LLAIZQ() { return getToken(miParser.LLAIZQ, 0); }
		public TerminalNode LLADER() { return getToken(miParser.LLADER, 0); }
		public ClassVariableDeclarationContext classVariableDeclaration() {
			return getRuleContext(ClassVariableDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CLASS);
			setState(141);
			match(ID);
			setState(142);
			match(LLAIZQ);
			{
			setState(143);
			classVariableDeclaration();
			}
			setState(144);
			match(LLADER);
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

	public static class ClassVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVariableDeclarationContext classVariableDeclaration() throws RecognitionException {
		ClassVariableDeclarationContext _localctx = new ClassVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(STYPE);
			setState(147);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(148);
				match(ASSIGN);
				setState(149);
				expression();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			type();
			setState(153);
			match(ID);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(154);
				match(ASSIGN);
				setState(155);
				expression();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(STYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(ID);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STYPE);
			setState(164);
			match(PCIZQ);
			setState(165);
			match(PCDER);
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
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POINT() { return getToken(miParser.POINT, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(168);
				match(POINT);
				setState(169);
				match(ID);
				}
			}

			setState(172);
			match(ASSIGN);
			setState(173);
			expression();
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(176);
			match(PCIZQ);
			setState(177);
			expression();
			setState(178);
			match(PCDER);
			setState(179);
			match(ASSIGN);
			setState(180);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> ROPERATOR() { return getTokens(miParser.ROPERATOR); }
		public TerminalNode ROPERATOR(int i) {
			return getToken(miParser.ROPERATOR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			simpleExpression();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(ROPERATOR);
					setState(184);
					simpleExpression();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AOP() { return getTokens(miParser.AOP); }
		public TerminalNode AOP(int i) {
			return getToken(miParser.AOP, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			term();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(AOP);
					setState(192);
					term();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MOP() { return getTokens(miParser.MOP); }
		public TerminalNode MOP(int i) {
			return getToken(miParser.MOP, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			factor();
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(MOP);
					setState(200);
					factor();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(miParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(miParser.POINT, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public ArrayAllocationExpressionContext arrayAllocationExpression() {
			return getRuleContext(ArrayAllocationExpressionContext.class,0);
		}
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(ID);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(208);
					match(POINT);
					setState(209);
					match(ID);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				arrayLookup();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				arrayLength();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				subExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				arrayAllocationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				allocationExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(221);
				unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode UNARY() { return getToken(miParser.UNARY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(UNARY);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					expression();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitAllocationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocationExpressionContext allocationExpression() throws RecognitionException {
		AllocationExpressionContext _localctx = new AllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_allocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NEW);
			setState(232);
			match(ID);
			setState(233);
			match(PIZQ);
			setState(234);
			match(PDER);
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

	public static class ArrayAllocationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayAllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAllocationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayAllocationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAllocationExpressionContext arrayAllocationExpression() throws RecognitionException {
		ArrayAllocationExpressionContext _localctx = new ArrayAllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayAllocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NEW);
			setState(237);
			match(STYPE);
			setState(238);
			match(PCIZQ);
			setState(239);
			expression();
			setState(240);
			match(PCDER);
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

	public static class SubExpressionContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(PIZQ);
			setState(243);
			expression();
			setState(244);
			match(PDER);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ID);
			setState(247);
			match(PIZQ);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << UNARY) | (1L << NEW) | (1L << ID) | (1L << INTLITERAL) | (1L << REALLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLLITERAL))) != 0)) {
				{
				setState(248);
				actualParams();
				}
			}

			setState(251);
			match(PDER);
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

	public static class ActualParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitActualParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expression();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(254);
				match(COMA);
				setState(255);
				expression();
				}
				}
				setState(260);
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

	public static class ArrayLookupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLookupContext arrayLookup() throws RecognitionException {
		ArrayLookupContext _localctx = new ArrayLookupContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(PCIZQ);
			setState(263);
			expression();
			setState(264);
			match(PCDER);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode POINT() { return getToken(miParser.POINT, 0); }
		public TerminalNode LENGTH() { return getToken(miParser.LENGTH, 0); }
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
			setState(267);
			match(POINT);
			setState(268);
			match(LENGTH);
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
		public TerminalNode INTLITERAL() { return getToken(miParser.INTLITERAL, 0); }
		public TerminalNode REALLITERAL() { return getToken(miParser.REALLITERAL, 0); }
		public TerminalNode BOOLLITERAL() { return getToken(miParser.BOOLLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(miParser.STRINGLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << REALLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLLITERAL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\7\4_\n\4\f\4\16"+
		"\4b\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6"+
		"r\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\3\16\3\16\3\16\5\16\u009f"+
		"\n\16\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\5\21\u00ad\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u00bc\n\23\f\23\16\23\u00bf\13\23\3\24\3\24\3\24\7\24"+
		"\u00c4\n\24\f\24\16\24\u00c7\13\24\3\25\3\25\3\25\7\25\u00cc\n\25\f\25"+
		"\16\25\u00cf\13\25\3\26\3\26\3\26\3\26\7\26\u00d5\n\26\f\26\16\26\u00d8"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e1\n\26\3\27\3\27\7"+
		"\27\u00e5\n\27\f\27\16\27\u00e8\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00fc"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u0103\n\34\f\34\16\34\u0106\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\2\2 \2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\3\3\2#&"+
		"\2\u0116\2A\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\be\3\2\2\2\nn\3\2\2\2\fv\3"+
		"\2\2\2\16y\3\2\2\2\20\177\3\2\2\2\22\u0088\3\2\2\2\24\u008b\3\2\2\2\26"+
		"\u008e\3\2\2\2\30\u0094\3\2\2\2\32\u009a\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5"+
		"\3\2\2\2 \u00a9\3\2\2\2\"\u00b1\3\2\2\2$\u00b8\3\2\2\2&\u00c0\3\2\2\2"+
		"(\u00c8\3\2\2\2*\u00e0\3\2\2\2,\u00e2\3\2\2\2.\u00e9\3\2\2\2\60\u00ee"+
		"\3\2\2\2\62\u00f4\3\2\2\2\64\u00f8\3\2\2\2\66\u00ff\3\2\2\28\u0107\3\2"+
		"\2\2:\u010c\3\2\2\2<\u0110\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE\5\32\16\2EF\7\3\2\2F[\3\2\2\2GH"+
		"\5\26\f\2HI\7\3\2\2I[\3\2\2\2JK\5 \21\2KL\7\3\2\2L[\3\2\2\2MN\5\"\22\2"+
		"NO\7\3\2\2O[\3\2\2\2PQ\5\24\13\2QR\7\3\2\2R[\3\2\2\2S[\5\20\t\2T[\5\16"+
		"\b\2UV\5\22\n\2VW\7\3\2\2W[\3\2\2\2X[\5\b\5\2Y[\5\6\4\2ZD\3\2\2\2ZG\3"+
		"\2\2\2ZJ\3\2\2\2ZM\3\2\2\2ZP\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\`\7\r\2\2]_\5\4\3\2^]\3\2\2\2_b\3\2\2\2`"+
		"^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\16\2\2d\7\3\2\2\2ef\5\34\17"+
		"\2fg\7!\2\2gi\7\13\2\2hj\5\n\6\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2"+
		"\2lm\5\6\4\2m\t\3\2\2\2ns\5\f\7\2op\7\4\2\2pr\5\f\7\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2vw\5\34\17\2wx\7!\2\2x\r"+
		"\3\2\2\2yz\7\31\2\2z{\7\13\2\2{|\5$\23\2|}\7\f\2\2}~\5\6\4\2~\17\3\2\2"+
		"\2\177\u0080\7\27\2\2\u0080\u0081\7\13\2\2\u0081\u0082\5$\23\2\u0082\u0083"+
		"\7\f\2\2\u0083\u0086\5\6\4\2\u0084\u0085\7\30\2\2\u0085\u0087\5\6\4\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2\2\u0088\u0089"+
		"\7\34\2\2\u0089\u008a\5$\23\2\u008a\23\3\2\2\2\u008b\u008c\7\36\2\2\u008c"+
		"\u008d\5$\23\2\u008d\25\3\2\2\2\u008e\u008f\7\35\2\2\u008f\u0090\7!\2"+
		"\2\u0090\u0091\7\r\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\16\2\2\u0093"+
		"\27\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0098\7!\2\2\u0096\u0097\7\b\2"+
		"\2\u0097\u0099\5$\23\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\31"+
		"\3\2\2\2\u009a\u009b\5\34\17\2\u009b\u009e\7!\2\2\u009c\u009d\7\b\2\2"+
		"\u009d\u009f\5$\23\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\33"+
		"\3\2\2\2\u00a0\u00a4\7\22\2\2\u00a1\u00a4\5\36\20\2\u00a2\u00a4\7!\2\2"+
		"\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\35"+
		"\3\2\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\7\17\2\2\u00a7\u00a8\7\20\2"+
		"\2\u00a8\37\3\2\2\2\u00a9\u00ac\7!\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ad"+
		"\7!\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7\b\2\2\u00af\u00b0\5$\23\2\u00b0!\3\2\2\2\u00b1\u00b2\7!\2\2\u00b2"+
		"\u00b3\7\17\2\2\u00b3\u00b4\5$\23\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\7"+
		"\b\2\2\u00b6\u00b7\5$\23\2\u00b7#\3\2\2\2\u00b8\u00bd\5&\24\2\u00b9\u00ba"+
		"\7\21\2\2\u00ba\u00bc\5&\24\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be%\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00c0\u00c5\5(\25\2\u00c1\u00c2\7\24\2\2\u00c2\u00c4\5(\25\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\'\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cd\5*\26\2\u00c9\u00ca"+
		"\7\25\2\2\u00ca\u00cc\5*\26\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00d0\u00e1\5<\37\2\u00d1\u00d6\7!\2\2\u00d2\u00d3\7\6\2\2\u00d3"+
		"\u00d5\7!\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00e1\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00e1\5\64\33\2\u00da\u00e1\58\35\2\u00db\u00e1\5:\36\2\u00dc\u00e1\5"+
		"\62\32\2\u00dd\u00e1\5\60\31\2\u00de\u00e1\5.\30\2\u00df\u00e1\5,\27\2"+
		"\u00e0\u00d0\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00da"+
		"\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1+\3\2\2\2\u00e2\u00e6\7\26\2\2"+
		"\u00e3\u00e5\5$\23\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7-\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7\37\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\7"+
		"\f\2\2\u00ed/\3\2\2\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\7\22\2\2\u00f0"+
		"\u00f1\7\17\2\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\7\20\2\2\u00f3\61\3\2"+
		"\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7\f\2\2\u00f7"+
		"\63\3\2\2\2\u00f8\u00f9\7!\2\2\u00f9\u00fb\7\13\2\2\u00fa\u00fc\5\66\34"+
		"\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\7\f\2\2\u00fe\65\3\2\2\2\u00ff\u0104\5$\23\2\u0100\u0101\7\4\2\2\u0101"+
		"\u0103\5$\23\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\67\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108"+
		"\7!\2\2\u0108\u0109\7\17\2\2\u0109\u010a\5$\23\2\u010a\u010b\7\20\2\2"+
		"\u010b9\3\2\2\2\u010c\u010d\7!\2\2\u010d\u010e\7\6\2\2\u010e\u010f\7 "+
		"\2\2\u010f;\3\2\2\2\u0110\u0111\t\2\2\2\u0111=\3\2\2\2\24AZ`is\u0086\u0098"+
		"\u009e\u00a3\u00ac\u00bd\u00c5\u00cd\u00d6\u00e0\u00e6\u00fb\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}