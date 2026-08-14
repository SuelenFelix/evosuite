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

public class GraphBuilder_addEdge_207672810847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180826;

    public GraphBuilder_addEdge_207672810847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180826 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180826, term180826.getClass(), "vertices", null);
        setField(term180826, term180826.getClass(), "dynamicVertices", null);
        setField(term180826, term180826.getClass(), "vertexLabelMap", null);
        setField(term180826, term180826.getClass(), "vertexWeightMap", null);
        setField(term180826, term180826.getClass(), "maxVertices", null);
        setField(term180826, term180826.getClass(), "numEdges", null);
        setField(term180826, term180826.getClass(), "avgDegree", null);
        setField(term180826, term180826.getClass(), "density", null);
        setBooleanField(term180826, term180826.getClass(), "directed", false);
        setBooleanField(term180826, term180826.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180826, term180826.getClass(), "allowingMultiEdges", false);
        setIntField(term180826, term180826.getClass(), "vertexDataSize", 0);
        setIntField(term180826, term180826.getClass(), "edgeDataSize", 0);
        setField(term180826, term180826.getClass(), "name", null);
        setField(term180826, term180826.getClass(), "edges", null);
        setField(term180826, term180826.getClass(), "paths", null);
        setField(term180826, term180826.getClass(), "cycles", null);
        setField(term180826, term180826.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEdge", argTypes, term180826, args);
    }

};


