package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class DigraphImpl_removeEdgeAt_53842917211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164337;
     Object term164452;
     Object term164454;

    public DigraphImpl_removeEdgeAt_53842917211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term164435 = new Integer(-1972033388);
        HashMap term164437 = new HashMap();
        HashMap term164442 = new HashMap();
        term164337 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        Object[] term164338 = (Object[]) newArray("[I", 2);
        int[] term164339 = (int[]) newIntArray(6);
        int[] term164346 = (int[]) newIntArray(9);
        Object[] term164356 = (Object[]) newArray("[I", 3);
        int[] term164357 = (int[]) newIntArray(6);
        int[] term164364 = (int[]) newIntArray(6);
        int[] term164371 = (int[]) newIntArray(2);
        int[] term164374 = (int[]) newIntArray(1);
        int[] term164391 = (int[]) newIntArray(9);
        int[] term164401 = (int[]) newIntArray(2);
        Object[] term164404 = (Object[]) newArray("[I", 0);
        Object[] term164405 = (Object[]) newArray("[I", 1);
        int[] term164406 = (int[]) newIntArray(6);
        double[] term164413 = (double[]) newDoubleArray(0);
        Object[] term164415 = (Object[]) newArray("[[D", 0);
        Object[] term164417 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term164418 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 4);
        Object[] term164419 = (Object[]) newArray("java.lang.Object", 8);
        Object term164420 = newInstance(Class.forName("java.lang.Object"));
        Object term164421 = newInstance(Class.forName("java.lang.Object"));
        Object term164422 = newInstance(Class.forName("java.lang.Object"));
        Object term164423 = newInstance(Class.forName("java.lang.Object"));
        Object term164424 = newInstance(Class.forName("java.lang.Object"));
        Object term164425 = newInstance(Class.forName("java.lang.Object"));
        Object term164426 = newInstance(Class.forName("java.lang.Object"));
        Object term164427 = newInstance(Class.forName("java.lang.Object"));
        Object[] term164428 = (Object[]) newArray("java.lang.Object", 3);
        Object term164429 = newInstance(Class.forName("java.lang.Object"));
        Object term164430 = newInstance(Class.forName("java.lang.Object"));
        Object[] term164431 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term164432 = (Object[]) newArray("java.lang.Object", 7);
        Object[] term164433 = (Object[]) newArray("org.graph4j.AdjacencySet", 3);
        Object[] term164434 = (Object[]) newArray("org.graph4j.AdjacencyMap", 2);
        setIntElement(term164339, 0, 888994793);
        setIntElement(term164339, 1, 1654829804);
        setIntElement(term164339, 2, 215342139);
        setIntElement(term164339, 3, 583776304);
        setIntElement(term164339, 4, 1284567321);
        setIntElement(term164339, 5, 354007116);
        setElement(term164338, 0, term164339);
        setIntElement(term164346, 0, 1714616855);
        setIntElement(term164346, 1, 1158206243);
        setIntElement(term164346, 2, -2012067202);
        setIntElement(term164346, 3, -131980120);
        setIntElement(term164346, 4, 1264147045);
        setIntElement(term164346, 5, -1468643925);
        setIntElement(term164346, 6, 1721447838);
        setIntElement(term164346, 7, 2047883278);
        setIntElement(term164346, 8, -2084150613);
        setElement(term164338, 1, term164346);
        setField(term164337, term164337.getClass(), "predList", term164338);
        setIntElement(term164357, 0, 509497705);
        setIntElement(term164357, 1, -51966953);
        setIntElement(term164357, 2, 2052112989);
        setIntElement(term164357, 3, 400785633);
        setIntElement(term164357, 4, 1223980584);
        setIntElement(term164357, 5, -1196616478);
        setElement(term164356, 0, term164357);
        setIntElement(term164364, 0, 593528124);
        setIntElement(term164364, 1, 1179392084);
        setIntElement(term164364, 2, -148887832);
        setIntElement(term164364, 3, -619735589);
        setIntElement(term164364, 4, 1937981774);
        setIntElement(term164364, 5, 1938479308);
        setElement(term164356, 1, term164364);
        setIntElement(term164371, 0, -510313414);
        setIntElement(term164371, 1, 808188288);
        setElement(term164356, 2, term164371);
        setField(term164337, term164337.getClass(), "predPos", term164356);
        setIntElement(term164374, 0, -1346248029);
        setField(term164337, term164337.getClass(), "indegree", term164374);
        setField(term164337, term164337.getClass(), "name", "QNjNTLlUaV");
        setIntField(term164337, term164337.getClass(), "maxVertices", 254993393);
        setIntField(term164337, term164337.getClass(), "numVertices", -28264498);
        setLongField(term164337, term164337.getClass(), "numEdges", 1133267598258375793L);
        setIntElement(term164391, 0, 1465978105);
        setIntElement(term164391, 1, -382041999);
        setIntElement(term164391, 2, 144401642);
        setIntElement(term164391, 3, -1041912502);
        setIntElement(term164391, 4, 632068695);
        setIntElement(term164391, 5, 641999875);
        setIntElement(term164391, 6, 2026536518);
        setIntElement(term164391, 7, -1871748004);
        setIntElement(term164391, 8, 164750112);
        setField(term164337, term164337.getClass(), "vertices", term164391);
        setIntElement(term164401, 0, 43223793);
        setIntElement(term164401, 1, -125390305);
        setField(term164337, term164337.getClass(), "degree", term164401);
        setField(term164337, term164337.getClass(), "adjList", term164404);
        setIntElement(term164406, 0, 1069221906);
        setIntElement(term164406, 1, 1695465227);
        setIntElement(term164406, 2, -2102568816);
        setIntElement(term164406, 3, 1867786364);
        setIntElement(term164406, 4, 1653372776);
        setIntElement(term164406, 5, 188572423);
        setElement(term164405, 0, term164406);
        setField(term164337, term164337.getClass(), "adjPos", term164405);
        setField(term164337, term164337.getClass(), "vertexWeight", term164413);
        setIntField(term164337, term164337.getClass(), "vertexDataSize", 1);
        setField(term164337, term164337.getClass(), "edgeData", term164415);
        setIntField(term164337, term164337.getClass(), "edgeDataSize", 1);
        setField(term164337, term164337.getClass(), "vertexLabel", term164417);
        setElement(term164419, 0, term164420);
        setElement(term164419, 1, term164421);
        setElement(term164419, 2, term164422);
        setElement(term164419, 3, term164423);
        setElement(term164419, 4, term164424);
        setElement(term164419, 5, term164425);
        setElement(term164419, 6, term164426);
        setElement(term164419, 7, term164427);
        setElement(term164418, 0, term164419);
        setElement(term164428, 0, term164429);
        setElement(term164428, 1, term164430);
        setElement(term164428, 2, term164427);
        setElement(term164418, 1, term164428);
        setElement(term164431, 0, term164429);
        setElement(term164431, 1, term164420);
        setElement(term164431, 2, term164425);
        setElement(term164431, 3, term164423);
        setElement(term164431, 4, term164421);
        setElement(term164418, 2, term164431);
        setElement(term164432, 0, term164421);
        setElement(term164432, 1, term164430);
        setElement(term164432, 2, term164427);
        setElement(term164432, 3, term164427);
        setElement(term164432, 4, term164424);
        setElement(term164432, 5, term164430);
        setElement(term164432, 6, term164427);
        setElement(term164418, 3, term164432);
        setField(term164337, term164337.getClass(), "edgeLabel", term164418);
        setField(term164337, term164337.getClass(), "vertexIndex", null);
        setField(term164337, term164337.getClass(), "adjSet", term164433);
        setField(term164337, term164337.getClass(), "adjMap", term164434);
        setField(term164337, term164337.getClass(), "maxVertexNumber", term164435);
        setField(term164337, term164337.getClass(), "labelVertexMap", term164437);
        setField(term164337, term164337.getClass(), "labelEdgeMap", term164442);
        setBooleanField(term164337, term164337.getClass(), "directed", true);
        setBooleanField(term164337, term164337.getClass(), "allowingMultipleEdges", true);
        setBooleanField(term164337, term164337.getClass(), "allowingSelfLoops", false);
        setIntField(term164337, term164337.getClass(), "avgDegree", -356160852);
        setBooleanField(term164337, term164337.getClass(), "safeMode", true);
        term164452 = new Integer(1687517175);
        term164454 = new Integer(1996950306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term164452;
        args[1] = term164454;
        callMethod(klass, "removeEdgeAt", argTypes, term164337, args);
    }

};


