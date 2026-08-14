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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class TimingSession_State_1_stop_16778994572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum356;
     Object term104184;

    public TimingSession_State_1_stop_16778994572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104225 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term104224 = ((Class) term104225).getDeclaredField((String) "READY");
        ((Field) term104224).setAccessible(true);
        enum356 = ((Field) term104224).get((Object) null);
        Class<? extends Object> term104457 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term104456 = ((Class) term104457).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term104456).setAccessible(true);
        Object enum357 =  ((Field) term104456).get((Object) null);
        Class<? extends Object> term104672 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term104671 = ((Class) term104672).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term104671).setAccessible(true);
        Object enum358 =  ((Field) term104671).get((Object) null);
        Class<? extends Object> term104899 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term104898 = ((Class) term104899).getDeclaredField((String) "USER_TIME");
        ((Field) term104898).setAccessible(true);
        Object enum359 =  ((Field) term104898).get((Object) null);
        ArrayList term104185 = new ArrayList();
        ((ArrayList) term104185).add(enum357);
        ((ArrayList) term104185).add(enum358);
        ((ArrayList) term104185).add(enum359);
        ((ArrayList) term104185).add(enum357);
        HashMap term104201 = new HashMap();
        Class<? extends Object> term105108 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term105107 = ((Class) term105108).getDeclaredField((String) "STARTED");
        ((Field) term105107).setAccessible(true);
        Object enum360 = ((Field) term105107).get((Object) null);
        term104184 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term104184, term104184.getClass(), "types", term104185);
        setField(term104184, term104184.getClass(), "counters", term104201);
        setField(term104184, term104184.getClass(), "state", enum360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession$State$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term104184;
        callMethod(klass, "stop", argTypes, enum356, args);
    }

};


