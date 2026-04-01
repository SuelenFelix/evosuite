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
import java.lang.Boolean;

public class NetworkImpl_checkFlowOrPreflow_187098699737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97461;
     Object term97474;

    public NetworkImpl_checkFlowOrPreflow_187098699737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97461 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97461, term97461.getClass(), "source", 0);
        setIntField(term97461, term97461.getClass(), "sink", 0);
        setField(term97461, term97461.getClass(), "predList", null);
        setField(term97461, term97461.getClass(), "predPos", null);
        setField(term97461, term97461.getClass(), "indegree", null);
        setField(term97461, term97461.getClass(), "name", null);
        setIntField(term97461, term97461.getClass(), "maxVertices", 0);
        setIntField(term97461, term97461.getClass(), "numVertices", 0);
        setLongField(term97461, term97461.getClass(), "numEdges", 0L);
        setField(term97461, term97461.getClass(), "vertices", null);
        setField(term97461, term97461.getClass(), "degree", null);
        setField(term97461, term97461.getClass(), "adjList", null);
        setField(term97461, term97461.getClass(), "adjPos", null);
        setField(term97461, term97461.getClass(), "vertexWeight", null);
        setIntField(term97461, term97461.getClass(), "vertexDataSize", 0);
        setField(term97461, term97461.getClass(), "edgeData", null);
        setIntField(term97461, term97461.getClass(), "edgeDataSize", 0);
        setField(term97461, term97461.getClass(), "vertexLabel", null);
        setField(term97461, term97461.getClass(), "edgeLabel", null);
        setField(term97461, term97461.getClass(), "vertexIndex", null);
        setField(term97461, term97461.getClass(), "adjSet", null);
        setField(term97461, term97461.getClass(), "adjMap", null);
        setField(term97461, term97461.getClass(), "maxVertexNumber", null);
        setField(term97461, term97461.getClass(), "labelVertexMap", null);
        setField(term97461, term97461.getClass(), "labelEdgeMap", null);
        setBooleanField(term97461, term97461.getClass(), "directed", false);
        setBooleanField(term97461, term97461.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97461, term97461.getClass(), "allowingSelfLoops", false);
        setIntField(term97461, term97461.getClass(), "avgDegree", 0);
        setBooleanField(term97461, term97461.getClass(), "safeMode", false);
        term97474 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term97474;
        callMethod(klass, "checkFlowOrPreflow", argTypes, term97461, args);
    }

};


