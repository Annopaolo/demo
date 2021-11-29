package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public interface Node {
    /*
     * Interprets the corresponding code in an environment.
     */
    public abstract Either<Integer, Boolean> eval(Environment env) throws DemoException;
}
