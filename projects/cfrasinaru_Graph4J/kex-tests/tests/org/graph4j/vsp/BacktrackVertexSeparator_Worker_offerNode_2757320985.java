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

public class BacktrackVertexSeparator_Worker_offerNode_2757320985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public BacktrackVertexSeparator_Worker_offerNode_2757320985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term710, term710.getClass(), "running", false);
        setField(term710, term710.getClass(), "assignQueue", null);
        setField(term710, term710.getClass(), "nodeStack", null);
        setField(term710, term710.getClass(), "this$0", null);
        setField(term710, term710.getClass(), "name", null);
        setIntField(term710, term710.getClass(), "priority", 0);
        setBooleanField(term710, term710.getClass(), "daemon", false);
        setBooleanField(term710, term710.getClass(), "stillborn", false);
        setLongField(term710, term710.getClass(), "eetop", 0L);
        setField(term710, term710.getClass(), "target", null);
        setField(term710, term710.getClass(), "group", null);
        setField(term710, term710.getClass(), "contextClassLoader", null);
        setField(term710, term710.getClass(), "inheritedAccessControlContext", null);
        setField(term710, term710.getClass(), "threadLocals", null);
        setField(term710, term710.getClass(), "inheritableThreadLocals", null);
        setLongField(term710, term710.getClass(), "stackSize", 0L);
        setLongField(term710, term710.getClass(), "tid", 0L);
        setIntField(term710, term710.getClass(), "threadStatus", 0);
        setField(term710, term710.getClass(), "parkBlocker", null);
        setField(term710, term710.getClass(), "blocker", null);
        setField(term710, term710.getClass(), "blockerLock", null);
        setField(term710, term710.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term710, term710.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term710, term710.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term710, term710.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "offerNode", argTypes, term710, args);
    }

};


