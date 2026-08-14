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

public class DigraphImpl_newInstance_36687744729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172198;

    public DigraphImpl_newInstance_36687744729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172198 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172198, term172198.getClass(), "predList", null);
        setField(term172198, term172198.getClass(), "predPos", null);
        setField(term172198, term172198.getClass(), "indegree", null);
        setField(term172198, term172198.getClass(), "name", null);
        setIntField(term172198, term172198.getClass(), "maxVertices", 0);
        setIntField(term172198, term172198.getClass(), "numVertices", 0);
        setLongField(term172198, term172198.getClass(), "numEdges", 0L);
        setField(term172198, term172198.getClass(), "vertices", null);
        setField(term172198, term172198.getClass(), "degree", null);
        setField(term172198, term172198.getClass(), "adjList", null);
        setField(term172198, term172198.getClass(), "adjPos", null);
        setField(term172198, term172198.getClass(), "vertexWeight", null);
        setIntField(term172198, term172198.getClass(), "vertexDataSize", 0);
        setField(term172198, term172198.getClass(), "edgeData", null);
        setIntField(term172198, term172198.getClass(), "edgeDataSize", 0);
        setField(term172198, term172198.getClass(), "vertexLabel", null);
        setField(term172198, term172198.getClass(), "edgeLabel", null);
        setField(term172198, term172198.getClass(), "vertexIndex", null);
        setField(term172198, term172198.getClass(), "adjSet", null);
        setField(term172198, term172198.getClass(), "adjMap", null);
        setField(term172198, term172198.getClass(), "maxVertexNumber", null);
        setField(term172198, term172198.getClass(), "labelVertexMap", null);
        setField(term172198, term172198.getClass(), "labelEdgeMap", null);
        setBooleanField(term172198, term172198.getClass(), "directed", false);
        setBooleanField(term172198, term172198.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172198, term172198.getClass(), "allowingSelfLoops", false);
        setIntField(term172198, term172198.getClass(), "avgDegree", 0);
        setBooleanField(term172198, term172198.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term172198, args);
    }

};


