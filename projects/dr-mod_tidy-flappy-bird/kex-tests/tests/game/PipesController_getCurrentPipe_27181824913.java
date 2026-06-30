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

public class PipesController_getCurrentPipe_27181824913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;

    public PipesController_getCurrentPipe_27181824913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("game.PipesController"));
        setField(term335, term335.getClass(), "pipes", null);
        setField(term335, term335.getClass(), "currentPipe", null);
        setIntField(term335, term335.getClass(), "xMarker", 0);
        setField(term335, term335.getClass(), "lastPipe", null);
        setField(term335, term335.getClass(), "random", null);
        setIntField(term335, term335.getClass(), "activeCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentPipe", argTypes, term335, args);
    }

};


