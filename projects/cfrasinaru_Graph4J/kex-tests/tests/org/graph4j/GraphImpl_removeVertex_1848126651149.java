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

public class GraphImpl_removeVertex_1848126651149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45106;
     Object term45117;

    public GraphImpl_removeVertex_1848126651149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45106 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45106, term45106.getClass(), "name", null);
        setIntField(term45106, term45106.getClass(), "maxVertices", 0);
        setIntField(term45106, term45106.getClass(), "numVertices", 0);
        setLongField(term45106, term45106.getClass(), "numEdges", 0L);
        setField(term45106, term45106.getClass(), "vertices", null);
        setField(term45106, term45106.getClass(), "degree", null);
        setField(term45106, term45106.getClass(), "adjList", null);
        setField(term45106, term45106.getClass(), "adjPos", null);
        setField(term45106, term45106.getClass(), "vertexWeight", null);
        setIntField(term45106, term45106.getClass(), "vertexDataSize", 0);
        setField(term45106, term45106.getClass(), "edgeData", null);
        setIntField(term45106, term45106.getClass(), "edgeDataSize", 0);
        setField(term45106, term45106.getClass(), "vertexLabel", null);
        setField(term45106, term45106.getClass(), "edgeLabel", null);
        setField(term45106, term45106.getClass(), "vertexIndex", null);
        setField(term45106, term45106.getClass(), "adjSet", null);
        setField(term45106, term45106.getClass(), "adjMap", null);
        setField(term45106, term45106.getClass(), "maxVertexNumber", null);
        setField(term45106, term45106.getClass(), "labelVertexMap", null);
        setField(term45106, term45106.getClass(), "labelEdgeMap", null);
        setBooleanField(term45106, term45106.getClass(), "directed", false);
        setBooleanField(term45106, term45106.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45106, term45106.getClass(), "allowingSelfLoops", false);
        setIntField(term45106, term45106.getClass(), "avgDegree", 0);
        setBooleanField(term45106, term45106.getClass(), "safeMode", false);
        term45117 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45117;
        callMethod(klass, "removeVertex", argTypes, term45106, args);
    }

};


