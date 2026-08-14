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

public class WorkloadThread_getThreadNumber_16173639077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050;

    public WorkloadThread_getThreadNumber_16173639077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1050 = newInstance(Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread"));
        setField(term1050, term1050.getClass(), "workloadName", null);
        setIntField(term1050, term1050.getClass(), "threadNumber", 0);
        setField(term1050, term1050.getClass(), "context", null);
        setField(term1050, term1050.getClass(), "name", null);
        setIntField(term1050, term1050.getClass(), "priority", 0);
        setBooleanField(term1050, term1050.getClass(), "daemon", false);
        setBooleanField(term1050, term1050.getClass(), "stillborn", false);
        setLongField(term1050, term1050.getClass(), "eetop", 0L);
        setField(term1050, term1050.getClass(), "target", null);
        setField(term1050, term1050.getClass(), "group", null);
        setField(term1050, term1050.getClass(), "contextClassLoader", null);
        setField(term1050, term1050.getClass(), "inheritedAccessControlContext", null);
        setField(term1050, term1050.getClass(), "threadLocals", null);
        setField(term1050, term1050.getClass(), "inheritableThreadLocals", null);
        setLongField(term1050, term1050.getClass(), "stackSize", 0L);
        setLongField(term1050, term1050.getClass(), "tid", 0L);
        setIntField(term1050, term1050.getClass(), "threadStatus", 0);
        setField(term1050, term1050.getClass(), "parkBlocker", null);
        setField(term1050, term1050.getClass(), "blocker", null);
        setField(term1050, term1050.getClass(), "blockerLock", null);
        setField(term1050, term1050.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1050, term1050.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1050, term1050.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1050, term1050.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.WorkloadThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThreadNumber", argTypes, term1050, args);
    }

};


