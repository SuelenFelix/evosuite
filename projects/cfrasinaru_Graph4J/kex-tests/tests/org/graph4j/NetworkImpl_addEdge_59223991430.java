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
     Object term97337;
     Object term97350;
     Object term97352;
     Object term97354;

    public NetworkImpl_addEdge_59223991430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97337 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97337, term97337.getClass(), "source", 0);
        setIntField(term97337, term97337.getClass(), "sink", 0);
        setField(term97337, term97337.getClass(), "predList", null);
        setField(term97337, term97337.getClass(), "predPos", null);
        setField(term97337, term97337.getClass(), "indegree", null);
        setField(term97337, term97337.getClass(), "name", null);
        setIntField(term97337, term97337.getClass(), "maxVertices", 0);
        setIntField(term97337, term97337.getClass(), "numVertices", 0);
        setLongField(term97337, term97337.getClass(), "numEdges", 0L);
        setField(term97337, term97337.getClass(), "vertices", null);
        setField(term97337, term97337.getClass(), "degree", null);
        setField(term97337, term97337.getClass(), "adjList", null);
        setField(term97337, term97337.getClass(), "adjPos", null);
        setField(term97337, term97337.getClass(), "vertexWeight", null);
        setIntField(term97337, term97337.getClass(), "vertexDataSize", 0);
        setField(term97337, term97337.getClass(), "edgeData", null);
        setIntField(term97337, term97337.getClass(), "edgeDataSize", 0);
        setField(term97337, term97337.getClass(), "vertexLabel", null);
        setField(term97337, term97337.getClass(), "edgeLabel", null);
        setField(term97337, term97337.getClass(), "vertexIndex", null);
        setField(term97337, term97337.getClass(), "adjSet", null);
        setField(term97337, term97337.getClass(), "adjMap", null);
        setField(term97337, term97337.getClass(), "maxVertexNumber", null);
        setField(term97337, term97337.getClass(), "labelVertexMap", null);
        setField(term97337, term97337.getClass(), "labelEdgeMap", null);
        setBooleanField(term97337, term97337.getClass(), "directed", false);
        setBooleanField(term97337, term97337.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97337, term97337.getClass(), "allowingSelfLoops", false);
        setIntField(term97337, term97337.getClass(), "avgDegree", 0);
        setBooleanField(term97337, term97337.getClass(), "safeMode", false);
        term97350 = new Integer(0);
        term97352 = new Integer(0);
        term97354 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term97350;
        args[1] = term97352;
        args[2] = term97354;
        callMethod(klass, "addEdge", argTypes, term97337, args);
    }

};


