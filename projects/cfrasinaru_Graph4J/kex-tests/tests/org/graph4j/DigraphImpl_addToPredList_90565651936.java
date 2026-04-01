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

public class DigraphImpl_addToPredList_90565651936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172300;
     Object term172311;
     Object term172313;

    public DigraphImpl_addToPredList_90565651936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172300 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172300, term172300.getClass(), "predList", null);
        setField(term172300, term172300.getClass(), "predPos", null);
        setField(term172300, term172300.getClass(), "indegree", null);
        setField(term172300, term172300.getClass(), "name", null);
        setIntField(term172300, term172300.getClass(), "maxVertices", 0);
        setIntField(term172300, term172300.getClass(), "numVertices", 0);
        setLongField(term172300, term172300.getClass(), "numEdges", 0L);
        setField(term172300, term172300.getClass(), "vertices", null);
        setField(term172300, term172300.getClass(), "degree", null);
        setField(term172300, term172300.getClass(), "adjList", null);
        setField(term172300, term172300.getClass(), "adjPos", null);
        setField(term172300, term172300.getClass(), "vertexWeight", null);
        setIntField(term172300, term172300.getClass(), "vertexDataSize", 0);
        setField(term172300, term172300.getClass(), "edgeData", null);
        setIntField(term172300, term172300.getClass(), "edgeDataSize", 0);
        setField(term172300, term172300.getClass(), "vertexLabel", null);
        setField(term172300, term172300.getClass(), "edgeLabel", null);
        setField(term172300, term172300.getClass(), "vertexIndex", null);
        setField(term172300, term172300.getClass(), "adjSet", null);
        setField(term172300, term172300.getClass(), "adjMap", null);
        setField(term172300, term172300.getClass(), "maxVertexNumber", null);
        setField(term172300, term172300.getClass(), "labelVertexMap", null);
        setField(term172300, term172300.getClass(), "labelEdgeMap", null);
        setBooleanField(term172300, term172300.getClass(), "directed", false);
        setBooleanField(term172300, term172300.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172300, term172300.getClass(), "allowingSelfLoops", false);
        setIntField(term172300, term172300.getClass(), "avgDegree", 0);
        setBooleanField(term172300, term172300.getClass(), "safeMode", false);
        term172311 = new Integer(0);
        term172313 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172311;
        args[1] = term172313;
        callMethod(klass, "addToPredList", argTypes, term172300, args);
    }

};


