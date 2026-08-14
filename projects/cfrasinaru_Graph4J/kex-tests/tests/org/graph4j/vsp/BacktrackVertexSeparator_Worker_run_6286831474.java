package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BacktrackVertexSeparator_Worker_run_6286831474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698;

    public BacktrackVertexSeparator_Worker_run_6286831474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term698, term698.getClass(), "running", false);
        setField(term698, term698.getClass(), "assignQueue", null);
        setField(term698, term698.getClass(), "nodeStack", null);
        setField(term698, term698.getClass(), "this$0", null);
        setField(term698, term698.getClass(), "name", null);
        setIntField(term698, term698.getClass(), "priority", 0);
        setBooleanField(term698, term698.getClass(), "daemon", false);
        setBooleanField(term698, term698.getClass(), "stillborn", false);
        setLongField(term698, term698.getClass(), "eetop", 0L);
        setField(term698, term698.getClass(), "target", null);
        setField(term698, term698.getClass(), "group", null);
        setField(term698, term698.getClass(), "contextClassLoader", null);
        setField(term698, term698.getClass(), "inheritedAccessControlContext", null);
        setField(term698, term698.getClass(), "threadLocals", null);
        setField(term698, term698.getClass(), "inheritableThreadLocals", null);
        setLongField(term698, term698.getClass(), "stackSize", 0L);
        setLongField(term698, term698.getClass(), "tid", 0L);
        setIntField(term698, term698.getClass(), "threadStatus", 0);
        setField(term698, term698.getClass(), "parkBlocker", null);
        setField(term698, term698.getClass(), "blocker", null);
        setField(term698, term698.getClass(), "blockerLock", null);
        setField(term698, term698.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term698, term698.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term698, term698.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term698, term698.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term698, args);
    }

};


