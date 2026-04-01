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

public class GraphImpl_checkEdge_2083334240146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45067;
     Object term45078;
     Object term45080;

    public GraphImpl_checkEdge_2083334240146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45067 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45067, term45067.getClass(), "name", null);
        setIntField(term45067, term45067.getClass(), "maxVertices", 0);
        setIntField(term45067, term45067.getClass(), "numVertices", 0);
        setLongField(term45067, term45067.getClass(), "numEdges", 0L);
        setField(term45067, term45067.getClass(), "vertices", null);
        setField(term45067, term45067.getClass(), "degree", null);
        setField(term45067, term45067.getClass(), "adjList", null);
        setField(term45067, term45067.getClass(), "adjPos", null);
        setField(term45067, term45067.getClass(), "vertexWeight", null);
        setIntField(term45067, term45067.getClass(), "vertexDataSize", 0);
        setField(term45067, term45067.getClass(), "edgeData", null);
        setIntField(term45067, term45067.getClass(), "edgeDataSize", 0);
        setField(term45067, term45067.getClass(), "vertexLabel", null);
        setField(term45067, term45067.getClass(), "edgeLabel", null);
        setField(term45067, term45067.getClass(), "vertexIndex", null);
        setField(term45067, term45067.getClass(), "adjSet", null);
        setField(term45067, term45067.getClass(), "adjMap", null);
        setField(term45067, term45067.getClass(), "maxVertexNumber", null);
        setField(term45067, term45067.getClass(), "labelVertexMap", null);
        setField(term45067, term45067.getClass(), "labelEdgeMap", null);
        setBooleanField(term45067, term45067.getClass(), "directed", false);
        setBooleanField(term45067, term45067.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45067, term45067.getClass(), "allowingSelfLoops", false);
        setIntField(term45067, term45067.getClass(), "avgDegree", 0);
        setBooleanField(term45067, term45067.getClass(), "safeMode", false);
        term45078 = new Integer(0);
        term45080 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45078;
        args[1] = term45080;
        callMethod(klass, "checkEdge", argTypes, term45067, args);
    }

};


