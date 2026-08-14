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

public class RepeatToken_equals_16545382617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6548;
     Object term6562;

    public RepeatToken_equals_16545382617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6564 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term6563 = ((Class) term6564).getDeclaredField((String) "OPTIONAL");
        ((Field) term6563).setAccessible(true);
        Object enum21 = ((Field) term6563).get((Object) null);
        term6548 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term6561 = newInstance(Class.forName("java.lang.Object"));
        setField(term6548, term6548.getClass(), "type", enum21);
        setField(term6548, term6548.getClass(), "value", term6561);
        term6562 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6562;
        callMethod(klass, "equals", argTypes, term6548, args);
    }

};


