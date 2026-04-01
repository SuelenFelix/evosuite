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

public class GraphImpl_isAllowingMultipleEdges_1724738614217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46046;

    public GraphImpl_isAllowingMultipleEdges_1724738614217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46046 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46046, term46046.getClass(), "name", null);
        setIntField(term46046, term46046.getClass(), "maxVertices", 0);
        setIntField(term46046, term46046.getClass(), "numVertices", 0);
        setLongField(term46046, term46046.getClass(), "numEdges", 0L);
        setField(term46046, term46046.getClass(), "vertices", null);
        setField(term46046, term46046.getClass(), "degree", null);
        setField(term46046, term46046.getClass(), "adjList", null);
        setField(term46046, term46046.getClass(), "adjPos", null);
        setField(term46046, term46046.getClass(), "vertexWeight", null);
        setIntField(term46046, term46046.getClass(), "vertexDataSize", 0);
        setField(term46046, term46046.getClass(), "edgeData", null);
        setIntField(term46046, term46046.getClass(), "edgeDataSize", 0);
        setField(term46046, term46046.getClass(), "vertexLabel", null);
        setField(term46046, term46046.getClass(), "edgeLabel", null);
        setField(term46046, term46046.getClass(), "vertexIndex", null);
        setField(term46046, term46046.getClass(), "adjSet", null);
        setField(term46046, term46046.getClass(), "adjMap", null);
        setField(term46046, term46046.getClass(), "maxVertexNumber", null);
        setField(term46046, term46046.getClass(), "labelVertexMap", null);
        setField(term46046, term46046.getClass(), "labelEdgeMap", null);
        setBooleanField(term46046, term46046.getClass(), "directed", false);
        setBooleanField(term46046, term46046.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46046, term46046.getClass(), "allowingSelfLoops", false);
        setIntField(term46046, term46046.getClass(), "avgDegree", 0);
        setBooleanField(term46046, term46046.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllowingMultipleEdges", argTypes, term46046, args);
    }

};


