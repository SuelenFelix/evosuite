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

public class StoerWagnerMinimumCut_checkForNegativeEdges_1991559766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;

    public StoerWagnerMinimumCut_checkForNegativeEdges_1991559766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term352 = new HashMap();
        Double term365 = new Double(0.6076495596892013);
        Integer term367 = new Integer(-1339778481);
        Double term373 = new Double(0.37773193782763337);
        term329 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        Object term331 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term332 = (int[]) newIntArray(2);
        int[] term335 = (int[]) newIntArray(5);
        boolean[] term342 = (boolean[]) newBooleanArray(3);
        double[] term346 = (double[]) newDoubleArray(5);
        Object term369 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term370 = (int[]) newIntArray(1);
        int[] term372 = (int[]) newIntArray(0);
        Object term375 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term329, term329.getClass(), "ignoreWeights", true);
        setField(term329, term329.getClass(), "workGraph", null);
        setField(term331, term331.getClass(), "graph", null);
        setField(term331, term331.getClass(), "comparator", null);
        setIntElement(term332, 0, -505439934);
        setIntElement(term332, 1, -344842608);
        setField(term331, term331.getClass(), "keys", term332);
        setIntElement(term335, 0, 941650513);
        setIntElement(term335, 1, 444029505);
        setIntElement(term335, 2, -1034506028);
        setIntElement(term335, 3, -1263114719);
        setIntElement(term335, 4, -894662986);
        setField(term331, term331.getClass(), "positions", term335);
        setIntField(term331, term331.getClass(), "size", 304775596);
        setField(term329, term329.getClass(), "maxHeap", term331);
        setBooleanElement(term342, 0, true);
        setBooleanElement(term342, 1, true);
        setField(term329, term329.getClass(), "processed", term342);
        setDoubleElement(term346, 0, 0.6436713023569729);
        setDoubleElement(term346, 1, 0.7332741045694002);
        setDoubleElement(term346, 2, 0.4569171842750229);
        setDoubleElement(term346, 3, 0.8598297828918529);
        setDoubleElement(term346, 4, 0.43692187681405226);
        setField(term329, term329.getClass(), "weight", term346);
        setField(term329, term329.getClass(), "vertexMap", term352);
        setField(term329, term329.getClass(), "minWeight", term365);
        setField(term329, term329.getClass(), "minCutVertex", term367);
        setField(term369, term369.getClass(), "graph", null);
        setIntElement(term370, 0, -615654495);
        setField(term369, term369.getClass(), "leftSide", term370);
        setField(term369, term369.getClass(), "rightSide", term372);
        setField(term369, term369.getClass(), "weight", term373);
        setField(term375, term375.getClass(), "graph", null);
        setField(term375, term375.getClass(), "map", null);
        setField(term369, term369.getClass(), "edges", term375);
        setField(term329, term329.getClass(), "minCut", term369);
        setField(term329, term329.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term329, args);
    }

};


