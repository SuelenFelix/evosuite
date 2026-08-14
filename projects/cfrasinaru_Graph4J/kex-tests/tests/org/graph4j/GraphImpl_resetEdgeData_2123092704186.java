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
import java.lang.Double;

public class GraphImpl_resetEdgeData_2123092704186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45603;
     Object term45614;
     Object term45616;

    public GraphImpl_resetEdgeData_2123092704186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45603 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45603, term45603.getClass(), "name", null);
        setIntField(term45603, term45603.getClass(), "maxVertices", 0);
        setIntField(term45603, term45603.getClass(), "numVertices", 0);
        setLongField(term45603, term45603.getClass(), "numEdges", 0L);
        setField(term45603, term45603.getClass(), "vertices", null);
        setField(term45603, term45603.getClass(), "degree", null);
        setField(term45603, term45603.getClass(), "adjList", null);
        setField(term45603, term45603.getClass(), "adjPos", null);
        setField(term45603, term45603.getClass(), "vertexWeight", null);
        setIntField(term45603, term45603.getClass(), "vertexDataSize", 0);
        setField(term45603, term45603.getClass(), "edgeData", null);
        setIntField(term45603, term45603.getClass(), "edgeDataSize", 0);
        setField(term45603, term45603.getClass(), "vertexLabel", null);
        setField(term45603, term45603.getClass(), "edgeLabel", null);
        setField(term45603, term45603.getClass(), "vertexIndex", null);
        setField(term45603, term45603.getClass(), "adjSet", null);
        setField(term45603, term45603.getClass(), "adjMap", null);
        setField(term45603, term45603.getClass(), "maxVertexNumber", null);
        setField(term45603, term45603.getClass(), "labelVertexMap", null);
        setField(term45603, term45603.getClass(), "labelEdgeMap", null);
        setBooleanField(term45603, term45603.getClass(), "directed", false);
        setBooleanField(term45603, term45603.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45603, term45603.getClass(), "allowingSelfLoops", false);
        setIntField(term45603, term45603.getClass(), "avgDegree", 0);
        setBooleanField(term45603, term45603.getClass(), "safeMode", false);
        term45614 = new Integer(0);
        term45616 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term45614;
        args[1] = term45616;
        callMethod(klass, "resetEdgeData", argTypes, term45603, args);
    }

};


