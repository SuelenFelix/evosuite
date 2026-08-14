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

public class DigraphImpl_complement_170195210149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172478;

    public DigraphImpl_complement_170195210149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172478 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172478, term172478.getClass(), "predList", null);
        setField(term172478, term172478.getClass(), "predPos", null);
        setField(term172478, term172478.getClass(), "indegree", null);
        setField(term172478, term172478.getClass(), "name", null);
        setIntField(term172478, term172478.getClass(), "maxVertices", 0);
        setIntField(term172478, term172478.getClass(), "numVertices", 0);
        setLongField(term172478, term172478.getClass(), "numEdges", 0L);
        setField(term172478, term172478.getClass(), "vertices", null);
        setField(term172478, term172478.getClass(), "degree", null);
        setField(term172478, term172478.getClass(), "adjList", null);
        setField(term172478, term172478.getClass(), "adjPos", null);
        setField(term172478, term172478.getClass(), "vertexWeight", null);
        setIntField(term172478, term172478.getClass(), "vertexDataSize", 0);
        setField(term172478, term172478.getClass(), "edgeData", null);
        setIntField(term172478, term172478.getClass(), "edgeDataSize", 0);
        setField(term172478, term172478.getClass(), "vertexLabel", null);
        setField(term172478, term172478.getClass(), "edgeLabel", null);
        setField(term172478, term172478.getClass(), "vertexIndex", null);
        setField(term172478, term172478.getClass(), "adjSet", null);
        setField(term172478, term172478.getClass(), "adjMap", null);
        setField(term172478, term172478.getClass(), "maxVertexNumber", null);
        setField(term172478, term172478.getClass(), "labelVertexMap", null);
        setField(term172478, term172478.getClass(), "labelEdgeMap", null);
        setBooleanField(term172478, term172478.getClass(), "directed", false);
        setBooleanField(term172478, term172478.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172478, term172478.getClass(), "allowingSelfLoops", false);
        setIntField(term172478, term172478.getClass(), "avgDegree", 0);
        setBooleanField(term172478, term172478.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "complement", argTypes, term172478, args);
    }

};


