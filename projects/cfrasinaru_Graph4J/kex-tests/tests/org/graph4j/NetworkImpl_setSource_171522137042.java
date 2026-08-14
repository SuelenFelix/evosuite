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

public class NetworkImpl_setSource_171522137042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97533;
     Object term97546;

    public NetworkImpl_setSource_171522137042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97533 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97533, term97533.getClass(), "source", 0);
        setIntField(term97533, term97533.getClass(), "sink", 0);
        setField(term97533, term97533.getClass(), "predList", null);
        setField(term97533, term97533.getClass(), "predPos", null);
        setField(term97533, term97533.getClass(), "indegree", null);
        setField(term97533, term97533.getClass(), "name", null);
        setIntField(term97533, term97533.getClass(), "maxVertices", 0);
        setIntField(term97533, term97533.getClass(), "numVertices", 0);
        setLongField(term97533, term97533.getClass(), "numEdges", 0L);
        setField(term97533, term97533.getClass(), "vertices", null);
        setField(term97533, term97533.getClass(), "degree", null);
        setField(term97533, term97533.getClass(), "adjList", null);
        setField(term97533, term97533.getClass(), "adjPos", null);
        setField(term97533, term97533.getClass(), "vertexWeight", null);
        setIntField(term97533, term97533.getClass(), "vertexDataSize", 0);
        setField(term97533, term97533.getClass(), "edgeData", null);
        setIntField(term97533, term97533.getClass(), "edgeDataSize", 0);
        setField(term97533, term97533.getClass(), "vertexLabel", null);
        setField(term97533, term97533.getClass(), "edgeLabel", null);
        setField(term97533, term97533.getClass(), "vertexIndex", null);
        setField(term97533, term97533.getClass(), "adjSet", null);
        setField(term97533, term97533.getClass(), "adjMap", null);
        setField(term97533, term97533.getClass(), "maxVertexNumber", null);
        setField(term97533, term97533.getClass(), "labelVertexMap", null);
        setField(term97533, term97533.getClass(), "labelEdgeMap", null);
        setBooleanField(term97533, term97533.getClass(), "directed", false);
        setBooleanField(term97533, term97533.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97533, term97533.getClass(), "allowingSelfLoops", false);
        setIntField(term97533, term97533.getClass(), "avgDegree", 0);
        setBooleanField(term97533, term97533.getClass(), "safeMode", false);
        term97546 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97546;
        callMethod(klass, "setSource", argTypes, term97533, args);
    }

};


