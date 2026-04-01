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

public class GraphBuilder_addEdge_81389855754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180857;
     Object term180863;
     Object term180865;

    public GraphBuilder_addEdge_81389855754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180857 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180857, term180857.getClass(), "vertices", null);
        setField(term180857, term180857.getClass(), "dynamicVertices", null);
        setField(term180857, term180857.getClass(), "vertexLabelMap", null);
        setField(term180857, term180857.getClass(), "vertexWeightMap", null);
        setField(term180857, term180857.getClass(), "maxVertices", null);
        setField(term180857, term180857.getClass(), "numEdges", null);
        setField(term180857, term180857.getClass(), "avgDegree", null);
        setField(term180857, term180857.getClass(), "density", null);
        setBooleanField(term180857, term180857.getClass(), "directed", false);
        setBooleanField(term180857, term180857.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180857, term180857.getClass(), "allowingMultiEdges", false);
        setIntField(term180857, term180857.getClass(), "vertexDataSize", 0);
        setIntField(term180857, term180857.getClass(), "edgeDataSize", 0);
        setField(term180857, term180857.getClass(), "name", null);
        setField(term180857, term180857.getClass(), "edges", null);
        setField(term180857, term180857.getClass(), "paths", null);
        setField(term180857, term180857.getClass(), "cycles", null);
        setField(term180857, term180857.getClass(), "cliques", null);
        term180863 = new Integer(0);
        term180865 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180863;
        args[1] = term180865;
        callMethod(klass, "addEdge", argTypes, term180857, args);
    }

};


