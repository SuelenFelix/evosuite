package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
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

public class BacktrackBandwithColoring_getInstance_6242296664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term167;

    public BacktrackBandwithColoring_getInstance_6242296664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term96 = new ArrayDeque();
        ((ArrayDeque) term96).add((Object)null);
        ((ArrayDeque) term96).add((Object)null);
        ((ArrayDeque) term96).add((Object)null);
        Object term92 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        Object[] term95 = (Object[]) newArray("[I", 6);
        setBooleanField(term92, term92.getClass(), "running", true);
        setIntField(term92, term92.getClass(), "numColors", 767834723);
        setField(term92, term92.getClass(), "assignQueue", term95);
        setField(term92, term92.getClass(), "nodeStack", term96);
        setField(term92, term92.getClass(), "this$0", null);
        setField(term92, term92.getClass(), "name", "");
        setIntField(term92, term92.getClass(), "priority", -2027534003);
        setBooleanField(term92, term92.getClass(), "daemon", false);
        setBooleanField(term92, term92.getClass(), "stillborn", true);
        setLongField(term92, term92.getClass(), "eetop", -8257434502486459194L);
        setField(term92, term92.getClass(), "target", null);
        setField(term92, term92.getClass(), "group", null);
        setField(term92, term92.getClass(), "contextClassLoader", null);
        setField(term92, term92.getClass(), "inheritedAccessControlContext", null);
        setField(term92, term92.getClass(), "threadLocals", null);
        setField(term92, term92.getClass(), "inheritableThreadLocals", null);
        setLongField(term92, term92.getClass(), "stackSize", 0L);
        setLongField(term92, term92.getClass(), "tid", 0L);
        setIntField(term92, term92.getClass(), "threadStatus", 0);
        setField(term92, term92.getClass(), "parkBlocker", null);
        setField(term92, term92.getClass(), "blocker", null);
        setField(term92, term92.getClass(), "blockerLock", null);
        setField(term92, term92.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term92, term92.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term92, term92.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term92, term92.getClass(), "threadLocalRandomSecondarySeed", 0);
        Object term110 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        setBooleanField(term110, term110.getClass(), "running", false);
        setIntField(term110, term110.getClass(), "numColors", 0);
        setField(term110, term110.getClass(), "assignQueue", null);
        setField(term110, term110.getClass(), "nodeStack", null);
        setField(term110, term110.getClass(), "this$0", null);
        setField(term110, term110.getClass(), "name", null);
        setIntField(term110, term110.getClass(), "priority", 0);
        setBooleanField(term110, term110.getClass(), "daemon", false);
        setBooleanField(term110, term110.getClass(), "stillborn", false);
        setLongField(term110, term110.getClass(), "eetop", 0L);
        setField(term110, term110.getClass(), "target", null);
        setField(term110, term110.getClass(), "group", null);
        setField(term110, term110.getClass(), "contextClassLoader", null);
        setField(term110, term110.getClass(), "inheritedAccessControlContext", null);
        setField(term110, term110.getClass(), "threadLocals", null);
        setField(term110, term110.getClass(), "inheritableThreadLocals", null);
        setLongField(term110, term110.getClass(), "stackSize", 0L);
        setLongField(term110, term110.getClass(), "tid", 0L);
        setIntField(term110, term110.getClass(), "threadStatus", 0);
        setField(term110, term110.getClass(), "parkBlocker", null);
        setField(term110, term110.getClass(), "blocker", null);
        setField(term110, term110.getClass(), "blockerLock", null);
        setField(term110, term110.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term110, term110.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term110, term110.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term110, term110.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term90 = new ArrayList();
        ((ArrayList) term90).add(term92);
        ((ArrayList) term90).add(term110);
        Object term133 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term133, term133.getClass(), "posMap", null);
        setField(term133, term133.getClass(), "graph", null);
        setField(term133, term133.getClass(), "vertices", null);
        setIntField(term133, term133.getClass(), "numVertices", 0);
        setIntField(term133, term133.getClass(), "first", 0);
        setField(term133, term133.getClass(), "bitset", null);
        Object term136 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term136, term136.getClass(), "posMap", null);
        setField(term136, term136.getClass(), "graph", null);
        setField(term136, term136.getClass(), "vertices", null);
        setIntField(term136, term136.getClass(), "numVertices", 0);
        setIntField(term136, term136.getClass(), "first", 0);
        setField(term136, term136.getClass(), "bitset", null);
        Object term139 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term139, term139.getClass(), "posMap", null);
        setField(term139, term139.getClass(), "graph", null);
        setField(term139, term139.getClass(), "vertices", null);
        setIntField(term139, term139.getClass(), "numVertices", 0);
        setIntField(term139, term139.getClass(), "first", 0);
        setField(term139, term139.getClass(), "bitset", null);
        Object term142 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term142, term142.getClass(), "posMap", null);
        setField(term142, term142.getClass(), "graph", null);
        setField(term142, term142.getClass(), "vertices", null);
        setIntField(term142, term142.getClass(), "numVertices", 0);
        setIntField(term142, term142.getClass(), "first", 0);
        setField(term142, term142.getClass(), "bitset", null);
        Object term145 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term145, term145.getClass(), "posMap", null);
        setField(term145, term145.getClass(), "graph", null);
        setField(term145, term145.getClass(), "vertices", null);
        setIntField(term145, term145.getClass(), "numVertices", 0);
        setIntField(term145, term145.getClass(), "first", 0);
        setField(term145, term145.getClass(), "bitset", null);
        Object term148 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term148, term148.getClass(), "posMap", null);
        setField(term148, term148.getClass(), "graph", null);
        setField(term148, term148.getClass(), "vertices", null);
        setIntField(term148, term148.getClass(), "numVertices", 0);
        setIntField(term148, term148.getClass(), "first", 0);
        setField(term148, term148.getClass(), "bitset", null);
        ArrayList term131 = new ArrayList();
        ((ArrayList) term131).add(term133);
        ((ArrayList) term131).add(term136);
        ((ArrayList) term131).add(term139);
        ((ArrayList) term131).add(term142);
        ((ArrayList) term131).add(term145);
        ((ArrayList) term131).add(term148);
        HashMap term154 = new HashMap();
        Set<Object> term169 =  ((Map) term154).keySet();
        HashSet term153 = new HashSet((Collection<? extends Object>) term169);
        term89 = newInstance(Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring"));
        Object term129 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object term164 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setField(term89, term89.getClass(), "workers", term90);
        setLongField(term89, term89.getClass(), "nodesExplored", -8400487765614892086L);
        setLongField(term89, term89.getClass(), "timeLimit", 5270370404989704783L);
        setLongField(term89, term89.getClass(), "startTime", 7411271909051562686L);
        setBooleanField(term89, term89.getClass(), "timeExpired", true);
        setField(term129, term129.getClass(), "graph", null);
        setField(term129, term129.getClass(), "vertexColor", null);
        setIntField(term129, term129.getClass(), "numColoredVertices", 0);
        setField(term129, term129.getClass(), "usedColors", null);
        setField(term129, term129.getClass(), "colorMap", null);
        setField(term89, term89.getClass(), "initialColoring", term129);
        setField(term89, term89.getClass(), "components", term131);
        setField(term89, term89.getClass(), "solutions", term153);
        setIntField(term89, term89.getClass(), "solutionsLimit", 1063420942);
        setBooleanField(term89, term89.getClass(), "outputEnabled", true);
        setField(term164, term164.getClass(), "posMap", null);
        setField(term164, term164.getClass(), "graph", null);
        setField(term164, term164.getClass(), "vertices", null);
        setIntField(term164, term164.getClass(), "numVertices", 0);
        setIntField(term164, term164.getClass(), "first", 0);
        setField(term164, term164.getClass(), "bitset", null);
        setField(term89, term89.getClass(), "maxClique", term164);
        setField(term89, term89.getClass(), "graph", null);
        term167 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term167;
        callMethod(klass, "getInstance", argTypes, term89, args);
    }

};


