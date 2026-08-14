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

public class DigraphImpl_removeEdgeAt_53842917238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172335;
     Object term172346;
     Object term172348;

    public DigraphImpl_removeEdgeAt_53842917238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172335 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172335, term172335.getClass(), "predList", null);
        setField(term172335, term172335.getClass(), "predPos", null);
        setField(term172335, term172335.getClass(), "indegree", null);
        setField(term172335, term172335.getClass(), "name", null);
        setIntField(term172335, term172335.getClass(), "maxVertices", 0);
        setIntField(term172335, term172335.getClass(), "numVertices", 0);
        setLongField(term172335, term172335.getClass(), "numEdges", 0L);
        setField(term172335, term172335.getClass(), "vertices", null);
        setField(term172335, term172335.getClass(), "degree", null);
        setField(term172335, term172335.getClass(), "adjList", null);
        setField(term172335, term172335.getClass(), "adjPos", null);
        setField(term172335, term172335.getClass(), "vertexWeight", null);
        setIntField(term172335, term172335.getClass(), "vertexDataSize", 0);
        setField(term172335, term172335.getClass(), "edgeData", null);
        setIntField(term172335, term172335.getClass(), "edgeDataSize", 0);
        setField(term172335, term172335.getClass(), "vertexLabel", null);
        setField(term172335, term172335.getClass(), "edgeLabel", null);
        setField(term172335, term172335.getClass(), "vertexIndex", null);
        setField(term172335, term172335.getClass(), "adjSet", null);
        setField(term172335, term172335.getClass(), "adjMap", null);
        setField(term172335, term172335.getClass(), "maxVertexNumber", null);
        setField(term172335, term172335.getClass(), "labelVertexMap", null);
        setField(term172335, term172335.getClass(), "labelEdgeMap", null);
        setBooleanField(term172335, term172335.getClass(), "directed", false);
        setBooleanField(term172335, term172335.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172335, term172335.getClass(), "allowingSelfLoops", false);
        setIntField(term172335, term172335.getClass(), "avgDegree", 0);
        setBooleanField(term172335, term172335.getClass(), "safeMode", false);
        term172346 = new Integer(0);
        term172348 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172346;
        args[1] = term172348;
        callMethod(klass, "removeEdgeAt", argTypes, term172335, args);
    }

};


