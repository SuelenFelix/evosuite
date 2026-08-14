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
     Object term2548;

    public BacktrackVertexSeparator_findNode_197079619310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2610 = new ArrayDeque();
        Object term2607 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term2609 = (Object[]) newArray("[I", 5);
        Object term2618 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term2625 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term2630 = newInstance(Class.forName("java.lang.ThreadLocal$ThreadLocalMap"));
        Object term2633 = newInstance(Class.forName("java.lang.ThreadLocal$ThreadLocalMap"));
        Object term2639 = newInstance(Class.forName("java.lang.Object"));
        Object term2640 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2607, term2607.getClass(), "running", true);
        setField(term2607, term2607.getClass(), "assignQueue", term2609);
        setField(term2607, term2607.getClass(), "nodeStack", term2610);
        setField(term2607, term2607.getClass(), "this$0", null);
        setField(term2607, term2607.getClass(), "name", "");
        setIntField(term2607, term2607.getClass(), "priority", 1963632911);
        setBooleanField(term2607, term2607.getClass(), "daemon", true);
        setBooleanField(term2607, term2607.getClass(), "stillborn", true);
        setLongField(term2607, term2607.getClass(), "eetop", -6342139649364011743L);
        setField(term2607, term2607.getClass(), "target", null);
        setField(term2618, term2618.getClass(), "parent", null);
        setField(term2618, term2618.getClass(), "name", null);
        setIntField(term2618, term2618.getClass(), "maxPriority", 10);
        setBooleanField(term2618, term2618.getClass(), "destroyed", false);
        setBooleanField(term2618, term2618.getClass(), "daemon", false);
        setIntField(term2618, term2618.getClass(), "nUnstartedThreads", 657342039);
        setIntField(term2618, term2618.getClass(), "nthreads", 1483999606);
        setField(term2618, term2618.getClass(), "threads", null);
        setIntField(term2618, term2618.getClass(), "ngroups", 1871761182);
        setField(term2618, term2618.getClass(), "groups", null);
        setField(term2607, term2607.getClass(), "group", term2618);
        setField(term2607, term2607.getClass(), "contextClassLoader", null);
        setField(term2625, term2625.getClass(), "context", null);
        setBooleanField(term2625, term2625.getClass(), "isPrivileged", false);
        setBooleanField(term2625, term2625.getClass(), "isAuthorized", true);
        setField(term2625, term2625.getClass(), "privilegedContext", null);
        setField(term2625, term2625.getClass(), "combiner", null);
        setField(term2625, term2625.getClass(), "permissions", null);
        setField(term2625, term2625.getClass(), "parent", null);
        setBooleanField(term2625, term2625.getClass(), "isWrapped", false);
        setBooleanField(term2625, term2625.getClass(), "isLimited", false);
        setField(term2625, term2625.getClass(), "limitedContext", null);
        setField(term2607, term2607.getClass(), "inheritedAccessControlContext", term2625);
        setField(term2630, term2630.getClass(), "table", null);
        setIntField(term2630, term2630.getClass(), "size", 0);
        setIntField(term2630, term2630.getClass(), "threshold", 0);
        setField(term2607, term2607.getClass(), "threadLocals", term2630);
        setField(term2633, term2633.getClass(), "table", null);
        setIntField(term2633, term2633.getClass(), "size", 0);
        setIntField(term2633, term2633.getClass(), "threshold", 0);
        setField(term2607, term2607.getClass(), "inheritableThreadLocals", term2633);
        setLongField(term2607, term2607.getClass(), "stackSize", -4924950707540628022L);
        setLongField(term2607, term2607.getClass(), "tid", -4393710401270724527L);
        setIntField(term2607, term2607.getClass(), "threadStatus", 233983728);
        setField(term2607, term2607.getClass(), "parkBlocker", term2639);
        setField(term2607, term2607.getClass(), "blocker", null);
        setField(term2607, term2607.getClass(), "blockerLock", term2640);
        setField(term2607, term2607.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2607, term2607.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2607, term2607.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2607, term2607.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term2644 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term2644, term2644.getClass(), "running", false);
        setField(term2644, term2644.getClass(), "assignQueue", null);
        setField(term2644, term2644.getClass(), "nodeStack", null);
        setField(term2644, term2644.getClass(), "this$0", null);
        setField(term2644, term2644.getClass(), "name", null);
        setIntField(term2644, term2644.getClass(), "priority", 0);
        setBooleanField(term2644, term2644.getClass(), "daemon", false);
        setBooleanField(term2644, term2644.getClass(), "stillborn", false);
        setLongField(term2644, term2644.getClass(), "eetop", 0L);
        setField(term2644, term2644.getClass(), "target", null);
        setField(term2644, term2644.getClass(), "group", null);
        setField(term2644, term2644.getClass(), "contextClassLoader", null);
        setField(term2644, term2644.getClass(), "inheritedAccessControlContext", null);
        setField(term2644, term2644.getClass(), "threadLocals", null);
        setField(term2644, term2644.getClass(), "inheritableThreadLocals", null);
        setLongField(term2644, term2644.getClass(), "stackSize", 0L);
        setLongField(term2644, term2644.getClass(), "tid", 0L);
        setIntField(term2644, term2644.getClass(), "threadStatus", 0);
        setField(term2644, term2644.getClass(), "parkBlocker", null);
        setField(term2644, term2644.getClass(), "blocker", null);
        setField(term2644, term2644.getClass(), "blockerLock", null);
        setField(term2644, term2644.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2644, term2644.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2644, term2644.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2644, term2644.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term2656 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term2656, term2656.getClass(), "running", false);
        setField(term2656, term2656.getClass(), "assignQueue", null);
        setField(term2656, term2656.getClass(), "nodeStack", null);
        setField(term2656, term2656.getClass(), "this$0", null);
        setField(term2656, term2656.getClass(), "name", null);
        setIntField(term2656, term2656.getClass(), "priority", 0);
        setBooleanField(term2656, term2656.getClass(), "daemon", false);
        setBooleanField(term2656, term2656.getClass(), "stillborn", false);
        setLongField(term2656, term2656.getClass(), "eetop", 0L);
        setField(term2656, term2656.getClass(), "target", null);
        setField(term2656, term2656.getClass(), "group", null);
        setField(term2656, term2656.getClass(), "contextClassLoader", null);
        setField(term2656, term2656.getClass(), "inheritedAccessControlContext", null);
        setField(term2656, term2656.getClass(), "threadLocals", null);
        setField(term2656, term2656.getClass(), "inheritableThreadLocals", null);
        setLongField(term2656, term2656.getClass(), "stackSize", 0L);
        setLongField(term2656, term2656.getClass(), "tid", 0L);
        setIntField(term2656, term2656.getClass(), "threadStatus", 0);
        setField(term2656, term2656.getClass(), "parkBlocker", null);
        setField(term2656, term2656.getClass(), "blocker", null);
        setField(term2656, term2656.getClass(), "blockerLock", null);
        setField(term2656, term2656.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2656, term2656.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2656, term2656.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2656, term2656.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term2605 = new ArrayList();
        ((ArrayList) term2605).add(term2607);
        ((ArrayList) term2605).add(term2644);
        ((ArrayList) term2605).add(term2656);
        term2548 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term2681 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setLongField(term2548, term2548.getClass(), "timeLimit", -6950146046121430355L);
        setLongField(term2548, term2548.getClass(), "startTime", 1667122142089513324L);
        setBooleanField(term2548, term2548.getClass(), "timeExpired", false);
        setField(term2681, term2681.getClass(), "graph", null);
        setField(term2681, term2681.getClass(), "separator", null);
        setField(term2681, term2681.getClass(), "leftShore", null);
        setField(term2681, term2681.getClass(), "rightShore", null);
        setIntField(term2681, term2681.getClass(), "maxShoreSize", 0);
        setField(term2548, term2548.getClass(), "solution", term2681);
        setField(term2548, term2548.getClass(), "workers", term2605);
        setLongField(term2548, term2548.getClass(), "nodesExplored", -4822736661741380518L);
        setIntField(term2548, term2548.getClass(), "minSepSize", -1650132476);
        setIntField(term2548, term2548.getClass(), "vertexConnectivity", 1719680265);
        setIntField(term2548, term2548.getClass(), "greedySepSize", -1890898783);
        setIntField(term2548, term2548.getClass(), "LEFT", 1357632911);
        setIntField(term2548, term2548.getClass(), "RIGHT", 1768195761);
        setIntField(term2548, term2548.getClass(), "SEP", -1382661134);
        setIntField(term2548, term2548.getClass(), "UNKNOWN", -1042022818);
        setIntField(term2548, term2548.getClass(), "FAILURE", 317372051);
        setIntField(term2548, term2548.getClass(), "POTENTIAL_SOLUTION", 892170444);
        setIntField(term2548, term2548.getClass(), "maxShoreSize", -82417507);
        setField(term2548, term2548.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findNode", argTypes, term2548, args);
    }

};


