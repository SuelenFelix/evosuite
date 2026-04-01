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

public class GraphBuilder_adjList_204928733451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180839;

    public GraphBuilder_adjList_204928733451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180839 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180839, term180839.getClass(), "vertices", null);
        setField(term180839, term180839.getClass(), "dynamicVertices", null);
        setField(term180839, term180839.getClass(), "vertexLabelMap", null);
        setField(term180839, term180839.getClass(), "vertexWeightMap", null);
        setField(term180839, term180839.getClass(), "maxVertices", null);
        setField(term180839, term180839.getClass(), "numEdges", null);
        setField(term180839, term180839.getClass(), "avgDegree", null);
        setField(term180839, term180839.getClass(), "density", null);
        setBooleanField(term180839, term180839.getClass(), "directed", false);
        setBooleanField(term180839, term180839.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180839, term180839.getClass(), "allowingMultiEdges", false);
        setIntField(term180839, term180839.getClass(), "vertexDataSize", 0);
        setIntField(term180839, term180839.getClass(), "edgeDataSize", 0);
        setField(term180839, term180839.getClass(), "name", null);
        setField(term180839, term180839.getClass(), "edges", null);
        setField(term180839, term180839.getClass(), "paths", null);
        setField(term180839, term180839.getClass(), "cycles", null);
        setField(term180839, term180839.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "adjList", argTypes, term180839, args);
    }

};


