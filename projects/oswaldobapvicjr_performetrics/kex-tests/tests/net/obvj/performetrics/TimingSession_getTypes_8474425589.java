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

public class TimingSession_getTypes_8474425589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199614;

    public TimingSession_getTypes_8474425589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199655 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term199654 = ((Class) term199655).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term199654).setAccessible(true);
        Object enum710 =  ((Field) term199654).get((Object) null);
        Class<? extends Object> term199870 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term199869 = ((Class) term199870).getDeclaredField((String) "CPU_TIME");
        ((Field) term199869).setAccessible(true);
        Object enum711 =  ((Field) term199869).get((Object) null);
        Class<? extends Object> term200076 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term200075 = ((Class) term200076).getDeclaredField((String) "USER_TIME");
        ((Field) term200075).setAccessible(true);
        Object enum712 =  ((Field) term200075).get((Object) null);
        ArrayList term199615 = new ArrayList();
        ((ArrayList) term199615).add(enum710);
        ((ArrayList) term199615).add(enum711);
        ((ArrayList) term199615).add(enum710);
        ((ArrayList) term199615).add(enum712);
        ((ArrayList) term199615).add(enum710);
        ((ArrayList) term199615).add(enum711);
        HashMap term199631 = new HashMap();
        Class<? extends Object> term200285 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term200284 = ((Class) term200285).getDeclaredField((String) "STARTED");
        ((Field) term200284).setAccessible(true);
        Object enum713 = ((Field) term200284).get((Object) null);
        term199614 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term199614, term199614.getClass(), "types", term199615);
        setField(term199614, term199614.getClass(), "counters", term199631);
        setField(term199614, term199614.getClass(), "state", enum713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypes", argTypes, term199614, args);
    }

};


