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

public class Duration_getSeconds_18858309239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896;

    public Duration_getSeconds_18858309239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term897 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term897, term897.getClass(), "seconds", 144000L);
        setIntField(term897, term897.getClass(), "nanos", 0);
        setField(term896, term896.getClass(), "internalDuration", term897);
        setLongField(term896, term896.getClass(), "effectiveTotalSeconds", 5270370404989704783L);
        setIntField(term896, term896.getClass(), "effectiveNanoseconds", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeconds", argTypes, term896, args);
    }

};


