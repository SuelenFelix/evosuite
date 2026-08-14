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

public class TimingSession_State_2_stop_16778994882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum344;
     Object term101335;

    public TimingSession_State_2_stop_16778994882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101377 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term101376 = ((Class) term101377).getDeclaredField((String) "STARTED");
        ((Field) term101376).setAccessible(true);
        enum344 = ((Field) term101376).get((Object) null);
        Class<? extends Object> term101615 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term101614 = ((Class) term101615).getDeclaredField((String) "USER_TIME");
        ((Field) term101614).setAccessible(true);
        Object enum345 =  ((Field) term101614).get((Object) null);
        Class<? extends Object> term101824 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term101823 = ((Class) term101824).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term101823).setAccessible(true);
        Object enum346 =  ((Field) term101823).get((Object) null);
        Class<? extends Object> term102051 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term102050 = ((Class) term102051).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term102050).setAccessible(true);
        Object enum347 =  ((Field) term102050).get((Object) null);
        ArrayList term101336 = new ArrayList();
        ((ArrayList) term101336).add(enum345);
        ((ArrayList) term101336).add(enum346);
        ((ArrayList) term101336).add(enum346);
        ((ArrayList) term101336).add(enum346);
        ((ArrayList) term101336).add(enum346);
        ((ArrayList) term101336).add(enum347);
        HashMap term101352 = new HashMap();
        Class<? extends Object> term102266 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term102265 = ((Class) term102266).getDeclaredField((String) "FINISHED");
        ((Field) term102265).setAccessible(true);
        Object enum348 = ((Field) term102265).get((Object) null);
        term101335 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term101335, term101335.getClass(), "types", term101336);
        setField(term101335, term101335.getClass(), "counters", term101352);
        setField(term101335, term101335.getClass(), "state", enum348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession$State$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term101335;
        callMethod(klass, "stop", argTypes, enum344, args);
    }

};


