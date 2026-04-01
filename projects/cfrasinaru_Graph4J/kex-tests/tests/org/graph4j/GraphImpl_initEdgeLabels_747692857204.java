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

public class GraphImpl_initEdgeLabels_747692857204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45885;

    public GraphImpl_initEdgeLabels_747692857204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45885 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45885, term45885.getClass(), "name", null);
        setIntField(term45885, term45885.getClass(), "maxVertices", 0);
        setIntField(term45885, term45885.getClass(), "numVertices", 0);
        setLongField(term45885, term45885.getClass(), "numEdges", 0L);
        setField(term45885, term45885.getClass(), "vertices", null);
        setField(term45885, term45885.getClass(), "degree", null);
        setField(term45885, term45885.getClass(), "adjList", null);
        setField(term45885, term45885.getClass(), "adjPos", null);
        setField(term45885, term45885.getClass(), "vertexWeight", null);
        setIntField(term45885, term45885.getClass(), "vertexDataSize", 0);
        setField(term45885, term45885.getClass(), "edgeData", null);
        setIntField(term45885, term45885.getClass(), "edgeDataSize", 0);
        setField(term45885, term45885.getClass(), "vertexLabel", null);
        setField(term45885, term45885.getClass(), "edgeLabel", null);
        setField(term45885, term45885.getClass(), "vertexIndex", null);
        setField(term45885, term45885.getClass(), "adjSet", null);
        setField(term45885, term45885.getClass(), "adjMap", null);
        setField(term45885, term45885.getClass(), "maxVertexNumber", null);
        setField(term45885, term45885.getClass(), "labelVertexMap", null);
        setField(term45885, term45885.getClass(), "labelEdgeMap", null);
        setBooleanField(term45885, term45885.getClass(), "directed", false);
        setBooleanField(term45885, term45885.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45885, term45885.getClass(), "allowingSelfLoops", false);
        setIntField(term45885, term45885.getClass(), "avgDegree", 0);
        setBooleanField(term45885, term45885.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initEdgeLabels", argTypes, term45885, args);
    }

};


