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

public class DigraphImpl_subgraph_202442832848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172467;

    public DigraphImpl_subgraph_202442832848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172467 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172467, term172467.getClass(), "predList", null);
        setField(term172467, term172467.getClass(), "predPos", null);
        setField(term172467, term172467.getClass(), "indegree", null);
        setField(term172467, term172467.getClass(), "name", null);
        setIntField(term172467, term172467.getClass(), "maxVertices", 0);
        setIntField(term172467, term172467.getClass(), "numVertices", 0);
        setLongField(term172467, term172467.getClass(), "numEdges", 0L);
        setField(term172467, term172467.getClass(), "vertices", null);
        setField(term172467, term172467.getClass(), "degree", null);
        setField(term172467, term172467.getClass(), "adjList", null);
        setField(term172467, term172467.getClass(), "adjPos", null);
        setField(term172467, term172467.getClass(), "vertexWeight", null);
        setIntField(term172467, term172467.getClass(), "vertexDataSize", 0);
        setField(term172467, term172467.getClass(), "edgeData", null);
        setIntField(term172467, term172467.getClass(), "edgeDataSize", 0);
        setField(term172467, term172467.getClass(), "vertexLabel", null);
        setField(term172467, term172467.getClass(), "edgeLabel", null);
        setField(term172467, term172467.getClass(), "vertexIndex", null);
        setField(term172467, term172467.getClass(), "adjSet", null);
        setField(term172467, term172467.getClass(), "adjMap", null);
        setField(term172467, term172467.getClass(), "maxVertexNumber", null);
        setField(term172467, term172467.getClass(), "labelVertexMap", null);
        setField(term172467, term172467.getClass(), "labelEdgeMap", null);
        setBooleanField(term172467, term172467.getClass(), "directed", false);
        setBooleanField(term172467, term172467.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172467, term172467.getClass(), "allowingSelfLoops", false);
        setIntField(term172467, term172467.getClass(), "avgDegree", 0);
        setBooleanField(term172467, term172467.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term172467, args);
    }

};


