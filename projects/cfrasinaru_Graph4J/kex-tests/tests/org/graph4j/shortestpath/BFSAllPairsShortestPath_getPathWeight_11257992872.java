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

public class BFSAllPairsShortestPath_getPathWeight_11257992872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term105;
     Object term107;

    public BFSAllPairsShortestPath_getPathWeight_11257992872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        Object[] term79 = (Object[]) newArray("[D", 1);
        double[] term80 = (double[]) newDoubleArray(6);
        Object[] term87 = (Object[]) newArray("[I", 5);
        int[] term88 = (int[]) newIntArray(5);
        int[] term94 = (int[]) newIntArray(2);
        int[] term97 = (int[]) newIntArray(3);
        int[] term101 = (int[]) newIntArray(1);
        int[] term103 = (int[]) newIntArray(0);
        setDoubleElement(term80, 0, 0.6436713023569729);
        setDoubleElement(term80, 1, 0.7332741045694002);
        setDoubleElement(term80, 2, 0.4569171842750229);
        setDoubleElement(term80, 3, 0.8598297828918529);
        setDoubleElement(term80, 4, 0.43692187681405226);
        setDoubleElement(term80, 5, 0.7633268466829064);
        setElement(term79, 0, term80);
        setField(term78, term78.getClass(), "dist", term79);
        setIntElement(term88, 0, 597278769);
        setIntElement(term88, 1, -1685132342);
        setIntElement(term88, 2, -1456670397);
        setIntElement(term88, 3, 1622346318);
        setIntElement(term88, 4, 1048535127);
        setElement(term87, 0, term88);
        setIntElement(term94, 0, -655067527);
        setIntElement(term94, 1, -6029667);
        setElement(term87, 1, term94);
        setIntElement(term97, 0, -2068769794);
        setIntElement(term97, 1, -117576464);
        setIntElement(term97, 2, -1007160944);
        setElement(term87, 2, term97);
        setIntElement(term101, 0, 1135664017);
        setElement(term87, 3, term101);
        setElement(term87, 4, term103);
        setField(term78, term78.getClass(), "before", term87);
        setField(term78, term78.getClass(), "graph", null);
        setBooleanField(term78, term78.getClass(), "directed", false);
        term105 = new Integer(590364439);
        term107 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105;
        args[1] = term107;
        callMethod(klass, "getPathWeight", argTypes, term78, args);
    }

};


