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

public class GraphBuilder_buildMultigraph_2524141857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180879;

    public GraphBuilder_buildMultigraph_2524141857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180879 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180879, term180879.getClass(), "vertices", null);
        setField(term180879, term180879.getClass(), "dynamicVertices", null);
        setField(term180879, term180879.getClass(), "vertexLabelMap", null);
        setField(term180879, term180879.getClass(), "vertexWeightMap", null);
        setField(term180879, term180879.getClass(), "maxVertices", null);
        setField(term180879, term180879.getClass(), "numEdges", null);
        setField(term180879, term180879.getClass(), "avgDegree", null);
        setField(term180879, term180879.getClass(), "density", null);
        setBooleanField(term180879, term180879.getClass(), "directed", false);
        setBooleanField(term180879, term180879.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180879, term180879.getClass(), "allowingMultiEdges", false);
        setIntField(term180879, term180879.getClass(), "vertexDataSize", 0);
        setIntField(term180879, term180879.getClass(), "edgeDataSize", 0);
        setField(term180879, term180879.getClass(), "name", null);
        setField(term180879, term180879.getClass(), "edges", null);
        setField(term180879, term180879.getClass(), "paths", null);
        setField(term180879, term180879.getClass(), "cycles", null);
        setField(term180879, term180879.getClass(), "cliques", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildMultigraph", argTypes, term180879, args);
    }

};


