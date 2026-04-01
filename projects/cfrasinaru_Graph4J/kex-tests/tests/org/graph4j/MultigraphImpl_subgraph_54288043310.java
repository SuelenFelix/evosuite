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

public class MultigraphImpl_subgraph_54288043310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127040;

    public MultigraphImpl_subgraph_54288043310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127040 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127040, term127040.getClass(), "name", null);
        setIntField(term127040, term127040.getClass(), "maxVertices", 0);
        setIntField(term127040, term127040.getClass(), "numVertices", 0);
        setLongField(term127040, term127040.getClass(), "numEdges", 0L);
        setField(term127040, term127040.getClass(), "vertices", null);
        setField(term127040, term127040.getClass(), "degree", null);
        setField(term127040, term127040.getClass(), "adjList", null);
        setField(term127040, term127040.getClass(), "adjPos", null);
        setField(term127040, term127040.getClass(), "vertexWeight", null);
        setIntField(term127040, term127040.getClass(), "vertexDataSize", 0);
        setField(term127040, term127040.getClass(), "edgeData", null);
        setIntField(term127040, term127040.getClass(), "edgeDataSize", 0);
        setField(term127040, term127040.getClass(), "vertexLabel", null);
        setField(term127040, term127040.getClass(), "edgeLabel", null);
        setField(term127040, term127040.getClass(), "vertexIndex", null);
        setField(term127040, term127040.getClass(), "adjSet", null);
        setField(term127040, term127040.getClass(), "adjMap", null);
        setField(term127040, term127040.getClass(), "maxVertexNumber", null);
        setField(term127040, term127040.getClass(), "labelVertexMap", null);
        setField(term127040, term127040.getClass(), "labelEdgeMap", null);
        setBooleanField(term127040, term127040.getClass(), "directed", false);
        setBooleanField(term127040, term127040.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127040, term127040.getClass(), "allowingSelfLoops", false);
        setIntField(term127040, term127040.getClass(), "avgDegree", 0);
        setBooleanField(term127040, term127040.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term127040, args);
    }

};


