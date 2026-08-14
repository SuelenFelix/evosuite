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
import java.lang.String;
import java.lang.Object;

public class Color_opponent_10621382387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;

    public Color_opponent_10621382387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term320 = Class.forName((String) "commons.Color");
        Field term319 = ((Class) term320).getDeclaredField((String) "WHITE");
        ((Field) term319).setAccessible(true);
        enum3 = ((Field) term319).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Color");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Color");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "opponent", argTypes, enum3, args);
    }

};


