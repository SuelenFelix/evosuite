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

public class UnmodifiableTimingSession_elapsedTime_17264794257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184839;
     Object enum650;
     Object enum651;

    public UnmodifiableTimingSession_elapsedTime_17264794257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term184928 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term184927 = ((Class) term184928).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term184927).setAccessible(true);
        Object enum646 =  ((Field) term184927).get((Object) null);
        Class<? extends Object> term185143 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term185142 = ((Class) term185143).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term185142).setAccessible(true);
        Object enum647 =  ((Field) term185142).get((Object) null);
        ArrayList term184841 = new ArrayList();
        ((ArrayList) term184841).add(enum646);
        ((ArrayList) term184841).add(enum647);
        HashMap term184849 = new HashMap();
        Class<? extends Object> term185370 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term185369 = ((Class) term185370).getDeclaredField((String) "READY");
        ((Field) term185369).setAccessible(true);
        Object enum648 = ((Field) term185369).get((Object) null);
        Class<? extends Object> term185602 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term185601 = ((Class) term185602).getDeclaredField((String) "USER_TIME");
        ((Field) term185601).setAccessible(true);
        Object enum649 =  ((Field) term185601).get((Object) null);
        ArrayList term184866 = new ArrayList();
        ((ArrayList) term184866).add(enum649);
        ((ArrayList) term184866).add(enum647);
        ((ArrayList) term184866).add(enum647);
        ((ArrayList) term184866).add(enum649);
        ((ArrayList) term184866).add(enum647);
        ((ArrayList) term184866).add(enum647);
        HashMap term184874 = new HashMap();
        term184839 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term184840 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term184840, term184840.getClass(), "types", term184841);
        setField(term184840, term184840.getClass(), "counters", term184849);
        setField(term184840, term184840.getClass(), "state", enum648);
        setField(term184839, term184839.getClass(), "timingSession", term184840);
        setField(term184839, term184839.getClass(), "types", term184866);
        setField(term184839, term184839.getClass(), "counters", term184874);
        setField(term184839, term184839.getClass(), "state", enum648);
        Class<? extends Object> term185811 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term185810 = ((Class) term185811).getDeclaredField((String) "CPU_TIME");
        ((Field) term185810).setAccessible(true);
        enum650 = ((Field) term185810).get((Object) null);
        Class<? extends Object> term186017 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term186016 = ((Class) term186017).getDeclaredField((String) "MINUTES");
        ((Field) term186016).setAccessible(true);
        enum651 = ((Field) term186016).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = enum650;
        args[1] = enum651;
        callMethod(klass, "elapsedTime", argTypes, term184839, args);
    }

};


