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

public class DirectedPseudographImpl_subgraph_15653988017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81965;

    public DirectedPseudographImpl_subgraph_15653988017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81965 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term81965, term81965.getClass(), "selfLoops", null);
        setField(term81965, term81965.getClass(), "predList", null);
        setField(term81965, term81965.getClass(), "predPos", null);
        setField(term81965, term81965.getClass(), "indegree", null);
        setField(term81965, term81965.getClass(), "name", null);
        setIntField(term81965, term81965.getClass(), "maxVertices", 0);
        setIntField(term81965, term81965.getClass(), "numVertices", 0);
        setLongField(term81965, term81965.getClass(), "numEdges", 0L);
        setField(term81965, term81965.getClass(), "vertices", null);
        setField(term81965, term81965.getClass(), "degree", null);
        setField(term81965, term81965.getClass(), "adjList", null);
        setField(term81965, term81965.getClass(), "adjPos", null);
        setField(term81965, term81965.getClass(), "vertexWeight", null);
        setIntField(term81965, term81965.getClass(), "vertexDataSize", 0);
        setField(term81965, term81965.getClass(), "edgeData", null);
        setIntField(term81965, term81965.getClass(), "edgeDataSize", 0);
        setField(term81965, term81965.getClass(), "vertexLabel", null);
        setField(term81965, term81965.getClass(), "edgeLabel", null);
        setField(term81965, term81965.getClass(), "vertexIndex", null);
        setField(term81965, term81965.getClass(), "adjSet", null);
        setField(term81965, term81965.getClass(), "adjMap", null);
        setField(term81965, term81965.getClass(), "maxVertexNumber", null);
        setField(term81965, term81965.getClass(), "labelVertexMap", null);
        setField(term81965, term81965.getClass(), "labelEdgeMap", null);
        setBooleanField(term81965, term81965.getClass(), "directed", false);
        setBooleanField(term81965, term81965.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term81965, term81965.getClass(), "allowingSelfLoops", false);
        setIntField(term81965, term81965.getClass(), "avgDegree", 0);
        setBooleanField(term81965, term81965.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term81965, args);
    }

};


