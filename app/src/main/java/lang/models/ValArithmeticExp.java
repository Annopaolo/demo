package lang.models;

import io.vavr.control.Either;
import lang.environment.Environment;

public class ValArithmeticExp implements Expression {

    Integer value;

    public ValArithmeticExp(Integer value) {
        this.value = value;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) {
        return Either.left(value);
    }

}
