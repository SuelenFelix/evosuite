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

public class MonitoredCallable_init_19394777641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MonitoredCallable_init_19394777641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term194 = ((Class) term195).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term194).setAccessible(true);
        Object enum0 = ((Field) term194).get((Object) null);
        Class<? extends Object> term422 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term421 = ((Class) term422).getDeclaredField((String) "CPU_TIME");
        ((Field) term421).setAccessible(true);
        Object enum1 = ((Field) term421).get((Object) null);
        Class<? extends Object> term628 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term627 = ((Class) term628).getDeclaredField((String) "USER_TIME");
        ((Field) term627).setAccessible(true);
        Object enum2 = ((Field) term627).get((Object) null);
        term1 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 5);
        setElement(term1, 0, enum0);
        setElement(term1, 1, enum1);
        setElement(term1, 2, enum1);
        setElement(term1, 3, enum0);
        setElement(term1, 4, enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredCallable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        argTypes[1] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


