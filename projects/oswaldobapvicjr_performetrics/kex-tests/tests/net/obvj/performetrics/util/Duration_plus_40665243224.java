package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class Duration_plus_40665243224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2042;
     Object term2048;
     Object enum7;

    public Duration_plus_40665243224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2042 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2043 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2043, term2043.getClass(), "seconds", 162000L);
        setIntField(term2043, term2043.getClass(), "nanos", 0);
        setField(term2042, term2042.getClass(), "internalDuration", term2043);
        setLongField(term2042, term2042.getClass(), "effectiveTotalSeconds", -4920224193275732920L);
        setIntField(term2042, term2042.getClass(), "effectiveNanoseconds", 1048535127);
        term2048 = new Long(8428634514691209827L);
        Class<? extends Object> term2068 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2067 = ((Class) term2068).getDeclaredField((String) "HOURS");
        ((Field) term2067).setAccessible(true);
        enum7 = ((Field) term2067).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term2048;
        args[1] = enum7;
        callMethod(klass, "plus", argTypes, term2042, args);
    }

};


