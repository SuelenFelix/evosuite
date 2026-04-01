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

public class StoerWagnerMinimumCut_getMinimumCut_8385825292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public StoerWagnerMinimumCut_getMinimumCut_8385825292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27 = new HashMap();
        Double term40 = new Double(0.13238746331190498);
        Integer term42 = new Integer(1162663216);
        Double term55 = new Double(0.3455959125047594);
        term3 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        Object term5 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term6 = (int[]) newIntArray(5);
        int[] term12 = (int[]) newIntArray(4);
        boolean[] term18 = (boolean[]) newBooleanArray(3);
        double[] term22 = (double[]) newDoubleArray(4);
        Object term44 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term45 = (int[]) newIntArray(6);
        int[] term52 = (int[]) newIntArray(2);
        Object term57 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term3, term3.getClass(), "ignoreWeights", false);
        setField(term3, term3.getClass(), "workGraph", null);
        setField(term5, term5.getClass(), "graph", null);
        setField(term5, term5.getClass(), "comparator", null);
        setIntElement(term6, 0, 568599855);
        setIntElement(term6, 1, 1162663216);
        setIntElement(term6, 2, 1484323161);
        setIntElement(term6, 3, 391863371);
        setIntElement(term6, 4, -1922583790);
        setField(term5, term5.getClass(), "keys", term6);
        setIntElement(term12, 0, -616727354);
        setIntElement(term12, 1, -1955890973);
        setIntElement(term12, 2, -2038273078);
        setIntElement(term12, 3, 1227103734);
        setField(term5, term5.getClass(), "positions", term12);
        setIntField(term5, term5.getClass(), "size", -1339778481);
        setField(term3, term3.getClass(), "maxHeap", term5);
        setBooleanElement(term18, 2, true);
        setField(term3, term3.getClass(), "processed", term18);
        setDoubleElement(term22, 0, 0.13238746331190498);
        setDoubleElement(term22, 1, 0.3455959125047594);
        setDoubleElement(term22, 2, 0.5523635872663106);
        setDoubleElement(term22, 3, 0.544608645520025);
        setField(term3, term3.getClass(), "weight", term22);
        setField(term3, term3.getClass(), "vertexMap", term27);
        setField(term3, term3.getClass(), "minWeight", term40);
        setField(term3, term3.getClass(), "minCutVertex", term42);
        setField(term44, term44.getClass(), "graph", null);
        setIntElement(term45, 0, 1585847225);
        setIntElement(term45, 1, 597278769);
        setIntElement(term45, 2, -1685132342);
        setIntElement(term45, 3, -1456670397);
        setIntElement(term45, 4, 1622346318);
        setIntElement(term45, 5, 1048535127);
        setField(term44, term44.getClass(), "leftSide", term45);
        setIntElement(term52, 0, -655067527);
        setIntElement(term52, 1, -6029667);
        setField(term44, term44.getClass(), "rightSide", term52);
        setField(term44, term44.getClass(), "weight", term55);
        setField(term57, term57.getClass(), "graph", null);
        setField(term57, term57.getClass(), "map", null);
        setField(term44, term44.getClass(), "edges", term57);
        setField(term3, term3.getClass(), "minCut", term44);
        setField(term3, term3.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term3, args);
    }

};


