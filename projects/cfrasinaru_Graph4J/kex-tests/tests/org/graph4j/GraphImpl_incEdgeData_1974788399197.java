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

public class GraphImpl_incEdgeData_1974788399197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45780;
     Object term45791;
     Object term45793;
     Object term45795;
     Object term45797;

    public GraphImpl_incEdgeData_1974788399197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45780 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45780, term45780.getClass(), "name", null);
        setIntField(term45780, term45780.getClass(), "maxVertices", 0);
        setIntField(term45780, term45780.getClass(), "numVertices", 0);
        setLongField(term45780, term45780.getClass(), "numEdges", 0L);
        setField(term45780, term45780.getClass(), "vertices", null);
        setField(term45780, term45780.getClass(), "degree", null);
        setField(term45780, term45780.getClass(), "adjList", null);
        setField(term45780, term45780.getClass(), "adjPos", null);
        setField(term45780, term45780.getClass(), "vertexWeight", null);
        setIntField(term45780, term45780.getClass(), "vertexDataSize", 0);
        setField(term45780, term45780.getClass(), "edgeData", null);
        setIntField(term45780, term45780.getClass(), "edgeDataSize", 0);
        setField(term45780, term45780.getClass(), "vertexLabel", null);
        setField(term45780, term45780.getClass(), "edgeLabel", null);
        setField(term45780, term45780.getClass(), "vertexIndex", null);
        setField(term45780, term45780.getClass(), "adjSet", null);
        setField(term45780, term45780.getClass(), "adjMap", null);
        setField(term45780, term45780.getClass(), "maxVertexNumber", null);
        setField(term45780, term45780.getClass(), "labelVertexMap", null);
        setField(term45780, term45780.getClass(), "labelEdgeMap", null);
        setBooleanField(term45780, term45780.getClass(), "directed", false);
        setBooleanField(term45780, term45780.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45780, term45780.getClass(), "allowingSelfLoops", false);
        setIntField(term45780, term45780.getClass(), "avgDegree", 0);
        setBooleanField(term45780, term45780.getClass(), "safeMode", false);
        term45791 = new Integer(0);
        term45793 = new Integer(0);
        term45795 = new Integer(0);
        term45797 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term45791;
        args[1] = term45793;
        args[2] = term45795;
        args[3] = term45797;
        callMethod(klass, "incEdgeData", argTypes, term45780, args);
    }

};


