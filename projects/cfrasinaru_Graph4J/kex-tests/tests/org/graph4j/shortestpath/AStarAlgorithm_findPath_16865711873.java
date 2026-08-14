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

public class AStarAlgorithm_findPath_16865711873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2881;

    public AStarAlgorithm_findPath_16865711873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2881 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2884 = (int[]) newIntArray(5);
        double[] term2890 = (double[]) newDoubleArray(4);
        int[] term2895 = (int[]) newIntArray(7);
        int[] term2903 = (int[]) newIntArray(8);
        boolean[] term2912 = (boolean[]) newBooleanArray(5);
        Object term2919 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2920 = (int[]) newIntArray(9);
        int[] term2930 = (int[]) newIntArray(0);
        setIntField(term2881, term2881.getClass(), "source", 993627098);
        setIntField(term2881, term2881.getClass(), "target", 872295704);
        setIntElement(term2884, 0, 86041387);
        setIntElement(term2884, 1, 1010721666);
        setIntElement(term2884, 2, 27043781);
        setIntElement(term2884, 3, -1367122405);
        setIntElement(term2884, 4, -1703625118);
        setField(term2881, term2881.getClass(), "vertices", term2884);
        setDoubleElement(term2890, 0, 0.020103660328398276);
        setDoubleElement(term2890, 1, 0.6530844366661772);
        setDoubleElement(term2890, 2, 0.7368078667856154);
        setDoubleElement(term2890, 3, 0.6799679189320558);
        setField(term2881, term2881.getClass(), "cost", term2890);
        setIntElement(term2895, 0, 1104108112);
        setIntElement(term2895, 1, 1648665618);
        setIntElement(term2895, 2, 633765954);
        setIntElement(term2895, 3, 269110087);
        setIntElement(term2895, 4, 1545119095);
        setIntElement(term2895, 5, 1671229683);
        setIntElement(term2895, 6, 34167717);
        setField(term2881, term2881.getClass(), "before", term2895);
        setIntElement(term2903, 0, -514195141);
        setIntElement(term2903, 1, -297946422);
        setIntElement(term2903, 2, 385463636);
        setIntElement(term2903, 3, -1677599962);
        setIntElement(term2903, 4, -1790275458);
        setIntElement(term2903, 5, -497534255);
        setIntElement(term2903, 6, 1588942911);
        setIntElement(term2903, 7, -2129828854);
        setField(term2881, term2881.getClass(), "size", term2903);
        setBooleanElement(term2912, 0, true);
        setBooleanElement(term2912, 3, true);
        setBooleanElement(term2912, 4, true);
        setField(term2881, term2881.getClass(), "solved", term2912);
        setIntField(term2881, term2881.getClass(), "numSolved", -47438786);
        setField(term2919, term2919.getClass(), "graph", null);
        setField(term2919, term2919.getClass(), "comparator", null);
        setIntElement(term2920, 0, -1955400589);
        setIntElement(term2920, 1, 626179200);
        setIntElement(term2920, 2, -511077684);
        setIntElement(term2920, 3, -711507760);
        setIntElement(term2920, 4, 1053773809);
        setIntElement(term2920, 5, 924127883);
        setIntElement(term2920, 6, -751079123);
        setIntElement(term2920, 7, -110837188);
        setIntElement(term2920, 8, -271094506);
        setField(term2919, term2919.getClass(), "keys", term2920);
        setField(term2919, term2919.getClass(), "positions", term2930);
        setIntField(term2919, term2919.getClass(), "size", 455632030);
        setField(term2881, term2881.getClass(), "heap", term2919);
        setField(term2881, term2881.getClass(), "heuristic", null);
        setField(term2881, term2881.getClass(), "graph", null);
        setBooleanField(term2881, term2881.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term2881, args);
    }

};


