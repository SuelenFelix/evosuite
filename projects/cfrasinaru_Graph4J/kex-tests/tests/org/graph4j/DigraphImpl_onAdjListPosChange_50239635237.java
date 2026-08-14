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

public class DigraphImpl_onAdjListPosChange_50239635237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172318;
     Object term172329;
     Object term172331;
     Object term172333;

    public DigraphImpl_onAdjListPosChange_50239635237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172318 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172318, term172318.getClass(), "predList", null);
        setField(term172318, term172318.getClass(), "predPos", null);
        setField(term172318, term172318.getClass(), "indegree", null);
        setField(term172318, term172318.getClass(), "name", null);
        setIntField(term172318, term172318.getClass(), "maxVertices", 0);
        setIntField(term172318, term172318.getClass(), "numVertices", 0);
        setLongField(term172318, term172318.getClass(), "numEdges", 0L);
        setField(term172318, term172318.getClass(), "vertices", null);
        setField(term172318, term172318.getClass(), "degree", null);
        setField(term172318, term172318.getClass(), "adjList", null);
        setField(term172318, term172318.getClass(), "adjPos", null);
        setField(term172318, term172318.getClass(), "vertexWeight", null);
        setIntField(term172318, term172318.getClass(), "vertexDataSize", 0);
        setField(term172318, term172318.getClass(), "edgeData", null);
        setIntField(term172318, term172318.getClass(), "edgeDataSize", 0);
        setField(term172318, term172318.getClass(), "vertexLabel", null);
        setField(term172318, term172318.getClass(), "edgeLabel", null);
        setField(term172318, term172318.getClass(), "vertexIndex", null);
        setField(term172318, term172318.getClass(), "adjSet", null);
        setField(term172318, term172318.getClass(), "adjMap", null);
        setField(term172318, term172318.getClass(), "maxVertexNumber", null);
        setField(term172318, term172318.getClass(), "labelVertexMap", null);
        setField(term172318, term172318.getClass(), "labelEdgeMap", null);
        setBooleanField(term172318, term172318.getClass(), "directed", false);
        setBooleanField(term172318, term172318.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172318, term172318.getClass(), "allowingSelfLoops", false);
        setIntField(term172318, term172318.getClass(), "avgDegree", 0);
        setBooleanField(term172318, term172318.getClass(), "safeMode", false);
        term172329 = new Integer(0);
        term172331 = new Integer(0);
        term172333 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term172329;
        args[1] = term172331;
        args[2] = term172333;
        callMethod(klass, "onAdjListPosChange", argTypes, term172318, args);
    }

};


