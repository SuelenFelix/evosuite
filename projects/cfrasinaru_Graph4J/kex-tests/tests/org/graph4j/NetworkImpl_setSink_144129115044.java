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

public class NetworkImpl_setSink_144129115044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97561;
     Object term97574;

    public NetworkImpl_setSink_144129115044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97561 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97561, term97561.getClass(), "source", 0);
        setIntField(term97561, term97561.getClass(), "sink", 0);
        setField(term97561, term97561.getClass(), "predList", null);
        setField(term97561, term97561.getClass(), "predPos", null);
        setField(term97561, term97561.getClass(), "indegree", null);
        setField(term97561, term97561.getClass(), "name", null);
        setIntField(term97561, term97561.getClass(), "maxVertices", 0);
        setIntField(term97561, term97561.getClass(), "numVertices", 0);
        setLongField(term97561, term97561.getClass(), "numEdges", 0L);
        setField(term97561, term97561.getClass(), "vertices", null);
        setField(term97561, term97561.getClass(), "degree", null);
        setField(term97561, term97561.getClass(), "adjList", null);
        setField(term97561, term97561.getClass(), "adjPos", null);
        setField(term97561, term97561.getClass(), "vertexWeight", null);
        setIntField(term97561, term97561.getClass(), "vertexDataSize", 0);
        setField(term97561, term97561.getClass(), "edgeData", null);
        setIntField(term97561, term97561.getClass(), "edgeDataSize", 0);
        setField(term97561, term97561.getClass(), "vertexLabel", null);
        setField(term97561, term97561.getClass(), "edgeLabel", null);
        setField(term97561, term97561.getClass(), "vertexIndex", null);
        setField(term97561, term97561.getClass(), "adjSet", null);
        setField(term97561, term97561.getClass(), "adjMap", null);
        setField(term97561, term97561.getClass(), "maxVertexNumber", null);
        setField(term97561, term97561.getClass(), "labelVertexMap", null);
        setField(term97561, term97561.getClass(), "labelEdgeMap", null);
        setBooleanField(term97561, term97561.getClass(), "directed", false);
        setBooleanField(term97561, term97561.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97561, term97561.getClass(), "allowingSelfLoops", false);
        setIntField(term97561, term97561.getClass(), "avgDegree", 0);
        setBooleanField(term97561, term97561.getClass(), "safeMode", false);
        term97574 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97574;
        callMethod(klass, "setSink", argTypes, term97561, args);
    }

};


