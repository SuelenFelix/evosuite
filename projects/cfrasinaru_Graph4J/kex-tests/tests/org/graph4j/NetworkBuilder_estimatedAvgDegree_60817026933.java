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

public class NetworkBuilder_estimatedAvgDegree_60817026933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65971;
     Object term65979;

    public NetworkBuilder_estimatedAvgDegree_60817026933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65971 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65971, term65971.getClass(), "source", 0);
        setIntField(term65971, term65971.getClass(), "sink", 0);
        setField(term65971, term65971.getClass(), "vertices", null);
        setField(term65971, term65971.getClass(), "dynamicVertices", null);
        setField(term65971, term65971.getClass(), "vertexLabelMap", null);
        setField(term65971, term65971.getClass(), "vertexWeightMap", null);
        setField(term65971, term65971.getClass(), "maxVertices", null);
        setField(term65971, term65971.getClass(), "numEdges", null);
        setField(term65971, term65971.getClass(), "avgDegree", null);
        setField(term65971, term65971.getClass(), "density", null);
        setBooleanField(term65971, term65971.getClass(), "directed", false);
        setBooleanField(term65971, term65971.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65971, term65971.getClass(), "allowingMultiEdges", false);
        setIntField(term65971, term65971.getClass(), "vertexDataSize", 0);
        setIntField(term65971, term65971.getClass(), "edgeDataSize", 0);
        setField(term65971, term65971.getClass(), "name", null);
        setField(term65971, term65971.getClass(), "edges", null);
        setField(term65971, term65971.getClass(), "paths", null);
        setField(term65971, term65971.getClass(), "cycles", null);
        setField(term65971, term65971.getClass(), "cliques", null);
        term65979 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65979;
        callMethod(klass, "estimatedAvgDegree", argTypes, term65971, args);
    }

};


