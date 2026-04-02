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

public class StrictMachine_getFromContext_34330844014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2376;

    public StrictMachine_getFromContext_34330844014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2376 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        setBooleanField(term2376, term2376.getClass(), "pollExecuted", false);
        setField(term2376, term2376.getClass(), "queueLock", null);
        setField(term2376, term2376.getClass(), "eventQueue", null);
        setField(term2376, term2376.getClass(), "eventShelf", null);
        setField(term2376, term2376.getClass(), "readWriteLock", null);
        setField(term2376, term2376.getClass(), "contextValues", null);
        setField(term2376, term2376.getClass(), "state", null);
        setField(term2376, term2376.getClass(), "logger", null);
        setField(term2376, term2376.getClass(), "mdc", null);
        setField(term2376, term2376.getClass(), "executor", null);
        setField(term2376, term2376.getClass(), "userContext", null);
        setField(term2376, term2376.getClass(), "actionProxy", null);
        setField(term2376, term2376.getClass(), "transitions", null);
        setField(term2376, term2376.getClass(), "transitionActions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFromContext", argTypes, term2376, args);
    }

};


