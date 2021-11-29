package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;
import lang.utils.TypeErrorException;
import lang.utils.TypeUtils;

public class IfThenElse implements Statement {

    Expression condition;
    Block then;
    Block els;

    public IfThenElse(Expression condition, Block then, Block els) {
        this.condition = condition;
        this.then = then;
        this.els = els;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> cnd = condition.eval(env);
        if (TypeUtils.isBool(cnd)) {
            return compute(cnd.get(), env);
        } else {
            throw new TypeErrorException("Non-boolean value in condition of if block: " + condition.toString());
        }
    }

    private Either<Integer, Boolean> compute(Boolean cnd, Environment env) throws DemoException {
        if (cnd) {
            return then.eval(env);
        } else {
            return els.eval(env);
        }
    }
}
