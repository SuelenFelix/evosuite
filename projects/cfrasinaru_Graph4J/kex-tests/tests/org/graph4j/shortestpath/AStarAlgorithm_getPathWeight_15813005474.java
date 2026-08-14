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

public class AStarAlgorithm_getPathWeight_15813005474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2971;

    public AStarAlgorithm_getPathWeight_15813005474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2971 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2974 = (int[]) newIntArray(4);
        double[] term2979 = (double[]) newDoubleArray(4);
        int[] term2984 = (int[]) newIntArray(9);
        int[] term2994 = (int[]) newIntArray(3);
        boolean[] term2998 = (boolean[]) newBooleanArray(1);
        Object term3001 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3002 = (int[]) newIntArray(5);
        int[] term3008 = (int[]) newIntArray(5);
        setIntField(term2971, term2971.getClass(), "source", -1632929393);
        setIntField(term2971, term2971.getClass(), "target", -431440129);
        setIntElement(term2974, 0, -763576148);
        setIntElement(term2974, 1, 1568948514);
        setIntElement(term2974, 2, -1511130237);
        setIntElement(term2974, 3, 452088587);
        setField(term2971, term2971.getClass(), "vertices", term2974);
        setDoubleElement(term2979, 0, 0.8342190257129791);
        setDoubleElement(term2979, 1, 0.1057616236613994);
        setDoubleElement(term2979, 2, 0.6517567007639319);
        setDoubleElement(term2979, 3, 0.7471692213461502);
        setField(term2971, term2971.getClass(), "cost", term2979);
        setIntElement(term2984, 0, -1630069454);
        setIntElement(term2984, 1, 1499735894);
        setIntElement(term2984, 2, 716486048);
        setIntElement(term2984, 3, -466708718);
        setIntElement(term2984, 4, 1038029515);
        setIntElement(term2984, 5, 1137154606);
        setIntElement(term2984, 6, -100681578);
        setIntElement(term2984, 7, 296568835);
        setIntElement(term2984, 8, 1431951992);
        setField(term2971, term2971.getClass(), "before", term2984);
        setIntElement(term2994, 0, -1608123016);
        setIntElement(term2994, 1, -896473214);
        setIntElement(term2994, 2, 401203924);
        setField(term2971, term2971.getClass(), "size", term2994);
        setField(term2971, term2971.getClass(), "solved", term2998);
        setIntField(term2971, term2971.getClass(), "numSolved", -1212399479);
        setField(term3001, term3001.getClass(), "graph", null);
        setField(term3001, term3001.getClass(), "comparator", null);
        setIntElement(term3002, 0, 2107679041);
        setIntElement(term3002, 1, 2040965507);
        setIntElement(term3002, 2, -1281083262);
        setIntElement(term3002, 3, 1059930704);
        setIntElement(term3002, 4, -1967153290);
        setField(term3001, term3001.getClass(), "keys", term3002);
        setIntElement(term3008, 0, -1397251956);
        setIntElement(term3008, 1, -796934571);
        setIntElement(term3008, 2, 405295896);
        setIntElement(term3008, 3, -814977075);
        setIntElement(term3008, 4, 808614267);
        setField(term3001, term3001.getClass(), "positions", term3008);
        setIntField(term3001, term3001.getClass(), "size", 1611734632);
        setField(term2971, term2971.getClass(), "heap", term3001);
        setField(term2971, term2971.getClass(), "heuristic", null);
        setField(term2971, term2971.getClass(), "graph", null);
        setBooleanField(term2971, term2971.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term2971, args);
    }

};


