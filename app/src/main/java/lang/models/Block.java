package lang.models;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class Block implements Node {

    List<Statement> children;

    public Block(List<Statement> children) {
        this.children = children;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        env.newScope();
        for (int i = 0; i < children.size(); i++) {
            children.get(i).eval(env);
        }
        env.exitScope();
        return null;
    }
}
