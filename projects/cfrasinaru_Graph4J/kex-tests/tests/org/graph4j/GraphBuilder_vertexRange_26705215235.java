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

public class GraphBuilder_vertexRange_26705215235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180738;
     Object term180744;
     Object term180746;

    public GraphBuilder_vertexRange_26705215235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180738 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        setField(term180738, term180738.getClass(), "vertices", null);
        setField(term180738, term180738.getClass(), "dynamicVertices", null);
        setField(term180738, term180738.getClass(), "vertexLabelMap", null);
        setField(term180738, term180738.getClass(), "vertexWeightMap", null);
        setField(term180738, term180738.getClass(), "maxVertices", null);
        setField(term180738, term180738.getClass(), "numEdges", null);
        setField(term180738, term180738.getClass(), "avgDegree", null);
        setField(term180738, term180738.getClass(), "density", null);
        setBooleanField(term180738, term180738.getClass(), "directed", false);
        setBooleanField(term180738, term180738.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180738, term180738.getClass(), "allowingMultiEdges", false);
        setIntField(term180738, term180738.getClass(), "vertexDataSize", 0);
        setIntField(term180738, term180738.getClass(), "edgeDataSize", 0);
        setField(term180738, term180738.getClass(), "name", null);
        setField(term180738, term180738.getClass(), "edges", null);
        setField(term180738, term180738.getClass(), "paths", null);
        setField(term180738, term180738.getClass(), "cycles", null);
        setField(term180738, term180738.getClass(), "cliques", null);
        term180744 = new Integer(0);
        term180746 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180744;
        args[1] = term180746;
        callMethod(klass, "vertexRange", argTypes, term180738, args);
    }

};


