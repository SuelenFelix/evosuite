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
import java.lang.Long;

public class NetworkBuilder_estimatedNumEdges_64295108534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65984;
     Object term65992;

    public NetworkBuilder_estimatedNumEdges_64295108534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65984 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65984, term65984.getClass(), "source", 0);
        setIntField(term65984, term65984.getClass(), "sink", 0);
        setField(term65984, term65984.getClass(), "vertices", null);
        setField(term65984, term65984.getClass(), "dynamicVertices", null);
        setField(term65984, term65984.getClass(), "vertexLabelMap", null);
        setField(term65984, term65984.getClass(), "vertexWeightMap", null);
        setField(term65984, term65984.getClass(), "maxVertices", null);
        setField(term65984, term65984.getClass(), "numEdges", null);
        setField(term65984, term65984.getClass(), "avgDegree", null);
        setField(term65984, term65984.getClass(), "density", null);
        setBooleanField(term65984, term65984.getClass(), "directed", false);
        setBooleanField(term65984, term65984.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65984, term65984.getClass(), "allowingMultiEdges", false);
        setIntField(term65984, term65984.getClass(), "vertexDataSize", 0);
        setIntField(term65984, term65984.getClass(), "edgeDataSize", 0);
        setField(term65984, term65984.getClass(), "name", null);
        setField(term65984, term65984.getClass(), "edges", null);
        setField(term65984, term65984.getClass(), "paths", null);
        setField(term65984, term65984.getClass(), "cycles", null);
        setField(term65984, term65984.getClass(), "cliques", null);
        term65992 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65992;
        callMethod(klass, "estimatedNumEdges", argTypes, term65984, args);
    }

};


