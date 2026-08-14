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

public class StoerWagnerMinimumCut2_checkForNegativeEdges_19672045969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4971;

    public StoerWagnerMinimumCut2_checkForNegativeEdges_19672045969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5015 = new HashMap();
        Double term5028 = new Double(0.22651340641904605);
        Integer term5030 = new Integer(1540719661);
        Double term5041 = new Double(0.8878841294187743);
        Integer term5044 = new Integer(1265463001);
        term4971 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4973 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4974 = (int[]) newIntArray(5);
        int[] term4980 = (int[]) newIntArray(9);
        boolean[] term4991 = (boolean[]) newBooleanArray(3);
        double[] term4995 = (double[]) newDoubleArray(5);
        Object term5001 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term5002 = (int[]) newIntArray(0);
        Object term5005 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5006 = (long[]) newLongArray(1);
        Object term5010 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5011 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5032 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5033 = (int[]) newIntArray(0);
        int[] term5034 = (int[]) newIntArray(6);
        Object term5043 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4971, term4971.getClass(), "ignoreWeights", false);
        setField(term4971, term4971.getClass(), "workGraph", null);
        setField(term4973, term4973.getClass(), "graph", null);
        setField(term4973, term4973.getClass(), "comparator", null);
        setIntElement(term4974, 0, 1155135931);
        setIntElement(term4974, 1, -636910567);
        setIntElement(term4974, 2, 1896114203);
        setIntElement(term4974, 3, 1045745470);
        setIntElement(term4974, 4, 892741901);
        setField(term4973, term4973.getClass(), "keys", term4974);
        setIntElement(term4980, 0, -1724900201);
        setIntElement(term4980, 1, -758523003);
        setIntElement(term4980, 2, 1567184195);
        setIntElement(term4980, 3, 63595623);
        setIntElement(term4980, 4, 1764150991);
        setIntElement(term4980, 5, 944653455);
        setIntElement(term4980, 6, -1819474400);
        setIntElement(term4980, 7, 783684648);
        setIntElement(term4980, 8, 553754005);
        setField(term4973, term4973.getClass(), "positions", term4980);
        setIntField(term4973, term4973.getClass(), "size", 1986699236);
        setField(term4971, term4971.getClass(), "maxHeap", term4973);
        setBooleanElement(term4991, 2, true);
        setField(term4971, term4971.getClass(), "processed", term4991);
        setDoubleElement(term4995, 0, 0.0027299293098262956);
        setDoubleElement(term4995, 1, 0.29874017652881824);
        setDoubleElement(term4995, 2, 0.32554480512985284);
        setDoubleElement(term4995, 3, 0.8924855581421237);
        setDoubleElement(term4995, 4, 0.32237559209193944);
        setField(term4971, term4971.getClass(), "weight", term4995);
        setField(term5001, term5001.getClass(), "graph", null);
        setField(term5001, term5001.getClass(), "vertices", term5002);
        setIntField(term5001, term5001.getClass(), "numVertices", -1729178560);
        setIntField(term5001, term5001.getClass(), "first", 874974171);
        setField(term5005, term5005.getClass(), "words", term5006);
        setIntField(term5005, term5005.getClass(), "wordsInUse", -1689017763);
        setBooleanField(term5005, term5005.getClass(), "sizeIsSticky", true);
        setField(term5001, term5001.getClass(), "bitset", term5005);
        setField(term4971, term4971.getClass(), "ordering", term5001);
        setField(term5010, term5010.getClass(), "table", term5011);
        setIntField(term5010, term5010.getClass(), "count", 1657387281);
        setIntField(term5010, term5010.getClass(), "threshold", 15);
        setFloatField(term5010, term5010.getClass(), "loadFactor", 0.75F);
        setField(term4971, term4971.getClass(), "orderingIndex", term5010);
        setField(term4971, term4971.getClass(), "vertexMap", term5015);
        setField(term4971, term4971.getClass(), "minWeight", term5028);
        setField(term4971, term4971.getClass(), "minCutVertex", term5030);
        setField(term5032, term5032.getClass(), "graph", null);
        setField(term5032, term5032.getClass(), "leftSide", term5033);
        setIntElement(term5034, 0, -1967315273);
        setIntElement(term5034, 1, -1848110874);
        setIntElement(term5034, 2, -1988070462);
        setIntElement(term5034, 3, 323423569);
        setIntElement(term5034, 4, -274269573);
        setIntElement(term5034, 5, 1395520168);
        setField(term5032, term5032.getClass(), "rightSide", term5034);
        setField(term5032, term5032.getClass(), "weight", term5041);
        setField(term5043, term5043.getClass(), "graph", null);
        setField(term5043, term5043.getClass(), "map", null);
        setField(term5032, term5032.getClass(), "edges", term5043);
        setField(term4971, term4971.getClass(), "minCut", term5032);
        setField(term4971, term4971.getClass(), "newVertex", term5044);
        setField(term4971, term4971.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term4971, args);
    }

};


