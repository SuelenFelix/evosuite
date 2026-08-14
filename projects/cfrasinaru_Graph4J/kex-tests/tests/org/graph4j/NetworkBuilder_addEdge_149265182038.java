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

public class NetworkBuilder_addEdge_149265182038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66024;

    public NetworkBuilder_addEdge_149265182038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66024 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66024, term66024.getClass(), "source", 0);
        setIntField(term66024, term66024.getClass(), "sink", 0);
        setField(term66024, term66024.getClass(), "vertices", null);
        setField(term66024, term66024.getClass(), "dynamicVertices", null);
        setField(term66024, term66024.getClass(), "vertexLabelMap", null);
        setField(term66024, term66024.getClass(), "vertexWeightMap", null);
        setField(term66024, term66024.getClass(), "maxVertices", null);
        setField(term66024, term66024.getClass(), "numEdges", null);
        setField(term66024, term66024.getClass(), "avgDegree", null);
        setField(term66024, term66024.getClass(), "density", null);
        setBooleanField(term66024, term66024.getClass(), "directed", false);
        setBooleanField(term66024, term66024.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66024, term66024.getClass(), "allowingMultiEdges", false);
        setIntField(term66024, term66024.getClass(), "vertexDataSize", 0);
        setIntField(term66024, term66024.getClass(), "edgeDataSize", 0);
        setField(term66024, term66024.getClass(), "name", null);
        setField(term66024, term66024.getClass(), "edges", null);
        setField(term66024, term66024.getClass(), "paths", null);
        setField(term66024, term66024.getClass(), "cycles", null);
        setField(term66024, term66024.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEdge", argTypes, term66024, args);
    }

};


