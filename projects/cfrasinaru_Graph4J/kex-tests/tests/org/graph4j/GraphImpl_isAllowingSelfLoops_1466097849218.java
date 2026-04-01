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

public class GraphImpl_isAllowingSelfLoops_1466097849218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46057;

    public GraphImpl_isAllowingSelfLoops_1466097849218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46057 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term46057, term46057.getClass(), "name", null);
        setIntField(term46057, term46057.getClass(), "maxVertices", 0);
        setIntField(term46057, term46057.getClass(), "numVertices", 0);
        setLongField(term46057, term46057.getClass(), "numEdges", 0L);
        setField(term46057, term46057.getClass(), "vertices", null);
        setField(term46057, term46057.getClass(), "degree", null);
        setField(term46057, term46057.getClass(), "adjList", null);
        setField(term46057, term46057.getClass(), "adjPos", null);
        setField(term46057, term46057.getClass(), "vertexWeight", null);
        setIntField(term46057, term46057.getClass(), "vertexDataSize", 0);
        setField(term46057, term46057.getClass(), "edgeData", null);
        setIntField(term46057, term46057.getClass(), "edgeDataSize", 0);
        setField(term46057, term46057.getClass(), "vertexLabel", null);
        setField(term46057, term46057.getClass(), "edgeLabel", null);
        setField(term46057, term46057.getClass(), "vertexIndex", null);
        setField(term46057, term46057.getClass(), "adjSet", null);
        setField(term46057, term46057.getClass(), "adjMap", null);
        setField(term46057, term46057.getClass(), "maxVertexNumber", null);
        setField(term46057, term46057.getClass(), "labelVertexMap", null);
        setField(term46057, term46057.getClass(), "labelEdgeMap", null);
        setBooleanField(term46057, term46057.getClass(), "directed", false);
        setBooleanField(term46057, term46057.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term46057, term46057.getClass(), "allowingSelfLoops", false);
        setIntField(term46057, term46057.getClass(), "avgDegree", 0);
        setBooleanField(term46057, term46057.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllowingSelfLoops", argTypes, term46057, args);
    }

};


