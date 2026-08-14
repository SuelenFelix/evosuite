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

public class RandomGnpBipartiteGenerator_addEdges_13593934207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050;

    public RandomGnpBipartiteGenerator_addEdges_13593934207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1050 = newInstance(Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator"));
        setDoubleField(term1050, term1050.getClass(), "edgeProbability", 0.0);
        setField(term1050, term1050.getClass(), "random", null);
        setIntField(term1050, term1050.getClass(), "first1", 0);
        setIntField(term1050, term1050.getClass(), "last1", 0);
        setIntField(term1050, term1050.getClass(), "first2", 0);
        setIntField(term1050, term1050.getClass(), "last2", 0);
        setField(term1050, term1050.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addEdges", argTypes, term1050, args);
    }

};


