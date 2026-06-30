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

public class RepeatToken_getValue_10431250670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4941;

    public RepeatToken_getValue_10431250670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4952 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term4951 = ((Class) term4952).getDeclaredField((String) "SOME");
        ((Field) term4951).setAccessible(true);
        Object enum15 = ((Field) term4951).get((Object) null);
        term4941 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term4950 = newInstance(Class.forName("java.lang.Object"));
        setField(term4941, term4941.getClass(), "type", enum15);
        setField(term4941, term4941.getClass(), "value", term4950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term4941, args);
    }

};


