package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BronKerboschCliqueIterator_countNeighbors_39560688113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;
     Object term1303;

    public BronKerboschCliqueIterator_countNeighbors_39560688113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1302 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        setField(term1302, term1302.getClass(), "adjMatrix", null);
        setField(term1302, term1302.getClass(), "stack", null);
        setField(term1302, term1302.getClass(), "workingClique", null);
        setField(term1302, term1302.getClass(), "currentClique", null);
        setField(term1302, term1302.getClass(), "graph", null);
        term1303 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term1303;
        args[1] = null;
        callMethod(klass, "countNeighbors", argTypes, term1302, args);
    }

};


