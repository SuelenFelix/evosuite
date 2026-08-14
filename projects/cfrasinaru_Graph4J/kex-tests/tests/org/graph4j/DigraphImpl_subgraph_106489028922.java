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

public class DigraphImpl_subgraph_106489028922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169884;

    public DigraphImpl_subgraph_106489028922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169884 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term169884, term169884.getClass(), "predList", null);
        setField(term169884, term169884.getClass(), "predPos", null);
        setField(term169884, term169884.getClass(), "indegree", null);
        setField(term169884, term169884.getClass(), "name", null);
        setIntField(term169884, term169884.getClass(), "maxVertices", 0);
        setIntField(term169884, term169884.getClass(), "numVertices", 0);
        setLongField(term169884, term169884.getClass(), "numEdges", 0L);
        setField(term169884, term169884.getClass(), "vertices", null);
        setField(term169884, term169884.getClass(), "degree", null);
        setField(term169884, term169884.getClass(), "adjList", null);
        setField(term169884, term169884.getClass(), "adjPos", null);
        setField(term169884, term169884.getClass(), "vertexWeight", null);
        setIntField(term169884, term169884.getClass(), "vertexDataSize", 0);
        setField(term169884, term169884.getClass(), "edgeData", null);
        setIntField(term169884, term169884.getClass(), "edgeDataSize", 0);
        setField(term169884, term169884.getClass(), "vertexLabel", null);
        setField(term169884, term169884.getClass(), "edgeLabel", null);
        setField(term169884, term169884.getClass(), "vertexIndex", null);
        setField(term169884, term169884.getClass(), "adjSet", null);
        setField(term169884, term169884.getClass(), "adjMap", null);
        setField(term169884, term169884.getClass(), "maxVertexNumber", null);
        setField(term169884, term169884.getClass(), "labelVertexMap", null);
        setField(term169884, term169884.getClass(), "labelEdgeMap", null);
        setBooleanField(term169884, term169884.getClass(), "directed", false);
        setBooleanField(term169884, term169884.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term169884, term169884.getClass(), "allowingSelfLoops", false);
        setIntField(term169884, term169884.getClass(), "avgDegree", 0);
        setBooleanField(term169884, term169884.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term169884, args);
    }

};


