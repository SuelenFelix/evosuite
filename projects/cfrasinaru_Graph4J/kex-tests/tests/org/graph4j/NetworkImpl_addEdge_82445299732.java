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
     Object term97375;
     Object term97388;
     Object term97390;
     Object term97392;
     Object term97394;

    public NetworkImpl_addEdge_82445299732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97375 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97375, term97375.getClass(), "source", 0);
        setIntField(term97375, term97375.getClass(), "sink", 0);
        setField(term97375, term97375.getClass(), "predList", null);
        setField(term97375, term97375.getClass(), "predPos", null);
        setField(term97375, term97375.getClass(), "indegree", null);
        setField(term97375, term97375.getClass(), "name", null);
        setIntField(term97375, term97375.getClass(), "maxVertices", 0);
        setIntField(term97375, term97375.getClass(), "numVertices", 0);
        setLongField(term97375, term97375.getClass(), "numEdges", 0L);
        setField(term97375, term97375.getClass(), "vertices", null);
        setField(term97375, term97375.getClass(), "degree", null);
        setField(term97375, term97375.getClass(), "adjList", null);
        setField(term97375, term97375.getClass(), "adjPos", null);
        setField(term97375, term97375.getClass(), "vertexWeight", null);
        setIntField(term97375, term97375.getClass(), "vertexDataSize", 0);
        setField(term97375, term97375.getClass(), "edgeData", null);
        setIntField(term97375, term97375.getClass(), "edgeDataSize", 0);
        setField(term97375, term97375.getClass(), "vertexLabel", null);
        setField(term97375, term97375.getClass(), "edgeLabel", null);
        setField(term97375, term97375.getClass(), "vertexIndex", null);
        setField(term97375, term97375.getClass(), "adjSet", null);
        setField(term97375, term97375.getClass(), "adjMap", null);
        setField(term97375, term97375.getClass(), "maxVertexNumber", null);
        setField(term97375, term97375.getClass(), "labelVertexMap", null);
        setField(term97375, term97375.getClass(), "labelEdgeMap", null);
        setBooleanField(term97375, term97375.getClass(), "directed", false);
        setBooleanField(term97375, term97375.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97375, term97375.getClass(), "allowingSelfLoops", false);
        setIntField(term97375, term97375.getClass(), "avgDegree", 0);
        setBooleanField(term97375, term97375.getClass(), "safeMode", false);
        term97388 = new Integer(0);
        term97390 = new Integer(0);
        term97392 = new Double(0.0);
        term97394 = new Double(0.0);
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
        args[0] = term97388;
        args[1] = term97390;
        args[2] = term97392;
        args[3] = term97394;
        callMethod(klass, "addEdge", argTypes, term97375, args);
    }

};


