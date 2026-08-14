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
import java.lang.Integer;

public class NetworkBuilder_numVertices_25801161625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65902;
     Object term65910;

    public NetworkBuilder_numVertices_25801161625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65902 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65902, term65902.getClass(), "source", 0);
        setIntField(term65902, term65902.getClass(), "sink", 0);
        setField(term65902, term65902.getClass(), "vertices", null);
        setField(term65902, term65902.getClass(), "dynamicVertices", null);
        setField(term65902, term65902.getClass(), "vertexLabelMap", null);
        setField(term65902, term65902.getClass(), "vertexWeightMap", null);
        setField(term65902, term65902.getClass(), "maxVertices", null);
        setField(term65902, term65902.getClass(), "numEdges", null);
        setField(term65902, term65902.getClass(), "avgDegree", null);
        setField(term65902, term65902.getClass(), "density", null);
        setBooleanField(term65902, term65902.getClass(), "directed", false);
        setBooleanField(term65902, term65902.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65902, term65902.getClass(), "allowingMultiEdges", false);
        setIntField(term65902, term65902.getClass(), "vertexDataSize", 0);
        setIntField(term65902, term65902.getClass(), "edgeDataSize", 0);
        setField(term65902, term65902.getClass(), "name", null);
        setField(term65902, term65902.getClass(), "edges", null);
        setField(term65902, term65902.getClass(), "paths", null);
        setField(term65902, term65902.getClass(), "cycles", null);
        setField(term65902, term65902.getClass(), "cliques", null);
        term65910 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65910;
        callMethod(klass, "numVertices", argTypes, term65902, args);
    }

};


