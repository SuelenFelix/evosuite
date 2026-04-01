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
     Object term172516;
     Object term172527;
     Object term172529;

    public DigraphImpl_neighborIterator_21103919852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172516 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172516, term172516.getClass(), "predList", null);
        setField(term172516, term172516.getClass(), "predPos", null);
        setField(term172516, term172516.getClass(), "indegree", null);
        setField(term172516, term172516.getClass(), "name", null);
        setIntField(term172516, term172516.getClass(), "maxVertices", 0);
        setIntField(term172516, term172516.getClass(), "numVertices", 0);
        setLongField(term172516, term172516.getClass(), "numEdges", 0L);
        setField(term172516, term172516.getClass(), "vertices", null);
        setField(term172516, term172516.getClass(), "degree", null);
        setField(term172516, term172516.getClass(), "adjList", null);
        setField(term172516, term172516.getClass(), "adjPos", null);
        setField(term172516, term172516.getClass(), "vertexWeight", null);
        setIntField(term172516, term172516.getClass(), "vertexDataSize", 0);
        setField(term172516, term172516.getClass(), "edgeData", null);
        setIntField(term172516, term172516.getClass(), "edgeDataSize", 0);
        setField(term172516, term172516.getClass(), "vertexLabel", null);
        setField(term172516, term172516.getClass(), "edgeLabel", null);
        setField(term172516, term172516.getClass(), "vertexIndex", null);
        setField(term172516, term172516.getClass(), "adjSet", null);
        setField(term172516, term172516.getClass(), "adjMap", null);
        setField(term172516, term172516.getClass(), "maxVertexNumber", null);
        setField(term172516, term172516.getClass(), "labelVertexMap", null);
        setField(term172516, term172516.getClass(), "labelEdgeMap", null);
        setBooleanField(term172516, term172516.getClass(), "directed", false);
        setBooleanField(term172516, term172516.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172516, term172516.getClass(), "allowingSelfLoops", false);
        setIntField(term172516, term172516.getClass(), "avgDegree", 0);
        setBooleanField(term172516, term172516.getClass(), "safeMode", false);
        term172527 = new Integer(0);
        term172529 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term172527;
        args[1] = term172529;
        callMethod(klass, "neighborIterator", argTypes, term172516, args);
    }

};


