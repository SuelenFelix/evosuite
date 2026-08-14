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

public class StoerWagnerMinimumCut2_sumProcessedNeighbors_3284139438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4883;
     Object term4949;

    public StoerWagnerMinimumCut2_sumProcessedNeighbors_3284139438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4915 = new HashMap();
        Double term4928 = new Double(0.5279279537140873);
        Integer term4930 = new Integer(933028652);
        Double term4944 = new Double(0.3202192021706908);
        Integer term4947 = new Integer(287287233);
        term4883 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4885 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4886 = (int[]) newIntArray(1);
        int[] term4888 = (int[]) newIntArray(0);
        boolean[] term4890 = (boolean[]) newBooleanArray(2);
        double[] term4893 = (double[]) newDoubleArray(5);
        Object term4899 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4900 = (int[]) newIntArray(2);
        Object term4905 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4906 = (long[]) newLongArray(1);
        Object term4910 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4911 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4932 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4933 = (int[]) newIntArray(5);
        int[] term4939 = (int[]) newIntArray(4);
        Object term4946 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4883, term4883.getClass(), "ignoreWeights", false);
        setField(term4883, term4883.getClass(), "workGraph", null);
        setField(term4885, term4885.getClass(), "graph", null);
        setField(term4885, term4885.getClass(), "comparator", null);
        setIntElement(term4886, 0, -2018093075);
        setField(term4885, term4885.getClass(), "keys", term4886);
        setField(term4885, term4885.getClass(), "positions", term4888);
        setIntField(term4885, term4885.getClass(), "size", 135879009);
        setField(term4883, term4883.getClass(), "maxHeap", term4885);
        setBooleanElement(term4890, 1, true);
        setField(term4883, term4883.getClass(), "processed", term4890);
        setDoubleElement(term4893, 0, 0.03699061125289671);
        setDoubleElement(term4893, 1, 0.6047137830113202);
        setDoubleElement(term4893, 2, 0.6767213143579776);
        setDoubleElement(term4893, 3, 0.48862955528902696);
        setDoubleElement(term4893, 4, 0.426231085465289);
        setField(term4883, term4883.getClass(), "weight", term4893);
        setField(term4899, term4899.getClass(), "graph", null);
        setIntElement(term4900, 0, 1923027847);
        setIntElement(term4900, 1, -1652693609);
        setField(term4899, term4899.getClass(), "vertices", term4900);
        setIntField(term4899, term4899.getClass(), "numVertices", -824893512);
        setIntField(term4899, term4899.getClass(), "first", -55435071);
        setField(term4905, term4905.getClass(), "words", term4906);
        setIntField(term4905, term4905.getClass(), "wordsInUse", -673356166);
        setBooleanField(term4905, term4905.getClass(), "sizeIsSticky", true);
        setField(term4899, term4899.getClass(), "bitset", term4905);
        setField(term4883, term4883.getClass(), "ordering", term4899);
        setField(term4910, term4910.getClass(), "table", term4911);
        setIntField(term4910, term4910.getClass(), "count", 1876812694);
        setIntField(term4910, term4910.getClass(), "threshold", 15);
        setFloatField(term4910, term4910.getClass(), "loadFactor", 0.75F);
        setField(term4883, term4883.getClass(), "orderingIndex", term4910);
        setField(term4883, term4883.getClass(), "vertexMap", term4915);
        setField(term4883, term4883.getClass(), "minWeight", term4928);
        setField(term4883, term4883.getClass(), "minCutVertex", term4930);
        setField(term4932, term4932.getClass(), "graph", null);
        setIntElement(term4933, 0, -164438599);
        setIntElement(term4933, 1, -444441955);
        setIntElement(term4933, 2, -544005591);
        setIntElement(term4933, 3, -1379603462);
        setIntElement(term4933, 4, -1304965721);
        setField(term4932, term4932.getClass(), "leftSide", term4933);
        setIntElement(term4939, 0, 1661411651);
        setIntElement(term4939, 1, 175517901);
        setIntElement(term4939, 2, 335030203);
        setIntElement(term4939, 3, -474014477);
        setField(term4932, term4932.getClass(), "rightSide", term4939);
        setField(term4932, term4932.getClass(), "weight", term4944);
        setField(term4946, term4946.getClass(), "graph", null);
        setField(term4946, term4946.getClass(), "map", null);
        setField(term4932, term4932.getClass(), "edges", term4946);
        setField(term4883, term4883.getClass(), "minCut", term4932);
        setField(term4883, term4883.getClass(), "newVertex", term4947);
        setField(term4883, term4883.getClass(), "graph", null);
        term4949 = new Integer(1610419467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4949;
        callMethod(klass, "sumProcessedNeighbors", argTypes, term4883, args);
    }

};


