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

public class GraphImpl_setSafeMode_984927983220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46079;
     Object term46090;

    public GraphImpl_setSafeMode_984927983220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46079 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46079, term46079.getClass(), "name", null);
        setIntField(term46079, term46079.getClass(), "maxVertices", 0);
        setIntField(term46079, term46079.getClass(), "numVertices", 0);
        setLongField(term46079, term46079.getClass(), "numEdges", 0L);
        setField(term46079, term46079.getClass(), "vertices", null);
        setField(term46079, term46079.getClass(), "degree", null);
        setField(term46079, term46079.getClass(), "adjList", null);
        setField(term46079, term46079.getClass(), "adjPos", null);
        setField(term46079, term46079.getClass(), "vertexWeight", null);
        setIntField(term46079, term46079.getClass(), "vertexDataSize", 0);
        setField(term46079, term46079.getClass(), "edgeData", null);
        setIntField(term46079, term46079.getClass(), "edgeDataSize", 0);
        setField(term46079, term46079.getClass(), "vertexLabel", null);
        setField(term46079, term46079.getClass(), "edgeLabel", null);
        setField(term46079, term46079.getClass(), "vertexIndex", null);
        setField(term46079, term46079.getClass(), "adjSet", null);
        setField(term46079, term46079.getClass(), "adjMap", null);
        setField(term46079, term46079.getClass(), "maxVertexNumber", null);
        setField(term46079, term46079.getClass(), "labelVertexMap", null);
        setField(term46079, term46079.getClass(), "labelEdgeMap", null);
        setBooleanField(term46079, term46079.getClass(), "directed", false);
        setBooleanField(term46079, term46079.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46079, term46079.getClass(), "allowingSelfLoops", false);
        setIntField(term46079, term46079.getClass(), "avgDegree", 0);
        setBooleanField(term46079, term46079.getClass(), "safeMode", false);
        term46090 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term46090;
        callMethod(klass, "setSafeMode", argTypes, term46079, args);
    }

};


