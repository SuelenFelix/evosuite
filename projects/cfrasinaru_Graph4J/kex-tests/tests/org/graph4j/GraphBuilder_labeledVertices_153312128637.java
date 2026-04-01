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

public class GraphBuilder_labeledVertices_153312128637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180743;

    public GraphBuilder_labeledVertices_153312128637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180743 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180743, term180743.getClass(), "vertices", null);
        setField(term180743, term180743.getClass(), "dynamicVertices", null);
        setField(term180743, term180743.getClass(), "vertexLabelMap", null);
        setField(term180743, term180743.getClass(), "vertexWeightMap", null);
        setField(term180743, term180743.getClass(), "maxVertices", null);
        setField(term180743, term180743.getClass(), "numEdges", null);
        setField(term180743, term180743.getClass(), "avgDegree", null);
        setField(term180743, term180743.getClass(), "density", null);
        setBooleanField(term180743, term180743.getClass(), "directed", false);
        setBooleanField(term180743, term180743.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180743, term180743.getClass(), "allowingMultiEdges", false);
        setIntField(term180743, term180743.getClass(), "vertexDataSize", 0);
        setIntField(term180743, term180743.getClass(), "edgeDataSize", 0);
        setField(term180743, term180743.getClass(), "name", null);
        setField(term180743, term180743.getClass(), "edges", null);
        setField(term180743, term180743.getClass(), "paths", null);
        setField(term180743, term180743.getClass(), "cycles", null);
        setField(term180743, term180743.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "labeledVertices", argTypes, term180743, args);
    }

};


