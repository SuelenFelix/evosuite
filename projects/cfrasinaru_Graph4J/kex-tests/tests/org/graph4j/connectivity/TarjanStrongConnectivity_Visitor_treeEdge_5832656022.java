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

public class TarjanStrongConnectivity_Visitor_treeEdge_5832656022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;
     Object term1026;
     Object term1051;

    public TarjanStrongConnectivity_Visitor_treeEdge_5832656022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1001 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term1003 = (int[]) newIntArray(6);
        Object term1010 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1011 = (int[]) newIntArray(5);
        Object term1019 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1020 = (long[]) newLongArray(1);
        boolean[] term1024 = (boolean[]) newBooleanArray(1);
        setBooleanField(term1001, term1001.getClass(), "checkOnly", false);
        setIntElement(term1003, 0, -358526505);
        setIntElement(term1003, 1, 1843268026);
        setIntElement(term1003, 2, 954660603);
        setIntElement(term1003, 3, -1351605385);
        setIntElement(term1003, 4, 278355793);
        setIntElement(term1003, 5, -310648604);
        setField(term1001, term1001.getClass(), "low", term1003);
        setField(term1010, term1010.getClass(), "graph", null);
        setIntElement(term1011, 0, -648200466);
        setIntElement(term1011, 1, 2007134147);
        setIntElement(term1011, 2, 993388358);
        setIntElement(term1011, 3, -765191335);
        setIntElement(term1011, 4, -1697741155);
        setField(term1010, term1010.getClass(), "vertices", term1011);
        setIntField(term1010, term1010.getClass(), "numVertices", 1295839803);
        setIntField(term1010, term1010.getClass(), "first", -1891015523);
        setField(term1019, term1019.getClass(), "words", term1020);
        setIntField(term1019, term1019.getClass(), "wordsInUse", -1560631747);
        setBooleanField(term1019, term1019.getClass(), "sizeIsSticky", false);
        setField(term1010, term1010.getClass(), "bitset", term1019);
        setField(term1001, term1001.getClass(), "stack", term1010);
        setField(term1001, term1001.getClass(), "instack", term1024);
        setField(term1001, term1001.getClass(), "this$0", null);
        term1026 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1031 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1036 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1041 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1046 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1026, term1026.getClass(), "component", 1215150180);
        setIntField(term1026, term1026.getClass(), "vertex", -1422859977);
        setIntField(term1026, term1026.getClass(), "level", -1972436591);
        setIntField(term1026, term1026.getClass(), "order", 68922753);
        setIntField(term1031, term1031.getClass(), "component", -220791533);
        setIntField(term1031, term1031.getClass(), "vertex", 1741500243);
        setIntField(term1031, term1031.getClass(), "level", -2070466617);
        setIntField(term1031, term1031.getClass(), "order", -1127721881);
        setIntField(term1036, term1036.getClass(), "component", 1074848808);
        setIntField(term1036, term1036.getClass(), "vertex", -146054762);
        setIntField(term1036, term1036.getClass(), "level", 798043553);
        setIntField(term1036, term1036.getClass(), "order", 533197381);
        setIntField(term1041, term1041.getClass(), "component", 1048271679);
        setIntField(term1041, term1041.getClass(), "vertex", -1529797673);
        setIntField(term1041, term1041.getClass(), "level", -868676396);
        setIntField(term1041, term1041.getClass(), "order", 1922684808);
        setIntField(term1046, term1046.getClass(), "component", -2005784375);
        setIntField(term1046, term1046.getClass(), "vertex", -288604325);
        setIntField(term1046, term1046.getClass(), "level", -1268314569);
        setIntField(term1046, term1046.getClass(), "order", 877649659);
        setField(term1046, term1046.getClass(), "parent", null);
        setField(term1041, term1041.getClass(), "parent", term1046);
        setField(term1036, term1036.getClass(), "parent", term1041);
        setField(term1031, term1031.getClass(), "parent", term1036);
        setField(term1026, term1026.getClass(), "parent", term1031);
        term1051 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1056 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1061 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1066 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1071 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1051, term1051.getClass(), "component", -1553893255);
        setIntField(term1051, term1051.getClass(), "vertex", 1303442927);
        setIntField(term1051, term1051.getClass(), "level", 794568325);
        setIntField(term1051, term1051.getClass(), "order", -434468428);
        setIntField(term1056, term1056.getClass(), "component", 1559605714);
        setIntField(term1056, term1056.getClass(), "vertex", 1146601902);
        setIntField(term1056, term1056.getClass(), "level", -1938881385);
        setIntField(term1056, term1056.getClass(), "order", -1629418973);
        setIntField(term1061, term1061.getClass(), "component", -100825168);
        setIntField(term1061, term1061.getClass(), "vertex", 768407648);
        setIntField(term1061, term1061.getClass(), "level", -350454594);
        setIntField(term1061, term1061.getClass(), "order", -1148142995);
        setIntField(term1066, term1066.getClass(), "component", -233024044);
        setIntField(term1066, term1066.getClass(), "vertex", 1820784228);
        setIntField(term1066, term1066.getClass(), "level", 1390820006);
        setIntField(term1066, term1066.getClass(), "order", -828982065);
        setIntField(term1071, term1071.getClass(), "component", 1221443226);
        setIntField(term1071, term1071.getClass(), "vertex", 908108726);
        setIntField(term1071, term1071.getClass(), "level", 1023209512);
        setIntField(term1071, term1071.getClass(), "order", 1084849225);
        setField(term1071, term1071.getClass(), "parent", null);
        setField(term1066, term1066.getClass(), "parent", term1071);
        setField(term1061, term1061.getClass(), "parent", term1066);
        setField(term1056, term1056.getClass(), "parent", term1061);
        setField(term1051, term1051.getClass(), "parent", term1056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1026;
        args[1] = term1051;
        callMethod(klass, "treeEdge", argTypes, term1001, args);
    }

};


