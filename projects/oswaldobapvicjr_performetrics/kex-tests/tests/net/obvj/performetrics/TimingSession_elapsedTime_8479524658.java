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

public class TimingSession_elapsedTime_8479524658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198291;
     Object enum707;
     Object enum708;
     Object enum709;

    public TimingSession_elapsedTime_8479524658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198355 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term198354 = ((Class) term198355).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term198354).setAccessible(true);
        Object enum704 =  ((Field) term198354).get((Object) null);
        Class<? extends Object> term198570 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term198569 = ((Class) term198570).getDeclaredField((String) "USER_TIME");
        ((Field) term198569).setAccessible(true);
        Object enum705 =  ((Field) term198569).get((Object) null);
        ArrayList term198292 = new ArrayList();
        ((ArrayList) term198292).add(enum704);
        ((ArrayList) term198292).add(enum705);
        ((ArrayList) term198292).add(enum705);
        HashMap term198304 = new HashMap();
        Class<? extends Object> term198779 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term198778 = ((Class) term198779).getDeclaredField((String) "READY");
        ((Field) term198778).setAccessible(true);
        Object enum706 = ((Field) term198778).get((Object) null);
        term198291 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term198291, term198291.getClass(), "types", term198292);
        setField(term198291, term198291.getClass(), "counters", term198304);
        setField(term198291, term198291.getClass(), "state", enum706);
        Class<? extends Object> term199011 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term199010 = ((Class) term199011).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term199010).setAccessible(true);
        enum707 = ((Field) term199010).get((Object) null);
        Class<? extends Object> term199238 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term199237 = ((Class) term199238).getDeclaredField((String) "SECONDS");
        ((Field) term199237).setAccessible(true);
        enum708 = ((Field) term199237).get((Object) null);
        Class<? extends Object> term199411 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term199410 = ((Class) term199411).getDeclaredField((String) "FAST");
        ((Field) term199410).setAccessible(true);
        enum709 = ((Field) term199410).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[3];
        args[0] = enum707;
        args[1] = enum708;
        args[2] = enum709;
        callMethod(klass, "elapsedTime", argTypes, term198291, args);
    }

};


