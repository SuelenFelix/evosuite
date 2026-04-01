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

public class NetworkBuilder_vertexRange_31702413626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65909;
     Object term65917;
     Object term65919;

    public NetworkBuilder_vertexRange_31702413626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65909 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65909, term65909.getClass(), "source", 0);
        setIntField(term65909, term65909.getClass(), "sink", 0);
        setField(term65909, term65909.getClass(), "vertices", null);
        setField(term65909, term65909.getClass(), "dynamicVertices", null);
        setField(term65909, term65909.getClass(), "vertexLabelMap", null);
        setField(term65909, term65909.getClass(), "vertexWeightMap", null);
        setField(term65909, term65909.getClass(), "maxVertices", null);
        setField(term65909, term65909.getClass(), "numEdges", null);
        setField(term65909, term65909.getClass(), "avgDegree", null);
        setField(term65909, term65909.getClass(), "density", null);
        setBooleanField(term65909, term65909.getClass(), "directed", false);
        setBooleanField(term65909, term65909.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65909, term65909.getClass(), "allowingMultiEdges", false);
        setIntField(term65909, term65909.getClass(), "vertexDataSize", 0);
        setIntField(term65909, term65909.getClass(), "edgeDataSize", 0);
        setField(term65909, term65909.getClass(), "name", null);
        setField(term65909, term65909.getClass(), "edges", null);
        setField(term65909, term65909.getClass(), "paths", null);
        setField(term65909, term65909.getClass(), "cycles", null);
        setField(term65909, term65909.getClass(), "cliques", null);
        term65917 = new Integer(0);
        term65919 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term65917;
        args[1] = term65919;
        callMethod(klass, "vertexRange", argTypes, term65909, args);
    }

};


