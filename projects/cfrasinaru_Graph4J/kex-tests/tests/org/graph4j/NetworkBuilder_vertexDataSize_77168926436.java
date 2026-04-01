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

public class NetworkBuilder_vertexDataSize_77168926436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66001;
     Object term66009;

    public NetworkBuilder_vertexDataSize_77168926436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66001 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66001, term66001.getClass(), "source", 0);
        setIntField(term66001, term66001.getClass(), "sink", 0);
        setField(term66001, term66001.getClass(), "vertices", null);
        setField(term66001, term66001.getClass(), "dynamicVertices", null);
        setField(term66001, term66001.getClass(), "vertexLabelMap", null);
        setField(term66001, term66001.getClass(), "vertexWeightMap", null);
        setField(term66001, term66001.getClass(), "maxVertices", null);
        setField(term66001, term66001.getClass(), "numEdges", null);
        setField(term66001, term66001.getClass(), "avgDegree", null);
        setField(term66001, term66001.getClass(), "density", null);
        setBooleanField(term66001, term66001.getClass(), "directed", false);
        setBooleanField(term66001, term66001.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66001, term66001.getClass(), "allowingMultiEdges", false);
        setIntField(term66001, term66001.getClass(), "vertexDataSize", 0);
        setIntField(term66001, term66001.getClass(), "edgeDataSize", 0);
        setField(term66001, term66001.getClass(), "name", null);
        setField(term66001, term66001.getClass(), "edges", null);
        setField(term66001, term66001.getClass(), "paths", null);
        setField(term66001, term66001.getClass(), "cycles", null);
        setField(term66001, term66001.getClass(), "cliques", null);
        term66009 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66009;
        callMethod(klass, "vertexDataSize", argTypes, term66001, args);
    }

};


