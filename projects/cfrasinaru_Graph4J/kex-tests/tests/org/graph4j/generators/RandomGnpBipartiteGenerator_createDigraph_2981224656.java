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

public class RandomGnpBipartiteGenerator_createDigraph_2981224656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1044;

    public RandomGnpBipartiteGenerator_createDigraph_2981224656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1044 = newInstance(Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator"));
        setDoubleField(term1044, term1044.getClass(), "edgeProbability", 0.0);
        setField(term1044, term1044.getClass(), "random", null);
        setIntField(term1044, term1044.getClass(), "first1", 0);
        setIntField(term1044, term1044.getClass(), "last1", 0);
        setIntField(term1044, term1044.getClass(), "first2", 0);
        setIntField(term1044, term1044.getClass(), "last2", 0);
        setField(term1044, term1044.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term1044, args);
    }

};


