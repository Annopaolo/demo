package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;
import lang.utils.TypeErrorException;
import lang.utils.TypeUtils;

public class BinArithmeticExp implements Expression {

    Expression left;
    Expression right;
    String op;

    public BinArithmeticExp(Expression left, Expression right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> lhs = left.eval(env);
        Either<Integer, Boolean> rhs = right.eval(env);
        if (TypeUtils.sameType(lhs, rhs)) {
            Either<Integer, Boolean> res = compute(lhs, rhs, op);
            return res;
        } else {
            throw new TypeErrorException(
                    "Can't compare values of different types: " + left.toString() + " and " + right.toString());
        }
    }

    private Either<Integer, Boolean> compute(Either<Integer, Boolean> lhs, Either<Integer, Boolean> rhs, String op) {
        Integer val1 = lhs.getLeft();
        Integer val2 = rhs.getLeft();
        switch (op) {
        case "+":
            return Either.left(val1 + val2);
        case "*":
            return Either.left(val1 * val2);
        case "-":
            return Either.left(val1 - val2);
        case "/":
            return Either.left(val1 / val2);
        case "==":
            return Either.right(val1 == val2);
        case "!=":
            return Either.right(val1 != val2);
        case ">":
            return Either.right(val1 > val2);
        case ">=":
            return Either.right(val1 >= val2);
        case "<":
            return Either.right(val1 < val2);
        case "<=":
            return Either.right(val1 <= val2);
        default:
            // We won't ever be there, as the lexer has already verified for us
            return null;
        }
    }
}
