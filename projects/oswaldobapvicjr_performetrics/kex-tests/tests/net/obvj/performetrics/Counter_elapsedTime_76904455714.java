package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Counter_elapsedTime_76904455714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221032;
     Object enum802;
     Object enum803;

    public Counter_elapsedTime_76904455714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221113 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term221112 = ((Class) term221113).getDeclaredField((String) "USER_TIME");
        ((Field) term221112).setAccessible(true);
        Object enum800 = ((Field) term221112).get((Object) null);
        Class<? extends Object> term221322 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term221321 = ((Class) term221322).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term221321).setAccessible(true);
        Object enum801 = ((Field) term221321).get((Object) null);
        term221032 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term221032, term221032.getClass(), "type", enum800);
        setField(term221032, term221032.getClass(), "conversionMode", enum801);
        setLongField(term221032, term221032.getClass(), "unitsBefore", -8019730974733786399L);
        setLongField(term221032, term221032.getClass(), "unitsAfter", 394960377236392159L);
        setBooleanField(term221032, term221032.getClass(), "unitsAfterSet", false);
        Class<? extends Object> term221562 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term221561 = ((Class) term221562).getDeclaredField((String) "MICROSECONDS");
        ((Field) term221561).setAccessible(true);
        enum802 = ((Field) term221561).get((Object) null);
        Class<? extends Object> term221750 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term221749 = ((Class) term221750).getDeclaredField((String) "FAST");
        ((Field) term221749).setAccessible(true);
        enum803 = ((Field) term221749).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[1] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[2];
        args[0] = enum802;
        args[1] = enum803;
        callMethod(klass, "elapsedTime", argTypes, term221032, args);
    }

};


