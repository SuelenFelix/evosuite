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

public class PipesController_checkCurrentPipe_41641915010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public PipesController_checkCurrentPipe_41641915010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("game.PipesController"));
        setField(term326, term326.getClass(), "pipes", null);
        setField(term326, term326.getClass(), "currentPipe", null);
        setIntField(term326, term326.getClass(), "xMarker", 0);
        setField(term326, term326.getClass(), "lastPipe", null);
        setField(term326, term326.getClass(), "random", null);
        setIntField(term326, term326.getClass(), "activeCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkCurrentPipe", argTypes, term326, args);
    }

};


