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

public class NetworkBuilder_build_75135843441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66052;

    public NetworkBuilder_build_75135843441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66052 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66052, term66052.getClass(), "source", 0);
        setIntField(term66052, term66052.getClass(), "sink", 0);
        setField(term66052, term66052.getClass(), "vertices", null);
        setField(term66052, term66052.getClass(), "dynamicVertices", null);
        setField(term66052, term66052.getClass(), "vertexLabelMap", null);
        setField(term66052, term66052.getClass(), "vertexWeightMap", null);
        setField(term66052, term66052.getClass(), "maxVertices", null);
        setField(term66052, term66052.getClass(), "numEdges", null);
        setField(term66052, term66052.getClass(), "avgDegree", null);
        setField(term66052, term66052.getClass(), "density", null);
        setBooleanField(term66052, term66052.getClass(), "directed", false);
        setBooleanField(term66052, term66052.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66052, term66052.getClass(), "allowingMultiEdges", false);
        setIntField(term66052, term66052.getClass(), "vertexDataSize", 0);
        setIntField(term66052, term66052.getClass(), "edgeDataSize", 0);
        setField(term66052, term66052.getClass(), "name", null);
        setField(term66052, term66052.getClass(), "edges", null);
        setField(term66052, term66052.getClass(), "paths", null);
        setField(term66052, term66052.getClass(), "cycles", null);
        setField(term66052, term66052.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term66052, args);
    }

};


