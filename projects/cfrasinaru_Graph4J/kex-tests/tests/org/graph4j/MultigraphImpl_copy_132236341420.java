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
     Object term127371;
     Object term127382;
     Object term127384;
     Object term127386;
     Object term127388;
     Object term127390;

    public MultigraphImpl_copy_132236341420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127371 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127371, term127371.getClass(), "name", null);
        setIntField(term127371, term127371.getClass(), "maxVertices", 0);
        setIntField(term127371, term127371.getClass(), "numVertices", 0);
        setLongField(term127371, term127371.getClass(), "numEdges", 0L);
        setField(term127371, term127371.getClass(), "vertices", null);
        setField(term127371, term127371.getClass(), "degree", null);
        setField(term127371, term127371.getClass(), "adjList", null);
        setField(term127371, term127371.getClass(), "adjPos", null);
        setField(term127371, term127371.getClass(), "vertexWeight", null);
        setIntField(term127371, term127371.getClass(), "vertexDataSize", 0);
        setField(term127371, term127371.getClass(), "edgeData", null);
        setIntField(term127371, term127371.getClass(), "edgeDataSize", 0);
        setField(term127371, term127371.getClass(), "vertexLabel", null);
        setField(term127371, term127371.getClass(), "edgeLabel", null);
        setField(term127371, term127371.getClass(), "vertexIndex", null);
        setField(term127371, term127371.getClass(), "adjSet", null);
        setField(term127371, term127371.getClass(), "adjMap", null);
        setField(term127371, term127371.getClass(), "maxVertexNumber", null);
        setField(term127371, term127371.getClass(), "labelVertexMap", null);
        setField(term127371, term127371.getClass(), "labelEdgeMap", null);
        setBooleanField(term127371, term127371.getClass(), "directed", false);
        setBooleanField(term127371, term127371.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127371, term127371.getClass(), "allowingSelfLoops", false);
        setIntField(term127371, term127371.getClass(), "avgDegree", 0);
        setBooleanField(term127371, term127371.getClass(), "safeMode", false);
        term127382 = new Boolean(false);
        term127384 = new Boolean(false);
        term127386 = new Boolean(false);
        term127388 = new Boolean(false);
        term127390 = new Boolean(false);
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
        args[0] = term127382;
        args[1] = term127384;
        args[2] = term127386;
        args[3] = term127388;
        args[4] = term127390;
        callMethod(klass, "copy", argTypes, term127371, args);
    }

};


