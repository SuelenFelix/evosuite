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

public class BridgeDetectionAlgorithm_Visitor_startVertex_6643074351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;
     Object term1510;

    public BridgeDetectionAlgorithm_Visitor_startVertex_6643074351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1490 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor"));
        int[] term1492 = (int[]) newIntArray(6);
        Object term1499 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1500 = (int[]) newIntArray(2);
        Object term1505 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1506 = (long[]) newLongArray(1);
        setBooleanField(term1490, term1490.getClass(), "checkOnly", false);
        setIntElement(term1492, 0, -1651110911);
        setIntElement(term1492, 1, -1934033808);
        setIntElement(term1492, 2, 950322609);
        setIntElement(term1492, 3, -2023791789);
        setIntElement(term1492, 4, 353974456);
        setIntElement(term1492, 5, -485108462);
        setField(term1490, term1490.getClass(), "low", term1492);
        setField(term1499, term1499.getClass(), "graph", null);
        setIntElement(term1500, 0, 1418551216);
        setIntElement(term1500, 1, -626779272);
        setField(term1499, term1499.getClass(), "vertices", term1500);
        setIntField(term1499, term1499.getClass(), "numVertices", -1150062870);
        setIntField(term1499, term1499.getClass(), "first", -886200503);
        setField(term1505, term1505.getClass(), "words", term1506);
        setIntField(term1505, term1505.getClass(), "wordsInUse", 1136393691);
        setBooleanField(term1505, term1505.getClass(), "sizeIsSticky", true);
        setField(term1499, term1499.getClass(), "bitset", term1505);
        setField(term1490, term1490.getClass(), "stack", term1499);
        setField(term1490, term1490.getClass(), "this$0", null);
        term1510 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1515 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1520 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1525 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1530 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1510, term1510.getClass(), "component", -1288536479);
        setIntField(term1510, term1510.getClass(), "vertex", 1092038167);
        setIntField(term1510, term1510.getClass(), "level", 1879729823);
        setIntField(term1510, term1510.getClass(), "order", 1443855558);
        setIntField(term1515, term1515.getClass(), "component", -1933419449);
        setIntField(term1515, term1515.getClass(), "vertex", -1804322375);
        setIntField(term1515, term1515.getClass(), "level", 1595814906);
        setIntField(term1515, term1515.getClass(), "order", -834193529);
        setIntField(term1520, term1520.getClass(), "component", 335780735);
        setIntField(term1520, term1520.getClass(), "vertex", -1541981599);
        setIntField(term1520, term1520.getClass(), "level", 1605456363);
        setIntField(term1520, term1520.getClass(), "order", 2059896693);
        setIntField(term1525, term1525.getClass(), "component", 2109912812);
        setIntField(term1525, term1525.getClass(), "vertex", 1841286431);
        setIntField(term1525, term1525.getClass(), "level", -1723168189);
        setIntField(term1525, term1525.getClass(), "order", -675283917);
        setIntField(term1530, term1530.getClass(), "component", -2093862988);
        setIntField(term1530, term1530.getClass(), "vertex", 1337828646);
        setIntField(term1530, term1530.getClass(), "level", 532666604);
        setIntField(term1530, term1530.getClass(), "order", -13725716);
        setField(term1530, term1530.getClass(), "parent", null);
        setField(term1525, term1525.getClass(), "parent", term1530);
        setField(term1520, term1520.getClass(), "parent", term1525);
        setField(term1515, term1515.getClass(), "parent", term1520);
        setField(term1510, term1510.getClass(), "parent", term1515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term1510;
        callMethod(klass, "startVertex", argTypes, term1490, args);
    }

};


