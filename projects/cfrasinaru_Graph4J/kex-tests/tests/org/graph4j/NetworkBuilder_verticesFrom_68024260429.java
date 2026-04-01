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

public class NetworkBuilder_verticesFrom_68024260429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65937;

    public NetworkBuilder_verticesFrom_68024260429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65937 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65937, term65937.getClass(), "source", 0);
        setIntField(term65937, term65937.getClass(), "sink", 0);
        setField(term65937, term65937.getClass(), "vertices", null);
        setField(term65937, term65937.getClass(), "dynamicVertices", null);
        setField(term65937, term65937.getClass(), "vertexLabelMap", null);
        setField(term65937, term65937.getClass(), "vertexWeightMap", null);
        setField(term65937, term65937.getClass(), "maxVertices", null);
        setField(term65937, term65937.getClass(), "numEdges", null);
        setField(term65937, term65937.getClass(), "avgDegree", null);
        setField(term65937, term65937.getClass(), "density", null);
        setBooleanField(term65937, term65937.getClass(), "directed", false);
        setBooleanField(term65937, term65937.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65937, term65937.getClass(), "allowingMultiEdges", false);
        setIntField(term65937, term65937.getClass(), "vertexDataSize", 0);
        setIntField(term65937, term65937.getClass(), "edgeDataSize", 0);
        setField(term65937, term65937.getClass(), "name", null);
        setField(term65937, term65937.getClass(), "edges", null);
        setField(term65937, term65937.getClass(), "paths", null);
        setField(term65937, term65937.getClass(), "cycles", null);
        setField(term65937, term65937.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "verticesFrom", argTypes, term65937, args);
    }

};


