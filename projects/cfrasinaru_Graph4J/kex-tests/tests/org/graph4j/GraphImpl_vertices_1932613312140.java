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

public class GraphImpl_vertices_1932613312140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44995;

    public GraphImpl_vertices_1932613312140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44995 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44995, term44995.getClass(), "name", null);
        setIntField(term44995, term44995.getClass(), "maxVertices", 0);
        setIntField(term44995, term44995.getClass(), "numVertices", 0);
        setLongField(term44995, term44995.getClass(), "numEdges", 0L);
        setField(term44995, term44995.getClass(), "vertices", null);
        setField(term44995, term44995.getClass(), "degree", null);
        setField(term44995, term44995.getClass(), "adjList", null);
        setField(term44995, term44995.getClass(), "adjPos", null);
        setField(term44995, term44995.getClass(), "vertexWeight", null);
        setIntField(term44995, term44995.getClass(), "vertexDataSize", 0);
        setField(term44995, term44995.getClass(), "edgeData", null);
        setIntField(term44995, term44995.getClass(), "edgeDataSize", 0);
        setField(term44995, term44995.getClass(), "vertexLabel", null);
        setField(term44995, term44995.getClass(), "edgeLabel", null);
        setField(term44995, term44995.getClass(), "vertexIndex", null);
        setField(term44995, term44995.getClass(), "adjSet", null);
        setField(term44995, term44995.getClass(), "adjMap", null);
        setField(term44995, term44995.getClass(), "maxVertexNumber", null);
        setField(term44995, term44995.getClass(), "labelVertexMap", null);
        setField(term44995, term44995.getClass(), "labelEdgeMap", null);
        setBooleanField(term44995, term44995.getClass(), "directed", false);
        setBooleanField(term44995, term44995.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44995, term44995.getClass(), "allowingSelfLoops", false);
        setIntField(term44995, term44995.getClass(), "avgDegree", 0);
        setBooleanField(term44995, term44995.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertices", argTypes, term44995, args);
    }

};


