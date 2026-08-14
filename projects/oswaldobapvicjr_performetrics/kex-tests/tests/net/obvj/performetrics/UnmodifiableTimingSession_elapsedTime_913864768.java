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

public class UnmodifiableTimingSession_elapsedTime_913864768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186189;
     Object enum654;
     Object enum657;
     Object enum658;

    public UnmodifiableTimingSession_elapsedTime_913864768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186276 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term186275 = ((Class) term186276).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term186275).setAccessible(true);
        Object enum652 =  ((Field) term186275).get((Object) null);
        Class<? extends Object> term186491 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term186490 = ((Class) term186491).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term186490).setAccessible(true);
        Object enum653 =  ((Field) term186490).get((Object) null);
        Class<? extends Object> term186718 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term186717 = ((Class) term186718).getDeclaredField((String) "USER_TIME");
        ((Field) term186717).setAccessible(true);
        enum654 =  ((Field) term186717).get((Object) null);
        Class<? extends Object> term186927 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term186926 = ((Class) term186927).getDeclaredField((String) "CPU_TIME");
        ((Field) term186926).setAccessible(true);
        Object enum655 =  ((Field) term186926).get((Object) null);
        ArrayList term186191 = new ArrayList();
        ((ArrayList) term186191).add(enum652);
        ((ArrayList) term186191).add(enum653);
        ((ArrayList) term186191).add(enum654);
        ((ArrayList) term186191).add(enum653);
        ((ArrayList) term186191).add(enum652);
        ((ArrayList) term186191).add(enum654);
        ((ArrayList) term186191).add(enum655);
        ((ArrayList) term186191).add(enum655);
        HashMap term186203 = new HashMap();
        Class<? extends Object> term187133 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term187132 = ((Class) term187133).getDeclaredField((String) "STARTED");
        ((Field) term187132).setAccessible(true);
        Object enum656 = ((Field) term187132).get((Object) null);
        ArrayList term186222 = new ArrayList();
        ((ArrayList) term186222).add(enum653);
        ((ArrayList) term186222).add(enum655);
        ((ArrayList) term186222).add(enum655);
        ((ArrayList) term186222).add(enum652);
        ((ArrayList) term186222).add(enum652);
        ((ArrayList) term186222).add(enum654);
        HashMap term186226 = new HashMap();
        term186189 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term186190 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term186190, term186190.getClass(), "types", term186191);
        setField(term186190, term186190.getClass(), "counters", term186203);
        setField(term186190, term186190.getClass(), "state", enum656);
        setField(term186189, term186189.getClass(), "timingSession", term186190);
        setField(term186189, term186189.getClass(), "types", term186222);
        setField(term186189, term186189.getClass(), "counters", term186226);
        setField(term186189, term186189.getClass(), "state", enum656);
        Class<? extends Object> term187371 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term187370 = ((Class) term187371).getDeclaredField((String) "HOURS");
        ((Field) term187370).setAccessible(true);
        enum657 = ((Field) term187370).get((Object) null);
        Class<? extends Object> term187538 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term187537 = ((Class) term187538).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term187537).setAccessible(true);
        enum658 = ((Field) term187537).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[3];
        args[0] = enum654;
        args[1] = enum657;
        args[2] = enum658;
        callMethod(klass, "elapsedTime", argTypes, term186189, args);
    }

};


