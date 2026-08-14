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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class UnmodifiableTimingSession_getCounter_5400288410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188919;
     Object enum664;

    public UnmodifiableTimingSession_getCounter_5400288410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188969 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term188968 = ((Class) term188969).getDeclaredField((String) "USER_TIME");
        ((Field) term188968).setAccessible(true);
        enum664 =  ((Field) term188968).get((Object) null);
        Class<? extends Object> term189178 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term189177 = ((Class) term189178).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term189177).setAccessible(true);
        Object enum665 =  ((Field) term189177).get((Object) null);
        Class<? extends Object> term189405 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term189404 = ((Class) term189405).getDeclaredField((String) "CPU_TIME");
        ((Field) term189404).setAccessible(true);
        Object enum666 =  ((Field) term189404).get((Object) null);
        Class<? extends Object> term189611 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term189610 = ((Class) term189611).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term189610).setAccessible(true);
        Object enum667 =  ((Field) term189610).get((Object) null);
        ArrayList term188921 = new ArrayList();
        ((ArrayList) term188921).add(enum664);
        ((ArrayList) term188921).add(enum665);
        ((ArrayList) term188921).add(enum664);
        ((ArrayList) term188921).add(enum666);
        ((ArrayList) term188921).add(enum664);
        ((ArrayList) term188921).add(enum667);
        ((ArrayList) term188921).add(enum665);
        HashMap term188933 = new HashMap();
        Class<? extends Object> term189826 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term189825 = ((Class) term189826).getDeclaredField((String) "STARTED");
        ((Field) term189825).setAccessible(true);
        Object enum668 = ((Field) term189825).get((Object) null);
        ArrayList term188952 = new ArrayList();
        ((ArrayList) term188952).add(enum666);
        ((ArrayList) term188952).add(enum667);
        ((ArrayList) term188952).add(enum666);
        ((ArrayList) term188952).add(enum665);
        ((ArrayList) term188952).add(enum666);
        ((ArrayList) term188952).add(enum667);
        ((ArrayList) term188952).add(enum665);
        ((ArrayList) term188952).add(enum666);
        HashMap term188956 = new HashMap();
        term188919 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term188920 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term188920, term188920.getClass(), "types", term188921);
        setField(term188920, term188920.getClass(), "counters", term188933);
        setField(term188920, term188920.getClass(), "state", enum668);
        setField(term188919, term188919.getClass(), "timingSession", term188920);
        setField(term188919, term188919.getClass(), "types", term188952);
        setField(term188919, term188919.getClass(), "counters", term188956);
        setField(term188919, term188919.getClass(), "state", enum668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum664;
        callMethod(klass, "getCounter", argTypes, term188919, args);
    }

};


