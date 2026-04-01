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
import java.lang.Double;

public class GraphBuilder_estimatedDensity_147910234041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180767;
     Object term180773;

    public GraphBuilder_estimatedDensity_147910234041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180767 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180767, term180767.getClass(), "vertices", null);
        setField(term180767, term180767.getClass(), "dynamicVertices", null);
        setField(term180767, term180767.getClass(), "vertexLabelMap", null);
        setField(term180767, term180767.getClass(), "vertexWeightMap", null);
        setField(term180767, term180767.getClass(), "maxVertices", null);
        setField(term180767, term180767.getClass(), "numEdges", null);
        setField(term180767, term180767.getClass(), "avgDegree", null);
        setField(term180767, term180767.getClass(), "density", null);
        setBooleanField(term180767, term180767.getClass(), "directed", false);
        setBooleanField(term180767, term180767.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180767, term180767.getClass(), "allowingMultiEdges", false);
        setIntField(term180767, term180767.getClass(), "vertexDataSize", 0);
        setIntField(term180767, term180767.getClass(), "edgeDataSize", 0);
        setField(term180767, term180767.getClass(), "name", null);
        setField(term180767, term180767.getClass(), "edges", null);
        setField(term180767, term180767.getClass(), "paths", null);
        setField(term180767, term180767.getClass(), "cycles", null);
        setField(term180767, term180767.getClass(), "cliques", null);
        term180773 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term180773;
        callMethod(klass, "estimatedDensity", argTypes, term180767, args);
    }

};


