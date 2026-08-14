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
import java.lang.Object;
import java.lang.String;

public class Stopwatch_createStarted_945556584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25630;

    public Stopwatch_createStarted_945556584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25720 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25719 = ((Class) term25720).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term25719).setAccessible(true);
        Object enum91 = ((Field) term25719).get((Object) null);
        Class<? extends Object> term25947 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25946 = ((Class) term25947).getDeclaredField((String) "USER_TIME");
        ((Field) term25946).setAccessible(true);
        Object enum92 = ((Field) term25946).get((Object) null);
        Class<? extends Object> term26156 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term26155 = ((Class) term26156).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term26155).setAccessible(true);
        Object enum93 = ((Field) term26155).get((Object) null);
        term25630 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 5);
        setElement(term25630, 0, enum91);
        setElement(term25630, 1, enum92);
        setElement(term25630, 2, enum93);
        setElement(term25630, 3, enum93);
        setElement(term25630, 4, enum92);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term25630;
        callMethod(klass, "createStarted", argTypes, null, args);
    }

};


