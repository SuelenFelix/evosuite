package com.digitalpetri.fsm;

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
import static com.digitalpetri.fsm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StrictMachine_ActionContextImpl_event_6621243953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1441;

    public StrictMachine_ActionContextImpl_event_6621243953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1608 = Class.forName((String) "java.lang.Thread");
        Field term1442 = ((Class) term1608).getDeclaredField((String) "threadSeqNumber");
        ((Field) term1442).setAccessible(false);
        Class<? extends Object> term1717 = Class.forName((String) "java.util.KeyValueHolder");
        Field term1538 = ((Class) term1717).getDeclaredField((String) "value");
        ((Field) term1538).setAccessible(false);
        Class<? extends Object> term1838 = Class.forName((String) "java.util.EnumMap$EntrySet");
        Field term1578 = ((Class) term1838).getDeclaredField((String) "this$0");
        ((Field) term1578).setAccessible(false);
        term1441 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine$ActionContextImpl"));
        setField(term1441, term1441.getClass(), "from", term1442);
        setField(term1441, term1441.getClass(), "to", term1538);
        setField(term1441, term1441.getClass(), "event", term1578);
        setField(term1441, term1441.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$ActionContextImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "event", argTypes, term1441, args);
    }

};


