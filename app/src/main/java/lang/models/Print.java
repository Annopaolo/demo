package lang.models;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;
import static io.vavr.Patterns.$Left;
import static io.vavr.Patterns.$Right;

import io.vavr.control.Either;
import lang.environment.Environment;
import lang.utils.DemoException;

public class Print implements Statement {

    private Expression exp;

    public Print(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Either<Integer, Boolean> eval(Environment env) throws DemoException {
        Either<Integer, Boolean> res = exp.eval(env);
        System.out.println(beautify(res));
        return null;
    }

    private String beautify(Either<Integer, Boolean> value) {
        return Match(value).of(Case($Left($()), (n) -> "" + n), Case($Right($()), (b) -> "" + b));
    }

}
