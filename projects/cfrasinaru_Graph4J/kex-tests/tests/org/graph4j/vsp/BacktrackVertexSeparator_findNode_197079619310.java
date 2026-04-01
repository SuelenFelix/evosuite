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

public class BacktrackVertexSeparator_findNode_197079619310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54276;

    public BacktrackVertexSeparator_findNode_197079619310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term54354 = new ArrayDeque();
        ((ArrayDeque) term54354).add((Object)null);
        ((ArrayDeque) term54354).add((Object)null);
        ((ArrayDeque) term54354).add((Object)null);
        ((ArrayDeque) term54354).add((Object)null);
        ((ArrayDeque) term54354).add((Object)null);
        ((ArrayDeque) term54354).add((Object)null);
        ((ArrayDeque) term54354).add((Object)null);
        Object term54351 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term54353 = (Object[]) newArray("[I", 7);
        Object term54362 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setBooleanField(term54351, term54351.getClass(), "running", false);
        setField(term54351, term54351.getClass(), "assignQueue", term54353);
        setField(term54351, term54351.getClass(), "nodeStack", term54354);
        setField(term54351, term54351.getClass(), "this$0", null);
        setField(term54351, term54351.getClass(), "name", "");
        setIntField(term54351, term54351.getClass(), "priority", -1547846111);
        setBooleanField(term54351, term54351.getClass(), "daemon", false);
        setBooleanField(term54351, term54351.getClass(), "stillborn", false);
        setLongField(term54351, term54351.getClass(), "eetop", 4069264186851023313L);
        setField(term54351, term54351.getClass(), "target", null);
        setField(term54362, term54362.getClass(), "parent", null);
        setField(term54362, term54362.getClass(), "name", null);
        setIntField(term54362, term54362.getClass(), "maxPriority", 10);
        setBooleanField(term54362, term54362.getClass(), "destroyed", false);
        setBooleanField(term54362, term54362.getClass(), "daemon", false);
        setIntField(term54362, term54362.getClass(), "nUnstartedThreads", 0);
        setIntField(term54362, term54362.getClass(), "nthreads", 0);
        setField(term54362, term54362.getClass(), "threads", null);
        setIntField(term54362, term54362.getClass(), "ngroups", 0);
        setField(term54362, term54362.getClass(), "groups", null);
        setField(term54351, term54351.getClass(), "group", term54362);
        setField(term54351, term54351.getClass(), "contextClassLoader", null);
        setField(term54351, term54351.getClass(), "inheritedAccessControlContext", null);
        setField(term54351, term54351.getClass(), "threadLocals", null);
        setField(term54351, term54351.getClass(), "inheritableThreadLocals", null);
        setLongField(term54351, term54351.getClass(), "stackSize", 0L);
        setLongField(term54351, term54351.getClass(), "tid", 0L);
        setIntField(term54351, term54351.getClass(), "threadStatus", 0);
        setField(term54351, term54351.getClass(), "parkBlocker", null);
        setField(term54351, term54351.getClass(), "blocker", null);
        setField(term54351, term54351.getClass(), "blockerLock", null);
        setField(term54351, term54351.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term54351, term54351.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term54351, term54351.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term54351, term54351.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term54375 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term54375, term54375.getClass(), "running", false);
        setField(term54375, term54375.getClass(), "assignQueue", null);
        setField(term54375, term54375.getClass(), "nodeStack", null);
        setField(term54375, term54375.getClass(), "this$0", null);
        setField(term54375, term54375.getClass(), "name", null);
        setIntField(term54375, term54375.getClass(), "priority", 0);
        setBooleanField(term54375, term54375.getClass(), "daemon", false);
        setBooleanField(term54375, term54375.getClass(), "stillborn", false);
        setLongField(term54375, term54375.getClass(), "eetop", 0L);
        setField(term54375, term54375.getClass(), "target", null);
        setField(term54375, term54375.getClass(), "group", null);
        setField(term54375, term54375.getClass(), "contextClassLoader", null);
        setField(term54375, term54375.getClass(), "inheritedAccessControlContext", null);
        setField(term54375, term54375.getClass(), "threadLocals", null);
        setField(term54375, term54375.getClass(), "inheritableThreadLocals", null);
        setLongField(term54375, term54375.getClass(), "stackSize", 0L);
        setLongField(term54375, term54375.getClass(), "tid", 0L);
        setIntField(term54375, term54375.getClass(), "threadStatus", 0);
        setField(term54375, term54375.getClass(), "parkBlocker", null);
        setField(term54375, term54375.getClass(), "blocker", null);
        setField(term54375, term54375.getClass(), "blockerLock", null);
        setField(term54375, term54375.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term54375, term54375.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term54375, term54375.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term54375, term54375.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term54349 = new ArrayList();
        ((ArrayList) term54349).add(term54351);
        ((ArrayList) term54349).add(term54375);
        term54276 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term54400 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setLongField(term54276, term54276.getClass(), "timeLimit", -1635471392209071620L);
        setLongField(term54276, term54276.getClass(), "startTime", -4714000263923324167L);
        setBooleanField(term54276, term54276.getClass(), "timeExpired", true);
        setField(term54400, term54400.getClass(), "graph", null);
        setField(term54400, term54400.getClass(), "separator", null);
        setField(term54400, term54400.getClass(), "leftShore", null);
        setField(term54400, term54400.getClass(), "rightShore", null);
        setIntField(term54400, term54400.getClass(), "maxShoreSize", 0);
        setField(term54276, term54276.getClass(), "solution", term54400);
        setField(term54276, term54276.getClass(), "workers", term54349);
        setLongField(term54276, term54276.getClass(), "nodesExplored", 5184635470881147510L);
        setIntField(term54276, term54276.getClass(), "minSepSize", -534826636);
        setIntField(term54276, term54276.getClass(), "vertexConnectivity", 1364855812);
        setIntField(term54276, term54276.getClass(), "greedySepSize", -1011747145);
        setIntField(term54276, term54276.getClass(), "LEFT", 1581553091);
        setIntField(term54276, term54276.getClass(), "RIGHT", 1367678685);
        setIntField(term54276, term54276.getClass(), "SEP", -317170853);
        setIntField(term54276, term54276.getClass(), "UNKNOWN", -1016433388);
        setIntField(term54276, term54276.getClass(), "FAILURE", -385847082);
        setIntField(term54276, term54276.getClass(), "POTENTIAL_SOLUTION", 222989848);
        setIntField(term54276, term54276.getClass(), "maxShoreSize", -927191833);
        setField(term54276, term54276.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findNode", argTypes, term54276, args);
    }

};


