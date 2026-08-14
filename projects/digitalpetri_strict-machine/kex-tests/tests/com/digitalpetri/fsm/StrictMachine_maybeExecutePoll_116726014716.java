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

public class StrictMachine_maybeExecutePoll_116726014716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2380;

    public StrictMachine_maybeExecutePoll_116726014716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2380 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        setBooleanField(term2380, term2380.getClass(), "pollExecuted", false);
        setField(term2380, term2380.getClass(), "queueLock", null);
        setField(term2380, term2380.getClass(), "eventQueue", null);
        setField(term2380, term2380.getClass(), "eventShelf", null);
        setField(term2380, term2380.getClass(), "readWriteLock", null);
        setField(term2380, term2380.getClass(), "contextValues", null);
        setField(term2380, term2380.getClass(), "state", null);
        setField(term2380, term2380.getClass(), "logger", null);
        setField(term2380, term2380.getClass(), "mdc", null);
        setField(term2380, term2380.getClass(), "executor", null);
        setField(term2380, term2380.getClass(), "userContext", null);
        setField(term2380, term2380.getClass(), "actionProxy", null);
        setField(term2380, term2380.getClass(), "transitions", null);
        setField(term2380, term2380.getClass(), "transitionActions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maybeExecutePoll", argTypes, term2380, args);
    }

};


