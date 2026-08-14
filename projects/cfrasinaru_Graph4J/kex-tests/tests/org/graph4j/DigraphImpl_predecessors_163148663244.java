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

public class DigraphImpl_predecessors_163148663244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172417;
     Object term172428;

    public DigraphImpl_predecessors_163148663244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172417 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172417, term172417.getClass(), "predList", null);
        setField(term172417, term172417.getClass(), "predPos", null);
        setField(term172417, term172417.getClass(), "indegree", null);
        setField(term172417, term172417.getClass(), "name", null);
        setIntField(term172417, term172417.getClass(), "maxVertices", 0);
        setIntField(term172417, term172417.getClass(), "numVertices", 0);
        setLongField(term172417, term172417.getClass(), "numEdges", 0L);
        setField(term172417, term172417.getClass(), "vertices", null);
        setField(term172417, term172417.getClass(), "degree", null);
        setField(term172417, term172417.getClass(), "adjList", null);
        setField(term172417, term172417.getClass(), "adjPos", null);
        setField(term172417, term172417.getClass(), "vertexWeight", null);
        setIntField(term172417, term172417.getClass(), "vertexDataSize", 0);
        setField(term172417, term172417.getClass(), "edgeData", null);
        setIntField(term172417, term172417.getClass(), "edgeDataSize", 0);
        setField(term172417, term172417.getClass(), "vertexLabel", null);
        setField(term172417, term172417.getClass(), "edgeLabel", null);
        setField(term172417, term172417.getClass(), "vertexIndex", null);
        setField(term172417, term172417.getClass(), "adjSet", null);
        setField(term172417, term172417.getClass(), "adjMap", null);
        setField(term172417, term172417.getClass(), "maxVertexNumber", null);
        setField(term172417, term172417.getClass(), "labelVertexMap", null);
        setField(term172417, term172417.getClass(), "labelEdgeMap", null);
        setBooleanField(term172417, term172417.getClass(), "directed", false);
        setBooleanField(term172417, term172417.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172417, term172417.getClass(), "allowingSelfLoops", false);
        setIntField(term172417, term172417.getClass(), "avgDegree", 0);
        setBooleanField(term172417, term172417.getClass(), "safeMode", false);
        term172428 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term172428;
        callMethod(klass, "predecessors", argTypes, term172417, args);
    }

};


