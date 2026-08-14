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

public class BellmanFordShortestPath_createPathEndingIn_15597586116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2141;
     Object term2158;

    public BellmanFordShortestPath_createPathEndingIn_15597586116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2141 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term2143 = (double[]) newDoubleArray(0);
        int[] term2144 = (int[]) newIntArray(9);
        int[] term2154 = (int[]) newIntArray(2);
        setIntField(term2141, term2141.getClass(), "source", 787278105);
        setField(term2141, term2141.getClass(), "cost", term2143);
        setIntElement(term2144, 0, -2063843486);
        setIntElement(term2144, 1, 833762980);
        setIntElement(term2144, 2, 320711637);
        setIntElement(term2144, 3, 1241164745);
        setIntElement(term2144, 4, 1723148410);
        setIntElement(term2144, 5, -920797484);
        setIntElement(term2144, 6, -1631697577);
        setIntElement(term2144, 7, 765731371);
        setIntElement(term2144, 8, -1703035419);
        setField(term2141, term2141.getClass(), "before", term2144);
        setIntElement(term2154, 0, 765766290);
        setIntElement(term2154, 1, -1284825282);
        setField(term2141, term2141.getClass(), "size", term2154);
        setField(term2141, term2141.getClass(), "graph", null);
        setBooleanField(term2141, term2141.getClass(), "directed", true);
        term2158 = new Integer(-1941343035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2158;
        callMethod(klass, "createPathEndingIn", argTypes, term2141, args);
    }

};


