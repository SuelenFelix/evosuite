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

public class GraphImpl_initEdgeWeights_135630775183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45568;

    public GraphImpl_initEdgeWeights_135630775183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45568 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45568, term45568.getClass(), "name", null);
        setIntField(term45568, term45568.getClass(), "maxVertices", 0);
        setIntField(term45568, term45568.getClass(), "numVertices", 0);
        setLongField(term45568, term45568.getClass(), "numEdges", 0L);
        setField(term45568, term45568.getClass(), "vertices", null);
        setField(term45568, term45568.getClass(), "degree", null);
        setField(term45568, term45568.getClass(), "adjList", null);
        setField(term45568, term45568.getClass(), "adjPos", null);
        setField(term45568, term45568.getClass(), "vertexWeight", null);
        setIntField(term45568, term45568.getClass(), "vertexDataSize", 0);
        setField(term45568, term45568.getClass(), "edgeData", null);
        setIntField(term45568, term45568.getClass(), "edgeDataSize", 0);
        setField(term45568, term45568.getClass(), "vertexLabel", null);
        setField(term45568, term45568.getClass(), "edgeLabel", null);
        setField(term45568, term45568.getClass(), "vertexIndex", null);
        setField(term45568, term45568.getClass(), "adjSet", null);
        setField(term45568, term45568.getClass(), "adjMap", null);
        setField(term45568, term45568.getClass(), "maxVertexNumber", null);
        setField(term45568, term45568.getClass(), "labelVertexMap", null);
        setField(term45568, term45568.getClass(), "labelEdgeMap", null);
        setBooleanField(term45568, term45568.getClass(), "directed", false);
        setBooleanField(term45568, term45568.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45568, term45568.getClass(), "allowingSelfLoops", false);
        setIntField(term45568, term45568.getClass(), "avgDegree", 0);
        setBooleanField(term45568, term45568.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initEdgeWeights", argTypes, term45568, args);
    }

};


