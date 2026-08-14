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

public class RepeatToken_canEqual_8503756327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16968;
     Object term16978;

    public RepeatToken_canEqual_8503756327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16980 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term16979 = ((Class) term16980).getDeclaredField((String) "MANY");
        ((Field) term16979).setAccessible(true);
        Object enum43 = ((Field) term16979).get((Object) null);
        term16968 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term16977 = newInstance(Class.forName("java.lang.Object"));
        setField(term16968, term16968.getClass(), "type", enum43);
        setField(term16968, term16968.getClass(), "value", term16977);
        term16978 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16978;
        callMethod(klass, "canEqual", argTypes, term16968, args);
    }

};


