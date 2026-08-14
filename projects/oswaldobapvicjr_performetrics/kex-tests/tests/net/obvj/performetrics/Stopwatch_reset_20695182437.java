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

public class Stopwatch_reset_20695182437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26834;

    public Stopwatch_reset_20695182437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26891 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term26890 = ((Class) term26891).getDeclaredField((String) "STOPPED");
        ((Field) term26890).setAccessible(true);
        Object enum96 = ((Field) term26890).get((Object) null);
        Class<? extends Object> term27109 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27108 = ((Class) term27109).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term27108).setAccessible(true);
        Object enum97 = ((Field) term27108).get((Object) null);
        Class<? extends Object> term27336 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27335 = ((Class) term27336).getDeclaredField((String) "CPU_TIME");
        ((Field) term27335).setAccessible(true);
        Object enum98 = ((Field) term27335).get((Object) null);
        Class<? extends Object> term27542 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27541 = ((Class) term27542).getDeclaredField((String) "USER_TIME");
        ((Field) term27541).setAccessible(true);
        Object enum99 = ((Field) term27541).get((Object) null);
        Class<? extends Object> term27751 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27750 = ((Class) term27751).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term27750).setAccessible(true);
        Object enum100 = ((Field) term27750).get((Object) null);
        ArrayList term26864 = new ArrayList();
        term26834 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term26846 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term26847 = (Object[]) newArray("java.lang.Object", 4);
        setField(term26834, term26834.getClass(), "state", enum96);
        setElement(term26847, 0, enum97);
        setElement(term26847, 1, enum98);
        setElement(term26847, 2, enum99);
        setElement(term26847, 3, enum100);
        setField(term26846, term26846.getClass(), "elements", term26847);
        setField(term26834, term26834.getClass(), "types", term26846);
        setField(term26834, term26834.getClass(), "sessions", term26864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term26834, args);
    }

};


