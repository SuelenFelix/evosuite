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

public class Stopwatch_isStarted_1844191110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30183;

    public Stopwatch_isStarted_1844191110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30218 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term30217 = ((Class) term30218).getDeclaredField((String) "STOPPED");
        ((Field) term30217).setAccessible(true);
        Object enum111 = ((Field) term30217).get((Object) null);
        Class<? extends Object> term30436 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term30435 = ((Class) term30436).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term30435).setAccessible(true);
        Object enum112 = ((Field) term30435).get((Object) null);
        Class<? extends Object> term30663 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term30662 = ((Class) term30663).getDeclaredField((String) "CPU_TIME");
        ((Field) term30662).setAccessible(true);
        Object enum113 = ((Field) term30662).get((Object) null);
        Class<? extends Object> term30869 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term30868 = ((Class) term30869).getDeclaredField((String) "USER_TIME");
        ((Field) term30868).setAccessible(true);
        Object enum114 = ((Field) term30868).get((Object) null);
        Class<? extends Object> term31078 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term31077 = ((Class) term31078).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term31077).setAccessible(true);
        Object enum115 = ((Field) term31077).get((Object) null);
        ArrayList term30213 = new ArrayList();
        term30183 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term30195 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term30196 = (Object[]) newArray("java.lang.Object", 4);
        setField(term30183, term30183.getClass(), "state", enum111);
        setElement(term30196, 0, enum112);
        setElement(term30196, 1, enum113);
        setElement(term30196, 2, enum114);
        setElement(term30196, 3, enum115);
        setField(term30195, term30195.getClass(), "elements", term30196);
        setField(term30183, term30183.getClass(), "types", term30195);
        setField(term30183, term30183.getClass(), "sessions", term30213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarted", argTypes, term30183, args);
    }

};


