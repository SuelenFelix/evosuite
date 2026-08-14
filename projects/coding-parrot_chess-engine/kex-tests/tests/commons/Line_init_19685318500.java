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

public class Line_init_19685318500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;
     Object term409;

    public Line_init_19685318500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("game.Cell"));
        setIntField(term406, term406.getClass(), "row", 568599855);
        setIntField(term406, term406.getClass(), "col", 1162663216);
        term409 = newInstance(Class.forName("game.Cell"));
        setIntField(term409, term409.getClass(), "row", 1484323161);
        setIntField(term409, term409.getClass(), "col", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Line");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Cell");
        argTypes[1] = Class.forName("game.Cell");
        Object[] args = new Object[2];
        args[0] = term406;
        args[1] = term409;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


