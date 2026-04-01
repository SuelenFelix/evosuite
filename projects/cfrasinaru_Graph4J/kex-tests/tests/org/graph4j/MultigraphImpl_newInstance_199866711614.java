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
     Object term127278;

    public MultigraphImpl_newInstance_199866711614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127278 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127278, term127278.getClass(), "name", null);
        setIntField(term127278, term127278.getClass(), "maxVertices", 0);
        setIntField(term127278, term127278.getClass(), "numVertices", 0);
        setLongField(term127278, term127278.getClass(), "numEdges", 0L);
        setField(term127278, term127278.getClass(), "vertices", null);
        setField(term127278, term127278.getClass(), "degree", null);
        setField(term127278, term127278.getClass(), "adjList", null);
        setField(term127278, term127278.getClass(), "adjPos", null);
        setField(term127278, term127278.getClass(), "vertexWeight", null);
        setIntField(term127278, term127278.getClass(), "vertexDataSize", 0);
        setField(term127278, term127278.getClass(), "edgeData", null);
        setIntField(term127278, term127278.getClass(), "edgeDataSize", 0);
        setField(term127278, term127278.getClass(), "vertexLabel", null);
        setField(term127278, term127278.getClass(), "edgeLabel", null);
        setField(term127278, term127278.getClass(), "vertexIndex", null);
        setField(term127278, term127278.getClass(), "adjSet", null);
        setField(term127278, term127278.getClass(), "adjMap", null);
        setField(term127278, term127278.getClass(), "maxVertexNumber", null);
        setField(term127278, term127278.getClass(), "labelVertexMap", null);
        setField(term127278, term127278.getClass(), "labelEdgeMap", null);
        setBooleanField(term127278, term127278.getClass(), "directed", false);
        setBooleanField(term127278, term127278.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127278, term127278.getClass(), "allowingSelfLoops", false);
        setIntField(term127278, term127278.getClass(), "avgDegree", 0);
        setBooleanField(term127278, term127278.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term127278, args);
    }

};


