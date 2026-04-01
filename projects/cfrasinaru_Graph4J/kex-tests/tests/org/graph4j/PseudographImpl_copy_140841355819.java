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
import java.lang.Boolean;

public class PseudographImpl_copy_140841355819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118459;
     Object term118470;
     Object term118472;
     Object term118474;
     Object term118476;
     Object term118478;

    public PseudographImpl_copy_140841355819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118459 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118459, term118459.getClass(), "selfLoops", null);
        setField(term118459, term118459.getClass(), "name", null);
        setIntField(term118459, term118459.getClass(), "maxVertices", 0);
        setIntField(term118459, term118459.getClass(), "numVertices", 0);
        setLongField(term118459, term118459.getClass(), "numEdges", 0L);
        setField(term118459, term118459.getClass(), "vertices", null);
        setField(term118459, term118459.getClass(), "degree", null);
        setField(term118459, term118459.getClass(), "adjList", null);
        setField(term118459, term118459.getClass(), "adjPos", null);
        setField(term118459, term118459.getClass(), "vertexWeight", null);
        setIntField(term118459, term118459.getClass(), "vertexDataSize", 0);
        setField(term118459, term118459.getClass(), "edgeData", null);
        setIntField(term118459, term118459.getClass(), "edgeDataSize", 0);
        setField(term118459, term118459.getClass(), "vertexLabel", null);
        setField(term118459, term118459.getClass(), "edgeLabel", null);
        setField(term118459, term118459.getClass(), "vertexIndex", null);
        setField(term118459, term118459.getClass(), "adjSet", null);
        setField(term118459, term118459.getClass(), "adjMap", null);
        setField(term118459, term118459.getClass(), "maxVertexNumber", null);
        setField(term118459, term118459.getClass(), "labelVertexMap", null);
        setField(term118459, term118459.getClass(), "labelEdgeMap", null);
        setBooleanField(term118459, term118459.getClass(), "directed", false);
        setBooleanField(term118459, term118459.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118459, term118459.getClass(), "allowingSelfLoops", false);
        setIntField(term118459, term118459.getClass(), "avgDegree", 0);
        setBooleanField(term118459, term118459.getClass(), "safeMode", false);
        term118470 = new Boolean(false);
        term118472 = new Boolean(false);
        term118474 = new Boolean(false);
        term118476 = new Boolean(false);
        term118478 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term118470;
        args[1] = term118472;
        args[2] = term118474;
        args[3] = term118476;
        args[4] = term118478;
        callMethod(klass, "copy", argTypes, term118459, args);
    }

};


