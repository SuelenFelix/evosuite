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
     Object term172315;
     Object term172326;
     Object term172328;
     Object term172330;

    public DigraphImpl_onAdjListPosChange_50239635237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172315 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172315, term172315.getClass(), "predList", null);
        setField(term172315, term172315.getClass(), "predPos", null);
        setField(term172315, term172315.getClass(), "indegree", null);
        setField(term172315, term172315.getClass(), "name", null);
        setIntField(term172315, term172315.getClass(), "maxVertices", 0);
        setIntField(term172315, term172315.getClass(), "numVertices", 0);
        setLongField(term172315, term172315.getClass(), "numEdges", 0L);
        setField(term172315, term172315.getClass(), "vertices", null);
        setField(term172315, term172315.getClass(), "degree", null);
        setField(term172315, term172315.getClass(), "adjList", null);
        setField(term172315, term172315.getClass(), "adjPos", null);
        setField(term172315, term172315.getClass(), "vertexWeight", null);
        setIntField(term172315, term172315.getClass(), "vertexDataSize", 0);
        setField(term172315, term172315.getClass(), "edgeData", null);
        setIntField(term172315, term172315.getClass(), "edgeDataSize", 0);
        setField(term172315, term172315.getClass(), "vertexLabel", null);
        setField(term172315, term172315.getClass(), "edgeLabel", null);
        setField(term172315, term172315.getClass(), "vertexIndex", null);
        setField(term172315, term172315.getClass(), "adjSet", null);
        setField(term172315, term172315.getClass(), "adjMap", null);
        setField(term172315, term172315.getClass(), "maxVertexNumber", null);
        setField(term172315, term172315.getClass(), "labelVertexMap", null);
        setField(term172315, term172315.getClass(), "labelEdgeMap", null);
        setBooleanField(term172315, term172315.getClass(), "directed", false);
        setBooleanField(term172315, term172315.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172315, term172315.getClass(), "allowingSelfLoops", false);
        setIntField(term172315, term172315.getClass(), "avgDegree", 0);
        setBooleanField(term172315, term172315.getClass(), "safeMode", false);
        term172326 = new Integer(0);
        term172328 = new Integer(0);
        term172330 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term172326;
        args[1] = term172328;
        args[2] = term172330;
        callMethod(klass, "onAdjListPosChange", argTypes, term172315, args);
    }

};


