package game;

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
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Pipe_getX_16857796903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8465;

    public Pipe_getX_16857796903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8465 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8465, term8465.getClass(), "x", 43200329);
        setIntField(term8465, term8465.getClass(), "yOpeningStart", 998679955);
        setIntField(term8465, term8465.getClass(), "yOpeningEnd", 953741504);
        setIntField(term8465, term8465.getClass(), "width", 1389452261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term8465, args);
    }

};


