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

public class GraphImpl_findAllEdges_1301779826172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45429;

    public GraphImpl_findAllEdges_1301779826172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45429 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45429, term45429.getClass(), "name", null);
        setIntField(term45429, term45429.getClass(), "maxVertices", 0);
        setIntField(term45429, term45429.getClass(), "numVertices", 0);
        setLongField(term45429, term45429.getClass(), "numEdges", 0L);
        setField(term45429, term45429.getClass(), "vertices", null);
        setField(term45429, term45429.getClass(), "degree", null);
        setField(term45429, term45429.getClass(), "adjList", null);
        setField(term45429, term45429.getClass(), "adjPos", null);
        setField(term45429, term45429.getClass(), "vertexWeight", null);
        setIntField(term45429, term45429.getClass(), "vertexDataSize", 0);
        setField(term45429, term45429.getClass(), "edgeData", null);
        setIntField(term45429, term45429.getClass(), "edgeDataSize", 0);
        setField(term45429, term45429.getClass(), "vertexLabel", null);
        setField(term45429, term45429.getClass(), "edgeLabel", null);
        setField(term45429, term45429.getClass(), "vertexIndex", null);
        setField(term45429, term45429.getClass(), "adjSet", null);
        setField(term45429, term45429.getClass(), "adjMap", null);
        setField(term45429, term45429.getClass(), "maxVertexNumber", null);
        setField(term45429, term45429.getClass(), "labelVertexMap", null);
        setField(term45429, term45429.getClass(), "labelEdgeMap", null);
        setBooleanField(term45429, term45429.getClass(), "directed", false);
        setBooleanField(term45429, term45429.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45429, term45429.getClass(), "allowingSelfLoops", false);
        setIntField(term45429, term45429.getClass(), "avgDegree", 0);
        setBooleanField(term45429, term45429.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "findAllEdges", argTypes, term45429, args);
    }

};


