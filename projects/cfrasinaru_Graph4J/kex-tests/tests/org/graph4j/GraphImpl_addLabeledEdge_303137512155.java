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

public class GraphImpl_addLabeledEdge_303137512155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45186;
     Object term45197;
     Object term45199;
     Object term45201;

    public GraphImpl_addLabeledEdge_303137512155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45186 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45186, term45186.getClass(), "name", null);
        setIntField(term45186, term45186.getClass(), "maxVertices", 0);
        setIntField(term45186, term45186.getClass(), "numVertices", 0);
        setLongField(term45186, term45186.getClass(), "numEdges", 0L);
        setField(term45186, term45186.getClass(), "vertices", null);
        setField(term45186, term45186.getClass(), "degree", null);
        setField(term45186, term45186.getClass(), "adjList", null);
        setField(term45186, term45186.getClass(), "adjPos", null);
        setField(term45186, term45186.getClass(), "vertexWeight", null);
        setIntField(term45186, term45186.getClass(), "vertexDataSize", 0);
        setField(term45186, term45186.getClass(), "edgeData", null);
        setIntField(term45186, term45186.getClass(), "edgeDataSize", 0);
        setField(term45186, term45186.getClass(), "vertexLabel", null);
        setField(term45186, term45186.getClass(), "edgeLabel", null);
        setField(term45186, term45186.getClass(), "vertexIndex", null);
        setField(term45186, term45186.getClass(), "adjSet", null);
        setField(term45186, term45186.getClass(), "adjMap", null);
        setField(term45186, term45186.getClass(), "maxVertexNumber", null);
        setField(term45186, term45186.getClass(), "labelVertexMap", null);
        setField(term45186, term45186.getClass(), "labelEdgeMap", null);
        setBooleanField(term45186, term45186.getClass(), "directed", false);
        setBooleanField(term45186, term45186.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45186, term45186.getClass(), "allowingSelfLoops", false);
        setIntField(term45186, term45186.getClass(), "avgDegree", 0);
        setBooleanField(term45186, term45186.getClass(), "safeMode", false);
        term45197 = new Integer(0);
        term45199 = new Integer(0);
        term45201 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term45197;
        args[1] = term45199;
        args[2] = null;
        args[3] = term45201;
        callMethod(klass, "addLabeledEdge", argTypes, term45186, args);
    }

};


