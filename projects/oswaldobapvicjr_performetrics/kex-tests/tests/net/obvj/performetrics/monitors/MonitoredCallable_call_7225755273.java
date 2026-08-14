package net.obvj.performetrics.monitors;

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
import static net.obvj.performetrics.monitors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class MonitoredCallable_call_7225755273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;

    public MonitoredCallable_call_7225755273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1084 = new ArrayList();
        ArrayList term1091 = new ArrayList();
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        HashMap term1094 = new HashMap();
        Class<? extends Object> term1165 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term1164 = ((Class) term1165).getDeclaredField((String) "STARTED");
        ((Field) term1164).setAccessible(true);
        Object enum4 = ((Field) term1164).get((Object) null);
        Object term1090 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term1090, term1090.getClass(), "types", term1091);
        setField(term1090, term1090.getClass(), "counters", term1094);
        setField(term1090, term1090.getClass(), "state", enum4);
        ArrayList term1102 = new ArrayList();
        HashMap term1105 = new HashMap();
        Class<? extends Object> term1403 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term1402 = ((Class) term1403).getDeclaredField((String) "FINISHED");
        ((Field) term1402).setAccessible(true);
        Object enum5 = ((Field) term1402).get((Object) null);
        Object term1101 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term1101, term1101.getClass(), "types", term1102);
        setField(term1101, term1101.getClass(), "counters", term1105);
        setField(term1101, term1101.getClass(), "state", enum5);
        ArrayList term1113 = new ArrayList();
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        HashMap term1116 = new HashMap();
        Object term1112 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term1112, term1112.getClass(), "types", term1113);
        setField(term1112, term1112.getClass(), "counters", term1116);
        setField(term1112, term1112.getClass(), "state", enum4);
        ArrayList term1122 = new ArrayList();
        HashMap term1125 = new HashMap();
        Object term1121 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term1121, term1121.getClass(), "types", term1122);
        setField(term1121, term1121.getClass(), "counters", term1125);
        setField(term1121, term1121.getClass(), "state", enum5);
        ArrayList term1088 = new ArrayList();
        ((ArrayList) term1088).add(term1090);
        ((ArrayList) term1088).add(term1101);
        ((ArrayList) term1088).add(term1112);
        ((ArrayList) term1088).add(term1121);
        term1083 = newInstance(Class.forName("net.obvj.performetrics.monitors.MonitoredCallable"));
        setField(term1083, term1083.getClass(), "callable", null);
        setField(term1083, term1083.getClass(), "types", term1084);
        setField(term1083, term1083.getClass(), "sessions", term1088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredCallable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "call", argTypes, term1083, args);
    }

};


