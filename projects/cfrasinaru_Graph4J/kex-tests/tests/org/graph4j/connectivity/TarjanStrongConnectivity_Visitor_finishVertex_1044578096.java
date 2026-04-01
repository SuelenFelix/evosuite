package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarjanStrongConnectivity_Visitor_finishVertex_1044578096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1347;
     Object term1377;

    public TarjanStrongConnectivity_Visitor_finishVertex_1044578096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1347 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term1349 = (int[]) newIntArray(4);
        Object term1354 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1355 = (int[]) newIntArray(6);
        Object term1364 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1365 = (long[]) newLongArray(1);
        boolean[] term1369 = (boolean[]) newBooleanArray(7);
        setBooleanField(term1347, term1347.getClass(), "checkOnly", false);
        setIntElement(term1349, 0, -711507760);
        setIntElement(term1349, 1, 1053773809);
        setIntElement(term1349, 2, 924127883);
        setIntElement(term1349, 3, -751079123);
        setField(term1347, term1347.getClass(), "low", term1349);
        setField(term1354, term1354.getClass(), "graph", null);
        setIntElement(term1355, 0, -110837188);
        setIntElement(term1355, 1, -271094506);
        setIntElement(term1355, 2, 455632030);
        setIntElement(term1355, 3, -1632929393);
        setIntElement(term1355, 4, -431440129);
        setIntElement(term1355, 5, -763576148);
        setField(term1354, term1354.getClass(), "vertices", term1355);
        setIntField(term1354, term1354.getClass(), "numVertices", 1568948514);
        setIntField(term1354, term1354.getClass(), "first", -1511130237);
        setField(term1364, term1364.getClass(), "words", term1365);
        setIntField(term1364, term1364.getClass(), "wordsInUse", 452088587);
        setBooleanField(term1364, term1364.getClass(), "sizeIsSticky", true);
        setField(term1354, term1354.getClass(), "bitset", term1364);
        setField(term1347, term1347.getClass(), "stack", term1354);
        setBooleanElement(term1369, 2, true);
        setBooleanElement(term1369, 3, true);
        setBooleanElement(term1369, 4, true);
        setBooleanElement(term1369, 5, true);
        setBooleanElement(term1369, 6, true);
        setField(term1347, term1347.getClass(), "instack", term1369);
        setField(term1347, term1347.getClass(), "this$0", null);
        term1377 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1382 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1387 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1392 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1397 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1377, term1377.getClass(), "component", -1630069454);
        setIntField(term1377, term1377.getClass(), "vertex", 1499735894);
        setIntField(term1377, term1377.getClass(), "level", 716486048);
        setIntField(term1377, term1377.getClass(), "order", -466708718);
        setIntField(term1382, term1382.getClass(), "component", 1038029515);
        setIntField(term1382, term1382.getClass(), "vertex", 1137154606);
        setIntField(term1382, term1382.getClass(), "level", -100681578);
        setIntField(term1382, term1382.getClass(), "order", 296568835);
        setIntField(term1387, term1387.getClass(), "component", 1431951992);
        setIntField(term1387, term1387.getClass(), "vertex", -1608123016);
        setIntField(term1387, term1387.getClass(), "level", -896473214);
        setIntField(term1387, term1387.getClass(), "order", 401203924);
        setIntField(term1392, term1392.getClass(), "component", -1212399479);
        setIntField(term1392, term1392.getClass(), "vertex", 2107679041);
        setIntField(term1392, term1392.getClass(), "level", 2040965507);
        setIntField(term1392, term1392.getClass(), "order", -1281083262);
        setIntField(term1397, term1397.getClass(), "component", 1059930704);
        setIntField(term1397, term1397.getClass(), "vertex", -1967153290);
        setIntField(term1397, term1397.getClass(), "level", -1397251956);
        setIntField(term1397, term1397.getClass(), "order", -796934571);
        setField(term1397, term1397.getClass(), "parent", null);
        setField(term1392, term1392.getClass(), "parent", term1397);
        setField(term1387, term1387.getClass(), "parent", term1392);
        setField(term1382, term1382.getClass(), "parent", term1387);
        setField(term1377, term1377.getClass(), "parent", term1382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term1377;
        callMethod(klass, "finishVertex", argTypes, term1347, args);
    }

};


