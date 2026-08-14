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

public class TimingSession_doStop_49503692613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203493;

    public TimingSession_doStop_49503692613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203536 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term203535 = ((Class) term203536).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term203535).setAccessible(true);
        Object enum727 =  ((Field) term203535).get((Object) null);
        Class<? extends Object> term203751 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term203750 = ((Class) term203751).getDeclaredField((String) "USER_TIME");
        ((Field) term203750).setAccessible(true);
        Object enum728 =  ((Field) term203750).get((Object) null);
        Class<? extends Object> term203960 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term203959 = ((Class) term203960).getDeclaredField((String) "CPU_TIME");
        ((Field) term203959).setAccessible(true);
        Object enum729 =  ((Field) term203959).get((Object) null);
        ArrayList term203494 = new ArrayList();
        ((ArrayList) term203494).add(enum727);
        ((ArrayList) term203494).add(enum728);
        ((ArrayList) term203494).add(enum729);
        ((ArrayList) term203494).add(enum727);
        ((ArrayList) term203494).add(enum729);
        ((ArrayList) term203494).add(enum729);
        ((ArrayList) term203494).add(enum729);
        ((ArrayList) term203494).add(enum729);
        ((ArrayList) term203494).add(enum729);
        HashMap term203510 = new HashMap();
        Class<? extends Object> term204166 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term204165 = ((Class) term204166).getDeclaredField((String) "STARTED");
        ((Field) term204165).setAccessible(true);
        Object enum730 = ((Field) term204165).get((Object) null);
        term203493 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term203493, term203493.getClass(), "types", term203494);
        setField(term203493, term203493.getClass(), "counters", term203510);
        setField(term203493, term203493.getClass(), "state", enum730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doStop", argTypes, term203493, args);
    }

};


