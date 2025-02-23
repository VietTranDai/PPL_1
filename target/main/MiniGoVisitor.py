# Generated from main/MiniGo.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MiniGoParser import MiniGoParser
else:
    from MiniGoParser import MiniGoParser

# This class defines a complete generic visitor for a parse tree produced by MiniGoParser.

class MiniGoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MiniGoParser#program.
    def visitProgram(self, ctx:MiniGoParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#decl.
    def visitDecl(self, ctx:MiniGoParser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#mainFuncDecl.
    def visitMainFuncDecl(self, ctx:MiniGoParser.MainFuncDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#vardecl.
    def visitVardecl(self, ctx:MiniGoParser.VardeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#constdecl.
    def visitConstdecl(self, ctx:MiniGoParser.ConstdeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#typedecl.
    def visitTypedecl(self, ctx:MiniGoParser.TypedeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#funcdecl.
    def visitFuncdecl(self, ctx:MiniGoParser.FuncdeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#receiver.
    def visitReceiver(self, ctx:MiniGoParser.ReceiverContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#typeDef.
    def visitTypeDef(self, ctx:MiniGoParser.TypeDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#basictype.
    def visitBasictype(self, ctx:MiniGoParser.BasictypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#structType.
    def visitStructType(self, ctx:MiniGoParser.StructTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#fieldList.
    def visitFieldList(self, ctx:MiniGoParser.FieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#field.
    def visitField(self, ctx:MiniGoParser.FieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#interfaceType.
    def visitInterfaceType(self, ctx:MiniGoParser.InterfaceTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#methodList.
    def visitMethodList(self, ctx:MiniGoParser.MethodListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#method.
    def visitMethod(self, ctx:MiniGoParser.MethodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#method_param_opt.
    def visitMethod_param_opt(self, ctx:MiniGoParser.Method_param_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#method_type_opt.
    def visitMethod_type_opt(self, ctx:MiniGoParser.Method_type_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayType.
    def visitArrayType(self, ctx:MiniGoParser.ArrayTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#dim.
    def visitDim(self, ctx:MiniGoParser.DimContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#intExpr.
    def visitIntExpr(self, ctx:MiniGoParser.IntExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#paramList.
    def visitParamList(self, ctx:MiniGoParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#param.
    def visitParam(self, ctx:MiniGoParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#block.
    def visitBlock(self, ctx:MiniGoParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#stmt_list.
    def visitStmt_list(self, ctx:MiniGoParser.Stmt_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#stmt.
    def visitStmt(self, ctx:MiniGoParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#assignment.
    def visitAssignment(self, ctx:MiniGoParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#assign_op.
    def visitAssign_op(self, ctx:MiniGoParser.Assign_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#ifStmt.
    def visitIfStmt(self, ctx:MiniGoParser.IfStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#ifStmt_else_opt.
    def visitIfStmt_else_opt(self, ctx:MiniGoParser.IfStmt_else_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forStmt.
    def visitForStmt(self, ctx:MiniGoParser.ForStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forClauseComplex.
    def visitForClauseComplex(self, ctx:MiniGoParser.ForClauseComplexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forClause_init.
    def visitForClause_init(self, ctx:MiniGoParser.ForClause_initContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forClause_cond.
    def visitForClause_cond(self, ctx:MiniGoParser.ForClause_condContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forClause_update.
    def visitForClause_update(self, ctx:MiniGoParser.ForClause_updateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forClauseSimple.
    def visitForClauseSimple(self, ctx:MiniGoParser.ForClauseSimpleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forRangeStmt.
    def visitForRangeStmt(self, ctx:MiniGoParser.ForRangeStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#forRange_tail.
    def visitForRange_tail(self, ctx:MiniGoParser.ForRange_tailContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#break_stmt.
    def visitBreak_stmt(self, ctx:MiniGoParser.Break_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#continue_stmt.
    def visitContinue_stmt(self, ctx:MiniGoParser.Continue_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#return_stmt.
    def visitReturn_stmt(self, ctx:MiniGoParser.Return_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#expr.
    def visitExpr(self, ctx:MiniGoParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#logicalOrExpr.
    def visitLogicalOrExpr(self, ctx:MiniGoParser.LogicalOrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#logicalAndExpr.
    def visitLogicalAndExpr(self, ctx:MiniGoParser.LogicalAndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#equalityExpr.
    def visitEqualityExpr(self, ctx:MiniGoParser.EqualityExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#relationalExpr.
    def visitRelationalExpr(self, ctx:MiniGoParser.RelationalExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#additiveExpr.
    def visitAdditiveExpr(self, ctx:MiniGoParser.AdditiveExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#multiplicativeExpr.
    def visitMultiplicativeExpr(self, ctx:MiniGoParser.MultiplicativeExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#unaryExpr.
    def visitUnaryExpr(self, ctx:MiniGoParser.UnaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#primaryExpr.
    def visitPrimaryExpr(self, ctx:MiniGoParser.PrimaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arguments.
    def visitArguments(self, ctx:MiniGoParser.ArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#argumentList.
    def visitArgumentList(self, ctx:MiniGoParser.ArgumentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#callStmt.
    def visitCallStmt(self, ctx:MiniGoParser.CallStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#lhs.
    def visitLhs(self, ctx:MiniGoParser.LhsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayOrStructAccess.
    def visitArrayOrStructAccess(self, ctx:MiniGoParser.ArrayOrStructAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#literal.
    def visitLiteral(self, ctx:MiniGoParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#compositeLiteral.
    def visitCompositeLiteral(self, ctx:MiniGoParser.CompositeLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayCompositeLiteral.
    def visitArrayCompositeLiteral(self, ctx:MiniGoParser.ArrayCompositeLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayLiteralBody.
    def visitArrayLiteralBody(self, ctx:MiniGoParser.ArrayLiteralBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayLiteralElementList.
    def visitArrayLiteralElementList(self, ctx:MiniGoParser.ArrayLiteralElementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayLiteralElement.
    def visitArrayLiteralElement(self, ctx:MiniGoParser.ArrayLiteralElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#arrayLiteral.
    def visitArrayLiteral(self, ctx:MiniGoParser.ArrayLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#nonArrayTypeDef.
    def visitNonArrayTypeDef(self, ctx:MiniGoParser.NonArrayTypeDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#structCompositeLiteral.
    def visitStructCompositeLiteral(self, ctx:MiniGoParser.StructCompositeLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#structLiteralBody.
    def visitStructLiteralBody(self, ctx:MiniGoParser.StructLiteralBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#structLiteralElementList.
    def visitStructLiteralElementList(self, ctx:MiniGoParser.StructLiteralElementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGoParser#structLiteralElement.
    def visitStructLiteralElement(self, ctx:MiniGoParser.StructLiteralElementContext):
        return self.visitChildren(ctx)



del MiniGoParser