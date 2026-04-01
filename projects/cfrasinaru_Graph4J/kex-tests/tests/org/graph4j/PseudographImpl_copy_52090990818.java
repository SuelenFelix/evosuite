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

public class PseudographImpl_copy_52090990818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118448;

    public PseudographImpl_copy_52090990818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118448 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118448, term118448.getClass(), "selfLoops", null);
        setField(term118448, term118448.getClass(), "name", null);
        setIntField(term118448, term118448.getClass(), "maxVertices", 0);
        setIntField(term118448, term118448.getClass(), "numVertices", 0);
        setLongField(term118448, term118448.getClass(), "numEdges", 0L);
        setField(term118448, term118448.getClass(), "vertices", null);
        setField(term118448, term118448.getClass(), "degree", null);
        setField(term118448, term118448.getClass(), "adjList", null);
        setField(term118448, term118448.getClass(), "adjPos", null);
        setField(term118448, term118448.getClass(), "vertexWeight", null);
        setIntField(term118448, term118448.getClass(), "vertexDataSize", 0);
        setField(term118448, term118448.getClass(), "edgeData", null);
        setIntField(term118448, term118448.getClass(), "edgeDataSize", 0);
        setField(term118448, term118448.getClass(), "vertexLabel", null);
        setField(term118448, term118448.getClass(), "edgeLabel", null);
        setField(term118448, term118448.getClass(), "vertexIndex", null);
        setField(term118448, term118448.getClass(), "adjSet", null);
        setField(term118448, term118448.getClass(), "adjMap", null);
        setField(term118448, term118448.getClass(), "maxVertexNumber", null);
        setField(term118448, term118448.getClass(), "labelVertexMap", null);
        setField(term118448, term118448.getClass(), "labelEdgeMap", null);
        setBooleanField(term118448, term118448.getClass(), "directed", false);
        setBooleanField(term118448, term118448.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118448, term118448.getClass(), "allowingSelfLoops", false);
        setIntField(term118448, term118448.getClass(), "avgDegree", 0);
        setBooleanField(term118448, term118448.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term118448, args);
    }

};


