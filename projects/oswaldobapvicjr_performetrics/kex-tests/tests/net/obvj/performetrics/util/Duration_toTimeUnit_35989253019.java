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
import java.lang.Integer;

public class Duration_toTimeUnit_35989253019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1641;
     Object enum5;
     Object term1663;

    public Duration_toTimeUnit_35989253019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1641 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term1642 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1642, term1642.getClass(), "seconds", 342000L);
        setIntField(term1642, term1642.getClass(), "nanos", 0);
        setField(term1641, term1641.getClass(), "internalDuration", term1642);
        setLongField(term1641, term1641.getClass(), "effectiveTotalSeconds", -5476826692763582090L);
        setIntField(term1641, term1641.getClass(), "effectiveNanoseconds", 1134449235);
        Class<? extends Object> term1666 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1665 = ((Class) term1666).getDeclaredField((String) "DAYS");
        ((Field) term1665).setAccessible(true);
        enum5 = ((Field) term1665).get((Object) null);
        term1663 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum5;
        args[1] = term1663;
        callMethod(klass, "toTimeUnit", argTypes, term1641, args);
    }

};


