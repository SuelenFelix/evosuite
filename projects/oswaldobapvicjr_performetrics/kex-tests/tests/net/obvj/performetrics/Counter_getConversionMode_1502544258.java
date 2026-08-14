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

public class Counter_getConversionMode_1502544258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217960;

    public Counter_getConversionMode_1502544258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217995 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term217994 = ((Class) term217995).getDeclaredField((String) "CPU_TIME");
        ((Field) term217994).setAccessible(true);
        Object enum787 = ((Field) term217994).get((Object) null);
        Class<? extends Object> term218201 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term218200 = ((Class) term218201).getDeclaredField((String) "FAST");
        ((Field) term218200).setAccessible(true);
        Object enum788 = ((Field) term218200).get((Object) null);
        term217960 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term217960, term217960.getClass(), "type", enum787);
        setField(term217960, term217960.getClass(), "conversionMode", enum788);
        setLongField(term217960, term217960.getClass(), "unitsBefore", 2191130532479601175L);
        setLongField(term217960, term217960.getClass(), "unitsAfter", 860079646007397083L);
        setBooleanField(term217960, term217960.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConversionMode", argTypes, term217960, args);
    }

};


