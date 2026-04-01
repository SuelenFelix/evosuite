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

public class NetworkImpl_initEdgeData_76971688229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97321;

    public NetworkImpl_initEdgeData_76971688229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97321 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97321, term97321.getClass(), "source", 0);
        setIntField(term97321, term97321.getClass(), "sink", 0);
        setField(term97321, term97321.getClass(), "predList", null);
        setField(term97321, term97321.getClass(), "predPos", null);
        setField(term97321, term97321.getClass(), "indegree", null);
        setField(term97321, term97321.getClass(), "name", null);
        setIntField(term97321, term97321.getClass(), "maxVertices", 0);
        setIntField(term97321, term97321.getClass(), "numVertices", 0);
        setLongField(term97321, term97321.getClass(), "numEdges", 0L);
        setField(term97321, term97321.getClass(), "vertices", null);
        setField(term97321, term97321.getClass(), "degree", null);
        setField(term97321, term97321.getClass(), "adjList", null);
        setField(term97321, term97321.getClass(), "adjPos", null);
        setField(term97321, term97321.getClass(), "vertexWeight", null);
        setIntField(term97321, term97321.getClass(), "vertexDataSize", 0);
        setField(term97321, term97321.getClass(), "edgeData", null);
        setIntField(term97321, term97321.getClass(), "edgeDataSize", 0);
        setField(term97321, term97321.getClass(), "vertexLabel", null);
        setField(term97321, term97321.getClass(), "edgeLabel", null);
        setField(term97321, term97321.getClass(), "vertexIndex", null);
        setField(term97321, term97321.getClass(), "adjSet", null);
        setField(term97321, term97321.getClass(), "adjMap", null);
        setField(term97321, term97321.getClass(), "maxVertexNumber", null);
        setField(term97321, term97321.getClass(), "labelVertexMap", null);
        setField(term97321, term97321.getClass(), "labelEdgeMap", null);
        setBooleanField(term97321, term97321.getClass(), "directed", false);
        setBooleanField(term97321, term97321.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97321, term97321.getClass(), "allowingSelfLoops", false);
        setIntField(term97321, term97321.getClass(), "avgDegree", 0);
        setBooleanField(term97321, term97321.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initEdgeData", argTypes, term97321, args);
    }

};


