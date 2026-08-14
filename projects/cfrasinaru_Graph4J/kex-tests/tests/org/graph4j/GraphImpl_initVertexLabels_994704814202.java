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

public class GraphImpl_initVertexLabels_994704814202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45863;

    public GraphImpl_initVertexLabels_994704814202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45863 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45863, term45863.getClass(), "name", null);
        setIntField(term45863, term45863.getClass(), "maxVertices", 0);
        setIntField(term45863, term45863.getClass(), "numVertices", 0);
        setLongField(term45863, term45863.getClass(), "numEdges", 0L);
        setField(term45863, term45863.getClass(), "vertices", null);
        setField(term45863, term45863.getClass(), "degree", null);
        setField(term45863, term45863.getClass(), "adjList", null);
        setField(term45863, term45863.getClass(), "adjPos", null);
        setField(term45863, term45863.getClass(), "vertexWeight", null);
        setIntField(term45863, term45863.getClass(), "vertexDataSize", 0);
        setField(term45863, term45863.getClass(), "edgeData", null);
        setIntField(term45863, term45863.getClass(), "edgeDataSize", 0);
        setField(term45863, term45863.getClass(), "vertexLabel", null);
        setField(term45863, term45863.getClass(), "edgeLabel", null);
        setField(term45863, term45863.getClass(), "vertexIndex", null);
        setField(term45863, term45863.getClass(), "adjSet", null);
        setField(term45863, term45863.getClass(), "adjMap", null);
        setField(term45863, term45863.getClass(), "maxVertexNumber", null);
        setField(term45863, term45863.getClass(), "labelVertexMap", null);
        setField(term45863, term45863.getClass(), "labelEdgeMap", null);
        setBooleanField(term45863, term45863.getClass(), "directed", false);
        setBooleanField(term45863, term45863.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45863, term45863.getClass(), "allowingSelfLoops", false);
        setIntField(term45863, term45863.getClass(), "avgDegree", 0);
        setBooleanField(term45863, term45863.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initVertexLabels", argTypes, term45863, args);
    }

};


