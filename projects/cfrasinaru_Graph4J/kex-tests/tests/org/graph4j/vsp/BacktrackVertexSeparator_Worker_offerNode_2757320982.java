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
import java.util.ArrayDeque;

public class BacktrackVertexSeparator_Worker_offerNode_2757320982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46886;

    public BacktrackVertexSeparator_Worker_offerNode_2757320982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46891 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term46892 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term46909 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term46914 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object[] term46916 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        Object term46917 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setLongField(term46892, term46892.getClass(), "timeLimit", 4513004407927379358L);
        setLongField(term46892, term46892.getClass(), "startTime", -7115418542247301000L);
        setBooleanField(term46892, term46892.getClass(), "timeExpired", true);
        setField(term46892, term46892.getClass(), "solution", null);
        setField(term46892, term46892.getClass(), "workers", null);
        setLongField(term46892, term46892.getClass(), "nodesExplored", -6301101997917060727L);
        setIntField(term46892, term46892.getClass(), "minSepSize", 2086898490);
        setIntField(term46892, term46892.getClass(), "vertexConnectivity", -556807183);
        setIntField(term46892, term46892.getClass(), "greedySepSize", 2079852711);
        setIntField(term46892, term46892.getClass(), "LEFT", -1960722897);
        setIntField(term46892, term46892.getClass(), "RIGHT", 2058852943);
        setIntField(term46892, term46892.getClass(), "SEP", 1189778174);
        setIntField(term46892, term46892.getClass(), "UNKNOWN", 1980524877);
        setIntField(term46892, term46892.getClass(), "FAILURE", 1572487602);
        setIntField(term46892, term46892.getClass(), "POTENTIAL_SOLUTION", 354453982);
        setIntField(term46892, term46892.getClass(), "maxShoreSize", 791608608);
        setField(term46892, term46892.getClass(), "graph", null);
        setField(term46891, term46891.getClass(), "alg", term46892);
        setIntField(term46891, term46891.getClass(), "vertex", 832068739);
        setIntField(term46891, term46891.getClass(), "value", -1109536397);
        setField(term46909, term46909.getClass(), "alg", null);
        setIntField(term46909, term46909.getClass(), "vertex", 0);
        setIntField(term46909, term46909.getClass(), "value", 0);
        setField(term46909, term46909.getClass(), "parent", null);
        setField(term46909, term46909.getClass(), "separator", null);
        setField(term46909, term46909.getClass(), "domains", null);
        setField(term46909, term46909.getClass(), "minDomain", null);
        setBooleanField(term46909, term46909.getClass(), "propagator", false);
        setBooleanField(term46909, term46909.getClass(), "failed", false);
        setField(term46891, term46891.getClass(), "parent", term46909);
        setField(term46914, term46914.getClass(), "graph", null);
        setField(term46914, term46914.getClass(), "separator", null);
        setField(term46914, term46914.getClass(), "leftShore", null);
        setField(term46914, term46914.getClass(), "rightShore", null);
        setIntField(term46914, term46914.getClass(), "maxShoreSize", 0);
        setField(term46891, term46891.getClass(), "separator", term46914);
        setField(term46891, term46891.getClass(), "domains", term46916);
        setIntField(term46917, term46917.getClass(), "vertex", 0);
        setField(term46917, term46917.getClass(), "values", null);
        setField(term46917, term46917.getClass(), "positions", null);
        setIntField(term46917, term46917.getClass(), "size", 0);
        setField(term46891, term46891.getClass(), "minDomain", term46917);
        setBooleanField(term46891, term46891.getClass(), "propagator", false);
        setBooleanField(term46891, term46891.getClass(), "failed", false);
        Object term46922 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term46922, term46922.getClass(), "alg", null);
        setIntField(term46922, term46922.getClass(), "vertex", 0);
        setIntField(term46922, term46922.getClass(), "value", 0);
        setField(term46922, term46922.getClass(), "parent", null);
        setField(term46922, term46922.getClass(), "separator", null);
        setField(term46922, term46922.getClass(), "domains", null);
        setField(term46922, term46922.getClass(), "minDomain", null);
        setBooleanField(term46922, term46922.getClass(), "propagator", false);
        setBooleanField(term46922, term46922.getClass(), "failed", false);
        ArrayDeque term46889 = new ArrayDeque();
        ((ArrayDeque) term46889).add(term46891);
        ((ArrayDeque) term46889).add(term46922);
        term46886 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term46888 = (Object[]) newArray("[I", 0);
        Object term46945 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setBooleanField(term46886, term46886.getClass(), "running", false);
        setField(term46886, term46886.getClass(), "assignQueue", term46888);
        setField(term46886, term46886.getClass(), "nodeStack", term46889);
        setField(term46886, term46886.getClass(), "this$0", null);
        setField(term46886, term46886.getClass(), "name", "mLUZFTfjle");
        setIntField(term46886, term46886.getClass(), "priority", -356798505);
        setBooleanField(term46886, term46886.getClass(), "daemon", false);
        setBooleanField(term46886, term46886.getClass(), "stillborn", true);
        setLongField(term46886, term46886.getClass(), "eetop", 8166095254618543564L);
        setField(term46886, term46886.getClass(), "target", null);
        setField(term46945, term46945.getClass(), "parent", null);
        setField(term46945, term46945.getClass(), "name", "system");
        setIntField(term46945, term46945.getClass(), "maxPriority", 10);
        setBooleanField(term46945, term46945.getClass(), "destroyed", false);
        setBooleanField(term46945, term46945.getClass(), "daemon", false);
        setIntField(term46945, term46945.getClass(), "nUnstartedThreads", 0);
        setIntField(term46945, term46945.getClass(), "nthreads", 0);
        setField(term46945, term46945.getClass(), "threads", null);
        setIntField(term46945, term46945.getClass(), "ngroups", 0);
        setField(term46945, term46945.getClass(), "groups", null);
        setField(term46886, term46886.getClass(), "group", term46945);
        setField(term46886, term46886.getClass(), "contextClassLoader", null);
        setField(term46886, term46886.getClass(), "inheritedAccessControlContext", null);
        setField(term46886, term46886.getClass(), "threadLocals", null);
        setField(term46886, term46886.getClass(), "inheritableThreadLocals", null);
        setLongField(term46886, term46886.getClass(), "stackSize", 0L);
        setLongField(term46886, term46886.getClass(), "tid", 0L);
        setIntField(term46886, term46886.getClass(), "threadStatus", 0);
        setField(term46886, term46886.getClass(), "parkBlocker", null);
        setField(term46886, term46886.getClass(), "blocker", null);
        setField(term46886, term46886.getClass(), "blockerLock", null);
        setField(term46886, term46886.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term46886, term46886.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term46886, term46886.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term46886, term46886.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "offerNode", argTypes, term46886, args);
    }

};


