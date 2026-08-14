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

public class NetworkBuilder_labeledVertices_211719757428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65932;

    public NetworkBuilder_labeledVertices_211719757428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65932 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65932, term65932.getClass(), "source", 0);
        setIntField(term65932, term65932.getClass(), "sink", 0);
        setField(term65932, term65932.getClass(), "vertices", null);
        setField(term65932, term65932.getClass(), "dynamicVertices", null);
        setField(term65932, term65932.getClass(), "vertexLabelMap", null);
        setField(term65932, term65932.getClass(), "vertexWeightMap", null);
        setField(term65932, term65932.getClass(), "maxVertices", null);
        setField(term65932, term65932.getClass(), "numEdges", null);
        setField(term65932, term65932.getClass(), "avgDegree", null);
        setField(term65932, term65932.getClass(), "density", null);
        setBooleanField(term65932, term65932.getClass(), "directed", false);
        setBooleanField(term65932, term65932.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65932, term65932.getClass(), "allowingMultiEdges", false);
        setIntField(term65932, term65932.getClass(), "vertexDataSize", 0);
        setIntField(term65932, term65932.getClass(), "edgeDataSize", 0);
        setField(term65932, term65932.getClass(), "name", null);
        setField(term65932, term65932.getClass(), "edges", null);
        setField(term65932, term65932.getClass(), "paths", null);
        setField(term65932, term65932.getClass(), "cycles", null);
        setField(term65932, term65932.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "labeledVertices", argTypes, term65932, args);
    }

};


