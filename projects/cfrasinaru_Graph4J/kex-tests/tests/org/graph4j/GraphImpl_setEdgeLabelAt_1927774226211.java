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

public class GraphImpl_setEdgeLabelAt_1927774226211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45972;
     Object term45983;
     Object term45985;

    public GraphImpl_setEdgeLabelAt_1927774226211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45972 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45972, term45972.getClass(), "name", null);
        setIntField(term45972, term45972.getClass(), "maxVertices", 0);
        setIntField(term45972, term45972.getClass(), "numVertices", 0);
        setLongField(term45972, term45972.getClass(), "numEdges", 0L);
        setField(term45972, term45972.getClass(), "vertices", null);
        setField(term45972, term45972.getClass(), "degree", null);
        setField(term45972, term45972.getClass(), "adjList", null);
        setField(term45972, term45972.getClass(), "adjPos", null);
        setField(term45972, term45972.getClass(), "vertexWeight", null);
        setIntField(term45972, term45972.getClass(), "vertexDataSize", 0);
        setField(term45972, term45972.getClass(), "edgeData", null);
        setIntField(term45972, term45972.getClass(), "edgeDataSize", 0);
        setField(term45972, term45972.getClass(), "vertexLabel", null);
        setField(term45972, term45972.getClass(), "edgeLabel", null);
        setField(term45972, term45972.getClass(), "vertexIndex", null);
        setField(term45972, term45972.getClass(), "adjSet", null);
        setField(term45972, term45972.getClass(), "adjMap", null);
        setField(term45972, term45972.getClass(), "maxVertexNumber", null);
        setField(term45972, term45972.getClass(), "labelVertexMap", null);
        setField(term45972, term45972.getClass(), "labelEdgeMap", null);
        setBooleanField(term45972, term45972.getClass(), "directed", false);
        setBooleanField(term45972, term45972.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45972, term45972.getClass(), "allowingSelfLoops", false);
        setIntField(term45972, term45972.getClass(), "avgDegree", 0);
        setBooleanField(term45972, term45972.getClass(), "safeMode", false);
        term45983 = new Integer(0);
        term45985 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term45983;
        args[1] = term45985;
        args[2] = null;
        callMethod(klass, "setEdgeLabelAt", argTypes, term45972, args);
    }

};


