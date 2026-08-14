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

public class Duration_of_139522330933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6992;
     Object term6995;

    public Duration_of_139522330933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6992 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        setField(term6992, term6992.getClass(), "internalDuration", null);
        setLongField(term6992, term6992.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term6992, term6992.getClass(), "effectiveNanoseconds", 0);
        term6995 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term6995;
        args[1] = null;
        callMethod(klass, "of", argTypes, term6992, args);
    }

};


