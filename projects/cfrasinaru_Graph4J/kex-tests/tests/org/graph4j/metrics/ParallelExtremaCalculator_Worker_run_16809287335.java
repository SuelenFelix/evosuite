package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ParallelExtremaCalculator_Worker_run_16809287335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11414;

    public ParallelExtremaCalculator_Worker_run_16809287335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11414 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator$Worker"));
        setField(term11414, term11414.getClass(), "dist", null);
        setField(term11414, term11414.getClass(), "this$0", null);
        setField(term11414, term11414.getClass(), "name", null);
        setIntField(term11414, term11414.getClass(), "priority", 0);
        setBooleanField(term11414, term11414.getClass(), "daemon", false);
        setBooleanField(term11414, term11414.getClass(), "stillborn", false);
        setLongField(term11414, term11414.getClass(), "eetop", 0L);
        setField(term11414, term11414.getClass(), "target", null);
        setField(term11414, term11414.getClass(), "group", null);
        setField(term11414, term11414.getClass(), "contextClassLoader", null);
        setField(term11414, term11414.getClass(), "inheritedAccessControlContext", null);
        setField(term11414, term11414.getClass(), "threadLocals", null);
        setField(term11414, term11414.getClass(), "inheritableThreadLocals", null);
        setLongField(term11414, term11414.getClass(), "stackSize", 0L);
        setLongField(term11414, term11414.getClass(), "tid", 0L);
        setIntField(term11414, term11414.getClass(), "threadStatus", 0);
        setField(term11414, term11414.getClass(), "parkBlocker", null);
        setField(term11414, term11414.getClass(), "blocker", null);
        setField(term11414, term11414.getClass(), "blockerLock", null);
        setField(term11414, term11414.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term11414, term11414.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term11414, term11414.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term11414, term11414.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term11414, args);
    }

};


