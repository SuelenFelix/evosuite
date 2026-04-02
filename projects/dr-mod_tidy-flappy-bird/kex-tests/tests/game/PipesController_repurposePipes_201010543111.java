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

public class PipesController_repurposePipes_201010543111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;

    public PipesController_repurposePipes_201010543111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329 = newInstance(Class.forName("game.PipesController"));
        setField(term329, term329.getClass(), "pipes", null);
        setField(term329, term329.getClass(), "currentPipe", null);
        setIntField(term329, term329.getClass(), "xMarker", 0);
        setField(term329, term329.getClass(), "lastPipe", null);
        setField(term329, term329.getClass(), "random", null);
        setIntField(term329, term329.getClass(), "activeCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "repurposePipes", argTypes, term329, args);
    }

};


