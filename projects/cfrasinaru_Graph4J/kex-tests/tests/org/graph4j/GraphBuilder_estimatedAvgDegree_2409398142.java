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

public class GraphBuilder_estimatedAvgDegree_2409398142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180775;
     Object term180781;

    public GraphBuilder_estimatedAvgDegree_2409398142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180775 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180775, term180775.getClass(), "vertices", null);
        setField(term180775, term180775.getClass(), "dynamicVertices", null);
        setField(term180775, term180775.getClass(), "vertexLabelMap", null);
        setField(term180775, term180775.getClass(), "vertexWeightMap", null);
        setField(term180775, term180775.getClass(), "maxVertices", null);
        setField(term180775, term180775.getClass(), "numEdges", null);
        setField(term180775, term180775.getClass(), "avgDegree", null);
        setField(term180775, term180775.getClass(), "density", null);
        setBooleanField(term180775, term180775.getClass(), "directed", false);
        setBooleanField(term180775, term180775.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180775, term180775.getClass(), "allowingMultiEdges", false);
        setIntField(term180775, term180775.getClass(), "vertexDataSize", 0);
        setIntField(term180775, term180775.getClass(), "edgeDataSize", 0);
        setField(term180775, term180775.getClass(), "name", null);
        setField(term180775, term180775.getClass(), "edges", null);
        setField(term180775, term180775.getClass(), "paths", null);
        setField(term180775, term180775.getClass(), "cycles", null);
        setField(term180775, term180775.getClass(), "cliques", null);
        term180781 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term180781;
        callMethod(klass, "estimatedAvgDegree", argTypes, term180775, args);
    }

};


