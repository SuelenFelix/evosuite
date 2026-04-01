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
     Object term172414;
     Object term172425;

    public DigraphImpl_predecessors_163148663244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172414 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172414, term172414.getClass(), "predList", null);
        setField(term172414, term172414.getClass(), "predPos", null);
        setField(term172414, term172414.getClass(), "indegree", null);
        setField(term172414, term172414.getClass(), "name", null);
        setIntField(term172414, term172414.getClass(), "maxVertices", 0);
        setIntField(term172414, term172414.getClass(), "numVertices", 0);
        setLongField(term172414, term172414.getClass(), "numEdges", 0L);
        setField(term172414, term172414.getClass(), "vertices", null);
        setField(term172414, term172414.getClass(), "degree", null);
        setField(term172414, term172414.getClass(), "adjList", null);
        setField(term172414, term172414.getClass(), "adjPos", null);
        setField(term172414, term172414.getClass(), "vertexWeight", null);
        setIntField(term172414, term172414.getClass(), "vertexDataSize", 0);
        setField(term172414, term172414.getClass(), "edgeData", null);
        setIntField(term172414, term172414.getClass(), "edgeDataSize", 0);
        setField(term172414, term172414.getClass(), "vertexLabel", null);
        setField(term172414, term172414.getClass(), "edgeLabel", null);
        setField(term172414, term172414.getClass(), "vertexIndex", null);
        setField(term172414, term172414.getClass(), "adjSet", null);
        setField(term172414, term172414.getClass(), "adjMap", null);
        setField(term172414, term172414.getClass(), "maxVertexNumber", null);
        setField(term172414, term172414.getClass(), "labelVertexMap", null);
        setField(term172414, term172414.getClass(), "labelEdgeMap", null);
        setBooleanField(term172414, term172414.getClass(), "directed", false);
        setBooleanField(term172414, term172414.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172414, term172414.getClass(), "allowingSelfLoops", false);
        setIntField(term172414, term172414.getClass(), "avgDegree", 0);
        setBooleanField(term172414, term172414.getClass(), "safeMode", false);
        term172425 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term172425;
        callMethod(klass, "predecessors", argTypes, term172414, args);
    }

};


