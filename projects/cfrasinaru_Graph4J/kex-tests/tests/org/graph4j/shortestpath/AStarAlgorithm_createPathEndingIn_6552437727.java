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
import java.lang.Integer;

public class AStarAlgorithm_createPathEndingIn_6552437727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3125;
     Object term3166;

    public AStarAlgorithm_createPathEndingIn_6552437727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3125 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term3128 = (int[]) newIntArray(0);
        double[] term3129 = (double[]) newDoubleArray(5);
        int[] term3135 = (int[]) newIntArray(3);
        int[] term3139 = (int[]) newIntArray(8);
        boolean[] term3148 = (boolean[]) newBooleanArray(6);
        Object term3156 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3157 = (int[]) newIntArray(3);
        int[] term3161 = (int[]) newIntArray(2);
        setIntField(term3125, term3125.getClass(), "source", -341287775);
        setIntField(term3125, term3125.getClass(), "target", -1651110911);
        setField(term3125, term3125.getClass(), "vertices", term3128);
        setDoubleElement(term3129, 0, 0.4046308665116508);
        setDoubleElement(term3129, 1, 0.3546618953364844);
        setDoubleElement(term3129, 2, 0.011186829850474256);
        setDoubleElement(term3129, 3, 0.47058253607311484);
        setDoubleElement(term3129, 4, 0.7340691331467901);
        setField(term3125, term3125.getClass(), "cost", term3129);
        setIntElement(term3135, 0, -1934033808);
        setIntElement(term3135, 1, 950322609);
        setIntElement(term3135, 2, -2023791789);
        setField(term3125, term3125.getClass(), "before", term3135);
        setIntElement(term3139, 0, 353974456);
        setIntElement(term3139, 1, -485108462);
        setIntElement(term3139, 2, 1418551216);
        setIntElement(term3139, 3, -626779272);
        setIntElement(term3139, 4, -1150062870);
        setIntElement(term3139, 5, -886200503);
        setIntElement(term3139, 6, 1136393691);
        setIntElement(term3139, 7, -1288536479);
        setField(term3125, term3125.getClass(), "size", term3139);
        setBooleanElement(term3148, 0, true);
        setBooleanElement(term3148, 1, true);
        setBooleanElement(term3148, 3, true);
        setBooleanElement(term3148, 4, true);
        setBooleanElement(term3148, 5, true);
        setField(term3125, term3125.getClass(), "solved", term3148);
        setIntField(term3125, term3125.getClass(), "numSolved", 1092038167);
        setField(term3156, term3156.getClass(), "graph", null);
        setField(term3156, term3156.getClass(), "comparator", null);
        setIntElement(term3157, 0, 1879729823);
        setIntElement(term3157, 1, 1443855558);
        setIntElement(term3157, 2, -1933419449);
        setField(term3156, term3156.getClass(), "keys", term3157);
        setIntElement(term3161, 0, -1804322375);
        setIntElement(term3161, 1, 1595814906);
        setField(term3156, term3156.getClass(), "positions", term3161);
        setIntField(term3156, term3156.getClass(), "size", -834193529);
        setField(term3125, term3125.getClass(), "heap", term3156);
        setField(term3125, term3125.getClass(), "heuristic", null);
        setField(term3125, term3125.getClass(), "graph", null);
        setBooleanField(term3125, term3125.getClass(), "directed", false);
        term3166 = new Integer(335780735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3166;
        callMethod(klass, "createPathEndingIn", argTypes, term3125, args);
    }

};


