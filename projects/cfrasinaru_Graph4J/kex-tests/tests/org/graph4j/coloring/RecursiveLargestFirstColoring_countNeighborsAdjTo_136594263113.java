package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RecursiveLargestFirstColoring_countNeighborsAdjTo_136594263113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;
     Object term3602;

    public RecursiveLargestFirstColoring_countNeighborsAdjTo_136594263113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3601 = newInstance(Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring"));
        setField(term3601, term3601.getClass(), "graph", null);
        term3602 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.RecursiveLargestFirstColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3602;
        args[2] = null;
        callMethod(klass, "countNeighborsAdjTo", argTypes, term3601, args);
    }

};


