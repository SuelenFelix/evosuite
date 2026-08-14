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

public class GraphImpl_edgeIndex_205971772157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45218;
     Object term45229;
     Object term45231;

    public GraphImpl_edgeIndex_205971772157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45218 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45218, term45218.getClass(), "name", null);
        setIntField(term45218, term45218.getClass(), "maxVertices", 0);
        setIntField(term45218, term45218.getClass(), "numVertices", 0);
        setLongField(term45218, term45218.getClass(), "numEdges", 0L);
        setField(term45218, term45218.getClass(), "vertices", null);
        setField(term45218, term45218.getClass(), "degree", null);
        setField(term45218, term45218.getClass(), "adjList", null);
        setField(term45218, term45218.getClass(), "adjPos", null);
        setField(term45218, term45218.getClass(), "vertexWeight", null);
        setIntField(term45218, term45218.getClass(), "vertexDataSize", 0);
        setField(term45218, term45218.getClass(), "edgeData", null);
        setIntField(term45218, term45218.getClass(), "edgeDataSize", 0);
        setField(term45218, term45218.getClass(), "vertexLabel", null);
        setField(term45218, term45218.getClass(), "edgeLabel", null);
        setField(term45218, term45218.getClass(), "vertexIndex", null);
        setField(term45218, term45218.getClass(), "adjSet", null);
        setField(term45218, term45218.getClass(), "adjMap", null);
        setField(term45218, term45218.getClass(), "maxVertexNumber", null);
        setField(term45218, term45218.getClass(), "labelVertexMap", null);
        setField(term45218, term45218.getClass(), "labelEdgeMap", null);
        setBooleanField(term45218, term45218.getClass(), "directed", false);
        setBooleanField(term45218, term45218.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45218, term45218.getClass(), "allowingSelfLoops", false);
        setIntField(term45218, term45218.getClass(), "avgDegree", 0);
        setBooleanField(term45218, term45218.getClass(), "safeMode", false);
        term45229 = new Integer(0);
        term45231 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45229;
        args[1] = term45231;
        callMethod(klass, "edgeIndex", argTypes, term45218, args);
    }

};


