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

public class RepeatToken_RepeatTokenBuilder_value_9961500172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9558;
     Object term9569;

    public RepeatToken_RepeatTokenBuilder_value_9961500172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9571 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term9570 = ((Class) term9571).getDeclaredField((String) "RANGE");
        ((Field) term9570).setAccessible(true);
        Object enum31 = ((Field) term9570).get((Object) null);
        term9558 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder"));
        Object term9568 = newInstance(Class.forName("java.lang.Object"));
        setField(term9558, term9558.getClass(), "type", enum31);
        setField(term9558, term9558.getClass(), "value", term9568);
        term9569 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9569;
        callMethod(klass, "value", argTypes, term9558, args);
    }

};


