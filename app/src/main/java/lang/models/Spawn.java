package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class Spawn implements Statement {

    String procedureId;

    public Spawn(String procedureId) {
        this.procedureId = procedureId;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Block block = env.getProcedure(procedureId);

        // We GO
        Runnable task = () -> {
            try {
                block.eval(env.duplicate());
            } catch (Exception e) {
                // Sorry, we need it
                e.printStackTrace();
            }

        };

        Thread thread = new Thread(task);
        thread.start();

        return null;
    }
}
