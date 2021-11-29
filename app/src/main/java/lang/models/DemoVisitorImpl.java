package lang.models;

import com.demo.DemoBaseVisitor;
import com.demo.DemoParser.*;

import io.vavr.collection.List;

public class DemoVisitorImpl extends DemoBaseVisitor<Node> {

    @Override
    public Node visitProgram(ProgramContext ctx) {
        List<Procedure> procs = List
                .ofAll(ctx.procedure().stream().map(procCtx -> (Procedure) visitProcedure(procCtx)));
        return new Program(procs);
    }

    @Override
    public Node visitProcedure(ProcedureContext ctx) {
        String id = ctx.variable().getText();
        Block body = (Block) visitBlock(ctx.block());
        return new Procedure(id, body);
    }

    @Override
    public Node visitProcedurecall(ProcedurecallContext ctx) {
        String procedureId = ctx.variable().getText();
        return new ProcedureCall(procedureId);
    }

    @Override
    public Node visitSpawn(SpawnContext ctx) {
        String procedureId = ctx.variable().getText();
        return new Spawn(procedureId);
    }

    @Override
    public Node visitBlock(BlockContext ctx) {
        List<Statement> children = List.ofAll(ctx.statement().stream().map(stmtCtx -> visitStatement(stmtCtx)));
        return new Block(children);
    }

    @Override
    public Statement visitStatement(StatementContext ctx) {
        return (Statement) visit(ctx.getChild(0));
    }

    @Override
    public Node visitPrint(PrintContext ctx) {
        // Get the expression
        Expression exp = (Expression) visit(ctx.exp());
        // build the statement
        return new Print(exp);
    }

    @Override
    public Node visitIfthenelse(IfthenelseContext ctx) {
        Expression condition = (Expression) visit(ctx.boolExp());
        Block then = (Block) visitBlock(ctx.then);
        Block els = (Block) visitBlock(ctx.els);
        return new IfThenElse(condition, then, els);
    }

    @Override
    public Node visitAssignment(AssignmentContext ctx) {
        // get expression
        Expression exp = (Expression) visit(ctx.exp());
        // get id of variable
        String id = ctx.variable().getText();
        // construct assignment expression
        return new Assignment(id, exp);
    }

    @Override
    public Node visitDeclaration(DeclarationContext ctx) {
        // get expression
        Expression exp = (Expression) visit(ctx.exp());
        // get id of variable
        String id = ctx.variable().getText();
        // construct assignment expression
        return new Declaration(id, exp);
    }

    @Override
    public Node visitLoop(LoopContext ctx) {
        // get expression
        Expression condition = (Expression) visit(ctx.boolExp());
        // get body
        Block body = (Block) visit(ctx.block());
        return new Loop(condition, body);
    }

    @Override
    public Node visitExp(ExpContext ctx) {
        return (Expression) visit(ctx.getChild(0));
    }

    @Override
    public Node visitNegArithmeticExp(NegArithmeticExpContext ctx) {
        Expression exp = (Expression) visit(ctx.arithmExp());
        return new NegArithmeticExp(exp);
    }

    @Override
    public Node visitValArithmeticExp(ValArithmeticExpContext ctx) {
        Integer val = Integer.parseInt(ctx.integer().NUMBER().getText());
        return new ValArithmeticExp(val);
    }

    @Override
    public Node visitBinArithmeticExp(BinArithmeticExpContext ctx) {
        Expression left = (Expression) visit(ctx.left);
        Expression right = (Expression) visit(ctx.right);
        String operator = ctx.op.getText();
        return new BinArithmeticExp(left, right, operator);
    }

    @Override
    public Node visitBaseArithmeticExp(BaseArithmeticExpContext ctx) {
        return (Expression) visit(ctx.arithmExp());
    }

    @Override
    public Node visitVarArithmeticExp(VarArithmeticExpContext ctx) {
        String variable = ctx.variable().getText();
        return new VarArithmeticExp(variable);
    }

    @Override
    public Node visitBoolComparisonExp(BoolComparisonExpContext ctx) {
        Expression left = (Expression) visit(ctx.left);
        Expression right = (Expression) visit(ctx.right);
        String operator = ctx.op.getText();
        return new BinBoolExp(left, right, operator);
    }

    @Override
    public Node visitNegBoolExp(NegBoolExpContext ctx) {
        Expression exp = (Expression) visit(ctx.boolExp());
        return new NegBoolExp(exp);
    }

    @Override
    public Node visitValBoolExp(ValBoolExpContext ctx) {
        Boolean val = Boolean.parseBoolean(ctx.bool().TF().getText());
        return new ValBoolExp(val);
    }

    @Override
    public Node visitBaseBoolExp(BaseBoolExpContext ctx) {
        return (Expression) visit(ctx.boolExp());
    }

    @Override
    public Node visitArithmeticComparisonExp(ArithmeticComparisonExpContext ctx) {
        Expression left = (Expression) visit(ctx.left);
        Expression right = (Expression) visit(ctx.right);
        String operator = ctx.op.getText();
        return new BinArithmeticExp(left, right, operator);
    }

    @Override
    public Node visitVarBoolExp(VarBoolExpContext ctx) {
        String variable = ctx.variable().getText();
        return new VarBoolExp(variable);
    }

    @Override
    public Node visitBinBoolExp(BinBoolExpContext ctx) {
        Expression left = (Expression) visit(ctx.left);
        Expression right = (Expression) visit(ctx.right);
        String operator = ctx.op.getText();
        return new BinBoolExp(left, right, operator);
    }

    /**
     * {@inheritDoc} We will never get there (hopefully)
     */
    @Override
    public Node visitVariable(VariableContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc} We will never get there (hopefully)
     */
    @Override
    public Node visitInteger(IntegerContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc} We will never get there (hopefully)
     */
    @Override
    public Node visitBool(BoolContext ctx) {
        return visitChildren(ctx);
    }
}
