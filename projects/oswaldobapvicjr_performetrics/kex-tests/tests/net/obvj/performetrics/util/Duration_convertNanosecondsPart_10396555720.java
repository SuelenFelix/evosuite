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

public class Duration_convertNanosecondsPart_10396555720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;
     Object enum6;
     Object term1852;

    public Duration_convertNanosecondsPart_10396555720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1829 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term1830 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1830, term1830.getClass(), "seconds", 352800L);
        setIntField(term1830, term1830.getClass(), "nanos", 0);
        setField(term1829, term1829.getClass(), "internalDuration", term1830);
        setLongField(term1829, term1829.getClass(), "effectiveTotalSeconds", -872011222785455006L);
        setIntField(term1829, term1829.getClass(), "effectiveNanoseconds", 1585847225);
        Class<? extends Object> term1855 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1854 = ((Class) term1855).getDeclaredField((String) "HOURS");
        ((Field) term1854).setAccessible(true);
        enum6 = ((Field) term1854).get((Object) null);
        term1852 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum6;
        args[1] = term1852;
        callMethod(klass, "convertNanosecondsPart", argTypes, term1829, args);
    }

};


