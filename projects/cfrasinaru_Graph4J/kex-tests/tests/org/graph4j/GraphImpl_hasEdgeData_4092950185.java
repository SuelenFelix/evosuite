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

public class GraphImpl_hasEdgeData_4092950185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45590;
     Object term45601;

    public GraphImpl_hasEdgeData_4092950185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45590 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45590, term45590.getClass(), "name", null);
        setIntField(term45590, term45590.getClass(), "maxVertices", 0);
        setIntField(term45590, term45590.getClass(), "numVertices", 0);
        setLongField(term45590, term45590.getClass(), "numEdges", 0L);
        setField(term45590, term45590.getClass(), "vertices", null);
        setField(term45590, term45590.getClass(), "degree", null);
        setField(term45590, term45590.getClass(), "adjList", null);
        setField(term45590, term45590.getClass(), "adjPos", null);
        setField(term45590, term45590.getClass(), "vertexWeight", null);
        setIntField(term45590, term45590.getClass(), "vertexDataSize", 0);
        setField(term45590, term45590.getClass(), "edgeData", null);
        setIntField(term45590, term45590.getClass(), "edgeDataSize", 0);
        setField(term45590, term45590.getClass(), "vertexLabel", null);
        setField(term45590, term45590.getClass(), "edgeLabel", null);
        setField(term45590, term45590.getClass(), "vertexIndex", null);
        setField(term45590, term45590.getClass(), "adjSet", null);
        setField(term45590, term45590.getClass(), "adjMap", null);
        setField(term45590, term45590.getClass(), "maxVertexNumber", null);
        setField(term45590, term45590.getClass(), "labelVertexMap", null);
        setField(term45590, term45590.getClass(), "labelEdgeMap", null);
        setBooleanField(term45590, term45590.getClass(), "directed", false);
        setBooleanField(term45590, term45590.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45590, term45590.getClass(), "allowingSelfLoops", false);
        setIntField(term45590, term45590.getClass(), "avgDegree", 0);
        setBooleanField(term45590, term45590.getClass(), "safeMode", false);
        term45601 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45601;
        callMethod(klass, "hasEdgeData", argTypes, term45590, args);
    }

};


