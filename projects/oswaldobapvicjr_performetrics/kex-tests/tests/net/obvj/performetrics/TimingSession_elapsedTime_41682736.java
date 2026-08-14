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

public class TimingSession_elapsedTime_41682736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196222;
     Object enum695;

    public TimingSession_elapsedTime_41682736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196263 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term196262 = ((Class) term196263).getDeclaredField((String) "USER_TIME");
        ((Field) term196262).setAccessible(true);
        enum695 =  ((Field) term196262).get((Object) null);
        Class<? extends Object> term196472 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term196471 = ((Class) term196472).getDeclaredField((String) "CPU_TIME");
        ((Field) term196471).setAccessible(true);
        Object enum696 =  ((Field) term196471).get((Object) null);
        Class<? extends Object> term196678 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term196677 = ((Class) term196678).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term196677).setAccessible(true);
        Object enum697 =  ((Field) term196677).get((Object) null);
        ArrayList term196223 = new ArrayList();
        ((ArrayList) term196223).add(enum695);
        ((ArrayList) term196223).add(enum696);
        ((ArrayList) term196223).add(enum695);
        ((ArrayList) term196223).add(enum697);
        ((ArrayList) term196223).add(enum696);
        ((ArrayList) term196223).add(enum697);
        ((ArrayList) term196223).add(enum696);
        ((ArrayList) term196223).add(enum696);
        HashMap term196239 = new HashMap();
        Class<? extends Object> term196905 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term196904 = ((Class) term196905).getDeclaredField((String) "READY");
        ((Field) term196904).setAccessible(true);
        Object enum698 = ((Field) term196904).get((Object) null);
        term196222 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term196222, term196222.getClass(), "types", term196223);
        setField(term196222, term196222.getClass(), "counters", term196239);
        setField(term196222, term196222.getClass(), "state", enum698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum695;
        callMethod(klass, "elapsedTime", argTypes, term196222, args);
    }

};


