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

public class NetworkImpl_copy_59575239428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97301;
     Object term97314;
     Object term97316;
     Object term97318;
     Object term97320;
     Object term97322;

    public NetworkImpl_copy_59575239428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97301 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97301, term97301.getClass(), "source", 0);
        setIntField(term97301, term97301.getClass(), "sink", 0);
        setField(term97301, term97301.getClass(), "predList", null);
        setField(term97301, term97301.getClass(), "predPos", null);
        setField(term97301, term97301.getClass(), "indegree", null);
        setField(term97301, term97301.getClass(), "name", null);
        setIntField(term97301, term97301.getClass(), "maxVertices", 0);
        setIntField(term97301, term97301.getClass(), "numVertices", 0);
        setLongField(term97301, term97301.getClass(), "numEdges", 0L);
        setField(term97301, term97301.getClass(), "vertices", null);
        setField(term97301, term97301.getClass(), "degree", null);
        setField(term97301, term97301.getClass(), "adjList", null);
        setField(term97301, term97301.getClass(), "adjPos", null);
        setField(term97301, term97301.getClass(), "vertexWeight", null);
        setIntField(term97301, term97301.getClass(), "vertexDataSize", 0);
        setField(term97301, term97301.getClass(), "edgeData", null);
        setIntField(term97301, term97301.getClass(), "edgeDataSize", 0);
        setField(term97301, term97301.getClass(), "vertexLabel", null);
        setField(term97301, term97301.getClass(), "edgeLabel", null);
        setField(term97301, term97301.getClass(), "vertexIndex", null);
        setField(term97301, term97301.getClass(), "adjSet", null);
        setField(term97301, term97301.getClass(), "adjMap", null);
        setField(term97301, term97301.getClass(), "maxVertexNumber", null);
        setField(term97301, term97301.getClass(), "labelVertexMap", null);
        setField(term97301, term97301.getClass(), "labelEdgeMap", null);
        setBooleanField(term97301, term97301.getClass(), "directed", false);
        setBooleanField(term97301, term97301.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97301, term97301.getClass(), "allowingSelfLoops", false);
        setIntField(term97301, term97301.getClass(), "avgDegree", 0);
        setBooleanField(term97301, term97301.getClass(), "safeMode", false);
        term97314 = new Boolean(false);
        term97316 = new Boolean(false);
        term97318 = new Boolean(false);
        term97320 = new Boolean(false);
        term97322 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term97314;
        args[1] = term97316;
        args[2] = term97318;
        args[3] = term97320;
        args[4] = term97322;
        callMethod(klass, "copy", argTypes, term97301, args);
    }

};


