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
     Object term97464;
     Object term97477;

    public NetworkImpl_checkFlowOrPreflow_187098699737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97464 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97464, term97464.getClass(), "source", 0);
        setIntField(term97464, term97464.getClass(), "sink", 0);
        setField(term97464, term97464.getClass(), "predList", null);
        setField(term97464, term97464.getClass(), "predPos", null);
        setField(term97464, term97464.getClass(), "indegree", null);
        setField(term97464, term97464.getClass(), "name", null);
        setIntField(term97464, term97464.getClass(), "maxVertices", 0);
        setIntField(term97464, term97464.getClass(), "numVertices", 0);
        setLongField(term97464, term97464.getClass(), "numEdges", 0L);
        setField(term97464, term97464.getClass(), "vertices", null);
        setField(term97464, term97464.getClass(), "degree", null);
        setField(term97464, term97464.getClass(), "adjList", null);
        setField(term97464, term97464.getClass(), "adjPos", null);
        setField(term97464, term97464.getClass(), "vertexWeight", null);
        setIntField(term97464, term97464.getClass(), "vertexDataSize", 0);
        setField(term97464, term97464.getClass(), "edgeData", null);
        setIntField(term97464, term97464.getClass(), "edgeDataSize", 0);
        setField(term97464, term97464.getClass(), "vertexLabel", null);
        setField(term97464, term97464.getClass(), "edgeLabel", null);
        setField(term97464, term97464.getClass(), "vertexIndex", null);
        setField(term97464, term97464.getClass(), "adjSet", null);
        setField(term97464, term97464.getClass(), "adjMap", null);
        setField(term97464, term97464.getClass(), "maxVertexNumber", null);
        setField(term97464, term97464.getClass(), "labelVertexMap", null);
        setField(term97464, term97464.getClass(), "labelEdgeMap", null);
        setBooleanField(term97464, term97464.getClass(), "directed", false);
        setBooleanField(term97464, term97464.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97464, term97464.getClass(), "allowingSelfLoops", false);
        setIntField(term97464, term97464.getClass(), "avgDegree", 0);
        setBooleanField(term97464, term97464.getClass(), "safeMode", false);
        term97477 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term97477;
        callMethod(klass, "checkFlowOrPreflow", argTypes, term97464, args);
    }

};


