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

public class GraphImpl_indexOf_919267474144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45041;
     Object term45052;

    public GraphImpl_indexOf_919267474144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45041 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45041, term45041.getClass(), "name", null);
        setIntField(term45041, term45041.getClass(), "maxVertices", 0);
        setIntField(term45041, term45041.getClass(), "numVertices", 0);
        setLongField(term45041, term45041.getClass(), "numEdges", 0L);
        setField(term45041, term45041.getClass(), "vertices", null);
        setField(term45041, term45041.getClass(), "degree", null);
        setField(term45041, term45041.getClass(), "adjList", null);
        setField(term45041, term45041.getClass(), "adjPos", null);
        setField(term45041, term45041.getClass(), "vertexWeight", null);
        setIntField(term45041, term45041.getClass(), "vertexDataSize", 0);
        setField(term45041, term45041.getClass(), "edgeData", null);
        setIntField(term45041, term45041.getClass(), "edgeDataSize", 0);
        setField(term45041, term45041.getClass(), "vertexLabel", null);
        setField(term45041, term45041.getClass(), "edgeLabel", null);
        setField(term45041, term45041.getClass(), "vertexIndex", null);
        setField(term45041, term45041.getClass(), "adjSet", null);
        setField(term45041, term45041.getClass(), "adjMap", null);
        setField(term45041, term45041.getClass(), "maxVertexNumber", null);
        setField(term45041, term45041.getClass(), "labelVertexMap", null);
        setField(term45041, term45041.getClass(), "labelEdgeMap", null);
        setBooleanField(term45041, term45041.getClass(), "directed", false);
        setBooleanField(term45041, term45041.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45041, term45041.getClass(), "allowingSelfLoops", false);
        setIntField(term45041, term45041.getClass(), "avgDegree", 0);
        setBooleanField(term45041, term45041.getClass(), "safeMode", false);
        term45052 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45052;
        callMethod(klass, "indexOf", argTypes, term45041, args);
    }

};


