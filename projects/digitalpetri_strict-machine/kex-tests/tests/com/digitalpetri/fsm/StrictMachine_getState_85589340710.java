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

public class StrictMachine_getState_85589340710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2368;

    public StrictMachine_getState_85589340710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2368 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        setBooleanField(term2368, term2368.getClass(), "pollExecuted", false);
        setField(term2368, term2368.getClass(), "queueLock", null);
        setField(term2368, term2368.getClass(), "eventQueue", null);
        setField(term2368, term2368.getClass(), "eventShelf", null);
        setField(term2368, term2368.getClass(), "readWriteLock", null);
        setField(term2368, term2368.getClass(), "contextValues", null);
        setField(term2368, term2368.getClass(), "state", null);
        setField(term2368, term2368.getClass(), "logger", null);
        setField(term2368, term2368.getClass(), "mdc", null);
        setField(term2368, term2368.getClass(), "executor", null);
        setField(term2368, term2368.getClass(), "userContext", null);
        setField(term2368, term2368.getClass(), "actionProxy", null);
        setField(term2368, term2368.getClass(), "transitions", null);
        setField(term2368, term2368.getClass(), "transitionActions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term2368, args);
    }

};


