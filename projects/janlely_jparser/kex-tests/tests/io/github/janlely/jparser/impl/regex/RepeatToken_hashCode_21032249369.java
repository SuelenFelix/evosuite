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

public class RepeatToken_hashCode_21032249369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7094;

    public RepeatToken_hashCode_21032249369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7105 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term7104 = ((Class) term7105).getDeclaredField((String) "MANY");
        ((Field) term7104).setAccessible(true);
        Object enum23 = ((Field) term7104).get((Object) null);
        term7094 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term7103 = newInstance(Class.forName("java.lang.Object"));
        setField(term7094, term7094.getClass(), "type", enum23);
        setField(term7094, term7094.getClass(), "value", term7103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7094, args);
    }

};


