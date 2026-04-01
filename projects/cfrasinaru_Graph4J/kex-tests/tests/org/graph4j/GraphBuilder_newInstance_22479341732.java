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

public class GraphBuilder_newInstance_22479341732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180707;

    public GraphBuilder_newInstance_22479341732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180707 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180707, term180707.getClass(), "vertices", null);
        setField(term180707, term180707.getClass(), "dynamicVertices", null);
        setField(term180707, term180707.getClass(), "vertexLabelMap", null);
        setField(term180707, term180707.getClass(), "vertexWeightMap", null);
        setField(term180707, term180707.getClass(), "maxVertices", null);
        setField(term180707, term180707.getClass(), "numEdges", null);
        setField(term180707, term180707.getClass(), "avgDegree", null);
        setField(term180707, term180707.getClass(), "density", null);
        setBooleanField(term180707, term180707.getClass(), "directed", false);
        setBooleanField(term180707, term180707.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180707, term180707.getClass(), "allowingMultiEdges", false);
        setIntField(term180707, term180707.getClass(), "vertexDataSize", 0);
        setIntField(term180707, term180707.getClass(), "edgeDataSize", 0);
        setField(term180707, term180707.getClass(), "name", null);
        setField(term180707, term180707.getClass(), "edges", null);
        setField(term180707, term180707.getClass(), "paths", null);
        setField(term180707, term180707.getClass(), "cycles", null);
        setField(term180707, term180707.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term180707, args);
    }

};


