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

public class NetworkImpl_addLabeledEdge_37876009133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97396;
     Object term97409;
     Object term97411;
     Object term97413;
     Object term97415;

    public NetworkImpl_addLabeledEdge_37876009133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97396 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97396, term97396.getClass(), "source", 0);
        setIntField(term97396, term97396.getClass(), "sink", 0);
        setField(term97396, term97396.getClass(), "predList", null);
        setField(term97396, term97396.getClass(), "predPos", null);
        setField(term97396, term97396.getClass(), "indegree", null);
        setField(term97396, term97396.getClass(), "name", null);
        setIntField(term97396, term97396.getClass(), "maxVertices", 0);
        setIntField(term97396, term97396.getClass(), "numVertices", 0);
        setLongField(term97396, term97396.getClass(), "numEdges", 0L);
        setField(term97396, term97396.getClass(), "vertices", null);
        setField(term97396, term97396.getClass(), "degree", null);
        setField(term97396, term97396.getClass(), "adjList", null);
        setField(term97396, term97396.getClass(), "adjPos", null);
        setField(term97396, term97396.getClass(), "vertexWeight", null);
        setIntField(term97396, term97396.getClass(), "vertexDataSize", 0);
        setField(term97396, term97396.getClass(), "edgeData", null);
        setIntField(term97396, term97396.getClass(), "edgeDataSize", 0);
        setField(term97396, term97396.getClass(), "vertexLabel", null);
        setField(term97396, term97396.getClass(), "edgeLabel", null);
        setField(term97396, term97396.getClass(), "vertexIndex", null);
        setField(term97396, term97396.getClass(), "adjSet", null);
        setField(term97396, term97396.getClass(), "adjMap", null);
        setField(term97396, term97396.getClass(), "maxVertexNumber", null);
        setField(term97396, term97396.getClass(), "labelVertexMap", null);
        setField(term97396, term97396.getClass(), "labelEdgeMap", null);
        setBooleanField(term97396, term97396.getClass(), "directed", false);
        setBooleanField(term97396, term97396.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97396, term97396.getClass(), "allowingSelfLoops", false);
        setIntField(term97396, term97396.getClass(), "avgDegree", 0);
        setBooleanField(term97396, term97396.getClass(), "safeMode", false);
        term97409 = new Integer(0);
        term97411 = new Integer(0);
        term97413 = new Double(0.0);
        term97415 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term97409;
        args[1] = term97411;
        args[2] = null;
        args[3] = term97413;
        args[4] = term97415;
        callMethod(klass, "addLabeledEdge", argTypes, term97396, args);
    }

};


