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
import java.lang.Object;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class BacktrackVertexSeparator_solve_13586597153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;

    public BacktrackVertexSeparator_solve_13586597153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term943 = new ArrayDeque();
        ((ArrayDeque) term943).add((Object)null);
        ((ArrayDeque) term943).add((Object)null);
        ((ArrayDeque) term943).add((Object)null);
        Object term940 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term942 = (Object[]) newArray("[I", 5);
        Object term951 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setBooleanField(term940, term940.getClass(), "running", false);
        setField(term940, term940.getClass(), "assignQueue", term942);
        setField(term940, term940.getClass(), "nodeStack", term943);
        setField(term940, term940.getClass(), "this$0", null);
        setField(term940, term940.getClass(), "name", "");
        setIntField(term940, term940.getClass(), "priority", -695279311);
        setBooleanField(term940, term940.getClass(), "daemon", false);
        setBooleanField(term940, term940.getClass(), "stillborn", true);
        setLongField(term940, term940.getClass(), "eetop", 5907001541142728739L);
        setField(term940, term940.getClass(), "target", null);
        setField(term951, term951.getClass(), "parent", null);
        setField(term951, term951.getClass(), "name", null);
        setIntField(term951, term951.getClass(), "maxPriority", 10);
        setBooleanField(term951, term951.getClass(), "destroyed", false);
        setBooleanField(term951, term951.getClass(), "daemon", false);
        setIntField(term951, term951.getClass(), "nUnstartedThreads", 0);
        setIntField(term951, term951.getClass(), "nthreads", 0);
        setField(term951, term951.getClass(), "threads", null);
        setIntField(term951, term951.getClass(), "ngroups", 0);
        setField(term951, term951.getClass(), "groups", null);
        setField(term940, term940.getClass(), "group", term951);
        setField(term940, term940.getClass(), "contextClassLoader", null);
        setField(term940, term940.getClass(), "inheritedAccessControlContext", null);
        setField(term940, term940.getClass(), "threadLocals", null);
        setField(term940, term940.getClass(), "inheritableThreadLocals", null);
        setLongField(term940, term940.getClass(), "stackSize", 0L);
        setLongField(term940, term940.getClass(), "tid", 0L);
        setIntField(term940, term940.getClass(), "threadStatus", 0);
        setField(term940, term940.getClass(), "parkBlocker", null);
        setField(term940, term940.getClass(), "blocker", null);
        setField(term940, term940.getClass(), "blockerLock", null);
        setField(term940, term940.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term940, term940.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term940, term940.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term940, term940.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term938 = new ArrayList();
        ((ArrayList) term938).add(term940);
        term874 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term977 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setLongField(term874, term874.getClass(), "timeLimit", -6823727938421990489L);
        setLongField(term874, term874.getClass(), "startTime", -484994522244390100L);
        setBooleanField(term874, term874.getClass(), "timeExpired", false);
        setField(term977, term977.getClass(), "graph", null);
        setField(term977, term977.getClass(), "separator", null);
        setField(term977, term977.getClass(), "leftShore", null);
        setField(term977, term977.getClass(), "rightShore", null);
        setIntField(term977, term977.getClass(), "maxShoreSize", 0);
        setField(term874, term874.getClass(), "solution", term977);
        setField(term874, term874.getClass(), "workers", term938);
        setLongField(term874, term874.getClass(), "nodesExplored", 4178434741742309755L);
        setIntField(term874, term874.getClass(), "minSepSize", 114279242);
        setIntField(term874, term874.getClass(), "vertexConnectivity", 990883365);
        setIntField(term874, term874.getClass(), "greedySepSize", 633598642);
        setIntField(term874, term874.getClass(), "LEFT", 1862841859);
        setIntField(term874, term874.getClass(), "RIGHT", -1114668574);
        setIntField(term874, term874.getClass(), "SEP", 514511037);
        setIntField(term874, term874.getClass(), "UNKNOWN", 1713573821);
        setIntField(term874, term874.getClass(), "FAILURE", 1956590498);
        setIntField(term874, term874.getClass(), "POTENTIAL_SOLUTION", 1467356494);
        setIntField(term874, term874.getClass(), "maxShoreSize", -26316536);
        setField(term874, term874.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "solve", argTypes, term874, args);
    }

};


