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

public class GraphImpl_edges_261119088224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46127;

    public GraphImpl_edges_261119088224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46127 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46127, term46127.getClass(), "name", null);
        setIntField(term46127, term46127.getClass(), "maxVertices", 0);
        setIntField(term46127, term46127.getClass(), "numVertices", 0);
        setLongField(term46127, term46127.getClass(), "numEdges", 0L);
        setField(term46127, term46127.getClass(), "vertices", null);
        setField(term46127, term46127.getClass(), "degree", null);
        setField(term46127, term46127.getClass(), "adjList", null);
        setField(term46127, term46127.getClass(), "adjPos", null);
        setField(term46127, term46127.getClass(), "vertexWeight", null);
        setIntField(term46127, term46127.getClass(), "vertexDataSize", 0);
        setField(term46127, term46127.getClass(), "edgeData", null);
        setIntField(term46127, term46127.getClass(), "edgeDataSize", 0);
        setField(term46127, term46127.getClass(), "vertexLabel", null);
        setField(term46127, term46127.getClass(), "edgeLabel", null);
        setField(term46127, term46127.getClass(), "vertexIndex", null);
        setField(term46127, term46127.getClass(), "adjSet", null);
        setField(term46127, term46127.getClass(), "adjMap", null);
        setField(term46127, term46127.getClass(), "maxVertexNumber", null);
        setField(term46127, term46127.getClass(), "labelVertexMap", null);
        setField(term46127, term46127.getClass(), "labelEdgeMap", null);
        setBooleanField(term46127, term46127.getClass(), "directed", false);
        setBooleanField(term46127, term46127.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46127, term46127.getClass(), "allowingSelfLoops", false);
        setIntField(term46127, term46127.getClass(), "avgDegree", 0);
        setBooleanField(term46127, term46127.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term46127, args);
    }

};


