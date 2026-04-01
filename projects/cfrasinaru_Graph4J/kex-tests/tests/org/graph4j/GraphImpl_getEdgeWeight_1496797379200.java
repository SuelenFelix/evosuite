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

public class GraphImpl_getEdgeWeight_1496797379200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45833;
     Object term45844;
     Object term45846;

    public GraphImpl_getEdgeWeight_1496797379200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45833 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45833, term45833.getClass(), "name", null);
        setIntField(term45833, term45833.getClass(), "maxVertices", 0);
        setIntField(term45833, term45833.getClass(), "numVertices", 0);
        setLongField(term45833, term45833.getClass(), "numEdges", 0L);
        setField(term45833, term45833.getClass(), "vertices", null);
        setField(term45833, term45833.getClass(), "degree", null);
        setField(term45833, term45833.getClass(), "adjList", null);
        setField(term45833, term45833.getClass(), "adjPos", null);
        setField(term45833, term45833.getClass(), "vertexWeight", null);
        setIntField(term45833, term45833.getClass(), "vertexDataSize", 0);
        setField(term45833, term45833.getClass(), "edgeData", null);
        setIntField(term45833, term45833.getClass(), "edgeDataSize", 0);
        setField(term45833, term45833.getClass(), "vertexLabel", null);
        setField(term45833, term45833.getClass(), "edgeLabel", null);
        setField(term45833, term45833.getClass(), "vertexIndex", null);
        setField(term45833, term45833.getClass(), "adjSet", null);
        setField(term45833, term45833.getClass(), "adjMap", null);
        setField(term45833, term45833.getClass(), "maxVertexNumber", null);
        setField(term45833, term45833.getClass(), "labelVertexMap", null);
        setField(term45833, term45833.getClass(), "labelEdgeMap", null);
        setBooleanField(term45833, term45833.getClass(), "directed", false);
        setBooleanField(term45833, term45833.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45833, term45833.getClass(), "allowingSelfLoops", false);
        setIntField(term45833, term45833.getClass(), "avgDegree", 0);
        setBooleanField(term45833, term45833.getClass(), "safeMode", false);
        term45844 = new Integer(0);
        term45846 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45844;
        args[1] = term45846;
        callMethod(klass, "getEdgeWeight", argTypes, term45833, args);
    }

};


