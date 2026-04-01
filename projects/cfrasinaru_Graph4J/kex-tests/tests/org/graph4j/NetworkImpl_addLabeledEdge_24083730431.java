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
     Object term97353;
     Object term97366;
     Object term97368;
     Object term97370;

    public NetworkImpl_addLabeledEdge_24083730431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97353 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97353, term97353.getClass(), "source", 0);
        setIntField(term97353, term97353.getClass(), "sink", 0);
        setField(term97353, term97353.getClass(), "predList", null);
        setField(term97353, term97353.getClass(), "predPos", null);
        setField(term97353, term97353.getClass(), "indegree", null);
        setField(term97353, term97353.getClass(), "name", null);
        setIntField(term97353, term97353.getClass(), "maxVertices", 0);
        setIntField(term97353, term97353.getClass(), "numVertices", 0);
        setLongField(term97353, term97353.getClass(), "numEdges", 0L);
        setField(term97353, term97353.getClass(), "vertices", null);
        setField(term97353, term97353.getClass(), "degree", null);
        setField(term97353, term97353.getClass(), "adjList", null);
        setField(term97353, term97353.getClass(), "adjPos", null);
        setField(term97353, term97353.getClass(), "vertexWeight", null);
        setIntField(term97353, term97353.getClass(), "vertexDataSize", 0);
        setField(term97353, term97353.getClass(), "edgeData", null);
        setIntField(term97353, term97353.getClass(), "edgeDataSize", 0);
        setField(term97353, term97353.getClass(), "vertexLabel", null);
        setField(term97353, term97353.getClass(), "edgeLabel", null);
        setField(term97353, term97353.getClass(), "vertexIndex", null);
        setField(term97353, term97353.getClass(), "adjSet", null);
        setField(term97353, term97353.getClass(), "adjMap", null);
        setField(term97353, term97353.getClass(), "maxVertexNumber", null);
        setField(term97353, term97353.getClass(), "labelVertexMap", null);
        setField(term97353, term97353.getClass(), "labelEdgeMap", null);
        setBooleanField(term97353, term97353.getClass(), "directed", false);
        setBooleanField(term97353, term97353.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97353, term97353.getClass(), "allowingSelfLoops", false);
        setIntField(term97353, term97353.getClass(), "avgDegree", 0);
        setBooleanField(term97353, term97353.getClass(), "safeMode", false);
        term97366 = new Integer(0);
        term97368 = new Integer(0);
        term97370 = new Double(0.0);
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
        args[0] = term97366;
        args[1] = term97368;
        args[2] = null;
        args[3] = term97370;
        callMethod(klass, "addLabeledEdge", argTypes, term97353, args);
    }

};


