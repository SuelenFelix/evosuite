package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class PrimMinimumSpanningTree_getEdges_20608299801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public PrimMinimumSpanningTree_getEdges_20608299801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term224 = new Double(0.07802449704920456);
        term201 = newInstance(Class.forName("org.graph4j.spanning.PrimMinimumSpanningTree"));
        Object term202 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term203 = (int[]) newIntArray(3);
        int[] term207 = (int[]) newIntArray(1);
        boolean[] term210 = (boolean[]) newBooleanArray(0);
        double[] term211 = (double[]) newDoubleArray(2);
        int[] term214 = (int[]) newIntArray(8);
        Object term223 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term202, term202.getClass(), "graph", null);
        setField(term202, term202.getClass(), "comparator", null);
        setIntElement(term203, 0, 458147407);
        setIntElement(term203, 1, -184153539);
        setIntElement(term203, 2, 493620644);
        setField(term202, term202.getClass(), "keys", term203);
        setIntElement(term207, 0, 1328271830);
        setField(term202, term202.getClass(), "positions", term207);
        setIntField(term202, term202.getClass(), "size", 1596070772);
        setField(term201, term201.getClass(), "minHeap", term202);
        setField(term201, term201.getClass(), "solved", term210);
        setDoubleElement(term211, 0, 0.13238746331190498);
        setDoubleElement(term211, 1, 0.3455959125047594);
        setField(term201, term201.getClass(), "weight", term211);
        setIntElement(term214, 0, 97029295);
        setIntElement(term214, 1, -1371869594);
        setIntElement(term214, 2, -2095575670);
        setIntElement(term214, 3, 1225272962);
        setIntElement(term214, 4, 1324040357);
        setIntElement(term214, 5, -1588772968);
        setIntElement(term214, 6, -93135961);
        setIntElement(term214, 7, -112921587);
        setField(term201, term201.getClass(), "peer", term214);
        setField(term201, term201.getClass(), "tree", null);
        setField(term223, term223.getClass(), "graph", null);
        setField(term223, term223.getClass(), "map", null);
        setField(term201, term201.getClass(), "treeEdges", term223);
        setField(term201, term201.getClass(), "minWeight", term224);
        setField(term201, term201.getClass(), "graph", null);
        setBooleanField(term201, term201.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.PrimMinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdges", argTypes, term201, args);
    }

};


