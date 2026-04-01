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

public class GraphImpl_removeFromAdjListAt_723004037163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45304;
     Object term45315;
     Object term45317;

    public GraphImpl_removeFromAdjListAt_723004037163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45304 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45304, term45304.getClass(), "name", null);
        setIntField(term45304, term45304.getClass(), "maxVertices", 0);
        setIntField(term45304, term45304.getClass(), "numVertices", 0);
        setLongField(term45304, term45304.getClass(), "numEdges", 0L);
        setField(term45304, term45304.getClass(), "vertices", null);
        setField(term45304, term45304.getClass(), "degree", null);
        setField(term45304, term45304.getClass(), "adjList", null);
        setField(term45304, term45304.getClass(), "adjPos", null);
        setField(term45304, term45304.getClass(), "vertexWeight", null);
        setIntField(term45304, term45304.getClass(), "vertexDataSize", 0);
        setField(term45304, term45304.getClass(), "edgeData", null);
        setIntField(term45304, term45304.getClass(), "edgeDataSize", 0);
        setField(term45304, term45304.getClass(), "vertexLabel", null);
        setField(term45304, term45304.getClass(), "edgeLabel", null);
        setField(term45304, term45304.getClass(), "vertexIndex", null);
        setField(term45304, term45304.getClass(), "adjSet", null);
        setField(term45304, term45304.getClass(), "adjMap", null);
        setField(term45304, term45304.getClass(), "maxVertexNumber", null);
        setField(term45304, term45304.getClass(), "labelVertexMap", null);
        setField(term45304, term45304.getClass(), "labelEdgeMap", null);
        setBooleanField(term45304, term45304.getClass(), "directed", false);
        setBooleanField(term45304, term45304.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45304, term45304.getClass(), "allowingSelfLoops", false);
        setIntField(term45304, term45304.getClass(), "avgDegree", 0);
        setBooleanField(term45304, term45304.getClass(), "safeMode", false);
        term45315 = new Integer(0);
        term45317 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45315;
        args[1] = term45317;
        callMethod(klass, "removeFromAdjListAt", argTypes, term45304, args);
    }

};


