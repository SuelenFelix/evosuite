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
import java.lang.Integer;

public class BacktrackBandwithColoring_prepareRootColoring_19726174705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term217;
     Object term247;

    public BacktrackBandwithColoring_prepareRootColoring_19726174705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term177 = new ArrayDeque();
        ((ArrayDeque) term177).add((Object)null);
        ((ArrayDeque) term177).add((Object)null);
        Object term173 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        Object[] term176 = (Object[]) newArray("[I", 9);
        setBooleanField(term173, term173.getClass(), "running", true);
        setIntField(term173, term173.getClass(), "numColors", 1375330971);
        setField(term173, term173.getClass(), "assignQueue", term176);
        setField(term173, term173.getClass(), "nodeStack", term177);
        setField(term173, term173.getClass(), "this$0", null);
        setField(term173, term173.getClass(), "name", "");
        setIntField(term173, term173.getClass(), "priority", -2015854073);
        setBooleanField(term173, term173.getClass(), "daemon", true);
        setBooleanField(term173, term173.getClass(), "stillborn", true);
        setLongField(term173, term173.getClass(), "eetop", 6811161968424632369L);
        setField(term173, term173.getClass(), "target", null);
        setField(term173, term173.getClass(), "group", null);
        setField(term173, term173.getClass(), "contextClassLoader", null);
        setField(term173, term173.getClass(), "inheritedAccessControlContext", null);
        setField(term173, term173.getClass(), "threadLocals", null);
        setField(term173, term173.getClass(), "inheritableThreadLocals", null);
        setLongField(term173, term173.getClass(), "stackSize", 0L);
        setLongField(term173, term173.getClass(), "tid", 0L);
        setIntField(term173, term173.getClass(), "threadStatus", 0);
        setField(term173, term173.getClass(), "parkBlocker", null);
        setField(term173, term173.getClass(), "blocker", null);
        setField(term173, term173.getClass(), "blockerLock", null);
        setField(term173, term173.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term173, term173.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term173, term173.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term173, term173.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term171 = new ArrayList();
        ((ArrayList) term171).add(term173);
        Object term201 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term201, term201.getClass(), "posMap", null);
        setField(term201, term201.getClass(), "graph", null);
        setField(term201, term201.getClass(), "vertices", null);
        setIntField(term201, term201.getClass(), "numVertices", 0);
        setIntField(term201, term201.getClass(), "first", 0);
        setField(term201, term201.getClass(), "bitset", null);
        ArrayList term199 = new ArrayList();
        ((ArrayList) term199).add(term201);
        HashMap term207 = new HashMap();
        Set<Object> term249 =  ((Map) term207).keySet();
        HashSet term206 = new HashSet((Collection<? extends Object>) term249);
        term170 = newInstance(Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring"));
        Object term197 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object term214 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setField(term170, term170.getClass(), "workers", term171);
        setLongField(term170, term170.getClass(), "nodesExplored", -7237588299778557629L);
        setLongField(term170, term170.getClass(), "timeLimit", 6967924379644551255L);
        setLongField(term170, term170.getClass(), "startTime", -2813493605142626659L);
        setBooleanField(term170, term170.getClass(), "timeExpired", true);
        setField(term197, term197.getClass(), "graph", null);
        setField(term197, term197.getClass(), "vertexColor", null);
        setIntField(term197, term197.getClass(), "numColoredVertices", 0);
        setField(term197, term197.getClass(), "usedColors", null);
        setField(term197, term197.getClass(), "colorMap", null);
        setField(term170, term170.getClass(), "initialColoring", term197);
        setField(term170, term170.getClass(), "components", term199);
        setField(term170, term170.getClass(), "solutions", term206);
        setIntField(term170, term170.getClass(), "solutionsLimit", 538259104);
        setBooleanField(term170, term170.getClass(), "outputEnabled", false);
        setField(term214, term214.getClass(), "posMap", null);
        setField(term214, term214.getClass(), "graph", null);
        setField(term214, term214.getClass(), "vertices", null);
        setIntField(term214, term214.getClass(), "numVertices", 0);
        setIntField(term214, term214.getClass(), "first", 0);
        setField(term214, term214.getClass(), "bitset", null);
        setField(term170, term170.getClass(), "maxClique", term214);
        setField(term170, term170.getClass(), "graph", null);
        HashMap term234 = new HashMap();
        term217 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term218 = (int[]) newIntArray(9);
        Object term229 = newInstance(Class.forName("java.util.BitSet"));
        long[] term230 = (long[]) newLongArray(1);
        setField(term217, term217.getClass(), "graph", null);
        setIntElement(term218, 0, 96566506);
        setIntElement(term218, 1, -343325701);
        setIntElement(term218, 2, 107945604);
        setIntElement(term218, 3, -1963464809);
        setIntElement(term218, 4, 71190297);
        setIntElement(term218, 5, 1202361360);
        setIntElement(term218, 6, -2015048153);
        setIntElement(term218, 7, -2063457669);
        setIntElement(term218, 8, -1222006000);
        setField(term217, term217.getClass(), "vertexColor", term218);
        setIntField(term217, term217.getClass(), "numColoredVertices", 2095798786);
        setField(term229, term229.getClass(), "words", term230);
        setIntField(term229, term229.getClass(), "wordsInUse", -1565502840);
        setBooleanField(term229, term229.getClass(), "sizeIsSticky", false);
        setField(term217, term217.getClass(), "usedColors", term229);
        setField(term217, term217.getClass(), "colorMap", term234);
        term247 = new Integer(98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term217;
        args[1] = term247;
        callMethod(klass, "prepareRootColoring", argTypes, term170, args);
    }

};


