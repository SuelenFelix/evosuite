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

public class BellmanFordShortestPath_createCycleEndingIn_10229764637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171;
     Object term2193;

    public BellmanFordShortestPath_createCycleEndingIn_10229764637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2171 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term2173 = (double[]) newDoubleArray(9);
        int[] term2183 = (int[]) newIntArray(7);
        int[] term2191 = (int[]) newIntArray(0);
        setIntField(term2171, term2171.getClass(), "source", 947897214);
        setDoubleElement(term2173, 0, 0.9412219458975137);
        setDoubleElement(term2173, 1, 0.06469331916225318);
        setDoubleElement(term2173, 2, 0.9259830415214885);
        setDoubleElement(term2173, 3, 0.6688842921741369);
        setDoubleElement(term2173, 4, 0.8067108928296716);
        setDoubleElement(term2173, 5, 0.6293118636954493);
        setDoubleElement(term2173, 6, 0.7705839211434976);
        setDoubleElement(term2173, 7, 0.08858836329417497);
        setDoubleElement(term2173, 8, 0.8582456540284578);
        setField(term2171, term2171.getClass(), "cost", term2173);
        setIntElement(term2183, 0, 1496340209);
        setIntElement(term2183, 1, -1748391876);
        setIntElement(term2183, 2, 43258317);
        setIntElement(term2183, 3, 1707220033);
        setIntElement(term2183, 4, -1792504217);
        setIntElement(term2183, 5, 1824538861);
        setIntElement(term2183, 6, 499519708);
        setField(term2171, term2171.getClass(), "before", term2183);
        setField(term2171, term2171.getClass(), "size", term2191);
        setField(term2171, term2171.getClass(), "graph", null);
        setBooleanField(term2171, term2171.getClass(), "directed", false);
        term2193 = new Integer(1501165033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2193;
        callMethod(klass, "createCycleEndingIn", argTypes, term2171, args);
    }

};


