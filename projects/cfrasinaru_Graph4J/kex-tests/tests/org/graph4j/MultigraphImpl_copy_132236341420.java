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
import java.lang.Boolean;

public class MultigraphImpl_copy_132236341420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127368;
     Object term127379;
     Object term127381;
     Object term127383;
     Object term127385;
     Object term127387;

    public MultigraphImpl_copy_132236341420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127368 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127368, term127368.getClass(), "name", null);
        setIntField(term127368, term127368.getClass(), "maxVertices", 0);
        setIntField(term127368, term127368.getClass(), "numVertices", 0);
        setLongField(term127368, term127368.getClass(), "numEdges", 0L);
        setField(term127368, term127368.getClass(), "vertices", null);
        setField(term127368, term127368.getClass(), "degree", null);
        setField(term127368, term127368.getClass(), "adjList", null);
        setField(term127368, term127368.getClass(), "adjPos", null);
        setField(term127368, term127368.getClass(), "vertexWeight", null);
        setIntField(term127368, term127368.getClass(), "vertexDataSize", 0);
        setField(term127368, term127368.getClass(), "edgeData", null);
        setIntField(term127368, term127368.getClass(), "edgeDataSize", 0);
        setField(term127368, term127368.getClass(), "vertexLabel", null);
        setField(term127368, term127368.getClass(), "edgeLabel", null);
        setField(term127368, term127368.getClass(), "vertexIndex", null);
        setField(term127368, term127368.getClass(), "adjSet", null);
        setField(term127368, term127368.getClass(), "adjMap", null);
        setField(term127368, term127368.getClass(), "maxVertexNumber", null);
        setField(term127368, term127368.getClass(), "labelVertexMap", null);
        setField(term127368, term127368.getClass(), "labelEdgeMap", null);
        setBooleanField(term127368, term127368.getClass(), "directed", false);
        setBooleanField(term127368, term127368.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127368, term127368.getClass(), "allowingSelfLoops", false);
        setIntField(term127368, term127368.getClass(), "avgDegree", 0);
        setBooleanField(term127368, term127368.getClass(), "safeMode", false);
        term127379 = new Boolean(false);
        term127381 = new Boolean(false);
        term127383 = new Boolean(false);
        term127385 = new Boolean(false);
        term127387 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term127379;
        args[1] = term127381;
        args[2] = term127383;
        args[3] = term127385;
        args[4] = term127387;
        callMethod(klass, "copy", argTypes, term127368, args);
    }

};


