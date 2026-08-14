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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class TimeUnitConverter_convertAndRound_16810821641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2386;
     Object enum8;
     Object enum9;

    public TimeUnitConverter_convertAndRound_16810821641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2386 = new Long(-5892135042702373494L);
        Class<? extends Object> term2432 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2431 = ((Class) term2432).getDeclaredField((String) "SECONDS");
        ((Field) term2431).setAccessible(true);
        enum8 = ((Field) term2431).get((Object) null);
        Class<? extends Object> term2605 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2604 = ((Class) term2605).getDeclaredField((String) "MICROSECONDS");
        ((Field) term2604).setAccessible(true);
        enum9 = ((Field) term2604).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.TimeUnitConverter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[3];
        args[0] = term2386;
        args[1] = enum8;
        args[2] = enum9;
        callMethod(klass, "convertAndRound", argTypes, null, args);
    }

};


