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

public class FsmBuilder_addTransition_155442839720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474;

    public FsmBuilder_addTransition_155442839720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1474 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        setField(term1474, term1474.getClass(), "transitions", null);
        setField(term1474, term1474.getClass(), "transitionActions", null);
        setField(term1474, term1474.getClass(), "actionProxy", null);
        setField(term1474, term1474.getClass(), "loggerName", null);
        setField(term1474, term1474.getClass(), "mdc", null);
        setField(term1474, term1474.getClass(), "executor", null);
        setField(term1474, term1474.getClass(), "userContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.dsl.Transition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTransition", argTypes, term1474, args);
    }

};


