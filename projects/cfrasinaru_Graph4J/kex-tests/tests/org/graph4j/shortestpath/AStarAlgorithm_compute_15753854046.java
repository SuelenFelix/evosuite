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

public class AStarAlgorithm_compute_15753854046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3051;

    public AStarAlgorithm_compute_15753854046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3051 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term3054 = (int[]) newIntArray(8);
        double[] term3063 = (double[]) newDoubleArray(3);
        int[] term3067 = (int[]) newIntArray(6);
        int[] term3074 = (int[]) newIntArray(8);
        boolean[] term3083 = (boolean[]) newBooleanArray(3);
        Object term3088 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3089 = (int[]) newIntArray(1);
        int[] term3091 = (int[]) newIntArray(1);
        setIntField(term3051, term3051.getClass(), "source", 868908117);
        setIntField(term3051, term3051.getClass(), "target", 1789351397);
        setIntElement(term3054, 0, 2145528170);
        setIntElement(term3054, 1, -585773976);
        setIntElement(term3054, 2, 852806940);
        setIntElement(term3054, 3, 698551724);
        setIntElement(term3054, 4, -1631048635);
        setIntElement(term3054, 5, 1342808731);
        setIntElement(term3054, 6, -64893740);
        setIntElement(term3054, 7, -222012928);
        setField(term3051, term3051.getClass(), "vertices", term3054);
        setDoubleElement(term3063, 0, 0.20733693951275556);
        setDoubleElement(term3063, 1, 0.6618543228332953);
        setDoubleElement(term3063, 2, 0.8760632597672348);
        setField(term3051, term3051.getClass(), "cost", term3063);
        setIntElement(term3067, 0, -146564963);
        setIntElement(term3067, 1, -83178716);
        setIntElement(term3067, 2, -1292704466);
        setIntElement(term3067, 3, 1991858584);
        setIntElement(term3067, 4, -1300947782);
        setIntElement(term3067, 5, 188512644);
        setField(term3051, term3051.getClass(), "before", term3067);
        setIntElement(term3074, 0, 1851127634);
        setIntElement(term3074, 1, 783730213);
        setIntElement(term3074, 2, 1815951606);
        setIntElement(term3074, 3, 1105016932);
        setIntElement(term3074, 4, -365784998);
        setIntElement(term3074, 5, -1893236300);
        setIntElement(term3074, 6, -1858909368);
        setIntElement(term3074, 7, -280113263);
        setField(term3051, term3051.getClass(), "size", term3074);
        setBooleanElement(term3083, 0, true);
        setField(term3051, term3051.getClass(), "solved", term3083);
        setIntField(term3051, term3051.getClass(), "numSolved", 529625347);
        setField(term3088, term3088.getClass(), "graph", null);
        setField(term3088, term3088.getClass(), "comparator", null);
        setIntElement(term3089, 0, 1409095253);
        setField(term3088, term3088.getClass(), "keys", term3089);
        setIntElement(term3091, 0, 315179039);
        setField(term3088, term3088.getClass(), "positions", term3091);
        setIntField(term3088, term3088.getClass(), "size", -1835923897);
        setField(term3051, term3051.getClass(), "heap", term3088);
        setField(term3051, term3051.getClass(), "heuristic", null);
        setField(term3051, term3051.getClass(), "graph", null);
        setBooleanField(term3051, term3051.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term3051, args);
    }

};


