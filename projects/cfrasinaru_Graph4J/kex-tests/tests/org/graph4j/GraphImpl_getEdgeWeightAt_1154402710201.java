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

public class GraphImpl_getEdgeWeightAt_1154402710201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45848;
     Object term45859;
     Object term45861;

    public GraphImpl_getEdgeWeightAt_1154402710201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45848 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45848, term45848.getClass(), "name", null);
        setIntField(term45848, term45848.getClass(), "maxVertices", 0);
        setIntField(term45848, term45848.getClass(), "numVertices", 0);
        setLongField(term45848, term45848.getClass(), "numEdges", 0L);
        setField(term45848, term45848.getClass(), "vertices", null);
        setField(term45848, term45848.getClass(), "degree", null);
        setField(term45848, term45848.getClass(), "adjList", null);
        setField(term45848, term45848.getClass(), "adjPos", null);
        setField(term45848, term45848.getClass(), "vertexWeight", null);
        setIntField(term45848, term45848.getClass(), "vertexDataSize", 0);
        setField(term45848, term45848.getClass(), "edgeData", null);
        setIntField(term45848, term45848.getClass(), "edgeDataSize", 0);
        setField(term45848, term45848.getClass(), "vertexLabel", null);
        setField(term45848, term45848.getClass(), "edgeLabel", null);
        setField(term45848, term45848.getClass(), "vertexIndex", null);
        setField(term45848, term45848.getClass(), "adjSet", null);
        setField(term45848, term45848.getClass(), "adjMap", null);
        setField(term45848, term45848.getClass(), "maxVertexNumber", null);
        setField(term45848, term45848.getClass(), "labelVertexMap", null);
        setField(term45848, term45848.getClass(), "labelEdgeMap", null);
        setBooleanField(term45848, term45848.getClass(), "directed", false);
        setBooleanField(term45848, term45848.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45848, term45848.getClass(), "allowingSelfLoops", false);
        setIntField(term45848, term45848.getClass(), "avgDegree", 0);
        setBooleanField(term45848, term45848.getClass(), "safeMode", false);
        term45859 = new Integer(0);
        term45861 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45859;
        args[1] = term45861;
        callMethod(klass, "getEdgeWeightAt", argTypes, term45848, args);
    }

};


