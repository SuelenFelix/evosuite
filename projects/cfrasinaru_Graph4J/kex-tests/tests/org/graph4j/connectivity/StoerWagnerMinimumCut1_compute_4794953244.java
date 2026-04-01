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

public class StoerWagnerMinimumCut1_compute_4794953244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5293;

    public StoerWagnerMinimumCut1_compute_4794953244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5332 = new HashMap();
        Double term5345 = new Double(0.8823181080774973);
        Integer term5347 = new Integer(1655935355);
        Double term5367 = new Double(0.2192450926212024);
        Integer term5370 = new Integer(-481533957);
        term5293 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5295 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5296 = (int[]) newIntArray(2);
        int[] term5299 = (int[]) newIntArray(6);
        boolean[] term5307 = (boolean[]) newBooleanArray(2);
        double[] term5310 = (double[]) newDoubleArray(8);
        int[] term5319 = (int[]) newIntArray(7);
        Object term5327 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5328 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5349 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5350 = (int[]) newIntArray(7);
        int[] term5358 = (int[]) newIntArray(8);
        Object term5369 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5293, term5293.getClass(), "ignoreWeights", true);
        setField(term5293, term5293.getClass(), "workGraph", null);
        setField(term5295, term5295.getClass(), "graph", null);
        setField(term5295, term5295.getClass(), "comparator", null);
        setIntElement(term5296, 0, -815684619);
        setIntElement(term5296, 1, -471499395);
        setField(term5295, term5295.getClass(), "keys", term5296);
        setIntElement(term5299, 0, -663671886);
        setIntElement(term5299, 1, -1295577968);
        setIntElement(term5299, 2, 1006574741);
        setIntElement(term5299, 3, -1471698394);
        setIntElement(term5299, 4, 1146444085);
        setIntElement(term5299, 5, 316145449);
        setField(term5295, term5295.getClass(), "positions", term5299);
        setIntField(term5295, term5295.getClass(), "size", 387128751);
        setField(term5293, term5293.getClass(), "maxHeap", term5295);
        setBooleanElement(term5307, 1, true);
        setField(term5293, term5293.getClass(), "processed", term5307);
        setDoubleElement(term5310, 0, 0.16988691727397487);
        setDoubleElement(term5310, 1, 0.39286935532362843);
        setDoubleElement(term5310, 2, 0.11577948268926874);
        setDoubleElement(term5310, 3, 0.5617009352394552);
        setDoubleElement(term5310, 4, 0.09067063848644474);
        setDoubleElement(term5310, 5, 0.268304014379393);
        setDoubleElement(term5310, 6, 0.7171972879282721);
        setDoubleElement(term5310, 7, 0.9006361024877096);
        setField(term5293, term5293.getClass(), "weight", term5310);
        setIntElement(term5319, 0, 1220621259);
        setIntElement(term5319, 1, 272507740);
        setIntElement(term5319, 2, -2117539025);
        setIntElement(term5319, 3, 736842788);
        setIntElement(term5319, 4, 416550042);
        setIntElement(term5319, 5, 1745727714);
        setIntElement(term5319, 6, -1577886337);
        setField(term5293, term5293.getClass(), "ordering", term5319);
        setField(term5327, term5327.getClass(), "table", term5328);
        setIntField(term5327, term5327.getClass(), "count", -481394578);
        setIntField(term5327, term5327.getClass(), "threshold", 15);
        setFloatField(term5327, term5327.getClass(), "loadFactor", 0.75F);
        setField(term5293, term5293.getClass(), "orderingIndex", term5327);
        setField(term5293, term5293.getClass(), "vertexMap", term5332);
        setField(term5293, term5293.getClass(), "minWeight", term5345);
        setField(term5293, term5293.getClass(), "minCutVertex", term5347);
        setField(term5349, term5349.getClass(), "graph", null);
        setIntElement(term5350, 0, 903039854);
        setIntElement(term5350, 1, -705528573);
        setIntElement(term5350, 2, -480070896);
        setIntElement(term5350, 3, -1811732249);
        setIntElement(term5350, 4, 1993504802);
        setIntElement(term5350, 5, 526852618);
        setIntElement(term5350, 6, 903788782);
        setField(term5349, term5349.getClass(), "leftSide", term5350);
        setIntElement(term5358, 0, -608033702);
        setIntElement(term5358, 1, 1118825073);
        setIntElement(term5358, 2, 751108197);
        setIntElement(term5358, 3, -1810066487);
        setIntElement(term5358, 4, 12697707);
        setIntElement(term5358, 5, -971143668);
        setIntElement(term5358, 6, 127763053);
        setIntElement(term5358, 7, 968035207);
        setField(term5349, term5349.getClass(), "rightSide", term5358);
        setField(term5349, term5349.getClass(), "weight", term5367);
        setField(term5369, term5369.getClass(), "graph", null);
        setField(term5369, term5369.getClass(), "map", null);
        setField(term5349, term5349.getClass(), "edges", term5369);
        setField(term5293, term5293.getClass(), "minCut", term5349);
        setField(term5293, term5293.getClass(), "newVertex", term5370);
        setField(term5293, term5293.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term5293, args);
    }

};


