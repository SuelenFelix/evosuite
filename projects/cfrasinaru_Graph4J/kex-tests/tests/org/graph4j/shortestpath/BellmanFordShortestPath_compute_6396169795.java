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

public class BellmanFordShortestPath_compute_6396169795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2127;

    public BellmanFordShortestPath_compute_6396169795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2127 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term2129 = (double[]) newDoubleArray(3);
        int[] term2133 = (int[]) newIntArray(1);
        int[] term2135 = (int[]) newIntArray(0);
        setIntField(term2127, term2127.getClass(), "source", 1334483645);
        setDoubleElement(term2129, 0, 0.22206025307636057);
        setDoubleElement(term2129, 1, 0.3762445362551795);
        setDoubleElement(term2129, 2, 0.6004517527698794);
        setField(term2127, term2127.getClass(), "cost", term2129);
        setIntElement(term2133, 0, 917513193);
        setField(term2127, term2127.getClass(), "before", term2133);
        setField(term2127, term2127.getClass(), "size", term2135);
        setField(term2127, term2127.getClass(), "graph", null);
        setBooleanField(term2127, term2127.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term2127, args);
    }

};


