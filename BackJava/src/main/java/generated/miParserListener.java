// Generated from C:/Users/Lester Trejos/Documents/Compi/RepoProyecto1/proyecto1compi/BackJava/src/main/java\miParser.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miParser}.
 */
public interface miParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(miParser.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(miParser.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationST(miParser.VariableDeclarationSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationST(miParser.VariableDeclarationSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationST(miParser.ClassDeclarationSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationST(miParser.ClassDeclarationSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentST(miParser.AssignmentSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentST(miParser.AssignmentSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentST(miParser.ArrayAssignmentSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentST(miParser.ArrayAssignmentSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementST(miParser.PrintStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementST(miParser.PrintStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementST(miParser.IfStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementST(miParser.IfStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementST(miParser.WhileStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementST(miParser.WhileStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementST(miParser.ReturnStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementST(miParser.ReturnStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationST(miParser.FunctionDeclarationSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationST(miParser.FunctionDeclarationSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockST(miParser.BlockSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockST(miParser.BlockSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockAST(miParser.BlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockAST(miParser.BlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarationAST}
	 * labeled alternative in {@link miParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationAST(miParser.FunctionDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarationAST}
	 * labeled alternative in {@link miParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationAST(miParser.FunctionDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamsAST(miParser.FormalParamsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamsAST(miParser.FormalParamsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamAST(miParser.FormalParamASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamAST(miParser.FormalParamASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementAST(miParser.WhileStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementAST(miParser.WhileStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementAST(miParser.IfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementAST(miParser.IfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementAST(miParser.ReturnStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementAST(miParser.ReturnStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link miParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementAST(miParser.PrintStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link miParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementAST(miParser.PrintStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclarationAST}
	 * labeled alternative in {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationAST(miParser.ClassDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclarationAST}
	 * labeled alternative in {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationAST(miParser.ClassDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classVariableDeclarationAST}
	 * labeled alternative in {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclarationAST(miParser.ClassVariableDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classVariableDeclarationAST}
	 * labeled alternative in {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclarationAST(miParser.ClassVariableDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationAST}
	 * labeled alternative in {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAST(miParser.VariableDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationAST}
	 * labeled alternative in {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAST(miParser.VariableDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypeTAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeTAST(miParser.SimpleTypeTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypeTAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeTAST(miParser.SimpleTypeTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeTAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeTAST(miParser.ArrayTypeTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeTAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeTAST(miParser.ArrayTypeTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdTAST(miParser.IdTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdTAST(miParser.IdTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSTAST(miParser.BooleanSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSTAST(miParser.BooleanSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterCharSTAST(miParser.CharSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitCharSTAST(miParser.CharSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterIntSTAST(miParser.IntSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitIntSTAST(miParser.IntSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterStringSTAST(miParser.StringSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringSTAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitStringSTAST(miParser.StringSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeAST(miParser.ArrayTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeAST(miParser.ArrayTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link miParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAST(miParser.AssignmentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link miParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAST(miParser.AssignmentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentAST}
	 * labeled alternative in {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentAST}
	 * labeled alternative in {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(miParser.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(miParser.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermAST(miParser.TermASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermAST(miParser.TermASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterLiteralFAST(miParser.LiteralFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitLiteralFAST(miParser.LiteralFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdFAST(miParser.IdFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdFAST(miParser.IdFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFAST(miParser.FunctionCallFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFAST(miParser.FunctionCallFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLookupFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookupFAST(miParser.ArrayLookupFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLookupFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookupFAST(miParser.ArrayLookupFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthFAST(miParser.ArrayLengthFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthFAST(miParser.ArrayLengthFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpressionFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterSubExpressionFAST(miParser.SubExpressionFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpressionFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitSubExpressionFAST(miParser.SubExpressionFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAllocationExpressionFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpressionFAST(miParser.ArrayAllocationExpressionFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAllocationExpressionFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpressionFAST(miParser.ArrayAllocationExpressionFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allocationExpressionFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpressionFAST(miParser.AllocationExpressionFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allocationExpressionFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpressionFAST(miParser.AllocationExpressionFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryFAST(miParser.UnaryFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryFAST}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryFAST(miParser.UnaryFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAST(miParser.UnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAST(miParser.UnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAllocationExpressionAST}
	 * labeled alternative in {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAllocationExpressionAST}
	 * labeled alternative in {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpressionAST(miParser.SubExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpressionAST(miParser.SubExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallAST(miParser.FunctionCallASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallAST(miParser.FunctionCallASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParamsAST(miParser.ActualParamsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParamsAST(miParser.ActualParamsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookupAST(miParser.ArrayLookupASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookupAST(miParser.ArrayLookupASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthAST(miParser.ArrayLengthASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthAST(miParser.ArrayLengthASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLAST(miParser.IntLASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLAST(miParser.IntLASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterRealLAST(miParser.RealLASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitRealLAST(miParser.RealLASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLAST(miParser.BoolLASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLAST(miParser.BoolLASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLAST(miParser.StringLASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLAST}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLAST(miParser.StringLASTContext ctx);
}