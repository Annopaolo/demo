package lang.utils;

import io.vavr.control.Either;

public class TypeUtils {

    public static Boolean sameType(Either<Integer, Boolean> res1, Either<Integer, Boolean> res2) {
        if ((res1.isLeft() && res2.isRight()) || res1.isRight() && res2.isLeft()) {
            return false;
        }
        return true;
    }

    public static Boolean isBool(Either<Integer, Boolean> value) {
        return value.isRight();
    }

    public static Boolean isInt(Either<Integer, Boolean> value) {
        return value.isLeft();
    }
}
