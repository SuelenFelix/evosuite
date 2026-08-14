package com.digitalpetri.fsm.dsl;

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
import static com.digitalpetri.fsm.dsl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class GuardBuilder_init_7798644100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478;
     Object term1480;

    public GuardBuilder_init_7798644100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1478 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.PredicatedTransition"));
        Object term1479 = newInstance(Class.forName("java.lang.Object"));
        setField(term1478, term1478.getClass(), "guard", null);
        setField(term1478, term1478.getClass(), "from", null);
        setField(term1478, term1478.getClass(), "via", null);
        setField(term1478, term1478.getClass(), "target", term1479);
        term1480 = new LinkedList();
        ((LinkedList) term1480).add((Object)null);
        ((LinkedList) term1480).add((Object)null);
        ((LinkedList) term1480).add((Object)null);
        ((LinkedList) term1480).add((Object)null);
        ((LinkedList) term1480).add((Object)null);
        ((LinkedList) term1480).add((Object)null);
        ((LinkedList) term1480).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.GuardBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.dsl.PredicatedTransition");
        argTypes[1] = Class.forName("java.util.LinkedList");
        Object[] args = new Object[2];
        args[0] = term1478;
        args[1] = term1480;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


