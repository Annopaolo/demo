package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;
import lang.utils.TypeErrorException;
import lang.utils.TypeUtils;

public class NegBoolExp implements Expression {

    Expression exp;

    public NegBoolExp(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> value = exp.eval(env);
        if (TypeUtils.isBool(value)) {
            return value.map(x -> !x);
        } else {
            throw new TypeErrorException("Can't use an int value for negation: " + exp.toString());
        }
    }

}
