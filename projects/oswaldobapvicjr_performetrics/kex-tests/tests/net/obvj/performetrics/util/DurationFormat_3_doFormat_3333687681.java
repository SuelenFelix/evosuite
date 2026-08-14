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

public class DurationFormat_3_doFormat_3333687681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum17;
     Object term4482;
     Object term4488;

    public DurationFormat_3_doFormat_3333687681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4491 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term4490 = ((Class) term4491).getDeclaredField((String) "SHORTER");
        ((Field) term4490).setAccessible(true);
        enum17 = ((Field) term4490).get((Object) null);
        term4482 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term4483 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term4483, term4483.getClass(), "seconds", 133200L);
        setIntField(term4483, term4483.getClass(), "nanos", 0);
        setField(term4482, term4482.getClass(), "internalDuration", term4483);
        setLongField(term4482, term4482.getClass(), "effectiveTotalSeconds", 1233889271256172047L);
        setIntField(term4482, term4482.getClass(), "effectiveNanoseconds", -1530420153);
        term4488 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$3");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term4482;
        args[1] = term4488;
        callMethod(klass, "doFormat", argTypes, enum17, args);
    }

};


