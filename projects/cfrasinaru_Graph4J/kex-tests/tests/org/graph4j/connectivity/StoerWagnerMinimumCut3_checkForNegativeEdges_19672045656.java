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

public class StoerWagnerMinimumCut3_checkForNegativeEdges_19672045656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4106;

    public StoerWagnerMinimumCut3_checkForNegativeEdges_19672045656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4135 = new HashMap();
        Double term4148 = new Double(0.13481025392611334);
        Integer term4150 = new Integer(-14890619);
        Double term4155 = new Double(0.3800088629986428);
        term4106 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        Object term4108 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4109 = (int[]) newIntArray(7);
        int[] term4117 = (int[]) newIntArray(6);
        boolean[] term4125 = (boolean[]) newBooleanArray(5);
        double[] term4131 = (double[]) newDoubleArray(2);
        Object term4152 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4153 = (int[]) newIntArray(0);
        int[] term4154 = (int[]) newIntArray(0);
        Object term4157 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4106, term4106.getClass(), "ignoreWeights", false);
        setField(term4106, term4106.getClass(), "workGraph", null);
        setField(term4108, term4108.getClass(), "graph", null);
        setField(term4108, term4108.getClass(), "comparator", null);
        setIntElement(term4109, 0, 629005618);
        setIntElement(term4109, 1, -2006508013);
        setIntElement(term4109, 2, 974951631);
        setIntElement(term4109, 3, -942202284);
        setIntElement(term4109, 4, -2083254556);
        setIntElement(term4109, 5, 1452346261);
        setIntElement(term4109, 6, -548776693);
        setField(term4108, term4108.getClass(), "keys", term4109);
        setIntElement(term4117, 0, 99032275);
        setIntElement(term4117, 1, 794098686);
        setIntElement(term4117, 2, -1671524013);
        setIntElement(term4117, 3, -438794741);
        setIntElement(term4117, 4, -1400834481);
        setIntElement(term4117, 5, 957091706);
        setField(term4108, term4108.getClass(), "positions", term4117);
        setIntField(term4108, term4108.getClass(), "size", -2011802805);
        setField(term4106, term4106.getClass(), "maxHeap", term4108);
        setBooleanElement(term4125, 0, true);
        setBooleanElement(term4125, 3, true);
        setField(term4106, term4106.getClass(), "processed", term4125);
        setDoubleElement(term4131, 0, 0.791695029600875);
        setDoubleElement(term4131, 1, 0.6862221294683138);
        setField(term4106, term4106.getClass(), "weight", term4131);
        setIntField(term4106, term4106.getClass(), "startId", -1683802689);
        setField(term4106, term4106.getClass(), "map", term4135);
        setField(term4106, term4106.getClass(), "minWeight", term4148);
        setField(term4106, term4106.getClass(), "minCutVertex", term4150);
        setField(term4152, term4152.getClass(), "graph", null);
        setField(term4152, term4152.getClass(), "leftSide", term4153);
        setField(term4152, term4152.getClass(), "rightSide", term4154);
        setField(term4152, term4152.getClass(), "weight", term4155);
        setField(term4157, term4157.getClass(), "graph", null);
        setField(term4157, term4157.getClass(), "map", null);
        setField(term4152, term4152.getClass(), "edges", term4157);
        setField(term4106, term4106.getClass(), "minCut", term4152);
        setField(term4106, term4106.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term4106, args);
    }

};


