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

public class NetworkBuilder_labeledVertices_5678214256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64833;

    public NetworkBuilder_labeledVertices_5678214256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64833 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term64833, term64833.getClass(), "source", 0);
        setIntField(term64833, term64833.getClass(), "sink", 0);
        setField(term64833, term64833.getClass(), "vertices", null);
        setField(term64833, term64833.getClass(), "dynamicVertices", null);
        setField(term64833, term64833.getClass(), "vertexLabelMap", null);
        setField(term64833, term64833.getClass(), "vertexWeightMap", null);
        setField(term64833, term64833.getClass(), "maxVertices", null);
        setField(term64833, term64833.getClass(), "numEdges", null);
        setField(term64833, term64833.getClass(), "avgDegree", null);
        setField(term64833, term64833.getClass(), "density", null);
        setBooleanField(term64833, term64833.getClass(), "directed", false);
        setBooleanField(term64833, term64833.getClass(), "allowingSelfLoops", false);
        setBooleanField(term64833, term64833.getClass(), "allowingMultiEdges", false);
        setIntField(term64833, term64833.getClass(), "vertexDataSize", 0);
        setIntField(term64833, term64833.getClass(), "edgeDataSize", 0);
        setField(term64833, term64833.getClass(), "name", null);
        setField(term64833, term64833.getClass(), "edges", null);
        setField(term64833, term64833.getClass(), "paths", null);
        setField(term64833, term64833.getClass(), "cycles", null);
        setField(term64833, term64833.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "labeledVertices", argTypes, term64833, args);
    }

};


