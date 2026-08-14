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

public class BacktrackColoringBase_Worker_offerNode_19845985755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6344;

    public BacktrackColoringBase_Worker_offerNode_19845985755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6344 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        setBooleanField(term6344, term6344.getClass(), "running", false);
        setIntField(term6344, term6344.getClass(), "numColors", 0);
        setField(term6344, term6344.getClass(), "assignQueue", null);
        setField(term6344, term6344.getClass(), "nodeStack", null);
        setField(term6344, term6344.getClass(), "this$0", null);
        setField(term6344, term6344.getClass(), "name", null);
        setIntField(term6344, term6344.getClass(), "priority", 0);
        setBooleanField(term6344, term6344.getClass(), "daemon", false);
        setBooleanField(term6344, term6344.getClass(), "stillborn", false);
        setLongField(term6344, term6344.getClass(), "eetop", 0L);
        setField(term6344, term6344.getClass(), "target", null);
        setField(term6344, term6344.getClass(), "group", null);
        setField(term6344, term6344.getClass(), "contextClassLoader", null);
        setField(term6344, term6344.getClass(), "inheritedAccessControlContext", null);
        setField(term6344, term6344.getClass(), "threadLocals", null);
        setField(term6344, term6344.getClass(), "inheritableThreadLocals", null);
        setLongField(term6344, term6344.getClass(), "stackSize", 0L);
        setLongField(term6344, term6344.getClass(), "tid", 0L);
        setIntField(term6344, term6344.getClass(), "threadStatus", 0);
        setField(term6344, term6344.getClass(), "parkBlocker", null);
        setField(term6344, term6344.getClass(), "blocker", null);
        setField(term6344, term6344.getClass(), "blockerLock", null);
        setField(term6344, term6344.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term6344, term6344.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term6344, term6344.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term6344, term6344.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "offerNode", argTypes, term6344, args);
    }

};


