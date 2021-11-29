package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;
import lang.utils.TypeErrorException;
import lang.utils.TypeUtils;

public class Loop implements Statement {

    Expression condition;
    Block body;

    public Loop(Expression condition, Block body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> cnd = condition.eval(env);
        if (TypeUtils.isBool(cnd)) {
            while (cnd.get()) {
                body.eval(env);
                Either<Integer, Boolean> newCnd = condition.eval(env);
                cnd = newCnd;
            }
            return null;
        } else {
            throw new TypeErrorException("Non-boolean value in condition of while block: " + condition.toString());
        }
    }
}
