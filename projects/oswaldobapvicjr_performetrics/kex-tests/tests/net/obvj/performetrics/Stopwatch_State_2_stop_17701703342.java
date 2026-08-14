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

public class Stopwatch_State_2_stop_17701703342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum383;
     Object term110342;

    public Stopwatch_State_2_stop_17701703342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110377 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term110376 = ((Class) term110377).getDeclaredField((String) "STOPPED");
        ((Field) term110376).setAccessible(true);
        enum383 = ((Field) term110376).get((Object) null);
        Class<? extends Object> term110595 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term110594 = ((Class) term110595).getDeclaredField((String) "STOPPED");
        ((Field) term110594).setAccessible(true);
        Object enum384 = ((Field) term110594).get((Object) null);
        Class<? extends Object> term110813 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term110812 = ((Class) term110813).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term110812).setAccessible(true);
        Object enum385 = ((Field) term110812).get((Object) null);
        Class<? extends Object> term111040 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term111039 = ((Class) term111040).getDeclaredField((String) "CPU_TIME");
        ((Field) term111039).setAccessible(true);
        Object enum386 = ((Field) term111039).get((Object) null);
        Class<? extends Object> term111246 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term111245 = ((Class) term111246).getDeclaredField((String) "USER_TIME");
        ((Field) term111245).setAccessible(true);
        Object enum387 = ((Field) term111245).get((Object) null);
        Class<? extends Object> term111455 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term111454 = ((Class) term111455).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term111454).setAccessible(true);
        Object enum388 = ((Field) term111454).get((Object) null);
        ArrayList term110372 = new ArrayList();
        term110342 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term110354 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term110355 = (Object[]) newArray("java.lang.Object", 4);
        setField(term110342, term110342.getClass(), "state", enum384);
        setElement(term110355, 0, enum385);
        setElement(term110355, 1, enum386);
        setElement(term110355, 2, enum387);
        setElement(term110355, 3, enum388);
        setField(term110354, term110354.getClass(), "elements", term110355);
        setField(term110342, term110342.getClass(), "types", term110354);
        setField(term110342, term110342.getClass(), "sessions", term110372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch$State$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Stopwatch");
        Object[] args = new Object[1];
        args[0] = term110342;
        callMethod(klass, "stop", argTypes, enum383, args);
    }

};


