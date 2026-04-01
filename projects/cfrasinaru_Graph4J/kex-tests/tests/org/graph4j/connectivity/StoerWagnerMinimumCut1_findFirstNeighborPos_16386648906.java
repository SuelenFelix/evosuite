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

public class StoerWagnerMinimumCut1_findFirstNeighborPos_16386648906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5511;
     Object term5586;

    public StoerWagnerMinimumCut1_findFirstNeighborPos_16386648906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5556 = new HashMap();
        Double term5569 = new Double(0.6862221294683138);
        Integer term5571 = new Integer(1442160736);
        Double term5581 = new Double(0.15917839663695388);
        Integer term5584 = new Integer(1114000454);
        term5511 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5513 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5514 = (int[]) newIntArray(8);
        int[] term5523 = (int[]) newIntArray(6);
        boolean[] term5531 = (boolean[]) newBooleanArray(8);
        double[] term5540 = (double[]) newDoubleArray(6);
        int[] term5547 = (int[]) newIntArray(3);
        Object term5551 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5552 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5573 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5574 = (int[]) newIntArray(1);
        int[] term5576 = (int[]) newIntArray(4);
        Object term5583 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5511, term5511.getClass(), "ignoreWeights", false);
        setField(term5511, term5511.getClass(), "workGraph", null);
        setField(term5513, term5513.getClass(), "graph", null);
        setField(term5513, term5513.getClass(), "comparator", null);
        setIntElement(term5514, 0, 1055117337);
        setIntElement(term5514, 1, -705616896);
        setIntElement(term5514, 2, 1057965724);
        setIntElement(term5514, 3, 2134707657);
        setIntElement(term5514, 4, -357630956);
        setIntElement(term5514, 5, -1068878345);
        setIntElement(term5514, 6, 1386128235);
        setIntElement(term5514, 7, -1047109164);
        setField(term5513, term5513.getClass(), "keys", term5514);
        setIntElement(term5523, 0, -1650626012);
        setIntElement(term5523, 1, -2045231879);
        setIntElement(term5523, 2, 1678025090);
        setIntElement(term5523, 3, 714453255);
        setIntElement(term5523, 4, 2096762388);
        setIntElement(term5523, 5, -1646872343);
        setField(term5513, term5513.getClass(), "positions", term5523);
        setIntField(term5513, term5513.getClass(), "size", -140841633);
        setField(term5511, term5511.getClass(), "maxHeap", term5513);
        setBooleanElement(term5531, 1, true);
        setBooleanElement(term5531, 2, true);
        setBooleanElement(term5531, 4, true);
        setBooleanElement(term5531, 5, true);
        setBooleanElement(term5531, 7, true);
        setField(term5511, term5511.getClass(), "processed", term5531);
        setDoubleElement(term5540, 0, 0.686293604788188);
        setDoubleElement(term5540, 1, 0.12764449157430724);
        setDoubleElement(term5540, 2, 0.39446728256884744);
        setDoubleElement(term5540, 3, 0.7865909711092062);
        setDoubleElement(term5540, 4, 0.06587158449170749);
        setDoubleElement(term5540, 5, 0.0865998004187658);
        setField(term5511, term5511.getClass(), "weight", term5540);
        setIntElement(term5547, 0, 1970986976);
        setIntElement(term5547, 1, 530909877);
        setIntElement(term5547, 2, -123945804);
        setField(term5511, term5511.getClass(), "ordering", term5547);
        setField(term5551, term5551.getClass(), "table", term5552);
        setIntField(term5551, term5551.getClass(), "count", 2133669766);
        setIntField(term5551, term5551.getClass(), "threshold", 15);
        setFloatField(term5551, term5551.getClass(), "loadFactor", 0.75F);
        setField(term5511, term5511.getClass(), "orderingIndex", term5551);
        setField(term5511, term5511.getClass(), "vertexMap", term5556);
        setField(term5511, term5511.getClass(), "minWeight", term5569);
        setField(term5511, term5511.getClass(), "minCutVertex", term5571);
        setField(term5573, term5573.getClass(), "graph", null);
        setIntElement(term5574, 0, -785719854);
        setField(term5573, term5573.getClass(), "leftSide", term5574);
        setIntElement(term5576, 0, -1542292796);
        setIntElement(term5576, 1, 1892295932);
        setIntElement(term5576, 2, 1028855301);
        setIntElement(term5576, 3, -2075314038);
        setField(term5573, term5573.getClass(), "rightSide", term5576);
        setField(term5573, term5573.getClass(), "weight", term5581);
        setField(term5583, term5583.getClass(), "graph", null);
        setField(term5583, term5583.getClass(), "map", null);
        setField(term5573, term5573.getClass(), "edges", term5583);
        setField(term5511, term5511.getClass(), "minCut", term5573);
        setField(term5511, term5511.getClass(), "newVertex", term5584);
        setField(term5511, term5511.getClass(), "graph", null);
        term5586 = new Integer(1085906450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5586;
        callMethod(klass, "findFirstNeighborPos", argTypes, term5511, args);
    }

};


