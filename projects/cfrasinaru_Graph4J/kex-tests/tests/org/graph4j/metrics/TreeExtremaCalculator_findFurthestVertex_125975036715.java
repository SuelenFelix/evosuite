package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TreeExtremaCalculator_findFurthestVertex_125975036715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11811;
     Object term11814;

    public TreeExtremaCalculator_findFurthestVertex_125975036715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11811 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        setIntField(term11811, term11811.getClass(), "startVertex", 0);
        setField(term11811, term11811.getClass(), "diameter", null);
        setField(term11811, term11811.getClass(), "center", null);
        setField(term11811, term11811.getClass(), "periphery", null);
        setField(term11811, term11811.getClass(), "graph", null);
        setBooleanField(term11811, term11811.getClass(), "directed", false);
        term11814 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term11814;
        args[1] = null;
        callMethod(klass, "findFurthestVertex", argTypes, term11811, args);
    }

};


