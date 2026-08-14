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

public class GraphImpl_setEdgeData_1690579123192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45685;
     Object term45696;
     Object term45698;
     Object term45700;
     Object term45702;

    public GraphImpl_setEdgeData_1690579123192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45685 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45685, term45685.getClass(), "name", null);
        setIntField(term45685, term45685.getClass(), "maxVertices", 0);
        setIntField(term45685, term45685.getClass(), "numVertices", 0);
        setLongField(term45685, term45685.getClass(), "numEdges", 0L);
        setField(term45685, term45685.getClass(), "vertices", null);
        setField(term45685, term45685.getClass(), "degree", null);
        setField(term45685, term45685.getClass(), "adjList", null);
        setField(term45685, term45685.getClass(), "adjPos", null);
        setField(term45685, term45685.getClass(), "vertexWeight", null);
        setIntField(term45685, term45685.getClass(), "vertexDataSize", 0);
        setField(term45685, term45685.getClass(), "edgeData", null);
        setIntField(term45685, term45685.getClass(), "edgeDataSize", 0);
        setField(term45685, term45685.getClass(), "vertexLabel", null);
        setField(term45685, term45685.getClass(), "edgeLabel", null);
        setField(term45685, term45685.getClass(), "vertexIndex", null);
        setField(term45685, term45685.getClass(), "adjSet", null);
        setField(term45685, term45685.getClass(), "adjMap", null);
        setField(term45685, term45685.getClass(), "maxVertexNumber", null);
        setField(term45685, term45685.getClass(), "labelVertexMap", null);
        setField(term45685, term45685.getClass(), "labelEdgeMap", null);
        setBooleanField(term45685, term45685.getClass(), "directed", false);
        setBooleanField(term45685, term45685.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45685, term45685.getClass(), "allowingSelfLoops", false);
        setIntField(term45685, term45685.getClass(), "avgDegree", 0);
        setBooleanField(term45685, term45685.getClass(), "safeMode", false);
        term45696 = new Integer(0);
        term45698 = new Integer(0);
        term45700 = new Integer(0);
        term45702 = new Double(0.0);
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
        args[0] = term45696;
        args[1] = term45698;
        args[2] = term45700;
        args[3] = term45702;
        callMethod(klass, "setEdgeData", argTypes, term45685, args);
    }

};


