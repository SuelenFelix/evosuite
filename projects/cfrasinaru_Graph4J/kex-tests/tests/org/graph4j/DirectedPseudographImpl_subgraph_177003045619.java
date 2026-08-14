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

public class DirectedPseudographImpl_subgraph_177003045619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84849;

    public DirectedPseudographImpl_subgraph_177003045619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84849 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84849, term84849.getClass(), "selfLoops", null);
        setField(term84849, term84849.getClass(), "predList", null);
        setField(term84849, term84849.getClass(), "predPos", null);
        setField(term84849, term84849.getClass(), "indegree", null);
        setField(term84849, term84849.getClass(), "name", null);
        setIntField(term84849, term84849.getClass(), "maxVertices", 0);
        setIntField(term84849, term84849.getClass(), "numVertices", 0);
        setLongField(term84849, term84849.getClass(), "numEdges", 0L);
        setField(term84849, term84849.getClass(), "vertices", null);
        setField(term84849, term84849.getClass(), "degree", null);
        setField(term84849, term84849.getClass(), "adjList", null);
        setField(term84849, term84849.getClass(), "adjPos", null);
        setField(term84849, term84849.getClass(), "vertexWeight", null);
        setIntField(term84849, term84849.getClass(), "vertexDataSize", 0);
        setField(term84849, term84849.getClass(), "edgeData", null);
        setIntField(term84849, term84849.getClass(), "edgeDataSize", 0);
        setField(term84849, term84849.getClass(), "vertexLabel", null);
        setField(term84849, term84849.getClass(), "edgeLabel", null);
        setField(term84849, term84849.getClass(), "vertexIndex", null);
        setField(term84849, term84849.getClass(), "adjSet", null);
        setField(term84849, term84849.getClass(), "adjMap", null);
        setField(term84849, term84849.getClass(), "maxVertexNumber", null);
        setField(term84849, term84849.getClass(), "labelVertexMap", null);
        setField(term84849, term84849.getClass(), "labelEdgeMap", null);
        setBooleanField(term84849, term84849.getClass(), "directed", false);
        setBooleanField(term84849, term84849.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84849, term84849.getClass(), "allowingSelfLoops", false);
        setIntField(term84849, term84849.getClass(), "avgDegree", 0);
        setBooleanField(term84849, term84849.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term84849, args);
    }

};


