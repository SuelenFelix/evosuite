package net.obvj.performetrics.monitors;

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
import static net.obvj.performetrics.monitors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MonitoredRunnable_init_19655490801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1644;

    public MonitoredRunnable_init_19655490801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1720 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1719 = ((Class) term1720).getDeclaredField((String) "USER_TIME");
        ((Field) term1719).setAccessible(true);
        Object enum6 = ((Field) term1719).get((Object) null);
        Class<? extends Object> term1929 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1928 = ((Class) term1929).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term1928).setAccessible(true);
        Object enum7 = ((Field) term1928).get((Object) null);
        Class<? extends Object> term2144 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term2143 = ((Class) term2144).getDeclaredField((String) "CPU_TIME");
        ((Field) term2143).setAccessible(true);
        Object enum8 = ((Field) term2143).get((Object) null);
        term1644 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 9);
        setElement(term1644, 0, enum6);
        setElement(term1644, 1, enum7);
        setElement(term1644, 2, enum7);
        setElement(term1644, 3, enum6);
        setElement(term1644, 4, enum7);
        setElement(term1644, 5, enum7);
        setElement(term1644, 6, enum8);
        setElement(term1644, 7, enum6);
        setElement(term1644, 8, enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredRunnable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Runnable");
        argTypes[1] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1644;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


