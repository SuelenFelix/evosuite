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

public class AStarAlgorithm_createPathEndingIn_6552437726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3121;
     Object term3162;

    public AStarAlgorithm_createPathEndingIn_6552437726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3121 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term3124 = (int[]) newIntArray(0);
        double[] term3125 = (double[]) newDoubleArray(5);
        int[] term3131 = (int[]) newIntArray(3);
        int[] term3135 = (int[]) newIntArray(8);
        boolean[] term3144 = (boolean[]) newBooleanArray(6);
        Object term3152 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3153 = (int[]) newIntArray(3);
        int[] term3157 = (int[]) newIntArray(2);
        setIntField(term3121, term3121.getClass(), "source", -341287775);
        setIntField(term3121, term3121.getClass(), "target", -1651110911);
        setField(term3121, term3121.getClass(), "vertices", term3124);
        setDoubleElement(term3125, 0, 0.4046308665116508);
        setDoubleElement(term3125, 1, 0.3546618953364844);
        setDoubleElement(term3125, 2, 0.011186829850474256);
        setDoubleElement(term3125, 3, 0.47058253607311484);
        setDoubleElement(term3125, 4, 0.7340691331467901);
        setField(term3121, term3121.getClass(), "cost", term3125);
        setIntElement(term3131, 0, -1934033808);
        setIntElement(term3131, 1, 950322609);
        setIntElement(term3131, 2, -2023791789);
        setField(term3121, term3121.getClass(), "before", term3131);
        setIntElement(term3135, 0, 353974456);
        setIntElement(term3135, 1, -485108462);
        setIntElement(term3135, 2, 1418551216);
        setIntElement(term3135, 3, -626779272);
        setIntElement(term3135, 4, -1150062870);
        setIntElement(term3135, 5, -886200503);
        setIntElement(term3135, 6, 1136393691);
        setIntElement(term3135, 7, -1288536479);
        setField(term3121, term3121.getClass(), "size", term3135);
        setBooleanElement(term3144, 0, true);
        setBooleanElement(term3144, 1, true);
        setBooleanElement(term3144, 3, true);
        setBooleanElement(term3144, 4, true);
        setBooleanElement(term3144, 5, true);
        setField(term3121, term3121.getClass(), "solved", term3144);
        setIntField(term3121, term3121.getClass(), "numSolved", 1092038167);
        setField(term3152, term3152.getClass(), "graph", null);
        setField(term3152, term3152.getClass(), "comparator", null);
        setIntElement(term3153, 0, 1879729823);
        setIntElement(term3153, 1, 1443855558);
        setIntElement(term3153, 2, -1933419449);
        setField(term3152, term3152.getClass(), "keys", term3153);
        setIntElement(term3157, 0, -1804322375);
        setIntElement(term3157, 1, 1595814906);
        setField(term3152, term3152.getClass(), "positions", term3157);
        setIntField(term3152, term3152.getClass(), "size", -834193529);
        setField(term3121, term3121.getClass(), "heap", term3152);
        setField(term3121, term3121.getClass(), "heuristic", null);
        setField(term3121, term3121.getClass(), "graph", null);
        setBooleanField(term3121, term3121.getClass(), "directed", false);
        term3162 = new Integer(335780735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3162;
        callMethod(klass, "createPathEndingIn", argTypes, term3121, args);
    }

};


