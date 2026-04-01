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

public class NetworkBuilder_estimatedNumVertices_190361677235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65991;
     Object term65999;

    public NetworkBuilder_estimatedNumVertices_190361677235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65991 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65991, term65991.getClass(), "source", 0);
        setIntField(term65991, term65991.getClass(), "sink", 0);
        setField(term65991, term65991.getClass(), "vertices", null);
        setField(term65991, term65991.getClass(), "dynamicVertices", null);
        setField(term65991, term65991.getClass(), "vertexLabelMap", null);
        setField(term65991, term65991.getClass(), "vertexWeightMap", null);
        setField(term65991, term65991.getClass(), "maxVertices", null);
        setField(term65991, term65991.getClass(), "numEdges", null);
        setField(term65991, term65991.getClass(), "avgDegree", null);
        setField(term65991, term65991.getClass(), "density", null);
        setBooleanField(term65991, term65991.getClass(), "directed", false);
        setBooleanField(term65991, term65991.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65991, term65991.getClass(), "allowingMultiEdges", false);
        setIntField(term65991, term65991.getClass(), "vertexDataSize", 0);
        setIntField(term65991, term65991.getClass(), "edgeDataSize", 0);
        setField(term65991, term65991.getClass(), "name", null);
        setField(term65991, term65991.getClass(), "edges", null);
        setField(term65991, term65991.getClass(), "paths", null);
        setField(term65991, term65991.getClass(), "cycles", null);
        setField(term65991, term65991.getClass(), "cliques", null);
        term65999 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65999;
        callMethod(klass, "estimatedNumVertices", argTypes, term65991, args);
    }

};


