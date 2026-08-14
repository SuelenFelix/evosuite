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
     Object term118438;
     Object term118449;

    public PseudographImpl_selfLoops_135031042217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118438 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118438, term118438.getClass(), "selfLoops", null);
        setField(term118438, term118438.getClass(), "name", null);
        setIntField(term118438, term118438.getClass(), "maxVertices", 0);
        setIntField(term118438, term118438.getClass(), "numVertices", 0);
        setLongField(term118438, term118438.getClass(), "numEdges", 0L);
        setField(term118438, term118438.getClass(), "vertices", null);
        setField(term118438, term118438.getClass(), "degree", null);
        setField(term118438, term118438.getClass(), "adjList", null);
        setField(term118438, term118438.getClass(), "adjPos", null);
        setField(term118438, term118438.getClass(), "vertexWeight", null);
        setIntField(term118438, term118438.getClass(), "vertexDataSize", 0);
        setField(term118438, term118438.getClass(), "edgeData", null);
        setIntField(term118438, term118438.getClass(), "edgeDataSize", 0);
        setField(term118438, term118438.getClass(), "vertexLabel", null);
        setField(term118438, term118438.getClass(), "edgeLabel", null);
        setField(term118438, term118438.getClass(), "vertexIndex", null);
        setField(term118438, term118438.getClass(), "adjSet", null);
        setField(term118438, term118438.getClass(), "adjMap", null);
        setField(term118438, term118438.getClass(), "maxVertexNumber", null);
        setField(term118438, term118438.getClass(), "labelVertexMap", null);
        setField(term118438, term118438.getClass(), "labelEdgeMap", null);
        setBooleanField(term118438, term118438.getClass(), "directed", false);
        setBooleanField(term118438, term118438.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118438, term118438.getClass(), "allowingSelfLoops", false);
        setIntField(term118438, term118438.getClass(), "avgDegree", 0);
        setBooleanField(term118438, term118438.getClass(), "safeMode", false);
        term118449 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term118449;
        callMethod(klass, "selfLoops", argTypes, term118438, args);
    }

};


