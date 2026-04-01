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

public class DigraphImpl_indegree_87637638342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172390;
     Object term172401;

    public DigraphImpl_indegree_87637638342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172390 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172390, term172390.getClass(), "predList", null);
        setField(term172390, term172390.getClass(), "predPos", null);
        setField(term172390, term172390.getClass(), "indegree", null);
        setField(term172390, term172390.getClass(), "name", null);
        setIntField(term172390, term172390.getClass(), "maxVertices", 0);
        setIntField(term172390, term172390.getClass(), "numVertices", 0);
        setLongField(term172390, term172390.getClass(), "numEdges", 0L);
        setField(term172390, term172390.getClass(), "vertices", null);
        setField(term172390, term172390.getClass(), "degree", null);
        setField(term172390, term172390.getClass(), "adjList", null);
        setField(term172390, term172390.getClass(), "adjPos", null);
        setField(term172390, term172390.getClass(), "vertexWeight", null);
        setIntField(term172390, term172390.getClass(), "vertexDataSize", 0);
        setField(term172390, term172390.getClass(), "edgeData", null);
        setIntField(term172390, term172390.getClass(), "edgeDataSize", 0);
        setField(term172390, term172390.getClass(), "vertexLabel", null);
        setField(term172390, term172390.getClass(), "edgeLabel", null);
        setField(term172390, term172390.getClass(), "vertexIndex", null);
        setField(term172390, term172390.getClass(), "adjSet", null);
        setField(term172390, term172390.getClass(), "adjMap", null);
        setField(term172390, term172390.getClass(), "maxVertexNumber", null);
        setField(term172390, term172390.getClass(), "labelVertexMap", null);
        setField(term172390, term172390.getClass(), "labelEdgeMap", null);
        setBooleanField(term172390, term172390.getClass(), "directed", false);
        setBooleanField(term172390, term172390.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172390, term172390.getClass(), "allowingSelfLoops", false);
        setIntField(term172390, term172390.getClass(), "avgDegree", 0);
        setBooleanField(term172390, term172390.getClass(), "safeMode", false);
        term172401 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term172401;
        callMethod(klass, "indegree", argTypes, term172390, args);
    }

};


