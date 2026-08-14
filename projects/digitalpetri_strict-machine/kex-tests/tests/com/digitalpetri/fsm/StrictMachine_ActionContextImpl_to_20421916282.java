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

public class StrictMachine_ActionContextImpl_to_20421916282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;

    public StrictMachine_ActionContextImpl_to_20421916282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term858 = Class.forName((String) "java.nio.HeapDoubleBufferR");
        Field term692 = ((Class) term858).getDeclaredField((String) "ARRAY_INDEX_SCALE");
        ((Field) term692).setAccessible(false);
        Class<? extends Object> term1011 = Class.forName((String) "java.io.ObjectInputStream$ValidationList$1");
        Field term782 = ((Class) term1011).getDeclaredField((String) "this$0");
        ((Field) term782).setAccessible(true);
        Class<? extends Object> term1206 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$StaticAccessor");
        Field term828 = ((Class) term1206).getDeclaredField((String) "staticBase");
        ((Field) term828).setAccessible(false);
        term691 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine$ActionContextImpl"));
        setField(term691, term691.getClass(), "from", term692);
        setField(term691, term691.getClass(), "to", term782);
        setField(term691, term691.getClass(), "event", term828);
        setField(term691, term691.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$ActionContextImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "to", argTypes, term691, args);
    }

};


