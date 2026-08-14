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
     Object term172303;
     Object term172314;
     Object term172316;

    public DigraphImpl_addToPredList_90565651936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172303 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172303, term172303.getClass(), "predList", null);
        setField(term172303, term172303.getClass(), "predPos", null);
        setField(term172303, term172303.getClass(), "indegree", null);
        setField(term172303, term172303.getClass(), "name", null);
        setIntField(term172303, term172303.getClass(), "maxVertices", 0);
        setIntField(term172303, term172303.getClass(), "numVertices", 0);
        setLongField(term172303, term172303.getClass(), "numEdges", 0L);
        setField(term172303, term172303.getClass(), "vertices", null);
        setField(term172303, term172303.getClass(), "degree", null);
        setField(term172303, term172303.getClass(), "adjList", null);
        setField(term172303, term172303.getClass(), "adjPos", null);
        setField(term172303, term172303.getClass(), "vertexWeight", null);
        setIntField(term172303, term172303.getClass(), "vertexDataSize", 0);
        setField(term172303, term172303.getClass(), "edgeData", null);
        setIntField(term172303, term172303.getClass(), "edgeDataSize", 0);
        setField(term172303, term172303.getClass(), "vertexLabel", null);
        setField(term172303, term172303.getClass(), "edgeLabel", null);
        setField(term172303, term172303.getClass(), "vertexIndex", null);
        setField(term172303, term172303.getClass(), "adjSet", null);
        setField(term172303, term172303.getClass(), "adjMap", null);
        setField(term172303, term172303.getClass(), "maxVertexNumber", null);
        setField(term172303, term172303.getClass(), "labelVertexMap", null);
        setField(term172303, term172303.getClass(), "labelEdgeMap", null);
        setBooleanField(term172303, term172303.getClass(), "directed", false);
        setBooleanField(term172303, term172303.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172303, term172303.getClass(), "allowingSelfLoops", false);
        setIntField(term172303, term172303.getClass(), "avgDegree", 0);
        setBooleanField(term172303, term172303.getClass(), "safeMode", false);
        term172314 = new Integer(0);
        term172316 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172314;
        args[1] = term172316;
        callMethod(klass, "addToPredList", argTypes, term172303, args);
    }

};


