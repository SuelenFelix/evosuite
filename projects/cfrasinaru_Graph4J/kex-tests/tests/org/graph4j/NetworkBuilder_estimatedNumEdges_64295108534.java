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
     Object term65981;
     Object term65989;

    public NetworkBuilder_estimatedNumEdges_64295108534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65981 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65981, term65981.getClass(), "source", 0);
        setIntField(term65981, term65981.getClass(), "sink", 0);
        setField(term65981, term65981.getClass(), "vertices", null);
        setField(term65981, term65981.getClass(), "dynamicVertices", null);
        setField(term65981, term65981.getClass(), "vertexLabelMap", null);
        setField(term65981, term65981.getClass(), "vertexWeightMap", null);
        setField(term65981, term65981.getClass(), "maxVertices", null);
        setField(term65981, term65981.getClass(), "numEdges", null);
        setField(term65981, term65981.getClass(), "avgDegree", null);
        setField(term65981, term65981.getClass(), "density", null);
        setBooleanField(term65981, term65981.getClass(), "directed", false);
        setBooleanField(term65981, term65981.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65981, term65981.getClass(), "allowingMultiEdges", false);
        setIntField(term65981, term65981.getClass(), "vertexDataSize", 0);
        setIntField(term65981, term65981.getClass(), "edgeDataSize", 0);
        setField(term65981, term65981.getClass(), "name", null);
        setField(term65981, term65981.getClass(), "edges", null);
        setField(term65981, term65981.getClass(), "paths", null);
        setField(term65981, term65981.getClass(), "cycles", null);
        setField(term65981, term65981.getClass(), "cliques", null);
        term65989 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65989;
        callMethod(klass, "estimatedNumEdges", argTypes, term65981, args);
    }

};


