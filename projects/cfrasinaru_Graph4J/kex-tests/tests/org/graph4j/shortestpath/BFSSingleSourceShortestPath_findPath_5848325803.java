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
import java.lang.Integer;

public class BFSSingleSourceShortestPath_findPath_5848325803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483;
     Object term504;

    public BFSSingleSourceShortestPath_findPath_5848325803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term485 = (double[]) newDoubleArray(9);
        int[] term495 = (int[]) newIntArray(7);
        setIntField(term483, term483.getClass(), "source", 304775596);
        setDoubleElement(term485, 0, 0.5412182593116958);
        setDoubleElement(term485, 1, 0.16988691727397487);
        setDoubleElement(term485, 2, 0.39286935532362843);
        setDoubleElement(term485, 3, 0.11577948268926874);
        setDoubleElement(term485, 4, 0.5617009352394552);
        setDoubleElement(term485, 5, 0.09067063848644474);
        setDoubleElement(term485, 6, 0.268304014379393);
        setDoubleElement(term485, 7, 0.7171972879282721);
        setDoubleElement(term485, 8, 0.9006361024877096);
        setField(term483, term483.getClass(), "dist", term485);
        setIntElement(term495, 0, -1347665717);
        setIntElement(term495, 1, -1888585309);
        setIntElement(term495, 2, 683666002);
        setIntElement(term495, 3, 1596213415);
        setIntElement(term495, 4, -268815336);
        setIntElement(term495, 5, -1210583429);
        setIntElement(term495, 6, -663691365);
        setField(term483, term483.getClass(), "before", term495);
        setField(term483, term483.getClass(), "graph", null);
        setBooleanField(term483, term483.getClass(), "directed", false);
        term504 = new Integer(339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term504;
        callMethod(klass, "findPath", argTypes, term483, args);
    }

};


