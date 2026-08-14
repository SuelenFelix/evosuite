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

public class GraphImpl_setEdgeWeight_1288981251198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45799;
     Object term45810;
     Object term45812;
     Object term45814;

    public GraphImpl_setEdgeWeight_1288981251198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45799 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45799, term45799.getClass(), "name", null);
        setIntField(term45799, term45799.getClass(), "maxVertices", 0);
        setIntField(term45799, term45799.getClass(), "numVertices", 0);
        setLongField(term45799, term45799.getClass(), "numEdges", 0L);
        setField(term45799, term45799.getClass(), "vertices", null);
        setField(term45799, term45799.getClass(), "degree", null);
        setField(term45799, term45799.getClass(), "adjList", null);
        setField(term45799, term45799.getClass(), "adjPos", null);
        setField(term45799, term45799.getClass(), "vertexWeight", null);
        setIntField(term45799, term45799.getClass(), "vertexDataSize", 0);
        setField(term45799, term45799.getClass(), "edgeData", null);
        setIntField(term45799, term45799.getClass(), "edgeDataSize", 0);
        setField(term45799, term45799.getClass(), "vertexLabel", null);
        setField(term45799, term45799.getClass(), "edgeLabel", null);
        setField(term45799, term45799.getClass(), "vertexIndex", null);
        setField(term45799, term45799.getClass(), "adjSet", null);
        setField(term45799, term45799.getClass(), "adjMap", null);
        setField(term45799, term45799.getClass(), "maxVertexNumber", null);
        setField(term45799, term45799.getClass(), "labelVertexMap", null);
        setField(term45799, term45799.getClass(), "labelEdgeMap", null);
        setBooleanField(term45799, term45799.getClass(), "directed", false);
        setBooleanField(term45799, term45799.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45799, term45799.getClass(), "allowingSelfLoops", false);
        setIntField(term45799, term45799.getClass(), "avgDegree", 0);
        setBooleanField(term45799, term45799.getClass(), "safeMode", false);
        term45810 = new Integer(0);
        term45812 = new Integer(0);
        term45814 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term45810;
        args[1] = term45812;
        args[2] = term45814;
        callMethod(klass, "setEdgeWeight", argTypes, term45799, args);
    }

};


