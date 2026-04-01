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
import java.util.HashMap;
import java.lang.Double;
import java.lang.Integer;

public class StoerWagnerMinimumCut2_findNewVertexPos_13733422096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4693;

    public StoerWagnerMinimumCut2_findNewVertexPos_13733422096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4732 = new HashMap();
        Double term4745 = new Double(0.9737083944266686);
        Integer term4747 = new Integer(-2095575670);
        Double term4757 = new Double(0.0668892744806211);
        Integer term4760 = new Integer(1225272962);
        term4693 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4695 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4696 = (int[]) newIntArray(1);
        int[] term4698 = (int[]) newIntArray(0);
        boolean[] term4700 = (boolean[]) newBooleanArray(5);
        double[] term4706 = (double[]) newDoubleArray(3);
        Object term4710 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4711 = (int[]) newIntArray(8);
        Object term4722 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4723 = (long[]) newLongArray(1);
        Object term4727 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4728 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4749 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4750 = (int[]) newIntArray(3);
        int[] term4754 = (int[]) newIntArray(2);
        Object term4759 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4693, term4693.getClass(), "ignoreWeights", false);
        setField(term4693, term4693.getClass(), "workGraph", null);
        setField(term4695, term4695.getClass(), "graph", null);
        setField(term4695, term4695.getClass(), "comparator", null);
        setIntElement(term4696, 0, -1867539151);
        setField(term4695, term4695.getClass(), "keys", term4696);
        setField(term4695, term4695.getClass(), "positions", term4698);
        setIntField(term4695, term4695.getClass(), "size", -816430246);
        setField(term4693, term4693.getClass(), "maxHeap", term4695);
        setBooleanElement(term4700, 3, true);
        setBooleanElement(term4700, 4, true);
        setField(term4693, term4693.getClass(), "processed", term4700);
        setDoubleElement(term4706, 0, 0.6355029654528058);
        setDoubleElement(term4706, 1, 0.0022646783892913414);
        setDoubleElement(term4706, 2, 0.36226058076369927);
        setField(term4693, term4693.getClass(), "weight", term4706);
        setField(term4710, term4710.getClass(), "graph", null);
        setIntElement(term4711, 0, 1754193865);
        setIntElement(term4711, 1, 25277058);
        setIntElement(term4711, 2, -949634053);
        setIntElement(term4711, 3, 1495471055);
        setIntElement(term4711, 4, -583415628);
        setIntElement(term4711, 5, -1488660931);
        setIntElement(term4711, 6, 1899095931);
        setIntElement(term4711, 7, 145571200);
        setField(term4710, term4710.getClass(), "vertices", term4711);
        setIntField(term4710, term4710.getClass(), "numVertices", -81919234);
        setIntField(term4710, term4710.getClass(), "first", 41779745);
        setField(term4722, term4722.getClass(), "words", term4723);
        setIntField(term4722, term4722.getClass(), "wordsInUse", 908188015);
        setBooleanField(term4722, term4722.getClass(), "sizeIsSticky", false);
        setField(term4710, term4710.getClass(), "bitset", term4722);
        setField(term4693, term4693.getClass(), "ordering", term4710);
        setField(term4727, term4727.getClass(), "table", term4728);
        setIntField(term4727, term4727.getClass(), "count", 1448289766);
        setIntField(term4727, term4727.getClass(), "threshold", 15);
        setFloatField(term4727, term4727.getClass(), "loadFactor", 0.75F);
        setField(term4693, term4693.getClass(), "orderingIndex", term4727);
        setField(term4693, term4693.getClass(), "vertexMap", term4732);
        setField(term4693, term4693.getClass(), "minWeight", term4745);
        setField(term4693, term4693.getClass(), "minCutVertex", term4747);
        setField(term4749, term4749.getClass(), "graph", null);
        setIntElement(term4750, 0, -2139205197);
        setIntElement(term4750, 1, -584949216);
        setIntElement(term4750, 2, 1646064199);
        setField(term4749, term4749.getClass(), "leftSide", term4750);
        setIntElement(term4754, 0, -1135845415);
        setIntElement(term4754, 1, -1361921586);
        setField(term4749, term4749.getClass(), "rightSide", term4754);
        setField(term4749, term4749.getClass(), "weight", term4757);
        setField(term4759, term4759.getClass(), "graph", null);
        setField(term4759, term4759.getClass(), "map", null);
        setField(term4749, term4749.getClass(), "edges", term4759);
        setField(term4693, term4693.getClass(), "minCut", term4749);
        setField(term4693, term4693.getClass(), "newVertex", term4760);
        setField(term4693, term4693.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findNewVertexPos", argTypes, term4693, args);
    }

};


