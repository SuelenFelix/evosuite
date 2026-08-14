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

public class RepeatToken_equals_16545382616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16687;
     Object term16701;

    public RepeatToken_equals_16545382616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16703 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term16702 = ((Class) term16703).getDeclaredField((String) "OPTIONAL");
        ((Field) term16702).setAccessible(true);
        Object enum42 = ((Field) term16702).get((Object) null);
        term16687 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term16700 = newInstance(Class.forName("java.lang.Object"));
        setField(term16687, term16687.getClass(), "type", enum42);
        setField(term16687, term16687.getClass(), "value", term16700);
        term16701 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16701;
        callMethod(klass, "equals", argTypes, term16687, args);
    }

};


