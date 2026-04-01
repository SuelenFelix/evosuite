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

public class BFSSingleSourceShortestPath_compute_16178432856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;
     Object term569;

    public BFSSingleSourceShortestPath_compute_16178432856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term564 = (double[]) newDoubleArray(0);
        int[] term565 = (int[]) newIntArray(2);
        setIntField(term562, term562.getClass(), "source", 1386130016);
        setField(term562, term562.getClass(), "dist", term564);
        setIntElement(term565, 0, 1072005683);
        setIntElement(term565, 1, 1861318859);
        setField(term562, term562.getClass(), "before", term565);
        setField(term562, term562.getClass(), "graph", null);
        setBooleanField(term562, term562.getClass(), "directed", true);
        term569 = new Integer(1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term569;
        callMethod(klass, "compute", argTypes, term562, args);
    }

};


