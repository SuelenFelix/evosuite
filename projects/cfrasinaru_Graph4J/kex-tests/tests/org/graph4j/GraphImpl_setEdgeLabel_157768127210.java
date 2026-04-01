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

public class GraphImpl_setEdgeLabel_157768127210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45957;
     Object term45968;
     Object term45970;

    public GraphImpl_setEdgeLabel_157768127210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45957 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45957, term45957.getClass(), "name", null);
        setIntField(term45957, term45957.getClass(), "maxVertices", 0);
        setIntField(term45957, term45957.getClass(), "numVertices", 0);
        setLongField(term45957, term45957.getClass(), "numEdges", 0L);
        setField(term45957, term45957.getClass(), "vertices", null);
        setField(term45957, term45957.getClass(), "degree", null);
        setField(term45957, term45957.getClass(), "adjList", null);
        setField(term45957, term45957.getClass(), "adjPos", null);
        setField(term45957, term45957.getClass(), "vertexWeight", null);
        setIntField(term45957, term45957.getClass(), "vertexDataSize", 0);
        setField(term45957, term45957.getClass(), "edgeData", null);
        setIntField(term45957, term45957.getClass(), "edgeDataSize", 0);
        setField(term45957, term45957.getClass(), "vertexLabel", null);
        setField(term45957, term45957.getClass(), "edgeLabel", null);
        setField(term45957, term45957.getClass(), "vertexIndex", null);
        setField(term45957, term45957.getClass(), "adjSet", null);
        setField(term45957, term45957.getClass(), "adjMap", null);
        setField(term45957, term45957.getClass(), "maxVertexNumber", null);
        setField(term45957, term45957.getClass(), "labelVertexMap", null);
        setField(term45957, term45957.getClass(), "labelEdgeMap", null);
        setBooleanField(term45957, term45957.getClass(), "directed", false);
        setBooleanField(term45957, term45957.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45957, term45957.getClass(), "allowingSelfLoops", false);
        setIntField(term45957, term45957.getClass(), "avgDegree", 0);
        setBooleanField(term45957, term45957.getClass(), "safeMode", false);
        term45968 = new Integer(0);
        term45970 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term45968;
        args[1] = term45970;
        args[2] = null;
        callMethod(klass, "setEdgeLabel", argTypes, term45957, args);
    }

};


