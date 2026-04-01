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

public class GraphImpl_removeEdge_461287132159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45248;
     Object term45259;
     Object term45261;

    public GraphImpl_removeEdge_461287132159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45248 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45248, term45248.getClass(), "name", null);
        setIntField(term45248, term45248.getClass(), "maxVertices", 0);
        setIntField(term45248, term45248.getClass(), "numVertices", 0);
        setLongField(term45248, term45248.getClass(), "numEdges", 0L);
        setField(term45248, term45248.getClass(), "vertices", null);
        setField(term45248, term45248.getClass(), "degree", null);
        setField(term45248, term45248.getClass(), "adjList", null);
        setField(term45248, term45248.getClass(), "adjPos", null);
        setField(term45248, term45248.getClass(), "vertexWeight", null);
        setIntField(term45248, term45248.getClass(), "vertexDataSize", 0);
        setField(term45248, term45248.getClass(), "edgeData", null);
        setIntField(term45248, term45248.getClass(), "edgeDataSize", 0);
        setField(term45248, term45248.getClass(), "vertexLabel", null);
        setField(term45248, term45248.getClass(), "edgeLabel", null);
        setField(term45248, term45248.getClass(), "vertexIndex", null);
        setField(term45248, term45248.getClass(), "adjSet", null);
        setField(term45248, term45248.getClass(), "adjMap", null);
        setField(term45248, term45248.getClass(), "maxVertexNumber", null);
        setField(term45248, term45248.getClass(), "labelVertexMap", null);
        setField(term45248, term45248.getClass(), "labelEdgeMap", null);
        setBooleanField(term45248, term45248.getClass(), "directed", false);
        setBooleanField(term45248, term45248.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45248, term45248.getClass(), "allowingSelfLoops", false);
        setIntField(term45248, term45248.getClass(), "avgDegree", 0);
        setBooleanField(term45248, term45248.getClass(), "safeMode", false);
        term45259 = new Integer(0);
        term45261 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45259;
        args[1] = term45261;
        callMethod(klass, "removeEdge", argTypes, term45248, args);
    }

};


