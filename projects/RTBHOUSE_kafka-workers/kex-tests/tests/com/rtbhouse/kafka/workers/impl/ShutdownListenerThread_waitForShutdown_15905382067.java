package com.rtbhouse.kafka.workers.impl;

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
import static com.rtbhouse.kafka.workers.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShutdownListenerThread_waitForShutdown_15905382067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21043;

    public ShutdownListenerThread_waitForShutdown_15905382067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21043 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread"));
        setField(term21043, term21043.getClass(), "workers", null);
        setBooleanField(term21043, term21043.getClass(), "shutdown", false);
        setField(term21043, term21043.getClass(), "name", null);
        setIntField(term21043, term21043.getClass(), "priority", 0);
        setBooleanField(term21043, term21043.getClass(), "daemon", false);
        setBooleanField(term21043, term21043.getClass(), "stillborn", false);
        setLongField(term21043, term21043.getClass(), "eetop", 0L);
        setField(term21043, term21043.getClass(), "target", null);
        setField(term21043, term21043.getClass(), "group", null);
        setField(term21043, term21043.getClass(), "contextClassLoader", null);
        setField(term21043, term21043.getClass(), "inheritedAccessControlContext", null);
        setField(term21043, term21043.getClass(), "threadLocals", null);
        setField(term21043, term21043.getClass(), "inheritableThreadLocals", null);
        setLongField(term21043, term21043.getClass(), "stackSize", 0L);
        setLongField(term21043, term21043.getClass(), "tid", 0L);
        setIntField(term21043, term21043.getClass(), "threadStatus", 0);
        setField(term21043, term21043.getClass(), "parkBlocker", null);
        setField(term21043, term21043.getClass(), "blocker", null);
        setField(term21043, term21043.getClass(), "blockerLock", null);
        setField(term21043, term21043.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term21043, term21043.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term21043, term21043.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term21043, term21043.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "waitForShutdown", argTypes, term21043, args);
    }

};


