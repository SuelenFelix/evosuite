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

public class TarjanStrongConnectivity_Visitor_backEdge_19680696853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1089;
     Object term1108;
     Object term1133;

    public TarjanStrongConnectivity_Visitor_backEdge_19680696853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1089 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term1091 = (int[]) newIntArray(4);
        Object term1096 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1097 = (int[]) newIntArray(1);
        Object term1101 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1102 = (long[]) newLongArray(1);
        boolean[] term1106 = (boolean[]) newBooleanArray(1);
        setBooleanField(term1089, term1089.getClass(), "checkOnly", false);
        setIntElement(term1091, 0, 1241164745);
        setIntElement(term1091, 1, 1723148410);
        setIntElement(term1091, 2, -920797484);
        setIntElement(term1091, 3, -1631697577);
        setField(term1089, term1089.getClass(), "low", term1091);
        setField(term1096, term1096.getClass(), "graph", null);
        setIntElement(term1097, 0, 765731371);
        setField(term1096, term1096.getClass(), "vertices", term1097);
        setIntField(term1096, term1096.getClass(), "numVertices", -1703035419);
        setIntField(term1096, term1096.getClass(), "first", 765766290);
        setField(term1101, term1101.getClass(), "words", term1102);
        setIntField(term1101, term1101.getClass(), "wordsInUse", -1284825282);
        setBooleanField(term1101, term1101.getClass(), "sizeIsSticky", false);
        setField(term1096, term1096.getClass(), "bitset", term1101);
        setField(term1089, term1089.getClass(), "stack", term1096);
        setField(term1089, term1089.getClass(), "instack", term1106);
        setField(term1089, term1089.getClass(), "this$0", null);
        term1108 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1113 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1118 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1123 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1128 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1108, term1108.getClass(), "component", -1941343035);
        setIntField(term1108, term1108.getClass(), "vertex", 947897214);
        setIntField(term1108, term1108.getClass(), "level", 1496340209);
        setIntField(term1108, term1108.getClass(), "order", -1748391876);
        setIntField(term1113, term1113.getClass(), "component", 43258317);
        setIntField(term1113, term1113.getClass(), "vertex", 1707220033);
        setIntField(term1113, term1113.getClass(), "level", -1792504217);
        setIntField(term1113, term1113.getClass(), "order", 1824538861);
        setIntField(term1118, term1118.getClass(), "component", 499519708);
        setIntField(term1118, term1118.getClass(), "vertex", 1501165033);
        setIntField(term1118, term1118.getClass(), "level", 510162332);
        setIntField(term1118, term1118.getClass(), "order", 888506903);
        setIntField(term1123, term1123.getClass(), "component", 200252898);
        setIntField(term1123, term1123.getClass(), "vertex", -1831826725);
        setIntField(term1123, term1123.getClass(), "level", 752152965);
        setIntField(term1123, term1123.getClass(), "order", -1577069773);
        setIntField(term1128, term1128.getClass(), "component", -266625190);
        setIntField(term1128, term1128.getClass(), "vertex", 489201218);
        setIntField(term1128, term1128.getClass(), "level", 464181937);
        setIntField(term1128, term1128.getClass(), "order", -1455526612);
        setField(term1128, term1128.getClass(), "parent", null);
        setField(term1123, term1123.getClass(), "parent", term1128);
        setField(term1118, term1118.getClass(), "parent", term1123);
        setField(term1113, term1113.getClass(), "parent", term1118);
        setField(term1108, term1108.getClass(), "parent", term1113);
        term1133 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1138 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1143 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1148 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1153 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1133, term1133.getClass(), "component", 76650923);
        setIntField(term1133, term1133.getClass(), "vertex", 1003743923);
        setIntField(term1133, term1133.getClass(), "level", 1887772522);
        setIntField(term1133, term1133.getClass(), "order", 354196060);
        setIntField(term1138, term1138.getClass(), "component", -1840305774);
        setIntField(term1138, term1138.getClass(), "vertex", 1365087144);
        setIntField(term1138, term1138.getClass(), "level", -1537255112);
        setIntField(term1138, term1138.getClass(), "order", 934477462);
        setIntField(term1143, term1143.getClass(), "component", 4900410);
        setIntField(term1143, term1143.getClass(), "vertex", -1252345779);
        setIntField(term1143, term1143.getClass(), "level", -2063365430);
        setIntField(term1143, term1143.getClass(), "order", 812570053);
        setIntField(term1148, term1148.getClass(), "component", -1488938905);
        setIntField(term1148, term1148.getClass(), "vertex", 1916544127);
        setIntField(term1148, term1148.getClass(), "level", -1133405894);
        setIntField(term1148, term1148.getClass(), "order", 1289741214);
        setIntField(term1153, term1153.getClass(), "component", 243280944);
        setIntField(term1153, term1153.getClass(), "vertex", -726681073);
        setIntField(term1153, term1153.getClass(), "level", -1724487863);
        setIntField(term1153, term1153.getClass(), "order", -128490829);
        setField(term1153, term1153.getClass(), "parent", null);
        setField(term1148, term1148.getClass(), "parent", term1153);
        setField(term1143, term1143.getClass(), "parent", term1148);
        setField(term1138, term1138.getClass(), "parent", term1143);
        setField(term1133, term1133.getClass(), "parent", term1138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1108;
        args[1] = term1133;
        callMethod(klass, "backEdge", argTypes, term1089, args);
    }

};


