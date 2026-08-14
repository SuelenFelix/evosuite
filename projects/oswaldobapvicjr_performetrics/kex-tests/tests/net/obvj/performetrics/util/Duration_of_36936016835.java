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
import java.lang.Long;

public class Duration_of_36936016835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2297;
     Object term2300;

    public Duration_of_36936016835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2297 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        setField(term2297, term2297.getClass(), "internalDuration", null);
        setLongField(term2297, term2297.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term2297, term2297.getClass(), "effectiveNanoseconds", 0);
        term2300 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.time.temporal.TemporalUnit");
        Object[] args = new Object[2];
        args[0] = term2300;
        args[1] = null;
        callMethod(klass, "of", argTypes, term2297, args);
    }

};


