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

public class DigraphImpl_predListPosOf_211105607241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172378;
     Object term172389;
     Object term172391;

    public DigraphImpl_predListPosOf_211105607241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172378 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172378, term172378.getClass(), "predList", null);
        setField(term172378, term172378.getClass(), "predPos", null);
        setField(term172378, term172378.getClass(), "indegree", null);
        setField(term172378, term172378.getClass(), "name", null);
        setIntField(term172378, term172378.getClass(), "maxVertices", 0);
        setIntField(term172378, term172378.getClass(), "numVertices", 0);
        setLongField(term172378, term172378.getClass(), "numEdges", 0L);
        setField(term172378, term172378.getClass(), "vertices", null);
        setField(term172378, term172378.getClass(), "degree", null);
        setField(term172378, term172378.getClass(), "adjList", null);
        setField(term172378, term172378.getClass(), "adjPos", null);
        setField(term172378, term172378.getClass(), "vertexWeight", null);
        setIntField(term172378, term172378.getClass(), "vertexDataSize", 0);
        setField(term172378, term172378.getClass(), "edgeData", null);
        setIntField(term172378, term172378.getClass(), "edgeDataSize", 0);
        setField(term172378, term172378.getClass(), "vertexLabel", null);
        setField(term172378, term172378.getClass(), "edgeLabel", null);
        setField(term172378, term172378.getClass(), "vertexIndex", null);
        setField(term172378, term172378.getClass(), "adjSet", null);
        setField(term172378, term172378.getClass(), "adjMap", null);
        setField(term172378, term172378.getClass(), "maxVertexNumber", null);
        setField(term172378, term172378.getClass(), "labelVertexMap", null);
        setField(term172378, term172378.getClass(), "labelEdgeMap", null);
        setBooleanField(term172378, term172378.getClass(), "directed", false);
        setBooleanField(term172378, term172378.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172378, term172378.getClass(), "allowingSelfLoops", false);
        setIntField(term172378, term172378.getClass(), "avgDegree", 0);
        setBooleanField(term172378, term172378.getClass(), "safeMode", false);
        term172389 = new Integer(0);
        term172391 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172389;
        args[1] = term172391;
        callMethod(klass, "predListPosOf", argTypes, term172378, args);
    }

};


