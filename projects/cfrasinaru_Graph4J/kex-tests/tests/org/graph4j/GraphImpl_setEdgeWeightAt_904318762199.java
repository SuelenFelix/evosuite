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

public class GraphImpl_setEdgeWeightAt_904318762199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45816;
     Object term45827;
     Object term45829;
     Object term45831;

    public GraphImpl_setEdgeWeightAt_904318762199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45816 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45816, term45816.getClass(), "name", null);
        setIntField(term45816, term45816.getClass(), "maxVertices", 0);
        setIntField(term45816, term45816.getClass(), "numVertices", 0);
        setLongField(term45816, term45816.getClass(), "numEdges", 0L);
        setField(term45816, term45816.getClass(), "vertices", null);
        setField(term45816, term45816.getClass(), "degree", null);
        setField(term45816, term45816.getClass(), "adjList", null);
        setField(term45816, term45816.getClass(), "adjPos", null);
        setField(term45816, term45816.getClass(), "vertexWeight", null);
        setIntField(term45816, term45816.getClass(), "vertexDataSize", 0);
        setField(term45816, term45816.getClass(), "edgeData", null);
        setIntField(term45816, term45816.getClass(), "edgeDataSize", 0);
        setField(term45816, term45816.getClass(), "vertexLabel", null);
        setField(term45816, term45816.getClass(), "edgeLabel", null);
        setField(term45816, term45816.getClass(), "vertexIndex", null);
        setField(term45816, term45816.getClass(), "adjSet", null);
        setField(term45816, term45816.getClass(), "adjMap", null);
        setField(term45816, term45816.getClass(), "maxVertexNumber", null);
        setField(term45816, term45816.getClass(), "labelVertexMap", null);
        setField(term45816, term45816.getClass(), "labelEdgeMap", null);
        setBooleanField(term45816, term45816.getClass(), "directed", false);
        setBooleanField(term45816, term45816.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45816, term45816.getClass(), "allowingSelfLoops", false);
        setIntField(term45816, term45816.getClass(), "avgDegree", 0);
        setBooleanField(term45816, term45816.getClass(), "safeMode", false);
        term45827 = new Integer(0);
        term45829 = new Integer(0);
        term45831 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term45827;
        args[1] = term45829;
        args[2] = term45831;
        callMethod(klass, "setEdgeWeightAt", argTypes, term45816, args);
    }

};


