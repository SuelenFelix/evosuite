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

public class GraphImpl_hashCode_1929517666240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46311;

    public GraphImpl_hashCode_1929517666240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46311 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46311, term46311.getClass(), "name", null);
        setIntField(term46311, term46311.getClass(), "maxVertices", 0);
        setIntField(term46311, term46311.getClass(), "numVertices", 0);
        setLongField(term46311, term46311.getClass(), "numEdges", 0L);
        setField(term46311, term46311.getClass(), "vertices", null);
        setField(term46311, term46311.getClass(), "degree", null);
        setField(term46311, term46311.getClass(), "adjList", null);
        setField(term46311, term46311.getClass(), "adjPos", null);
        setField(term46311, term46311.getClass(), "vertexWeight", null);
        setIntField(term46311, term46311.getClass(), "vertexDataSize", 0);
        setField(term46311, term46311.getClass(), "edgeData", null);
        setIntField(term46311, term46311.getClass(), "edgeDataSize", 0);
        setField(term46311, term46311.getClass(), "vertexLabel", null);
        setField(term46311, term46311.getClass(), "edgeLabel", null);
        setField(term46311, term46311.getClass(), "vertexIndex", null);
        setField(term46311, term46311.getClass(), "adjSet", null);
        setField(term46311, term46311.getClass(), "adjMap", null);
        setField(term46311, term46311.getClass(), "maxVertexNumber", null);
        setField(term46311, term46311.getClass(), "labelVertexMap", null);
        setField(term46311, term46311.getClass(), "labelEdgeMap", null);
        setBooleanField(term46311, term46311.getClass(), "directed", false);
        setBooleanField(term46311, term46311.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46311, term46311.getClass(), "allowingSelfLoops", false);
        setIntField(term46311, term46311.getClass(), "avgDegree", 0);
        setBooleanField(term46311, term46311.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term46311, args);
    }

};


