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

public class Duration_equals_40737879013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;
     Object term926;

    public Duration_equals_40737879013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term920 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term921 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term921, term921.getClass(), "seconds", 133200L);
        setIntField(term921, term921.getClass(), "nanos", 0);
        setField(term920, term920.getClass(), "internalDuration", term921);
        setLongField(term920, term920.getClass(), "effectiveTotalSeconds", -7237588299778557629L);
        setIntField(term920, term920.getClass(), "effectiveNanoseconds", -1955890973);
        term926 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term926;
        callMethod(klass, "equals", argTypes, term920, args);
    }

};


