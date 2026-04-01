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

public class GraphImpl_addVertex_1231579922148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45093;
     Object term45104;

    public GraphImpl_addVertex_1231579922148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45093 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45093, term45093.getClass(), "name", null);
        setIntField(term45093, term45093.getClass(), "maxVertices", 0);
        setIntField(term45093, term45093.getClass(), "numVertices", 0);
        setLongField(term45093, term45093.getClass(), "numEdges", 0L);
        setField(term45093, term45093.getClass(), "vertices", null);
        setField(term45093, term45093.getClass(), "degree", null);
        setField(term45093, term45093.getClass(), "adjList", null);
        setField(term45093, term45093.getClass(), "adjPos", null);
        setField(term45093, term45093.getClass(), "vertexWeight", null);
        setIntField(term45093, term45093.getClass(), "vertexDataSize", 0);
        setField(term45093, term45093.getClass(), "edgeData", null);
        setIntField(term45093, term45093.getClass(), "edgeDataSize", 0);
        setField(term45093, term45093.getClass(), "vertexLabel", null);
        setField(term45093, term45093.getClass(), "edgeLabel", null);
        setField(term45093, term45093.getClass(), "vertexIndex", null);
        setField(term45093, term45093.getClass(), "adjSet", null);
        setField(term45093, term45093.getClass(), "adjMap", null);
        setField(term45093, term45093.getClass(), "maxVertexNumber", null);
        setField(term45093, term45093.getClass(), "labelVertexMap", null);
        setField(term45093, term45093.getClass(), "labelEdgeMap", null);
        setBooleanField(term45093, term45093.getClass(), "directed", false);
        setBooleanField(term45093, term45093.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45093, term45093.getClass(), "allowingSelfLoops", false);
        setIntField(term45093, term45093.getClass(), "avgDegree", 0);
        setBooleanField(term45093, term45093.getClass(), "safeMode", false);
        term45104 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45104;
        callMethod(klass, "addVertex", argTypes, term45093, args);
    }

};


