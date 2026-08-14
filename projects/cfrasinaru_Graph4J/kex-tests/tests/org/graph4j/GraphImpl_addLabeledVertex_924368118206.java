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

public class GraphImpl_addLabeledVertex_924368118206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45907;
     Object term45918;

    public GraphImpl_addLabeledVertex_924368118206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45907 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45907, term45907.getClass(), "name", null);
        setIntField(term45907, term45907.getClass(), "maxVertices", 0);
        setIntField(term45907, term45907.getClass(), "numVertices", 0);
        setLongField(term45907, term45907.getClass(), "numEdges", 0L);
        setField(term45907, term45907.getClass(), "vertices", null);
        setField(term45907, term45907.getClass(), "degree", null);
        setField(term45907, term45907.getClass(), "adjList", null);
        setField(term45907, term45907.getClass(), "adjPos", null);
        setField(term45907, term45907.getClass(), "vertexWeight", null);
        setIntField(term45907, term45907.getClass(), "vertexDataSize", 0);
        setField(term45907, term45907.getClass(), "edgeData", null);
        setIntField(term45907, term45907.getClass(), "edgeDataSize", 0);
        setField(term45907, term45907.getClass(), "vertexLabel", null);
        setField(term45907, term45907.getClass(), "edgeLabel", null);
        setField(term45907, term45907.getClass(), "vertexIndex", null);
        setField(term45907, term45907.getClass(), "adjSet", null);
        setField(term45907, term45907.getClass(), "adjMap", null);
        setField(term45907, term45907.getClass(), "maxVertexNumber", null);
        setField(term45907, term45907.getClass(), "labelVertexMap", null);
        setField(term45907, term45907.getClass(), "labelEdgeMap", null);
        setBooleanField(term45907, term45907.getClass(), "directed", false);
        setBooleanField(term45907, term45907.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45907, term45907.getClass(), "allowingSelfLoops", false);
        setIntField(term45907, term45907.getClass(), "avgDegree", 0);
        setBooleanField(term45907, term45907.getClass(), "safeMode", false);
        term45918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term45918;
        args[1] = null;
        callMethod(klass, "addLabeledVertex", argTypes, term45907, args);
    }

};


