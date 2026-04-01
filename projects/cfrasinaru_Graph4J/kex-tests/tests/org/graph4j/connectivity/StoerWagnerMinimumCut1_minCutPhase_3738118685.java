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

public class StoerWagnerMinimumCut1_minCutPhase_3738118685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5412;

    public StoerWagnerMinimumCut1_minCutPhase_3738118685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5451 = new HashMap();
        Double term5464 = new Double(0.7591353014991907);
        Integer term5466 = new Integer(-1465035361);
        Double term5476 = new Double(0.791695029600875);
        Integer term5479 = new Integer(1090617576);
        term5412 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5414 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5415 = (int[]) newIntArray(9);
        int[] term5425 = (int[]) newIntArray(6);
        boolean[] term5433 = (boolean[]) newBooleanArray(3);
        double[] term5437 = (double[]) newDoubleArray(3);
        int[] term5441 = (int[]) newIntArray(4);
        Object term5446 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5447 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5468 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5469 = (int[]) newIntArray(4);
        int[] term5474 = (int[]) newIntArray(1);
        Object term5478 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5412, term5412.getClass(), "ignoreWeights", false);
        setField(term5412, term5412.getClass(), "workGraph", null);
        setField(term5414, term5414.getClass(), "graph", null);
        setField(term5414, term5414.getClass(), "comparator", null);
        setIntElement(term5415, 0, -643589717);
        setIntElement(term5415, 1, -1599482698);
        setIntElement(term5415, 2, -370600915);
        setIntElement(term5415, 3, -311572875);
        setIntElement(term5415, 4, 355595594);
        setIntElement(term5415, 5, 842697786);
        setIntElement(term5415, 6, 1685808201);
        setIntElement(term5415, 7, 1565114969);
        setIntElement(term5415, 8, 806831765);
        setField(term5414, term5414.getClass(), "keys", term5415);
        setIntElement(term5425, 0, -1445658721);
        setIntElement(term5425, 1, 872435483);
        setIntElement(term5425, 2, 110611143);
        setIntElement(term5425, 3, 793381056);
        setIntElement(term5425, 4, 65007514);
        setIntElement(term5425, 5, 1731844126);
        setField(term5414, term5414.getClass(), "positions", term5425);
        setIntField(term5414, term5414.getClass(), "size", -861962061);
        setField(term5412, term5412.getClass(), "maxHeap", term5414);
        setBooleanElement(term5433, 0, true);
        setBooleanElement(term5433, 2, true);
        setField(term5412, term5412.getClass(), "processed", term5433);
        setDoubleElement(term5437, 0, 0.5644914462415626);
        setDoubleElement(term5437, 1, 0.509895859167191);
        setDoubleElement(term5437, 2, 0.07417792024383196);
        setField(term5412, term5412.getClass(), "weight", term5437);
        setIntElement(term5441, 0, -1867124507);
        setIntElement(term5441, 1, 416116291);
        setIntElement(term5441, 2, 1104795023);
        setIntElement(term5441, 3, -1833777337);
        setField(term5412, term5412.getClass(), "ordering", term5441);
        setField(term5446, term5446.getClass(), "table", term5447);
        setIntField(term5446, term5446.getClass(), "count", -2068333492);
        setIntField(term5446, term5446.getClass(), "threshold", 15);
        setFloatField(term5446, term5446.getClass(), "loadFactor", 0.75F);
        setField(term5412, term5412.getClass(), "orderingIndex", term5446);
        setField(term5412, term5412.getClass(), "vertexMap", term5451);
        setField(term5412, term5412.getClass(), "minWeight", term5464);
        setField(term5412, term5412.getClass(), "minCutVertex", term5466);
        setField(term5468, term5468.getClass(), "graph", null);
        setIntElement(term5469, 0, -3085808);
        setIntElement(term5469, 1, 1975783377);
        setIntElement(term5469, 2, -665938382);
        setIntElement(term5469, 3, 325391588);
        setField(term5468, term5468.getClass(), "leftSide", term5469);
        setIntElement(term5474, 0, 1443046313);
        setField(term5468, term5468.getClass(), "rightSide", term5474);
        setField(term5468, term5468.getClass(), "weight", term5476);
        setField(term5478, term5478.getClass(), "graph", null);
        setField(term5478, term5478.getClass(), "map", null);
        setField(term5468, term5468.getClass(), "edges", term5478);
        setField(term5412, term5412.getClass(), "minCut", term5468);
        setField(term5412, term5412.getClass(), "newVertex", term5479);
        setField(term5412, term5412.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minCutPhase", argTypes, term5412, args);
    }

};


