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

public class DigraphImpl_indegrees_61292945443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172403;

    public DigraphImpl_indegrees_61292945443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172403 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172403, term172403.getClass(), "predList", null);
        setField(term172403, term172403.getClass(), "predPos", null);
        setField(term172403, term172403.getClass(), "indegree", null);
        setField(term172403, term172403.getClass(), "name", null);
        setIntField(term172403, term172403.getClass(), "maxVertices", 0);
        setIntField(term172403, term172403.getClass(), "numVertices", 0);
        setLongField(term172403, term172403.getClass(), "numEdges", 0L);
        setField(term172403, term172403.getClass(), "vertices", null);
        setField(term172403, term172403.getClass(), "degree", null);
        setField(term172403, term172403.getClass(), "adjList", null);
        setField(term172403, term172403.getClass(), "adjPos", null);
        setField(term172403, term172403.getClass(), "vertexWeight", null);
        setIntField(term172403, term172403.getClass(), "vertexDataSize", 0);
        setField(term172403, term172403.getClass(), "edgeData", null);
        setIntField(term172403, term172403.getClass(), "edgeDataSize", 0);
        setField(term172403, term172403.getClass(), "vertexLabel", null);
        setField(term172403, term172403.getClass(), "edgeLabel", null);
        setField(term172403, term172403.getClass(), "vertexIndex", null);
        setField(term172403, term172403.getClass(), "adjSet", null);
        setField(term172403, term172403.getClass(), "adjMap", null);
        setField(term172403, term172403.getClass(), "maxVertexNumber", null);
        setField(term172403, term172403.getClass(), "labelVertexMap", null);
        setField(term172403, term172403.getClass(), "labelEdgeMap", null);
        setBooleanField(term172403, term172403.getClass(), "directed", false);
        setBooleanField(term172403, term172403.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172403, term172403.getClass(), "allowingSelfLoops", false);
        setIntField(term172403, term172403.getClass(), "avgDegree", 0);
        setBooleanField(term172403, term172403.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "indegrees", argTypes, term172403, args);
    }

};


