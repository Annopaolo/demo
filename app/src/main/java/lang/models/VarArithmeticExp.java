package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class VarArithmeticExp implements Expression {

    String variable;

    public VarArithmeticExp(String variable) {
        this.variable = variable;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> val = env.getVariable(variable);
        return val;
    }

}
