package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DijkstraShortestPathHeap_findMinIndex_11518744993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864;

    public DijkstraShortestPathHeap_findMinIndex_11518744993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1864 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap"));
        Object term1865 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term1866 = (int[]) newIntArray(9);
        int[] term1876 = (int[]) newIntArray(9);
        int[] term1888 = (int[]) newIntArray(6);
        double[] term1895 = (double[]) newDoubleArray(1);
        int[] term1897 = (int[]) newIntArray(5);
        int[] term1903 = (int[]) newIntArray(3);
        boolean[] term1907 = (boolean[]) newBooleanArray(9);
        setField(term1865, term1865.getClass(), "graph", null);
        setField(term1865, term1865.getClass(), "comparator", null);
        setIntElement(term1866, 0, 993388358);
        setIntElement(term1866, 1, -765191335);
        setIntElement(term1866, 2, -1697741155);
        setIntElement(term1866, 3, 1295839803);
        setIntElement(term1866, 4, -1891015523);
        setIntElement(term1866, 5, -1560631747);
        setIntElement(term1866, 6, 1215150180);
        setIntElement(term1866, 7, -1422859977);
        setIntElement(term1866, 8, -1972436591);
        setField(term1865, term1865.getClass(), "keys", term1866);
        setIntElement(term1876, 0, 68922753);
        setIntElement(term1876, 1, -220791533);
        setIntElement(term1876, 2, 1741500243);
        setIntElement(term1876, 3, -2070466617);
        setIntElement(term1876, 4, -1127721881);
        setIntElement(term1876, 5, 1074848808);
        setIntElement(term1876, 6, -146054762);
        setIntElement(term1876, 7, 798043553);
        setIntElement(term1876, 8, 533197381);
        setField(term1865, term1865.getClass(), "positions", term1876);
        setIntField(term1865, term1865.getClass(), "size", 1048271679);
        setField(term1864, term1864.getClass(), "heap", term1865);
        setIntField(term1864, term1864.getClass(), "source", -1529797673);
        setIntElement(term1888, 0, -868676396);
        setIntElement(term1888, 1, 1922684808);
        setIntElement(term1888, 2, -2005784375);
        setIntElement(term1888, 3, -288604325);
        setIntElement(term1888, 4, -1268314569);
        setIntElement(term1888, 5, 877649659);
        setField(term1864, term1864.getClass(), "vertices", term1888);
        setDoubleElement(term1895, 0, 0.5975949169840026);
        setField(term1864, term1864.getClass(), "cost", term1895);
        setIntElement(term1897, 0, -1332748804);
        setIntElement(term1897, 1, 1774507971);
        setIntElement(term1897, 2, -1420269858);
        setIntElement(term1897, 3, -2119545015);
        setIntElement(term1897, 4, 1272542218);
        setField(term1864, term1864.getClass(), "before", term1897);
        setIntElement(term1903, 0, 1209799204);
        setIntElement(term1903, 1, 1094107751);
        setIntElement(term1903, 2, 844222656);
        setField(term1864, term1864.getClass(), "size", term1903);
        setBooleanElement(term1907, 0, true);
        setBooleanElement(term1907, 1, true);
        setBooleanElement(term1907, 5, true);
        setBooleanElement(term1907, 6, true);
        setBooleanElement(term1907, 8, true);
        setField(term1864, term1864.getClass(), "solved", term1907);
        setIntField(term1864, term1864.getClass(), "numSolved", -18216811);
        setField(term1864, term1864.getClass(), "graph", null);
        setBooleanField(term1864, term1864.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findMinIndex", argTypes, term1864, args);
    }

};


