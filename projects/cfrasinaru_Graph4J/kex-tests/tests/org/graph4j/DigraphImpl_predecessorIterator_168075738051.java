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

public class DigraphImpl_predecessorIterator_168075738051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172501;
     Object term172512;
     Object term172514;

    public DigraphImpl_predecessorIterator_168075738051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172501 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172501, term172501.getClass(), "predList", null);
        setField(term172501, term172501.getClass(), "predPos", null);
        setField(term172501, term172501.getClass(), "indegree", null);
        setField(term172501, term172501.getClass(), "name", null);
        setIntField(term172501, term172501.getClass(), "maxVertices", 0);
        setIntField(term172501, term172501.getClass(), "numVertices", 0);
        setLongField(term172501, term172501.getClass(), "numEdges", 0L);
        setField(term172501, term172501.getClass(), "vertices", null);
        setField(term172501, term172501.getClass(), "degree", null);
        setField(term172501, term172501.getClass(), "adjList", null);
        setField(term172501, term172501.getClass(), "adjPos", null);
        setField(term172501, term172501.getClass(), "vertexWeight", null);
        setIntField(term172501, term172501.getClass(), "vertexDataSize", 0);
        setField(term172501, term172501.getClass(), "edgeData", null);
        setIntField(term172501, term172501.getClass(), "edgeDataSize", 0);
        setField(term172501, term172501.getClass(), "vertexLabel", null);
        setField(term172501, term172501.getClass(), "edgeLabel", null);
        setField(term172501, term172501.getClass(), "vertexIndex", null);
        setField(term172501, term172501.getClass(), "adjSet", null);
        setField(term172501, term172501.getClass(), "adjMap", null);
        setField(term172501, term172501.getClass(), "maxVertexNumber", null);
        setField(term172501, term172501.getClass(), "labelVertexMap", null);
        setField(term172501, term172501.getClass(), "labelEdgeMap", null);
        setBooleanField(term172501, term172501.getClass(), "directed", false);
        setBooleanField(term172501, term172501.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172501, term172501.getClass(), "allowingSelfLoops", false);
        setIntField(term172501, term172501.getClass(), "avgDegree", 0);
        setBooleanField(term172501, term172501.getClass(), "safeMode", false);
        term172512 = new Integer(0);
        term172514 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172512;
        args[1] = term172514;
        callMethod(klass, "predecessorIterator", argTypes, term172501, args);
    }

};


