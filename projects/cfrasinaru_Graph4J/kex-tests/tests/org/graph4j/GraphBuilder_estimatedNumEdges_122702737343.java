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
import java.lang.Long;

public class GraphBuilder_estimatedNumEdges_122702737343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180794;
     Object term180800;

    public GraphBuilder_estimatedNumEdges_122702737343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180794 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180794, term180794.getClass(), "vertices", null);
        setField(term180794, term180794.getClass(), "dynamicVertices", null);
        setField(term180794, term180794.getClass(), "vertexLabelMap", null);
        setField(term180794, term180794.getClass(), "vertexWeightMap", null);
        setField(term180794, term180794.getClass(), "maxVertices", null);
        setField(term180794, term180794.getClass(), "numEdges", null);
        setField(term180794, term180794.getClass(), "avgDegree", null);
        setField(term180794, term180794.getClass(), "density", null);
        setBooleanField(term180794, term180794.getClass(), "directed", false);
        setBooleanField(term180794, term180794.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180794, term180794.getClass(), "allowingMultiEdges", false);
        setIntField(term180794, term180794.getClass(), "vertexDataSize", 0);
        setIntField(term180794, term180794.getClass(), "edgeDataSize", 0);
        setField(term180794, term180794.getClass(), "name", null);
        setField(term180794, term180794.getClass(), "edges", null);
        setField(term180794, term180794.getClass(), "paths", null);
        setField(term180794, term180794.getClass(), "cycles", null);
        setField(term180794, term180794.getClass(), "cliques", null);
        term180800 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term180800;
        callMethod(klass, "estimatedNumEdges", argTypes, term180794, args);
    }

};


