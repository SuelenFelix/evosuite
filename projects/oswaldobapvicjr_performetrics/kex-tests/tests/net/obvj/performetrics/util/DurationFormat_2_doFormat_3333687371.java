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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class DurationFormat_2_doFormat_3333687371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum13;
     Object term3464;
     Object term3470;

    public DurationFormat_2_doFormat_3333687371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3473 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term3472 = ((Class) term3473).getDeclaredField((String) "SHORT");
        ((Field) term3472).setAccessible(true);
        enum13 = ((Field) term3472).get((Object) null);
        term3464 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term3465 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term3465, term3465.getClass(), "seconds", 39600L);
        setIntField(term3465, term3465.getClass(), "nanos", 0);
        setField(term3464, term3464.getClass(), "internalDuration", term3465);
        setLongField(term3464, term3464.getClass(), "effectiveTotalSeconds", -484994522244390100L);
        setIntField(term3464, term3464.getClass(), "effectiveNanoseconds", -73683645);
        term3470 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3464;
        args[1] = term3470;
        callMethod(klass, "doFormat", argTypes, enum13, args);
    }

};


