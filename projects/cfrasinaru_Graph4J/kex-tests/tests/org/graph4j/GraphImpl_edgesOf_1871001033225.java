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

public class GraphImpl_edgesOf_1871001033225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46138;
     Object term46149;

    public GraphImpl_edgesOf_1871001033225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46138 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46138, term46138.getClass(), "name", null);
        setIntField(term46138, term46138.getClass(), "maxVertices", 0);
        setIntField(term46138, term46138.getClass(), "numVertices", 0);
        setLongField(term46138, term46138.getClass(), "numEdges", 0L);
        setField(term46138, term46138.getClass(), "vertices", null);
        setField(term46138, term46138.getClass(), "degree", null);
        setField(term46138, term46138.getClass(), "adjList", null);
        setField(term46138, term46138.getClass(), "adjPos", null);
        setField(term46138, term46138.getClass(), "vertexWeight", null);
        setIntField(term46138, term46138.getClass(), "vertexDataSize", 0);
        setField(term46138, term46138.getClass(), "edgeData", null);
        setIntField(term46138, term46138.getClass(), "edgeDataSize", 0);
        setField(term46138, term46138.getClass(), "vertexLabel", null);
        setField(term46138, term46138.getClass(), "edgeLabel", null);
        setField(term46138, term46138.getClass(), "vertexIndex", null);
        setField(term46138, term46138.getClass(), "adjSet", null);
        setField(term46138, term46138.getClass(), "adjMap", null);
        setField(term46138, term46138.getClass(), "maxVertexNumber", null);
        setField(term46138, term46138.getClass(), "labelVertexMap", null);
        setField(term46138, term46138.getClass(), "labelEdgeMap", null);
        setBooleanField(term46138, term46138.getClass(), "directed", false);
        setBooleanField(term46138, term46138.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46138, term46138.getClass(), "allowingSelfLoops", false);
        setIntField(term46138, term46138.getClass(), "avgDegree", 0);
        setBooleanField(term46138, term46138.getClass(), "safeMode", false);
        term46149 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46149;
        callMethod(klass, "edgesOf", argTypes, term46138, args);
    }

};


