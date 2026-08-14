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

public class Stopwatch_State_2_start_7650540141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum377;
     Object term109001;

    public Stopwatch_State_2_start_7650540141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109036 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term109035 = ((Class) term109036).getDeclaredField((String) "STOPPED");
        ((Field) term109035).setAccessible(true);
        enum377 = ((Field) term109035).get((Object) null);
        Class<? extends Object> term109254 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term109253 = ((Class) term109254).getDeclaredField((String) "STOPPED");
        ((Field) term109253).setAccessible(true);
        Object enum378 = ((Field) term109253).get((Object) null);
        Class<? extends Object> term109472 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term109471 = ((Class) term109472).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term109471).setAccessible(true);
        Object enum379 = ((Field) term109471).get((Object) null);
        Class<? extends Object> term109699 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term109698 = ((Class) term109699).getDeclaredField((String) "CPU_TIME");
        ((Field) term109698).setAccessible(true);
        Object enum380 = ((Field) term109698).get((Object) null);
        Class<? extends Object> term109905 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term109904 = ((Class) term109905).getDeclaredField((String) "USER_TIME");
        ((Field) term109904).setAccessible(true);
        Object enum381 = ((Field) term109904).get((Object) null);
        Class<? extends Object> term110114 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term110113 = ((Class) term110114).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term110113).setAccessible(true);
        Object enum382 = ((Field) term110113).get((Object) null);
        ArrayList term109031 = new ArrayList();
        term109001 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term109013 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term109014 = (Object[]) newArray("java.lang.Object", 4);
        setField(term109001, term109001.getClass(), "state", enum378);
        setElement(term109014, 0, enum379);
        setElement(term109014, 1, enum380);
        setElement(term109014, 2, enum381);
        setElement(term109014, 3, enum382);
        setField(term109013, term109013.getClass(), "elements", term109014);
        setField(term109001, term109001.getClass(), "types", term109013);
        setField(term109001, term109001.getClass(), "sessions", term109031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch$State$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Stopwatch");
        Object[] args = new Object[1];
        args[0] = term109001;
        callMethod(klass, "start", argTypes, enum377, args);
    }

};


