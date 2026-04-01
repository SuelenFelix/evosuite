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

public class DigraphImpl_removeEdgeAt_53842917238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172332;
     Object term172343;
     Object term172345;

    public DigraphImpl_removeEdgeAt_53842917238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172332 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172332, term172332.getClass(), "predList", null);
        setField(term172332, term172332.getClass(), "predPos", null);
        setField(term172332, term172332.getClass(), "indegree", null);
        setField(term172332, term172332.getClass(), "name", null);
        setIntField(term172332, term172332.getClass(), "maxVertices", 0);
        setIntField(term172332, term172332.getClass(), "numVertices", 0);
        setLongField(term172332, term172332.getClass(), "numEdges", 0L);
        setField(term172332, term172332.getClass(), "vertices", null);
        setField(term172332, term172332.getClass(), "degree", null);
        setField(term172332, term172332.getClass(), "adjList", null);
        setField(term172332, term172332.getClass(), "adjPos", null);
        setField(term172332, term172332.getClass(), "vertexWeight", null);
        setIntField(term172332, term172332.getClass(), "vertexDataSize", 0);
        setField(term172332, term172332.getClass(), "edgeData", null);
        setIntField(term172332, term172332.getClass(), "edgeDataSize", 0);
        setField(term172332, term172332.getClass(), "vertexLabel", null);
        setField(term172332, term172332.getClass(), "edgeLabel", null);
        setField(term172332, term172332.getClass(), "vertexIndex", null);
        setField(term172332, term172332.getClass(), "adjSet", null);
        setField(term172332, term172332.getClass(), "adjMap", null);
        setField(term172332, term172332.getClass(), "maxVertexNumber", null);
        setField(term172332, term172332.getClass(), "labelVertexMap", null);
        setField(term172332, term172332.getClass(), "labelEdgeMap", null);
        setBooleanField(term172332, term172332.getClass(), "directed", false);
        setBooleanField(term172332, term172332.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172332, term172332.getClass(), "allowingSelfLoops", false);
        setIntField(term172332, term172332.getClass(), "avgDegree", 0);
        setBooleanField(term172332, term172332.getClass(), "safeMode", false);
        term172343 = new Integer(0);
        term172345 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172343;
        args[1] = term172345;
        callMethod(klass, "removeEdgeAt", argTypes, term172332, args);
    }

};


