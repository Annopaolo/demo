package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class Declaration implements Statement {

    String var;
    Expression exp;

    public Declaration(String var, Expression exp) {
        this.var = var;
        this.exp = exp;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> value = exp.eval(env);
        env.newVariable(var, value);
        return null;
    }

}
