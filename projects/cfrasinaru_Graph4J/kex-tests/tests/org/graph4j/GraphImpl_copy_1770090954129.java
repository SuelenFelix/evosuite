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
import java.lang.Boolean;

public class GraphImpl_copy_1770090954129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44850;
     Object term44861;
     Object term44863;
     Object term44865;
     Object term44867;
     Object term44869;

    public GraphImpl_copy_1770090954129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44850 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44850, term44850.getClass(), "name", null);
        setIntField(term44850, term44850.getClass(), "maxVertices", 0);
        setIntField(term44850, term44850.getClass(), "numVertices", 0);
        setLongField(term44850, term44850.getClass(), "numEdges", 0L);
        setField(term44850, term44850.getClass(), "vertices", null);
        setField(term44850, term44850.getClass(), "degree", null);
        setField(term44850, term44850.getClass(), "adjList", null);
        setField(term44850, term44850.getClass(), "adjPos", null);
        setField(term44850, term44850.getClass(), "vertexWeight", null);
        setIntField(term44850, term44850.getClass(), "vertexDataSize", 0);
        setField(term44850, term44850.getClass(), "edgeData", null);
        setIntField(term44850, term44850.getClass(), "edgeDataSize", 0);
        setField(term44850, term44850.getClass(), "vertexLabel", null);
        setField(term44850, term44850.getClass(), "edgeLabel", null);
        setField(term44850, term44850.getClass(), "vertexIndex", null);
        setField(term44850, term44850.getClass(), "adjSet", null);
        setField(term44850, term44850.getClass(), "adjMap", null);
        setField(term44850, term44850.getClass(), "maxVertexNumber", null);
        setField(term44850, term44850.getClass(), "labelVertexMap", null);
        setField(term44850, term44850.getClass(), "labelEdgeMap", null);
        setBooleanField(term44850, term44850.getClass(), "directed", false);
        setBooleanField(term44850, term44850.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44850, term44850.getClass(), "allowingSelfLoops", false);
        setIntField(term44850, term44850.getClass(), "avgDegree", 0);
        setBooleanField(term44850, term44850.getClass(), "safeMode", false);
        term44861 = new Boolean(false);
        term44863 = new Boolean(false);
        term44865 = new Boolean(false);
        term44867 = new Boolean(false);
        term44869 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term44861;
        args[1] = term44863;
        args[2] = term44865;
        args[3] = term44867;
        args[4] = term44869;
        callMethod(klass, "copy", argTypes, term44850, args);
    }

};


