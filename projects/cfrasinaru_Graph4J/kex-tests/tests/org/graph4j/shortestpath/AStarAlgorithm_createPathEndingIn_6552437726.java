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
     Object term122893;
     Object term122943;

    public AStarAlgorithm_createPathEndingIn_6552437726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122893 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term122896 = (int[]) newIntArray(3);
        double[] term122900 = (double[]) newDoubleArray(5);
        int[] term122906 = (int[]) newIntArray(4);
        int[] term122911 = (int[]) newIntArray(6);
        boolean[] term122918 = (boolean[]) newBooleanArray(1);
        Object term122921 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term122922 = (int[]) newIntArray(9);
        int[] term122932 = (int[]) newIntArray(8);
        setIntField(term122893, term122893.getClass(), "source", -672642370);
        setIntField(term122893, term122893.getClass(), "target", 40504609);
        setIntElement(term122896, 0, -894394178);
        setIntElement(term122896, 1, -1261594665);
        setIntElement(term122896, 2, 801078389);
        setField(term122893, term122893.getClass(), "vertices", term122896);
        setDoubleElement(term122900, 0, 0.5197871215299439);
        setDoubleElement(term122900, 1, 0.9500810525331352);
        setDoubleElement(term122900, 2, 0.6653508612371756);
        setDoubleElement(term122900, 3, 0.7847765753411003);
        setDoubleElement(term122900, 4, 0.4701656032896432);
        setField(term122893, term122893.getClass(), "cost", term122900);
        setIntElement(term122906, 0, -1086847742);
        setIntElement(term122906, 1, 1199895332);
        setIntElement(term122906, 2, 1966865362);
        setIntElement(term122906, 3, 1382092720);
        setField(term122893, term122893.getClass(), "before", term122906);
        setIntElement(term122911, 0, 1042080004);
        setIntElement(term122911, 1, -936417577);
        setIntElement(term122911, 2, -1847271541);
        setIntElement(term122911, 3, -1612901514);
        setIntElement(term122911, 4, 1449192632);
        setIntElement(term122911, 5, -1137450465);
        setField(term122893, term122893.getClass(), "size", term122911);
        setBooleanElement(term122918, 0, true);
        setField(term122893, term122893.getClass(), "solved", term122918);
        setIntField(term122893, term122893.getClass(), "numSolved", 883184031);
        setField(term122921, term122921.getClass(), "graph", null);
        setField(term122921, term122921.getClass(), "comparator", null);
        setIntElement(term122922, 0, 858732697);
        setIntElement(term122922, 1, -1883914353);
        setIntElement(term122922, 2, 1879420145);
        setIntElement(term122922, 3, -233477175);
        setIntElement(term122922, 4, -99935922);
        setIntElement(term122922, 5, 552578789);
        setIntElement(term122922, 6, -1306749786);
        setIntElement(term122922, 7, 328613508);
        setIntElement(term122922, 8, 829220352);
        setField(term122921, term122921.getClass(), "keys", term122922);
        setIntElement(term122932, 0, 542497856);
        setIntElement(term122932, 1, 1888229102);
        setIntElement(term122932, 2, -1305718028);
        setIntElement(term122932, 3, -1681421472);
        setIntElement(term122932, 4, 2112775128);
        setIntElement(term122932, 5, 384681987);
        setIntElement(term122932, 6, -1693128954);
        setIntElement(term122932, 7, 296134080);
        setField(term122921, term122921.getClass(), "positions", term122932);
        setIntField(term122921, term122921.getClass(), "size", 1115713370);
        setField(term122893, term122893.getClass(), "heap", term122921);
        setField(term122893, term122893.getClass(), "heuristic", null);
        setField(term122893, term122893.getClass(), "graph", null);
        setBooleanField(term122893, term122893.getClass(), "directed", true);
        term122943 = new Integer(-2083559391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term122943;
        callMethod(klass, "createPathEndingIn", argTypes, term122893, args);
    }

};


