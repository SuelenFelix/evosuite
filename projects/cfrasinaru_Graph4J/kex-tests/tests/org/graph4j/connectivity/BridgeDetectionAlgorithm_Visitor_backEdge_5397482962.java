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

public class BridgeDetectionAlgorithm_Visitor_backEdge_5397482962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1544;
     Object term1562;
     Object term1587;

    public BridgeDetectionAlgorithm_Visitor_backEdge_5397482962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1544 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor"));
        int[] term1546 = (int[]) newIntArray(1);
        Object term1548 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1549 = (int[]) newIntArray(5);
        Object term1557 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1558 = (long[]) newLongArray(1);
        setBooleanField(term1544, term1544.getClass(), "checkOnly", true);
        setIntElement(term1546, 0, -932147928);
        setField(term1544, term1544.getClass(), "low", term1546);
        setField(term1548, term1548.getClass(), "graph", null);
        setIntElement(term1549, 0, 487369012);
        setIntElement(term1549, 1, -179238712);
        setIntElement(term1549, 2, -2018735535);
        setIntElement(term1549, 3, -658524954);
        setIntElement(term1549, 4, -2009613557);
        setField(term1548, term1548.getClass(), "vertices", term1549);
        setIntField(term1548, term1548.getClass(), "numVertices", 654195547);
        setIntField(term1548, term1548.getClass(), "first", 1622857008);
        setField(term1557, term1557.getClass(), "words", term1558);
        setIntField(term1557, term1557.getClass(), "wordsInUse", 934338954);
        setBooleanField(term1557, term1557.getClass(), "sizeIsSticky", true);
        setField(term1548, term1548.getClass(), "bitset", term1557);
        setField(term1544, term1544.getClass(), "stack", term1548);
        setField(term1544, term1544.getClass(), "this$0", null);
        term1562 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1567 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1572 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1577 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1582 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1562, term1562.getClass(), "component", 598635505);
        setIntField(term1562, term1562.getClass(), "vertex", -944986533);
        setIntField(term1562, term1562.getClass(), "level", 1894454926);
        setIntField(term1562, term1562.getClass(), "order", 1415142780);
        setIntField(term1567, term1567.getClass(), "component", -574105759);
        setIntField(term1567, term1567.getClass(), "vertex", -1165271567);
        setIntField(term1567, term1567.getClass(), "level", 376834234);
        setIntField(term1567, term1567.getClass(), "order", -1911972560);
        setIntField(term1572, term1572.getClass(), "component", -642716895);
        setIntField(term1572, term1572.getClass(), "vertex", 1743398246);
        setIntField(term1572, term1572.getClass(), "level", -934658823);
        setIntField(term1572, term1572.getClass(), "order", 1632177303);
        setIntField(term1577, term1577.getClass(), "component", -802592348);
        setIntField(term1577, term1577.getClass(), "vertex", -1576584269);
        setIntField(term1577, term1577.getClass(), "level", 1474899591);
        setIntField(term1577, term1577.getClass(), "order", 297582552);
        setIntField(term1582, term1582.getClass(), "component", -1485916498);
        setIntField(term1582, term1582.getClass(), "vertex", 722787672);
        setIntField(term1582, term1582.getClass(), "level", 2077491675);
        setIntField(term1582, term1582.getClass(), "order", -1728316609);
        setField(term1582, term1582.getClass(), "parent", null);
        setField(term1577, term1577.getClass(), "parent", term1582);
        setField(term1572, term1572.getClass(), "parent", term1577);
        setField(term1567, term1567.getClass(), "parent", term1572);
        setField(term1562, term1562.getClass(), "parent", term1567);
        term1587 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1592 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1597 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1602 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1607 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1587, term1587.getClass(), "component", 588390599);
        setIntField(term1587, term1587.getClass(), "vertex", -95969566);
        setIntField(term1587, term1587.getClass(), "level", -68615285);
        setIntField(term1587, term1587.getClass(), "order", -337504086);
        setIntField(term1592, term1592.getClass(), "component", 2074130991);
        setIntField(term1592, term1592.getClass(), "vertex", 532588266);
        setIntField(term1592, term1592.getClass(), "level", -1286686332);
        setIntField(term1592, term1592.getClass(), "order", -284885486);
        setIntField(term1597, term1597.getClass(), "component", 1791984446);
        setIntField(term1597, term1597.getClass(), "vertex", 804070622);
        setIntField(term1597, term1597.getClass(), "level", 1850364894);
        setIntField(term1597, term1597.getClass(), "order", 915367534);
        setIntField(term1602, term1602.getClass(), "component", 1949983666);
        setIntField(term1602, term1602.getClass(), "vertex", 154111854);
        setIntField(term1602, term1602.getClass(), "level", 710986341);
        setIntField(term1602, term1602.getClass(), "order", -873958002);
        setIntField(term1607, term1607.getClass(), "component", -1780848958);
        setIntField(term1607, term1607.getClass(), "vertex", 1235045850);
        setIntField(term1607, term1607.getClass(), "level", -75143033);
        setIntField(term1607, term1607.getClass(), "order", 797015478);
        setField(term1607, term1607.getClass(), "parent", null);
        setField(term1602, term1602.getClass(), "parent", term1607);
        setField(term1597, term1597.getClass(), "parent", term1602);
        setField(term1592, term1592.getClass(), "parent", term1597);
        setField(term1587, term1587.getClass(), "parent", term1592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1562;
        args[1] = term1587;
        callMethod(klass, "backEdge", argTypes, term1544, args);
    }

};


