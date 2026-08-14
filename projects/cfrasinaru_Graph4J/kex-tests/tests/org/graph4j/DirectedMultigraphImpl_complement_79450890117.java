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

public class DirectedMultigraphImpl_complement_79450890117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133715;

    public DirectedMultigraphImpl_complement_79450890117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133715 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133715, term133715.getClass(), "predList", null);
        setField(term133715, term133715.getClass(), "predPos", null);
        setField(term133715, term133715.getClass(), "indegree", null);
        setField(term133715, term133715.getClass(), "name", null);
        setIntField(term133715, term133715.getClass(), "maxVertices", 0);
        setIntField(term133715, term133715.getClass(), "numVertices", 0);
        setLongField(term133715, term133715.getClass(), "numEdges", 0L);
        setField(term133715, term133715.getClass(), "vertices", null);
        setField(term133715, term133715.getClass(), "degree", null);
        setField(term133715, term133715.getClass(), "adjList", null);
        setField(term133715, term133715.getClass(), "adjPos", null);
        setField(term133715, term133715.getClass(), "vertexWeight", null);
        setIntField(term133715, term133715.getClass(), "vertexDataSize", 0);
        setField(term133715, term133715.getClass(), "edgeData", null);
        setIntField(term133715, term133715.getClass(), "edgeDataSize", 0);
        setField(term133715, term133715.getClass(), "vertexLabel", null);
        setField(term133715, term133715.getClass(), "edgeLabel", null);
        setField(term133715, term133715.getClass(), "vertexIndex", null);
        setField(term133715, term133715.getClass(), "adjSet", null);
        setField(term133715, term133715.getClass(), "adjMap", null);
        setField(term133715, term133715.getClass(), "maxVertexNumber", null);
        setField(term133715, term133715.getClass(), "labelVertexMap", null);
        setField(term133715, term133715.getClass(), "labelEdgeMap", null);
        setBooleanField(term133715, term133715.getClass(), "directed", false);
        setBooleanField(term133715, term133715.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133715, term133715.getClass(), "allowingSelfLoops", false);
        setIntField(term133715, term133715.getClass(), "avgDegree", 0);
        setBooleanField(term133715, term133715.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "complement", argTypes, term133715, args);
    }

};


