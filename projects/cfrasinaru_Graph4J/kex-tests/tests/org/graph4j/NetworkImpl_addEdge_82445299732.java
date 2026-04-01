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

public class NetworkImpl_addEdge_82445299732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97372;
     Object term97385;
     Object term97387;
     Object term97389;
     Object term97391;

    public NetworkImpl_addEdge_82445299732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97372 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97372, term97372.getClass(), "source", 0);
        setIntField(term97372, term97372.getClass(), "sink", 0);
        setField(term97372, term97372.getClass(), "predList", null);
        setField(term97372, term97372.getClass(), "predPos", null);
        setField(term97372, term97372.getClass(), "indegree", null);
        setField(term97372, term97372.getClass(), "name", null);
        setIntField(term97372, term97372.getClass(), "maxVertices", 0);
        setIntField(term97372, term97372.getClass(), "numVertices", 0);
        setLongField(term97372, term97372.getClass(), "numEdges", 0L);
        setField(term97372, term97372.getClass(), "vertices", null);
        setField(term97372, term97372.getClass(), "degree", null);
        setField(term97372, term97372.getClass(), "adjList", null);
        setField(term97372, term97372.getClass(), "adjPos", null);
        setField(term97372, term97372.getClass(), "vertexWeight", null);
        setIntField(term97372, term97372.getClass(), "vertexDataSize", 0);
        setField(term97372, term97372.getClass(), "edgeData", null);
        setIntField(term97372, term97372.getClass(), "edgeDataSize", 0);
        setField(term97372, term97372.getClass(), "vertexLabel", null);
        setField(term97372, term97372.getClass(), "edgeLabel", null);
        setField(term97372, term97372.getClass(), "vertexIndex", null);
        setField(term97372, term97372.getClass(), "adjSet", null);
        setField(term97372, term97372.getClass(), "adjMap", null);
        setField(term97372, term97372.getClass(), "maxVertexNumber", null);
        setField(term97372, term97372.getClass(), "labelVertexMap", null);
        setField(term97372, term97372.getClass(), "labelEdgeMap", null);
        setBooleanField(term97372, term97372.getClass(), "directed", false);
        setBooleanField(term97372, term97372.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97372, term97372.getClass(), "allowingSelfLoops", false);
        setIntField(term97372, term97372.getClass(), "avgDegree", 0);
        setBooleanField(term97372, term97372.getClass(), "safeMode", false);
        term97385 = new Integer(0);
        term97387 = new Integer(0);
        term97389 = new Double(0.0);
        term97391 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term97385;
        args[1] = term97387;
        args[2] = term97389;
        args[3] = term97391;
        callMethod(klass, "addEdge", argTypes, term97372, args);
    }

};


