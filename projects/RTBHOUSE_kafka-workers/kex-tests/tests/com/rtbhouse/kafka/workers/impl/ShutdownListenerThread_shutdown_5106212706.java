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

public class ShutdownListenerThread_shutdown_5106212706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21031;

    public ShutdownListenerThread_shutdown_5106212706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21031 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread"));
        setField(term21031, term21031.getClass(), "workers", null);
        setBooleanField(term21031, term21031.getClass(), "shutdown", false);
        setField(term21031, term21031.getClass(), "name", null);
        setIntField(term21031, term21031.getClass(), "priority", 0);
        setBooleanField(term21031, term21031.getClass(), "daemon", false);
        setBooleanField(term21031, term21031.getClass(), "stillborn", false);
        setLongField(term21031, term21031.getClass(), "eetop", 0L);
        setField(term21031, term21031.getClass(), "target", null);
        setField(term21031, term21031.getClass(), "group", null);
        setField(term21031, term21031.getClass(), "contextClassLoader", null);
        setField(term21031, term21031.getClass(), "inheritedAccessControlContext", null);
        setField(term21031, term21031.getClass(), "threadLocals", null);
        setField(term21031, term21031.getClass(), "inheritableThreadLocals", null);
        setLongField(term21031, term21031.getClass(), "stackSize", 0L);
        setLongField(term21031, term21031.getClass(), "tid", 0L);
        setIntField(term21031, term21031.getClass(), "threadStatus", 0);
        setField(term21031, term21031.getClass(), "parkBlocker", null);
        setField(term21031, term21031.getClass(), "blocker", null);
        setField(term21031, term21031.getClass(), "blockerLock", null);
        setField(term21031, term21031.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term21031, term21031.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term21031, term21031.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term21031, term21031.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shutdown", argTypes, term21031, args);
    }

};


