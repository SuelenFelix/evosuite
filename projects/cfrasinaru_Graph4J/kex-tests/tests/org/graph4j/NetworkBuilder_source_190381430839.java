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

public class NetworkBuilder_source_190381430839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66032;
     Object term66040;

    public NetworkBuilder_source_190381430839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66032 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        setIntField(term66032, term66032.getClass(), "source", 0);
        setIntField(term66032, term66032.getClass(), "sink", 0);
        setField(term66032, term66032.getClass(), "vertices", null);
        setField(term66032, term66032.getClass(), "dynamicVertices", null);
        setField(term66032, term66032.getClass(), "vertexLabelMap", null);
        setField(term66032, term66032.getClass(), "vertexWeightMap", null);
        setField(term66032, term66032.getClass(), "maxVertices", null);
        setField(term66032, term66032.getClass(), "numEdges", null);
        setField(term66032, term66032.getClass(), "avgDegree", null);
        setField(term66032, term66032.getClass(), "density", null);
        setBooleanField(term66032, term66032.getClass(), "directed", false);
        setBooleanField(term66032, term66032.getClass(), "allowingSelfLoops", false);
        setBooleanField(term66032, term66032.getClass(), "allowingMultiEdges", false);
        setIntField(term66032, term66032.getClass(), "vertexDataSize", 0);
        setIntField(term66032, term66032.getClass(), "edgeDataSize", 0);
        setField(term66032, term66032.getClass(), "name", null);
        setField(term66032, term66032.getClass(), "edges", null);
        setField(term66032, term66032.getClass(), "paths", null);
        setField(term66032, term66032.getClass(), "cycles", null);
        setField(term66032, term66032.getClass(), "cliques", null);
        term66040 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66040;
        callMethod(klass, "source", argTypes, term66032, args);
    }

};


