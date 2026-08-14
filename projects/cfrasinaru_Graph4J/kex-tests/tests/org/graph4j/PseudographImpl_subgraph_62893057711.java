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

public class PseudographImpl_subgraph_62893057711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118364;

    public PseudographImpl_subgraph_62893057711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118364 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118364, term118364.getClass(), "selfLoops", null);
        setField(term118364, term118364.getClass(), "name", null);
        setIntField(term118364, term118364.getClass(), "maxVertices", 0);
        setIntField(term118364, term118364.getClass(), "numVertices", 0);
        setLongField(term118364, term118364.getClass(), "numEdges", 0L);
        setField(term118364, term118364.getClass(), "vertices", null);
        setField(term118364, term118364.getClass(), "degree", null);
        setField(term118364, term118364.getClass(), "adjList", null);
        setField(term118364, term118364.getClass(), "adjPos", null);
        setField(term118364, term118364.getClass(), "vertexWeight", null);
        setIntField(term118364, term118364.getClass(), "vertexDataSize", 0);
        setField(term118364, term118364.getClass(), "edgeData", null);
        setIntField(term118364, term118364.getClass(), "edgeDataSize", 0);
        setField(term118364, term118364.getClass(), "vertexLabel", null);
        setField(term118364, term118364.getClass(), "edgeLabel", null);
        setField(term118364, term118364.getClass(), "vertexIndex", null);
        setField(term118364, term118364.getClass(), "adjSet", null);
        setField(term118364, term118364.getClass(), "adjMap", null);
        setField(term118364, term118364.getClass(), "maxVertexNumber", null);
        setField(term118364, term118364.getClass(), "labelVertexMap", null);
        setField(term118364, term118364.getClass(), "labelEdgeMap", null);
        setBooleanField(term118364, term118364.getClass(), "directed", false);
        setBooleanField(term118364, term118364.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118364, term118364.getClass(), "allowingSelfLoops", false);
        setIntField(term118364, term118364.getClass(), "avgDegree", 0);
        setBooleanField(term118364, term118364.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term118364, args);
    }

};


