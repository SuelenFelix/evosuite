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

public class GraphImpl_copy_1637372692128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44839;

    public GraphImpl_copy_1637372692128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44839 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44839, term44839.getClass(), "name", null);
        setIntField(term44839, term44839.getClass(), "maxVertices", 0);
        setIntField(term44839, term44839.getClass(), "numVertices", 0);
        setLongField(term44839, term44839.getClass(), "numEdges", 0L);
        setField(term44839, term44839.getClass(), "vertices", null);
        setField(term44839, term44839.getClass(), "degree", null);
        setField(term44839, term44839.getClass(), "adjList", null);
        setField(term44839, term44839.getClass(), "adjPos", null);
        setField(term44839, term44839.getClass(), "vertexWeight", null);
        setIntField(term44839, term44839.getClass(), "vertexDataSize", 0);
        setField(term44839, term44839.getClass(), "edgeData", null);
        setIntField(term44839, term44839.getClass(), "edgeDataSize", 0);
        setField(term44839, term44839.getClass(), "vertexLabel", null);
        setField(term44839, term44839.getClass(), "edgeLabel", null);
        setField(term44839, term44839.getClass(), "vertexIndex", null);
        setField(term44839, term44839.getClass(), "adjSet", null);
        setField(term44839, term44839.getClass(), "adjMap", null);
        setField(term44839, term44839.getClass(), "maxVertexNumber", null);
        setField(term44839, term44839.getClass(), "labelVertexMap", null);
        setField(term44839, term44839.getClass(), "labelEdgeMap", null);
        setBooleanField(term44839, term44839.getClass(), "directed", false);
        setBooleanField(term44839, term44839.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44839, term44839.getClass(), "allowingSelfLoops", false);
        setIntField(term44839, term44839.getClass(), "avgDegree", 0);
        setBooleanField(term44839, term44839.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term44839, args);
    }

};


