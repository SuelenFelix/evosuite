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
     Object term84909;
     Object term84920;
     Object term84922;

    public DirectedPseudographImpl_removeEdgeAt_12393719524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84909 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84909, term84909.getClass(), "selfLoops", null);
        setField(term84909, term84909.getClass(), "predList", null);
        setField(term84909, term84909.getClass(), "predPos", null);
        setField(term84909, term84909.getClass(), "indegree", null);
        setField(term84909, term84909.getClass(), "name", null);
        setIntField(term84909, term84909.getClass(), "maxVertices", 0);
        setIntField(term84909, term84909.getClass(), "numVertices", 0);
        setLongField(term84909, term84909.getClass(), "numEdges", 0L);
        setField(term84909, term84909.getClass(), "vertices", null);
        setField(term84909, term84909.getClass(), "degree", null);
        setField(term84909, term84909.getClass(), "adjList", null);
        setField(term84909, term84909.getClass(), "adjPos", null);
        setField(term84909, term84909.getClass(), "vertexWeight", null);
        setIntField(term84909, term84909.getClass(), "vertexDataSize", 0);
        setField(term84909, term84909.getClass(), "edgeData", null);
        setIntField(term84909, term84909.getClass(), "edgeDataSize", 0);
        setField(term84909, term84909.getClass(), "vertexLabel", null);
        setField(term84909, term84909.getClass(), "edgeLabel", null);
        setField(term84909, term84909.getClass(), "vertexIndex", null);
        setField(term84909, term84909.getClass(), "adjSet", null);
        setField(term84909, term84909.getClass(), "adjMap", null);
        setField(term84909, term84909.getClass(), "maxVertexNumber", null);
        setField(term84909, term84909.getClass(), "labelVertexMap", null);
        setField(term84909, term84909.getClass(), "labelEdgeMap", null);
        setBooleanField(term84909, term84909.getClass(), "directed", false);
        setBooleanField(term84909, term84909.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84909, term84909.getClass(), "allowingSelfLoops", false);
        setIntField(term84909, term84909.getClass(), "avgDegree", 0);
        setBooleanField(term84909, term84909.getClass(), "safeMode", false);
        term84920 = new Integer(0);
        term84922 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term84920;
        args[1] = term84922;
        callMethod(klass, "removeEdgeAt", argTypes, term84909, args);
    }

};


