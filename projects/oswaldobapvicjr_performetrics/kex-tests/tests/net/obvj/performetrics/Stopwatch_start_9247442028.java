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

public class Stopwatch_start_9247442028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27965;

    public Stopwatch_start_9247442028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28000 = Class.forName((String) "net.obvj.performetrics.Stopwatch$State");
        Field term27999 = ((Class) term28000).getDeclaredField((String) "STOPPED");
        ((Field) term27999).setAccessible(true);
        Object enum101 = ((Field) term27999).get((Object) null);
        Class<? extends Object> term28218 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28217 = ((Class) term28218).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term28217).setAccessible(true);
        Object enum102 = ((Field) term28217).get((Object) null);
        Class<? extends Object> term28445 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28444 = ((Class) term28445).getDeclaredField((String) "CPU_TIME");
        ((Field) term28444).setAccessible(true);
        Object enum103 = ((Field) term28444).get((Object) null);
        Class<? extends Object> term28651 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28650 = ((Class) term28651).getDeclaredField((String) "USER_TIME");
        ((Field) term28650).setAccessible(true);
        Object enum104 = ((Field) term28650).get((Object) null);
        Class<? extends Object> term28860 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28859 = ((Class) term28860).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term28859).setAccessible(true);
        Object enum105 = ((Field) term28859).get((Object) null);
        ArrayList term27995 = new ArrayList();
        term27965 = newInstance(Class.forName("net.obvj.performetrics.Stopwatch"));
        Object term27977 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term27978 = (Object[]) newArray("java.lang.Object", 4);
        setField(term27965, term27965.getClass(), "state", enum101);
        setElement(term27978, 0, enum102);
        setElement(term27978, 1, enum103);
        setElement(term27978, 2, enum104);
        setElement(term27978, 3, enum105);
        setField(term27977, term27977.getClass(), "elements", term27978);
        setField(term27965, term27965.getClass(), "types", term27977);
        setField(term27965, term27965.getClass(), "sessions", term27995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term27965, args);
    }

};


