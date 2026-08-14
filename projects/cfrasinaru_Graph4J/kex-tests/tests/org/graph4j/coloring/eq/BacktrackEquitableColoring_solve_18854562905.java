package org.graph4j.coloring.eq;

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
import static org.graph4j.coloring.eq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class BacktrackEquitableColoring_solve_18854562905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;
     Object term404;

    public BacktrackEquitableColoring_solve_18854562905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term340 = new ArrayDeque();
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        ((ArrayDeque) term340).add((Object)null);
        Object term336 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        Object[] term339 = (Object[]) newArray("[I", 0);
        setBooleanField(term336, term336.getClass(), "running", false);
        setIntField(term336, term336.getClass(), "numColors", 568954359);
        setField(term336, term336.getClass(), "assignQueue", term339);
        setField(term336, term336.getClass(), "nodeStack", term340);
        setField(term336, term336.getClass(), "this$0", null);
        setField(term336, term336.getClass(), "name", "");
        setIntField(term336, term336.getClass(), "priority", -343325701);
        setBooleanField(term336, term336.getClass(), "daemon", true);
        setBooleanField(term336, term336.getClass(), "stillborn", false);
        setLongField(term336, term336.getClass(), "eetop", 6967924379644551255L);
        setField(term336, term336.getClass(), "target", null);
        setField(term336, term336.getClass(), "group", null);
        setField(term336, term336.getClass(), "contextClassLoader", null);
        setField(term336, term336.getClass(), "inheritedAccessControlContext", null);
        setField(term336, term336.getClass(), "threadLocals", null);
        setField(term336, term336.getClass(), "inheritableThreadLocals", null);
        setLongField(term336, term336.getClass(), "stackSize", 0L);
        setLongField(term336, term336.getClass(), "tid", 0L);
        setIntField(term336, term336.getClass(), "threadStatus", 0);
        setField(term336, term336.getClass(), "parkBlocker", null);
        setField(term336, term336.getClass(), "blocker", null);
        setField(term336, term336.getClass(), "blockerLock", null);
        setField(term336, term336.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term336, term336.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term336, term336.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term336, term336.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term334 = new ArrayList();
        ((ArrayList) term334).add(term336);
        Object term364 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term364, term364.getClass(), "posMap", null);
        setField(term364, term364.getClass(), "graph", null);
        setField(term364, term364.getClass(), "vertices", null);
        setIntField(term364, term364.getClass(), "numVertices", 0);
        setIntField(term364, term364.getClass(), "first", 0);
        setField(term364, term364.getClass(), "bitset", null);
        Object term367 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term367, term367.getClass(), "posMap", null);
        setField(term367, term367.getClass(), "graph", null);
        setField(term367, term367.getClass(), "vertices", null);
        setIntField(term367, term367.getClass(), "numVertices", 0);
        setIntField(term367, term367.getClass(), "first", 0);
        setField(term367, term367.getClass(), "bitset", null);
        Object term370 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term370, term370.getClass(), "posMap", null);
        setField(term370, term370.getClass(), "graph", null);
        setField(term370, term370.getClass(), "vertices", null);
        setIntField(term370, term370.getClass(), "numVertices", 0);
        setIntField(term370, term370.getClass(), "first", 0);
        setField(term370, term370.getClass(), "bitset", null);
        Object term373 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term373, term373.getClass(), "posMap", null);
        setField(term373, term373.getClass(), "graph", null);
        setField(term373, term373.getClass(), "vertices", null);
        setIntField(term373, term373.getClass(), "numVertices", 0);
        setIntField(term373, term373.getClass(), "first", 0);
        setField(term373, term373.getClass(), "bitset", null);
        Object term376 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term376, term376.getClass(), "posMap", null);
        setField(term376, term376.getClass(), "graph", null);
        setField(term376, term376.getClass(), "vertices", null);
        setIntField(term376, term376.getClass(), "numVertices", 0);
        setIntField(term376, term376.getClass(), "first", 0);
        setField(term376, term376.getClass(), "bitset", null);
        Object term379 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term379, term379.getClass(), "posMap", null);
        setField(term379, term379.getClass(), "graph", null);
        setField(term379, term379.getClass(), "vertices", null);
        setIntField(term379, term379.getClass(), "numVertices", 0);
        setIntField(term379, term379.getClass(), "first", 0);
        setField(term379, term379.getClass(), "bitset", null);
        Object term382 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term382, term382.getClass(), "posMap", null);
        setField(term382, term382.getClass(), "graph", null);
        setField(term382, term382.getClass(), "vertices", null);
        setIntField(term382, term382.getClass(), "numVertices", 0);
        setIntField(term382, term382.getClass(), "first", 0);
        setField(term382, term382.getClass(), "bitset", null);
        Object term385 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term385, term385.getClass(), "posMap", null);
        setField(term385, term385.getClass(), "graph", null);
        setField(term385, term385.getClass(), "vertices", null);
        setIntField(term385, term385.getClass(), "numVertices", 0);
        setIntField(term385, term385.getClass(), "first", 0);
        setField(term385, term385.getClass(), "bitset", null);
        ArrayList term362 = new ArrayList();
        ((ArrayList) term362).add(term364);
        ((ArrayList) term362).add(term367);
        ((ArrayList) term362).add(term370);
        ((ArrayList) term362).add(term373);
        ((ArrayList) term362).add(term376);
        ((ArrayList) term362).add(term379);
        ((ArrayList) term362).add(term382);
        ((ArrayList) term362).add(term385);
        HashMap term391 = new HashMap();
        Set<Object> term406 =  ((Map) term391).keySet();
        HashSet term390 = new HashSet((Collection<? extends Object>) term406);
        term331 = newInstance(Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring"));
        Object term360 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object term401 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setIntField(term331, term331.getClass(), "maxClassSize", 1861318859);
        setIntField(term331, term331.getClass(), "maxClassCount", 1474524152);
        setField(term331, term331.getClass(), "workers", term334);
        setLongField(term331, term331.getClass(), "nodesExplored", -2813493605142626659L);
        setLongField(term331, term331.getClass(), "timeLimit", -8885298608300233488L);
        setLongField(term331, term331.getClass(), "startTime", -4325723315152823407L);
        setBooleanField(term331, term331.getClass(), "timeExpired", true);
        setField(term360, term360.getClass(), "graph", null);
        setField(term360, term360.getClass(), "vertexColor", null);
        setIntField(term360, term360.getClass(), "numColoredVertices", 0);
        setField(term360, term360.getClass(), "usedColors", null);
        setField(term360, term360.getClass(), "colorMap", null);
        setField(term331, term331.getClass(), "initialColoring", term360);
        setField(term331, term331.getClass(), "components", term362);
        setField(term331, term331.getClass(), "solutions", term390);
        setIntField(term331, term331.getClass(), "solutionsLimit", 107945604);
        setBooleanField(term331, term331.getClass(), "outputEnabled", false);
        setField(term401, term401.getClass(), "posMap", null);
        setField(term401, term401.getClass(), "graph", null);
        setField(term401, term401.getClass(), "vertices", null);
        setIntField(term401, term401.getClass(), "numVertices", 0);
        setIntField(term401, term401.getClass(), "first", 0);
        setField(term401, term401.getClass(), "bitset", null);
        setField(term331, term331.getClass(), "maxClique", term401);
        setField(term331, term331.getClass(), "graph", null);
        term404 = new Integer(-1963464809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term404;
        callMethod(klass, "solve", argTypes, term331, args);
    }

};


