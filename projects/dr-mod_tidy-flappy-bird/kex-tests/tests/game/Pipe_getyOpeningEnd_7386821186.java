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

public class Pipe_getyOpeningEnd_7386821186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8482;

    public Pipe_getyOpeningEnd_7386821186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8482 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8482, term8482.getClass(), "x", -979568);
        setIntField(term8482, term8482.getClass(), "yOpeningStart", -1422131197);
        setIntField(term8482, term8482.getClass(), "yOpeningEnd", -20399281);
        setIntField(term8482, term8482.getClass(), "width", -830170410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getyOpeningEnd", argTypes, term8482, args);
    }

};


