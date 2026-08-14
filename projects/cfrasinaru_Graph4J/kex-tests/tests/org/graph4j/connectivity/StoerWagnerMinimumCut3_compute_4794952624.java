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

public class StoerWagnerMinimumCut3_compute_4794952624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3904;

    public StoerWagnerMinimumCut3_compute_4794952624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3940 = new HashMap();
        Double term3953 = new Double(0.4569171842750229);
        Integer term3955 = new Integer(-817164822);
        Double term3967 = new Double(0.8598297828918529);
        term3904 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        Object term3906 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3907 = (int[]) newIntArray(9);
        int[] term3917 = (int[]) newIntArray(2);
        boolean[] term3921 = (boolean[]) newBooleanArray(9);
        double[] term3931 = (double[]) newDoubleArray(7);
        Object term3957 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term3958 = (int[]) newIntArray(0);
        int[] term3959 = (int[]) newIntArray(7);
        Object term3969 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term3904, term3904.getClass(), "ignoreWeights", true);
        setField(term3904, term3904.getClass(), "workGraph", null);
        setField(term3906, term3906.getClass(), "graph", null);
        setField(term3906, term3906.getClass(), "comparator", null);
        setIntElement(term3907, 0, -961137606);
        setIntElement(term3907, 1, 795205527);
        setIntElement(term3907, 2, 600958607);
        setIntElement(term3907, 3, 897159778);
        setIntElement(term3907, 4, -1934934961);
        setIntElement(term3907, 5, 2120054887);
        setIntElement(term3907, 6, 2145648967);
        setIntElement(term3907, 7, 2060624021);
        setIntElement(term3907, 8, -1853309523);
        setField(term3906, term3906.getClass(), "keys", term3907);
        setIntElement(term3917, 0, 241741655);
        setIntElement(term3917, 1, -1062022366);
        setField(term3906, term3906.getClass(), "positions", term3917);
        setIntField(term3906, term3906.getClass(), "size", -1347618079);
        setField(term3904, term3904.getClass(), "maxHeap", term3906);
        setBooleanElement(term3921, 2, true);
        setBooleanElement(term3921, 4, true);
        setBooleanElement(term3921, 5, true);
        setBooleanElement(term3921, 6, true);
        setBooleanElement(term3921, 8, true);
        setField(term3904, term3904.getClass(), "processed", term3921);
        setDoubleElement(term3931, 0, 0.9737083944266686);
        setDoubleElement(term3931, 1, 0.0668892744806211);
        setDoubleElement(term3931, 2, 0.3587267442738795);
        setDoubleElement(term3931, 3, 0.07802449704920456);
        setDoubleElement(term3931, 4, 0.5279279537140873);
        setDoubleElement(term3931, 5, 0.3202192021706908);
        setDoubleElement(term3931, 6, 0.22651340641904605);
        setField(term3904, term3904.getClass(), "weight", term3931);
        setIntField(term3904, term3904.getClass(), "startId", 1510246255);
        setField(term3904, term3904.getClass(), "map", term3940);
        setField(term3904, term3904.getClass(), "minWeight", term3953);
        setField(term3904, term3904.getClass(), "minCutVertex", term3955);
        setField(term3957, term3957.getClass(), "graph", null);
        setField(term3957, term3957.getClass(), "leftSide", term3958);
        setIntElement(term3959, 0, 1075321384);
        setIntElement(term3959, 1, -1726073541);
        setIntElement(term3959, 2, 406945977);
        setIntElement(term3959, 3, 493657684);
        setIntElement(term3959, 4, 1882655922);
        setIntElement(term3959, 5, 1314996390);
        setIntElement(term3959, 6, 1367703658);
        setField(term3957, term3957.getClass(), "rightSide", term3959);
        setField(term3957, term3957.getClass(), "weight", term3967);
        setField(term3969, term3969.getClass(), "graph", null);
        setField(term3969, term3969.getClass(), "map", null);
        setField(term3957, term3957.getClass(), "edges", term3969);
        setField(term3904, term3904.getClass(), "minCut", term3957);
        setField(term3904, term3904.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term3904, args);
    }

};


