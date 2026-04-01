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

public class StoerWagnerMinimumCut2_findFirstNeighborPos_16386648597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4785;
     Object term4856;

    public StoerWagnerMinimumCut2_findFirstNeighborPos_16386648597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4820 = new HashMap();
        Double term4833 = new Double(0.3587267442738795);
        Integer term4835 = new Integer(-1588772968);
        Double term4851 = new Double(0.07802449704920456);
        Integer term4854 = new Integer(-93135961);
        term4785 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4787 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4788 = (int[]) newIntArray(0);
        int[] term4789 = (int[]) newIntArray(2);
        boolean[] term4793 = (boolean[]) newBooleanArray(5);
        double[] term4799 = (double[]) newDoubleArray(0);
        Object term4800 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4801 = (int[]) newIntArray(6);
        Object term4810 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4811 = (long[]) newLongArray(1);
        Object term4815 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4816 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4837 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4838 = (int[]) newIntArray(7);
        int[] term4846 = (int[]) newIntArray(4);
        Object term4853 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4785, term4785.getClass(), "ignoreWeights", true);
        setField(term4785, term4785.getClass(), "workGraph", null);
        setField(term4787, term4787.getClass(), "graph", null);
        setField(term4787, term4787.getClass(), "comparator", null);
        setField(term4787, term4787.getClass(), "keys", term4788);
        setIntElement(term4789, 0, 593679468);
        setIntElement(term4789, 1, 747491);
        setField(term4787, term4787.getClass(), "positions", term4789);
        setIntField(term4787, term4787.getClass(), "size", 734222768);
        setField(term4785, term4785.getClass(), "maxHeap", term4787);
        setBooleanElement(term4793, 0, true);
        setBooleanElement(term4793, 1, true);
        setBooleanElement(term4793, 2, true);
        setBooleanElement(term4793, 3, true);
        setBooleanElement(term4793, 4, true);
        setField(term4785, term4785.getClass(), "processed", term4793);
        setField(term4785, term4785.getClass(), "weight", term4799);
        setField(term4800, term4800.getClass(), "graph", null);
        setIntElement(term4801, 0, 1545425140);
        setIntElement(term4801, 1, -1580765555);
        setIntElement(term4801, 2, -1295149055);
        setIntElement(term4801, 3, -769814321);
        setIntElement(term4801, 4, 114898432);
        setIntElement(term4801, 5, -193767503);
        setField(term4800, term4800.getClass(), "vertices", term4801);
        setIntField(term4800, term4800.getClass(), "numVertices", -2090918082);
        setIntField(term4800, term4800.getClass(), "first", 1505717672);
        setField(term4810, term4810.getClass(), "words", term4811);
        setIntField(term4810, term4810.getClass(), "wordsInUse", -1683274691);
        setBooleanField(term4810, term4810.getClass(), "sizeIsSticky", true);
        setField(term4800, term4800.getClass(), "bitset", term4810);
        setField(term4785, term4785.getClass(), "ordering", term4800);
        setField(term4815, term4815.getClass(), "table", term4816);
        setIntField(term4815, term4815.getClass(), "count", -935900044);
        setIntField(term4815, term4815.getClass(), "threshold", 15);
        setFloatField(term4815, term4815.getClass(), "loadFactor", 0.75F);
        setField(term4785, term4785.getClass(), "orderingIndex", term4815);
        setField(term4785, term4785.getClass(), "vertexMap", term4820);
        setField(term4785, term4785.getClass(), "minWeight", term4833);
        setField(term4785, term4785.getClass(), "minCutVertex", term4835);
        setField(term4837, term4837.getClass(), "graph", null);
        setIntElement(term4838, 0, 800440712);
        setIntElement(term4838, 1, -1976407622);
        setIntElement(term4838, 2, -552996061);
        setIntElement(term4838, 3, -153013117);
        setIntElement(term4838, 4, 712181359);
        setIntElement(term4838, 5, -1943255435);
        setIntElement(term4838, 6, 868436312);
        setField(term4837, term4837.getClass(), "leftSide", term4838);
        setIntElement(term4846, 0, 1737963071);
        setIntElement(term4846, 1, 6456997);
        setIntElement(term4846, 2, -797269627);
        setIntElement(term4846, 3, -224331928);
        setField(term4837, term4837.getClass(), "rightSide", term4846);
        setField(term4837, term4837.getClass(), "weight", term4851);
        setField(term4853, term4853.getClass(), "graph", null);
        setField(term4853, term4853.getClass(), "map", null);
        setField(term4837, term4837.getClass(), "edges", term4853);
        setField(term4785, term4785.getClass(), "minCut", term4837);
        setField(term4785, term4785.getClass(), "newVertex", term4854);
        setField(term4785, term4785.getClass(), "graph", null);
        term4856 = new Integer(-587857163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4856;
        callMethod(klass, "findFirstNeighborPos", argTypes, term4785, args);
    }

};


