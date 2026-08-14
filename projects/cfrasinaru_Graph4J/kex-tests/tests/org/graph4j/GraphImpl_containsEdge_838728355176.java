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

public class GraphImpl_containsEdge_838728355176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45479;
     Object term45490;
     Object term45492;

    public GraphImpl_containsEdge_838728355176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45479 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45479, term45479.getClass(), "name", null);
        setIntField(term45479, term45479.getClass(), "maxVertices", 0);
        setIntField(term45479, term45479.getClass(), "numVertices", 0);
        setLongField(term45479, term45479.getClass(), "numEdges", 0L);
        setField(term45479, term45479.getClass(), "vertices", null);
        setField(term45479, term45479.getClass(), "degree", null);
        setField(term45479, term45479.getClass(), "adjList", null);
        setField(term45479, term45479.getClass(), "adjPos", null);
        setField(term45479, term45479.getClass(), "vertexWeight", null);
        setIntField(term45479, term45479.getClass(), "vertexDataSize", 0);
        setField(term45479, term45479.getClass(), "edgeData", null);
        setIntField(term45479, term45479.getClass(), "edgeDataSize", 0);
        setField(term45479, term45479.getClass(), "vertexLabel", null);
        setField(term45479, term45479.getClass(), "edgeLabel", null);
        setField(term45479, term45479.getClass(), "vertexIndex", null);
        setField(term45479, term45479.getClass(), "adjSet", null);
        setField(term45479, term45479.getClass(), "adjMap", null);
        setField(term45479, term45479.getClass(), "maxVertexNumber", null);
        setField(term45479, term45479.getClass(), "labelVertexMap", null);
        setField(term45479, term45479.getClass(), "labelEdgeMap", null);
        setBooleanField(term45479, term45479.getClass(), "directed", false);
        setBooleanField(term45479, term45479.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45479, term45479.getClass(), "allowingSelfLoops", false);
        setIntField(term45479, term45479.getClass(), "avgDegree", 0);
        setBooleanField(term45479, term45479.getClass(), "safeMode", false);
        term45490 = new Integer(0);
        term45492 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45490;
        args[1] = term45492;
        callMethod(klass, "containsEdge", argTypes, term45479, args);
    }

};


