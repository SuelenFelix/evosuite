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

public class GraphImpl_splitEdge_976570498231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46208;
     Object term46219;
     Object term46221;

    public GraphImpl_splitEdge_976570498231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46208 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46208, term46208.getClass(), "name", null);
        setIntField(term46208, term46208.getClass(), "maxVertices", 0);
        setIntField(term46208, term46208.getClass(), "numVertices", 0);
        setLongField(term46208, term46208.getClass(), "numEdges", 0L);
        setField(term46208, term46208.getClass(), "vertices", null);
        setField(term46208, term46208.getClass(), "degree", null);
        setField(term46208, term46208.getClass(), "adjList", null);
        setField(term46208, term46208.getClass(), "adjPos", null);
        setField(term46208, term46208.getClass(), "vertexWeight", null);
        setIntField(term46208, term46208.getClass(), "vertexDataSize", 0);
        setField(term46208, term46208.getClass(), "edgeData", null);
        setIntField(term46208, term46208.getClass(), "edgeDataSize", 0);
        setField(term46208, term46208.getClass(), "vertexLabel", null);
        setField(term46208, term46208.getClass(), "edgeLabel", null);
        setField(term46208, term46208.getClass(), "vertexIndex", null);
        setField(term46208, term46208.getClass(), "adjSet", null);
        setField(term46208, term46208.getClass(), "adjMap", null);
        setField(term46208, term46208.getClass(), "maxVertexNumber", null);
        setField(term46208, term46208.getClass(), "labelVertexMap", null);
        setField(term46208, term46208.getClass(), "labelEdgeMap", null);
        setBooleanField(term46208, term46208.getClass(), "directed", false);
        setBooleanField(term46208, term46208.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46208, term46208.getClass(), "allowingSelfLoops", false);
        setIntField(term46208, term46208.getClass(), "avgDegree", 0);
        setBooleanField(term46208, term46208.getClass(), "safeMode", false);
        term46219 = new Integer(0);
        term46221 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term46219;
        args[1] = term46221;
        callMethod(klass, "splitEdge", argTypes, term46208, args);
    }

};


