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

public class DigraphImpl_addEdge_18382452235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172288;
     Object term172299;
     Object term172301;

    public DigraphImpl_addEdge_18382452235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172288 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172288, term172288.getClass(), "predList", null);
        setField(term172288, term172288.getClass(), "predPos", null);
        setField(term172288, term172288.getClass(), "indegree", null);
        setField(term172288, term172288.getClass(), "name", null);
        setIntField(term172288, term172288.getClass(), "maxVertices", 0);
        setIntField(term172288, term172288.getClass(), "numVertices", 0);
        setLongField(term172288, term172288.getClass(), "numEdges", 0L);
        setField(term172288, term172288.getClass(), "vertices", null);
        setField(term172288, term172288.getClass(), "degree", null);
        setField(term172288, term172288.getClass(), "adjList", null);
        setField(term172288, term172288.getClass(), "adjPos", null);
        setField(term172288, term172288.getClass(), "vertexWeight", null);
        setIntField(term172288, term172288.getClass(), "vertexDataSize", 0);
        setField(term172288, term172288.getClass(), "edgeData", null);
        setIntField(term172288, term172288.getClass(), "edgeDataSize", 0);
        setField(term172288, term172288.getClass(), "vertexLabel", null);
        setField(term172288, term172288.getClass(), "edgeLabel", null);
        setField(term172288, term172288.getClass(), "vertexIndex", null);
        setField(term172288, term172288.getClass(), "adjSet", null);
        setField(term172288, term172288.getClass(), "adjMap", null);
        setField(term172288, term172288.getClass(), "maxVertexNumber", null);
        setField(term172288, term172288.getClass(), "labelVertexMap", null);
        setField(term172288, term172288.getClass(), "labelEdgeMap", null);
        setBooleanField(term172288, term172288.getClass(), "directed", false);
        setBooleanField(term172288, term172288.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172288, term172288.getClass(), "allowingSelfLoops", false);
        setIntField(term172288, term172288.getClass(), "avgDegree", 0);
        setBooleanField(term172288, term172288.getClass(), "safeMode", false);
        term172299 = new Integer(0);
        term172301 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172299;
        args[1] = term172301;
        callMethod(klass, "addEdge", argTypes, term172288, args);
    }

};


