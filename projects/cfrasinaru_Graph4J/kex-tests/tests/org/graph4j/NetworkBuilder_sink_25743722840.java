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

public class NetworkBuilder_sink_25743722840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66039;
     Object term66047;

    public NetworkBuilder_sink_25743722840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66039 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66039, term66039.getClass(), "source", 0);
        setIntField(term66039, term66039.getClass(), "sink", 0);
        setField(term66039, term66039.getClass(), "vertices", null);
        setField(term66039, term66039.getClass(), "dynamicVertices", null);
        setField(term66039, term66039.getClass(), "vertexLabelMap", null);
        setField(term66039, term66039.getClass(), "vertexWeightMap", null);
        setField(term66039, term66039.getClass(), "maxVertices", null);
        setField(term66039, term66039.getClass(), "numEdges", null);
        setField(term66039, term66039.getClass(), "avgDegree", null);
        setField(term66039, term66039.getClass(), "density", null);
        setBooleanField(term66039, term66039.getClass(), "directed", false);
        setBooleanField(term66039, term66039.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66039, term66039.getClass(), "allowingMultiEdges", false);
        setIntField(term66039, term66039.getClass(), "vertexDataSize", 0);
        setIntField(term66039, term66039.getClass(), "edgeDataSize", 0);
        setField(term66039, term66039.getClass(), "name", null);
        setField(term66039, term66039.getClass(), "edges", null);
        setField(term66039, term66039.getClass(), "paths", null);
        setField(term66039, term66039.getClass(), "cycles", null);
        setField(term66039, term66039.getClass(), "cliques", null);
        term66047 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66047;
        callMethod(klass, "sink", argTypes, term66039, args);
    }

};


