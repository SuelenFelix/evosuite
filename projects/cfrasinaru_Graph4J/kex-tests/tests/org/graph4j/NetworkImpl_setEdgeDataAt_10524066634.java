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

public class NetworkImpl_setEdgeDataAt_10524066634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97414;
     Object term97427;
     Object term97429;
     Object term97431;
     Object term97433;

    public NetworkImpl_setEdgeDataAt_10524066634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97414 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97414, term97414.getClass(), "source", 0);
        setIntField(term97414, term97414.getClass(), "sink", 0);
        setField(term97414, term97414.getClass(), "predList", null);
        setField(term97414, term97414.getClass(), "predPos", null);
        setField(term97414, term97414.getClass(), "indegree", null);
        setField(term97414, term97414.getClass(), "name", null);
        setIntField(term97414, term97414.getClass(), "maxVertices", 0);
        setIntField(term97414, term97414.getClass(), "numVertices", 0);
        setLongField(term97414, term97414.getClass(), "numEdges", 0L);
        setField(term97414, term97414.getClass(), "vertices", null);
        setField(term97414, term97414.getClass(), "degree", null);
        setField(term97414, term97414.getClass(), "adjList", null);
        setField(term97414, term97414.getClass(), "adjPos", null);
        setField(term97414, term97414.getClass(), "vertexWeight", null);
        setIntField(term97414, term97414.getClass(), "vertexDataSize", 0);
        setField(term97414, term97414.getClass(), "edgeData", null);
        setIntField(term97414, term97414.getClass(), "edgeDataSize", 0);
        setField(term97414, term97414.getClass(), "vertexLabel", null);
        setField(term97414, term97414.getClass(), "edgeLabel", null);
        setField(term97414, term97414.getClass(), "vertexIndex", null);
        setField(term97414, term97414.getClass(), "adjSet", null);
        setField(term97414, term97414.getClass(), "adjMap", null);
        setField(term97414, term97414.getClass(), "maxVertexNumber", null);
        setField(term97414, term97414.getClass(), "labelVertexMap", null);
        setField(term97414, term97414.getClass(), "labelEdgeMap", null);
        setBooleanField(term97414, term97414.getClass(), "directed", false);
        setBooleanField(term97414, term97414.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97414, term97414.getClass(), "allowingSelfLoops", false);
        setIntField(term97414, term97414.getClass(), "avgDegree", 0);
        setBooleanField(term97414, term97414.getClass(), "safeMode", false);
        term97427 = new Integer(0);
        term97429 = new Integer(0);
        term97431 = new Integer(0);
        term97433 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term97427;
        args[1] = term97429;
        args[2] = term97431;
        args[3] = term97433;
        callMethod(klass, "setEdgeDataAt", argTypes, term97414, args);
    }

};


