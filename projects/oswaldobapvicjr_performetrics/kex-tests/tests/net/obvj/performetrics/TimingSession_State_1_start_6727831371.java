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

public class TimingSession_State_1_start_6727831371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum351;
     Object term103026;

    public TimingSession_State_1_start_6727831371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103065 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term103064 = ((Class) term103065).getDeclaredField((String) "READY");
        ((Field) term103064).setAccessible(true);
        enum351 = ((Field) term103064).get((Object) null);
        Class<? extends Object> term103297 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103296 = ((Class) term103297).getDeclaredField((String) "USER_TIME");
        ((Field) term103296).setAccessible(true);
        Object enum352 =  ((Field) term103296).get((Object) null);
        Class<? extends Object> term103506 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103505 = ((Class) term103506).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term103505).setAccessible(true);
        Object enum353 =  ((Field) term103505).get((Object) null);
        Class<? extends Object> term103733 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103732 = ((Class) term103733).getDeclaredField((String) "CPU_TIME");
        ((Field) term103732).setAccessible(true);
        Object enum354 =  ((Field) term103732).get((Object) null);
        ArrayList term103027 = new ArrayList();
        ((ArrayList) term103027).add(enum352);
        ((ArrayList) term103027).add(enum353);
        ((ArrayList) term103027).add(enum354);
        ((ArrayList) term103027).add(enum352);
        ((ArrayList) term103027).add(enum354);
        HashMap term103043 = new HashMap();
        Class<? extends Object> term103939 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term103938 = ((Class) term103939).getDeclaredField((String) "READY");
        ((Field) term103938).setAccessible(true);
        Object enum355 = ((Field) term103938).get((Object) null);
        term103026 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term103026, term103026.getClass(), "types", term103027);
        setField(term103026, term103026.getClass(), "counters", term103043);
        setField(term103026, term103026.getClass(), "state", enum355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession$State$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term103026;
        callMethod(klass, "start", argTypes, enum351, args);
    }

};


