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
import java.lang.Integer;

public class GraphImpl_checkVertex_2137609643145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45054;
     Object term45065;

    public GraphImpl_checkVertex_2137609643145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45054 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45054, term45054.getClass(), "name", null);
        setIntField(term45054, term45054.getClass(), "maxVertices", 0);
        setIntField(term45054, term45054.getClass(), "numVertices", 0);
        setLongField(term45054, term45054.getClass(), "numEdges", 0L);
        setField(term45054, term45054.getClass(), "vertices", null);
        setField(term45054, term45054.getClass(), "degree", null);
        setField(term45054, term45054.getClass(), "adjList", null);
        setField(term45054, term45054.getClass(), "adjPos", null);
        setField(term45054, term45054.getClass(), "vertexWeight", null);
        setIntField(term45054, term45054.getClass(), "vertexDataSize", 0);
        setField(term45054, term45054.getClass(), "edgeData", null);
        setIntField(term45054, term45054.getClass(), "edgeDataSize", 0);
        setField(term45054, term45054.getClass(), "vertexLabel", null);
        setField(term45054, term45054.getClass(), "edgeLabel", null);
        setField(term45054, term45054.getClass(), "vertexIndex", null);
        setField(term45054, term45054.getClass(), "adjSet", null);
        setField(term45054, term45054.getClass(), "adjMap", null);
        setField(term45054, term45054.getClass(), "maxVertexNumber", null);
        setField(term45054, term45054.getClass(), "labelVertexMap", null);
        setField(term45054, term45054.getClass(), "labelEdgeMap", null);
        setBooleanField(term45054, term45054.getClass(), "directed", false);
        setBooleanField(term45054, term45054.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45054, term45054.getClass(), "allowingSelfLoops", false);
        setIntField(term45054, term45054.getClass(), "avgDegree", 0);
        setBooleanField(term45054, term45054.getClass(), "safeMode", false);
        term45065 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45065;
        callMethod(klass, "checkVertex", argTypes, term45054, args);
    }

};


