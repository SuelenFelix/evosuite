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

public class GraphImpl_toString_1418757976239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46300;

    public GraphImpl_toString_1418757976239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46300 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46300, term46300.getClass(), "name", null);
        setIntField(term46300, term46300.getClass(), "maxVertices", 0);
        setIntField(term46300, term46300.getClass(), "numVertices", 0);
        setLongField(term46300, term46300.getClass(), "numEdges", 0L);
        setField(term46300, term46300.getClass(), "vertices", null);
        setField(term46300, term46300.getClass(), "degree", null);
        setField(term46300, term46300.getClass(), "adjList", null);
        setField(term46300, term46300.getClass(), "adjPos", null);
        setField(term46300, term46300.getClass(), "vertexWeight", null);
        setIntField(term46300, term46300.getClass(), "vertexDataSize", 0);
        setField(term46300, term46300.getClass(), "edgeData", null);
        setIntField(term46300, term46300.getClass(), "edgeDataSize", 0);
        setField(term46300, term46300.getClass(), "vertexLabel", null);
        setField(term46300, term46300.getClass(), "edgeLabel", null);
        setField(term46300, term46300.getClass(), "vertexIndex", null);
        setField(term46300, term46300.getClass(), "adjSet", null);
        setField(term46300, term46300.getClass(), "adjMap", null);
        setField(term46300, term46300.getClass(), "maxVertexNumber", null);
        setField(term46300, term46300.getClass(), "labelVertexMap", null);
        setField(term46300, term46300.getClass(), "labelEdgeMap", null);
        setBooleanField(term46300, term46300.getClass(), "directed", false);
        setBooleanField(term46300, term46300.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46300, term46300.getClass(), "allowingSelfLoops", false);
        setIntField(term46300, term46300.getClass(), "avgDegree", 0);
        setBooleanField(term46300, term46300.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term46300, args);
    }

};


