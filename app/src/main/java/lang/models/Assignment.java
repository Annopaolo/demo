package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;
import lang.utils.TypeErrorException;
import lang.utils.TypeUtils;

public class Assignment implements Statement {

    String var;
    Expression exp;

    public Assignment(String var, Expression exp) {
        this.var = var;
        this.exp = exp;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> newValue = exp.eval(env);
        Either<Integer, Boolean> oldValue = env.getVariable(var);
        if (TypeUtils.sameType(newValue, oldValue)) {
            env.setVariable(var, newValue);
            return null;
        } else {
            throw new TypeErrorException("Type error in assignment: old value was " + oldValue.toString()
                    + " and new value is " + newValue.toString());
        }

    }

}
