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

public class MultigraphImpl_setEdgeWeight_62859150418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127343;
     Object term127354;
     Object term127356;
     Object term127358;

    public MultigraphImpl_setEdgeWeight_62859150418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127343 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127343, term127343.getClass(), "name", null);
        setIntField(term127343, term127343.getClass(), "maxVertices", 0);
        setIntField(term127343, term127343.getClass(), "numVertices", 0);
        setLongField(term127343, term127343.getClass(), "numEdges", 0L);
        setField(term127343, term127343.getClass(), "vertices", null);
        setField(term127343, term127343.getClass(), "degree", null);
        setField(term127343, term127343.getClass(), "adjList", null);
        setField(term127343, term127343.getClass(), "adjPos", null);
        setField(term127343, term127343.getClass(), "vertexWeight", null);
        setIntField(term127343, term127343.getClass(), "vertexDataSize", 0);
        setField(term127343, term127343.getClass(), "edgeData", null);
        setIntField(term127343, term127343.getClass(), "edgeDataSize", 0);
        setField(term127343, term127343.getClass(), "vertexLabel", null);
        setField(term127343, term127343.getClass(), "edgeLabel", null);
        setField(term127343, term127343.getClass(), "vertexIndex", null);
        setField(term127343, term127343.getClass(), "adjSet", null);
        setField(term127343, term127343.getClass(), "adjMap", null);
        setField(term127343, term127343.getClass(), "maxVertexNumber", null);
        setField(term127343, term127343.getClass(), "labelVertexMap", null);
        setField(term127343, term127343.getClass(), "labelEdgeMap", null);
        setBooleanField(term127343, term127343.getClass(), "directed", false);
        setBooleanField(term127343, term127343.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127343, term127343.getClass(), "allowingSelfLoops", false);
        setIntField(term127343, term127343.getClass(), "avgDegree", 0);
        setBooleanField(term127343, term127343.getClass(), "safeMode", false);
        term127354 = new Integer(0);
        term127356 = new Integer(0);
        term127358 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term127354;
        args[1] = term127356;
        args[2] = term127358;
        callMethod(klass, "setEdgeWeight", argTypes, term127343, args);
    }

};


