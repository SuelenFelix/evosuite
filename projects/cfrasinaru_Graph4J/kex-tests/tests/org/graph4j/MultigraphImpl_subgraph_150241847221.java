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

public class MultigraphImpl_subgraph_150241847221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127392;

    public MultigraphImpl_subgraph_150241847221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127392 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127392, term127392.getClass(), "name", null);
        setIntField(term127392, term127392.getClass(), "maxVertices", 0);
        setIntField(term127392, term127392.getClass(), "numVertices", 0);
        setLongField(term127392, term127392.getClass(), "numEdges", 0L);
        setField(term127392, term127392.getClass(), "vertices", null);
        setField(term127392, term127392.getClass(), "degree", null);
        setField(term127392, term127392.getClass(), "adjList", null);
        setField(term127392, term127392.getClass(), "adjPos", null);
        setField(term127392, term127392.getClass(), "vertexWeight", null);
        setIntField(term127392, term127392.getClass(), "vertexDataSize", 0);
        setField(term127392, term127392.getClass(), "edgeData", null);
        setIntField(term127392, term127392.getClass(), "edgeDataSize", 0);
        setField(term127392, term127392.getClass(), "vertexLabel", null);
        setField(term127392, term127392.getClass(), "edgeLabel", null);
        setField(term127392, term127392.getClass(), "vertexIndex", null);
        setField(term127392, term127392.getClass(), "adjSet", null);
        setField(term127392, term127392.getClass(), "adjMap", null);
        setField(term127392, term127392.getClass(), "maxVertexNumber", null);
        setField(term127392, term127392.getClass(), "labelVertexMap", null);
        setField(term127392, term127392.getClass(), "labelEdgeMap", null);
        setBooleanField(term127392, term127392.getClass(), "directed", false);
        setBooleanField(term127392, term127392.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127392, term127392.getClass(), "allowingSelfLoops", false);
        setIntField(term127392, term127392.getClass(), "avgDegree", 0);
        setBooleanField(term127392, term127392.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term127392, args);
    }

};


