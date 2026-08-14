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

public class TimingSession_getCounters_92969941210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200522;

    public TimingSession_getCounters_92969941210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200568 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term200567 = ((Class) term200568).getDeclaredField((String) "CPU_TIME");
        ((Field) term200567).setAccessible(true);
        Object enum714 =  ((Field) term200567).get((Object) null);
        Class<? extends Object> term200774 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term200773 = ((Class) term200774).getDeclaredField((String) "USER_TIME");
        ((Field) term200773).setAccessible(true);
        Object enum715 =  ((Field) term200773).get((Object) null);
        Class<? extends Object> term200983 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term200982 = ((Class) term200983).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term200982).setAccessible(true);
        Object enum716 =  ((Field) term200982).get((Object) null);
        Class<? extends Object> term201198 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term201197 = ((Class) term201198).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term201197).setAccessible(true);
        Object enum717 =  ((Field) term201197).get((Object) null);
        ArrayList term200523 = new ArrayList();
        ((ArrayList) term200523).add(enum714);
        ((ArrayList) term200523).add(enum714);
        ((ArrayList) term200523).add(enum715);
        ((ArrayList) term200523).add(enum715);
        ((ArrayList) term200523).add(enum714);
        ((ArrayList) term200523).add(enum716);
        ((ArrayList) term200523).add(enum717);
        HashMap term200543 = new HashMap();
        Class<? extends Object> term201425 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term201424 = ((Class) term201425).getDeclaredField((String) "FINISHED");
        ((Field) term201424).setAccessible(true);
        Object enum718 = ((Field) term201424).get((Object) null);
        term200522 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term200522, term200522.getClass(), "types", term200523);
        setField(term200522, term200522.getClass(), "counters", term200543);
        setField(term200522, term200522.getClass(), "state", enum718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounters", argTypes, term200522, args);
    }

};


