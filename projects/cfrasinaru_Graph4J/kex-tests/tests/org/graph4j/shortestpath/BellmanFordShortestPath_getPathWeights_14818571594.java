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

public class BellmanFordShortestPath_getPathWeights_14818571594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2105;

    public BellmanFordShortestPath_getPathWeights_14818571594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2105 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term2107 = (double[]) newDoubleArray(1);
        int[] term2109 = (int[]) newIntArray(5);
        int[] term2115 = (int[]) newIntArray(2);
        setIntField(term2105, term2105.getClass(), "source", 977862393);
        setDoubleElement(term2107, 0, 0.010058361776520197);
        setField(term2105, term2105.getClass(), "cost", term2107);
        setIntElement(term2109, 0, 301401782);
        setIntElement(term2109, 1, 1988605357);
        setIntElement(term2109, 2, 808203320);
        setIntElement(term2109, 3, -544382127);
        setIntElement(term2109, 4, -1830198043);
        setField(term2105, term2105.getClass(), "before", term2109);
        setIntElement(term2115, 0, -439048495);
        setIntElement(term2115, 1, -1849105286);
        setField(term2105, term2105.getClass(), "size", term2115);
        setField(term2105, term2105.getClass(), "graph", null);
        setBooleanField(term2105, term2105.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term2105, args);
    }

};


