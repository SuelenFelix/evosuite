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

public class BacktrackVertexSeparator_nodesExplored_126849438611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2683;

    public BacktrackVertexSeparator_nodesExplored_126849438611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2746 = new ArrayDeque();
        ((ArrayDeque) term2746).add((Object)null);
        ((ArrayDeque) term2746).add((Object)null);
        ((ArrayDeque) term2746).add((Object)null);
        ((ArrayDeque) term2746).add((Object)null);
        ((ArrayDeque) term2746).add((Object)null);
        Object term2743 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term2745 = (Object[]) newArray("[I", 4);
        Object term2754 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setBooleanField(term2743, term2743.getClass(), "running", false);
        setField(term2743, term2743.getClass(), "assignQueue", term2745);
        setField(term2743, term2743.getClass(), "nodeStack", term2746);
        setField(term2743, term2743.getClass(), "this$0", null);
        setField(term2743, term2743.getClass(), "name", "");
        setIntField(term2743, term2743.getClass(), "priority", -1516568587);
        setBooleanField(term2743, term2743.getClass(), "daemon", false);
        setBooleanField(term2743, term2743.getClass(), "stillborn", true);
        setLongField(term2743, term2743.getClass(), "eetop", 1084801489398441516L);
        setField(term2743, term2743.getClass(), "target", null);
        setField(term2754, term2754.getClass(), "parent", null);
        setField(term2754, term2754.getClass(), "name", null);
        setIntField(term2754, term2754.getClass(), "maxPriority", 10);
        setBooleanField(term2754, term2754.getClass(), "destroyed", false);
        setBooleanField(term2754, term2754.getClass(), "daemon", false);
        setIntField(term2754, term2754.getClass(), "nUnstartedThreads", 0);
        setIntField(term2754, term2754.getClass(), "nthreads", 0);
        setField(term2754, term2754.getClass(), "threads", null);
        setIntField(term2754, term2754.getClass(), "ngroups", 0);
        setField(term2754, term2754.getClass(), "groups", null);
        setField(term2743, term2743.getClass(), "group", term2754);
        setField(term2743, term2743.getClass(), "contextClassLoader", null);
        setField(term2743, term2743.getClass(), "inheritedAccessControlContext", null);
        setField(term2743, term2743.getClass(), "threadLocals", null);
        setField(term2743, term2743.getClass(), "inheritableThreadLocals", null);
        setLongField(term2743, term2743.getClass(), "stackSize", 0L);
        setLongField(term2743, term2743.getClass(), "tid", 0L);
        setIntField(term2743, term2743.getClass(), "threadStatus", 0);
        setField(term2743, term2743.getClass(), "parkBlocker", null);
        setField(term2743, term2743.getClass(), "blocker", null);
        setField(term2743, term2743.getClass(), "blockerLock", null);
        setField(term2743, term2743.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2743, term2743.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2743, term2743.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2743, term2743.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term2767 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term2767, term2767.getClass(), "running", false);
        setField(term2767, term2767.getClass(), "assignQueue", null);
        setField(term2767, term2767.getClass(), "nodeStack", null);
        setField(term2767, term2767.getClass(), "this$0", null);
        setField(term2767, term2767.getClass(), "name", null);
        setIntField(term2767, term2767.getClass(), "priority", 0);
        setBooleanField(term2767, term2767.getClass(), "daemon", false);
        setBooleanField(term2767, term2767.getClass(), "stillborn", false);
        setLongField(term2767, term2767.getClass(), "eetop", 0L);
        setField(term2767, term2767.getClass(), "target", null);
        setField(term2767, term2767.getClass(), "group", null);
        setField(term2767, term2767.getClass(), "contextClassLoader", null);
        setField(term2767, term2767.getClass(), "inheritedAccessControlContext", null);
        setField(term2767, term2767.getClass(), "threadLocals", null);
        setField(term2767, term2767.getClass(), "inheritableThreadLocals", null);
        setLongField(term2767, term2767.getClass(), "stackSize", 0L);
        setLongField(term2767, term2767.getClass(), "tid", 0L);
        setIntField(term2767, term2767.getClass(), "threadStatus", 0);
        setField(term2767, term2767.getClass(), "parkBlocker", null);
        setField(term2767, term2767.getClass(), "blocker", null);
        setField(term2767, term2767.getClass(), "blockerLock", null);
        setField(term2767, term2767.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2767, term2767.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2767, term2767.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2767, term2767.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term2779 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term2779, term2779.getClass(), "running", false);
        setField(term2779, term2779.getClass(), "assignQueue", null);
        setField(term2779, term2779.getClass(), "nodeStack", null);
        setField(term2779, term2779.getClass(), "this$0", null);
        setField(term2779, term2779.getClass(), "name", null);
        setIntField(term2779, term2779.getClass(), "priority", 0);
        setBooleanField(term2779, term2779.getClass(), "daemon", false);
        setBooleanField(term2779, term2779.getClass(), "stillborn", false);
        setLongField(term2779, term2779.getClass(), "eetop", 0L);
        setField(term2779, term2779.getClass(), "target", null);
        setField(term2779, term2779.getClass(), "group", null);
        setField(term2779, term2779.getClass(), "contextClassLoader", null);
        setField(term2779, term2779.getClass(), "inheritedAccessControlContext", null);
        setField(term2779, term2779.getClass(), "threadLocals", null);
        setField(term2779, term2779.getClass(), "inheritableThreadLocals", null);
        setLongField(term2779, term2779.getClass(), "stackSize", 0L);
        setLongField(term2779, term2779.getClass(), "tid", 0L);
        setIntField(term2779, term2779.getClass(), "threadStatus", 0);
        setField(term2779, term2779.getClass(), "parkBlocker", null);
        setField(term2779, term2779.getClass(), "blocker", null);
        setField(term2779, term2779.getClass(), "blockerLock", null);
        setField(term2779, term2779.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2779, term2779.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2779, term2779.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2779, term2779.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term2741 = new ArrayList();
        ((ArrayList) term2741).add(term2743);
        ((ArrayList) term2741).add(term2767);
        ((ArrayList) term2741).add(term2779);
        term2683 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term2804 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setLongField(term2683, term2683.getClass(), "timeLimit", -5386201758403679145L);
        setLongField(term2683, term2683.getClass(), "startTime", -7268507582722666254L);
        setBooleanField(term2683, term2683.getClass(), "timeExpired", false);
        setField(term2804, term2804.getClass(), "graph", null);
        setField(term2804, term2804.getClass(), "separator", null);
        setField(term2804, term2804.getClass(), "leftShore", null);
        setField(term2804, term2804.getClass(), "rightShore", null);
        setIntField(term2804, term2804.getClass(), "maxShoreSize", 0);
        setField(term2683, term2683.getClass(), "solution", term2804);
        setField(term2683, term2683.getClass(), "workers", term2741);
        setLongField(term2683, term2683.getClass(), "nodesExplored", 6273754186658578034L);
        setIntField(term2683, term2683.getClass(), "minSepSize", 1537690170);
        setIntField(term2683, term2683.getClass(), "vertexConnectivity", 1133116994);
        setIntField(term2683, term2683.getClass(), "greedySepSize", -1195191239);
        setIntField(term2683, term2683.getClass(), "LEFT", -470798982);
        setIntField(term2683, term2683.getClass(), "RIGHT", 1844345719);
        setIntField(term2683, term2683.getClass(), "SEP", 1704024265);
        setIntField(term2683, term2683.getClass(), "UNKNOWN", 501801161);
        setIntField(term2683, term2683.getClass(), "FAILURE", 2103971768);
        setIntField(term2683, term2683.getClass(), "POTENTIAL_SOLUTION", -939132796);
        setIntField(term2683, term2683.getClass(), "maxShoreSize", 159279866);
        setField(term2683, term2683.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nodesExplored", argTypes, term2683, args);
    }

};


