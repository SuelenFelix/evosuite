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

public class Duration_multipliedBy_46589255526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246;
     Object term2252;

    public Duration_multipliedBy_46589255526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2246 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2247 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2247, term2247.getClass(), "seconds", 273600L);
        setIntField(term2247, term2247.getClass(), "nanos", 0);
        setField(term2246, term2246.getClass(), "internalDuration", term2247);
        setLongField(term2246, term2246.getClass(), "effectiveTotalSeconds", -4365849114644724155L);
        setIntField(term2246, term2246.getClass(), "effectiveNanoseconds", -2068769794);
        term2252 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2252;
        callMethod(klass, "multipliedBy", argTypes, term2246, args);
    }

};


