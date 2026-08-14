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

public class StrictMachine_fireEvent_141811707312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2372;

    public StrictMachine_fireEvent_141811707312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2372 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        setBooleanField(term2372, term2372.getClass(), "pollExecuted", false);
        setField(term2372, term2372.getClass(), "queueLock", null);
        setField(term2372, term2372.getClass(), "eventQueue", null);
        setField(term2372, term2372.getClass(), "eventShelf", null);
        setField(term2372, term2372.getClass(), "readWriteLock", null);
        setField(term2372, term2372.getClass(), "contextValues", null);
        setField(term2372, term2372.getClass(), "state", null);
        setField(term2372, term2372.getClass(), "logger", null);
        setField(term2372, term2372.getClass(), "mdc", null);
        setField(term2372, term2372.getClass(), "executor", null);
        setField(term2372, term2372.getClass(), "userContext", null);
        setField(term2372, term2372.getClass(), "actionProxy", null);
        setField(term2372, term2372.getClass(), "transitions", null);
        setField(term2372, term2372.getClass(), "transitionActions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "fireEvent", argTypes, term2372, args);
    }

};


