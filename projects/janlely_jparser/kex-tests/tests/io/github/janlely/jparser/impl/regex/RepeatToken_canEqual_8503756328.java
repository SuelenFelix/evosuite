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

public class RepeatToken_canEqual_8503756328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6829;
     Object term6839;

    public RepeatToken_canEqual_8503756328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6841 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term6840 = ((Class) term6841).getDeclaredField((String) "MANY");
        ((Field) term6840).setAccessible(true);
        Object enum22 = ((Field) term6840).get((Object) null);
        term6829 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term6838 = newInstance(Class.forName("java.lang.Object"));
        setField(term6829, term6829.getClass(), "type", enum22);
        setField(term6829, term6829.getClass(), "value", term6838);
        term6839 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6839;
        callMethod(klass, "canEqual", argTypes, term6829, args);
    }

};


