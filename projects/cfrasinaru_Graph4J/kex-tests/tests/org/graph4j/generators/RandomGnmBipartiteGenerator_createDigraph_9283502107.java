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

public class RandomGnmBipartiteGenerator_createDigraph_9283502107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;

    public RandomGnmBipartiteGenerator_createDigraph_9283502107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term954 = newInstance(Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator"));
        setLongField(term954, term954.getClass(), "numEdges", 0L);
        setField(term954, term954.getClass(), "random", null);
        setIntField(term954, term954.getClass(), "first1", 0);
        setIntField(term954, term954.getClass(), "last1", 0);
        setIntField(term954, term954.getClass(), "first2", 0);
        setIntField(term954, term954.getClass(), "last2", 0);
        setField(term954, term954.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term954, args);
    }

};


