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

public class GraphImpl_removeEdgeAt_1666542127160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45263;
     Object term45274;
     Object term45276;

    public GraphImpl_removeEdgeAt_1666542127160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45263 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45263, term45263.getClass(), "name", null);
        setIntField(term45263, term45263.getClass(), "maxVertices", 0);
        setIntField(term45263, term45263.getClass(), "numVertices", 0);
        setLongField(term45263, term45263.getClass(), "numEdges", 0L);
        setField(term45263, term45263.getClass(), "vertices", null);
        setField(term45263, term45263.getClass(), "degree", null);
        setField(term45263, term45263.getClass(), "adjList", null);
        setField(term45263, term45263.getClass(), "adjPos", null);
        setField(term45263, term45263.getClass(), "vertexWeight", null);
        setIntField(term45263, term45263.getClass(), "vertexDataSize", 0);
        setField(term45263, term45263.getClass(), "edgeData", null);
        setIntField(term45263, term45263.getClass(), "edgeDataSize", 0);
        setField(term45263, term45263.getClass(), "vertexLabel", null);
        setField(term45263, term45263.getClass(), "edgeLabel", null);
        setField(term45263, term45263.getClass(), "vertexIndex", null);
        setField(term45263, term45263.getClass(), "adjSet", null);
        setField(term45263, term45263.getClass(), "adjMap", null);
        setField(term45263, term45263.getClass(), "maxVertexNumber", null);
        setField(term45263, term45263.getClass(), "labelVertexMap", null);
        setField(term45263, term45263.getClass(), "labelEdgeMap", null);
        setBooleanField(term45263, term45263.getClass(), "directed", false);
        setBooleanField(term45263, term45263.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45263, term45263.getClass(), "allowingSelfLoops", false);
        setIntField(term45263, term45263.getClass(), "avgDegree", 0);
        setBooleanField(term45263, term45263.getClass(), "safeMode", false);
        term45274 = new Integer(0);
        term45276 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45274;
        args[1] = term45276;
        callMethod(klass, "removeEdgeAt", argTypes, term45263, args);
    }

};


