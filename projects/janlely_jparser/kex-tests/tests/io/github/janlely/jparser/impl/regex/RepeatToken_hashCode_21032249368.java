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

public class RepeatToken_hashCode_21032249368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17233;

    public RepeatToken_hashCode_21032249368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17244 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term17243 = ((Class) term17244).getDeclaredField((String) "MANY");
        ((Field) term17243).setAccessible(true);
        Object enum44 = ((Field) term17243).get((Object) null);
        term17233 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term17242 = newInstance(Class.forName("java.lang.Object"));
        setField(term17233, term17233.getClass(), "type", enum44);
        setField(term17233, term17233.getClass(), "value", term17242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17233, args);
    }

};


