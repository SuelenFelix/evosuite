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

public class GraphImpl_addEdge_1136214730153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45154;
     Object term45165;
     Object term45167;
     Object term45169;

    public GraphImpl_addEdge_1136214730153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45154 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45154, term45154.getClass(), "name", null);
        setIntField(term45154, term45154.getClass(), "maxVertices", 0);
        setIntField(term45154, term45154.getClass(), "numVertices", 0);
        setLongField(term45154, term45154.getClass(), "numEdges", 0L);
        setField(term45154, term45154.getClass(), "vertices", null);
        setField(term45154, term45154.getClass(), "degree", null);
        setField(term45154, term45154.getClass(), "adjList", null);
        setField(term45154, term45154.getClass(), "adjPos", null);
        setField(term45154, term45154.getClass(), "vertexWeight", null);
        setIntField(term45154, term45154.getClass(), "vertexDataSize", 0);
        setField(term45154, term45154.getClass(), "edgeData", null);
        setIntField(term45154, term45154.getClass(), "edgeDataSize", 0);
        setField(term45154, term45154.getClass(), "vertexLabel", null);
        setField(term45154, term45154.getClass(), "edgeLabel", null);
        setField(term45154, term45154.getClass(), "vertexIndex", null);
        setField(term45154, term45154.getClass(), "adjSet", null);
        setField(term45154, term45154.getClass(), "adjMap", null);
        setField(term45154, term45154.getClass(), "maxVertexNumber", null);
        setField(term45154, term45154.getClass(), "labelVertexMap", null);
        setField(term45154, term45154.getClass(), "labelEdgeMap", null);
        setBooleanField(term45154, term45154.getClass(), "directed", false);
        setBooleanField(term45154, term45154.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45154, term45154.getClass(), "allowingSelfLoops", false);
        setIntField(term45154, term45154.getClass(), "avgDegree", 0);
        setBooleanField(term45154, term45154.getClass(), "safeMode", false);
        term45165 = new Integer(0);
        term45167 = new Integer(0);
        term45169 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term45165;
        args[1] = term45167;
        args[2] = term45169;
        callMethod(klass, "addEdge", argTypes, term45154, args);
    }

};


