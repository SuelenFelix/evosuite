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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class MonitoredRunnable_init_1230676062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2349;

    public MonitoredRunnable_init_1230676062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2394 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term2393 = ((Class) term2394).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term2393).setAccessible(true);
        Object enum9 =  ((Field) term2393).get((Object) null);
        Class<? extends Object> term2609 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term2608 = ((Class) term2609).getDeclaredField((String) "USER_TIME");
        ((Field) term2608).setAccessible(true);
        Object enum10 =  ((Field) term2608).get((Object) null);
        Class<? extends Object> term2818 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term2817 = ((Class) term2818).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term2817).setAccessible(true);
        Object enum11 =  ((Field) term2817).get((Object) null);
        term2349 = new LinkedList();
        ((LinkedList) term2349).add(enum9);
        ((LinkedList) term2349).add(enum10);
        ((LinkedList) term2349).add(enum11);
        ((LinkedList) term2349).add((Object)null);
        ((LinkedList) term2349).add((Object)null);
        ((LinkedList) term2349).add((Object)null);
        ((LinkedList) term2349).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredRunnable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Runnable");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2349;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


