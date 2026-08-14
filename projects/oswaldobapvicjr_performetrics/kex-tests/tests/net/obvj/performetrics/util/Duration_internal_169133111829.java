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

public class Duration_internal_169133111829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6980;

    public Duration_internal_169133111829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6980 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6981 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6981, term6981.getClass(), "seconds", 36000L);
        setIntField(term6981, term6981.getClass(), "nanos", 0);
        setField(term6980, term6980.getClass(), "internalDuration", term6981);
        setLongField(term6980, term6980.getClass(), "effectiveTotalSeconds", 6855071767938501807L);
        setIntField(term6980, term6980.getClass(), "effectiveNanoseconds", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "internal", argTypes, term6980, args);
    }

};


