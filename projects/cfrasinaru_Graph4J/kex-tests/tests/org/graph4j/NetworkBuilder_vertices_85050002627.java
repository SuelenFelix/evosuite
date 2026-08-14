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

public class NetworkBuilder_vertices_85050002627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65924;

    public NetworkBuilder_vertices_85050002627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65924 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65924, term65924.getClass(), "source", 0);
        setIntField(term65924, term65924.getClass(), "sink", 0);
        setField(term65924, term65924.getClass(), "vertices", null);
        setField(term65924, term65924.getClass(), "dynamicVertices", null);
        setField(term65924, term65924.getClass(), "vertexLabelMap", null);
        setField(term65924, term65924.getClass(), "vertexWeightMap", null);
        setField(term65924, term65924.getClass(), "maxVertices", null);
        setField(term65924, term65924.getClass(), "numEdges", null);
        setField(term65924, term65924.getClass(), "avgDegree", null);
        setField(term65924, term65924.getClass(), "density", null);
        setBooleanField(term65924, term65924.getClass(), "directed", false);
        setBooleanField(term65924, term65924.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65924, term65924.getClass(), "allowingMultiEdges", false);
        setIntField(term65924, term65924.getClass(), "vertexDataSize", 0);
        setIntField(term65924, term65924.getClass(), "edgeDataSize", 0);
        setField(term65924, term65924.getClass(), "name", null);
        setField(term65924, term65924.getClass(), "edges", null);
        setField(term65924, term65924.getClass(), "paths", null);
        setField(term65924, term65924.getClass(), "cycles", null);
        setField(term65924, term65924.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "vertices", argTypes, term65924, args);
    }

};


