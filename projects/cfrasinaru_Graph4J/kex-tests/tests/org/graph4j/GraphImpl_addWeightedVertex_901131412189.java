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
import java.lang.Double;

public class GraphImpl_addWeightedVertex_901131412189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45644;
     Object term45655;

    public GraphImpl_addWeightedVertex_901131412189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45644 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45644, term45644.getClass(), "name", null);
        setIntField(term45644, term45644.getClass(), "maxVertices", 0);
        setIntField(term45644, term45644.getClass(), "numVertices", 0);
        setLongField(term45644, term45644.getClass(), "numEdges", 0L);
        setField(term45644, term45644.getClass(), "vertices", null);
        setField(term45644, term45644.getClass(), "degree", null);
        setField(term45644, term45644.getClass(), "adjList", null);
        setField(term45644, term45644.getClass(), "adjPos", null);
        setField(term45644, term45644.getClass(), "vertexWeight", null);
        setIntField(term45644, term45644.getClass(), "vertexDataSize", 0);
        setField(term45644, term45644.getClass(), "edgeData", null);
        setIntField(term45644, term45644.getClass(), "edgeDataSize", 0);
        setField(term45644, term45644.getClass(), "vertexLabel", null);
        setField(term45644, term45644.getClass(), "edgeLabel", null);
        setField(term45644, term45644.getClass(), "vertexIndex", null);
        setField(term45644, term45644.getClass(), "adjSet", null);
        setField(term45644, term45644.getClass(), "adjMap", null);
        setField(term45644, term45644.getClass(), "maxVertexNumber", null);
        setField(term45644, term45644.getClass(), "labelVertexMap", null);
        setField(term45644, term45644.getClass(), "labelEdgeMap", null);
        setBooleanField(term45644, term45644.getClass(), "directed", false);
        setBooleanField(term45644, term45644.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45644, term45644.getClass(), "allowingSelfLoops", false);
        setIntField(term45644, term45644.getClass(), "avgDegree", 0);
        setBooleanField(term45644, term45644.getClass(), "safeMode", false);
        term45655 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term45655;
        callMethod(klass, "addWeightedVertex", argTypes, term45644, args);
    }

};


