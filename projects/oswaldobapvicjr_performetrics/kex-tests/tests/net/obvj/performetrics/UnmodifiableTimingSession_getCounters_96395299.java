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

public class UnmodifiableTimingSession_getCounters_96395299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187777;

    public UnmodifiableTimingSession_getCounters_96395299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term187831 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term187830 = ((Class) term187831).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term187830).setAccessible(true);
        Object enum659 =  ((Field) term187830).get((Object) null);
        ArrayList term187779 = new ArrayList();
        ((ArrayList) term187779).add(enum659);
        HashMap term187785 = new HashMap();
        Class<? extends Object> term188046 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term188045 = ((Class) term188046).getDeclaredField((String) "READY");
        ((Field) term188045).setAccessible(true);
        Object enum660 = ((Field) term188045).get((Object) null);
        Class<? extends Object> term188278 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term188277 = ((Class) term188278).getDeclaredField((String) "USER_TIME");
        ((Field) term188277).setAccessible(true);
        Object enum661 =  ((Field) term188277).get((Object) null);
        Class<? extends Object> term188487 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term188486 = ((Class) term188487).getDeclaredField((String) "CPU_TIME");
        ((Field) term188486).setAccessible(true);
        Object enum662 =  ((Field) term188486).get((Object) null);
        Class<? extends Object> term188693 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term188692 = ((Class) term188693).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term188692).setAccessible(true);
        Object enum663 =  ((Field) term188692).get((Object) null);
        ArrayList term187802 = new ArrayList();
        ((ArrayList) term187802).add(enum661);
        ((ArrayList) term187802).add(enum662);
        ((ArrayList) term187802).add(enum661);
        ((ArrayList) term187802).add(enum663);
        HashMap term187818 = new HashMap();
        term187777 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term187778 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term187778, term187778.getClass(), "types", term187779);
        setField(term187778, term187778.getClass(), "counters", term187785);
        setField(term187778, term187778.getClass(), "state", enum660);
        setField(term187777, term187777.getClass(), "timingSession", term187778);
        setField(term187777, term187777.getClass(), "types", term187802);
        setField(term187777, term187777.getClass(), "counters", term187818);
        setField(term187777, term187777.getClass(), "state", enum660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounters", argTypes, term187777, args);
    }

};


