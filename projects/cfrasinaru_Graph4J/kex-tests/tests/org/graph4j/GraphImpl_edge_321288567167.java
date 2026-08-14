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

public class GraphImpl_edge_321288567167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45366;
     Object term45377;
     Object term45379;

    public GraphImpl_edge_321288567167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45366 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45366, term45366.getClass(), "name", null);
        setIntField(term45366, term45366.getClass(), "maxVertices", 0);
        setIntField(term45366, term45366.getClass(), "numVertices", 0);
        setLongField(term45366, term45366.getClass(), "numEdges", 0L);
        setField(term45366, term45366.getClass(), "vertices", null);
        setField(term45366, term45366.getClass(), "degree", null);
        setField(term45366, term45366.getClass(), "adjList", null);
        setField(term45366, term45366.getClass(), "adjPos", null);
        setField(term45366, term45366.getClass(), "vertexWeight", null);
        setIntField(term45366, term45366.getClass(), "vertexDataSize", 0);
        setField(term45366, term45366.getClass(), "edgeData", null);
        setIntField(term45366, term45366.getClass(), "edgeDataSize", 0);
        setField(term45366, term45366.getClass(), "vertexLabel", null);
        setField(term45366, term45366.getClass(), "edgeLabel", null);
        setField(term45366, term45366.getClass(), "vertexIndex", null);
        setField(term45366, term45366.getClass(), "adjSet", null);
        setField(term45366, term45366.getClass(), "adjMap", null);
        setField(term45366, term45366.getClass(), "maxVertexNumber", null);
        setField(term45366, term45366.getClass(), "labelVertexMap", null);
        setField(term45366, term45366.getClass(), "labelEdgeMap", null);
        setBooleanField(term45366, term45366.getClass(), "directed", false);
        setBooleanField(term45366, term45366.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45366, term45366.getClass(), "allowingSelfLoops", false);
        setIntField(term45366, term45366.getClass(), "avgDegree", 0);
        setBooleanField(term45366, term45366.getClass(), "safeMode", false);
        term45377 = new Integer(0);
        term45379 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45377;
        args[1] = term45379;
        callMethod(klass, "edge", argTypes, term45366, args);
    }

};


