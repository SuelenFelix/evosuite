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

public class MultigraphImpl_setEdgeLabel_50262162017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127325;
     Object term127336;
     Object term127338;

    public MultigraphImpl_setEdgeLabel_50262162017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127325 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127325, term127325.getClass(), "name", null);
        setIntField(term127325, term127325.getClass(), "maxVertices", 0);
        setIntField(term127325, term127325.getClass(), "numVertices", 0);
        setLongField(term127325, term127325.getClass(), "numEdges", 0L);
        setField(term127325, term127325.getClass(), "vertices", null);
        setField(term127325, term127325.getClass(), "degree", null);
        setField(term127325, term127325.getClass(), "adjList", null);
        setField(term127325, term127325.getClass(), "adjPos", null);
        setField(term127325, term127325.getClass(), "vertexWeight", null);
        setIntField(term127325, term127325.getClass(), "vertexDataSize", 0);
        setField(term127325, term127325.getClass(), "edgeData", null);
        setIntField(term127325, term127325.getClass(), "edgeDataSize", 0);
        setField(term127325, term127325.getClass(), "vertexLabel", null);
        setField(term127325, term127325.getClass(), "edgeLabel", null);
        setField(term127325, term127325.getClass(), "vertexIndex", null);
        setField(term127325, term127325.getClass(), "adjSet", null);
        setField(term127325, term127325.getClass(), "adjMap", null);
        setField(term127325, term127325.getClass(), "maxVertexNumber", null);
        setField(term127325, term127325.getClass(), "labelVertexMap", null);
        setField(term127325, term127325.getClass(), "labelEdgeMap", null);
        setBooleanField(term127325, term127325.getClass(), "directed", false);
        setBooleanField(term127325, term127325.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127325, term127325.getClass(), "allowingSelfLoops", false);
        setIntField(term127325, term127325.getClass(), "avgDegree", 0);
        setBooleanField(term127325, term127325.getClass(), "safeMode", false);
        term127336 = new Integer(0);
        term127338 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term127336;
        args[1] = term127338;
        args[2] = null;
        callMethod(klass, "setEdgeLabel", argTypes, term127325, args);
    }

};


