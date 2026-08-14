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
import java.lang.String;
import java.lang.Boolean;

public class Duration_toString_20791309517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198;
     Object enum3;
     Object term1212;

    public Duration_toString_20791309517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1198 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term1199 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1199, term1199.getClass(), "seconds", 46800L);
        setIntField(term1199, term1199.getClass(), "nanos", 0);
        setField(term1198, term1198.getClass(), "internalDuration", term1199);
        setLongField(term1198, term1198.getClass(), "effectiveTotalSeconds", -4325723315152823407L);
        setIntField(term1198, term1198.getClass(), "effectiveNanoseconds", 1725571209);
        Class<? extends Object> term1215 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term1214 = ((Class) term1215).getDeclaredField((String) "FULL");
        ((Field) term1214).setAccessible(true);
        enum3 = ((Field) term1214).get((Object) null);
        term1212 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.DurationFormat");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = enum3;
        args[1] = term1212;
        callMethod(klass, "toString", argTypes, term1198, args);
    }

};


