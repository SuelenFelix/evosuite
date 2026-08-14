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
     Object term97417;
     Object term97430;
     Object term97432;
     Object term97434;
     Object term97436;

    public NetworkImpl_setEdgeDataAt_10524066634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97417 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97417, term97417.getClass(), "source", 0);
        setIntField(term97417, term97417.getClass(), "sink", 0);
        setField(term97417, term97417.getClass(), "predList", null);
        setField(term97417, term97417.getClass(), "predPos", null);
        setField(term97417, term97417.getClass(), "indegree", null);
        setField(term97417, term97417.getClass(), "name", null);
        setIntField(term97417, term97417.getClass(), "maxVertices", 0);
        setIntField(term97417, term97417.getClass(), "numVertices", 0);
        setLongField(term97417, term97417.getClass(), "numEdges", 0L);
        setField(term97417, term97417.getClass(), "vertices", null);
        setField(term97417, term97417.getClass(), "degree", null);
        setField(term97417, term97417.getClass(), "adjList", null);
        setField(term97417, term97417.getClass(), "adjPos", null);
        setField(term97417, term97417.getClass(), "vertexWeight", null);
        setIntField(term97417, term97417.getClass(), "vertexDataSize", 0);
        setField(term97417, term97417.getClass(), "edgeData", null);
        setIntField(term97417, term97417.getClass(), "edgeDataSize", 0);
        setField(term97417, term97417.getClass(), "vertexLabel", null);
        setField(term97417, term97417.getClass(), "edgeLabel", null);
        setField(term97417, term97417.getClass(), "vertexIndex", null);
        setField(term97417, term97417.getClass(), "adjSet", null);
        setField(term97417, term97417.getClass(), "adjMap", null);
        setField(term97417, term97417.getClass(), "maxVertexNumber", null);
        setField(term97417, term97417.getClass(), "labelVertexMap", null);
        setField(term97417, term97417.getClass(), "labelEdgeMap", null);
        setBooleanField(term97417, term97417.getClass(), "directed", false);
        setBooleanField(term97417, term97417.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97417, term97417.getClass(), "allowingSelfLoops", false);
        setIntField(term97417, term97417.getClass(), "avgDegree", 0);
        setBooleanField(term97417, term97417.getClass(), "safeMode", false);
        term97430 = new Integer(0);
        term97432 = new Integer(0);
        term97434 = new Integer(0);
        term97436 = new Double(0.0);
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
        args[0] = term97430;
        args[1] = term97432;
        args[2] = term97434;
        args[3] = term97436;
        callMethod(klass, "setEdgeDataAt", argTypes, term97417, args);
    }

};


