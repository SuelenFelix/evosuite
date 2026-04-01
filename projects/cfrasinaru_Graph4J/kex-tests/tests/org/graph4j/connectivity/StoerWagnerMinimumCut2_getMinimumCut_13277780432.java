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

public class StoerWagnerMinimumCut2_getMinimumCut_13277780432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4197;

    public StoerWagnerMinimumCut2_getMinimumCut_13277780432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4241 = new HashMap();
        Double term4254 = new Double(0.5840714198152577);
        Integer term4256 = new Integer(454281060);
        Double term4276 = new Double(0.7559240768573477);
        Integer term4279 = new Integer(-1786399638);
        term4197 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4199 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4200 = (int[]) newIntArray(6);
        int[] term4207 = (int[]) newIntArray(8);
        boolean[] term4217 = (boolean[]) newBooleanArray(4);
        double[] term4222 = (double[]) newDoubleArray(0);
        Object term4223 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4224 = (int[]) newIntArray(4);
        Object term4231 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4232 = (long[]) newLongArray(1);
        Object term4236 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4237 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4258 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4259 = (int[]) newIntArray(8);
        int[] term4268 = (int[]) newIntArray(7);
        Object term4278 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4197, term4197.getClass(), "ignoreWeights", false);
        setField(term4197, term4197.getClass(), "workGraph", null);
        setField(term4199, term4199.getClass(), "graph", null);
        setField(term4199, term4199.getClass(), "comparator", null);
        setIntElement(term4200, 0, 673153263);
        setIntElement(term4200, 1, -1355715967);
        setIntElement(term4200, 2, -972516789);
        setIntElement(term4200, 3, 720077443);
        setIntElement(term4200, 4, -884523977);
        setIntElement(term4200, 5, -1396233580);
        setField(term4199, term4199.getClass(), "keys", term4200);
        setIntElement(term4207, 0, -654234892);
        setIntElement(term4207, 1, -50930731);
        setIntElement(term4207, 2, -1067876039);
        setIntElement(term4207, 3, -1143749623);
        setIntElement(term4207, 4, 1961561878);
        setIntElement(term4207, 5, 1235809050);
        setIntElement(term4207, 6, 1370082921);
        setIntElement(term4207, 7, 1966881264);
        setField(term4199, term4199.getClass(), "positions", term4207);
        setIntField(term4199, term4199.getClass(), "size", -1707655562);
        setField(term4197, term4197.getClass(), "maxHeap", term4199);
        setField(term4197, term4197.getClass(), "processed", term4217);
        setField(term4197, term4197.getClass(), "weight", term4222);
        setField(term4223, term4223.getClass(), "graph", null);
        setIntElement(term4224, 0, 1525815085);
        setIntElement(term4224, 1, 1785476260);
        setIntElement(term4224, 2, -655035002);
        setIntElement(term4224, 3, 1841475189);
        setField(term4223, term4223.getClass(), "vertices", term4224);
        setIntField(term4223, term4223.getClass(), "numVertices", -456566581);
        setIntField(term4223, term4223.getClass(), "first", 2114761003);
        setField(term4231, term4231.getClass(), "words", term4232);
        setIntField(term4231, term4231.getClass(), "wordsInUse", -1128091158);
        setBooleanField(term4231, term4231.getClass(), "sizeIsSticky", false);
        setField(term4223, term4223.getClass(), "bitset", term4231);
        setField(term4197, term4197.getClass(), "ordering", term4223);
        setField(term4236, term4236.getClass(), "table", term4237);
        setIntField(term4236, term4236.getClass(), "count", 380526008);
        setIntField(term4236, term4236.getClass(), "threshold", 15);
        setFloatField(term4236, term4236.getClass(), "loadFactor", 0.75F);
        setField(term4197, term4197.getClass(), "orderingIndex", term4236);
        setField(term4197, term4197.getClass(), "vertexMap", term4241);
        setField(term4197, term4197.getClass(), "minWeight", term4254);
        setField(term4197, term4197.getClass(), "minCutVertex", term4256);
        setField(term4258, term4258.getClass(), "graph", null);
        setIntElement(term4259, 0, -371717995);
        setIntElement(term4259, 1, 1713005479);
        setIntElement(term4259, 2, -1948910444);
        setIntElement(term4259, 3, -1099061955);
        setIntElement(term4259, 4, -1672904007);
        setIntElement(term4259, 5, -217232010);
        setIntElement(term4259, 6, 2053372601);
        setIntElement(term4259, 7, -1828855069);
        setField(term4258, term4258.getClass(), "leftSide", term4259);
        setIntElement(term4268, 0, -1213694931);
        setIntElement(term4268, 1, -1255656944);
        setIntElement(term4268, 2, -377697034);
        setIntElement(term4268, 3, 1102778743);
        setIntElement(term4268, 4, 1300928519);
        setIntElement(term4268, 5, 338172676);
        setIntElement(term4268, 6, -1896960942);
        setField(term4258, term4258.getClass(), "rightSide", term4268);
        setField(term4258, term4258.getClass(), "weight", term4276);
        setField(term4278, term4278.getClass(), "graph", null);
        setField(term4278, term4278.getClass(), "map", null);
        setField(term4258, term4258.getClass(), "edges", term4278);
        setField(term4197, term4197.getClass(), "minCut", term4258);
        setField(term4197, term4197.getClass(), "newVertex", term4279);
        setField(term4197, term4197.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term4197, args);
    }

};


