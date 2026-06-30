package io.github.janlely.jparser.impl.regex;

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
import static io.github.janlely.jparser.impl.regex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RepeatToken_toString_16809826709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7357;

    public RepeatToken_toString_16809826709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7372 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term7371 = ((Class) term7372).getDeclaredField((String) "OPTIONAL");
        ((Field) term7371).setAccessible(true);
        Object enum24 = ((Field) term7371).get((Object) null);
        term7357 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term7370 = newInstance(Class.forName("java.lang.Object"));
        setField(term7357, term7357.getClass(), "type", enum24);
        setField(term7357, term7357.getClass(), "value", term7370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7357, args);
    }

};


