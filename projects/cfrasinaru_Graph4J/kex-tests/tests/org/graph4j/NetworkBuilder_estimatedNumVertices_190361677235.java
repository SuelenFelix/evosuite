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
     Object term65994;
     Object term66002;

    public NetworkBuilder_estimatedNumVertices_190361677235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65994 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65994, term65994.getClass(), "source", 0);
        setIntField(term65994, term65994.getClass(), "sink", 0);
        setField(term65994, term65994.getClass(), "vertices", null);
        setField(term65994, term65994.getClass(), "dynamicVertices", null);
        setField(term65994, term65994.getClass(), "vertexLabelMap", null);
        setField(term65994, term65994.getClass(), "vertexWeightMap", null);
        setField(term65994, term65994.getClass(), "maxVertices", null);
        setField(term65994, term65994.getClass(), "numEdges", null);
        setField(term65994, term65994.getClass(), "avgDegree", null);
        setField(term65994, term65994.getClass(), "density", null);
        setBooleanField(term65994, term65994.getClass(), "directed", false);
        setBooleanField(term65994, term65994.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65994, term65994.getClass(), "allowingMultiEdges", false);
        setIntField(term65994, term65994.getClass(), "vertexDataSize", 0);
        setIntField(term65994, term65994.getClass(), "edgeDataSize", 0);
        setField(term65994, term65994.getClass(), "name", null);
        setField(term65994, term65994.getClass(), "edges", null);
        setField(term65994, term65994.getClass(), "paths", null);
        setField(term65994, term65994.getClass(), "cycles", null);
        setField(term65994, term65994.getClass(), "cliques", null);
        term66002 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66002;
        callMethod(klass, "estimatedNumVertices", argTypes, term65994, args);
    }

};


