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

public class DirectedPseudographImpl_degree_62458687521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84868;
     Object term84879;

    public DirectedPseudographImpl_degree_62458687521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84868 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84868, term84868.getClass(), "selfLoops", null);
        setField(term84868, term84868.getClass(), "predList", null);
        setField(term84868, term84868.getClass(), "predPos", null);
        setField(term84868, term84868.getClass(), "indegree", null);
        setField(term84868, term84868.getClass(), "name", null);
        setIntField(term84868, term84868.getClass(), "maxVertices", 0);
        setIntField(term84868, term84868.getClass(), "numVertices", 0);
        setLongField(term84868, term84868.getClass(), "numEdges", 0L);
        setField(term84868, term84868.getClass(), "vertices", null);
        setField(term84868, term84868.getClass(), "degree", null);
        setField(term84868, term84868.getClass(), "adjList", null);
        setField(term84868, term84868.getClass(), "adjPos", null);
        setField(term84868, term84868.getClass(), "vertexWeight", null);
        setIntField(term84868, term84868.getClass(), "vertexDataSize", 0);
        setField(term84868, term84868.getClass(), "edgeData", null);
        setIntField(term84868, term84868.getClass(), "edgeDataSize", 0);
        setField(term84868, term84868.getClass(), "vertexLabel", null);
        setField(term84868, term84868.getClass(), "edgeLabel", null);
        setField(term84868, term84868.getClass(), "vertexIndex", null);
        setField(term84868, term84868.getClass(), "adjSet", null);
        setField(term84868, term84868.getClass(), "adjMap", null);
        setField(term84868, term84868.getClass(), "maxVertexNumber", null);
        setField(term84868, term84868.getClass(), "labelVertexMap", null);
        setField(term84868, term84868.getClass(), "labelEdgeMap", null);
        setBooleanField(term84868, term84868.getClass(), "directed", false);
        setBooleanField(term84868, term84868.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84868, term84868.getClass(), "allowingSelfLoops", false);
        setIntField(term84868, term84868.getClass(), "avgDegree", 0);
        setBooleanField(term84868, term84868.getClass(), "safeMode", false);
        term84879 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84879;
        callMethod(klass, "degree", argTypes, term84868, args);
    }

};


