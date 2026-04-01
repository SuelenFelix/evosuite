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
     Object term46982;

    public BacktrackVertexSeparator_Worker_run_6286831474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46982 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term46982, term46982.getClass(), "running", false);
        setField(term46982, term46982.getClass(), "assignQueue", null);
        setField(term46982, term46982.getClass(), "nodeStack", null);
        setField(term46982, term46982.getClass(), "this$0", null);
        setField(term46982, term46982.getClass(), "name", null);
        setIntField(term46982, term46982.getClass(), "priority", 0);
        setBooleanField(term46982, term46982.getClass(), "daemon", false);
        setBooleanField(term46982, term46982.getClass(), "stillborn", false);
        setLongField(term46982, term46982.getClass(), "eetop", 0L);
        setField(term46982, term46982.getClass(), "target", null);
        setField(term46982, term46982.getClass(), "group", null);
        setField(term46982, term46982.getClass(), "contextClassLoader", null);
        setField(term46982, term46982.getClass(), "inheritedAccessControlContext", null);
        setField(term46982, term46982.getClass(), "threadLocals", null);
        setField(term46982, term46982.getClass(), "inheritableThreadLocals", null);
        setLongField(term46982, term46982.getClass(), "stackSize", 0L);
        setLongField(term46982, term46982.getClass(), "tid", 0L);
        setIntField(term46982, term46982.getClass(), "threadStatus", 0);
        setField(term46982, term46982.getClass(), "parkBlocker", null);
        setField(term46982, term46982.getClass(), "blocker", null);
        setField(term46982, term46982.getClass(), "blockerLock", null);
        setField(term46982, term46982.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term46982, term46982.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term46982, term46982.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term46982, term46982.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term46982, args);
    }

};


