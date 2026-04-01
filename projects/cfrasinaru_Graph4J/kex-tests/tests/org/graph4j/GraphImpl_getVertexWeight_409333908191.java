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

public class GraphImpl_getVertexWeight_409333908191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45672;
     Object term45683;

    public GraphImpl_getVertexWeight_409333908191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45672 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45672, term45672.getClass(), "name", null);
        setIntField(term45672, term45672.getClass(), "maxVertices", 0);
        setIntField(term45672, term45672.getClass(), "numVertices", 0);
        setLongField(term45672, term45672.getClass(), "numEdges", 0L);
        setField(term45672, term45672.getClass(), "vertices", null);
        setField(term45672, term45672.getClass(), "degree", null);
        setField(term45672, term45672.getClass(), "adjList", null);
        setField(term45672, term45672.getClass(), "adjPos", null);
        setField(term45672, term45672.getClass(), "vertexWeight", null);
        setIntField(term45672, term45672.getClass(), "vertexDataSize", 0);
        setField(term45672, term45672.getClass(), "edgeData", null);
        setIntField(term45672, term45672.getClass(), "edgeDataSize", 0);
        setField(term45672, term45672.getClass(), "vertexLabel", null);
        setField(term45672, term45672.getClass(), "edgeLabel", null);
        setField(term45672, term45672.getClass(), "vertexIndex", null);
        setField(term45672, term45672.getClass(), "adjSet", null);
        setField(term45672, term45672.getClass(), "adjMap", null);
        setField(term45672, term45672.getClass(), "maxVertexNumber", null);
        setField(term45672, term45672.getClass(), "labelVertexMap", null);
        setField(term45672, term45672.getClass(), "labelEdgeMap", null);
        setBooleanField(term45672, term45672.getClass(), "directed", false);
        setBooleanField(term45672, term45672.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45672, term45672.getClass(), "allowingSelfLoops", false);
        setIntField(term45672, term45672.getClass(), "avgDegree", 0);
        setBooleanField(term45672, term45672.getClass(), "safeMode", false);
        term45683 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45683;
        callMethod(klass, "getVertexWeight", argTypes, term45672, args);
    }

};


