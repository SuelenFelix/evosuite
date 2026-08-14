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

public class GraphImpl_subgraph_1590035896226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46151;

    public GraphImpl_subgraph_1590035896226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46151 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46151, term46151.getClass(), "name", null);
        setIntField(term46151, term46151.getClass(), "maxVertices", 0);
        setIntField(term46151, term46151.getClass(), "numVertices", 0);
        setLongField(term46151, term46151.getClass(), "numEdges", 0L);
        setField(term46151, term46151.getClass(), "vertices", null);
        setField(term46151, term46151.getClass(), "degree", null);
        setField(term46151, term46151.getClass(), "adjList", null);
        setField(term46151, term46151.getClass(), "adjPos", null);
        setField(term46151, term46151.getClass(), "vertexWeight", null);
        setIntField(term46151, term46151.getClass(), "vertexDataSize", 0);
        setField(term46151, term46151.getClass(), "edgeData", null);
        setIntField(term46151, term46151.getClass(), "edgeDataSize", 0);
        setField(term46151, term46151.getClass(), "vertexLabel", null);
        setField(term46151, term46151.getClass(), "edgeLabel", null);
        setField(term46151, term46151.getClass(), "vertexIndex", null);
        setField(term46151, term46151.getClass(), "adjSet", null);
        setField(term46151, term46151.getClass(), "adjMap", null);
        setField(term46151, term46151.getClass(), "maxVertexNumber", null);
        setField(term46151, term46151.getClass(), "labelVertexMap", null);
        setField(term46151, term46151.getClass(), "labelEdgeMap", null);
        setBooleanField(term46151, term46151.getClass(), "directed", false);
        setBooleanField(term46151, term46151.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46151, term46151.getClass(), "allowingSelfLoops", false);
        setIntField(term46151, term46151.getClass(), "avgDegree", 0);
        setBooleanField(term46151, term46151.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term46151, args);
    }

};


