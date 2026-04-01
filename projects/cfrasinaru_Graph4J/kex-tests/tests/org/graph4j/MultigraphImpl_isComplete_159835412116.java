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
     Object term127314;

    public MultigraphImpl_isComplete_159835412116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127314 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127314, term127314.getClass(), "name", null);
        setIntField(term127314, term127314.getClass(), "maxVertices", 0);
        setIntField(term127314, term127314.getClass(), "numVertices", 0);
        setLongField(term127314, term127314.getClass(), "numEdges", 0L);
        setField(term127314, term127314.getClass(), "vertices", null);
        setField(term127314, term127314.getClass(), "degree", null);
        setField(term127314, term127314.getClass(), "adjList", null);
        setField(term127314, term127314.getClass(), "adjPos", null);
        setField(term127314, term127314.getClass(), "vertexWeight", null);
        setIntField(term127314, term127314.getClass(), "vertexDataSize", 0);
        setField(term127314, term127314.getClass(), "edgeData", null);
        setIntField(term127314, term127314.getClass(), "edgeDataSize", 0);
        setField(term127314, term127314.getClass(), "vertexLabel", null);
        setField(term127314, term127314.getClass(), "edgeLabel", null);
        setField(term127314, term127314.getClass(), "vertexIndex", null);
        setField(term127314, term127314.getClass(), "adjSet", null);
        setField(term127314, term127314.getClass(), "adjMap", null);
        setField(term127314, term127314.getClass(), "maxVertexNumber", null);
        setField(term127314, term127314.getClass(), "labelVertexMap", null);
        setField(term127314, term127314.getClass(), "labelEdgeMap", null);
        setBooleanField(term127314, term127314.getClass(), "directed", false);
        setBooleanField(term127314, term127314.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127314, term127314.getClass(), "allowingSelfLoops", false);
        setIntField(term127314, term127314.getClass(), "avgDegree", 0);
        setBooleanField(term127314, term127314.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term127314, args);
    }

};


