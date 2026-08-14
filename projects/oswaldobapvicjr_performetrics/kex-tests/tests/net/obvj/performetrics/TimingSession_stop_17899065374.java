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

public class TimingSession_stop_17899065374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195033;

    public TimingSession_stop_17899065374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195072 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term195071 = ((Class) term195072).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term195071).setAccessible(true);
        Object enum690 =  ((Field) term195071).get((Object) null);
        Class<? extends Object> term195299 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term195298 = ((Class) term195299).getDeclaredField((String) "USER_TIME");
        ((Field) term195298).setAccessible(true);
        Object enum691 =  ((Field) term195298).get((Object) null);
        ArrayList term195034 = new ArrayList();
        ((ArrayList) term195034).add(enum690);
        ((ArrayList) term195034).add(enum691);
        HashMap term195046 = new HashMap();
        Class<? extends Object> term195508 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term195507 = ((Class) term195508).getDeclaredField((String) "STARTED");
        ((Field) term195507).setAccessible(true);
        Object enum692 = ((Field) term195507).get((Object) null);
        term195033 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term195033, term195033.getClass(), "types", term195034);
        setField(term195033, term195033.getClass(), "counters", term195046);
        setField(term195033, term195033.getClass(), "state", enum692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term195033, args);
    }

};


