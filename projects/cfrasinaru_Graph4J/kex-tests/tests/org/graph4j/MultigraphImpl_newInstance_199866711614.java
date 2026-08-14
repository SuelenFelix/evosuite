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

public class MultigraphImpl_newInstance_199866711614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127281;

    public MultigraphImpl_newInstance_199866711614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127281 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127281, term127281.getClass(), "name", null);
        setIntField(term127281, term127281.getClass(), "maxVertices", 0);
        setIntField(term127281, term127281.getClass(), "numVertices", 0);
        setLongField(term127281, term127281.getClass(), "numEdges", 0L);
        setField(term127281, term127281.getClass(), "vertices", null);
        setField(term127281, term127281.getClass(), "degree", null);
        setField(term127281, term127281.getClass(), "adjList", null);
        setField(term127281, term127281.getClass(), "adjPos", null);
        setField(term127281, term127281.getClass(), "vertexWeight", null);
        setIntField(term127281, term127281.getClass(), "vertexDataSize", 0);
        setField(term127281, term127281.getClass(), "edgeData", null);
        setIntField(term127281, term127281.getClass(), "edgeDataSize", 0);
        setField(term127281, term127281.getClass(), "vertexLabel", null);
        setField(term127281, term127281.getClass(), "edgeLabel", null);
        setField(term127281, term127281.getClass(), "vertexIndex", null);
        setField(term127281, term127281.getClass(), "adjSet", null);
        setField(term127281, term127281.getClass(), "adjMap", null);
        setField(term127281, term127281.getClass(), "maxVertexNumber", null);
        setField(term127281, term127281.getClass(), "labelVertexMap", null);
        setField(term127281, term127281.getClass(), "labelEdgeMap", null);
        setBooleanField(term127281, term127281.getClass(), "directed", false);
        setBooleanField(term127281, term127281.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127281, term127281.getClass(), "allowingSelfLoops", false);
        setIntField(term127281, term127281.getClass(), "avgDegree", 0);
        setBooleanField(term127281, term127281.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term127281, args);
    }

};


