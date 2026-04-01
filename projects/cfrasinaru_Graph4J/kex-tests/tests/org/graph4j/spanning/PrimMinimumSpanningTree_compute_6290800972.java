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

public class PrimMinimumSpanningTree_compute_6290800972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;

    public PrimMinimumSpanningTree_compute_6290800972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term270 = new Double(0.5279279537140873);
        term241 = newInstance(Class.forName("org.graph4j.spanning.PrimMinimumSpanningTree"));
        Object term242 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term243 = (int[]) newIntArray(2);
        int[] term246 = (int[]) newIntArray(1);
        boolean[] term249 = (boolean[]) newBooleanArray(9);
        double[] term259 = (double[]) newDoubleArray(3);
        int[] term263 = (int[]) newIntArray(5);
        Object term269 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term242, term242.getClass(), "graph", null);
        setField(term242, term242.getClass(), "comparator", null);
        setIntElement(term243, 0, 933028652);
        setIntElement(term243, 1, 287287233);
        setField(term242, term242.getClass(), "keys", term243);
        setIntElement(term246, 0, 962840079);
        setField(term242, term242.getClass(), "positions", term246);
        setIntField(term242, term242.getClass(), "size", 1540719661);
        setField(term241, term241.getClass(), "minHeap", term242);
        setBooleanElement(term249, 1, true);
        setBooleanElement(term249, 4, true);
        setBooleanElement(term249, 5, true);
        setBooleanElement(term249, 8, true);
        setField(term241, term241.getClass(), "solved", term249);
        setDoubleElement(term259, 0, 0.5523635872663106);
        setDoubleElement(term259, 1, 0.544608645520025);
        setDoubleElement(term259, 2, 0.28570734989730284);
        setField(term241, term241.getClass(), "weight", term259);
        setIntElement(term263, 0, 1265463001);
        setIntElement(term263, 1, 335112684);
        setIntElement(term263, 2, 1551099402);
        setIntElement(term263, 3, -2027534003);
        setIntElement(term263, 4, 1063420942);
        setField(term241, term241.getClass(), "peer", term263);
        setField(term241, term241.getClass(), "tree", null);
        setField(term269, term269.getClass(), "graph", null);
        setField(term269, term269.getClass(), "map", null);
        setField(term241, term241.getClass(), "treeEdges", term269);
        setField(term241, term241.getClass(), "minWeight", term270);
        setField(term241, term241.getClass(), "graph", null);
        setBooleanField(term241, term241.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.PrimMinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term241, args);
    }

};


