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

public class GraphBuilder_edges_81360215839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180766;

    public GraphBuilder_edges_81360215839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180766 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180766, term180766.getClass(), "vertices", null);
        setField(term180766, term180766.getClass(), "dynamicVertices", null);
        setField(term180766, term180766.getClass(), "vertexLabelMap", null);
        setField(term180766, term180766.getClass(), "vertexWeightMap", null);
        setField(term180766, term180766.getClass(), "maxVertices", null);
        setField(term180766, term180766.getClass(), "numEdges", null);
        setField(term180766, term180766.getClass(), "avgDegree", null);
        setField(term180766, term180766.getClass(), "density", null);
        setBooleanField(term180766, term180766.getClass(), "directed", false);
        setBooleanField(term180766, term180766.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180766, term180766.getClass(), "allowingMultiEdges", false);
        setIntField(term180766, term180766.getClass(), "vertexDataSize", 0);
        setIntField(term180766, term180766.getClass(), "edgeDataSize", 0);
        setField(term180766, term180766.getClass(), "name", null);
        setField(term180766, term180766.getClass(), "edges", null);
        setField(term180766, term180766.getClass(), "paths", null);
        setField(term180766, term180766.getClass(), "cycles", null);
        setField(term180766, term180766.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "edges", argTypes, term180766, args);
    }

};


