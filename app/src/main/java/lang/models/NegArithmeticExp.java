package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;
import lang.utils.TypeErrorException;
import lang.utils.TypeUtils;

public class NegArithmeticExp implements Expression {

    Expression exp;

    public NegArithmeticExp(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> value = exp.eval(env);
        if (TypeUtils.isInt(value)) {
            return value.mapLeft(x -> -x);
        } else {
            throw new TypeErrorException("Can't use a boolean value for subtraction: " + exp.toString());
        }
    }

}
