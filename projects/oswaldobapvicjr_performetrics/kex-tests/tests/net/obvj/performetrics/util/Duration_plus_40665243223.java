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
import java.lang.String;

public class Duration_plus_40665243223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6742;
     Object term6748;
     Object enum23;

    public Duration_plus_40665243223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6742 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6743 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6743, term6743.getClass(), "seconds", 162000L);
        setIntField(term6743, term6743.getClass(), "nanos", 0);
        setField(term6742, term6742.getClass(), "internalDuration", term6743);
        setLongField(term6742, term6742.getClass(), "effectiveTotalSeconds", -4920224193275732920L);
        setIntField(term6742, term6742.getClass(), "effectiveNanoseconds", 865208305);
        term6748 = new Long(8428634514691209827L);
        Class<? extends Object> term6768 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6767 = ((Class) term6768).getDeclaredField((String) "HOURS");
        ((Field) term6767).setAccessible(true);
        enum23 = ((Field) term6767).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term6748;
        args[1] = enum23;
        callMethod(klass, "plus", argTypes, term6742, args);
    }

};


