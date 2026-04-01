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

public class PseudographImpl_selfLoops_135031042217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118435;
     Object term118446;

    public PseudographImpl_selfLoops_135031042217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118435 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118435, term118435.getClass(), "selfLoops", null);
        setField(term118435, term118435.getClass(), "name", null);
        setIntField(term118435, term118435.getClass(), "maxVertices", 0);
        setIntField(term118435, term118435.getClass(), "numVertices", 0);
        setLongField(term118435, term118435.getClass(), "numEdges", 0L);
        setField(term118435, term118435.getClass(), "vertices", null);
        setField(term118435, term118435.getClass(), "degree", null);
        setField(term118435, term118435.getClass(), "adjList", null);
        setField(term118435, term118435.getClass(), "adjPos", null);
        setField(term118435, term118435.getClass(), "vertexWeight", null);
        setIntField(term118435, term118435.getClass(), "vertexDataSize", 0);
        setField(term118435, term118435.getClass(), "edgeData", null);
        setIntField(term118435, term118435.getClass(), "edgeDataSize", 0);
        setField(term118435, term118435.getClass(), "vertexLabel", null);
        setField(term118435, term118435.getClass(), "edgeLabel", null);
        setField(term118435, term118435.getClass(), "vertexIndex", null);
        setField(term118435, term118435.getClass(), "adjSet", null);
        setField(term118435, term118435.getClass(), "adjMap", null);
        setField(term118435, term118435.getClass(), "maxVertexNumber", null);
        setField(term118435, term118435.getClass(), "labelVertexMap", null);
        setField(term118435, term118435.getClass(), "labelEdgeMap", null);
        setBooleanField(term118435, term118435.getClass(), "directed", false);
        setBooleanField(term118435, term118435.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118435, term118435.getClass(), "allowingSelfLoops", false);
        setIntField(term118435, term118435.getClass(), "avgDegree", 0);
        setBooleanField(term118435, term118435.getClass(), "safeMode", false);
        term118446 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term118446;
        callMethod(klass, "selfLoops", argTypes, term118435, args);
    }

};


