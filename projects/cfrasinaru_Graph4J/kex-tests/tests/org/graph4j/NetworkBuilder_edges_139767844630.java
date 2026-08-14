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

public class NetworkBuilder_edges_139767844630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65948;

    public NetworkBuilder_edges_139767844630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65948 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65948, term65948.getClass(), "source", 0);
        setIntField(term65948, term65948.getClass(), "sink", 0);
        setField(term65948, term65948.getClass(), "vertices", null);
        setField(term65948, term65948.getClass(), "dynamicVertices", null);
        setField(term65948, term65948.getClass(), "vertexLabelMap", null);
        setField(term65948, term65948.getClass(), "vertexWeightMap", null);
        setField(term65948, term65948.getClass(), "maxVertices", null);
        setField(term65948, term65948.getClass(), "numEdges", null);
        setField(term65948, term65948.getClass(), "avgDegree", null);
        setField(term65948, term65948.getClass(), "density", null);
        setBooleanField(term65948, term65948.getClass(), "directed", false);
        setBooleanField(term65948, term65948.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65948, term65948.getClass(), "allowingMultiEdges", false);
        setIntField(term65948, term65948.getClass(), "vertexDataSize", 0);
        setIntField(term65948, term65948.getClass(), "edgeDataSize", 0);
        setField(term65948, term65948.getClass(), "name", null);
        setField(term65948, term65948.getClass(), "edges", null);
        setField(term65948, term65948.getClass(), "paths", null);
        setField(term65948, term65948.getClass(), "cycles", null);
        setField(term65948, term65948.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "edges", argTypes, term65948, args);
    }

};


