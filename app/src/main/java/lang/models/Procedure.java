package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class Procedure implements Node {

    String id;
    Block body;

    public Procedure(String id, Block body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        return null;
    }

}
