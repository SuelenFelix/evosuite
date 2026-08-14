package org.schambon.loadsimrunner.runner;

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
import static org.schambon.loadsimrunner.runner.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkloadThread_getContextValue_19940252529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;

    public WorkloadThread_getContextValue_19940252529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074 = newInstance(Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread"));
        setField(term1074, term1074.getClass(), "workloadName", null);
        setIntField(term1074, term1074.getClass(), "threadNumber", 0);
        setField(term1074, term1074.getClass(), "context", null);
        setField(term1074, term1074.getClass(), "name", null);
        setIntField(term1074, term1074.getClass(), "priority", 0);
        setBooleanField(term1074, term1074.getClass(), "daemon", false);
        setBooleanField(term1074, term1074.getClass(), "stillborn", false);
        setLongField(term1074, term1074.getClass(), "eetop", 0L);
        setField(term1074, term1074.getClass(), "target", null);
        setField(term1074, term1074.getClass(), "group", null);
        setField(term1074, term1074.getClass(), "contextClassLoader", null);
        setField(term1074, term1074.getClass(), "inheritedAccessControlContext", null);
        setField(term1074, term1074.getClass(), "threadLocals", null);
        setField(term1074, term1074.getClass(), "inheritableThreadLocals", null);
        setLongField(term1074, term1074.getClass(), "stackSize", 0L);
        setLongField(term1074, term1074.getClass(), "tid", 0L);
        setIntField(term1074, term1074.getClass(), "threadStatus", 0);
        setField(term1074, term1074.getClass(), "parkBlocker", null);
        setField(term1074, term1074.getClass(), "blocker", null);
        setField(term1074, term1074.getClass(), "blockerLock", null);
        setField(term1074, term1074.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1074, term1074.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1074, term1074.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1074, term1074.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getContextValue", argTypes, term1074, args);
    }

};


