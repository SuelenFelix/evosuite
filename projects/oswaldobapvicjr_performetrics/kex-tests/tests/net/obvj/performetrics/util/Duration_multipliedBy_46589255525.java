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

public class Duration_multipliedBy_46589255525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6946;
     Object term6952;

    public Duration_multipliedBy_46589255525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6946 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6947 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6947, term6947.getClass(), "seconds", 273600L);
        setIntField(term6947, term6947.getClass(), "nanos", 0);
        setField(term6946, term6946.getClass(), "internalDuration", term6947);
        setLongField(term6946, term6946.getClass(), "effectiveTotalSeconds", -4365849114644724155L);
        setIntField(term6946, term6946.getClass(), "effectiveNanoseconds", -203030934);
        term6952 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6952;
        callMethod(klass, "multipliedBy", argTypes, term6946, args);
    }

};


