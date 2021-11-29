package lang.models;

import com.demo.DemoBaseVisitor;
import com.demo.DemoParser.*;

public class DemoVisitorImpl extends DemoBaseVisitor<Node> {

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
