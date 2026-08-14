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

public class BridgeDetectionAlgorithm_Visitor_upward_6494577173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1619;
     Object term1643;
     Object term1668;

    public BridgeDetectionAlgorithm_Visitor_upward_6494577173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1619 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor"));
        int[] term1621 = (int[]) newIntArray(3);
        Object term1625 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1626 = (int[]) newIntArray(9);
        Object term1638 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1639 = (long[]) newLongArray(1);
        setBooleanField(term1619, term1619.getClass(), "checkOnly", false);
        setIntElement(term1621, 0, -1742790308);
        setIntElement(term1621, 1, -1592093430);
        setIntElement(term1621, 2, 1178214545);
        setField(term1619, term1619.getClass(), "low", term1621);
        setField(term1625, term1625.getClass(), "graph", null);
        setIntElement(term1626, 0, -985334541);
        setIntElement(term1626, 1, -1870004228);
        setIntElement(term1626, 2, 380484139);
        setIntElement(term1626, 3, 1822317628);
        setIntElement(term1626, 4, -608830309);
        setIntElement(term1626, 5, -537786484);
        setIntElement(term1626, 6, 263859424);
        setIntElement(term1626, 7, 1436978289);
        setIntElement(term1626, 8, 696225243);
        setField(term1625, term1625.getClass(), "vertices", term1626);
        setIntField(term1625, term1625.getClass(), "numVertices", -1421649118);
        setIntField(term1625, term1625.getClass(), "first", -511248284);
        setField(term1638, term1638.getClass(), "words", term1639);
        setIntField(term1638, term1638.getClass(), "wordsInUse", 788630042);
        setBooleanField(term1638, term1638.getClass(), "sizeIsSticky", true);
        setField(term1625, term1625.getClass(), "bitset", term1638);
        setField(term1619, term1619.getClass(), "stack", term1625);
        setField(term1619, term1619.getClass(), "this$0", null);
        term1643 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1648 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1653 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1658 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1663 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1643, term1643.getClass(), "component", 1430066560);
        setIntField(term1643, term1643.getClass(), "vertex", 836734074);
        setIntField(term1643, term1643.getClass(), "level", -1747711865);
        setIntField(term1643, term1643.getClass(), "order", 682812715);
        setIntField(term1648, term1648.getClass(), "component", -1092883950);
        setIntField(term1648, term1648.getClass(), "vertex", 950385621);
        setIntField(term1648, term1648.getClass(), "level", -232352320);
        setIntField(term1648, term1648.getClass(), "order", -232333014);
        setIntField(term1653, term1653.getClass(), "component", -139694079);
        setIntField(term1653, term1653.getClass(), "vertex", -1602072035);
        setIntField(term1653, term1653.getClass(), "level", 1902624392);
        setIntField(term1653, term1653.getClass(), "order", 904607217);
        setIntField(term1658, term1658.getClass(), "component", 434914590);
        setIntField(term1658, term1658.getClass(), "vertex", 1983756621);
        setIntField(term1658, term1658.getClass(), "level", -2134711835);
        setIntField(term1658, term1658.getClass(), "order", -1641244494);
        setIntField(term1663, term1663.getClass(), "component", 1124282188);
        setIntField(term1663, term1663.getClass(), "vertex", -489441521);
        setIntField(term1663, term1663.getClass(), "level", 225873732);
        setIntField(term1663, term1663.getClass(), "order", 529879356);
        setField(term1663, term1663.getClass(), "parent", null);
        setField(term1658, term1658.getClass(), "parent", term1663);
        setField(term1653, term1653.getClass(), "parent", term1658);
        setField(term1648, term1648.getClass(), "parent", term1653);
        setField(term1643, term1643.getClass(), "parent", term1648);
        term1668 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1673 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1678 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1683 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1688 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1668, term1668.getClass(), "component", -712023865);
        setIntField(term1668, term1668.getClass(), "vertex", 613256157);
        setIntField(term1668, term1668.getClass(), "level", 454242689);
        setIntField(term1668, term1668.getClass(), "order", 1798354517);
        setIntField(term1673, term1673.getClass(), "component", -1495693617);
        setIntField(term1673, term1673.getClass(), "vertex", -890538258);
        setIntField(term1673, term1673.getClass(), "level", -1085899912);
        setIntField(term1673, term1673.getClass(), "order", -1458980236);
        setIntField(term1678, term1678.getClass(), "component", 890505372);
        setIntField(term1678, term1678.getClass(), "vertex", 2044137055);
        setIntField(term1678, term1678.getClass(), "level", -1452324619);
        setIntField(term1678, term1678.getClass(), "order", -1121709274);
        setIntField(term1683, term1683.getClass(), "component", -532304223);
        setIntField(term1683, term1683.getClass(), "vertex", 666218293);
        setIntField(term1683, term1683.getClass(), "level", 1737876343);
        setIntField(term1683, term1683.getClass(), "order", -897937940);
        setIntField(term1688, term1688.getClass(), "component", 1523261232);
        setIntField(term1688, term1688.getClass(), "vertex", -428988337);
        setIntField(term1688, term1688.getClass(), "level", 48047085);
        setIntField(term1688, term1688.getClass(), "order", 1902784843);
        setField(term1688, term1688.getClass(), "parent", null);
        setField(term1683, term1683.getClass(), "parent", term1688);
        setField(term1678, term1678.getClass(), "parent", term1683);
        setField(term1673, term1673.getClass(), "parent", term1678);
        setField(term1668, term1668.getClass(), "parent", term1673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1643;
        args[1] = term1668;
        callMethod(klass, "upward", argTypes, term1619, args);
    }

};


