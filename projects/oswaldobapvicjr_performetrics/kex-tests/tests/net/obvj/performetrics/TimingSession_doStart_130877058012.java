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

public class TimingSession_doStart_130877058012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202804;

    public TimingSession_doStart_130877058012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202841 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term202840 = ((Class) term202841).getDeclaredField((String) "CPU_TIME");
        ((Field) term202840).setAccessible(true);
        Object enum724 =  ((Field) term202840).get((Object) null);
        Class<? extends Object> term203047 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term203046 = ((Class) term203047).getDeclaredField((String) "USER_TIME");
        ((Field) term203046).setAccessible(true);
        Object enum725 =  ((Field) term203046).get((Object) null);
        ArrayList term202805 = new ArrayList();
        ((ArrayList) term202805).add(enum724);
        ((ArrayList) term202805).add(enum724);
        ((ArrayList) term202805).add(enum724);
        ((ArrayList) term202805).add(enum725);
        ((ArrayList) term202805).add(enum725);
        ((ArrayList) term202805).add(enum724);
        HashMap term202817 = new HashMap();
        Class<? extends Object> term203256 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term203255 = ((Class) term203256).getDeclaredField((String) "STARTED");
        ((Field) term203255).setAccessible(true);
        Object enum726 = ((Field) term203255).get((Object) null);
        term202804 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term202804, term202804.getClass(), "types", term202805);
        setField(term202804, term202804.getClass(), "counters", term202817);
        setField(term202804, term202804.getClass(), "state", enum726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doStart", argTypes, term202804, args);
    }

};


