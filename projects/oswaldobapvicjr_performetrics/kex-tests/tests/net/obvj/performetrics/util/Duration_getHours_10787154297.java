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

public class Duration_getHours_10787154297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;

    public Duration_getHours_10787154297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term885 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term885, term885.getClass(), "seconds", 194400L);
        setIntField(term885, term885.getClass(), "nanos", 0);
        setField(term884, term884.getClass(), "internalDuration", term885);
        setLongField(term884, term884.getClass(), "effectiveTotalSeconds", -8257434502486459194L);
        setIntField(term884, term884.getClass(), "effectiveNanoseconds", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term884, args);
    }

};


