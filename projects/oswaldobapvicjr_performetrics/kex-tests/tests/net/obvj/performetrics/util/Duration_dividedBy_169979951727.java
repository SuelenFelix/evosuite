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

public class Duration_dividedBy_169979951727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2254;
     Object term2260;

    public Duration_dividedBy_169979951727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2254 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2255 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2255, term2255.getClass(), "seconds", 46800L);
        setIntField(term2255, term2255.getClass(), "nanos", 0);
        setField(term2254, term2254.getClass(), "internalDuration", term2255);
        setLongField(term2254, term2254.getClass(), "effectiveTotalSeconds", 7009926388951271268L);
        setIntField(term2254, term2254.getClass(), "effectiveNanoseconds", -117576464);
        term2260 = new Long(-7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2260;
        callMethod(klass, "dividedBy", argTypes, term2254, args);
    }

};


