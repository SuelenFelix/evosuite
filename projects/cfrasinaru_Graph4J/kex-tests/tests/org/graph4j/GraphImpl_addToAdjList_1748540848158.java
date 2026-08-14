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

public class GraphImpl_addToAdjList_1748540848158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45233;
     Object term45244;
     Object term45246;

    public GraphImpl_addToAdjList_1748540848158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45233 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45233, term45233.getClass(), "name", null);
        setIntField(term45233, term45233.getClass(), "maxVertices", 0);
        setIntField(term45233, term45233.getClass(), "numVertices", 0);
        setLongField(term45233, term45233.getClass(), "numEdges", 0L);
        setField(term45233, term45233.getClass(), "vertices", null);
        setField(term45233, term45233.getClass(), "degree", null);
        setField(term45233, term45233.getClass(), "adjList", null);
        setField(term45233, term45233.getClass(), "adjPos", null);
        setField(term45233, term45233.getClass(), "vertexWeight", null);
        setIntField(term45233, term45233.getClass(), "vertexDataSize", 0);
        setField(term45233, term45233.getClass(), "edgeData", null);
        setIntField(term45233, term45233.getClass(), "edgeDataSize", 0);
        setField(term45233, term45233.getClass(), "vertexLabel", null);
        setField(term45233, term45233.getClass(), "edgeLabel", null);
        setField(term45233, term45233.getClass(), "vertexIndex", null);
        setField(term45233, term45233.getClass(), "adjSet", null);
        setField(term45233, term45233.getClass(), "adjMap", null);
        setField(term45233, term45233.getClass(), "maxVertexNumber", null);
        setField(term45233, term45233.getClass(), "labelVertexMap", null);
        setField(term45233, term45233.getClass(), "labelEdgeMap", null);
        setBooleanField(term45233, term45233.getClass(), "directed", false);
        setBooleanField(term45233, term45233.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45233, term45233.getClass(), "allowingSelfLoops", false);
        setIntField(term45233, term45233.getClass(), "avgDegree", 0);
        setBooleanField(term45233, term45233.getClass(), "safeMode", false);
        term45244 = new Integer(0);
        term45246 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45244;
        args[1] = term45246;
        callMethod(klass, "addToAdjList", argTypes, term45233, args);
    }

};


