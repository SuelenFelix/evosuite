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
     Object term6828;
     Object term6838;

    public RepeatToken_canEqual_8503756327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6840 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term6839 = ((Class) term6840).getDeclaredField((String) "MANY");
        ((Field) term6839).setAccessible(true);
        Object enum22 = ((Field) term6839).get((Object) null);
        term6828 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term6837 = newInstance(Class.forName("java.lang.Object"));
        setField(term6828, term6828.getClass(), "type", enum22);
        setField(term6828, term6828.getClass(), "value", term6837);
        term6838 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6838;
        callMethod(klass, "canEqual", argTypes, term6828, args);
    }

};


