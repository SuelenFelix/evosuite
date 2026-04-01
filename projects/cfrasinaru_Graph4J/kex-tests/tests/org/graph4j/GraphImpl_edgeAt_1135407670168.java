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

public class GraphImpl_edgeAt_1135407670168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45381;
     Object term45392;
     Object term45394;

    public GraphImpl_edgeAt_1135407670168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45381 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45381, term45381.getClass(), "name", null);
        setIntField(term45381, term45381.getClass(), "maxVertices", 0);
        setIntField(term45381, term45381.getClass(), "numVertices", 0);
        setLongField(term45381, term45381.getClass(), "numEdges", 0L);
        setField(term45381, term45381.getClass(), "vertices", null);
        setField(term45381, term45381.getClass(), "degree", null);
        setField(term45381, term45381.getClass(), "adjList", null);
        setField(term45381, term45381.getClass(), "adjPos", null);
        setField(term45381, term45381.getClass(), "vertexWeight", null);
        setIntField(term45381, term45381.getClass(), "vertexDataSize", 0);
        setField(term45381, term45381.getClass(), "edgeData", null);
        setIntField(term45381, term45381.getClass(), "edgeDataSize", 0);
        setField(term45381, term45381.getClass(), "vertexLabel", null);
        setField(term45381, term45381.getClass(), "edgeLabel", null);
        setField(term45381, term45381.getClass(), "vertexIndex", null);
        setField(term45381, term45381.getClass(), "adjSet", null);
        setField(term45381, term45381.getClass(), "adjMap", null);
        setField(term45381, term45381.getClass(), "maxVertexNumber", null);
        setField(term45381, term45381.getClass(), "labelVertexMap", null);
        setField(term45381, term45381.getClass(), "labelEdgeMap", null);
        setBooleanField(term45381, term45381.getClass(), "directed", false);
        setBooleanField(term45381, term45381.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45381, term45381.getClass(), "allowingSelfLoops", false);
        setIntField(term45381, term45381.getClass(), "avgDegree", 0);
        setBooleanField(term45381, term45381.getClass(), "safeMode", false);
        term45392 = new Integer(0);
        term45394 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45392;
        args[1] = term45394;
        callMethod(klass, "edgeAt", argTypes, term45381, args);
    }

};


