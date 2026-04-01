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
import java.lang.Boolean;

public class DirectedPseudographImpl_newInstance_127597041216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84789;
     Object term84800;
     Object term84802;
     Object term84804;
     Object term84806;
     Object term84808;
     Object term84810;
     Object term84812;

    public DirectedPseudographImpl_newInstance_127597041216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84789 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84789, term84789.getClass(), "selfLoops", null);
        setField(term84789, term84789.getClass(), "predList", null);
        setField(term84789, term84789.getClass(), "predPos", null);
        setField(term84789, term84789.getClass(), "indegree", null);
        setField(term84789, term84789.getClass(), "name", null);
        setIntField(term84789, term84789.getClass(), "maxVertices", 0);
        setIntField(term84789, term84789.getClass(), "numVertices", 0);
        setLongField(term84789, term84789.getClass(), "numEdges", 0L);
        setField(term84789, term84789.getClass(), "vertices", null);
        setField(term84789, term84789.getClass(), "degree", null);
        setField(term84789, term84789.getClass(), "adjList", null);
        setField(term84789, term84789.getClass(), "adjPos", null);
        setField(term84789, term84789.getClass(), "vertexWeight", null);
        setIntField(term84789, term84789.getClass(), "vertexDataSize", 0);
        setField(term84789, term84789.getClass(), "edgeData", null);
        setIntField(term84789, term84789.getClass(), "edgeDataSize", 0);
        setField(term84789, term84789.getClass(), "vertexLabel", null);
        setField(term84789, term84789.getClass(), "edgeLabel", null);
        setField(term84789, term84789.getClass(), "vertexIndex", null);
        setField(term84789, term84789.getClass(), "adjSet", null);
        setField(term84789, term84789.getClass(), "adjMap", null);
        setField(term84789, term84789.getClass(), "maxVertexNumber", null);
        setField(term84789, term84789.getClass(), "labelVertexMap", null);
        setField(term84789, term84789.getClass(), "labelEdgeMap", null);
        setBooleanField(term84789, term84789.getClass(), "directed", false);
        setBooleanField(term84789, term84789.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84789, term84789.getClass(), "allowingSelfLoops", false);
        setIntField(term84789, term84789.getClass(), "avgDegree", 0);
        setBooleanField(term84789, term84789.getClass(), "safeMode", false);
        term84800 = new Integer(0);
        term84802 = new Integer(0);
        term84804 = new Boolean(false);
        term84806 = new Boolean(false);
        term84808 = new Boolean(false);
        term84810 = new Integer(0);
        term84812 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = term84800;
        args[2] = term84802;
        args[3] = term84804;
        args[4] = term84806;
        args[5] = term84808;
        args[6] = term84810;
        args[7] = term84812;
        callMethod(klass, "newInstance", argTypes, term84789, args);
    }

};


