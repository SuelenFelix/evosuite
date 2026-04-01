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
import java.lang.Integer;

public class GraphImpl_swapNeighborWithLast_1924775868164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45319;
     Object term45330;
     Object term45332;

    public GraphImpl_swapNeighborWithLast_1924775868164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45319 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45319, term45319.getClass(), "name", null);
        setIntField(term45319, term45319.getClass(), "maxVertices", 0);
        setIntField(term45319, term45319.getClass(), "numVertices", 0);
        setLongField(term45319, term45319.getClass(), "numEdges", 0L);
        setField(term45319, term45319.getClass(), "vertices", null);
        setField(term45319, term45319.getClass(), "degree", null);
        setField(term45319, term45319.getClass(), "adjList", null);
        setField(term45319, term45319.getClass(), "adjPos", null);
        setField(term45319, term45319.getClass(), "vertexWeight", null);
        setIntField(term45319, term45319.getClass(), "vertexDataSize", 0);
        setField(term45319, term45319.getClass(), "edgeData", null);
        setIntField(term45319, term45319.getClass(), "edgeDataSize", 0);
        setField(term45319, term45319.getClass(), "vertexLabel", null);
        setField(term45319, term45319.getClass(), "edgeLabel", null);
        setField(term45319, term45319.getClass(), "vertexIndex", null);
        setField(term45319, term45319.getClass(), "adjSet", null);
        setField(term45319, term45319.getClass(), "adjMap", null);
        setField(term45319, term45319.getClass(), "maxVertexNumber", null);
        setField(term45319, term45319.getClass(), "labelVertexMap", null);
        setField(term45319, term45319.getClass(), "labelEdgeMap", null);
        setBooleanField(term45319, term45319.getClass(), "directed", false);
        setBooleanField(term45319, term45319.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45319, term45319.getClass(), "allowingSelfLoops", false);
        setIntField(term45319, term45319.getClass(), "avgDegree", 0);
        setBooleanField(term45319, term45319.getClass(), "safeMode", false);
        term45330 = new Integer(0);
        term45332 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45330;
        args[1] = term45332;
        callMethod(klass, "swapNeighborWithLast", argTypes, term45319, args);
    }

};


