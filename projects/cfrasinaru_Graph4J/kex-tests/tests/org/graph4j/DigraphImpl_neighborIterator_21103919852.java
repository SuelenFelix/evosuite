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
import java.lang.Boolean;

public class DigraphImpl_neighborIterator_21103919852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172519;
     Object term172530;
     Object term172532;

    public DigraphImpl_neighborIterator_21103919852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172519 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172519, term172519.getClass(), "predList", null);
        setField(term172519, term172519.getClass(), "predPos", null);
        setField(term172519, term172519.getClass(), "indegree", null);
        setField(term172519, term172519.getClass(), "name", null);
        setIntField(term172519, term172519.getClass(), "maxVertices", 0);
        setIntField(term172519, term172519.getClass(), "numVertices", 0);
        setLongField(term172519, term172519.getClass(), "numEdges", 0L);
        setField(term172519, term172519.getClass(), "vertices", null);
        setField(term172519, term172519.getClass(), "degree", null);
        setField(term172519, term172519.getClass(), "adjList", null);
        setField(term172519, term172519.getClass(), "adjPos", null);
        setField(term172519, term172519.getClass(), "vertexWeight", null);
        setIntField(term172519, term172519.getClass(), "vertexDataSize", 0);
        setField(term172519, term172519.getClass(), "edgeData", null);
        setIntField(term172519, term172519.getClass(), "edgeDataSize", 0);
        setField(term172519, term172519.getClass(), "vertexLabel", null);
        setField(term172519, term172519.getClass(), "edgeLabel", null);
        setField(term172519, term172519.getClass(), "vertexIndex", null);
        setField(term172519, term172519.getClass(), "adjSet", null);
        setField(term172519, term172519.getClass(), "adjMap", null);
        setField(term172519, term172519.getClass(), "maxVertexNumber", null);
        setField(term172519, term172519.getClass(), "labelVertexMap", null);
        setField(term172519, term172519.getClass(), "labelEdgeMap", null);
        setBooleanField(term172519, term172519.getClass(), "directed", false);
        setBooleanField(term172519, term172519.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172519, term172519.getClass(), "allowingSelfLoops", false);
        setIntField(term172519, term172519.getClass(), "avgDegree", 0);
        setBooleanField(term172519, term172519.getClass(), "safeMode", false);
        term172530 = new Integer(0);
        term172532 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term172530;
        args[1] = term172532;
        callMethod(klass, "neighborIterator", argTypes, term172519, args);
    }

};


