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

public class GraphImpl_verticesToString_813426737236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46267;

    public GraphImpl_verticesToString_813426737236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46267 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46267, term46267.getClass(), "name", null);
        setIntField(term46267, term46267.getClass(), "maxVertices", 0);
        setIntField(term46267, term46267.getClass(), "numVertices", 0);
        setLongField(term46267, term46267.getClass(), "numEdges", 0L);
        setField(term46267, term46267.getClass(), "vertices", null);
        setField(term46267, term46267.getClass(), "degree", null);
        setField(term46267, term46267.getClass(), "adjList", null);
        setField(term46267, term46267.getClass(), "adjPos", null);
        setField(term46267, term46267.getClass(), "vertexWeight", null);
        setIntField(term46267, term46267.getClass(), "vertexDataSize", 0);
        setField(term46267, term46267.getClass(), "edgeData", null);
        setIntField(term46267, term46267.getClass(), "edgeDataSize", 0);
        setField(term46267, term46267.getClass(), "vertexLabel", null);
        setField(term46267, term46267.getClass(), "edgeLabel", null);
        setField(term46267, term46267.getClass(), "vertexIndex", null);
        setField(term46267, term46267.getClass(), "adjSet", null);
        setField(term46267, term46267.getClass(), "adjMap", null);
        setField(term46267, term46267.getClass(), "maxVertexNumber", null);
        setField(term46267, term46267.getClass(), "labelVertexMap", null);
        setField(term46267, term46267.getClass(), "labelEdgeMap", null);
        setBooleanField(term46267, term46267.getClass(), "directed", false);
        setBooleanField(term46267, term46267.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46267, term46267.getClass(), "allowingSelfLoops", false);
        setIntField(term46267, term46267.getClass(), "avgDegree", 0);
        setBooleanField(term46267, term46267.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "verticesToString", argTypes, term46267, args);
    }

};


