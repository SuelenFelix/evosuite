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
     Object term84792;
     Object term84803;
     Object term84805;
     Object term84807;
     Object term84809;
     Object term84811;
     Object term84813;
     Object term84815;

    public DirectedPseudographImpl_newInstance_127597041216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84792 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84792, term84792.getClass(), "selfLoops", null);
        setField(term84792, term84792.getClass(), "predList", null);
        setField(term84792, term84792.getClass(), "predPos", null);
        setField(term84792, term84792.getClass(), "indegree", null);
        setField(term84792, term84792.getClass(), "name", null);
        setIntField(term84792, term84792.getClass(), "maxVertices", 0);
        setIntField(term84792, term84792.getClass(), "numVertices", 0);
        setLongField(term84792, term84792.getClass(), "numEdges", 0L);
        setField(term84792, term84792.getClass(), "vertices", null);
        setField(term84792, term84792.getClass(), "degree", null);
        setField(term84792, term84792.getClass(), "adjList", null);
        setField(term84792, term84792.getClass(), "adjPos", null);
        setField(term84792, term84792.getClass(), "vertexWeight", null);
        setIntField(term84792, term84792.getClass(), "vertexDataSize", 0);
        setField(term84792, term84792.getClass(), "edgeData", null);
        setIntField(term84792, term84792.getClass(), "edgeDataSize", 0);
        setField(term84792, term84792.getClass(), "vertexLabel", null);
        setField(term84792, term84792.getClass(), "edgeLabel", null);
        setField(term84792, term84792.getClass(), "vertexIndex", null);
        setField(term84792, term84792.getClass(), "adjSet", null);
        setField(term84792, term84792.getClass(), "adjMap", null);
        setField(term84792, term84792.getClass(), "maxVertexNumber", null);
        setField(term84792, term84792.getClass(), "labelVertexMap", null);
        setField(term84792, term84792.getClass(), "labelEdgeMap", null);
        setBooleanField(term84792, term84792.getClass(), "directed", false);
        setBooleanField(term84792, term84792.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84792, term84792.getClass(), "allowingSelfLoops", false);
        setIntField(term84792, term84792.getClass(), "avgDegree", 0);
        setBooleanField(term84792, term84792.getClass(), "safeMode", false);
        term84803 = new Integer(0);
        term84805 = new Integer(0);
        term84807 = new Boolean(false);
        term84809 = new Boolean(false);
        term84811 = new Boolean(false);
        term84813 = new Integer(0);
        term84815 = new Integer(0);
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
        args[1] = term84803;
        args[2] = term84805;
        args[3] = term84807;
        args[4] = term84809;
        args[5] = term84811;
        args[6] = term84813;
        args[7] = term84815;
        callMethod(klass, "newInstance", argTypes, term84792, args);
    }

};


