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

public class PseudographImpl_degree_74074523516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118425;
     Object term118436;

    public PseudographImpl_degree_74074523516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118425 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118425, term118425.getClass(), "selfLoops", null);
        setField(term118425, term118425.getClass(), "name", null);
        setIntField(term118425, term118425.getClass(), "maxVertices", 0);
        setIntField(term118425, term118425.getClass(), "numVertices", 0);
        setLongField(term118425, term118425.getClass(), "numEdges", 0L);
        setField(term118425, term118425.getClass(), "vertices", null);
        setField(term118425, term118425.getClass(), "degree", null);
        setField(term118425, term118425.getClass(), "adjList", null);
        setField(term118425, term118425.getClass(), "adjPos", null);
        setField(term118425, term118425.getClass(), "vertexWeight", null);
        setIntField(term118425, term118425.getClass(), "vertexDataSize", 0);
        setField(term118425, term118425.getClass(), "edgeData", null);
        setIntField(term118425, term118425.getClass(), "edgeDataSize", 0);
        setField(term118425, term118425.getClass(), "vertexLabel", null);
        setField(term118425, term118425.getClass(), "edgeLabel", null);
        setField(term118425, term118425.getClass(), "vertexIndex", null);
        setField(term118425, term118425.getClass(), "adjSet", null);
        setField(term118425, term118425.getClass(), "adjMap", null);
        setField(term118425, term118425.getClass(), "maxVertexNumber", null);
        setField(term118425, term118425.getClass(), "labelVertexMap", null);
        setField(term118425, term118425.getClass(), "labelEdgeMap", null);
        setBooleanField(term118425, term118425.getClass(), "directed", false);
        setBooleanField(term118425, term118425.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118425, term118425.getClass(), "allowingSelfLoops", false);
        setIntField(term118425, term118425.getClass(), "avgDegree", 0);
        setBooleanField(term118425, term118425.getClass(), "safeMode", false);
        term118436 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term118436;
        callMethod(klass, "degree", argTypes, term118425, args);
    }

};


