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

public class GraphImpl_isDefaultVertexNumbering_1951946395143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45030;

    public GraphImpl_isDefaultVertexNumbering_1951946395143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45030 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45030, term45030.getClass(), "name", null);
        setIntField(term45030, term45030.getClass(), "maxVertices", 0);
        setIntField(term45030, term45030.getClass(), "numVertices", 0);
        setLongField(term45030, term45030.getClass(), "numEdges", 0L);
        setField(term45030, term45030.getClass(), "vertices", null);
        setField(term45030, term45030.getClass(), "degree", null);
        setField(term45030, term45030.getClass(), "adjList", null);
        setField(term45030, term45030.getClass(), "adjPos", null);
        setField(term45030, term45030.getClass(), "vertexWeight", null);
        setIntField(term45030, term45030.getClass(), "vertexDataSize", 0);
        setField(term45030, term45030.getClass(), "edgeData", null);
        setIntField(term45030, term45030.getClass(), "edgeDataSize", 0);
        setField(term45030, term45030.getClass(), "vertexLabel", null);
        setField(term45030, term45030.getClass(), "edgeLabel", null);
        setField(term45030, term45030.getClass(), "vertexIndex", null);
        setField(term45030, term45030.getClass(), "adjSet", null);
        setField(term45030, term45030.getClass(), "adjMap", null);
        setField(term45030, term45030.getClass(), "maxVertexNumber", null);
        setField(term45030, term45030.getClass(), "labelVertexMap", null);
        setField(term45030, term45030.getClass(), "labelEdgeMap", null);
        setBooleanField(term45030, term45030.getClass(), "directed", false);
        setBooleanField(term45030, term45030.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45030, term45030.getClass(), "allowingSelfLoops", false);
        setIntField(term45030, term45030.getClass(), "avgDegree", 0);
        setBooleanField(term45030, term45030.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDefaultVertexNumbering", argTypes, term45030, args);
    }

};


