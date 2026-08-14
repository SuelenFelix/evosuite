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

public class TimingSession_State_2_start_6727831681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum339;
     Object term100157;

    public TimingSession_State_2_start_6727831681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100198 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term100197 = ((Class) term100198).getDeclaredField((String) "STARTED");
        ((Field) term100197).setAccessible(true);
        enum339 = ((Field) term100197).get((Object) null);
        Class<? extends Object> term100436 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100435 = ((Class) term100436).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term100435).setAccessible(true);
        Object enum340 =  ((Field) term100435).get((Object) null);
        Class<? extends Object> term100663 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100662 = ((Class) term100663).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term100662).setAccessible(true);
        Object enum341 =  ((Field) term100662).get((Object) null);
        Class<? extends Object> term100878 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100877 = ((Class) term100878).getDeclaredField((String) "CPU_TIME");
        ((Field) term100877).setAccessible(true);
        Object enum342 =  ((Field) term100877).get((Object) null);
        ArrayList term100158 = new ArrayList();
        ((ArrayList) term100158).add(enum340);
        ((ArrayList) term100158).add(enum340);
        ((ArrayList) term100158).add(enum341);
        ((ArrayList) term100158).add(enum342);
        HashMap term100174 = new HashMap();
        Class<? extends Object> term101084 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term101083 = ((Class) term101084).getDeclaredField((String) "STARTED");
        ((Field) term101083).setAccessible(true);
        Object enum343 = ((Field) term101083).get((Object) null);
        term100157 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term100157, term100157.getClass(), "types", term100158);
        setField(term100157, term100157.getClass(), "counters", term100174);
        setField(term100157, term100157.getClass(), "state", enum343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession$State$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term100157;
        callMethod(klass, "start", argTypes, enum339, args);
    }

};


