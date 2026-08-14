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

public class GraphImpl_subgraph_1745393361105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39267;

    public GraphImpl_subgraph_1745393361105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39267 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term39267, term39267.getClass(), "name", null);
        setIntField(term39267, term39267.getClass(), "maxVertices", 0);
        setIntField(term39267, term39267.getClass(), "numVertices", 0);
        setLongField(term39267, term39267.getClass(), "numEdges", 0L);
        setField(term39267, term39267.getClass(), "vertices", null);
        setField(term39267, term39267.getClass(), "degree", null);
        setField(term39267, term39267.getClass(), "adjList", null);
        setField(term39267, term39267.getClass(), "adjPos", null);
        setField(term39267, term39267.getClass(), "vertexWeight", null);
        setIntField(term39267, term39267.getClass(), "vertexDataSize", 0);
        setField(term39267, term39267.getClass(), "edgeData", null);
        setIntField(term39267, term39267.getClass(), "edgeDataSize", 0);
        setField(term39267, term39267.getClass(), "vertexLabel", null);
        setField(term39267, term39267.getClass(), "edgeLabel", null);
        setField(term39267, term39267.getClass(), "vertexIndex", null);
        setField(term39267, term39267.getClass(), "adjSet", null);
        setField(term39267, term39267.getClass(), "adjMap", null);
        setField(term39267, term39267.getClass(), "maxVertexNumber", null);
        setField(term39267, term39267.getClass(), "labelVertexMap", null);
        setField(term39267, term39267.getClass(), "labelEdgeMap", null);
        setBooleanField(term39267, term39267.getClass(), "directed", false);
        setBooleanField(term39267, term39267.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term39267, term39267.getClass(), "allowingSelfLoops", false);
        setIntField(term39267, term39267.getClass(), "avgDegree", 0);
        setBooleanField(term39267, term39267.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term39267, args);
    }

};


