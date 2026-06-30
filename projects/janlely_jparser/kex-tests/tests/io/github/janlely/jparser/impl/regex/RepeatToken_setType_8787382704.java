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

public class RepeatToken_setType_8787382704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5740;
     Object enum19;

    public RepeatToken_setType_8787382704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5761 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term5760 = ((Class) term5761).getDeclaredField((String) "SOME");
        ((Field) term5760).setAccessible(true);
        Object enum18 = ((Field) term5760).get((Object) null);
        term5740 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term5749 = newInstance(Class.forName("java.lang.Object"));
        setField(term5740, term5740.getClass(), "type", enum18);
        setField(term5740, term5740.getClass(), "value", term5749);
        Class<? extends Object> term6015 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term6014 = ((Class) term6015).getDeclaredField((String) "REPEAT");
        ((Field) term6014).setAccessible(true);
        enum19 = ((Field) term6014).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RepeatType");
        Object[] args = new Object[1];
        args[0] = enum19;
        callMethod(klass, "setType", argTypes, term5740, args);
    }

};


