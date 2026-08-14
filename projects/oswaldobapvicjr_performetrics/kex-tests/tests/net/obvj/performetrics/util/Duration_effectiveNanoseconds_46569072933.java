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

public class Duration_effectiveNanoseconds_46569072933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2289;

    public Duration_effectiveNanoseconds_46569072933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2289 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        setField(term2289, term2289.getClass(), "internalDuration", null);
        setLongField(term2289, term2289.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term2289, term2289.getClass(), "effectiveNanoseconds", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Duration");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "effectiveNanoseconds", argTypes, term2289, args);
    }

};


