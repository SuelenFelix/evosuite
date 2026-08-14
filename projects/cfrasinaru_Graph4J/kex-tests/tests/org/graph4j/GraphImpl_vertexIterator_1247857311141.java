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

public class GraphImpl_vertexIterator_1247857311141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45006;

    public GraphImpl_vertexIterator_1247857311141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45006 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45006, term45006.getClass(), "name", null);
        setIntField(term45006, term45006.getClass(), "maxVertices", 0);
        setIntField(term45006, term45006.getClass(), "numVertices", 0);
        setLongField(term45006, term45006.getClass(), "numEdges", 0L);
        setField(term45006, term45006.getClass(), "vertices", null);
        setField(term45006, term45006.getClass(), "degree", null);
        setField(term45006, term45006.getClass(), "adjList", null);
        setField(term45006, term45006.getClass(), "adjPos", null);
        setField(term45006, term45006.getClass(), "vertexWeight", null);
        setIntField(term45006, term45006.getClass(), "vertexDataSize", 0);
        setField(term45006, term45006.getClass(), "edgeData", null);
        setIntField(term45006, term45006.getClass(), "edgeDataSize", 0);
        setField(term45006, term45006.getClass(), "vertexLabel", null);
        setField(term45006, term45006.getClass(), "edgeLabel", null);
        setField(term45006, term45006.getClass(), "vertexIndex", null);
        setField(term45006, term45006.getClass(), "adjSet", null);
        setField(term45006, term45006.getClass(), "adjMap", null);
        setField(term45006, term45006.getClass(), "maxVertexNumber", null);
        setField(term45006, term45006.getClass(), "labelVertexMap", null);
        setField(term45006, term45006.getClass(), "labelEdgeMap", null);
        setBooleanField(term45006, term45006.getClass(), "directed", false);
        setBooleanField(term45006, term45006.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45006, term45006.getClass(), "allowingSelfLoops", false);
        setIntField(term45006, term45006.getClass(), "avgDegree", 0);
        setBooleanField(term45006, term45006.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertexIterator", argTypes, term45006, args);
    }

};


