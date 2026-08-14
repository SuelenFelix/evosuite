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

public class PseudographImpl_subgraph_158846861622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118513;

    public PseudographImpl_subgraph_158846861622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118513 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118513, term118513.getClass(), "selfLoops", null);
        setField(term118513, term118513.getClass(), "name", null);
        setIntField(term118513, term118513.getClass(), "maxVertices", 0);
        setIntField(term118513, term118513.getClass(), "numVertices", 0);
        setLongField(term118513, term118513.getClass(), "numEdges", 0L);
        setField(term118513, term118513.getClass(), "vertices", null);
        setField(term118513, term118513.getClass(), "degree", null);
        setField(term118513, term118513.getClass(), "adjList", null);
        setField(term118513, term118513.getClass(), "adjPos", null);
        setField(term118513, term118513.getClass(), "vertexWeight", null);
        setIntField(term118513, term118513.getClass(), "vertexDataSize", 0);
        setField(term118513, term118513.getClass(), "edgeData", null);
        setIntField(term118513, term118513.getClass(), "edgeDataSize", 0);
        setField(term118513, term118513.getClass(), "vertexLabel", null);
        setField(term118513, term118513.getClass(), "edgeLabel", null);
        setField(term118513, term118513.getClass(), "vertexIndex", null);
        setField(term118513, term118513.getClass(), "adjSet", null);
        setField(term118513, term118513.getClass(), "adjMap", null);
        setField(term118513, term118513.getClass(), "maxVertexNumber", null);
        setField(term118513, term118513.getClass(), "labelVertexMap", null);
        setField(term118513, term118513.getClass(), "labelEdgeMap", null);
        setBooleanField(term118513, term118513.getClass(), "directed", false);
        setBooleanField(term118513, term118513.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118513, term118513.getClass(), "allowingSelfLoops", false);
        setIntField(term118513, term118513.getClass(), "avgDegree", 0);
        setBooleanField(term118513, term118513.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term118513, args);
    }

};


