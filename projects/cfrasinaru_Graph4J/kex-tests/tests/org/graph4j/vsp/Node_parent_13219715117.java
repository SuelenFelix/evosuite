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

public class Node_parent_13219715117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86401;

    public Node_parent_13219715117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86452 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term86452, term86452.getClass(), "running", false);
        setField(term86452, term86452.getClass(), "assignQueue", null);
        setField(term86452, term86452.getClass(), "nodeStack", null);
        setField(term86452, term86452.getClass(), "this$0", null);
        setField(term86452, term86452.getClass(), "name", null);
        setIntField(term86452, term86452.getClass(), "priority", -1201296940);
        setBooleanField(term86452, term86452.getClass(), "daemon", true);
        setBooleanField(term86452, term86452.getClass(), "stillborn", false);
        setLongField(term86452, term86452.getClass(), "eetop", 4742108233936970770L);
        setField(term86452, term86452.getClass(), "target", null);
        setField(term86452, term86452.getClass(), "group", null);
        setField(term86452, term86452.getClass(), "contextClassLoader", null);
        setField(term86452, term86452.getClass(), "inheritedAccessControlContext", null);
        setField(term86452, term86452.getClass(), "threadLocals", null);
        setField(term86452, term86452.getClass(), "inheritableThreadLocals", null);
        setLongField(term86452, term86452.getClass(), "stackSize", 0L);
        setLongField(term86452, term86452.getClass(), "tid", 0L);
        setIntField(term86452, term86452.getClass(), "threadStatus", 0);
        setField(term86452, term86452.getClass(), "parkBlocker", null);
        setField(term86452, term86452.getClass(), "blocker", null);
        setField(term86452, term86452.getClass(), "blockerLock", null);
        setField(term86452, term86452.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term86452, term86452.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term86452, term86452.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term86452, term86452.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term86450 = new ArrayList();
        ((ArrayList) term86450).add(term86452);
        term86401 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term86402 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term86477 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term86481 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term86482 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term86499 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term86504 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object[] term86506 = (Object[]) newArray("org.graph4j.util.Domain", 0);
        Object term86507 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86512 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object[] term86514 = (Object[]) newArray("org.graph4j.util.Domain", 1);
        Object term86515 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86518 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setLongField(term86402, term86402.getClass(), "timeLimit", -136372844051852955L);
        setLongField(term86402, term86402.getClass(), "startTime", -7632759764262745126L);
        setBooleanField(term86402, term86402.getClass(), "timeExpired", false);
        setField(term86477, term86477.getClass(), "graph", null);
        setField(term86477, term86477.getClass(), "separator", null);
        setField(term86477, term86477.getClass(), "leftShore", null);
        setField(term86477, term86477.getClass(), "rightShore", null);
        setIntField(term86477, term86477.getClass(), "maxShoreSize", 0);
        setField(term86402, term86402.getClass(), "solution", term86477);
        setField(term86402, term86402.getClass(), "workers", term86450);
        setLongField(term86402, term86402.getClass(), "nodesExplored", 2722004046017350471L);
        setIntField(term86402, term86402.getClass(), "minSepSize", -1949732518);
        setIntField(term86402, term86402.getClass(), "vertexConnectivity", -363721129);
        setIntField(term86402, term86402.getClass(), "greedySepSize", -647496320);
        setIntField(term86402, term86402.getClass(), "LEFT", 312950095);
        setIntField(term86402, term86402.getClass(), "RIGHT", 1743914604);
        setIntField(term86402, term86402.getClass(), "SEP", 651554189);
        setIntField(term86402, term86402.getClass(), "UNKNOWN", 679237021);
        setIntField(term86402, term86402.getClass(), "FAILURE", 1215433415);
        setIntField(term86402, term86402.getClass(), "POTENTIAL_SOLUTION", -604279512);
        setIntField(term86402, term86402.getClass(), "maxShoreSize", 1339586196);
        setField(term86402, term86402.getClass(), "graph", null);
        setField(term86401, term86401.getClass(), "alg", term86402);
        setIntField(term86401, term86401.getClass(), "vertex", 718138171);
        setIntField(term86401, term86401.getClass(), "value", 1807834211);
        setLongField(term86482, term86482.getClass(), "timeLimit", 0L);
        setLongField(term86482, term86482.getClass(), "startTime", 0L);
        setBooleanField(term86482, term86482.getClass(), "timeExpired", false);
        setField(term86482, term86482.getClass(), "solution", null);
        setField(term86482, term86482.getClass(), "workers", null);
        setLongField(term86482, term86482.getClass(), "nodesExplored", 0L);
        setIntField(term86482, term86482.getClass(), "minSepSize", 0);
        setIntField(term86482, term86482.getClass(), "vertexConnectivity", 0);
        setIntField(term86482, term86482.getClass(), "greedySepSize", 0);
        setIntField(term86482, term86482.getClass(), "LEFT", 0);
        setIntField(term86482, term86482.getClass(), "RIGHT", 0);
        setIntField(term86482, term86482.getClass(), "SEP", 0);
        setIntField(term86482, term86482.getClass(), "UNKNOWN", 0);
        setIntField(term86482, term86482.getClass(), "FAILURE", 0);
        setIntField(term86482, term86482.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term86482, term86482.getClass(), "maxShoreSize", 0);
        setField(term86482, term86482.getClass(), "graph", null);
        setField(term86481, term86481.getClass(), "alg", term86482);
        setIntField(term86481, term86481.getClass(), "vertex", -1721657165);
        setIntField(term86481, term86481.getClass(), "value", -679248876);
        setField(term86499, term86499.getClass(), "alg", null);
        setIntField(term86499, term86499.getClass(), "vertex", 0);
        setIntField(term86499, term86499.getClass(), "value", 0);
        setField(term86499, term86499.getClass(), "parent", null);
        setField(term86499, term86499.getClass(), "separator", null);
        setField(term86499, term86499.getClass(), "domains", null);
        setField(term86499, term86499.getClass(), "minDomain", null);
        setBooleanField(term86499, term86499.getClass(), "propagator", false);
        setBooleanField(term86499, term86499.getClass(), "failed", false);
        setField(term86481, term86481.getClass(), "parent", term86499);
        setField(term86504, term86504.getClass(), "graph", null);
        setField(term86504, term86504.getClass(), "separator", null);
        setField(term86504, term86504.getClass(), "leftShore", null);
        setField(term86504, term86504.getClass(), "rightShore", null);
        setIntField(term86504, term86504.getClass(), "maxShoreSize", 0);
        setField(term86481, term86481.getClass(), "separator", term86504);
        setField(term86481, term86481.getClass(), "domains", term86506);
        setIntField(term86507, term86507.getClass(), "vertex", 0);
        setField(term86507, term86507.getClass(), "values", null);
        setField(term86507, term86507.getClass(), "positions", null);
        setIntField(term86507, term86507.getClass(), "size", 0);
        setField(term86481, term86481.getClass(), "minDomain", term86507);
        setBooleanField(term86481, term86481.getClass(), "propagator", true);
        setBooleanField(term86481, term86481.getClass(), "failed", false);
        setField(term86401, term86401.getClass(), "parent", term86481);
        setField(term86512, term86512.getClass(), "graph", null);
        setField(term86512, term86512.getClass(), "separator", null);
        setField(term86512, term86512.getClass(), "leftShore", null);
        setField(term86512, term86512.getClass(), "rightShore", null);
        setIntField(term86512, term86512.getClass(), "maxShoreSize", 0);
        setField(term86401, term86401.getClass(), "separator", term86512);
        setIntField(term86515, term86515.getClass(), "vertex", 0);
        setField(term86515, term86515.getClass(), "values", null);
        setField(term86515, term86515.getClass(), "positions", null);
        setIntField(term86515, term86515.getClass(), "size", 0);
        setElement(term86514, 0, term86515);
        setField(term86401, term86401.getClass(), "domains", term86514);
        setIntField(term86518, term86518.getClass(), "vertex", 0);
        setField(term86518, term86518.getClass(), "values", null);
        setField(term86518, term86518.getClass(), "positions", null);
        setIntField(term86518, term86518.getClass(), "size", 0);
        setField(term86401, term86401.getClass(), "minDomain", term86518);
        setBooleanField(term86401, term86401.getClass(), "propagator", false);
        setBooleanField(term86401, term86401.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parent", argTypes, term86401, args);
    }

};


