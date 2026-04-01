package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphBuilder_vertices_14345763145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178994;

    public GraphBuilder_vertices_14345763145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178994 = (int[]) newIntArray(9);
        setIntElement(term178994, 0, -1732279552);
        setIntElement(term178994, 1, 2132292308);
        setIntElement(term178994, 2, -823896386);
        setIntElement(term178994, 3, 1142535136);
        setIntElement(term178994, 4, -332816486);
        setIntElement(term178994, 5, -155401497);
        setIntElement(term178994, 6, -914967665);
        setIntElement(term178994, 7, -1866847156);
        setIntElement(term178994, 8, 1008069469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term178994;
        callMethod(klass, "vertices", argTypes, null, args);
    }

};


