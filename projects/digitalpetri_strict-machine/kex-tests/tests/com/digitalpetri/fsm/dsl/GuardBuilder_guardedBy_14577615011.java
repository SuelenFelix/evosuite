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

public class GuardBuilder_guardedBy_14577615011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;

    public GuardBuilder_guardedBy_14577615011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1492 = new LinkedList();
        term1490 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.GuardBuilder"));
        Object term1491 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.PredicatedTransition"));
        setField(term1491, term1491.getClass(), "guard", null);
        setField(term1491, term1491.getClass(), "from", null);
        setField(term1491, term1491.getClass(), "via", null);
        setField(term1491, term1491.getClass(), "target", null);
        setField(term1490, term1490.getClass(), "transition", term1491);
        setField(term1490, term1490.getClass(), "from", null);
        setField(term1490, term1490.getClass(), "to", null);
        setField(term1490, term1490.getClass(), "via", null);
        setField(term1490, term1490.getClass(), "transitionActions", term1492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.GuardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "guardedBy", argTypes, term1490, args);
    }

};


