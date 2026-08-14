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

public class GraphImpl_getEdgeLabel_360327269212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45987;
     Object term45998;
     Object term46000;

    public GraphImpl_getEdgeLabel_360327269212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45987 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45987, term45987.getClass(), "name", null);
        setIntField(term45987, term45987.getClass(), "maxVertices", 0);
        setIntField(term45987, term45987.getClass(), "numVertices", 0);
        setLongField(term45987, term45987.getClass(), "numEdges", 0L);
        setField(term45987, term45987.getClass(), "vertices", null);
        setField(term45987, term45987.getClass(), "degree", null);
        setField(term45987, term45987.getClass(), "adjList", null);
        setField(term45987, term45987.getClass(), "adjPos", null);
        setField(term45987, term45987.getClass(), "vertexWeight", null);
        setIntField(term45987, term45987.getClass(), "vertexDataSize", 0);
        setField(term45987, term45987.getClass(), "edgeData", null);
        setIntField(term45987, term45987.getClass(), "edgeDataSize", 0);
        setField(term45987, term45987.getClass(), "vertexLabel", null);
        setField(term45987, term45987.getClass(), "edgeLabel", null);
        setField(term45987, term45987.getClass(), "vertexIndex", null);
        setField(term45987, term45987.getClass(), "adjSet", null);
        setField(term45987, term45987.getClass(), "adjMap", null);
        setField(term45987, term45987.getClass(), "maxVertexNumber", null);
        setField(term45987, term45987.getClass(), "labelVertexMap", null);
        setField(term45987, term45987.getClass(), "labelEdgeMap", null);
        setBooleanField(term45987, term45987.getClass(), "directed", false);
        setBooleanField(term45987, term45987.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45987, term45987.getClass(), "allowingSelfLoops", false);
        setIntField(term45987, term45987.getClass(), "avgDegree", 0);
        setBooleanField(term45987, term45987.getClass(), "safeMode", false);
        term45998 = new Integer(0);
        term46000 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45998;
        args[1] = term46000;
        callMethod(klass, "getEdgeLabel", argTypes, term45987, args);
    }

};


