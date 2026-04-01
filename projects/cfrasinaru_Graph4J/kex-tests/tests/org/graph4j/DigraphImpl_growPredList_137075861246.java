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

public class DigraphImpl_growPredList_137075861246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172438;
     Object term172449;

    public DigraphImpl_growPredList_137075861246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172438 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172438, term172438.getClass(), "predList", null);
        setField(term172438, term172438.getClass(), "predPos", null);
        setField(term172438, term172438.getClass(), "indegree", null);
        setField(term172438, term172438.getClass(), "name", null);
        setIntField(term172438, term172438.getClass(), "maxVertices", 0);
        setIntField(term172438, term172438.getClass(), "numVertices", 0);
        setLongField(term172438, term172438.getClass(), "numEdges", 0L);
        setField(term172438, term172438.getClass(), "vertices", null);
        setField(term172438, term172438.getClass(), "degree", null);
        setField(term172438, term172438.getClass(), "adjList", null);
        setField(term172438, term172438.getClass(), "adjPos", null);
        setField(term172438, term172438.getClass(), "vertexWeight", null);
        setIntField(term172438, term172438.getClass(), "vertexDataSize", 0);
        setField(term172438, term172438.getClass(), "edgeData", null);
        setIntField(term172438, term172438.getClass(), "edgeDataSize", 0);
        setField(term172438, term172438.getClass(), "vertexLabel", null);
        setField(term172438, term172438.getClass(), "edgeLabel", null);
        setField(term172438, term172438.getClass(), "vertexIndex", null);
        setField(term172438, term172438.getClass(), "adjSet", null);
        setField(term172438, term172438.getClass(), "adjMap", null);
        setField(term172438, term172438.getClass(), "maxVertexNumber", null);
        setField(term172438, term172438.getClass(), "labelVertexMap", null);
        setField(term172438, term172438.getClass(), "labelEdgeMap", null);
        setBooleanField(term172438, term172438.getClass(), "directed", false);
        setBooleanField(term172438, term172438.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172438, term172438.getClass(), "allowingSelfLoops", false);
        setIntField(term172438, term172438.getClass(), "avgDegree", 0);
        setBooleanField(term172438, term172438.getClass(), "safeMode", false);
        term172449 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term172449;
        callMethod(klass, "growPredList", argTypes, term172438, args);
    }

};


