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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class UnmodifiableTimingSession_init_17172191280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177667;

    public UnmodifiableTimingSession_init_17172191280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177711 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term177710 = ((Class) term177711).getDeclaredField((String) "USER_TIME");
        ((Field) term177710).setAccessible(true);
        Object enum615 =  ((Field) term177710).get((Object) null);
        Class<? extends Object> term177920 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term177919 = ((Class) term177920).getDeclaredField((String) "CPU_TIME");
        ((Field) term177919).setAccessible(true);
        Object enum616 =  ((Field) term177919).get((Object) null);
        Class<? extends Object> term178126 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term178125 = ((Class) term178126).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term178125).setAccessible(true);
        Object enum617 =  ((Field) term178125).get((Object) null);
        ArrayList term177668 = new ArrayList();
        ((ArrayList) term177668).add(enum615);
        ((ArrayList) term177668).add(enum616);
        ((ArrayList) term177668).add(enum615);
        ((ArrayList) term177668).add(enum617);
        HashMap term177684 = new HashMap();
        Class<? extends Object> term178341 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term178340 = ((Class) term178341).getDeclaredField((String) "FINISHED");
        ((Field) term178340).setAccessible(true);
        Object enum618 = ((Field) term178340).get((Object) null);
        term177667 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term177667, term177667.getClass(), "types", term177668);
        setField(term177667, term177667.getClass(), "counters", term177684);
        setField(term177667, term177667.getClass(), "state", enum618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term177667;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


