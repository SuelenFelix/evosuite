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

public class GraphImpl_hasVertexWeights_772155364187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45618;

    public GraphImpl_hasVertexWeights_772155364187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45618 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45618, term45618.getClass(), "name", null);
        setIntField(term45618, term45618.getClass(), "maxVertices", 0);
        setIntField(term45618, term45618.getClass(), "numVertices", 0);
        setLongField(term45618, term45618.getClass(), "numEdges", 0L);
        setField(term45618, term45618.getClass(), "vertices", null);
        setField(term45618, term45618.getClass(), "degree", null);
        setField(term45618, term45618.getClass(), "adjList", null);
        setField(term45618, term45618.getClass(), "adjPos", null);
        setField(term45618, term45618.getClass(), "vertexWeight", null);
        setIntField(term45618, term45618.getClass(), "vertexDataSize", 0);
        setField(term45618, term45618.getClass(), "edgeData", null);
        setIntField(term45618, term45618.getClass(), "edgeDataSize", 0);
        setField(term45618, term45618.getClass(), "vertexLabel", null);
        setField(term45618, term45618.getClass(), "edgeLabel", null);
        setField(term45618, term45618.getClass(), "vertexIndex", null);
        setField(term45618, term45618.getClass(), "adjSet", null);
        setField(term45618, term45618.getClass(), "adjMap", null);
        setField(term45618, term45618.getClass(), "maxVertexNumber", null);
        setField(term45618, term45618.getClass(), "labelVertexMap", null);
        setField(term45618, term45618.getClass(), "labelEdgeMap", null);
        setBooleanField(term45618, term45618.getClass(), "directed", false);
        setBooleanField(term45618, term45618.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45618, term45618.getClass(), "allowingSelfLoops", false);
        setIntField(term45618, term45618.getClass(), "avgDegree", 0);
        setBooleanField(term45618, term45618.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasVertexWeights", argTypes, term45618, args);
    }

};


