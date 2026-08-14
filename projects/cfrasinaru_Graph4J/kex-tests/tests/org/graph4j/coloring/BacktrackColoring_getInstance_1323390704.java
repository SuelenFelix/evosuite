package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;

public class BacktrackColoring_getInstance_1323390704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5479;
     Object term5548;

    public BacktrackColoring_getInstance_1323390704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5486 = new ArrayDeque();
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        ((ArrayDeque) term5486).add((Object)null);
        Object term5482 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        Object[] term5485 = (Object[]) newArray("[I", 1);
        setBooleanField(term5482, term5482.getClass(), "running", true);
        setIntField(term5482, term5482.getClass(), "numColors", 276336694);
        setField(term5482, term5482.getClass(), "assignQueue", term5485);
        setField(term5482, term5482.getClass(), "nodeStack", term5486);
        setField(term5482, term5482.getClass(), "this$0", null);
        setField(term5482, term5482.getClass(), "name", "");
        setIntField(term5482, term5482.getClass(), "priority", 522501050);
        setBooleanField(term5482, term5482.getClass(), "daemon", false);
        setBooleanField(term5482, term5482.getClass(), "stillborn", false);
        setLongField(term5482, term5482.getClass(), "eetop", 5907001541142728739L);
        setField(term5482, term5482.getClass(), "target", null);
        setField(term5482, term5482.getClass(), "group", null);
        setField(term5482, term5482.getClass(), "contextClassLoader", null);
        setField(term5482, term5482.getClass(), "inheritedAccessControlContext", null);
        setField(term5482, term5482.getClass(), "threadLocals", null);
        setField(term5482, term5482.getClass(), "inheritableThreadLocals", null);
        setLongField(term5482, term5482.getClass(), "stackSize", 0L);
        setLongField(term5482, term5482.getClass(), "tid", 0L);
        setIntField(term5482, term5482.getClass(), "threadStatus", 0);
        setField(term5482, term5482.getClass(), "parkBlocker", null);
        setField(term5482, term5482.getClass(), "blocker", null);
        setField(term5482, term5482.getClass(), "blockerLock", null);
        setField(term5482, term5482.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term5482, term5482.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term5482, term5482.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term5482, term5482.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term5500 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        setBooleanField(term5500, term5500.getClass(), "running", false);
        setIntField(term5500, term5500.getClass(), "numColors", 0);
        setField(term5500, term5500.getClass(), "assignQueue", null);
        setField(term5500, term5500.getClass(), "nodeStack", null);
        setField(term5500, term5500.getClass(), "this$0", null);
        setField(term5500, term5500.getClass(), "name", null);
        setIntField(term5500, term5500.getClass(), "priority", 0);
        setBooleanField(term5500, term5500.getClass(), "daemon", false);
        setBooleanField(term5500, term5500.getClass(), "stillborn", false);
        setLongField(term5500, term5500.getClass(), "eetop", 0L);
        setField(term5500, term5500.getClass(), "target", null);
        setField(term5500, term5500.getClass(), "group", null);
        setField(term5500, term5500.getClass(), "contextClassLoader", null);
        setField(term5500, term5500.getClass(), "inheritedAccessControlContext", null);
        setField(term5500, term5500.getClass(), "threadLocals", null);
        setField(term5500, term5500.getClass(), "inheritableThreadLocals", null);
        setLongField(term5500, term5500.getClass(), "stackSize", 0L);
        setLongField(term5500, term5500.getClass(), "tid", 0L);
        setIntField(term5500, term5500.getClass(), "threadStatus", 0);
        setField(term5500, term5500.getClass(), "parkBlocker", null);
        setField(term5500, term5500.getClass(), "blocker", null);
        setField(term5500, term5500.getClass(), "blockerLock", null);
        setField(term5500, term5500.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term5500, term5500.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term5500, term5500.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term5500, term5500.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term5480 = new ArrayList();
        ((ArrayList) term5480).add(term5482);
        ((ArrayList) term5480).add(term5500);
        Object term5523 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term5523, term5523.getClass(), "posMap", null);
        setField(term5523, term5523.getClass(), "graph", null);
        setField(term5523, term5523.getClass(), "vertices", null);
        setIntField(term5523, term5523.getClass(), "numVertices", 0);
        setIntField(term5523, term5523.getClass(), "first", 0);
        setField(term5523, term5523.getClass(), "bitset", null);
        Object term5526 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term5526, term5526.getClass(), "posMap", null);
        setField(term5526, term5526.getClass(), "graph", null);
        setField(term5526, term5526.getClass(), "vertices", null);
        setIntField(term5526, term5526.getClass(), "numVertices", 0);
        setIntField(term5526, term5526.getClass(), "first", 0);
        setField(term5526, term5526.getClass(), "bitset", null);
        Object term5529 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term5529, term5529.getClass(), "posMap", null);
        setField(term5529, term5529.getClass(), "graph", null);
        setField(term5529, term5529.getClass(), "vertices", null);
        setIntField(term5529, term5529.getClass(), "numVertices", 0);
        setIntField(term5529, term5529.getClass(), "first", 0);
        setField(term5529, term5529.getClass(), "bitset", null);
        ArrayList term5521 = new ArrayList();
        ((ArrayList) term5521).add(term5523);
        ((ArrayList) term5521).add(term5526);
        ((ArrayList) term5521).add(term5529);
        HashMap term5535 = new HashMap();
        Set<Object> term5550 =  ((Map) term5535).keySet();
        HashSet term5534 = new HashSet((Collection<? extends Object>) term5550);
        term5479 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoring"));
        Object term5519 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object term5545 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setField(term5479, term5479.getClass(), "workers", term5480);
        setLongField(term5479, term5479.getClass(), "nodesExplored", 4178434741742309755L);
        setLongField(term5479, term5479.getClass(), "timeLimit", -2068172595987555756L);
        setLongField(term5479, term5479.getClass(), "startTime", -6292278961887936280L);
        setBooleanField(term5479, term5479.getClass(), "timeExpired", false);
        setField(term5519, term5519.getClass(), "graph", null);
        setField(term5519, term5519.getClass(), "vertexColor", null);
        setIntField(term5519, term5519.getClass(), "numColoredVertices", 0);
        setField(term5519, term5519.getClass(), "usedColors", null);
        setField(term5519, term5519.getClass(), "colorMap", null);
        setField(term5479, term5479.getClass(), "initialColoring", term5519);
        setField(term5479, term5479.getClass(), "components", term5521);
        setField(term5479, term5479.getClass(), "solutions", term5534);
        setIntField(term5479, term5479.getClass(), "solutionsLimit", 125432890);
        setBooleanField(term5479, term5479.getClass(), "outputEnabled", false);
        setField(term5545, term5545.getClass(), "posMap", null);
        setField(term5545, term5545.getClass(), "graph", null);
        setField(term5545, term5545.getClass(), "vertices", null);
        setIntField(term5545, term5545.getClass(), "numVertices", 0);
        setIntField(term5545, term5545.getClass(), "first", 0);
        setField(term5545, term5545.getClass(), "bitset", null);
        setField(term5479, term5479.getClass(), "maxClique", term5545);
        setField(term5479, term5479.getClass(), "graph", null);
        term5548 = new Long(-6645965768855543712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5548;
        callMethod(klass, "getInstance", argTypes, term5479, args);
    }

};


