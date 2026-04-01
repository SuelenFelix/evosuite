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

public class GraphBuilder_labeledVertices_162548636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179013;

    public GraphBuilder_labeledVertices_162548636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179013 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term179013, term179013.getClass(), "vertices", null);
        setField(term179013, term179013.getClass(), "dynamicVertices", null);
        setField(term179013, term179013.getClass(), "vertexLabelMap", null);
        setField(term179013, term179013.getClass(), "vertexWeightMap", null);
        setField(term179013, term179013.getClass(), "maxVertices", null);
        setField(term179013, term179013.getClass(), "numEdges", null);
        setField(term179013, term179013.getClass(), "avgDegree", null);
        setField(term179013, term179013.getClass(), "density", null);
        setBooleanField(term179013, term179013.getClass(), "directed", false);
        setBooleanField(term179013, term179013.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179013, term179013.getClass(), "allowingMultiEdges", false);
        setIntField(term179013, term179013.getClass(), "vertexDataSize", 0);
        setIntField(term179013, term179013.getClass(), "edgeDataSize", 0);
        setField(term179013, term179013.getClass(), "name", null);
        setField(term179013, term179013.getClass(), "edges", null);
        setField(term179013, term179013.getClass(), "paths", null);
        setField(term179013, term179013.getClass(), "cycles", null);
        setField(term179013, term179013.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "labeledVertices", argTypes, term179013, args);
    }

};


