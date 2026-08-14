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

public class Duration_getNanoseconds_170681247910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902;

    public Duration_getNanoseconds_170681247910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term902 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term903 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term903, term903.getClass(), "seconds", 93600L);
        setIntField(term903, term903.getClass(), "nanos", 0);
        setField(term902, term902.getClass(), "internalDuration", term903);
        setLongField(term902, term902.getClass(), "effectiveTotalSeconds", 7411271909051562686L);
        setIntField(term902, term902.getClass(), "effectiveNanoseconds", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNanoseconds", argTypes, term902, args);
    }

};


