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

public class GraphImpl_incEdgeDataAt_1892959106196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45761;
     Object term45772;
     Object term45774;
     Object term45776;
     Object term45778;

    public GraphImpl_incEdgeDataAt_1892959106196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45761 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45761, term45761.getClass(), "name", null);
        setIntField(term45761, term45761.getClass(), "maxVertices", 0);
        setIntField(term45761, term45761.getClass(), "numVertices", 0);
        setLongField(term45761, term45761.getClass(), "numEdges", 0L);
        setField(term45761, term45761.getClass(), "vertices", null);
        setField(term45761, term45761.getClass(), "degree", null);
        setField(term45761, term45761.getClass(), "adjList", null);
        setField(term45761, term45761.getClass(), "adjPos", null);
        setField(term45761, term45761.getClass(), "vertexWeight", null);
        setIntField(term45761, term45761.getClass(), "vertexDataSize", 0);
        setField(term45761, term45761.getClass(), "edgeData", null);
        setIntField(term45761, term45761.getClass(), "edgeDataSize", 0);
        setField(term45761, term45761.getClass(), "vertexLabel", null);
        setField(term45761, term45761.getClass(), "edgeLabel", null);
        setField(term45761, term45761.getClass(), "vertexIndex", null);
        setField(term45761, term45761.getClass(), "adjSet", null);
        setField(term45761, term45761.getClass(), "adjMap", null);
        setField(term45761, term45761.getClass(), "maxVertexNumber", null);
        setField(term45761, term45761.getClass(), "labelVertexMap", null);
        setField(term45761, term45761.getClass(), "labelEdgeMap", null);
        setBooleanField(term45761, term45761.getClass(), "directed", false);
        setBooleanField(term45761, term45761.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45761, term45761.getClass(), "allowingSelfLoops", false);
        setIntField(term45761, term45761.getClass(), "avgDegree", 0);
        setBooleanField(term45761, term45761.getClass(), "safeMode", false);
        term45772 = new Integer(0);
        term45774 = new Integer(0);
        term45776 = new Integer(0);
        term45778 = new Double(0.0);
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
        args[0] = term45772;
        args[1] = term45774;
        args[2] = term45776;
        args[3] = term45778;
        callMethod(klass, "incEdgeDataAt", argTypes, term45761, args);
    }

};


