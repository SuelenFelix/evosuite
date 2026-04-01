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
import java.lang.Double;

public class NetworkBuilder_estimatedDensity_206317862832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65961;
     Object term65969;

    public NetworkBuilder_estimatedDensity_206317862832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65961 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65961, term65961.getClass(), "source", 0);
        setIntField(term65961, term65961.getClass(), "sink", 0);
        setField(term65961, term65961.getClass(), "vertices", null);
        setField(term65961, term65961.getClass(), "dynamicVertices", null);
        setField(term65961, term65961.getClass(), "vertexLabelMap", null);
        setField(term65961, term65961.getClass(), "vertexWeightMap", null);
        setField(term65961, term65961.getClass(), "maxVertices", null);
        setField(term65961, term65961.getClass(), "numEdges", null);
        setField(term65961, term65961.getClass(), "avgDegree", null);
        setField(term65961, term65961.getClass(), "density", null);
        setBooleanField(term65961, term65961.getClass(), "directed", false);
        setBooleanField(term65961, term65961.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65961, term65961.getClass(), "allowingMultiEdges", false);
        setIntField(term65961, term65961.getClass(), "vertexDataSize", 0);
        setIntField(term65961, term65961.getClass(), "edgeDataSize", 0);
        setField(term65961, term65961.getClass(), "name", null);
        setField(term65961, term65961.getClass(), "edges", null);
        setField(term65961, term65961.getClass(), "paths", null);
        setField(term65961, term65961.getClass(), "cycles", null);
        setField(term65961, term65961.getClass(), "cliques", null);
        term65969 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term65969;
        callMethod(klass, "estimatedDensity", argTypes, term65961, args);
    }

};


