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

public class GraphImpl_getEdgeDataAt_1405415735195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45742;
     Object term45753;
     Object term45755;
     Object term45757;
     Object term45759;

    public GraphImpl_getEdgeDataAt_1405415735195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45742 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45742, term45742.getClass(), "name", null);
        setIntField(term45742, term45742.getClass(), "maxVertices", 0);
        setIntField(term45742, term45742.getClass(), "numVertices", 0);
        setLongField(term45742, term45742.getClass(), "numEdges", 0L);
        setField(term45742, term45742.getClass(), "vertices", null);
        setField(term45742, term45742.getClass(), "degree", null);
        setField(term45742, term45742.getClass(), "adjList", null);
        setField(term45742, term45742.getClass(), "adjPos", null);
        setField(term45742, term45742.getClass(), "vertexWeight", null);
        setIntField(term45742, term45742.getClass(), "vertexDataSize", 0);
        setField(term45742, term45742.getClass(), "edgeData", null);
        setIntField(term45742, term45742.getClass(), "edgeDataSize", 0);
        setField(term45742, term45742.getClass(), "vertexLabel", null);
        setField(term45742, term45742.getClass(), "edgeLabel", null);
        setField(term45742, term45742.getClass(), "vertexIndex", null);
        setField(term45742, term45742.getClass(), "adjSet", null);
        setField(term45742, term45742.getClass(), "adjMap", null);
        setField(term45742, term45742.getClass(), "maxVertexNumber", null);
        setField(term45742, term45742.getClass(), "labelVertexMap", null);
        setField(term45742, term45742.getClass(), "labelEdgeMap", null);
        setBooleanField(term45742, term45742.getClass(), "directed", false);
        setBooleanField(term45742, term45742.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45742, term45742.getClass(), "allowingSelfLoops", false);
        setIntField(term45742, term45742.getClass(), "avgDegree", 0);
        setBooleanField(term45742, term45742.getClass(), "safeMode", false);
        term45753 = new Integer(0);
        term45755 = new Integer(0);
        term45757 = new Integer(0);
        term45759 = new Double(0.0);
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
        args[0] = term45753;
        args[1] = term45755;
        args[2] = term45757;
        args[3] = term45759;
        callMethod(klass, "getEdgeDataAt", argTypes, term45742, args);
    }

};


