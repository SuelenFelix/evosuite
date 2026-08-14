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
     Object term66060;

    public NetworkBuilder_buildNetwork_136850622042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66060 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66060, term66060.getClass(), "source", 0);
        setIntField(term66060, term66060.getClass(), "sink", 0);
        setField(term66060, term66060.getClass(), "vertices", null);
        setField(term66060, term66060.getClass(), "dynamicVertices", null);
        setField(term66060, term66060.getClass(), "vertexLabelMap", null);
        setField(term66060, term66060.getClass(), "vertexWeightMap", null);
        setField(term66060, term66060.getClass(), "maxVertices", null);
        setField(term66060, term66060.getClass(), "numEdges", null);
        setField(term66060, term66060.getClass(), "avgDegree", null);
        setField(term66060, term66060.getClass(), "density", null);
        setBooleanField(term66060, term66060.getClass(), "directed", false);
        setBooleanField(term66060, term66060.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66060, term66060.getClass(), "allowingMultiEdges", false);
        setIntField(term66060, term66060.getClass(), "vertexDataSize", 0);
        setIntField(term66060, term66060.getClass(), "edgeDataSize", 0);
        setField(term66060, term66060.getClass(), "name", null);
        setField(term66060, term66060.getClass(), "edges", null);
        setField(term66060, term66060.getClass(), "paths", null);
        setField(term66060, term66060.getClass(), "cycles", null);
        setField(term66060, term66060.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildNetwork", argTypes, term66060, args);
    }

};


