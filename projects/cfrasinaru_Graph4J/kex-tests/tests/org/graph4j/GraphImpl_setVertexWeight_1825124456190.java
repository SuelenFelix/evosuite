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

public class GraphImpl_setVertexWeight_1825124456190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45657;
     Object term45668;
     Object term45670;

    public GraphImpl_setVertexWeight_1825124456190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45657 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term45657, term45657.getClass(), "name", null);
        setIntField(term45657, term45657.getClass(), "maxVertices", 0);
        setIntField(term45657, term45657.getClass(), "numVertices", 0);
        setLongField(term45657, term45657.getClass(), "numEdges", 0L);
        setField(term45657, term45657.getClass(), "vertices", null);
        setField(term45657, term45657.getClass(), "degree", null);
        setField(term45657, term45657.getClass(), "adjList", null);
        setField(term45657, term45657.getClass(), "adjPos", null);
        setField(term45657, term45657.getClass(), "vertexWeight", null);
        setIntField(term45657, term45657.getClass(), "vertexDataSize", 0);
        setField(term45657, term45657.getClass(), "edgeData", null);
        setIntField(term45657, term45657.getClass(), "edgeDataSize", 0);
        setField(term45657, term45657.getClass(), "vertexLabel", null);
        setField(term45657, term45657.getClass(), "edgeLabel", null);
        setField(term45657, term45657.getClass(), "vertexIndex", null);
        setField(term45657, term45657.getClass(), "adjSet", null);
        setField(term45657, term45657.getClass(), "adjMap", null);
        setField(term45657, term45657.getClass(), "maxVertexNumber", null);
        setField(term45657, term45657.getClass(), "labelVertexMap", null);
        setField(term45657, term45657.getClass(), "labelEdgeMap", null);
        setBooleanField(term45657, term45657.getClass(), "directed", false);
        setBooleanField(term45657, term45657.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term45657, term45657.getClass(), "allowingSelfLoops", false);
        setIntField(term45657, term45657.getClass(), "avgDegree", 0);
        setBooleanField(term45657, term45657.getClass(), "safeMode", false);
        term45668 = new Integer(0);
        term45670 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term45668;
        args[1] = term45670;
        callMethod(klass, "setVertexWeight", argTypes, term45657, args);
    }

};


