package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BacktrackColoringBase_Worker_run_15041825704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6331;

    public BacktrackColoringBase_Worker_run_15041825704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6331 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        setBooleanField(term6331, term6331.getClass(), "running", false);
        setIntField(term6331, term6331.getClass(), "numColors", 0);
        setField(term6331, term6331.getClass(), "assignQueue", null);
        setField(term6331, term6331.getClass(), "nodeStack", null);
        setField(term6331, term6331.getClass(), "this$0", null);
        setField(term6331, term6331.getClass(), "name", null);
        setIntField(term6331, term6331.getClass(), "priority", 0);
        setBooleanField(term6331, term6331.getClass(), "daemon", false);
        setBooleanField(term6331, term6331.getClass(), "stillborn", false);
        setLongField(term6331, term6331.getClass(), "eetop", 0L);
        setField(term6331, term6331.getClass(), "target", null);
        setField(term6331, term6331.getClass(), "group", null);
        setField(term6331, term6331.getClass(), "contextClassLoader", null);
        setField(term6331, term6331.getClass(), "inheritedAccessControlContext", null);
        setField(term6331, term6331.getClass(), "threadLocals", null);
        setField(term6331, term6331.getClass(), "inheritableThreadLocals", null);
        setLongField(term6331, term6331.getClass(), "stackSize", 0L);
        setLongField(term6331, term6331.getClass(), "tid", 0L);
        setIntField(term6331, term6331.getClass(), "threadStatus", 0);
        setField(term6331, term6331.getClass(), "parkBlocker", null);
        setField(term6331, term6331.getClass(), "blocker", null);
        setField(term6331, term6331.getClass(), "blockerLock", null);
        setField(term6331, term6331.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term6331, term6331.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term6331, term6331.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term6331, term6331.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term6331, args);
    }

};


