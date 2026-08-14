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

public class NetworkImpl_subgraph_41569733639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97494;

    public NetworkImpl_subgraph_41569733639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97494 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97494, term97494.getClass(), "source", 0);
        setIntField(term97494, term97494.getClass(), "sink", 0);
        setField(term97494, term97494.getClass(), "predList", null);
        setField(term97494, term97494.getClass(), "predPos", null);
        setField(term97494, term97494.getClass(), "indegree", null);
        setField(term97494, term97494.getClass(), "name", null);
        setIntField(term97494, term97494.getClass(), "maxVertices", 0);
        setIntField(term97494, term97494.getClass(), "numVertices", 0);
        setLongField(term97494, term97494.getClass(), "numEdges", 0L);
        setField(term97494, term97494.getClass(), "vertices", null);
        setField(term97494, term97494.getClass(), "degree", null);
        setField(term97494, term97494.getClass(), "adjList", null);
        setField(term97494, term97494.getClass(), "adjPos", null);
        setField(term97494, term97494.getClass(), "vertexWeight", null);
        setIntField(term97494, term97494.getClass(), "vertexDataSize", 0);
        setField(term97494, term97494.getClass(), "edgeData", null);
        setIntField(term97494, term97494.getClass(), "edgeDataSize", 0);
        setField(term97494, term97494.getClass(), "vertexLabel", null);
        setField(term97494, term97494.getClass(), "edgeLabel", null);
        setField(term97494, term97494.getClass(), "vertexIndex", null);
        setField(term97494, term97494.getClass(), "adjSet", null);
        setField(term97494, term97494.getClass(), "adjMap", null);
        setField(term97494, term97494.getClass(), "maxVertexNumber", null);
        setField(term97494, term97494.getClass(), "labelVertexMap", null);
        setField(term97494, term97494.getClass(), "labelEdgeMap", null);
        setBooleanField(term97494, term97494.getClass(), "directed", false);
        setBooleanField(term97494, term97494.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97494, term97494.getClass(), "allowingSelfLoops", false);
        setIntField(term97494, term97494.getClass(), "avgDegree", 0);
        setBooleanField(term97494, term97494.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term97494, args);
    }

};


