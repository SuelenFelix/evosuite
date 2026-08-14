package commons;

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
import static commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Utils_getMoves_15416569374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3515;
     Object term3516;

    public Utils_getMoves_15416569374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3515 = newInstance(Class.forName("commons.Utils"));
        term3516 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Utils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.function.BiFunction");
        argTypes[3] = Class.forName("commons.Piece");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3516;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "getMoves", argTypes, term3515, args);
    }

};


