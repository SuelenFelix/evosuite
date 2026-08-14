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

public class Duration_dividedBy_169979951726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6954;
     Object term6960;

    public Duration_dividedBy_169979951726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6954 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6955 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6955, term6955.getClass(), "seconds", 46800L);
        setIntField(term6955, term6955.getClass(), "nanos", 0);
        setField(term6954, term6954.getClass(), "internalDuration", term6955);
        setLongField(term6954, term6954.getClass(), "effectiveTotalSeconds", 7009926388951271268L);
        setIntField(term6954, term6954.getClass(), "effectiveNanoseconds", -1179120542);
        term6960 = new Long(-7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6960;
        callMethod(klass, "dividedBy", argTypes, term6954, args);
    }

};


