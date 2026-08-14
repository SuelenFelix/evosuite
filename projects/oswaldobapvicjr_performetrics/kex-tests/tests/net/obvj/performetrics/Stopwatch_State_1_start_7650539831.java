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

public class Stopwatch_State_1_start_7650539831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum363;
     Object term105853;

    public Stopwatch_State_1_start_7650539831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105888 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term105887 = ((Class) term105888).getDeclaredField((String) "RUNNING");
        ((Field) term105887).setAccessible(true);
        enum363 = ((Field) term105887).get((Object) null);
        Class<? extends Object> term106106 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term106105 = ((Class) term106106).getDeclaredField((String) "STOPPED");
        ((Field) term106105).setAccessible(true);
        Object enum364 = ((Field) term106105).get((Object) null);
        Class<? extends Object> term106324 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106323 = ((Class) term106324).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term106323).setAccessible(true);
        Object enum365 = ((Field) term106323).get((Object) null);
        Class<? extends Object> term106551 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106550 = ((Class) term106551).getDeclaredField((String) "CPU_TIME");
        ((Field) term106550).setAccessible(true);
        Object enum366 = ((Field) term106550).get((Object) null);
        Class<? extends Object> term106757 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106756 = ((Class) term106757).getDeclaredField((String) "USER_TIME");
        ((Field) term106756).setAccessible(true);
        Object enum367 = ((Field) term106756).get((Object) null);
        Class<? extends Object> term106966 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106965 = ((Class) term106966).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term106965).setAccessible(true);
        Object enum368 = ((Field) term106965).get((Object) null);
        ArrayList term105883 = new ArrayList();
        term105853 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term105865 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term105866 = (Object[]) newArray("java.lang.Object", 4);
        setField(term105853, term105853.getClass(), "state", enum364);
        setElement(term105866, 0, enum365);
        setElement(term105866, 1, enum366);
        setElement(term105866, 2, enum367);
        setElement(term105866, 3, enum368);
        setField(term105865, term105865.getClass(), "elements", term105866);
        setField(term105853, term105853.getClass(), "types", term105865);
        setField(term105853, term105853.getClass(), "sessions", term105883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch$State$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Stopwatch");
        Object[] args = new Object[1];
        args[0] = term105853;
        callMethod(klass, "start", argTypes, enum363, args);
    }

};


