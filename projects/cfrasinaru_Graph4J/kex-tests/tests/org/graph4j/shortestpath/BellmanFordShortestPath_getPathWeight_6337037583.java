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

public class BellmanFordShortestPath_getPathWeight_6337037583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2051;
     Object term2080;

    public BellmanFordShortestPath_getPathWeight_6337037583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2051 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term2053 = (double[]) newDoubleArray(7);
        int[] term2061 = (int[]) newIntArray(9);
        int[] term2071 = (int[]) newIntArray(7);
        setIntField(term2051, term2051.getClass(), "source", -100825168);
        setDoubleElement(term2053, 0, 0.18721227989825073);
        setDoubleElement(term2053, 1, 0.2131256081762306);
        setDoubleElement(term2053, 2, 0.03588195391803095);
        setDoubleElement(term2053, 3, 0.7965158013308613);
        setDoubleElement(term2053, 4, 0.2875565287844002);
        setDoubleElement(term2053, 5, 0.18556961666156768);
        setDoubleElement(term2053, 6, 0.41801713209224123);
        setField(term2051, term2051.getClass(), "cost", term2053);
        setIntElement(term2061, 0, 768407648);
        setIntElement(term2061, 1, -350454594);
        setIntElement(term2061, 2, -1148142995);
        setIntElement(term2061, 3, -233024044);
        setIntElement(term2061, 4, 1820784228);
        setIntElement(term2061, 5, 1390820006);
        setIntElement(term2061, 6, -828982065);
        setIntElement(term2061, 7, 1221443226);
        setIntElement(term2061, 8, 908108726);
        setField(term2051, term2051.getClass(), "before", term2061);
        setIntElement(term2071, 0, 1023209512);
        setIntElement(term2071, 1, 1084849225);
        setIntElement(term2071, 2, -1702055571);
        setIntElement(term2071, 3, -944542900);
        setIntElement(term2071, 4, 2063762142);
        setIntElement(term2071, 5, 1658391716);
        setIntElement(term2071, 6, 2143282300);
        setField(term2051, term2051.getClass(), "size", term2071);
        setField(term2051, term2051.getClass(), "graph", null);
        setBooleanField(term2051, term2051.getClass(), "directed", true);
        term2080 = new Integer(1137624258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2080;
        callMethod(klass, "getPathWeight", argTypes, term2051, args);
    }

};


