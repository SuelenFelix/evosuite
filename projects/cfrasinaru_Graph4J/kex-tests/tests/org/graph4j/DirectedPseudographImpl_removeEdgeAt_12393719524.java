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

public class DirectedPseudographImpl_removeEdgeAt_12393719524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84912;
     Object term84923;
     Object term84925;

    public DirectedPseudographImpl_removeEdgeAt_12393719524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84912 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84912, term84912.getClass(), "selfLoops", null);
        setField(term84912, term84912.getClass(), "predList", null);
        setField(term84912, term84912.getClass(), "predPos", null);
        setField(term84912, term84912.getClass(), "indegree", null);
        setField(term84912, term84912.getClass(), "name", null);
        setIntField(term84912, term84912.getClass(), "maxVertices", 0);
        setIntField(term84912, term84912.getClass(), "numVertices", 0);
        setLongField(term84912, term84912.getClass(), "numEdges", 0L);
        setField(term84912, term84912.getClass(), "vertices", null);
        setField(term84912, term84912.getClass(), "degree", null);
        setField(term84912, term84912.getClass(), "adjList", null);
        setField(term84912, term84912.getClass(), "adjPos", null);
        setField(term84912, term84912.getClass(), "vertexWeight", null);
        setIntField(term84912, term84912.getClass(), "vertexDataSize", 0);
        setField(term84912, term84912.getClass(), "edgeData", null);
        setIntField(term84912, term84912.getClass(), "edgeDataSize", 0);
        setField(term84912, term84912.getClass(), "vertexLabel", null);
        setField(term84912, term84912.getClass(), "edgeLabel", null);
        setField(term84912, term84912.getClass(), "vertexIndex", null);
        setField(term84912, term84912.getClass(), "adjSet", null);
        setField(term84912, term84912.getClass(), "adjMap", null);
        setField(term84912, term84912.getClass(), "maxVertexNumber", null);
        setField(term84912, term84912.getClass(), "labelVertexMap", null);
        setField(term84912, term84912.getClass(), "labelEdgeMap", null);
        setBooleanField(term84912, term84912.getClass(), "directed", false);
        setBooleanField(term84912, term84912.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84912, term84912.getClass(), "allowingSelfLoops", false);
        setIntField(term84912, term84912.getClass(), "avgDegree", 0);
        setBooleanField(term84912, term84912.getClass(), "safeMode", false);
        term84923 = new Integer(0);
        term84925 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term84923;
        args[1] = term84925;
        callMethod(klass, "removeEdgeAt", argTypes, term84912, args);
    }

};


