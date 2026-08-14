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

public class GraphImpl_addEdge_1720200268152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45143;

    public GraphImpl_addEdge_1720200268152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45143 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45143, term45143.getClass(), "name", null);
        setIntField(term45143, term45143.getClass(), "maxVertices", 0);
        setIntField(term45143, term45143.getClass(), "numVertices", 0);
        setLongField(term45143, term45143.getClass(), "numEdges", 0L);
        setField(term45143, term45143.getClass(), "vertices", null);
        setField(term45143, term45143.getClass(), "degree", null);
        setField(term45143, term45143.getClass(), "adjList", null);
        setField(term45143, term45143.getClass(), "adjPos", null);
        setField(term45143, term45143.getClass(), "vertexWeight", null);
        setIntField(term45143, term45143.getClass(), "vertexDataSize", 0);
        setField(term45143, term45143.getClass(), "edgeData", null);
        setIntField(term45143, term45143.getClass(), "edgeDataSize", 0);
        setField(term45143, term45143.getClass(), "vertexLabel", null);
        setField(term45143, term45143.getClass(), "edgeLabel", null);
        setField(term45143, term45143.getClass(), "vertexIndex", null);
        setField(term45143, term45143.getClass(), "adjSet", null);
        setField(term45143, term45143.getClass(), "adjMap", null);
        setField(term45143, term45143.getClass(), "maxVertexNumber", null);
        setField(term45143, term45143.getClass(), "labelVertexMap", null);
        setField(term45143, term45143.getClass(), "labelEdgeMap", null);
        setBooleanField(term45143, term45143.getClass(), "directed", false);
        setBooleanField(term45143, term45143.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45143, term45143.getClass(), "allowingSelfLoops", false);
        setIntField(term45143, term45143.getClass(), "avgDegree", 0);
        setBooleanField(term45143, term45143.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEdge", argTypes, term45143, args);
    }

};


