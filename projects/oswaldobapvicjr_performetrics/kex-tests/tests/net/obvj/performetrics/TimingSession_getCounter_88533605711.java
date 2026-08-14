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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class TimingSession_getCounter_88533605711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201665;
     Object enum722;

    public TimingSession_getCounter_88533605711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201710 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term201709 = ((Class) term201710).getDeclaredField((String) "CPU_TIME");
        ((Field) term201709).setAccessible(true);
        Object enum719 =  ((Field) term201709).get((Object) null);
        Class<? extends Object> term201916 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term201915 = ((Class) term201916).getDeclaredField((String) "USER_TIME");
        ((Field) term201915).setAccessible(true);
        Object enum720 =  ((Field) term201915).get((Object) null);
        Class<? extends Object> term202125 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term202124 = ((Class) term202125).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term202124).setAccessible(true);
        Object enum721 =  ((Field) term202124).get((Object) null);
        Class<? extends Object> term202340 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term202339 = ((Class) term202340).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term202339).setAccessible(true);
        enum722 =  ((Field) term202339).get((Object) null);
        ArrayList term201666 = new ArrayList();
        ((ArrayList) term201666).add(enum719);
        ((ArrayList) term201666).add(enum719);
        ((ArrayList) term201666).add(enum719);
        ((ArrayList) term201666).add(enum720);
        ((ArrayList) term201666).add(enum721);
        ((ArrayList) term201666).add(enum720);
        ((ArrayList) term201666).add(enum719);
        ((ArrayList) term201666).add(enum722);
        HashMap term201686 = new HashMap();
        Class<? extends Object> term202567 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term202566 = ((Class) term202567).getDeclaredField((String) "STARTED");
        ((Field) term202566).setAccessible(true);
        Object enum723 = ((Field) term202566).get((Object) null);
        term201665 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term201665, term201665.getClass(), "types", term201666);
        setField(term201665, term201665.getClass(), "counters", term201686);
        setField(term201665, term201665.getClass(), "state", enum723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum722;
        callMethod(klass, "getCounter", argTypes, term201665, args);
    }

};


