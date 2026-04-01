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

public class GraphImpl_removeAllEdgesAt_1404396265162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45291;
     Object term45302;

    public GraphImpl_removeAllEdgesAt_1404396265162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45291 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45291, term45291.getClass(), "name", null);
        setIntField(term45291, term45291.getClass(), "maxVertices", 0);
        setIntField(term45291, term45291.getClass(), "numVertices", 0);
        setLongField(term45291, term45291.getClass(), "numEdges", 0L);
        setField(term45291, term45291.getClass(), "vertices", null);
        setField(term45291, term45291.getClass(), "degree", null);
        setField(term45291, term45291.getClass(), "adjList", null);
        setField(term45291, term45291.getClass(), "adjPos", null);
        setField(term45291, term45291.getClass(), "vertexWeight", null);
        setIntField(term45291, term45291.getClass(), "vertexDataSize", 0);
        setField(term45291, term45291.getClass(), "edgeData", null);
        setIntField(term45291, term45291.getClass(), "edgeDataSize", 0);
        setField(term45291, term45291.getClass(), "vertexLabel", null);
        setField(term45291, term45291.getClass(), "edgeLabel", null);
        setField(term45291, term45291.getClass(), "vertexIndex", null);
        setField(term45291, term45291.getClass(), "adjSet", null);
        setField(term45291, term45291.getClass(), "adjMap", null);
        setField(term45291, term45291.getClass(), "maxVertexNumber", null);
        setField(term45291, term45291.getClass(), "labelVertexMap", null);
        setField(term45291, term45291.getClass(), "labelEdgeMap", null);
        setBooleanField(term45291, term45291.getClass(), "directed", false);
        setBooleanField(term45291, term45291.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45291, term45291.getClass(), "allowingSelfLoops", false);
        setIntField(term45291, term45291.getClass(), "avgDegree", 0);
        setBooleanField(term45291, term45291.getClass(), "safeMode", false);
        term45302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45302;
        callMethod(klass, "removeAllEdgesAt", argTypes, term45291, args);
    }

};


