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
import java.util.HashMap;
import java.lang.String;

public class UnmodifiableTimingSession_reset_11385785292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178603;

    public UnmodifiableTimingSession_reset_11385785292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term178605 = new ArrayList();
        HashMap term178609 = new HashMap();
        Class<? extends Object> term178659 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term178658 = ((Class) term178659).getDeclaredField((String) "READY");
        ((Field) term178658).setAccessible(true);
        Object enum619 = ((Field) term178658).get((Object) null);
        Class<? extends Object> term178891 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term178890 = ((Class) term178891).getDeclaredField((String) "USER_TIME");
        ((Field) term178890).setAccessible(true);
        Object enum620 =  ((Field) term178890).get((Object) null);
        Class<? extends Object> term179100 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term179099 = ((Class) term179100).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term179099).setAccessible(true);
        Object enum621 =  ((Field) term179099).get((Object) null);
        Class<? extends Object> term179327 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term179326 = ((Class) term179327).getDeclaredField((String) "CPU_TIME");
        ((Field) term179326).setAccessible(true);
        Object enum622 =  ((Field) term179326).get((Object) null);
        Class<? extends Object> term179533 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term179532 = ((Class) term179533).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term179532).setAccessible(true);
        Object enum623 =  ((Field) term179532).get((Object) null);
        ArrayList term178626 = new ArrayList();
        ((ArrayList) term178626).add(enum620);
        ((ArrayList) term178626).add(enum621);
        ((ArrayList) term178626).add(enum622);
        ((ArrayList) term178626).add(enum622);
        ((ArrayList) term178626).add(enum622);
        ((ArrayList) term178626).add(enum623);
        HashMap term178646 = new HashMap();
        term178603 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term178604 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term178604, term178604.getClass(), "types", term178605);
        setField(term178604, term178604.getClass(), "counters", term178609);
        setField(term178604, term178604.getClass(), "state", enum619);
        setField(term178603, term178603.getClass(), "timingSession", term178604);
        setField(term178603, term178603.getClass(), "types", term178626);
        setField(term178603, term178603.getClass(), "counters", term178646);
        setField(term178603, term178603.getClass(), "state", enum619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term178603, args);
    }

};


