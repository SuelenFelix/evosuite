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

public class GraphImpl_multiplicity_1891718394179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45518;
     Object term45529;
     Object term45531;

    public GraphImpl_multiplicity_1891718394179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45518 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45518, term45518.getClass(), "name", null);
        setIntField(term45518, term45518.getClass(), "maxVertices", 0);
        setIntField(term45518, term45518.getClass(), "numVertices", 0);
        setLongField(term45518, term45518.getClass(), "numEdges", 0L);
        setField(term45518, term45518.getClass(), "vertices", null);
        setField(term45518, term45518.getClass(), "degree", null);
        setField(term45518, term45518.getClass(), "adjList", null);
        setField(term45518, term45518.getClass(), "adjPos", null);
        setField(term45518, term45518.getClass(), "vertexWeight", null);
        setIntField(term45518, term45518.getClass(), "vertexDataSize", 0);
        setField(term45518, term45518.getClass(), "edgeData", null);
        setIntField(term45518, term45518.getClass(), "edgeDataSize", 0);
        setField(term45518, term45518.getClass(), "vertexLabel", null);
        setField(term45518, term45518.getClass(), "edgeLabel", null);
        setField(term45518, term45518.getClass(), "vertexIndex", null);
        setField(term45518, term45518.getClass(), "adjSet", null);
        setField(term45518, term45518.getClass(), "adjMap", null);
        setField(term45518, term45518.getClass(), "maxVertexNumber", null);
        setField(term45518, term45518.getClass(), "labelVertexMap", null);
        setField(term45518, term45518.getClass(), "labelEdgeMap", null);
        setBooleanField(term45518, term45518.getClass(), "directed", false);
        setBooleanField(term45518, term45518.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45518, term45518.getClass(), "allowingSelfLoops", false);
        setIntField(term45518, term45518.getClass(), "avgDegree", 0);
        setBooleanField(term45518, term45518.getClass(), "safeMode", false);
        term45529 = new Integer(0);
        term45531 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45529;
        args[1] = term45531;
        callMethod(klass, "multiplicity", argTypes, term45518, args);
    }

};


