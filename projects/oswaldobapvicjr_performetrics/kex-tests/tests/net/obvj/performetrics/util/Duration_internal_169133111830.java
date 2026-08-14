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

public class Duration_internal_169133111830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2280;

    public Duration_internal_169133111830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2280 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2281 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2281, term2281.getClass(), "seconds", 36000L);
        setIntField(term2281, term2281.getClass(), "nanos", 0);
        setField(term2280, term2280.getClass(), "internalDuration", term2281);
        setLongField(term2280, term2280.getClass(), "effectiveTotalSeconds", 6855071767938501807L);
        setIntField(term2280, term2280.getClass(), "effectiveNanoseconds", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "internal", argTypes, term2280, args);
    }

};


