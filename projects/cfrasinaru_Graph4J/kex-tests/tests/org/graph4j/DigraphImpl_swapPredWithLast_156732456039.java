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

public class DigraphImpl_swapPredWithLast_156732456039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172350;
     Object term172361;
     Object term172363;

    public DigraphImpl_swapPredWithLast_156732456039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172350 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172350, term172350.getClass(), "predList", null);
        setField(term172350, term172350.getClass(), "predPos", null);
        setField(term172350, term172350.getClass(), "indegree", null);
        setField(term172350, term172350.getClass(), "name", null);
        setIntField(term172350, term172350.getClass(), "maxVertices", 0);
        setIntField(term172350, term172350.getClass(), "numVertices", 0);
        setLongField(term172350, term172350.getClass(), "numEdges", 0L);
        setField(term172350, term172350.getClass(), "vertices", null);
        setField(term172350, term172350.getClass(), "degree", null);
        setField(term172350, term172350.getClass(), "adjList", null);
        setField(term172350, term172350.getClass(), "adjPos", null);
        setField(term172350, term172350.getClass(), "vertexWeight", null);
        setIntField(term172350, term172350.getClass(), "vertexDataSize", 0);
        setField(term172350, term172350.getClass(), "edgeData", null);
        setIntField(term172350, term172350.getClass(), "edgeDataSize", 0);
        setField(term172350, term172350.getClass(), "vertexLabel", null);
        setField(term172350, term172350.getClass(), "edgeLabel", null);
        setField(term172350, term172350.getClass(), "vertexIndex", null);
        setField(term172350, term172350.getClass(), "adjSet", null);
        setField(term172350, term172350.getClass(), "adjMap", null);
        setField(term172350, term172350.getClass(), "maxVertexNumber", null);
        setField(term172350, term172350.getClass(), "labelVertexMap", null);
        setField(term172350, term172350.getClass(), "labelEdgeMap", null);
        setBooleanField(term172350, term172350.getClass(), "directed", false);
        setBooleanField(term172350, term172350.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172350, term172350.getClass(), "allowingSelfLoops", false);
        setIntField(term172350, term172350.getClass(), "avgDegree", 0);
        setBooleanField(term172350, term172350.getClass(), "safeMode", false);
        term172361 = new Integer(0);
        term172363 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172361;
        args[1] = term172363;
        callMethod(klass, "swapPredWithLast", argTypes, term172350, args);
    }

};


