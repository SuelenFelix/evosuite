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

public class Duration_sum_33151997824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6934;
     Object term6940;

    public Duration_sum_33151997824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6934 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6935 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6935, term6935.getClass(), "seconds", 306000L);
        setIntField(term6935, term6935.getClass(), "nanos", 0);
        setField(term6934, term6934.getClass(), "internalDuration", term6935);
        setLongField(term6934, term6934.getClass(), "effectiveTotalSeconds", -2585684163342970173L);
        setIntField(term6934, term6934.getClass(), "effectiveNanoseconds", -1275173084);
        term6940 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6941 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6941, term6941.getClass(), "seconds", 154800L);
        setIntField(term6941, term6941.getClass(), "nanos", 0);
        setField(term6940, term6940.getClass(), "internalDuration", term6941);
        setLongField(term6940, term6940.getClass(), "effectiveTotalSeconds", 8059786003080744426L);
        setIntField(term6940, term6940.getClass(), "effectiveNanoseconds", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[2];
        args[0] = term6934;
        args[1] = term6940;
        callMethod(klass, "sum", argTypes, null, args);
    }

};


