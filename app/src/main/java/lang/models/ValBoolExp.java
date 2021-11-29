package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;

public class ValBoolExp implements Expression {

    Boolean value;

    public ValBoolExp(Boolean value) {
        this.value = value;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) {
        return Either.right(value);
    }

}
