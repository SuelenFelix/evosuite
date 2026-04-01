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

public class PseudographImpl_newInstance_138273780414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118386;

    public PseudographImpl_newInstance_138273780414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118386 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118386, term118386.getClass(), "selfLoops", null);
        setField(term118386, term118386.getClass(), "name", null);
        setIntField(term118386, term118386.getClass(), "maxVertices", 0);
        setIntField(term118386, term118386.getClass(), "numVertices", 0);
        setLongField(term118386, term118386.getClass(), "numEdges", 0L);
        setField(term118386, term118386.getClass(), "vertices", null);
        setField(term118386, term118386.getClass(), "degree", null);
        setField(term118386, term118386.getClass(), "adjList", null);
        setField(term118386, term118386.getClass(), "adjPos", null);
        setField(term118386, term118386.getClass(), "vertexWeight", null);
        setIntField(term118386, term118386.getClass(), "vertexDataSize", 0);
        setField(term118386, term118386.getClass(), "edgeData", null);
        setIntField(term118386, term118386.getClass(), "edgeDataSize", 0);
        setField(term118386, term118386.getClass(), "vertexLabel", null);
        setField(term118386, term118386.getClass(), "edgeLabel", null);
        setField(term118386, term118386.getClass(), "vertexIndex", null);
        setField(term118386, term118386.getClass(), "adjSet", null);
        setField(term118386, term118386.getClass(), "adjMap", null);
        setField(term118386, term118386.getClass(), "maxVertexNumber", null);
        setField(term118386, term118386.getClass(), "labelVertexMap", null);
        setField(term118386, term118386.getClass(), "labelEdgeMap", null);
        setBooleanField(term118386, term118386.getClass(), "directed", false);
        setBooleanField(term118386, term118386.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118386, term118386.getClass(), "allowingSelfLoops", false);
        setIntField(term118386, term118386.getClass(), "avgDegree", 0);
        setBooleanField(term118386, term118386.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term118386, args);
    }

};


