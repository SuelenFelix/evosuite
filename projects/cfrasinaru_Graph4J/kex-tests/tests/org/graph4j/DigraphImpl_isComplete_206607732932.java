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

public class DigraphImpl_isComplete_206607732932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172245;

    public DigraphImpl_isComplete_206607732932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172245 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172245, term172245.getClass(), "predList", null);
        setField(term172245, term172245.getClass(), "predPos", null);
        setField(term172245, term172245.getClass(), "indegree", null);
        setField(term172245, term172245.getClass(), "name", null);
        setIntField(term172245, term172245.getClass(), "maxVertices", 0);
        setIntField(term172245, term172245.getClass(), "numVertices", 0);
        setLongField(term172245, term172245.getClass(), "numEdges", 0L);
        setField(term172245, term172245.getClass(), "vertices", null);
        setField(term172245, term172245.getClass(), "degree", null);
        setField(term172245, term172245.getClass(), "adjList", null);
        setField(term172245, term172245.getClass(), "adjPos", null);
        setField(term172245, term172245.getClass(), "vertexWeight", null);
        setIntField(term172245, term172245.getClass(), "vertexDataSize", 0);
        setField(term172245, term172245.getClass(), "edgeData", null);
        setIntField(term172245, term172245.getClass(), "edgeDataSize", 0);
        setField(term172245, term172245.getClass(), "vertexLabel", null);
        setField(term172245, term172245.getClass(), "edgeLabel", null);
        setField(term172245, term172245.getClass(), "vertexIndex", null);
        setField(term172245, term172245.getClass(), "adjSet", null);
        setField(term172245, term172245.getClass(), "adjMap", null);
        setField(term172245, term172245.getClass(), "maxVertexNumber", null);
        setField(term172245, term172245.getClass(), "labelVertexMap", null);
        setField(term172245, term172245.getClass(), "labelEdgeMap", null);
        setBooleanField(term172245, term172245.getClass(), "directed", false);
        setBooleanField(term172245, term172245.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172245, term172245.getClass(), "allowingSelfLoops", false);
        setIntField(term172245, term172245.getClass(), "avgDegree", 0);
        setBooleanField(term172245, term172245.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term172245, args);
    }

};


