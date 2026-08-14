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

public class GraphImpl_neighborIterator_917074749242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46333;
     Object term46344;
     Object term46346;

    public GraphImpl_neighborIterator_917074749242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46333 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46333, term46333.getClass(), "name", null);
        setIntField(term46333, term46333.getClass(), "maxVertices", 0);
        setIntField(term46333, term46333.getClass(), "numVertices", 0);
        setLongField(term46333, term46333.getClass(), "numEdges", 0L);
        setField(term46333, term46333.getClass(), "vertices", null);
        setField(term46333, term46333.getClass(), "degree", null);
        setField(term46333, term46333.getClass(), "adjList", null);
        setField(term46333, term46333.getClass(), "adjPos", null);
        setField(term46333, term46333.getClass(), "vertexWeight", null);
        setIntField(term46333, term46333.getClass(), "vertexDataSize", 0);
        setField(term46333, term46333.getClass(), "edgeData", null);
        setIntField(term46333, term46333.getClass(), "edgeDataSize", 0);
        setField(term46333, term46333.getClass(), "vertexLabel", null);
        setField(term46333, term46333.getClass(), "edgeLabel", null);
        setField(term46333, term46333.getClass(), "vertexIndex", null);
        setField(term46333, term46333.getClass(), "adjSet", null);
        setField(term46333, term46333.getClass(), "adjMap", null);
        setField(term46333, term46333.getClass(), "maxVertexNumber", null);
        setField(term46333, term46333.getClass(), "labelVertexMap", null);
        setField(term46333, term46333.getClass(), "labelEdgeMap", null);
        setBooleanField(term46333, term46333.getClass(), "directed", false);
        setBooleanField(term46333, term46333.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46333, term46333.getClass(), "allowingSelfLoops", false);
        setIntField(term46333, term46333.getClass(), "avgDegree", 0);
        setBooleanField(term46333, term46333.getClass(), "safeMode", false);
        term46344 = new Integer(0);
        term46346 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term46344;
        args[1] = term46346;
        callMethod(klass, "neighborIterator", argTypes, term46333, args);
    }

};


