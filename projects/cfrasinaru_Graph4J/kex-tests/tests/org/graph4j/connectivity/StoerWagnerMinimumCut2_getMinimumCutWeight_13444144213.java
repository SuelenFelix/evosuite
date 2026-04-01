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

public class StoerWagnerMinimumCut2_getMinimumCutWeight_13444144213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4319;

    public StoerWagnerMinimumCut2_getMinimumCutWeight_13444144213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4371 = new HashMap();
        Double term4384 = new Double(0.10667076642995188);
        Integer term4386 = new Integer(-1048298087);
        Double term4401 = new Double(0.11493000848982304);
        Integer term4404 = new Integer(292681826);
        term4319 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4321 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4322 = (int[]) newIntArray(7);
        int[] term4330 = (int[]) newIntArray(9);
        boolean[] term4341 = (boolean[]) newBooleanArray(2);
        double[] term4344 = (double[]) newDoubleArray(3);
        Object term4348 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4349 = (int[]) newIntArray(9);
        Object term4361 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4362 = (long[]) newLongArray(1);
        Object term4366 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4367 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4388 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4389 = (int[]) newIntArray(5);
        int[] term4395 = (int[]) newIntArray(5);
        Object term4403 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4319, term4319.getClass(), "ignoreWeights", true);
        setField(term4319, term4319.getClass(), "workGraph", null);
        setField(term4321, term4321.getClass(), "graph", null);
        setField(term4321, term4321.getClass(), "comparator", null);
        setIntElement(term4322, 0, -935912608);
        setIntElement(term4322, 1, 505087197);
        setIntElement(term4322, 2, 427005798);
        setIntElement(term4322, 3, -993454505);
        setIntElement(term4322, 4, -238353821);
        setIntElement(term4322, 5, -818992228);
        setIntElement(term4322, 6, 2087429143);
        setField(term4321, term4321.getClass(), "keys", term4322);
        setIntElement(term4330, 0, -1892890104);
        setIntElement(term4330, 1, 2003356558);
        setIntElement(term4330, 2, -638126185);
        setIntElement(term4330, 3, 28070985);
        setIntElement(term4330, 4, 334110739);
        setIntElement(term4330, 5, -1724529322);
        setIntElement(term4330, 6, 1843465187);
        setIntElement(term4330, 7, 529595969);
        setIntElement(term4330, 8, -1548733886);
        setField(term4321, term4321.getClass(), "positions", term4330);
        setIntField(term4321, term4321.getClass(), "size", 1543539715);
        setField(term4319, term4319.getClass(), "maxHeap", term4321);
        setBooleanElement(term4341, 0, true);
        setField(term4319, term4319.getClass(), "processed", term4341);
        setDoubleElement(term4344, 0, 0.15917839663695388);
        setDoubleElement(term4344, 1, 0.9374115574082594);
        setDoubleElement(term4344, 2, 0.8454723071922143);
        setField(term4319, term4319.getClass(), "weight", term4344);
        setField(term4348, term4348.getClass(), "graph", null);
        setIntElement(term4349, 0, 1744599521);
        setIntElement(term4349, 1, -985141153);
        setIntElement(term4349, 2, -1983740361);
        setIntElement(term4349, 3, -1494716341);
        setIntElement(term4349, 4, 816237851);
        setIntElement(term4349, 5, -604114341);
        setIntElement(term4349, 6, 1146236760);
        setIntElement(term4349, 7, 985801789);
        setIntElement(term4349, 8, -1628536749);
        setField(term4348, term4348.getClass(), "vertices", term4349);
        setIntField(term4348, term4348.getClass(), "numVertices", -748022064);
        setIntField(term4348, term4348.getClass(), "first", -1745708025);
        setField(term4361, term4361.getClass(), "words", term4362);
        setIntField(term4361, term4361.getClass(), "wordsInUse", 790614624);
        setBooleanField(term4361, term4361.getClass(), "sizeIsSticky", true);
        setField(term4348, term4348.getClass(), "bitset", term4361);
        setField(term4319, term4319.getClass(), "ordering", term4348);
        setField(term4366, term4366.getClass(), "table", term4367);
        setIntField(term4366, term4366.getClass(), "count", 117387225);
        setIntField(term4366, term4366.getClass(), "threshold", 15);
        setFloatField(term4366, term4366.getClass(), "loadFactor", 0.75F);
        setField(term4319, term4319.getClass(), "orderingIndex", term4366);
        setField(term4319, term4319.getClass(), "vertexMap", term4371);
        setField(term4319, term4319.getClass(), "minWeight", term4384);
        setField(term4319, term4319.getClass(), "minCutVertex", term4386);
        setField(term4388, term4388.getClass(), "graph", null);
        setIntElement(term4389, 0, 234306621);
        setIntElement(term4389, 1, 1025525602);
        setIntElement(term4389, 2, 1669406334);
        setIntElement(term4389, 3, -780862464);
        setIntElement(term4389, 4, 2014099129);
        setField(term4388, term4388.getClass(), "leftSide", term4389);
        setIntElement(term4395, 0, -1024382698);
        setIntElement(term4395, 1, -168406824);
        setIntElement(term4395, 2, 2063577636);
        setIntElement(term4395, 3, 1680632578);
        setIntElement(term4395, 4, 511399994);
        setField(term4388, term4388.getClass(), "rightSide", term4395);
        setField(term4388, term4388.getClass(), "weight", term4401);
        setField(term4403, term4403.getClass(), "graph", null);
        setField(term4403, term4403.getClass(), "map", null);
        setField(term4388, term4388.getClass(), "edges", term4403);
        setField(term4319, term4319.getClass(), "minCut", term4388);
        setField(term4319, term4319.getClass(), "newVertex", term4404);
        setField(term4319, term4319.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCutWeight", argTypes, term4319, args);
    }

};


