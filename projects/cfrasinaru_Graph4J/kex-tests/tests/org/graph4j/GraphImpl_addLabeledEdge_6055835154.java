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

public class GraphImpl_addLabeledEdge_6055835154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45171;
     Object term45182;
     Object term45184;

    public GraphImpl_addLabeledEdge_6055835154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45171 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45171, term45171.getClass(), "name", null);
        setIntField(term45171, term45171.getClass(), "maxVertices", 0);
        setIntField(term45171, term45171.getClass(), "numVertices", 0);
        setLongField(term45171, term45171.getClass(), "numEdges", 0L);
        setField(term45171, term45171.getClass(), "vertices", null);
        setField(term45171, term45171.getClass(), "degree", null);
        setField(term45171, term45171.getClass(), "adjList", null);
        setField(term45171, term45171.getClass(), "adjPos", null);
        setField(term45171, term45171.getClass(), "vertexWeight", null);
        setIntField(term45171, term45171.getClass(), "vertexDataSize", 0);
        setField(term45171, term45171.getClass(), "edgeData", null);
        setIntField(term45171, term45171.getClass(), "edgeDataSize", 0);
        setField(term45171, term45171.getClass(), "vertexLabel", null);
        setField(term45171, term45171.getClass(), "edgeLabel", null);
        setField(term45171, term45171.getClass(), "vertexIndex", null);
        setField(term45171, term45171.getClass(), "adjSet", null);
        setField(term45171, term45171.getClass(), "adjMap", null);
        setField(term45171, term45171.getClass(), "maxVertexNumber", null);
        setField(term45171, term45171.getClass(), "labelVertexMap", null);
        setField(term45171, term45171.getClass(), "labelEdgeMap", null);
        setBooleanField(term45171, term45171.getClass(), "directed", false);
        setBooleanField(term45171, term45171.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45171, term45171.getClass(), "allowingSelfLoops", false);
        setIntField(term45171, term45171.getClass(), "avgDegree", 0);
        setBooleanField(term45171, term45171.getClass(), "safeMode", false);
        term45182 = new Integer(0);
        term45184 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term45182;
        args[1] = term45184;
        args[2] = null;
        callMethod(klass, "addLabeledEdge", argTypes, term45171, args);
    }

};


