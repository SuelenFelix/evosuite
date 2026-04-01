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

public class PseudographImpl_subgraph_158846861622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118510;

    public PseudographImpl_subgraph_158846861622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118510 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118510, term118510.getClass(), "selfLoops", null);
        setField(term118510, term118510.getClass(), "name", null);
        setIntField(term118510, term118510.getClass(), "maxVertices", 0);
        setIntField(term118510, term118510.getClass(), "numVertices", 0);
        setLongField(term118510, term118510.getClass(), "numEdges", 0L);
        setField(term118510, term118510.getClass(), "vertices", null);
        setField(term118510, term118510.getClass(), "degree", null);
        setField(term118510, term118510.getClass(), "adjList", null);
        setField(term118510, term118510.getClass(), "adjPos", null);
        setField(term118510, term118510.getClass(), "vertexWeight", null);
        setIntField(term118510, term118510.getClass(), "vertexDataSize", 0);
        setField(term118510, term118510.getClass(), "edgeData", null);
        setIntField(term118510, term118510.getClass(), "edgeDataSize", 0);
        setField(term118510, term118510.getClass(), "vertexLabel", null);
        setField(term118510, term118510.getClass(), "edgeLabel", null);
        setField(term118510, term118510.getClass(), "vertexIndex", null);
        setField(term118510, term118510.getClass(), "adjSet", null);
        setField(term118510, term118510.getClass(), "adjMap", null);
        setField(term118510, term118510.getClass(), "maxVertexNumber", null);
        setField(term118510, term118510.getClass(), "labelVertexMap", null);
        setField(term118510, term118510.getClass(), "labelEdgeMap", null);
        setBooleanField(term118510, term118510.getClass(), "directed", false);
        setBooleanField(term118510, term118510.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118510, term118510.getClass(), "allowingSelfLoops", false);
        setIntField(term118510, term118510.getClass(), "avgDegree", 0);
        setBooleanField(term118510, term118510.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term118510, args);
    }

};


