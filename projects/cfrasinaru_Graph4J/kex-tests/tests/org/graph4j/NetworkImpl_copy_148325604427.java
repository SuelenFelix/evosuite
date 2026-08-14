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

public class NetworkImpl_copy_148325604427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97288;

    public NetworkImpl_copy_148325604427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97288 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97288, term97288.getClass(), "source", 0);
        setIntField(term97288, term97288.getClass(), "sink", 0);
        setField(term97288, term97288.getClass(), "predList", null);
        setField(term97288, term97288.getClass(), "predPos", null);
        setField(term97288, term97288.getClass(), "indegree", null);
        setField(term97288, term97288.getClass(), "name", null);
        setIntField(term97288, term97288.getClass(), "maxVertices", 0);
        setIntField(term97288, term97288.getClass(), "numVertices", 0);
        setLongField(term97288, term97288.getClass(), "numEdges", 0L);
        setField(term97288, term97288.getClass(), "vertices", null);
        setField(term97288, term97288.getClass(), "degree", null);
        setField(term97288, term97288.getClass(), "adjList", null);
        setField(term97288, term97288.getClass(), "adjPos", null);
        setField(term97288, term97288.getClass(), "vertexWeight", null);
        setIntField(term97288, term97288.getClass(), "vertexDataSize", 0);
        setField(term97288, term97288.getClass(), "edgeData", null);
        setIntField(term97288, term97288.getClass(), "edgeDataSize", 0);
        setField(term97288, term97288.getClass(), "vertexLabel", null);
        setField(term97288, term97288.getClass(), "edgeLabel", null);
        setField(term97288, term97288.getClass(), "vertexIndex", null);
        setField(term97288, term97288.getClass(), "adjSet", null);
        setField(term97288, term97288.getClass(), "adjMap", null);
        setField(term97288, term97288.getClass(), "maxVertexNumber", null);
        setField(term97288, term97288.getClass(), "labelVertexMap", null);
        setField(term97288, term97288.getClass(), "labelEdgeMap", null);
        setBooleanField(term97288, term97288.getClass(), "directed", false);
        setBooleanField(term97288, term97288.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97288, term97288.getClass(), "allowingSelfLoops", false);
        setIntField(term97288, term97288.getClass(), "avgDegree", 0);
        setBooleanField(term97288, term97288.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term97288, args);
    }

};


