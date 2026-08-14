package pieces;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static pieces.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class King_getIllegalSquares_199142028210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3883;

    public King_getIllegalSquares_199142028210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3883 = newInstance(Class.forName("pieces.King"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Color");
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("game.Cell");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "getIllegalSquares", argTypes, term3883, args);
    }

};


