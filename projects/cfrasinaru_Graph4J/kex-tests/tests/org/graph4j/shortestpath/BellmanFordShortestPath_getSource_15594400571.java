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

public class BellmanFordShortestPath_getSource_15594400571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1979;

    public BellmanFordShortestPath_getSource_15594400571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1979 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term1981 = (double[]) newDoubleArray(5);
        int[] term1987 = (int[]) newIntArray(5);
        int[] term1993 = (int[]) newIntArray(2);
        setIntField(term1979, term1979.getClass(), "source", 719656595);
        setDoubleElement(term1981, 0, 0.5125207579363754);
        setDoubleElement(term1981, 1, 0.1682247220070444);
        setDoubleElement(term1981, 2, 0.040825355718595024);
        setDoubleElement(term1981, 3, 0.19754021671358302);
        setDoubleElement(term1981, 4, 0.905102212387978);
        setField(term1979, term1979.getClass(), "cost", term1981);
        setIntElement(term1987, 0, -1516995753);
        setIntElement(term1987, 1, -390501023);
        setIntElement(term1987, 2, -1667482829);
        setIntElement(term1987, 3, 1116576792);
        setIntElement(term1987, 4, -942194446);
        setField(term1979, term1979.getClass(), "before", term1987);
        setIntElement(term1993, 0, -938508470);
        setIntElement(term1993, 1, 1242676024);
        setField(term1979, term1979.getClass(), "size", term1993);
        setField(term1979, term1979.getClass(), "graph", null);
        setBooleanField(term1979, term1979.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term1979, args);
    }

};


