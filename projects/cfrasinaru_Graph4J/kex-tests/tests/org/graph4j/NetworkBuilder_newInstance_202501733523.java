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

public class NetworkBuilder_newInstance_202501733523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65886;

    public NetworkBuilder_newInstance_202501733523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65886 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65886, term65886.getClass(), "source", 0);
        setIntField(term65886, term65886.getClass(), "sink", 0);
        setField(term65886, term65886.getClass(), "vertices", null);
        setField(term65886, term65886.getClass(), "dynamicVertices", null);
        setField(term65886, term65886.getClass(), "vertexLabelMap", null);
        setField(term65886, term65886.getClass(), "vertexWeightMap", null);
        setField(term65886, term65886.getClass(), "maxVertices", null);
        setField(term65886, term65886.getClass(), "numEdges", null);
        setField(term65886, term65886.getClass(), "avgDegree", null);
        setField(term65886, term65886.getClass(), "density", null);
        setBooleanField(term65886, term65886.getClass(), "directed", false);
        setBooleanField(term65886, term65886.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65886, term65886.getClass(), "allowingMultiEdges", false);
        setIntField(term65886, term65886.getClass(), "vertexDataSize", 0);
        setIntField(term65886, term65886.getClass(), "edgeDataSize", 0);
        setField(term65886, term65886.getClass(), "name", null);
        setField(term65886, term65886.getClass(), "edges", null);
        setField(term65886, term65886.getClass(), "paths", null);
        setField(term65886, term65886.getClass(), "cycles", null);
        setField(term65886, term65886.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term65886, args);
    }

};


