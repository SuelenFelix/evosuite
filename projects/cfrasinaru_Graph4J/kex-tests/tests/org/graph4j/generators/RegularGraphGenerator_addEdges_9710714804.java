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
import java.lang.Boolean;

public class RegularGraphGenerator_addEdges_9710714804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1472;
     Object term1479;

    public RegularGraphGenerator_addEdges_9710714804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1472 = newInstance(Class.forName("org.graph4j.generators.RegularGraphGenerator"));
        int[] term1474 = (int[]) newIntArray(4);
        setIntField(term1472, term1472.getClass(), "degree", -645429025);
        setIntElement(term1474, 0, -688213483);
        setIntElement(term1474, 1, 644154104);
        setIntElement(term1474, 2, 76650923);
        setIntElement(term1474, 3, 1003743923);
        setField(term1472, term1472.getClass(), "vertices", term1474);
        term1479 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RegularGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1479;
        callMethod(klass, "addEdges", argTypes, term1472, args);
    }

};


