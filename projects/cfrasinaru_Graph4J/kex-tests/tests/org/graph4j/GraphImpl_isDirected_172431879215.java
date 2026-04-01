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

public class GraphImpl_isDirected_172431879215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46024;

    public GraphImpl_isDirected_172431879215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46024 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46024, term46024.getClass(), "name", null);
        setIntField(term46024, term46024.getClass(), "maxVertices", 0);
        setIntField(term46024, term46024.getClass(), "numVertices", 0);
        setLongField(term46024, term46024.getClass(), "numEdges", 0L);
        setField(term46024, term46024.getClass(), "vertices", null);
        setField(term46024, term46024.getClass(), "degree", null);
        setField(term46024, term46024.getClass(), "adjList", null);
        setField(term46024, term46024.getClass(), "adjPos", null);
        setField(term46024, term46024.getClass(), "vertexWeight", null);
        setIntField(term46024, term46024.getClass(), "vertexDataSize", 0);
        setField(term46024, term46024.getClass(), "edgeData", null);
        setIntField(term46024, term46024.getClass(), "edgeDataSize", 0);
        setField(term46024, term46024.getClass(), "vertexLabel", null);
        setField(term46024, term46024.getClass(), "edgeLabel", null);
        setField(term46024, term46024.getClass(), "vertexIndex", null);
        setField(term46024, term46024.getClass(), "adjSet", null);
        setField(term46024, term46024.getClass(), "adjMap", null);
        setField(term46024, term46024.getClass(), "maxVertexNumber", null);
        setField(term46024, term46024.getClass(), "labelVertexMap", null);
        setField(term46024, term46024.getClass(), "labelEdgeMap", null);
        setBooleanField(term46024, term46024.getClass(), "directed", false);
        setBooleanField(term46024, term46024.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46024, term46024.getClass(), "allowingSelfLoops", false);
        setIntField(term46024, term46024.getClass(), "avgDegree", 0);
        setBooleanField(term46024, term46024.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirected", argTypes, term46024, args);
    }

};


