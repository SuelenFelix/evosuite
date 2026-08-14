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

public class GraphBuilder_empty_39492235633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180724;

    public GraphBuilder_empty_39492235633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180724 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180724, term180724.getClass(), "vertices", null);
        setField(term180724, term180724.getClass(), "dynamicVertices", null);
        setField(term180724, term180724.getClass(), "vertexLabelMap", null);
        setField(term180724, term180724.getClass(), "vertexWeightMap", null);
        setField(term180724, term180724.getClass(), "maxVertices", null);
        setField(term180724, term180724.getClass(), "numEdges", null);
        setField(term180724, term180724.getClass(), "avgDegree", null);
        setField(term180724, term180724.getClass(), "density", null);
        setBooleanField(term180724, term180724.getClass(), "directed", false);
        setBooleanField(term180724, term180724.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180724, term180724.getClass(), "allowingMultiEdges", false);
        setIntField(term180724, term180724.getClass(), "vertexDataSize", 0);
        setIntField(term180724, term180724.getClass(), "edgeDataSize", 0);
        setField(term180724, term180724.getClass(), "name", null);
        setField(term180724, term180724.getClass(), "edges", null);
        setField(term180724, term180724.getClass(), "paths", null);
        setField(term180724, term180724.getClass(), "cycles", null);
        setField(term180724, term180724.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "empty", argTypes, term180724, args);
    }

};


