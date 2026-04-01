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

public class NetworkImpl_addEdge_59223991430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97334;
     Object term97347;
     Object term97349;
     Object term97351;

    public NetworkImpl_addEdge_59223991430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97334 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97334, term97334.getClass(), "source", 0);
        setIntField(term97334, term97334.getClass(), "sink", 0);
        setField(term97334, term97334.getClass(), "predList", null);
        setField(term97334, term97334.getClass(), "predPos", null);
        setField(term97334, term97334.getClass(), "indegree", null);
        setField(term97334, term97334.getClass(), "name", null);
        setIntField(term97334, term97334.getClass(), "maxVertices", 0);
        setIntField(term97334, term97334.getClass(), "numVertices", 0);
        setLongField(term97334, term97334.getClass(), "numEdges", 0L);
        setField(term97334, term97334.getClass(), "vertices", null);
        setField(term97334, term97334.getClass(), "degree", null);
        setField(term97334, term97334.getClass(), "adjList", null);
        setField(term97334, term97334.getClass(), "adjPos", null);
        setField(term97334, term97334.getClass(), "vertexWeight", null);
        setIntField(term97334, term97334.getClass(), "vertexDataSize", 0);
        setField(term97334, term97334.getClass(), "edgeData", null);
        setIntField(term97334, term97334.getClass(), "edgeDataSize", 0);
        setField(term97334, term97334.getClass(), "vertexLabel", null);
        setField(term97334, term97334.getClass(), "edgeLabel", null);
        setField(term97334, term97334.getClass(), "vertexIndex", null);
        setField(term97334, term97334.getClass(), "adjSet", null);
        setField(term97334, term97334.getClass(), "adjMap", null);
        setField(term97334, term97334.getClass(), "maxVertexNumber", null);
        setField(term97334, term97334.getClass(), "labelVertexMap", null);
        setField(term97334, term97334.getClass(), "labelEdgeMap", null);
        setBooleanField(term97334, term97334.getClass(), "directed", false);
        setBooleanField(term97334, term97334.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97334, term97334.getClass(), "allowingSelfLoops", false);
        setIntField(term97334, term97334.getClass(), "avgDegree", 0);
        setBooleanField(term97334, term97334.getClass(), "safeMode", false);
        term97347 = new Integer(0);
        term97349 = new Integer(0);
        term97351 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term97347;
        args[1] = term97349;
        args[2] = term97351;
        callMethod(klass, "addEdge", argTypes, term97334, args);
    }

};


