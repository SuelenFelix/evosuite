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
     Object term65974;
     Object term65982;

    public NetworkBuilder_estimatedAvgDegree_60817026933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65974 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term65974, term65974.getClass(), "source", 0);
        setIntField(term65974, term65974.getClass(), "sink", 0);
        setField(term65974, term65974.getClass(), "vertices", null);
        setField(term65974, term65974.getClass(), "dynamicVertices", null);
        setField(term65974, term65974.getClass(), "vertexLabelMap", null);
        setField(term65974, term65974.getClass(), "vertexWeightMap", null);
        setField(term65974, term65974.getClass(), "maxVertices", null);
        setField(term65974, term65974.getClass(), "numEdges", null);
        setField(term65974, term65974.getClass(), "avgDegree", null);
        setField(term65974, term65974.getClass(), "density", null);
        setBooleanField(term65974, term65974.getClass(), "directed", false);
        setBooleanField(term65974, term65974.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65974, term65974.getClass(), "allowingMultiEdges", false);
        setIntField(term65974, term65974.getClass(), "vertexDataSize", 0);
        setIntField(term65974, term65974.getClass(), "edgeDataSize", 0);
        setField(term65974, term65974.getClass(), "name", null);
        setField(term65974, term65974.getClass(), "edges", null);
        setField(term65974, term65974.getClass(), "paths", null);
        setField(term65974, term65974.getClass(), "cycles", null);
        setField(term65974, term65974.getClass(), "cliques", null);
        term65982 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65982;
        callMethod(klass, "estimatedAvgDegree", argTypes, term65974, args);
    }

};


