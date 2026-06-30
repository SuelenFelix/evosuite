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
     Object term6547;
     Object term6561;

    public RepeatToken_equals_16545382616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6563 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term6562 = ((Class) term6563).getDeclaredField((String) "OPTIONAL");
        ((Field) term6562).setAccessible(true);
        Object enum21 = ((Field) term6562).get((Object) null);
        term6547 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term6560 = newInstance(Class.forName("java.lang.Object"));
        setField(term6547, term6547.getClass(), "type", enum21);
        setField(term6547, term6547.getClass(), "value", term6560);
        term6561 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6561;
        callMethod(klass, "equals", argTypes, term6547, args);
    }

};


