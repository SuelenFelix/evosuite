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
     Object term118462;
     Object term118473;
     Object term118475;
     Object term118477;
     Object term118479;
     Object term118481;

    public PseudographImpl_copy_140841355819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118462 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118462, term118462.getClass(), "selfLoops", null);
        setField(term118462, term118462.getClass(), "name", null);
        setIntField(term118462, term118462.getClass(), "maxVertices", 0);
        setIntField(term118462, term118462.getClass(), "numVertices", 0);
        setLongField(term118462, term118462.getClass(), "numEdges", 0L);
        setField(term118462, term118462.getClass(), "vertices", null);
        setField(term118462, term118462.getClass(), "degree", null);
        setField(term118462, term118462.getClass(), "adjList", null);
        setField(term118462, term118462.getClass(), "adjPos", null);
        setField(term118462, term118462.getClass(), "vertexWeight", null);
        setIntField(term118462, term118462.getClass(), "vertexDataSize", 0);
        setField(term118462, term118462.getClass(), "edgeData", null);
        setIntField(term118462, term118462.getClass(), "edgeDataSize", 0);
        setField(term118462, term118462.getClass(), "vertexLabel", null);
        setField(term118462, term118462.getClass(), "edgeLabel", null);
        setField(term118462, term118462.getClass(), "vertexIndex", null);
        setField(term118462, term118462.getClass(), "adjSet", null);
        setField(term118462, term118462.getClass(), "adjMap", null);
        setField(term118462, term118462.getClass(), "maxVertexNumber", null);
        setField(term118462, term118462.getClass(), "labelVertexMap", null);
        setField(term118462, term118462.getClass(), "labelEdgeMap", null);
        setBooleanField(term118462, term118462.getClass(), "directed", false);
        setBooleanField(term118462, term118462.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118462, term118462.getClass(), "allowingSelfLoops", false);
        setIntField(term118462, term118462.getClass(), "avgDegree", 0);
        setBooleanField(term118462, term118462.getClass(), "safeMode", false);
        term118473 = new Boolean(false);
        term118475 = new Boolean(false);
        term118477 = new Boolean(false);
        term118479 = new Boolean(false);
        term118481 = new Boolean(false);
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
        args[0] = term118473;
        args[1] = term118475;
        args[2] = term118477;
        args[3] = term118479;
        args[4] = term118481;
        callMethod(klass, "copy", argTypes, term118462, args);
    }

};


