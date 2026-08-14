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

public class GraphImpl_growAdjList_1868634161222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46103;
     Object term46114;

    public GraphImpl_growAdjList_1868634161222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46103 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46103, term46103.getClass(), "name", null);
        setIntField(term46103, term46103.getClass(), "maxVertices", 0);
        setIntField(term46103, term46103.getClass(), "numVertices", 0);
        setLongField(term46103, term46103.getClass(), "numEdges", 0L);
        setField(term46103, term46103.getClass(), "vertices", null);
        setField(term46103, term46103.getClass(), "degree", null);
        setField(term46103, term46103.getClass(), "adjList", null);
        setField(term46103, term46103.getClass(), "adjPos", null);
        setField(term46103, term46103.getClass(), "vertexWeight", null);
        setIntField(term46103, term46103.getClass(), "vertexDataSize", 0);
        setField(term46103, term46103.getClass(), "edgeData", null);
        setIntField(term46103, term46103.getClass(), "edgeDataSize", 0);
        setField(term46103, term46103.getClass(), "vertexLabel", null);
        setField(term46103, term46103.getClass(), "edgeLabel", null);
        setField(term46103, term46103.getClass(), "vertexIndex", null);
        setField(term46103, term46103.getClass(), "adjSet", null);
        setField(term46103, term46103.getClass(), "adjMap", null);
        setField(term46103, term46103.getClass(), "maxVertexNumber", null);
        setField(term46103, term46103.getClass(), "labelVertexMap", null);
        setField(term46103, term46103.getClass(), "labelEdgeMap", null);
        setBooleanField(term46103, term46103.getClass(), "directed", false);
        setBooleanField(term46103, term46103.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46103, term46103.getClass(), "allowingSelfLoops", false);
        setIntField(term46103, term46103.getClass(), "avgDegree", 0);
        setBooleanField(term46103, term46103.getClass(), "safeMode", false);
        term46114 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46114;
        callMethod(klass, "growAdjList", argTypes, term46103, args);
    }

};


