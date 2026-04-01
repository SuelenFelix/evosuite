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

public class GraphImpl_growVertices_1926933337221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46092;

    public GraphImpl_growVertices_1926933337221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46092 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46092, term46092.getClass(), "name", null);
        setIntField(term46092, term46092.getClass(), "maxVertices", 0);
        setIntField(term46092, term46092.getClass(), "numVertices", 0);
        setLongField(term46092, term46092.getClass(), "numEdges", 0L);
        setField(term46092, term46092.getClass(), "vertices", null);
        setField(term46092, term46092.getClass(), "degree", null);
        setField(term46092, term46092.getClass(), "adjList", null);
        setField(term46092, term46092.getClass(), "adjPos", null);
        setField(term46092, term46092.getClass(), "vertexWeight", null);
        setIntField(term46092, term46092.getClass(), "vertexDataSize", 0);
        setField(term46092, term46092.getClass(), "edgeData", null);
        setIntField(term46092, term46092.getClass(), "edgeDataSize", 0);
        setField(term46092, term46092.getClass(), "vertexLabel", null);
        setField(term46092, term46092.getClass(), "edgeLabel", null);
        setField(term46092, term46092.getClass(), "vertexIndex", null);
        setField(term46092, term46092.getClass(), "adjSet", null);
        setField(term46092, term46092.getClass(), "adjMap", null);
        setField(term46092, term46092.getClass(), "maxVertexNumber", null);
        setField(term46092, term46092.getClass(), "labelVertexMap", null);
        setField(term46092, term46092.getClass(), "labelEdgeMap", null);
        setBooleanField(term46092, term46092.getClass(), "directed", false);
        setBooleanField(term46092, term46092.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46092, term46092.getClass(), "allowingSelfLoops", false);
        setIntField(term46092, term46092.getClass(), "avgDegree", 0);
        setBooleanField(term46092, term46092.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "growVertices", argTypes, term46092, args);
    }

};


