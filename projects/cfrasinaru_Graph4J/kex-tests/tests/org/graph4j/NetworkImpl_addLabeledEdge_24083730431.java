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
import java.lang.Double;

public class NetworkImpl_addLabeledEdge_24083730431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97356;
     Object term97369;
     Object term97371;
     Object term97373;

    public NetworkImpl_addLabeledEdge_24083730431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97356 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97356, term97356.getClass(), "source", 0);
        setIntField(term97356, term97356.getClass(), "sink", 0);
        setField(term97356, term97356.getClass(), "predList", null);
        setField(term97356, term97356.getClass(), "predPos", null);
        setField(term97356, term97356.getClass(), "indegree", null);
        setField(term97356, term97356.getClass(), "name", null);
        setIntField(term97356, term97356.getClass(), "maxVertices", 0);
        setIntField(term97356, term97356.getClass(), "numVertices", 0);
        setLongField(term97356, term97356.getClass(), "numEdges", 0L);
        setField(term97356, term97356.getClass(), "vertices", null);
        setField(term97356, term97356.getClass(), "degree", null);
        setField(term97356, term97356.getClass(), "adjList", null);
        setField(term97356, term97356.getClass(), "adjPos", null);
        setField(term97356, term97356.getClass(), "vertexWeight", null);
        setIntField(term97356, term97356.getClass(), "vertexDataSize", 0);
        setField(term97356, term97356.getClass(), "edgeData", null);
        setIntField(term97356, term97356.getClass(), "edgeDataSize", 0);
        setField(term97356, term97356.getClass(), "vertexLabel", null);
        setField(term97356, term97356.getClass(), "edgeLabel", null);
        setField(term97356, term97356.getClass(), "vertexIndex", null);
        setField(term97356, term97356.getClass(), "adjSet", null);
        setField(term97356, term97356.getClass(), "adjMap", null);
        setField(term97356, term97356.getClass(), "maxVertexNumber", null);
        setField(term97356, term97356.getClass(), "labelVertexMap", null);
        setField(term97356, term97356.getClass(), "labelEdgeMap", null);
        setBooleanField(term97356, term97356.getClass(), "directed", false);
        setBooleanField(term97356, term97356.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97356, term97356.getClass(), "allowingSelfLoops", false);
        setIntField(term97356, term97356.getClass(), "avgDegree", 0);
        setBooleanField(term97356, term97356.getClass(), "safeMode", false);
        term97369 = new Integer(0);
        term97371 = new Integer(0);
        term97373 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term97369;
        args[1] = term97371;
        args[2] = null;
        args[3] = term97373;
        callMethod(klass, "addLabeledEdge", argTypes, term97356, args);
    }

};


