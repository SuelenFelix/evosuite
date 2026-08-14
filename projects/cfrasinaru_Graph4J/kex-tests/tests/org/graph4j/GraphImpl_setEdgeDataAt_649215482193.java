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
import java.lang.Double;

public class GraphImpl_setEdgeDataAt_649215482193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45704;
     Object term45715;
     Object term45717;
     Object term45719;
     Object term45721;

    public GraphImpl_setEdgeDataAt_649215482193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45704 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45704, term45704.getClass(), "name", null);
        setIntField(term45704, term45704.getClass(), "maxVertices", 0);
        setIntField(term45704, term45704.getClass(), "numVertices", 0);
        setLongField(term45704, term45704.getClass(), "numEdges", 0L);
        setField(term45704, term45704.getClass(), "vertices", null);
        setField(term45704, term45704.getClass(), "degree", null);
        setField(term45704, term45704.getClass(), "adjList", null);
        setField(term45704, term45704.getClass(), "adjPos", null);
        setField(term45704, term45704.getClass(), "vertexWeight", null);
        setIntField(term45704, term45704.getClass(), "vertexDataSize", 0);
        setField(term45704, term45704.getClass(), "edgeData", null);
        setIntField(term45704, term45704.getClass(), "edgeDataSize", 0);
        setField(term45704, term45704.getClass(), "vertexLabel", null);
        setField(term45704, term45704.getClass(), "edgeLabel", null);
        setField(term45704, term45704.getClass(), "vertexIndex", null);
        setField(term45704, term45704.getClass(), "adjSet", null);
        setField(term45704, term45704.getClass(), "adjMap", null);
        setField(term45704, term45704.getClass(), "maxVertexNumber", null);
        setField(term45704, term45704.getClass(), "labelVertexMap", null);
        setField(term45704, term45704.getClass(), "labelEdgeMap", null);
        setBooleanField(term45704, term45704.getClass(), "directed", false);
        setBooleanField(term45704, term45704.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45704, term45704.getClass(), "allowingSelfLoops", false);
        setIntField(term45704, term45704.getClass(), "avgDegree", 0);
        setBooleanField(term45704, term45704.getClass(), "safeMode", false);
        term45715 = new Integer(0);
        term45717 = new Integer(0);
        term45719 = new Integer(0);
        term45721 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term45715;
        args[1] = term45717;
        args[2] = term45719;
        args[3] = term45721;
        callMethod(klass, "setEdgeDataAt", argTypes, term45704, args);
    }

};


