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

public class StoerWagnerMinimumCut2_minCutPhase_3738118375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4579;

    public StoerWagnerMinimumCut2_minCutPhase_3738118375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4623 = new HashMap();
        Double term4636 = new Double(0.2852810965221698);
        Integer term4638 = new Integer(1596070772);
        Double term4654 = new Double(0.6300849762307866);
        Integer term4657 = new Integer(97029295);
        term4579 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4581 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4582 = (int[]) newIntArray(1);
        int[] term4584 = (int[]) newIntArray(5);
        boolean[] term4591 = (boolean[]) newBooleanArray(5);
        double[] term4597 = (double[]) newDoubleArray(8);
        Object term4606 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4607 = (int[]) newIntArray(3);
        Object term4613 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4614 = (long[]) newLongArray(1);
        Object term4618 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4619 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4640 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4641 = (int[]) newIntArray(8);
        int[] term4650 = (int[]) newIntArray(3);
        Object term4656 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4579, term4579.getClass(), "ignoreWeights", true);
        setField(term4579, term4579.getClass(), "workGraph", null);
        setField(term4581, term4581.getClass(), "graph", null);
        setField(term4581, term4581.getClass(), "comparator", null);
        setIntElement(term4582, 0, -1265226052);
        setField(term4581, term4581.getClass(), "keys", term4582);
        setIntElement(term4584, 0, 1970023149);
        setIntElement(term4584, 1, -336351735);
        setIntElement(term4584, 2, 1938932230);
        setIntElement(term4584, 3, 1128720609);
        setIntElement(term4584, 4, 216265002);
        setField(term4581, term4581.getClass(), "positions", term4584);
        setIntField(term4581, term4581.getClass(), "size", -97405660);
        setField(term4579, term4579.getClass(), "maxHeap", term4581);
        setBooleanElement(term4591, 0, true);
        setBooleanElement(term4591, 2, true);
        setBooleanElement(term4591, 3, true);
        setField(term4579, term4579.getClass(), "processed", term4591);
        setDoubleElement(term4597, 0, 0.9126850255993704);
        setDoubleElement(term4597, 1, 0.11179067076100713);
        setDoubleElement(term4597, 2, 0.5306473989087822);
        setDoubleElement(term4597, 3, 0.022483645678509023);
        setDoubleElement(term4597, 4, 0.025133051616627267);
        setDoubleElement(term4597, 5, 0.016575281023182953);
        setDoubleElement(term4597, 6, 0.5308350402051779);
        setDoubleElement(term4597, 7, 0.7154795600170818);
        setField(term4579, term4579.getClass(), "weight", term4597);
        setField(term4606, term4606.getClass(), "graph", null);
        setIntElement(term4607, 0, 872278468);
        setIntElement(term4607, 1, -1003390920);
        setIntElement(term4607, 2, -2052568448);
        setField(term4606, term4606.getClass(), "vertices", term4607);
        setIntField(term4606, term4606.getClass(), "numVertices", 664155196);
        setIntField(term4606, term4606.getClass(), "first", -1103257588);
        setField(term4613, term4613.getClass(), "words", term4614);
        setIntField(term4613, term4613.getClass(), "wordsInUse", 1463219831);
        setBooleanField(term4613, term4613.getClass(), "sizeIsSticky", false);
        setField(term4606, term4606.getClass(), "bitset", term4613);
        setField(term4579, term4579.getClass(), "ordering", term4606);
        setField(term4618, term4618.getClass(), "table", term4619);
        setIntField(term4618, term4618.getClass(), "count", -1516863216);
        setIntField(term4618, term4618.getClass(), "threshold", 15);
        setFloatField(term4618, term4618.getClass(), "loadFactor", 0.75F);
        setField(term4579, term4579.getClass(), "orderingIndex", term4618);
        setField(term4579, term4579.getClass(), "vertexMap", term4623);
        setField(term4579, term4579.getClass(), "minWeight", term4636);
        setField(term4579, term4579.getClass(), "minCutVertex", term4638);
        setField(term4640, term4640.getClass(), "graph", null);
        setIntElement(term4641, 0, 2073367039);
        setIntElement(term4641, 1, -365877126);
        setIntElement(term4641, 2, 251018856);
        setIntElement(term4641, 3, -1965331640);
        setIntElement(term4641, 4, -514392629);
        setIntElement(term4641, 5, -166633123);
        setIntElement(term4641, 6, 373110517);
        setIntElement(term4641, 7, -1632703926);
        setField(term4640, term4640.getClass(), "leftSide", term4641);
        setIntElement(term4650, 0, -1031499401);
        setIntElement(term4650, 1, 280202002);
        setIntElement(term4650, 2, -1074402599);
        setField(term4640, term4640.getClass(), "rightSide", term4650);
        setField(term4640, term4640.getClass(), "weight", term4654);
        setField(term4656, term4656.getClass(), "graph", null);
        setField(term4656, term4656.getClass(), "map", null);
        setField(term4640, term4640.getClass(), "edges", term4656);
        setField(term4579, term4579.getClass(), "minCut", term4640);
        setField(term4579, term4579.getClass(), "newVertex", term4657);
        setField(term4579, term4579.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minCutPhase", argTypes, term4579, args);
    }

};


