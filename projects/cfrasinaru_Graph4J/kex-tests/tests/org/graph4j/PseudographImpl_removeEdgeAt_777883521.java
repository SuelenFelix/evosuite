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

public class PseudographImpl_removeEdgeAt_777883521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118498;
     Object term118509;
     Object term118511;

    public PseudographImpl_removeEdgeAt_777883521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118498 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118498, term118498.getClass(), "selfLoops", null);
        setField(term118498, term118498.getClass(), "name", null);
        setIntField(term118498, term118498.getClass(), "maxVertices", 0);
        setIntField(term118498, term118498.getClass(), "numVertices", 0);
        setLongField(term118498, term118498.getClass(), "numEdges", 0L);
        setField(term118498, term118498.getClass(), "vertices", null);
        setField(term118498, term118498.getClass(), "degree", null);
        setField(term118498, term118498.getClass(), "adjList", null);
        setField(term118498, term118498.getClass(), "adjPos", null);
        setField(term118498, term118498.getClass(), "vertexWeight", null);
        setIntField(term118498, term118498.getClass(), "vertexDataSize", 0);
        setField(term118498, term118498.getClass(), "edgeData", null);
        setIntField(term118498, term118498.getClass(), "edgeDataSize", 0);
        setField(term118498, term118498.getClass(), "vertexLabel", null);
        setField(term118498, term118498.getClass(), "edgeLabel", null);
        setField(term118498, term118498.getClass(), "vertexIndex", null);
        setField(term118498, term118498.getClass(), "adjSet", null);
        setField(term118498, term118498.getClass(), "adjMap", null);
        setField(term118498, term118498.getClass(), "maxVertexNumber", null);
        setField(term118498, term118498.getClass(), "labelVertexMap", null);
        setField(term118498, term118498.getClass(), "labelEdgeMap", null);
        setBooleanField(term118498, term118498.getClass(), "directed", false);
        setBooleanField(term118498, term118498.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118498, term118498.getClass(), "allowingSelfLoops", false);
        setIntField(term118498, term118498.getClass(), "avgDegree", 0);
        setBooleanField(term118498, term118498.getClass(), "safeMode", false);
        term118509 = new Integer(0);
        term118511 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term118509;
        args[1] = term118511;
        callMethod(klass, "removeEdgeAt", argTypes, term118498, args);
    }

};


