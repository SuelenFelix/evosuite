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

public class GraphImpl_onAdjListPosChange_1630509307165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45334;
     Object term45345;
     Object term45347;
     Object term45349;

    public GraphImpl_onAdjListPosChange_1630509307165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45334 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45334, term45334.getClass(), "name", null);
        setIntField(term45334, term45334.getClass(), "maxVertices", 0);
        setIntField(term45334, term45334.getClass(), "numVertices", 0);
        setLongField(term45334, term45334.getClass(), "numEdges", 0L);
        setField(term45334, term45334.getClass(), "vertices", null);
        setField(term45334, term45334.getClass(), "degree", null);
        setField(term45334, term45334.getClass(), "adjList", null);
        setField(term45334, term45334.getClass(), "adjPos", null);
        setField(term45334, term45334.getClass(), "vertexWeight", null);
        setIntField(term45334, term45334.getClass(), "vertexDataSize", 0);
        setField(term45334, term45334.getClass(), "edgeData", null);
        setIntField(term45334, term45334.getClass(), "edgeDataSize", 0);
        setField(term45334, term45334.getClass(), "vertexLabel", null);
        setField(term45334, term45334.getClass(), "edgeLabel", null);
        setField(term45334, term45334.getClass(), "vertexIndex", null);
        setField(term45334, term45334.getClass(), "adjSet", null);
        setField(term45334, term45334.getClass(), "adjMap", null);
        setField(term45334, term45334.getClass(), "maxVertexNumber", null);
        setField(term45334, term45334.getClass(), "labelVertexMap", null);
        setField(term45334, term45334.getClass(), "labelEdgeMap", null);
        setBooleanField(term45334, term45334.getClass(), "directed", false);
        setBooleanField(term45334, term45334.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45334, term45334.getClass(), "allowingSelfLoops", false);
        setIntField(term45334, term45334.getClass(), "avgDegree", 0);
        setBooleanField(term45334, term45334.getClass(), "safeMode", false);
        term45345 = new Integer(0);
        term45347 = new Integer(0);
        term45349 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term45345;
        args[1] = term45347;
        args[2] = term45349;
        callMethod(klass, "onAdjListPosChange", argTypes, term45334, args);
    }

};


