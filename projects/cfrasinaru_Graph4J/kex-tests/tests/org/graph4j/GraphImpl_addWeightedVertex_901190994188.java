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

public class GraphImpl_addWeightedVertex_901190994188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45629;
     Object term45640;
     Object term45642;

    public GraphImpl_addWeightedVertex_901190994188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45629 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45629, term45629.getClass(), "name", null);
        setIntField(term45629, term45629.getClass(), "maxVertices", 0);
        setIntField(term45629, term45629.getClass(), "numVertices", 0);
        setLongField(term45629, term45629.getClass(), "numEdges", 0L);
        setField(term45629, term45629.getClass(), "vertices", null);
        setField(term45629, term45629.getClass(), "degree", null);
        setField(term45629, term45629.getClass(), "adjList", null);
        setField(term45629, term45629.getClass(), "adjPos", null);
        setField(term45629, term45629.getClass(), "vertexWeight", null);
        setIntField(term45629, term45629.getClass(), "vertexDataSize", 0);
        setField(term45629, term45629.getClass(), "edgeData", null);
        setIntField(term45629, term45629.getClass(), "edgeDataSize", 0);
        setField(term45629, term45629.getClass(), "vertexLabel", null);
        setField(term45629, term45629.getClass(), "edgeLabel", null);
        setField(term45629, term45629.getClass(), "vertexIndex", null);
        setField(term45629, term45629.getClass(), "adjSet", null);
        setField(term45629, term45629.getClass(), "adjMap", null);
        setField(term45629, term45629.getClass(), "maxVertexNumber", null);
        setField(term45629, term45629.getClass(), "labelVertexMap", null);
        setField(term45629, term45629.getClass(), "labelEdgeMap", null);
        setBooleanField(term45629, term45629.getClass(), "directed", false);
        setBooleanField(term45629, term45629.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45629, term45629.getClass(), "allowingSelfLoops", false);
        setIntField(term45629, term45629.getClass(), "avgDegree", 0);
        setBooleanField(term45629, term45629.getClass(), "safeMode", false);
        term45640 = new Integer(0);
        term45642 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term45640;
        args[1] = term45642;
        callMethod(klass, "addWeightedVertex", argTypes, term45629, args);
    }

};


