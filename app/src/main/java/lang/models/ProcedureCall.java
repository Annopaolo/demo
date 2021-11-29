package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class ProcedureCall implements Statement {

    String procedureId;

    public ProcedureCall(String procedureId) {
        this.procedureId = procedureId;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        // some checks
        Block block = env.getProcedure(procedureId);
        return block.eval(env);
    }

}
