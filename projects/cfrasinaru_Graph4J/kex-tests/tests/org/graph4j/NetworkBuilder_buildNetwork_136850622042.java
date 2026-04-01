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

public class NetworkBuilder_buildNetwork_136850622042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66057;

    public NetworkBuilder_buildNetwork_136850622042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66057 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66057, term66057.getClass(), "source", 0);
        setIntField(term66057, term66057.getClass(), "sink", 0);
        setField(term66057, term66057.getClass(), "vertices", null);
        setField(term66057, term66057.getClass(), "dynamicVertices", null);
        setField(term66057, term66057.getClass(), "vertexLabelMap", null);
        setField(term66057, term66057.getClass(), "vertexWeightMap", null);
        setField(term66057, term66057.getClass(), "maxVertices", null);
        setField(term66057, term66057.getClass(), "numEdges", null);
        setField(term66057, term66057.getClass(), "avgDegree", null);
        setField(term66057, term66057.getClass(), "density", null);
        setBooleanField(term66057, term66057.getClass(), "directed", false);
        setBooleanField(term66057, term66057.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66057, term66057.getClass(), "allowingMultiEdges", false);
        setIntField(term66057, term66057.getClass(), "vertexDataSize", 0);
        setIntField(term66057, term66057.getClass(), "edgeDataSize", 0);
        setField(term66057, term66057.getClass(), "name", null);
        setField(term66057, term66057.getClass(), "edges", null);
        setField(term66057, term66057.getClass(), "paths", null);
        setField(term66057, term66057.getClass(), "cycles", null);
        setField(term66057, term66057.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildNetwork", argTypes, term66057, args);
    }

};


