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

public class GraphImpl_adjListPos_828052554166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45351;
     Object term45362;
     Object term45364;

    public GraphImpl_adjListPos_828052554166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45351 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45351, term45351.getClass(), "name", null);
        setIntField(term45351, term45351.getClass(), "maxVertices", 0);
        setIntField(term45351, term45351.getClass(), "numVertices", 0);
        setLongField(term45351, term45351.getClass(), "numEdges", 0L);
        setField(term45351, term45351.getClass(), "vertices", null);
        setField(term45351, term45351.getClass(), "degree", null);
        setField(term45351, term45351.getClass(), "adjList", null);
        setField(term45351, term45351.getClass(), "adjPos", null);
        setField(term45351, term45351.getClass(), "vertexWeight", null);
        setIntField(term45351, term45351.getClass(), "vertexDataSize", 0);
        setField(term45351, term45351.getClass(), "edgeData", null);
        setIntField(term45351, term45351.getClass(), "edgeDataSize", 0);
        setField(term45351, term45351.getClass(), "vertexLabel", null);
        setField(term45351, term45351.getClass(), "edgeLabel", null);
        setField(term45351, term45351.getClass(), "vertexIndex", null);
        setField(term45351, term45351.getClass(), "adjSet", null);
        setField(term45351, term45351.getClass(), "adjMap", null);
        setField(term45351, term45351.getClass(), "maxVertexNumber", null);
        setField(term45351, term45351.getClass(), "labelVertexMap", null);
        setField(term45351, term45351.getClass(), "labelEdgeMap", null);
        setBooleanField(term45351, term45351.getClass(), "directed", false);
        setBooleanField(term45351, term45351.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45351, term45351.getClass(), "allowingSelfLoops", false);
        setIntField(term45351, term45351.getClass(), "avgDegree", 0);
        setBooleanField(term45351, term45351.getClass(), "safeMode", false);
        term45362 = new Integer(0);
        term45364 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45362;
        args[1] = term45364;
        callMethod(klass, "adjListPos", argTypes, term45351, args);
    }

};


