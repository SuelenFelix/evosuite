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

public class AStarAlgorithm_findPath_16865711874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2885;

    public AStarAlgorithm_findPath_16865711874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2885 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2888 = (int[]) newIntArray(5);
        double[] term2894 = (double[]) newDoubleArray(4);
        int[] term2899 = (int[]) newIntArray(7);
        int[] term2907 = (int[]) newIntArray(8);
        boolean[] term2916 = (boolean[]) newBooleanArray(5);
        Object term2923 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2924 = (int[]) newIntArray(9);
        int[] term2934 = (int[]) newIntArray(0);
        setIntField(term2885, term2885.getClass(), "source", 993627098);
        setIntField(term2885, term2885.getClass(), "target", 872295704);
        setIntElement(term2888, 0, 86041387);
        setIntElement(term2888, 1, 1010721666);
        setIntElement(term2888, 2, 27043781);
        setIntElement(term2888, 3, -1367122405);
        setIntElement(term2888, 4, -1703625118);
        setField(term2885, term2885.getClass(), "vertices", term2888);
        setDoubleElement(term2894, 0, 0.020103660328398276);
        setDoubleElement(term2894, 1, 0.6530844366661772);
        setDoubleElement(term2894, 2, 0.7368078667856154);
        setDoubleElement(term2894, 3, 0.6799679189320558);
        setField(term2885, term2885.getClass(), "cost", term2894);
        setIntElement(term2899, 0, 1104108112);
        setIntElement(term2899, 1, 1648665618);
        setIntElement(term2899, 2, 633765954);
        setIntElement(term2899, 3, 269110087);
        setIntElement(term2899, 4, 1545119095);
        setIntElement(term2899, 5, 1671229683);
        setIntElement(term2899, 6, 34167717);
        setField(term2885, term2885.getClass(), "before", term2899);
        setIntElement(term2907, 0, -514195141);
        setIntElement(term2907, 1, -297946422);
        setIntElement(term2907, 2, 385463636);
        setIntElement(term2907, 3, -1677599962);
        setIntElement(term2907, 4, -1790275458);
        setIntElement(term2907, 5, -497534255);
        setIntElement(term2907, 6, 1588942911);
        setIntElement(term2907, 7, -2129828854);
        setField(term2885, term2885.getClass(), "size", term2907);
        setBooleanElement(term2916, 0, true);
        setBooleanElement(term2916, 3, true);
        setBooleanElement(term2916, 4, true);
        setField(term2885, term2885.getClass(), "solved", term2916);
        setIntField(term2885, term2885.getClass(), "numSolved", -47438786);
        setField(term2923, term2923.getClass(), "graph", null);
        setField(term2923, term2923.getClass(), "comparator", null);
        setIntElement(term2924, 0, -1955400589);
        setIntElement(term2924, 1, 626179200);
        setIntElement(term2924, 2, -511077684);
        setIntElement(term2924, 3, -711507760);
        setIntElement(term2924, 4, 1053773809);
        setIntElement(term2924, 5, 924127883);
        setIntElement(term2924, 6, -751079123);
        setIntElement(term2924, 7, -110837188);
        setIntElement(term2924, 8, -271094506);
        setField(term2923, term2923.getClass(), "keys", term2924);
        setField(term2923, term2923.getClass(), "positions", term2934);
        setIntField(term2923, term2923.getClass(), "size", 455632030);
        setField(term2885, term2885.getClass(), "heap", term2923);
        setField(term2885, term2885.getClass(), "heuristic", null);
        setField(term2885, term2885.getClass(), "graph", null);
        setBooleanField(term2885, term2885.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term2885, args);
    }

};


