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

public class ShutdownListenerThread_run_8714965455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21019;

    public ShutdownListenerThread_run_8714965455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21019 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread"));
        setField(term21019, term21019.getClass(), "workers", null);
        setBooleanField(term21019, term21019.getClass(), "shutdown", false);
        setField(term21019, term21019.getClass(), "name", null);
        setIntField(term21019, term21019.getClass(), "priority", 0);
        setBooleanField(term21019, term21019.getClass(), "daemon", false);
        setBooleanField(term21019, term21019.getClass(), "stillborn", false);
        setLongField(term21019, term21019.getClass(), "eetop", 0L);
        setField(term21019, term21019.getClass(), "target", null);
        setField(term21019, term21019.getClass(), "group", null);
        setField(term21019, term21019.getClass(), "contextClassLoader", null);
        setField(term21019, term21019.getClass(), "inheritedAccessControlContext", null);
        setField(term21019, term21019.getClass(), "threadLocals", null);
        setField(term21019, term21019.getClass(), "inheritableThreadLocals", null);
        setLongField(term21019, term21019.getClass(), "stackSize", 0L);
        setLongField(term21019, term21019.getClass(), "tid", 0L);
        setIntField(term21019, term21019.getClass(), "threadStatus", 0);
        setField(term21019, term21019.getClass(), "parkBlocker", null);
        setField(term21019, term21019.getClass(), "blocker", null);
        setField(term21019, term21019.getClass(), "blockerLock", null);
        setField(term21019, term21019.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term21019, term21019.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term21019, term21019.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term21019, term21019.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term21019, args);
    }

};


