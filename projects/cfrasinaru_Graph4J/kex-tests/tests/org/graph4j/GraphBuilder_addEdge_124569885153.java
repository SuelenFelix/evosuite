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

public class GraphBuilder_addEdge_124569885153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180862;

    public GraphBuilder_addEdge_124569885153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180862 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180862, term180862.getClass(), "vertices", null);
        setField(term180862, term180862.getClass(), "dynamicVertices", null);
        setField(term180862, term180862.getClass(), "vertexLabelMap", null);
        setField(term180862, term180862.getClass(), "vertexWeightMap", null);
        setField(term180862, term180862.getClass(), "maxVertices", null);
        setField(term180862, term180862.getClass(), "numEdges", null);
        setField(term180862, term180862.getClass(), "avgDegree", null);
        setField(term180862, term180862.getClass(), "density", null);
        setBooleanField(term180862, term180862.getClass(), "directed", false);
        setBooleanField(term180862, term180862.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180862, term180862.getClass(), "allowingMultiEdges", false);
        setIntField(term180862, term180862.getClass(), "vertexDataSize", 0);
        setIntField(term180862, term180862.getClass(), "edgeDataSize", 0);
        setField(term180862, term180862.getClass(), "name", null);
        setField(term180862, term180862.getClass(), "edges", null);
        setField(term180862, term180862.getClass(), "paths", null);
        setField(term180862, term180862.getClass(), "cycles", null);
        setField(term180862, term180862.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addEdge", argTypes, term180862, args);
    }

};


