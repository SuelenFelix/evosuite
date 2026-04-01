package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphGenerator_completeMultipartite_7191283507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2276;

    public GraphGenerator_completeMultipartite_7191283507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2276 = (int[]) newIntArray(8);
        setIntElement(term2276, 0, 716486048);
        setIntElement(term2276, 1, -466708718);
        setIntElement(term2276, 2, 1038029515);
        setIntElement(term2276, 3, 1137154606);
        setIntElement(term2276, 4, -100681578);
        setIntElement(term2276, 5, 296568835);
        setIntElement(term2276, 6, 1431951992);
        setIntElement(term2276, 7, -1608123016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.GraphGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2276;
        callMethod(klass, "completeMultipartite", argTypes, null, args);
    }

};


