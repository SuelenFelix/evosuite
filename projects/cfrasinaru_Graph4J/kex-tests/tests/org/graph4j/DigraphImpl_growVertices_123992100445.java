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

public class DigraphImpl_growVertices_123992100445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172430;

    public DigraphImpl_growVertices_123992100445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172430 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172430, term172430.getClass(), "predList", null);
        setField(term172430, term172430.getClass(), "predPos", null);
        setField(term172430, term172430.getClass(), "indegree", null);
        setField(term172430, term172430.getClass(), "name", null);
        setIntField(term172430, term172430.getClass(), "maxVertices", 0);
        setIntField(term172430, term172430.getClass(), "numVertices", 0);
        setLongField(term172430, term172430.getClass(), "numEdges", 0L);
        setField(term172430, term172430.getClass(), "vertices", null);
        setField(term172430, term172430.getClass(), "degree", null);
        setField(term172430, term172430.getClass(), "adjList", null);
        setField(term172430, term172430.getClass(), "adjPos", null);
        setField(term172430, term172430.getClass(), "vertexWeight", null);
        setIntField(term172430, term172430.getClass(), "vertexDataSize", 0);
        setField(term172430, term172430.getClass(), "edgeData", null);
        setIntField(term172430, term172430.getClass(), "edgeDataSize", 0);
        setField(term172430, term172430.getClass(), "vertexLabel", null);
        setField(term172430, term172430.getClass(), "edgeLabel", null);
        setField(term172430, term172430.getClass(), "vertexIndex", null);
        setField(term172430, term172430.getClass(), "adjSet", null);
        setField(term172430, term172430.getClass(), "adjMap", null);
        setField(term172430, term172430.getClass(), "maxVertexNumber", null);
        setField(term172430, term172430.getClass(), "labelVertexMap", null);
        setField(term172430, term172430.getClass(), "labelEdgeMap", null);
        setBooleanField(term172430, term172430.getClass(), "directed", false);
        setBooleanField(term172430, term172430.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172430, term172430.getClass(), "allowingSelfLoops", false);
        setIntField(term172430, term172430.getClass(), "avgDegree", 0);
        setBooleanField(term172430, term172430.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "growVertices", argTypes, term172430, args);
    }

};


