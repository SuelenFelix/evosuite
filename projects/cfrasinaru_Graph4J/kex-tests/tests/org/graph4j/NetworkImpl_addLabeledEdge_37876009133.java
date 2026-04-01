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
     Object term97393;
     Object term97406;
     Object term97408;
     Object term97410;
     Object term97412;

    public NetworkImpl_addLabeledEdge_37876009133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97393 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97393, term97393.getClass(), "source", 0);
        setIntField(term97393, term97393.getClass(), "sink", 0);
        setField(term97393, term97393.getClass(), "predList", null);
        setField(term97393, term97393.getClass(), "predPos", null);
        setField(term97393, term97393.getClass(), "indegree", null);
        setField(term97393, term97393.getClass(), "name", null);
        setIntField(term97393, term97393.getClass(), "maxVertices", 0);
        setIntField(term97393, term97393.getClass(), "numVertices", 0);
        setLongField(term97393, term97393.getClass(), "numEdges", 0L);
        setField(term97393, term97393.getClass(), "vertices", null);
        setField(term97393, term97393.getClass(), "degree", null);
        setField(term97393, term97393.getClass(), "adjList", null);
        setField(term97393, term97393.getClass(), "adjPos", null);
        setField(term97393, term97393.getClass(), "vertexWeight", null);
        setIntField(term97393, term97393.getClass(), "vertexDataSize", 0);
        setField(term97393, term97393.getClass(), "edgeData", null);
        setIntField(term97393, term97393.getClass(), "edgeDataSize", 0);
        setField(term97393, term97393.getClass(), "vertexLabel", null);
        setField(term97393, term97393.getClass(), "edgeLabel", null);
        setField(term97393, term97393.getClass(), "vertexIndex", null);
        setField(term97393, term97393.getClass(), "adjSet", null);
        setField(term97393, term97393.getClass(), "adjMap", null);
        setField(term97393, term97393.getClass(), "maxVertexNumber", null);
        setField(term97393, term97393.getClass(), "labelVertexMap", null);
        setField(term97393, term97393.getClass(), "labelEdgeMap", null);
        setBooleanField(term97393, term97393.getClass(), "directed", false);
        setBooleanField(term97393, term97393.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97393, term97393.getClass(), "allowingSelfLoops", false);
        setIntField(term97393, term97393.getClass(), "avgDegree", 0);
        setBooleanField(term97393, term97393.getClass(), "safeMode", false);
        term97406 = new Integer(0);
        term97408 = new Integer(0);
        term97410 = new Double(0.0);
        term97412 = new Double(0.0);
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
        args[0] = term97406;
        args[1] = term97408;
        args[2] = null;
        args[3] = term97410;
        args[4] = term97412;
        callMethod(klass, "addLabeledEdge", argTypes, term97393, args);
    }

};


