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

public class Move_hashCode_23644072415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2555;

    public Move_hashCode_23644072415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2555 = newInstance(Class.forName("game.Move"));
        setField(term2555, term2555.getClass(), "piece", null);
        setField(term2555, term2555.getClass(), "target", null);
        setBooleanField(term2555, term2555.getClass(), "captureMove", false);
        setField(term2555, term2555.getClass(), "captureCell", null);
        setField(term2555, term2555.getClass(), "promoteTo", null);
        setIntField(term2555, term2555.getClass(), "id", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2555, args);
    }

};


