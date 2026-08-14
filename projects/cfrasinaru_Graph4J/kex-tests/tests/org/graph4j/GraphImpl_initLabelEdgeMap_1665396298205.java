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

public class GraphImpl_initLabelEdgeMap_1665396298205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45896;

    public GraphImpl_initLabelEdgeMap_1665396298205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45896 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45896, term45896.getClass(), "name", null);
        setIntField(term45896, term45896.getClass(), "maxVertices", 0);
        setIntField(term45896, term45896.getClass(), "numVertices", 0);
        setLongField(term45896, term45896.getClass(), "numEdges", 0L);
        setField(term45896, term45896.getClass(), "vertices", null);
        setField(term45896, term45896.getClass(), "degree", null);
        setField(term45896, term45896.getClass(), "adjList", null);
        setField(term45896, term45896.getClass(), "adjPos", null);
        setField(term45896, term45896.getClass(), "vertexWeight", null);
        setIntField(term45896, term45896.getClass(), "vertexDataSize", 0);
        setField(term45896, term45896.getClass(), "edgeData", null);
        setIntField(term45896, term45896.getClass(), "edgeDataSize", 0);
        setField(term45896, term45896.getClass(), "vertexLabel", null);
        setField(term45896, term45896.getClass(), "edgeLabel", null);
        setField(term45896, term45896.getClass(), "vertexIndex", null);
        setField(term45896, term45896.getClass(), "adjSet", null);
        setField(term45896, term45896.getClass(), "adjMap", null);
        setField(term45896, term45896.getClass(), "maxVertexNumber", null);
        setField(term45896, term45896.getClass(), "labelVertexMap", null);
        setField(term45896, term45896.getClass(), "labelEdgeMap", null);
        setBooleanField(term45896, term45896.getClass(), "directed", false);
        setBooleanField(term45896, term45896.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45896, term45896.getClass(), "allowingSelfLoops", false);
        setIntField(term45896, term45896.getClass(), "avgDegree", 0);
        setBooleanField(term45896, term45896.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initLabelEdgeMap", argTypes, term45896, args);
    }

};


