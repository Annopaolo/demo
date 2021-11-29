package lang.models;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class Program implements Node {

    List<Procedure> procedures;

    public Program(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Block start = env.getProcedure("main");
        start.eval(env);
        return null;
    }

    public Environment collectProcedures(Environment env) throws DemoException {
        for (int i = 0; i < procedures.size(); i++) {
            Procedure f = procedures.get(i);
            env.newProcedure(f.id, f.body);
        }
        return env;
    }

}
