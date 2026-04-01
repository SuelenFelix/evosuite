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
     Object term164334;
     Object term164449;
     Object term164451;

    public DigraphImpl_removeEdgeAt_53842917211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term164432 = new Integer(-1972033388);
        HashMap term164434 = new HashMap();
        HashMap term164439 = new HashMap();
        term164334 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        Object[] term164335 = (Object[]) newArray("[I", 2);
        int[] term164336 = (int[]) newIntArray(6);
        int[] term164343 = (int[]) newIntArray(9);
        Object[] term164353 = (Object[]) newArray("[I", 3);
        int[] term164354 = (int[]) newIntArray(6);
        int[] term164361 = (int[]) newIntArray(6);
        int[] term164368 = (int[]) newIntArray(2);
        int[] term164371 = (int[]) newIntArray(1);
        int[] term164388 = (int[]) newIntArray(9);
        int[] term164398 = (int[]) newIntArray(2);
        Object[] term164401 = (Object[]) newArray("[I", 0);
        Object[] term164402 = (Object[]) newArray("[I", 1);
        int[] term164403 = (int[]) newIntArray(6);
        double[] term164410 = (double[]) newDoubleArray(0);
        Object[] term164412 = (Object[]) newArray("[[D", 0);
        Object[] term164414 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term164415 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 4);
        Object[] term164416 = (Object[]) newArray("java.lang.Object", 8);
        Object term164417 = newInstance(Class.forName("java.lang.Object"));
        Object term164418 = newInstance(Class.forName("java.lang.Object"));
        Object term164419 = newInstance(Class.forName("java.lang.Object"));
        Object term164420 = newInstance(Class.forName("java.lang.Object"));
        Object term164421 = newInstance(Class.forName("java.lang.Object"));
        Object term164422 = newInstance(Class.forName("java.lang.Object"));
        Object term164423 = newInstance(Class.forName("java.lang.Object"));
        Object term164424 = newInstance(Class.forName("java.lang.Object"));
        Object[] term164425 = (Object[]) newArray("java.lang.Object", 3);
        Object term164426 = newInstance(Class.forName("java.lang.Object"));
        Object term164427 = newInstance(Class.forName("java.lang.Object"));
        Object[] term164428 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term164429 = (Object[]) newArray("java.lang.Object", 7);
        Object[] term164430 = (Object[]) newArray("org.graph4j.AdjacencySet", 3);
        Object[] term164431 = (Object[]) newArray("org.graph4j.AdjacencyMap", 2);
        setIntElement(term164336, 0, 888994793);
        setIntElement(term164336, 1, 1654829804);
        setIntElement(term164336, 2, 215342139);
        setIntElement(term164336, 3, 583776304);
        setIntElement(term164336, 4, 1284567321);
        setIntElement(term164336, 5, 354007116);
        setElement(term164335, 0, term164336);
        setIntElement(term164343, 0, 1714616855);
        setIntElement(term164343, 1, 1158206243);
        setIntElement(term164343, 2, -2012067202);
        setIntElement(term164343, 3, -131980120);
        setIntElement(term164343, 4, 1264147045);
        setIntElement(term164343, 5, -1468643925);
        setIntElement(term164343, 6, 1721447838);
        setIntElement(term164343, 7, 2047883278);
        setIntElement(term164343, 8, -2084150613);
        setElement(term164335, 1, term164343);
        setField(term164334, term164334.getClass(), "predList", term164335);
        setIntElement(term164354, 0, 509497705);
        setIntElement(term164354, 1, -51966953);
        setIntElement(term164354, 2, 2052112989);
        setIntElement(term164354, 3, 400785633);
        setIntElement(term164354, 4, 1223980584);
        setIntElement(term164354, 5, -1196616478);
        setElement(term164353, 0, term164354);
        setIntElement(term164361, 0, 593528124);
        setIntElement(term164361, 1, 1179392084);
        setIntElement(term164361, 2, -148887832);
        setIntElement(term164361, 3, -619735589);
        setIntElement(term164361, 4, 1937981774);
        setIntElement(term164361, 5, 1938479308);
        setElement(term164353, 1, term164361);
        setIntElement(term164368, 0, -510313414);
        setIntElement(term164368, 1, 808188288);
        setElement(term164353, 2, term164368);
        setField(term164334, term164334.getClass(), "predPos", term164353);
        setIntElement(term164371, 0, -1346248029);
        setField(term164334, term164334.getClass(), "indegree", term164371);
        setField(term164334, term164334.getClass(), "name", "QNjNTLlUaV");
        setIntField(term164334, term164334.getClass(), "maxVertices", 254993393);
        setIntField(term164334, term164334.getClass(), "numVertices", -28264498);
        setLongField(term164334, term164334.getClass(), "numEdges", 1133267598258375793L);
        setIntElement(term164388, 0, 1465978105);
        setIntElement(term164388, 1, -382041999);
        setIntElement(term164388, 2, 144401642);
        setIntElement(term164388, 3, -1041912502);
        setIntElement(term164388, 4, 632068695);
        setIntElement(term164388, 5, 641999875);
        setIntElement(term164388, 6, 2026536518);
        setIntElement(term164388, 7, -1871748004);
        setIntElement(term164388, 8, 164750112);
        setField(term164334, term164334.getClass(), "vertices", term164388);
        setIntElement(term164398, 0, 43223793);
        setIntElement(term164398, 1, -125390305);
        setField(term164334, term164334.getClass(), "degree", term164398);
        setField(term164334, term164334.getClass(), "adjList", term164401);
        setIntElement(term164403, 0, 1069221906);
        setIntElement(term164403, 1, 1695465227);
        setIntElement(term164403, 2, -2102568816);
        setIntElement(term164403, 3, 1867786364);
        setIntElement(term164403, 4, 1653372776);
        setIntElement(term164403, 5, 188572423);
        setElement(term164402, 0, term164403);
        setField(term164334, term164334.getClass(), "adjPos", term164402);
        setField(term164334, term164334.getClass(), "vertexWeight", term164410);
        setIntField(term164334, term164334.getClass(), "vertexDataSize", 1);
        setField(term164334, term164334.getClass(), "edgeData", term164412);
        setIntField(term164334, term164334.getClass(), "edgeDataSize", 1);
        setField(term164334, term164334.getClass(), "vertexLabel", term164414);
        setElement(term164416, 0, term164417);
        setElement(term164416, 1, term164418);
        setElement(term164416, 2, term164419);
        setElement(term164416, 3, term164420);
        setElement(term164416, 4, term164421);
        setElement(term164416, 5, term164422);
        setElement(term164416, 6, term164423);
        setElement(term164416, 7, term164424);
        setElement(term164415, 0, term164416);
        setElement(term164425, 0, term164426);
        setElement(term164425, 1, term164427);
        setElement(term164425, 2, term164424);
        setElement(term164415, 1, term164425);
        setElement(term164428, 0, term164426);
        setElement(term164428, 1, term164417);
        setElement(term164428, 2, term164422);
        setElement(term164428, 3, term164420);
        setElement(term164428, 4, term164418);
        setElement(term164415, 2, term164428);
        setElement(term164429, 0, term164418);
        setElement(term164429, 1, term164427);
        setElement(term164429, 2, term164424);
        setElement(term164429, 3, term164424);
        setElement(term164429, 4, term164421);
        setElement(term164429, 5, term164427);
        setElement(term164429, 6, term164424);
        setElement(term164415, 3, term164429);
        setField(term164334, term164334.getClass(), "edgeLabel", term164415);
        setField(term164334, term164334.getClass(), "vertexIndex", null);
        setField(term164334, term164334.getClass(), "adjSet", term164430);
        setField(term164334, term164334.getClass(), "adjMap", term164431);
        setField(term164334, term164334.getClass(), "maxVertexNumber", term164432);
        setField(term164334, term164334.getClass(), "labelVertexMap", term164434);
        setField(term164334, term164334.getClass(), "labelEdgeMap", term164439);
        setBooleanField(term164334, term164334.getClass(), "directed", true);
        setBooleanField(term164334, term164334.getClass(), "allowingMultipleEdges", true);
        setBooleanField(term164334, term164334.getClass(), "allowingSelfLoops", false);
        setIntField(term164334, term164334.getClass(), "avgDegree", -356160852);
        setBooleanField(term164334, term164334.getClass(), "safeMode", true);
        term164449 = new Integer(1687517175);
        term164451 = new Integer(1996950306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term164449;
        args[1] = term164451;
        callMethod(klass, "removeEdgeAt", argTypes, term164334, args);
    }

};


