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

public class GraphImpl_setEdgeDataSize_26251097133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44914;
     Object term44925;

    public GraphImpl_setEdgeDataSize_26251097133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44914 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44914, term44914.getClass(), "name", null);
        setIntField(term44914, term44914.getClass(), "maxVertices", 0);
        setIntField(term44914, term44914.getClass(), "numVertices", 0);
        setLongField(term44914, term44914.getClass(), "numEdges", 0L);
        setField(term44914, term44914.getClass(), "vertices", null);
        setField(term44914, term44914.getClass(), "degree", null);
        setField(term44914, term44914.getClass(), "adjList", null);
        setField(term44914, term44914.getClass(), "adjPos", null);
        setField(term44914, term44914.getClass(), "vertexWeight", null);
        setIntField(term44914, term44914.getClass(), "vertexDataSize", 0);
        setField(term44914, term44914.getClass(), "edgeData", null);
        setIntField(term44914, term44914.getClass(), "edgeDataSize", 0);
        setField(term44914, term44914.getClass(), "vertexLabel", null);
        setField(term44914, term44914.getClass(), "edgeLabel", null);
        setField(term44914, term44914.getClass(), "vertexIndex", null);
        setField(term44914, term44914.getClass(), "adjSet", null);
        setField(term44914, term44914.getClass(), "adjMap", null);
        setField(term44914, term44914.getClass(), "maxVertexNumber", null);
        setField(term44914, term44914.getClass(), "labelVertexMap", null);
        setField(term44914, term44914.getClass(), "labelEdgeMap", null);
        setBooleanField(term44914, term44914.getClass(), "directed", false);
        setBooleanField(term44914, term44914.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44914, term44914.getClass(), "allowingSelfLoops", false);
        setIntField(term44914, term44914.getClass(), "avgDegree", 0);
        setBooleanField(term44914, term44914.getClass(), "safeMode", false);
        term44925 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44925;
        callMethod(klass, "setEdgeDataSize", argTypes, term44914, args);
    }

};


