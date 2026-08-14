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

public class GraphImpl_supportGraph_619303902227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46162;

    public GraphImpl_supportGraph_619303902227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46162 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46162, term46162.getClass(), "name", null);
        setIntField(term46162, term46162.getClass(), "maxVertices", 0);
        setIntField(term46162, term46162.getClass(), "numVertices", 0);
        setLongField(term46162, term46162.getClass(), "numEdges", 0L);
        setField(term46162, term46162.getClass(), "vertices", null);
        setField(term46162, term46162.getClass(), "degree", null);
        setField(term46162, term46162.getClass(), "adjList", null);
        setField(term46162, term46162.getClass(), "adjPos", null);
        setField(term46162, term46162.getClass(), "vertexWeight", null);
        setIntField(term46162, term46162.getClass(), "vertexDataSize", 0);
        setField(term46162, term46162.getClass(), "edgeData", null);
        setIntField(term46162, term46162.getClass(), "edgeDataSize", 0);
        setField(term46162, term46162.getClass(), "vertexLabel", null);
        setField(term46162, term46162.getClass(), "edgeLabel", null);
        setField(term46162, term46162.getClass(), "vertexIndex", null);
        setField(term46162, term46162.getClass(), "adjSet", null);
        setField(term46162, term46162.getClass(), "adjMap", null);
        setField(term46162, term46162.getClass(), "maxVertexNumber", null);
        setField(term46162, term46162.getClass(), "labelVertexMap", null);
        setField(term46162, term46162.getClass(), "labelEdgeMap", null);
        setBooleanField(term46162, term46162.getClass(), "directed", false);
        setBooleanField(term46162, term46162.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46162, term46162.getClass(), "allowingSelfLoops", false);
        setIntField(term46162, term46162.getClass(), "avgDegree", 0);
        setBooleanField(term46162, term46162.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "supportGraph", argTypes, term46162, args);
    }

};


