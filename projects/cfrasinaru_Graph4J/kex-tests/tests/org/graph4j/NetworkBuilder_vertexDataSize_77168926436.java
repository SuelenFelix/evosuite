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

public class NetworkBuilder_vertexDataSize_77168926436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66004;
     Object term66012;

    public NetworkBuilder_vertexDataSize_77168926436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66004 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66004, term66004.getClass(), "source", 0);
        setIntField(term66004, term66004.getClass(), "sink", 0);
        setField(term66004, term66004.getClass(), "vertices", null);
        setField(term66004, term66004.getClass(), "dynamicVertices", null);
        setField(term66004, term66004.getClass(), "vertexLabelMap", null);
        setField(term66004, term66004.getClass(), "vertexWeightMap", null);
        setField(term66004, term66004.getClass(), "maxVertices", null);
        setField(term66004, term66004.getClass(), "numEdges", null);
        setField(term66004, term66004.getClass(), "avgDegree", null);
        setField(term66004, term66004.getClass(), "density", null);
        setBooleanField(term66004, term66004.getClass(), "directed", false);
        setBooleanField(term66004, term66004.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66004, term66004.getClass(), "allowingMultiEdges", false);
        setIntField(term66004, term66004.getClass(), "vertexDataSize", 0);
        setIntField(term66004, term66004.getClass(), "edgeDataSize", 0);
        setField(term66004, term66004.getClass(), "name", null);
        setField(term66004, term66004.getClass(), "edges", null);
        setField(term66004, term66004.getClass(), "paths", null);
        setField(term66004, term66004.getClass(), "cycles", null);
        setField(term66004, term66004.getClass(), "cliques", null);
        term66012 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66012;
        callMethod(klass, "vertexDataSize", argTypes, term66004, args);
    }

};


