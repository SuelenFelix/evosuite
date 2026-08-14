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

public class DirectedMultigraphImpl_subgraph_1574470897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132477;

    public DirectedMultigraphImpl_subgraph_1574470897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132477 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term132477, term132477.getClass(), "predList", null);
        setField(term132477, term132477.getClass(), "predPos", null);
        setField(term132477, term132477.getClass(), "indegree", null);
        setField(term132477, term132477.getClass(), "name", null);
        setIntField(term132477, term132477.getClass(), "maxVertices", 0);
        setIntField(term132477, term132477.getClass(), "numVertices", 0);
        setLongField(term132477, term132477.getClass(), "numEdges", 0L);
        setField(term132477, term132477.getClass(), "vertices", null);
        setField(term132477, term132477.getClass(), "degree", null);
        setField(term132477, term132477.getClass(), "adjList", null);
        setField(term132477, term132477.getClass(), "adjPos", null);
        setField(term132477, term132477.getClass(), "vertexWeight", null);
        setIntField(term132477, term132477.getClass(), "vertexDataSize", 0);
        setField(term132477, term132477.getClass(), "edgeData", null);
        setIntField(term132477, term132477.getClass(), "edgeDataSize", 0);
        setField(term132477, term132477.getClass(), "vertexLabel", null);
        setField(term132477, term132477.getClass(), "edgeLabel", null);
        setField(term132477, term132477.getClass(), "vertexIndex", null);
        setField(term132477, term132477.getClass(), "adjSet", null);
        setField(term132477, term132477.getClass(), "adjMap", null);
        setField(term132477, term132477.getClass(), "maxVertexNumber", null);
        setField(term132477, term132477.getClass(), "labelVertexMap", null);
        setField(term132477, term132477.getClass(), "labelEdgeMap", null);
        setBooleanField(term132477, term132477.getClass(), "directed", false);
        setBooleanField(term132477, term132477.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term132477, term132477.getClass(), "allowingSelfLoops", false);
        setIntField(term132477, term132477.getClass(), "avgDegree", 0);
        setBooleanField(term132477, term132477.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term132477, args);
    }

};


