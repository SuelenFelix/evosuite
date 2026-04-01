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
import java.lang.Integer;

public class ParallelExtremaCalculator_Worker_updateBounds_3269316987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11438;
     Object term11449;

    public ParallelExtremaCalculator_Worker_updateBounds_3269316987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11438 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator$Worker"));
        setField(term11438, term11438.getClass(), "dist", null);
        setField(term11438, term11438.getClass(), "this$0", null);
        setField(term11438, term11438.getClass(), "name", null);
        setIntField(term11438, term11438.getClass(), "priority", 0);
        setBooleanField(term11438, term11438.getClass(), "daemon", false);
        setBooleanField(term11438, term11438.getClass(), "stillborn", false);
        setLongField(term11438, term11438.getClass(), "eetop", 0L);
        setField(term11438, term11438.getClass(), "target", null);
        setField(term11438, term11438.getClass(), "group", null);
        setField(term11438, term11438.getClass(), "contextClassLoader", null);
        setField(term11438, term11438.getClass(), "inheritedAccessControlContext", null);
        setField(term11438, term11438.getClass(), "threadLocals", null);
        setField(term11438, term11438.getClass(), "inheritableThreadLocals", null);
        setLongField(term11438, term11438.getClass(), "stackSize", 0L);
        setLongField(term11438, term11438.getClass(), "tid", 0L);
        setIntField(term11438, term11438.getClass(), "threadStatus", 0);
        setField(term11438, term11438.getClass(), "parkBlocker", null);
        setField(term11438, term11438.getClass(), "blocker", null);
        setField(term11438, term11438.getClass(), "blockerLock", null);
        setField(term11438, term11438.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term11438, term11438.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term11438, term11438.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term11438, term11438.getClass(), "threadLocalRandomSecondarySeed", 0);
        term11449 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator$Worker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11449;
        callMethod(klass, "updateBounds", argTypes, term11438, args);
    }

};


