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

public class Node_separator_2834073616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86263;

    public Node_separator_2834073616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86318 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        setBooleanField(term86318, term86318.getClass(), "running", false);
        setField(term86318, term86318.getClass(), "assignQueue", null);
        setField(term86318, term86318.getClass(), "nodeStack", null);
        setField(term86318, term86318.getClass(), "this$0", null);
        setField(term86318, term86318.getClass(), "name", null);
        setIntField(term86318, term86318.getClass(), "priority", -962070662);
        setBooleanField(term86318, term86318.getClass(), "daemon", true);
        setBooleanField(term86318, term86318.getClass(), "stillborn", false);
        setLongField(term86318, term86318.getClass(), "eetop", 5319740127125920367L);
        setField(term86318, term86318.getClass(), "target", null);
        setField(term86318, term86318.getClass(), "group", null);
        setField(term86318, term86318.getClass(), "contextClassLoader", null);
        setField(term86318, term86318.getClass(), "inheritedAccessControlContext", null);
        setField(term86318, term86318.getClass(), "threadLocals", null);
        setField(term86318, term86318.getClass(), "inheritableThreadLocals", null);
        setLongField(term86318, term86318.getClass(), "stackSize", 0L);
        setLongField(term86318, term86318.getClass(), "tid", 0L);
        setIntField(term86318, term86318.getClass(), "threadStatus", 0);
        setField(term86318, term86318.getClass(), "parkBlocker", null);
        setField(term86318, term86318.getClass(), "blocker", null);
        setField(term86318, term86318.getClass(), "blockerLock", null);
        setField(term86318, term86318.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term86318, term86318.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term86318, term86318.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term86318, term86318.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term86316 = new ArrayList();
        ((ArrayList) term86316).add(term86318);
        term86263 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term86264 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term86343 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term86347 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term86348 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term86365 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        Object term86370 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object[] term86372 = (Object[]) newArray("org.graph4j.util.Domain", 0);
        Object term86373 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86378 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object[] term86380 = (Object[]) newArray("org.graph4j.util.Domain", 8);
        Object term86381 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86384 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86387 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86390 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86393 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term86396 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setLongField(term86264, term86264.getClass(), "timeLimit", 7800835025296877231L);
        setLongField(term86264, term86264.getClass(), "startTime", -187772971269812453L);
        setBooleanField(term86264, term86264.getClass(), "timeExpired", false);
        setField(term86343, term86343.getClass(), "graph", null);
        setField(term86343, term86343.getClass(), "separator", null);
        setField(term86343, term86343.getClass(), "leftShore", null);
        setField(term86343, term86343.getClass(), "rightShore", null);
        setIntField(term86343, term86343.getClass(), "maxShoreSize", 0);
        setField(term86264, term86264.getClass(), "solution", term86343);
        setField(term86264, term86264.getClass(), "workers", term86316);
        setLongField(term86264, term86264.getClass(), "nodesExplored", 6465987664600701876L);
        setIntField(term86264, term86264.getClass(), "minSepSize", -1257419523);
        setIntField(term86264, term86264.getClass(), "vertexConnectivity", -1180293605);
        setIntField(term86264, term86264.getClass(), "greedySepSize", 1441290201);
        setIntField(term86264, term86264.getClass(), "LEFT", -1067225283);
        setIntField(term86264, term86264.getClass(), "RIGHT", 1939913208);
        setIntField(term86264, term86264.getClass(), "SEP", 2000789813);
        setIntField(term86264, term86264.getClass(), "UNKNOWN", -1740920122);
        setIntField(term86264, term86264.getClass(), "FAILURE", 306763791);
        setIntField(term86264, term86264.getClass(), "POTENTIAL_SOLUTION", 393909417);
        setIntField(term86264, term86264.getClass(), "maxShoreSize", 682347070);
        setField(term86264, term86264.getClass(), "graph", null);
        setField(term86263, term86263.getClass(), "alg", term86264);
        setIntField(term86263, term86263.getClass(), "vertex", 1184037017);
        setIntField(term86263, term86263.getClass(), "value", 1807084039);
        setLongField(term86348, term86348.getClass(), "timeLimit", 0L);
        setLongField(term86348, term86348.getClass(), "startTime", 0L);
        setBooleanField(term86348, term86348.getClass(), "timeExpired", false);
        setField(term86348, term86348.getClass(), "solution", null);
        setField(term86348, term86348.getClass(), "workers", null);
        setLongField(term86348, term86348.getClass(), "nodesExplored", 0L);
        setIntField(term86348, term86348.getClass(), "minSepSize", 0);
        setIntField(term86348, term86348.getClass(), "vertexConnectivity", 0);
        setIntField(term86348, term86348.getClass(), "greedySepSize", 0);
        setIntField(term86348, term86348.getClass(), "LEFT", 0);
        setIntField(term86348, term86348.getClass(), "RIGHT", 0);
        setIntField(term86348, term86348.getClass(), "SEP", 0);
        setIntField(term86348, term86348.getClass(), "UNKNOWN", 0);
        setIntField(term86348, term86348.getClass(), "FAILURE", 0);
        setIntField(term86348, term86348.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term86348, term86348.getClass(), "maxShoreSize", 0);
        setField(term86348, term86348.getClass(), "graph", null);
        setField(term86347, term86347.getClass(), "alg", term86348);
        setIntField(term86347, term86347.getClass(), "vertex", -256278679);
        setIntField(term86347, term86347.getClass(), "value", -524155996);
        setField(term86365, term86365.getClass(), "alg", null);
        setIntField(term86365, term86365.getClass(), "vertex", 0);
        setIntField(term86365, term86365.getClass(), "value", 0);
        setField(term86365, term86365.getClass(), "parent", null);
        setField(term86365, term86365.getClass(), "separator", null);
        setField(term86365, term86365.getClass(), "domains", null);
        setField(term86365, term86365.getClass(), "minDomain", null);
        setBooleanField(term86365, term86365.getClass(), "propagator", false);
        setBooleanField(term86365, term86365.getClass(), "failed", false);
        setField(term86347, term86347.getClass(), "parent", term86365);
        setField(term86370, term86370.getClass(), "graph", null);
        setField(term86370, term86370.getClass(), "separator", null);
        setField(term86370, term86370.getClass(), "leftShore", null);
        setField(term86370, term86370.getClass(), "rightShore", null);
        setIntField(term86370, term86370.getClass(), "maxShoreSize", 0);
        setField(term86347, term86347.getClass(), "separator", term86370);
        setField(term86347, term86347.getClass(), "domains", term86372);
        setIntField(term86373, term86373.getClass(), "vertex", 0);
        setField(term86373, term86373.getClass(), "values", null);
        setField(term86373, term86373.getClass(), "positions", null);
        setIntField(term86373, term86373.getClass(), "size", 0);
        setField(term86347, term86347.getClass(), "minDomain", term86373);
        setBooleanField(term86347, term86347.getClass(), "propagator", true);
        setBooleanField(term86347, term86347.getClass(), "failed", false);
        setField(term86263, term86263.getClass(), "parent", term86347);
        setField(term86378, term86378.getClass(), "graph", null);
        setField(term86378, term86378.getClass(), "separator", null);
        setField(term86378, term86378.getClass(), "leftShore", null);
        setField(term86378, term86378.getClass(), "rightShore", null);
        setIntField(term86378, term86378.getClass(), "maxShoreSize", 0);
        setField(term86263, term86263.getClass(), "separator", term86378);
        setIntField(term86381, term86381.getClass(), "vertex", 0);
        setField(term86381, term86381.getClass(), "values", null);
        setField(term86381, term86381.getClass(), "positions", null);
        setIntField(term86381, term86381.getClass(), "size", 0);
        setElement(term86380, 0, term86381);
        setElement(term86380, 1, term86381);
        setIntField(term86384, term86384.getClass(), "vertex", 0);
        setField(term86384, term86384.getClass(), "values", null);
        setField(term86384, term86384.getClass(), "positions", null);
        setIntField(term86384, term86384.getClass(), "size", 0);
        setElement(term86380, 2, term86384);
        setIntField(term86387, term86387.getClass(), "vertex", 0);
        setField(term86387, term86387.getClass(), "values", null);
        setField(term86387, term86387.getClass(), "positions", null);
        setIntField(term86387, term86387.getClass(), "size", 0);
        setElement(term86380, 3, term86387);
        setElement(term86380, 4, term86387);
        setIntField(term86390, term86390.getClass(), "vertex", 0);
        setField(term86390, term86390.getClass(), "values", null);
        setField(term86390, term86390.getClass(), "positions", null);
        setIntField(term86390, term86390.getClass(), "size", 0);
        setElement(term86380, 5, term86390);
        setIntField(term86393, term86393.getClass(), "vertex", 0);
        setField(term86393, term86393.getClass(), "values", null);
        setField(term86393, term86393.getClass(), "positions", null);
        setIntField(term86393, term86393.getClass(), "size", 0);
        setElement(term86380, 6, term86393);
        setIntField(term86396, term86396.getClass(), "vertex", 0);
        setField(term86396, term86396.getClass(), "values", null);
        setField(term86396, term86396.getClass(), "positions", null);
        setIntField(term86396, term86396.getClass(), "size", 0);
        setElement(term86380, 7, term86396);
        setField(term86263, term86263.getClass(), "domains", term86380);
        setField(term86263, term86263.getClass(), "minDomain", term86387);
        setBooleanField(term86263, term86263.getClass(), "propagator", true);
        setBooleanField(term86263, term86263.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "separator", argTypes, term86263, args);
    }

};


