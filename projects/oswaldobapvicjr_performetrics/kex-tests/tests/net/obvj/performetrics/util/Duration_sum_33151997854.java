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

public class Duration_sum_33151997854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2364;

    public Duration_sum_33151997854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2364 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        setField(term2364, term2364.getClass(), "internalDuration", null);
        setLongField(term2364, term2364.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term2364, term2364.getClass(), "effectiveNanoseconds", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "sum", argTypes, term2364, args);
    }

};


