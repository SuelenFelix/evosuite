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

public class StoerWagnerMinimumCut2_compute_4794952934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4447;

    public StoerWagnerMinimumCut2_compute_4794952934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4498 = new HashMap();
        Double term4511 = new Double(0.37161417339133307);
        Integer term4513 = new Integer(-184153539);
        Double term4531 = new Double(0.6805867182029153);
        Integer term4534 = new Integer(493620644);
        term4447 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        Object term4449 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4450 = (int[]) newIntArray(7);
        int[] term4458 = (int[]) newIntArray(8);
        boolean[] term4468 = (boolean[]) newBooleanArray(5);
        double[] term4474 = (double[]) newDoubleArray(9);
        Object term4484 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term4485 = (int[]) newIntArray(0);
        Object term4488 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4489 = (long[]) newLongArray(1);
        Object term4493 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4494 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term4515 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4516 = (int[]) newIntArray(4);
        int[] term4521 = (int[]) newIntArray(9);
        Object term4533 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4447, term4447.getClass(), "ignoreWeights", true);
        setField(term4447, term4447.getClass(), "workGraph", null);
        setField(term4449, term4449.getClass(), "graph", null);
        setField(term4449, term4449.getClass(), "comparator", null);
        setIntElement(term4450, 0, 2094923086);
        setIntElement(term4450, 1, 1532355365);
        setIntElement(term4450, 2, -156316508);
        setIntElement(term4450, 3, -1304449497);
        setIntElement(term4450, 4, -80320412);
        setIntElement(term4450, 5, -356797136);
        setIntElement(term4450, 6, -2035641970);
        setField(term4449, term4449.getClass(), "keys", term4450);
        setIntElement(term4458, 0, 1813581230);
        setIntElement(term4458, 1, 844569461);
        setIntElement(term4458, 2, -15085966);
        setIntElement(term4458, 3, -1929631412);
        setIntElement(term4458, 4, 1014160441);
        setIntElement(term4458, 5, 975753484);
        setIntElement(term4458, 6, -1886360357);
        setIntElement(term4458, 7, -235867268);
        setField(term4449, term4449.getClass(), "positions", term4458);
        setIntField(term4449, term4449.getClass(), "size", -972330704);
        setField(term4447, term4447.getClass(), "maxHeap", term4449);
        setBooleanElement(term4468, 4, true);
        setField(term4447, term4447.getClass(), "processed", term4468);
        setDoubleElement(term4474, 0, 0.8566567697571895);
        setDoubleElement(term4474, 1, 0.9203805380592256);
        setDoubleElement(term4474, 2, 0.5804948995371725);
        setDoubleElement(term4474, 3, 0.20737514139742264);
        setDoubleElement(term4474, 4, 0.7919370314903882);
        setDoubleElement(term4474, 5, 0.2109867221632754);
        setDoubleElement(term4474, 6, 0.3227335400819148);
        setDoubleElement(term4474, 7, 0.43337207054070237);
        setDoubleElement(term4474, 8, 0.13246999699526574);
        setField(term4447, term4447.getClass(), "weight", term4474);
        setField(term4484, term4484.getClass(), "graph", null);
        setField(term4484, term4484.getClass(), "vertices", term4485);
        setIntField(term4484, term4484.getClass(), "numVertices", 134173297);
        setIntField(term4484, term4484.getClass(), "first", 2025698852);
        setField(term4488, term4488.getClass(), "words", term4489);
        setIntField(term4488, term4488.getClass(), "wordsInUse", 113961338);
        setBooleanField(term4488, term4488.getClass(), "sizeIsSticky", false);
        setField(term4484, term4484.getClass(), "bitset", term4488);
        setField(term4447, term4447.getClass(), "ordering", term4484);
        setField(term4493, term4493.getClass(), "table", term4494);
        setIntField(term4493, term4493.getClass(), "count", 1869277085);
        setIntField(term4493, term4493.getClass(), "threshold", 15);
        setFloatField(term4493, term4493.getClass(), "loadFactor", 0.75F);
        setField(term4447, term4447.getClass(), "orderingIndex", term4493);
        setField(term4447, term4447.getClass(), "vertexMap", term4498);
        setField(term4447, term4447.getClass(), "minWeight", term4511);
        setField(term4447, term4447.getClass(), "minCutVertex", term4513);
        setField(term4515, term4515.getClass(), "graph", null);
        setIntElement(term4516, 0, -860227615);
        setIntElement(term4516, 1, -1696192372);
        setIntElement(term4516, 2, 1239525687);
        setIntElement(term4516, 3, 1496590861);
        setField(term4515, term4515.getClass(), "leftSide", term4516);
        setIntElement(term4521, 0, 1046957508);
        setIntElement(term4521, 1, -553500478);
        setIntElement(term4521, 2, 841910530);
        setIntElement(term4521, 3, -1415371559);
        setIntElement(term4521, 4, -2083858949);
        setIntElement(term4521, 5, -1878319299);
        setIntElement(term4521, 6, -690862846);
        setIntElement(term4521, 7, 805027262);
        setIntElement(term4521, 8, 717389178);
        setField(term4515, term4515.getClass(), "rightSide", term4521);
        setField(term4515, term4515.getClass(), "weight", term4531);
        setField(term4533, term4533.getClass(), "graph", null);
        setField(term4533, term4533.getClass(), "map", null);
        setField(term4515, term4515.getClass(), "edges", term4533);
        setField(term4447, term4447.getClass(), "minCut", term4515);
        setField(term4447, term4447.getClass(), "newVertex", term4534);
        setField(term4447, term4447.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term4447, args);
    }

};


