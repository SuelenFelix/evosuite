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
import java.lang.Integer;

public class Pipe_setX_133860262414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8560;
     Object term8565;

    public Pipe_setX_133860262414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8560 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8560, term8560.getClass(), "x", 0);
        setIntField(term8560, term8560.getClass(), "yOpeningStart", 0);
        setIntField(term8560, term8560.getClass(), "yOpeningEnd", 0);
        setIntField(term8560, term8560.getClass(), "width", 0);
        term8565 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8565;
        callMethod(klass, "setX", argTypes, term8560, args);
    }

};


