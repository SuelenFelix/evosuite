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

public class GraphImpl_neighbors_1997748214173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45440;
     Object term45451;

    public GraphImpl_neighbors_1997748214173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45440 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45440, term45440.getClass(), "name", null);
        setIntField(term45440, term45440.getClass(), "maxVertices", 0);
        setIntField(term45440, term45440.getClass(), "numVertices", 0);
        setLongField(term45440, term45440.getClass(), "numEdges", 0L);
        setField(term45440, term45440.getClass(), "vertices", null);
        setField(term45440, term45440.getClass(), "degree", null);
        setField(term45440, term45440.getClass(), "adjList", null);
        setField(term45440, term45440.getClass(), "adjPos", null);
        setField(term45440, term45440.getClass(), "vertexWeight", null);
        setIntField(term45440, term45440.getClass(), "vertexDataSize", 0);
        setField(term45440, term45440.getClass(), "edgeData", null);
        setIntField(term45440, term45440.getClass(), "edgeDataSize", 0);
        setField(term45440, term45440.getClass(), "vertexLabel", null);
        setField(term45440, term45440.getClass(), "edgeLabel", null);
        setField(term45440, term45440.getClass(), "vertexIndex", null);
        setField(term45440, term45440.getClass(), "adjSet", null);
        setField(term45440, term45440.getClass(), "adjMap", null);
        setField(term45440, term45440.getClass(), "maxVertexNumber", null);
        setField(term45440, term45440.getClass(), "labelVertexMap", null);
        setField(term45440, term45440.getClass(), "labelEdgeMap", null);
        setBooleanField(term45440, term45440.getClass(), "directed", false);
        setBooleanField(term45440, term45440.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45440, term45440.getClass(), "allowingSelfLoops", false);
        setIntField(term45440, term45440.getClass(), "avgDegree", 0);
        setBooleanField(term45440, term45440.getClass(), "safeMode", false);
        term45451 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45451;
        callMethod(klass, "neighbors", argTypes, term45440, args);
    }

};


