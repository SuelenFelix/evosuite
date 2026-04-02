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

public class StrictMachine_ActionContextImpl_from_7725282511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public StrictMachine_ActionContextImpl_from_7725282511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216 = Class.forName((String) "java.util.stream.ReduceOps$2");
        Field term34 = ((Class) term216).getDeclaredField((String) "val$operator");
        ((Field) term34).setAccessible(true);
        Class<? extends Object> term367 = Class.forName((String) "java.util.Spliterators$IntArraySpliterator");
        Field term130 = ((Class) term367).getDeclaredField((String) "fence");
        ((Field) term130).setAccessible(true);
        Class<? extends Object> term560 = Class.forName((String) "java.util.ArrayList$SubList");
        Field term178 = ((Class) term560).getDeclaredField((String) "size");
        ((Field) term178).setAccessible(false);
        term33 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine$ActionContextImpl"));
        setField(term33, term33.getClass(), "from", term34);
        setField(term33, term33.getClass(), "to", term130);
        setField(term33, term33.getClass(), "event", term178);
        setField(term33, term33.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$ActionContextImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "from", argTypes, term33, args);
    }

};


