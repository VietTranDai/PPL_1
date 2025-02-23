// Generated from main/MiniGo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniGoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniGoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniGoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MiniGoParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#mainFuncDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFuncDecl(MiniGoParser.MainFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(MiniGoParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#constdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdecl(MiniGoParser.ConstdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#typedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedecl(MiniGoParser.TypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#funcdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl(MiniGoParser.FuncdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(MiniGoParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#funcdecl_type_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl_type_opt(MiniGoParser.Funcdecl_type_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(MiniGoParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#basictype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasictype(MiniGoParser.BasictypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(MiniGoParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(MiniGoParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(MiniGoParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(MiniGoParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#methodList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodList(MiniGoParser.MethodListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(MiniGoParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#method_param_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_param_opt(MiniGoParser.Method_param_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#method_type_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_type_opt(MiniGoParser.Method_type_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MiniGoParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(MiniGoParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToID}
	 * labeled alternative in {@link MiniGoParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToID(MiniGoParser.ToIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link MiniGoParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(MiniGoParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link MiniGoParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(MiniGoParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToIntTerm}
	 * labeled alternative in {@link MiniGoParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToIntTerm(MiniGoParser.ToIntTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToIntFactor}
	 * labeled alternative in {@link MiniGoParser#intTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToIntFactor(MiniGoParser.ToIntFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link MiniGoParser#intTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(MiniGoParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link MiniGoParser#intTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(MiniGoParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link MiniGoParser#intTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(MiniGoParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link MiniGoParser#intFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(MiniGoParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesized}
	 * labeled alternative in {@link MiniGoParser#intFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized(MiniGoParser.ParenthesizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(MiniGoParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MiniGoParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniGoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(MiniGoParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MiniGoParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniGoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(MiniGoParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MiniGoParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#ifStmt_else_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt_else_opt(MiniGoParser.IfStmt_else_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MiniGoParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forClauseComplex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClauseComplex(MiniGoParser.ForClauseComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forClause_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause_init(MiniGoParser.ForClause_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forClause_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause_cond(MiniGoParser.ForClause_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forClause_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause_update(MiniGoParser.ForClause_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forClauseSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClauseSimple(MiniGoParser.ForClauseSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forRangeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeStmt(MiniGoParser.ForRangeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#forRange_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRange_tail(MiniGoParser.ForRange_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(MiniGoParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(MiniGoParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MiniGoParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#return_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_expr(MiniGoParser.Return_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(MiniGoParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiniGoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(MiniGoParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(MiniGoParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MiniGoParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MiniGoParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MiniGoParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(MiniGoParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MiniGoParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(MiniGoParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(MiniGoParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MiniGoParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(MiniGoParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#lhs_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs_tail(MiniGoParser.Lhs_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#lhs_tail_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs_tail_item(MiniGoParser.Lhs_tail_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiniGoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#compositeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeLiteral(MiniGoParser.CompositeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#arrayCompositeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCompositeLiteral(MiniGoParser.ArrayCompositeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#arrayLiteralBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralBody(MiniGoParser.ArrayLiteralBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#arrayLiteralElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralElementList(MiniGoParser.ArrayLiteralElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#arrayLiteralElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralElement(MiniGoParser.ArrayLiteralElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#nestedNonArrayCompositeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNonArrayCompositeLiteral(MiniGoParser.NestedNonArrayCompositeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#nonArrayTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayTypeDef(MiniGoParser.NonArrayTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#structCompositeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructCompositeLiteral(MiniGoParser.StructCompositeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#structLiteralBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteralBody(MiniGoParser.StructLiteralBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#structLiteralElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteralElementList(MiniGoParser.StructLiteralElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#structLiteralElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteralElement(MiniGoParser.StructLiteralElementContext ctx);
}