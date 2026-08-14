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

public class WorkloadThread_setContextValue_9188179868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1062;

    public WorkloadThread_setContextValue_9188179868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1062 = newInstance(Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread"));
        setField(term1062, term1062.getClass(), "workloadName", null);
        setIntField(term1062, term1062.getClass(), "threadNumber", 0);
        setField(term1062, term1062.getClass(), "context", null);
        setField(term1062, term1062.getClass(), "name", null);
        setIntField(term1062, term1062.getClass(), "priority", 0);
        setBooleanField(term1062, term1062.getClass(), "daemon", false);
        setBooleanField(term1062, term1062.getClass(), "stillborn", false);
        setLongField(term1062, term1062.getClass(), "eetop", 0L);
        setField(term1062, term1062.getClass(), "target", null);
        setField(term1062, term1062.getClass(), "group", null);
        setField(term1062, term1062.getClass(), "contextClassLoader", null);
        setField(term1062, term1062.getClass(), "inheritedAccessControlContext", null);
        setField(term1062, term1062.getClass(), "threadLocals", null);
        setField(term1062, term1062.getClass(), "inheritableThreadLocals", null);
        setLongField(term1062, term1062.getClass(), "stackSize", 0L);
        setLongField(term1062, term1062.getClass(), "tid", 0L);
        setIntField(term1062, term1062.getClass(), "threadStatus", 0);
        setField(term1062, term1062.getClass(), "parkBlocker", null);
        setField(term1062, term1062.getClass(), "blocker", null);
        setField(term1062, term1062.getClass(), "blockerLock", null);
        setField(term1062, term1062.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1062, term1062.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1062, term1062.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1062, term1062.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setContextValue", argTypes, term1062, args);
    }

};


