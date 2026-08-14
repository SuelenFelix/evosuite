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

public class StoerWagnerMinimumCut1_getMinimumCutWeight_13444144523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5188;

    public StoerWagnerMinimumCut1_getMinimumCutWeight_13444144523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5229 = new HashMap();
        Double term5242 = new Double(0.25937345430928016);
        Integer term5244 = new Integer(1375330971);
        Double term5255 = new Double(0.5873228247510078);
        Integer term5258 = new Integer(-478195677);
        term5188 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5190 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5191 = (int[]) newIntArray(4);
        int[] term5196 = (int[]) newIntArray(9);
        boolean[] term5207 = (boolean[]) newBooleanArray(4);
        double[] term5212 = (double[]) newDoubleArray(6);
        int[] term5219 = (int[]) newIntArray(4);
        Object term5224 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5225 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5246 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5247 = (int[]) newIntArray(0);
        int[] term5248 = (int[]) newIntArray(6);
        Object term5257 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5188, term5188.getClass(), "ignoreWeights", true);
        setField(term5188, term5188.getClass(), "workGraph", null);
        setField(term5190, term5190.getClass(), "graph", null);
        setField(term5190, term5190.getClass(), "comparator", null);
        setIntElement(term5191, 0, -1299897376);
        setIntElement(term5191, 1, 1829266361);
        setIntElement(term5191, 2, -1296335739);
        setIntElement(term5191, 3, -520737857);
        setField(term5190, term5190.getClass(), "keys", term5191);
        setIntElement(term5196, 0, -2038325814);
        setIntElement(term5196, 1, -581928806);
        setIntElement(term5196, 2, -1387086578);
        setIntElement(term5196, 3, -2098841130);
        setIntElement(term5196, 4, 65321166);
        setIntElement(term5196, 5, -2114805689);
        setIntElement(term5196, 6, 400772784);
        setIntElement(term5196, 7, 46781158);
        setIntElement(term5196, 8, -1987966813);
        setField(term5190, term5190.getClass(), "positions", term5196);
        setIntField(term5190, term5190.getClass(), "size", 1778126559);
        setField(term5188, term5188.getClass(), "maxHeap", term5190);
        setBooleanElement(term5207, 0, true);
        setBooleanElement(term5207, 1, true);
        setBooleanElement(term5207, 2, true);
        setBooleanElement(term5207, 3, true);
        setField(term5188, term5188.getClass(), "processed", term5207);
        setDoubleElement(term5212, 0, 0.5187846213101265);
        setDoubleElement(term5212, 1, 0.045893173090043815);
        setDoubleElement(term5212, 2, 0.3626177854778667);
        setDoubleElement(term5212, 3, 0.3163771663728089);
        setDoubleElement(term5212, 4, 0.8819646072665548);
        setDoubleElement(term5212, 5, 0.5412182593116958);
        setField(term5188, term5188.getClass(), "weight", term5212);
        setIntElement(term5219, 0, -1557828355);
        setIntElement(term5219, 1, 546963992);
        setIntElement(term5219, 2, 1377120507);
        setIntElement(term5219, 3, -1581022727);
        setField(term5188, term5188.getClass(), "ordering", term5219);
        setField(term5224, term5224.getClass(), "table", term5225);
        setIntField(term5224, term5224.getClass(), "count", -371740139);
        setIntField(term5224, term5224.getClass(), "threshold", 15);
        setFloatField(term5224, term5224.getClass(), "loadFactor", 0.75F);
        setField(term5188, term5188.getClass(), "orderingIndex", term5224);
        setField(term5188, term5188.getClass(), "vertexMap", term5229);
        setField(term5188, term5188.getClass(), "minWeight", term5242);
        setField(term5188, term5188.getClass(), "minCutVertex", term5244);
        setField(term5246, term5246.getClass(), "graph", null);
        setField(term5246, term5246.getClass(), "leftSide", term5247);
        setIntElement(term5248, 0, 1243129119);
        setIntElement(term5248, 1, 346014220);
        setIntElement(term5248, 2, 1379438950);
        setIntElement(term5248, 3, 1932258686);
        setIntElement(term5248, 4, -261366507);
        setIntElement(term5248, 5, 1015444772);
        setField(term5246, term5246.getClass(), "rightSide", term5248);
        setField(term5246, term5246.getClass(), "weight", term5255);
        setField(term5257, term5257.getClass(), "graph", null);
        setField(term5257, term5257.getClass(), "map", null);
        setField(term5246, term5246.getClass(), "edges", term5257);
        setField(term5188, term5188.getClass(), "minCut", term5246);
        setField(term5188, term5188.getClass(), "newVertex", term5258);
        setField(term5188, term5188.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCutWeight", argTypes, term5188, args);
    }

};


