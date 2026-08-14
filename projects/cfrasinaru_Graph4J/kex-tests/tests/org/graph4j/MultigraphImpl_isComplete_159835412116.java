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

public class MultigraphImpl_isComplete_159835412116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127317;

    public MultigraphImpl_isComplete_159835412116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127317 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127317, term127317.getClass(), "name", null);
        setIntField(term127317, term127317.getClass(), "maxVertices", 0);
        setIntField(term127317, term127317.getClass(), "numVertices", 0);
        setLongField(term127317, term127317.getClass(), "numEdges", 0L);
        setField(term127317, term127317.getClass(), "vertices", null);
        setField(term127317, term127317.getClass(), "degree", null);
        setField(term127317, term127317.getClass(), "adjList", null);
        setField(term127317, term127317.getClass(), "adjPos", null);
        setField(term127317, term127317.getClass(), "vertexWeight", null);
        setIntField(term127317, term127317.getClass(), "vertexDataSize", 0);
        setField(term127317, term127317.getClass(), "edgeData", null);
        setIntField(term127317, term127317.getClass(), "edgeDataSize", 0);
        setField(term127317, term127317.getClass(), "vertexLabel", null);
        setField(term127317, term127317.getClass(), "edgeLabel", null);
        setField(term127317, term127317.getClass(), "vertexIndex", null);
        setField(term127317, term127317.getClass(), "adjSet", null);
        setField(term127317, term127317.getClass(), "adjMap", null);
        setField(term127317, term127317.getClass(), "maxVertexNumber", null);
        setField(term127317, term127317.getClass(), "labelVertexMap", null);
        setField(term127317, term127317.getClass(), "labelEdgeMap", null);
        setBooleanField(term127317, term127317.getClass(), "directed", false);
        setBooleanField(term127317, term127317.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127317, term127317.getClass(), "allowingSelfLoops", false);
        setIntField(term127317, term127317.getClass(), "avgDegree", 0);
        setBooleanField(term127317, term127317.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term127317, args);
    }

};


