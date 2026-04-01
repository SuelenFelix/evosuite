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
     Object term66021;

    public NetworkBuilder_addEdge_149265182038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66021 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66021, term66021.getClass(), "source", 0);
        setIntField(term66021, term66021.getClass(), "sink", 0);
        setField(term66021, term66021.getClass(), "vertices", null);
        setField(term66021, term66021.getClass(), "dynamicVertices", null);
        setField(term66021, term66021.getClass(), "vertexLabelMap", null);
        setField(term66021, term66021.getClass(), "vertexWeightMap", null);
        setField(term66021, term66021.getClass(), "maxVertices", null);
        setField(term66021, term66021.getClass(), "numEdges", null);
        setField(term66021, term66021.getClass(), "avgDegree", null);
        setField(term66021, term66021.getClass(), "density", null);
        setBooleanField(term66021, term66021.getClass(), "directed", false);
        setBooleanField(term66021, term66021.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66021, term66021.getClass(), "allowingMultiEdges", false);
        setIntField(term66021, term66021.getClass(), "vertexDataSize", 0);
        setIntField(term66021, term66021.getClass(), "edgeDataSize", 0);
        setField(term66021, term66021.getClass(), "name", null);
        setField(term66021, term66021.getClass(), "edges", null);
        setField(term66021, term66021.getClass(), "paths", null);
        setField(term66021, term66021.getClass(), "cycles", null);
        setField(term66021, term66021.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEdge", argTypes, term66021, args);
    }

};


