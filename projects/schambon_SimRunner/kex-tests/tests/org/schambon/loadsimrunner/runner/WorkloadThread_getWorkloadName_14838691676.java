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

public class WorkloadThread_getWorkloadName_14838691676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1038;

    public WorkloadThread_getWorkloadName_14838691676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1038 = newInstance(Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread"));
        setField(term1038, term1038.getClass(), "workloadName", null);
        setIntField(term1038, term1038.getClass(), "threadNumber", 0);
        setField(term1038, term1038.getClass(), "context", null);
        setField(term1038, term1038.getClass(), "name", null);
        setIntField(term1038, term1038.getClass(), "priority", 0);
        setBooleanField(term1038, term1038.getClass(), "daemon", false);
        setBooleanField(term1038, term1038.getClass(), "stillborn", false);
        setLongField(term1038, term1038.getClass(), "eetop", 0L);
        setField(term1038, term1038.getClass(), "target", null);
        setField(term1038, term1038.getClass(), "group", null);
        setField(term1038, term1038.getClass(), "contextClassLoader", null);
        setField(term1038, term1038.getClass(), "inheritedAccessControlContext", null);
        setField(term1038, term1038.getClass(), "threadLocals", null);
        setField(term1038, term1038.getClass(), "inheritableThreadLocals", null);
        setLongField(term1038, term1038.getClass(), "stackSize", 0L);
        setLongField(term1038, term1038.getClass(), "tid", 0L);
        setIntField(term1038, term1038.getClass(), "threadStatus", 0);
        setField(term1038, term1038.getClass(), "parkBlocker", null);
        setField(term1038, term1038.getClass(), "blocker", null);
        setField(term1038, term1038.getClass(), "blockerLock", null);
        setField(term1038, term1038.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1038, term1038.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1038, term1038.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1038, term1038.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkloadName", argTypes, term1038, args);
    }

};


