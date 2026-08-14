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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class TimingSession_init_14829607890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191820;

    public TimingSession_init_14829607890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191862 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term191861 = ((Class) term191862).getDeclaredField((String) "CPU_TIME");
        ((Field) term191861).setAccessible(true);
        Object enum676 =  ((Field) term191861).get((Object) null);
        Class<? extends Object> term192068 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term192067 = ((Class) term192068).getDeclaredField((String) "USER_TIME");
        ((Field) term192067).setAccessible(true);
        Object enum677 =  ((Field) term192067).get((Object) null);
        Class<? extends Object> term192277 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term192276 = ((Class) term192277).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term192276).setAccessible(true);
        Object enum678 =  ((Field) term192276).get((Object) null);
        term191820 = new LinkedList();
        ((LinkedList) term191820).add(enum676);
        ((LinkedList) term191820).add(enum677);
        ((LinkedList) term191820).add(enum678);
        ((LinkedList) term191820).add(enum677);
        ((LinkedList) term191820).add((Object)null);
        ((LinkedList) term191820).add((Object)null);
        ((LinkedList) term191820).add((Object)null);
        ((LinkedList) term191820).add((Object)null);
        ((LinkedList) term191820).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term191820;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


