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

public class NetworkBuilder_edgeDataSize_12020266537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66011;
     Object term66019;

    public NetworkBuilder_edgeDataSize_12020266537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66011 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66011, term66011.getClass(), "source", 0);
        setIntField(term66011, term66011.getClass(), "sink", 0);
        setField(term66011, term66011.getClass(), "vertices", null);
        setField(term66011, term66011.getClass(), "dynamicVertices", null);
        setField(term66011, term66011.getClass(), "vertexLabelMap", null);
        setField(term66011, term66011.getClass(), "vertexWeightMap", null);
        setField(term66011, term66011.getClass(), "maxVertices", null);
        setField(term66011, term66011.getClass(), "numEdges", null);
        setField(term66011, term66011.getClass(), "avgDegree", null);
        setField(term66011, term66011.getClass(), "density", null);
        setBooleanField(term66011, term66011.getClass(), "directed", false);
        setBooleanField(term66011, term66011.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66011, term66011.getClass(), "allowingMultiEdges", false);
        setIntField(term66011, term66011.getClass(), "vertexDataSize", 0);
        setIntField(term66011, term66011.getClass(), "edgeDataSize", 0);
        setField(term66011, term66011.getClass(), "name", null);
        setField(term66011, term66011.getClass(), "edges", null);
        setField(term66011, term66011.getClass(), "paths", null);
        setField(term66011, term66011.getClass(), "cycles", null);
        setField(term66011, term66011.getClass(), "cliques", null);
        term66019 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66019;
        callMethod(klass, "edgeDataSize", argTypes, term66011, args);
    }

};


