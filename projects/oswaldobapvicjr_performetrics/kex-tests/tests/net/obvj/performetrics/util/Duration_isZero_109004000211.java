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

public class Duration_isZero_109004000211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908;

    public Duration_isZero_109004000211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term908 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term909 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term909, term909.getClass(), "seconds", 129600L);
        setIntField(term909, term909.getClass(), "nanos", 0);
        setField(term908, term908.getClass(), "internalDuration", term909);
        setLongField(term908, term908.getClass(), "effectiveTotalSeconds", 4872422362414183754L);
        setIntField(term908, term908.getClass(), "effectiveNanoseconds", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isZero", argTypes, term908, args);
    }

};


