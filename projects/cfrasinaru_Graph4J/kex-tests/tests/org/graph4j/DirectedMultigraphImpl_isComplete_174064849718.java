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

public class DirectedMultigraphImpl_isComplete_174064849718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133726;

    public DirectedMultigraphImpl_isComplete_174064849718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133726 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133726, term133726.getClass(), "predList", null);
        setField(term133726, term133726.getClass(), "predPos", null);
        setField(term133726, term133726.getClass(), "indegree", null);
        setField(term133726, term133726.getClass(), "name", null);
        setIntField(term133726, term133726.getClass(), "maxVertices", 0);
        setIntField(term133726, term133726.getClass(), "numVertices", 0);
        setLongField(term133726, term133726.getClass(), "numEdges", 0L);
        setField(term133726, term133726.getClass(), "vertices", null);
        setField(term133726, term133726.getClass(), "degree", null);
        setField(term133726, term133726.getClass(), "adjList", null);
        setField(term133726, term133726.getClass(), "adjPos", null);
        setField(term133726, term133726.getClass(), "vertexWeight", null);
        setIntField(term133726, term133726.getClass(), "vertexDataSize", 0);
        setField(term133726, term133726.getClass(), "edgeData", null);
        setIntField(term133726, term133726.getClass(), "edgeDataSize", 0);
        setField(term133726, term133726.getClass(), "vertexLabel", null);
        setField(term133726, term133726.getClass(), "edgeLabel", null);
        setField(term133726, term133726.getClass(), "vertexIndex", null);
        setField(term133726, term133726.getClass(), "adjSet", null);
        setField(term133726, term133726.getClass(), "adjMap", null);
        setField(term133726, term133726.getClass(), "maxVertexNumber", null);
        setField(term133726, term133726.getClass(), "labelVertexMap", null);
        setField(term133726, term133726.getClass(), "labelEdgeMap", null);
        setBooleanField(term133726, term133726.getClass(), "directed", false);
        setBooleanField(term133726, term133726.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133726, term133726.getClass(), "allowingSelfLoops", false);
        setIntField(term133726, term133726.getClass(), "avgDegree", 0);
        setBooleanField(term133726, term133726.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term133726, args);
    }

};


