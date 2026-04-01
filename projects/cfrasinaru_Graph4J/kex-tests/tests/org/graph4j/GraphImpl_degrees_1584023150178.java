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

public class GraphImpl_degrees_1584023150178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45507;

    public GraphImpl_degrees_1584023150178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45507 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45507, term45507.getClass(), "name", null);
        setIntField(term45507, term45507.getClass(), "maxVertices", 0);
        setIntField(term45507, term45507.getClass(), "numVertices", 0);
        setLongField(term45507, term45507.getClass(), "numEdges", 0L);
        setField(term45507, term45507.getClass(), "vertices", null);
        setField(term45507, term45507.getClass(), "degree", null);
        setField(term45507, term45507.getClass(), "adjList", null);
        setField(term45507, term45507.getClass(), "adjPos", null);
        setField(term45507, term45507.getClass(), "vertexWeight", null);
        setIntField(term45507, term45507.getClass(), "vertexDataSize", 0);
        setField(term45507, term45507.getClass(), "edgeData", null);
        setIntField(term45507, term45507.getClass(), "edgeDataSize", 0);
        setField(term45507, term45507.getClass(), "vertexLabel", null);
        setField(term45507, term45507.getClass(), "edgeLabel", null);
        setField(term45507, term45507.getClass(), "vertexIndex", null);
        setField(term45507, term45507.getClass(), "adjSet", null);
        setField(term45507, term45507.getClass(), "adjMap", null);
        setField(term45507, term45507.getClass(), "maxVertexNumber", null);
        setField(term45507, term45507.getClass(), "labelVertexMap", null);
        setField(term45507, term45507.getClass(), "labelEdgeMap", null);
        setBooleanField(term45507, term45507.getClass(), "directed", false);
        setBooleanField(term45507, term45507.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45507, term45507.getClass(), "allowingSelfLoops", false);
        setIntField(term45507, term45507.getClass(), "avgDegree", 0);
        setBooleanField(term45507, term45507.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "degrees", argTypes, term45507, args);
    }

};


