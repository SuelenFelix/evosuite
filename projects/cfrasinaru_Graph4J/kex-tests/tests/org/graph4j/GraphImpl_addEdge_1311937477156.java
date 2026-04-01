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

public class GraphImpl_addEdge_1311937477156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45203;
     Object term45214;
     Object term45216;

    public GraphImpl_addEdge_1311937477156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45203 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45203, term45203.getClass(), "name", null);
        setIntField(term45203, term45203.getClass(), "maxVertices", 0);
        setIntField(term45203, term45203.getClass(), "numVertices", 0);
        setLongField(term45203, term45203.getClass(), "numEdges", 0L);
        setField(term45203, term45203.getClass(), "vertices", null);
        setField(term45203, term45203.getClass(), "degree", null);
        setField(term45203, term45203.getClass(), "adjList", null);
        setField(term45203, term45203.getClass(), "adjPos", null);
        setField(term45203, term45203.getClass(), "vertexWeight", null);
        setIntField(term45203, term45203.getClass(), "vertexDataSize", 0);
        setField(term45203, term45203.getClass(), "edgeData", null);
        setIntField(term45203, term45203.getClass(), "edgeDataSize", 0);
        setField(term45203, term45203.getClass(), "vertexLabel", null);
        setField(term45203, term45203.getClass(), "edgeLabel", null);
        setField(term45203, term45203.getClass(), "vertexIndex", null);
        setField(term45203, term45203.getClass(), "adjSet", null);
        setField(term45203, term45203.getClass(), "adjMap", null);
        setField(term45203, term45203.getClass(), "maxVertexNumber", null);
        setField(term45203, term45203.getClass(), "labelVertexMap", null);
        setField(term45203, term45203.getClass(), "labelEdgeMap", null);
        setBooleanField(term45203, term45203.getClass(), "directed", false);
        setBooleanField(term45203, term45203.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45203, term45203.getClass(), "allowingSelfLoops", false);
        setIntField(term45203, term45203.getClass(), "avgDegree", 0);
        setBooleanField(term45203, term45203.getClass(), "safeMode", false);
        term45214 = new Integer(0);
        term45216 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45214;
        args[1] = term45216;
        callMethod(klass, "addEdge", argTypes, term45203, args);
    }

};


