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
import java.lang.Boolean;

public class NetworkImpl_copy_59575239428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97298;
     Object term97311;
     Object term97313;
     Object term97315;
     Object term97317;
     Object term97319;

    public NetworkImpl_copy_59575239428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97298 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97298, term97298.getClass(), "source", 0);
        setIntField(term97298, term97298.getClass(), "sink", 0);
        setField(term97298, term97298.getClass(), "predList", null);
        setField(term97298, term97298.getClass(), "predPos", null);
        setField(term97298, term97298.getClass(), "indegree", null);
        setField(term97298, term97298.getClass(), "name", null);
        setIntField(term97298, term97298.getClass(), "maxVertices", 0);
        setIntField(term97298, term97298.getClass(), "numVertices", 0);
        setLongField(term97298, term97298.getClass(), "numEdges", 0L);
        setField(term97298, term97298.getClass(), "vertices", null);
        setField(term97298, term97298.getClass(), "degree", null);
        setField(term97298, term97298.getClass(), "adjList", null);
        setField(term97298, term97298.getClass(), "adjPos", null);
        setField(term97298, term97298.getClass(), "vertexWeight", null);
        setIntField(term97298, term97298.getClass(), "vertexDataSize", 0);
        setField(term97298, term97298.getClass(), "edgeData", null);
        setIntField(term97298, term97298.getClass(), "edgeDataSize", 0);
        setField(term97298, term97298.getClass(), "vertexLabel", null);
        setField(term97298, term97298.getClass(), "edgeLabel", null);
        setField(term97298, term97298.getClass(), "vertexIndex", null);
        setField(term97298, term97298.getClass(), "adjSet", null);
        setField(term97298, term97298.getClass(), "adjMap", null);
        setField(term97298, term97298.getClass(), "maxVertexNumber", null);
        setField(term97298, term97298.getClass(), "labelVertexMap", null);
        setField(term97298, term97298.getClass(), "labelEdgeMap", null);
        setBooleanField(term97298, term97298.getClass(), "directed", false);
        setBooleanField(term97298, term97298.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97298, term97298.getClass(), "allowingSelfLoops", false);
        setIntField(term97298, term97298.getClass(), "avgDegree", 0);
        setBooleanField(term97298, term97298.getClass(), "safeMode", false);
        term97311 = new Boolean(false);
        term97313 = new Boolean(false);
        term97315 = new Boolean(false);
        term97317 = new Boolean(false);
        term97319 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term97311;
        args[1] = term97313;
        args[2] = term97315;
        args[3] = term97317;
        args[4] = term97319;
        callMethod(klass, "copy", argTypes, term97298, args);
    }

};


