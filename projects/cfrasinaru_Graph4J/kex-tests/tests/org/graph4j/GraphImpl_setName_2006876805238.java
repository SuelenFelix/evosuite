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

public class GraphImpl_setName_2006876805238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46289;

    public GraphImpl_setName_2006876805238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46289 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46289, term46289.getClass(), "name", null);
        setIntField(term46289, term46289.getClass(), "maxVertices", 0);
        setIntField(term46289, term46289.getClass(), "numVertices", 0);
        setLongField(term46289, term46289.getClass(), "numEdges", 0L);
        setField(term46289, term46289.getClass(), "vertices", null);
        setField(term46289, term46289.getClass(), "degree", null);
        setField(term46289, term46289.getClass(), "adjList", null);
        setField(term46289, term46289.getClass(), "adjPos", null);
        setField(term46289, term46289.getClass(), "vertexWeight", null);
        setIntField(term46289, term46289.getClass(), "vertexDataSize", 0);
        setField(term46289, term46289.getClass(), "edgeData", null);
        setIntField(term46289, term46289.getClass(), "edgeDataSize", 0);
        setField(term46289, term46289.getClass(), "vertexLabel", null);
        setField(term46289, term46289.getClass(), "edgeLabel", null);
        setField(term46289, term46289.getClass(), "vertexIndex", null);
        setField(term46289, term46289.getClass(), "adjSet", null);
        setField(term46289, term46289.getClass(), "adjMap", null);
        setField(term46289, term46289.getClass(), "maxVertexNumber", null);
        setField(term46289, term46289.getClass(), "labelVertexMap", null);
        setField(term46289, term46289.getClass(), "labelEdgeMap", null);
        setBooleanField(term46289, term46289.getClass(), "directed", false);
        setBooleanField(term46289, term46289.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46289, term46289.getClass(), "allowingSelfLoops", false);
        setIntField(term46289, term46289.getClass(), "avgDegree", 0);
        setBooleanField(term46289, term46289.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term46289, args);
    }

};


