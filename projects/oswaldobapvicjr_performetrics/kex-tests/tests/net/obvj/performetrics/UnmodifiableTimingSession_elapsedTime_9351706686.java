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

public class UnmodifiableTimingSession_elapsedTime_9351706686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183693;
     Object enum645;

    public UnmodifiableTimingSession_elapsedTime_9351706686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term183745 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term183744 = ((Class) term183745).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term183744).setAccessible(true);
        Object enum641 =  ((Field) term183744).get((Object) null);
        Class<? extends Object> term183960 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term183959 = ((Class) term183960).getDeclaredField((String) "CPU_TIME");
        ((Field) term183959).setAccessible(true);
        Object enum642 =  ((Field) term183959).get((Object) null);
        ArrayList term183695 = new ArrayList();
        ((ArrayList) term183695).add(enum641);
        ((ArrayList) term183695).add(enum642);
        ((ArrayList) term183695).add(enum642);
        HashMap term183703 = new HashMap();
        Class<? extends Object> term184166 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term184165 = ((Class) term184166).getDeclaredField((String) "STARTED");
        ((Field) term184165).setAccessible(true);
        Object enum643 = ((Field) term184165).get((Object) null);
        Class<? extends Object> term184404 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term184403 = ((Class) term184404).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term184403).setAccessible(true);
        Object enum644 =  ((Field) term184403).get((Object) null);
        ArrayList term183722 = new ArrayList();
        ((ArrayList) term183722).add(enum644);
        HashMap term183730 = new HashMap();
        term183693 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term183694 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term183694, term183694.getClass(), "types", term183695);
        setField(term183694, term183694.getClass(), "counters", term183703);
        setField(term183694, term183694.getClass(), "state", enum643);
        setField(term183693, term183693.getClass(), "timingSession", term183694);
        setField(term183693, term183693.getClass(), "types", term183722);
        setField(term183693, term183693.getClass(), "counters", term183730);
        setField(term183693, term183693.getClass(), "state", enum643);
        Class<? extends Object> term184631 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term184630 = ((Class) term184631).getDeclaredField((String) "USER_TIME");
        ((Field) term184630).setAccessible(true);
        enum645 = ((Field) term184630).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum645;
        callMethod(klass, "elapsedTime", argTypes, term183693, args);
    }

};


