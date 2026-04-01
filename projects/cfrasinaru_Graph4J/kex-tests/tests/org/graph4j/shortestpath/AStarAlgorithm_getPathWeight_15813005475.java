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

public class AStarAlgorithm_getPathWeight_15813005475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2975;

    public AStarAlgorithm_getPathWeight_15813005475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2975 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2978 = (int[]) newIntArray(4);
        double[] term2983 = (double[]) newDoubleArray(4);
        int[] term2988 = (int[]) newIntArray(9);
        int[] term2998 = (int[]) newIntArray(3);
        boolean[] term3002 = (boolean[]) newBooleanArray(1);
        Object term3005 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3006 = (int[]) newIntArray(5);
        int[] term3012 = (int[]) newIntArray(5);
        setIntField(term2975, term2975.getClass(), "source", -1632929393);
        setIntField(term2975, term2975.getClass(), "target", -431440129);
        setIntElement(term2978, 0, -763576148);
        setIntElement(term2978, 1, 1568948514);
        setIntElement(term2978, 2, -1511130237);
        setIntElement(term2978, 3, 452088587);
        setField(term2975, term2975.getClass(), "vertices", term2978);
        setDoubleElement(term2983, 0, 0.8342190257129791);
        setDoubleElement(term2983, 1, 0.1057616236613994);
        setDoubleElement(term2983, 2, 0.6517567007639319);
        setDoubleElement(term2983, 3, 0.7471692213461502);
        setField(term2975, term2975.getClass(), "cost", term2983);
        setIntElement(term2988, 0, -1630069454);
        setIntElement(term2988, 1, 1499735894);
        setIntElement(term2988, 2, 716486048);
        setIntElement(term2988, 3, -466708718);
        setIntElement(term2988, 4, 1038029515);
        setIntElement(term2988, 5, 1137154606);
        setIntElement(term2988, 6, -100681578);
        setIntElement(term2988, 7, 296568835);
        setIntElement(term2988, 8, 1431951992);
        setField(term2975, term2975.getClass(), "before", term2988);
        setIntElement(term2998, 0, -1608123016);
        setIntElement(term2998, 1, -896473214);
        setIntElement(term2998, 2, 401203924);
        setField(term2975, term2975.getClass(), "size", term2998);
        setField(term2975, term2975.getClass(), "solved", term3002);
        setIntField(term2975, term2975.getClass(), "numSolved", -1212399479);
        setField(term3005, term3005.getClass(), "graph", null);
        setField(term3005, term3005.getClass(), "comparator", null);
        setIntElement(term3006, 0, 2107679041);
        setIntElement(term3006, 1, 2040965507);
        setIntElement(term3006, 2, -1281083262);
        setIntElement(term3006, 3, 1059930704);
        setIntElement(term3006, 4, -1967153290);
        setField(term3005, term3005.getClass(), "keys", term3006);
        setIntElement(term3012, 0, -1397251956);
        setIntElement(term3012, 1, -796934571);
        setIntElement(term3012, 2, 405295896);
        setIntElement(term3012, 3, -814977075);
        setIntElement(term3012, 4, 808614267);
        setField(term3005, term3005.getClass(), "positions", term3012);
        setIntField(term3005, term3005.getClass(), "size", 1611734632);
        setField(term2975, term2975.getClass(), "heap", term3005);
        setField(term2975, term2975.getClass(), "heuristic", null);
        setField(term2975, term2975.getClass(), "graph", null);
        setBooleanField(term2975, term2975.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term2975, args);
    }

};


