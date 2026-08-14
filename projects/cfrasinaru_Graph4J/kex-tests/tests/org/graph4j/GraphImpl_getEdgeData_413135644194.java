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
import java.lang.Double;

public class GraphImpl_getEdgeData_413135644194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45723;
     Object term45734;
     Object term45736;
     Object term45738;
     Object term45740;

    public GraphImpl_getEdgeData_413135644194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45723 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45723, term45723.getClass(), "name", null);
        setIntField(term45723, term45723.getClass(), "maxVertices", 0);
        setIntField(term45723, term45723.getClass(), "numVertices", 0);
        setLongField(term45723, term45723.getClass(), "numEdges", 0L);
        setField(term45723, term45723.getClass(), "vertices", null);
        setField(term45723, term45723.getClass(), "degree", null);
        setField(term45723, term45723.getClass(), "adjList", null);
        setField(term45723, term45723.getClass(), "adjPos", null);
        setField(term45723, term45723.getClass(), "vertexWeight", null);
        setIntField(term45723, term45723.getClass(), "vertexDataSize", 0);
        setField(term45723, term45723.getClass(), "edgeData", null);
        setIntField(term45723, term45723.getClass(), "edgeDataSize", 0);
        setField(term45723, term45723.getClass(), "vertexLabel", null);
        setField(term45723, term45723.getClass(), "edgeLabel", null);
        setField(term45723, term45723.getClass(), "vertexIndex", null);
        setField(term45723, term45723.getClass(), "adjSet", null);
        setField(term45723, term45723.getClass(), "adjMap", null);
        setField(term45723, term45723.getClass(), "maxVertexNumber", null);
        setField(term45723, term45723.getClass(), "labelVertexMap", null);
        setField(term45723, term45723.getClass(), "labelEdgeMap", null);
        setBooleanField(term45723, term45723.getClass(), "directed", false);
        setBooleanField(term45723, term45723.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45723, term45723.getClass(), "allowingSelfLoops", false);
        setIntField(term45723, term45723.getClass(), "avgDegree", 0);
        setBooleanField(term45723, term45723.getClass(), "safeMode", false);
        term45734 = new Integer(0);
        term45736 = new Integer(0);
        term45738 = new Integer(0);
        term45740 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term45734;
        args[1] = term45736;
        args[2] = term45738;
        args[3] = term45740;
        callMethod(klass, "getEdgeData", argTypes, term45723, args);
    }

};


