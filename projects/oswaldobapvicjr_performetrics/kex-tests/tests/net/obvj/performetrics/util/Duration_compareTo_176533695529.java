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

public class Duration_compareTo_176533695529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268;
     Object term2274;

    public Duration_compareTo_176533695529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2268 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2269 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2269, term2269.getClass(), "seconds", 208800L);
        setIntField(term2269, term2269.getClass(), "nanos", 0);
        setField(term2268, term2268.getClass(), "internalDuration", term2269);
        setLongField(term2268, term2268.getClass(), "effectiveTotalSeconds", 1967728129628047933L);
        setIntField(term2268, term2268.getClass(), "effectiveNanoseconds", 1135664017);
        term2274 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2275 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2275, term2275.getClass(), "seconds", 270000L);
        setIntField(term2275, term2275.getClass(), "nanos", 0);
        setField(term2274, term2274.getClass(), "internalDuration", term2275);
        setLongField(term2274, term2274.getClass(), "effectiveTotalSeconds", 2120084523938730454L);
        setIntField(term2274, term2274.getClass(), "effectiveNanoseconds", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[1];
        args[0] = term2274;
        callMethod(klass, "compareTo", argTypes, term2268, args);
    }

};


