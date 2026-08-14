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

public class DigraphImpl_removeAllEdgesAt_27628331040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172365;
     Object term172376;

    public DigraphImpl_removeAllEdgesAt_27628331040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172365 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172365, term172365.getClass(), "predList", null);
        setField(term172365, term172365.getClass(), "predPos", null);
        setField(term172365, term172365.getClass(), "indegree", null);
        setField(term172365, term172365.getClass(), "name", null);
        setIntField(term172365, term172365.getClass(), "maxVertices", 0);
        setIntField(term172365, term172365.getClass(), "numVertices", 0);
        setLongField(term172365, term172365.getClass(), "numEdges", 0L);
        setField(term172365, term172365.getClass(), "vertices", null);
        setField(term172365, term172365.getClass(), "degree", null);
        setField(term172365, term172365.getClass(), "adjList", null);
        setField(term172365, term172365.getClass(), "adjPos", null);
        setField(term172365, term172365.getClass(), "vertexWeight", null);
        setIntField(term172365, term172365.getClass(), "vertexDataSize", 0);
        setField(term172365, term172365.getClass(), "edgeData", null);
        setIntField(term172365, term172365.getClass(), "edgeDataSize", 0);
        setField(term172365, term172365.getClass(), "vertexLabel", null);
        setField(term172365, term172365.getClass(), "edgeLabel", null);
        setField(term172365, term172365.getClass(), "vertexIndex", null);
        setField(term172365, term172365.getClass(), "adjSet", null);
        setField(term172365, term172365.getClass(), "adjMap", null);
        setField(term172365, term172365.getClass(), "maxVertexNumber", null);
        setField(term172365, term172365.getClass(), "labelVertexMap", null);
        setField(term172365, term172365.getClass(), "labelEdgeMap", null);
        setBooleanField(term172365, term172365.getClass(), "directed", false);
        setBooleanField(term172365, term172365.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172365, term172365.getClass(), "allowingSelfLoops", false);
        setIntField(term172365, term172365.getClass(), "avgDegree", 0);
        setBooleanField(term172365, term172365.getClass(), "safeMode", false);
        term172376 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term172376;
        callMethod(klass, "removeAllEdgesAt", argTypes, term172365, args);
    }

};


