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

public class GraphImpl_getName_287000237237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46278;

    public GraphImpl_getName_287000237237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46278 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46278, term46278.getClass(), "name", null);
        setIntField(term46278, term46278.getClass(), "maxVertices", 0);
        setIntField(term46278, term46278.getClass(), "numVertices", 0);
        setLongField(term46278, term46278.getClass(), "numEdges", 0L);
        setField(term46278, term46278.getClass(), "vertices", null);
        setField(term46278, term46278.getClass(), "degree", null);
        setField(term46278, term46278.getClass(), "adjList", null);
        setField(term46278, term46278.getClass(), "adjPos", null);
        setField(term46278, term46278.getClass(), "vertexWeight", null);
        setIntField(term46278, term46278.getClass(), "vertexDataSize", 0);
        setField(term46278, term46278.getClass(), "edgeData", null);
        setIntField(term46278, term46278.getClass(), "edgeDataSize", 0);
        setField(term46278, term46278.getClass(), "vertexLabel", null);
        setField(term46278, term46278.getClass(), "edgeLabel", null);
        setField(term46278, term46278.getClass(), "vertexIndex", null);
        setField(term46278, term46278.getClass(), "adjSet", null);
        setField(term46278, term46278.getClass(), "adjMap", null);
        setField(term46278, term46278.getClass(), "maxVertexNumber", null);
        setField(term46278, term46278.getClass(), "labelVertexMap", null);
        setField(term46278, term46278.getClass(), "labelEdgeMap", null);
        setBooleanField(term46278, term46278.getClass(), "directed", false);
        setBooleanField(term46278, term46278.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46278, term46278.getClass(), "allowingSelfLoops", false);
        setIntField(term46278, term46278.getClass(), "avgDegree", 0);
        setBooleanField(term46278, term46278.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term46278, args);
    }

};


