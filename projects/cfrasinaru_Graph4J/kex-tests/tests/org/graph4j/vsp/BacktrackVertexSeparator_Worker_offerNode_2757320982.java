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
     Object term522;

    public BacktrackVertexSeparator_Worker_offerNode_2757320982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term573 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term574 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term591 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term596 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object[] term598 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term599 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setLongField(term574, term574.getClass(), "timeLimit", -4365849114644724155L);
        setLongField(term574, term574.getClass(), "startTime", 2486810210675247493L);
        setBooleanField(term574, term574.getClass(), "timeExpired", false);
        setField(term574, term574.getClass(), "solution", null);
        setField(term574, term574.getClass(), "workers", null);
        setLongField(term574, term574.getClass(), "nodesExplored", 1967728129628047933L);
        setIntField(term574, term574.getClass(), "minSepSize", -1420269858);
        setIntField(term574, term574.getClass(), "vertexConnectivity", -2119545015);
        setIntField(term574, term574.getClass(), "greedySepSize", 1272542218);
        setIntField(term574, term574.getClass(), "LEFT", 1209799204);
        setIntField(term574, term574.getClass(), "RIGHT", 1094107751);
        setIntField(term574, term574.getClass(), "SEP", 844222656);
        setIntField(term574, term574.getClass(), "UNKNOWN", -18216811);
        setIntField(term574, term574.getClass(), "FAILURE", -1813280137);
        setIntField(term574, term574.getClass(), "POTENTIAL_SOLUTION", 719656595);
        setIntField(term574, term574.getClass(), "maxShoreSize", -1516995753);
        setField(term574, term574.getClass(), "graph", null);
        setField(term573, term573.getClass(), "alg", term574);
        setIntField(term573, term573.getClass(), "vertex", -390501023);
        setIntField(term573, term573.getClass(), "value", -1667482829);
        setField(term591, term591.getClass(), "alg", null);
        setIntField(term591, term591.getClass(), "vertex", 0);
        setIntField(term591, term591.getClass(), "value", 0);
        setField(term591, term591.getClass(), "parent", null);
        setField(term591, term591.getClass(), "separator", null);
        setField(term591, term591.getClass(), "domains", null);
        setField(term591, term591.getClass(), "minDomain", null);
        setBooleanField(term591, term591.getClass(), "propagator", false);
        setBooleanField(term591, term591.getClass(), "failed", false);
        setField(term573, term573.getClass(), "parent", term591);
        setField(term596, term596.getClass(), "graph", null);
        setField(term596, term596.getClass(), "separator", null);
        setField(term596, term596.getClass(), "leftShore", null);
        setField(term596, term596.getClass(), "rightShore", null);
        setIntField(term596, term596.getClass(), "maxShoreSize", 0);
        setField(term573, term573.getClass(), "separator", term596);
        setField(term573, term573.getClass(), "domains", term598);
        setIntField(term599, term599.getClass(), "vertex", 0);
        setField(term599, term599.getClass(), "values", null);
        setField(term599, term599.getClass(), "positions", null);
        setIntField(term599, term599.getClass(), "size", 0);
        setField(term573, term573.getClass(), "minDomain", term599);
        setBooleanField(term573, term573.getClass(), "propagator", false);
        setBooleanField(term573, term573.getClass(), "failed", false);
        ArrayDeque term571 = new ArrayDeque();
        ((ArrayDeque) term571).add(term573);
        term522 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term524 = (Object[]) newArray("[I", 7);
        int[] term525 = (int[]) newIntArray(9);
        int[] term535 = (int[]) newIntArray(7);
        int[] term543 = (int[]) newIntArray(6);
        int[] term550 = (int[]) newIntArray(6);
        int[] term557 = (int[]) newIntArray(0);
        int[] term558 = (int[]) newIntArray(6);
        int[] term565 = (int[]) newIntArray(5);
        Object term622 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setBooleanField(term522, term522.getClass(), "running", true);
        setIntElement(term525, 0, -129547140);
        setIntElement(term525, 1, 199287428);
        setIntElement(term525, 2, -1195339592);
        setIntElement(term525, 3, -376422566);
        setIntElement(term525, 4, 306847454);
        setIntElement(term525, 5, 1745276158);
        setIntElement(term525, 6, 2009020256);
        setIntElement(term525, 7, 2049577015);
        setIntElement(term525, 8, 1236004505);
        setElement(term524, 0, term525);
        setIntElement(term535, 0, 1050765721);
        setIntElement(term535, 1, 474518942);
        setIntElement(term535, 2, -1656687479);
        setIntElement(term535, 3, -249614216);
        setIntElement(term535, 4, 1870727665);
        setIntElement(term535, 5, -519881101);
        setIntElement(term535, 6, -680920524);
        setElement(term524, 1, term535);
        setIntElement(term543, 0, -916335264);
        setIntElement(term543, 1, -919416536);
        setIntElement(term543, 2, -43417861);
        setIntElement(term543, 3, -1533843432);
        setIntElement(term543, 4, -123338791);
        setIntElement(term543, 5, -1467089634);
        setElement(term524, 2, term543);
        setIntElement(term550, 0, 413548937);
        setIntElement(term550, 1, 1901317214);
        setIntElement(term550, 2, 1166710220);
        setIntElement(term550, 3, -1070592289);
        setIntElement(term550, 4, -1464172784);
        setIntElement(term550, 5, 32185364);
        setElement(term524, 3, term550);
        setElement(term524, 4, term557);
        setIntElement(term558, 0, 1768204942);
        setIntElement(term558, 1, 1252951645);
        setIntElement(term558, 2, 574481092);
        setIntElement(term558, 3, -310528004);
        setIntElement(term558, 4, -634976996);
        setIntElement(term558, 5, -1015274146);
        setElement(term524, 5, term558);
        setIntElement(term565, 0, -49052672);
        setIntElement(term565, 1, 339372704);
        setIntElement(term565, 2, -851097944);
        setIntElement(term565, 3, 803925431);
        setIntElement(term565, 4, 76929641);
        setElement(term524, 6, term565);
        setField(term522, term522.getClass(), "assignQueue", term524);
        setField(term522, term522.getClass(), "nodeStack", term571);
        setField(term522, term522.getClass(), "this$0", null);
        setField(term522, term522.getClass(), "name", "SzjVpOQTyS");
        setIntField(term522, term522.getClass(), "priority", 1116576792);
        setBooleanField(term522, term522.getClass(), "daemon", true);
        setBooleanField(term522, term522.getClass(), "stillborn", true);
        setLongField(term522, term522.getClass(), "eetop", 2120084523938730454L);
        setField(term522, term522.getClass(), "target", null);
        setField(term622, term622.getClass(), "parent", null);
        setField(term622, term622.getClass(), "name", "system");
        setIntField(term622, term622.getClass(), "maxPriority", 10);
        setBooleanField(term622, term622.getClass(), "destroyed", false);
        setBooleanField(term622, term622.getClass(), "daemon", false);
        setIntField(term622, term622.getClass(), "nUnstartedThreads", 0);
        setIntField(term622, term622.getClass(), "nthreads", 0);
        setField(term622, term622.getClass(), "threads", null);
        setIntField(term622, term622.getClass(), "ngroups", 0);
        setField(term622, term622.getClass(), "groups", null);
        setField(term522, term522.getClass(), "group", term622);
        setField(term522, term522.getClass(), "contextClassLoader", null);
        setField(term522, term522.getClass(), "inheritedAccessControlContext", null);
        setField(term522, term522.getClass(), "threadLocals", null);
        setField(term522, term522.getClass(), "inheritableThreadLocals", null);
        setLongField(term522, term522.getClass(), "stackSize", 0L);
        setLongField(term522, term522.getClass(), "tid", 0L);
        setIntField(term522, term522.getClass(), "threadStatus", 0);
        setField(term522, term522.getClass(), "parkBlocker", null);
        setField(term522, term522.getClass(), "blocker", null);
        setField(term522, term522.getClass(), "blockerLock", null);
        setField(term522, term522.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term522, term522.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term522, term522.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term522, term522.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "offerNode", argTypes, term522, args);
    }

};


