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

public class DirectedMultigraphImpl_copy_4942642014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133669;

    public DirectedMultigraphImpl_copy_4942642014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133669 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133669, term133669.getClass(), "predList", null);
        setField(term133669, term133669.getClass(), "predPos", null);
        setField(term133669, term133669.getClass(), "indegree", null);
        setField(term133669, term133669.getClass(), "name", null);
        setIntField(term133669, term133669.getClass(), "maxVertices", 0);
        setIntField(term133669, term133669.getClass(), "numVertices", 0);
        setLongField(term133669, term133669.getClass(), "numEdges", 0L);
        setField(term133669, term133669.getClass(), "vertices", null);
        setField(term133669, term133669.getClass(), "degree", null);
        setField(term133669, term133669.getClass(), "adjList", null);
        setField(term133669, term133669.getClass(), "adjPos", null);
        setField(term133669, term133669.getClass(), "vertexWeight", null);
        setIntField(term133669, term133669.getClass(), "vertexDataSize", 0);
        setField(term133669, term133669.getClass(), "edgeData", null);
        setIntField(term133669, term133669.getClass(), "edgeDataSize", 0);
        setField(term133669, term133669.getClass(), "vertexLabel", null);
        setField(term133669, term133669.getClass(), "edgeLabel", null);
        setField(term133669, term133669.getClass(), "vertexIndex", null);
        setField(term133669, term133669.getClass(), "adjSet", null);
        setField(term133669, term133669.getClass(), "adjMap", null);
        setField(term133669, term133669.getClass(), "maxVertexNumber", null);
        setField(term133669, term133669.getClass(), "labelVertexMap", null);
        setField(term133669, term133669.getClass(), "labelEdgeMap", null);
        setBooleanField(term133669, term133669.getClass(), "directed", false);
        setBooleanField(term133669, term133669.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133669, term133669.getClass(), "allowingSelfLoops", false);
        setIntField(term133669, term133669.getClass(), "avgDegree", 0);
        setBooleanField(term133669, term133669.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term133669, args);
    }

};


