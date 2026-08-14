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

public class GraphImpl_setVertexLabel_1143106934208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45931;
     Object term45942;

    public GraphImpl_setVertexLabel_1143106934208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45931 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45931, term45931.getClass(), "name", null);
        setIntField(term45931, term45931.getClass(), "maxVertices", 0);
        setIntField(term45931, term45931.getClass(), "numVertices", 0);
        setLongField(term45931, term45931.getClass(), "numEdges", 0L);
        setField(term45931, term45931.getClass(), "vertices", null);
        setField(term45931, term45931.getClass(), "degree", null);
        setField(term45931, term45931.getClass(), "adjList", null);
        setField(term45931, term45931.getClass(), "adjPos", null);
        setField(term45931, term45931.getClass(), "vertexWeight", null);
        setIntField(term45931, term45931.getClass(), "vertexDataSize", 0);
        setField(term45931, term45931.getClass(), "edgeData", null);
        setIntField(term45931, term45931.getClass(), "edgeDataSize", 0);
        setField(term45931, term45931.getClass(), "vertexLabel", null);
        setField(term45931, term45931.getClass(), "edgeLabel", null);
        setField(term45931, term45931.getClass(), "vertexIndex", null);
        setField(term45931, term45931.getClass(), "adjSet", null);
        setField(term45931, term45931.getClass(), "adjMap", null);
        setField(term45931, term45931.getClass(), "maxVertexNumber", null);
        setField(term45931, term45931.getClass(), "labelVertexMap", null);
        setField(term45931, term45931.getClass(), "labelEdgeMap", null);
        setBooleanField(term45931, term45931.getClass(), "directed", false);
        setBooleanField(term45931, term45931.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45931, term45931.getClass(), "allowingSelfLoops", false);
        setIntField(term45931, term45931.getClass(), "avgDegree", 0);
        setBooleanField(term45931, term45931.getClass(), "safeMode", false);
        term45942 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term45942;
        args[1] = null;
        callMethod(klass, "setVertexLabel", argTypes, term45931, args);
    }

};


