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

public class Stopwatch_State_1_stop_17701703032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum369;
     Object term107194;

    public Stopwatch_State_1_stop_17701703032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107229 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term107228 = ((Class) term107229).getDeclaredField((String) "RUNNING");
        ((Field) term107228).setAccessible(true);
        enum369 = ((Field) term107228).get((Object) null);
        Class<? extends Object> term107447 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term107446 = ((Class) term107447).getDeclaredField((String) "STOPPED");
        ((Field) term107446).setAccessible(true);
        Object enum370 = ((Field) term107446).get((Object) null);
        Class<? extends Object> term107665 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term107664 = ((Class) term107665).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term107664).setAccessible(true);
        Object enum371 = ((Field) term107664).get((Object) null);
        Class<? extends Object> term107892 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term107891 = ((Class) term107892).getDeclaredField((String) "CPU_TIME");
        ((Field) term107891).setAccessible(true);
        Object enum372 = ((Field) term107891).get((Object) null);
        Class<? extends Object> term108098 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term108097 = ((Class) term108098).getDeclaredField((String) "USER_TIME");
        ((Field) term108097).setAccessible(true);
        Object enum373 = ((Field) term108097).get((Object) null);
        Class<? extends Object> term108307 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term108306 = ((Class) term108307).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term108306).setAccessible(true);
        Object enum374 = ((Field) term108306).get((Object) null);
        ArrayList term107224 = new ArrayList();
        term107194 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term107206 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term107207 = (Object[]) newArray("java.lang.Object", 4);
        setField(term107194, term107194.getClass(), "state", enum370);
        setElement(term107207, 0, enum371);
        setElement(term107207, 1, enum372);
        setElement(term107207, 2, enum373);
        setElement(term107207, 3, enum374);
        setField(term107206, term107206.getClass(), "elements", term107207);
        setField(term107194, term107194.getClass(), "types", term107206);
        setField(term107194, term107194.getClass(), "sessions", term107224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch$State$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Stopwatch");
        Object[] args = new Object[1];
        args[0] = term107194;
        callMethod(klass, "stop", argTypes, enum369, args);
    }

};


