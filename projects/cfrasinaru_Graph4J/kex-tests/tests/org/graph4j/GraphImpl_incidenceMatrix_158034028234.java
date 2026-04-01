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

public class GraphImpl_incidenceMatrix_158034028234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46245;

    public GraphImpl_incidenceMatrix_158034028234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46245 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46245, term46245.getClass(), "name", null);
        setIntField(term46245, term46245.getClass(), "maxVertices", 0);
        setIntField(term46245, term46245.getClass(), "numVertices", 0);
        setLongField(term46245, term46245.getClass(), "numEdges", 0L);
        setField(term46245, term46245.getClass(), "vertices", null);
        setField(term46245, term46245.getClass(), "degree", null);
        setField(term46245, term46245.getClass(), "adjList", null);
        setField(term46245, term46245.getClass(), "adjPos", null);
        setField(term46245, term46245.getClass(), "vertexWeight", null);
        setIntField(term46245, term46245.getClass(), "vertexDataSize", 0);
        setField(term46245, term46245.getClass(), "edgeData", null);
        setIntField(term46245, term46245.getClass(), "edgeDataSize", 0);
        setField(term46245, term46245.getClass(), "vertexLabel", null);
        setField(term46245, term46245.getClass(), "edgeLabel", null);
        setField(term46245, term46245.getClass(), "vertexIndex", null);
        setField(term46245, term46245.getClass(), "adjSet", null);
        setField(term46245, term46245.getClass(), "adjMap", null);
        setField(term46245, term46245.getClass(), "maxVertexNumber", null);
        setField(term46245, term46245.getClass(), "labelVertexMap", null);
        setField(term46245, term46245.getClass(), "labelEdgeMap", null);
        setBooleanField(term46245, term46245.getClass(), "directed", false);
        setBooleanField(term46245, term46245.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46245, term46245.getClass(), "allowingSelfLoops", false);
        setIntField(term46245, term46245.getClass(), "avgDegree", 0);
        setBooleanField(term46245, term46245.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incidenceMatrix", argTypes, term46245, args);
    }

};


