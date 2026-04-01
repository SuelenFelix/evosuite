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
     Object term172464;

    public DigraphImpl_subgraph_202442832848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172464 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172464, term172464.getClass(), "predList", null);
        setField(term172464, term172464.getClass(), "predPos", null);
        setField(term172464, term172464.getClass(), "indegree", null);
        setField(term172464, term172464.getClass(), "name", null);
        setIntField(term172464, term172464.getClass(), "maxVertices", 0);
        setIntField(term172464, term172464.getClass(), "numVertices", 0);
        setLongField(term172464, term172464.getClass(), "numEdges", 0L);
        setField(term172464, term172464.getClass(), "vertices", null);
        setField(term172464, term172464.getClass(), "degree", null);
        setField(term172464, term172464.getClass(), "adjList", null);
        setField(term172464, term172464.getClass(), "adjPos", null);
        setField(term172464, term172464.getClass(), "vertexWeight", null);
        setIntField(term172464, term172464.getClass(), "vertexDataSize", 0);
        setField(term172464, term172464.getClass(), "edgeData", null);
        setIntField(term172464, term172464.getClass(), "edgeDataSize", 0);
        setField(term172464, term172464.getClass(), "vertexLabel", null);
        setField(term172464, term172464.getClass(), "edgeLabel", null);
        setField(term172464, term172464.getClass(), "vertexIndex", null);
        setField(term172464, term172464.getClass(), "adjSet", null);
        setField(term172464, term172464.getClass(), "adjMap", null);
        setField(term172464, term172464.getClass(), "maxVertexNumber", null);
        setField(term172464, term172464.getClass(), "labelVertexMap", null);
        setField(term172464, term172464.getClass(), "labelEdgeMap", null);
        setBooleanField(term172464, term172464.getClass(), "directed", false);
        setBooleanField(term172464, term172464.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172464, term172464.getClass(), "allowingSelfLoops", false);
        setIntField(term172464, term172464.getClass(), "avgDegree", 0);
        setBooleanField(term172464, term172464.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term172464, args);
    }

};


