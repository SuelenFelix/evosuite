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

public class NetworkImpl_subgraph_137523537517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94498;

    public NetworkImpl_subgraph_137523537517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94498 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term94498, term94498.getClass(), "source", 0);
        setIntField(term94498, term94498.getClass(), "sink", 0);
        setField(term94498, term94498.getClass(), "predList", null);
        setField(term94498, term94498.getClass(), "predPos", null);
        setField(term94498, term94498.getClass(), "indegree", null);
        setField(term94498, term94498.getClass(), "name", null);
        setIntField(term94498, term94498.getClass(), "maxVertices", 0);
        setIntField(term94498, term94498.getClass(), "numVertices", 0);
        setLongField(term94498, term94498.getClass(), "numEdges", 0L);
        setField(term94498, term94498.getClass(), "vertices", null);
        setField(term94498, term94498.getClass(), "degree", null);
        setField(term94498, term94498.getClass(), "adjList", null);
        setField(term94498, term94498.getClass(), "adjPos", null);
        setField(term94498, term94498.getClass(), "vertexWeight", null);
        setIntField(term94498, term94498.getClass(), "vertexDataSize", 0);
        setField(term94498, term94498.getClass(), "edgeData", null);
        setIntField(term94498, term94498.getClass(), "edgeDataSize", 0);
        setField(term94498, term94498.getClass(), "vertexLabel", null);
        setField(term94498, term94498.getClass(), "edgeLabel", null);
        setField(term94498, term94498.getClass(), "vertexIndex", null);
        setField(term94498, term94498.getClass(), "adjSet", null);
        setField(term94498, term94498.getClass(), "adjMap", null);
        setField(term94498, term94498.getClass(), "maxVertexNumber", null);
        setField(term94498, term94498.getClass(), "labelVertexMap", null);
        setField(term94498, term94498.getClass(), "labelEdgeMap", null);
        setBooleanField(term94498, term94498.getClass(), "directed", false);
        setBooleanField(term94498, term94498.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term94498, term94498.getClass(), "allowingSelfLoops", false);
        setIntField(term94498, term94498.getClass(), "avgDegree", 0);
        setBooleanField(term94498, term94498.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term94498, args);
    }

};


