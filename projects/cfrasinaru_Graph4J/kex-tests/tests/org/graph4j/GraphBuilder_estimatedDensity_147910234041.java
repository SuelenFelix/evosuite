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
     Object term180778;
     Object term180784;

    public GraphBuilder_estimatedDensity_147910234041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180778 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180778, term180778.getClass(), "vertices", null);
        setField(term180778, term180778.getClass(), "dynamicVertices", null);
        setField(term180778, term180778.getClass(), "vertexLabelMap", null);
        setField(term180778, term180778.getClass(), "vertexWeightMap", null);
        setField(term180778, term180778.getClass(), "maxVertices", null);
        setField(term180778, term180778.getClass(), "numEdges", null);
        setField(term180778, term180778.getClass(), "avgDegree", null);
        setField(term180778, term180778.getClass(), "density", null);
        setBooleanField(term180778, term180778.getClass(), "directed", false);
        setBooleanField(term180778, term180778.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180778, term180778.getClass(), "allowingMultiEdges", false);
        setIntField(term180778, term180778.getClass(), "vertexDataSize", 0);
        setIntField(term180778, term180778.getClass(), "edgeDataSize", 0);
        setField(term180778, term180778.getClass(), "name", null);
        setField(term180778, term180778.getClass(), "edges", null);
        setField(term180778, term180778.getClass(), "paths", null);
        setField(term180778, term180778.getClass(), "cycles", null);
        setField(term180778, term180778.getClass(), "cliques", null);
        term180784 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term180784;
        callMethod(klass, "estimatedDensity", argTypes, term180778, args);
    }

};


