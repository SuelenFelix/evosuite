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

public class PseudographImpl_copy_52090990818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118451;

    public PseudographImpl_copy_52090990818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118451 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118451, term118451.getClass(), "selfLoops", null);
        setField(term118451, term118451.getClass(), "name", null);
        setIntField(term118451, term118451.getClass(), "maxVertices", 0);
        setIntField(term118451, term118451.getClass(), "numVertices", 0);
        setLongField(term118451, term118451.getClass(), "numEdges", 0L);
        setField(term118451, term118451.getClass(), "vertices", null);
        setField(term118451, term118451.getClass(), "degree", null);
        setField(term118451, term118451.getClass(), "adjList", null);
        setField(term118451, term118451.getClass(), "adjPos", null);
        setField(term118451, term118451.getClass(), "vertexWeight", null);
        setIntField(term118451, term118451.getClass(), "vertexDataSize", 0);
        setField(term118451, term118451.getClass(), "edgeData", null);
        setIntField(term118451, term118451.getClass(), "edgeDataSize", 0);
        setField(term118451, term118451.getClass(), "vertexLabel", null);
        setField(term118451, term118451.getClass(), "edgeLabel", null);
        setField(term118451, term118451.getClass(), "vertexIndex", null);
        setField(term118451, term118451.getClass(), "adjSet", null);
        setField(term118451, term118451.getClass(), "adjMap", null);
        setField(term118451, term118451.getClass(), "maxVertexNumber", null);
        setField(term118451, term118451.getClass(), "labelVertexMap", null);
        setField(term118451, term118451.getClass(), "labelEdgeMap", null);
        setBooleanField(term118451, term118451.getClass(), "directed", false);
        setBooleanField(term118451, term118451.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118451, term118451.getClass(), "allowingSelfLoops", false);
        setIntField(term118451, term118451.getClass(), "avgDegree", 0);
        setBooleanField(term118451, term118451.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term118451, args);
    }

};


