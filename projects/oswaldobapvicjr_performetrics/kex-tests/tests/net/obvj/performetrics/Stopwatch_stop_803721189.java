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

public class Stopwatch_stop_803721189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29074;

    public Stopwatch_stop_803721189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29109 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term29108 = ((Class) term29109).getDeclaredField((String) "STOPPED");
        ((Field) term29108).setAccessible(true);
        Object enum106 = ((Field) term29108).get((Object) null);
        Class<? extends Object> term29327 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term29326 = ((Class) term29327).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term29326).setAccessible(true);
        Object enum107 = ((Field) term29326).get((Object) null);
        Class<? extends Object> term29554 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term29553 = ((Class) term29554).getDeclaredField((String) "CPU_TIME");
        ((Field) term29553).setAccessible(true);
        Object enum108 = ((Field) term29553).get((Object) null);
        Class<? extends Object> term29760 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term29759 = ((Class) term29760).getDeclaredField((String) "USER_TIME");
        ((Field) term29759).setAccessible(true);
        Object enum109 = ((Field) term29759).get((Object) null);
        Class<? extends Object> term29969 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term29968 = ((Class) term29969).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term29968).setAccessible(true);
        Object enum110 = ((Field) term29968).get((Object) null);
        ArrayList term29104 = new ArrayList();
        term29074 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term29086 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term29087 = (Object[]) newArray("java.lang.Object", 4);
        setField(term29074, term29074.getClass(), "state", enum106);
        setElement(term29087, 0, enum107);
        setElement(term29087, 1, enum108);
        setElement(term29087, 2, enum109);
        setElement(term29087, 3, enum110);
        setField(term29086, term29086.getClass(), "elements", term29087);
        setField(term29074, term29074.getClass(), "types", term29086);
        setField(term29074, term29074.getClass(), "sessions", term29104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term29074, args);
    }

};


