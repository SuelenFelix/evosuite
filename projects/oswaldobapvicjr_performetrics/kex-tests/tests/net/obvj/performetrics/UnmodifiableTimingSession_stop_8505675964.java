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

public class UnmodifiableTimingSession_stop_8505675964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180915;

    public UnmodifiableTimingSession_stop_8505675964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180976 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term180975 = ((Class) term180976).getDeclaredField((String) "CPU_TIME");
        ((Field) term180975).setAccessible(true);
        Object enum629 =  ((Field) term180975).get((Object) null);
        Class<? extends Object> term181182 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term181181 = ((Class) term181182).getDeclaredField((String) "USER_TIME");
        ((Field) term181181).setAccessible(true);
        Object enum630 =  ((Field) term181181).get((Object) null);
        Class<? extends Object> term181391 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term181390 = ((Class) term181391).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term181390).setAccessible(true);
        Object enum631 =  ((Field) term181390).get((Object) null);
        ArrayList term180917 = new ArrayList();
        ((ArrayList) term180917).add(enum629);
        ((ArrayList) term180917).add(enum630);
        ((ArrayList) term180917).add(enum631);
        ((ArrayList) term180917).add(enum631);
        HashMap term180927 = new HashMap();
        Class<? extends Object> term181606 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term181605 = ((Class) term181606).getDeclaredField((String) "READY");
        ((Field) term181605).setAccessible(true);
        Object enum632 = ((Field) term181605).get((Object) null);
        Class<? extends Object> term181838 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term181837 = ((Class) term181838).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term181837).setAccessible(true);
        Object enum633 =  ((Field) term181837).get((Object) null);
        ArrayList term180944 = new ArrayList();
        ((ArrayList) term180944).add(enum629);
        ((ArrayList) term180944).add(enum633);
        ((ArrayList) term180944).add(enum633);
        HashMap term180952 = new HashMap();
        Class<? extends Object> term182065 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term182064 = ((Class) term182065).getDeclaredField((String) "STARTED");
        ((Field) term182064).setAccessible(true);
        Object enum634 = ((Field) term182064).get((Object) null);
        term180915 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term180916 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term180916, term180916.getClass(), "types", term180917);
        setField(term180916, term180916.getClass(), "counters", term180927);
        setField(term180916, term180916.getClass(), "state", enum632);
        setField(term180915, term180915.getClass(), "timingSession", term180916);
        setField(term180915, term180915.getClass(), "types", term180944);
        setField(term180915, term180915.getClass(), "counters", term180952);
        setField(term180915, term180915.getClass(), "state", enum634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term180915, args);
    }

};


