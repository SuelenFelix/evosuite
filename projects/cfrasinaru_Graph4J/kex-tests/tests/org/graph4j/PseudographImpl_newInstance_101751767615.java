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

public class PseudographImpl_newInstance_101751767615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118397;
     Object term118408;
     Object term118410;
     Object term118412;
     Object term118414;
     Object term118416;
     Object term118418;
     Object term118420;

    public PseudographImpl_newInstance_101751767615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118397 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118397, term118397.getClass(), "selfLoops", null);
        setField(term118397, term118397.getClass(), "name", null);
        setIntField(term118397, term118397.getClass(), "maxVertices", 0);
        setIntField(term118397, term118397.getClass(), "numVertices", 0);
        setLongField(term118397, term118397.getClass(), "numEdges", 0L);
        setField(term118397, term118397.getClass(), "vertices", null);
        setField(term118397, term118397.getClass(), "degree", null);
        setField(term118397, term118397.getClass(), "adjList", null);
        setField(term118397, term118397.getClass(), "adjPos", null);
        setField(term118397, term118397.getClass(), "vertexWeight", null);
        setIntField(term118397, term118397.getClass(), "vertexDataSize", 0);
        setField(term118397, term118397.getClass(), "edgeData", null);
        setIntField(term118397, term118397.getClass(), "edgeDataSize", 0);
        setField(term118397, term118397.getClass(), "vertexLabel", null);
        setField(term118397, term118397.getClass(), "edgeLabel", null);
        setField(term118397, term118397.getClass(), "vertexIndex", null);
        setField(term118397, term118397.getClass(), "adjSet", null);
        setField(term118397, term118397.getClass(), "adjMap", null);
        setField(term118397, term118397.getClass(), "maxVertexNumber", null);
        setField(term118397, term118397.getClass(), "labelVertexMap", null);
        setField(term118397, term118397.getClass(), "labelEdgeMap", null);
        setBooleanField(term118397, term118397.getClass(), "directed", false);
        setBooleanField(term118397, term118397.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118397, term118397.getClass(), "allowingSelfLoops", false);
        setIntField(term118397, term118397.getClass(), "avgDegree", 0);
        setBooleanField(term118397, term118397.getClass(), "safeMode", false);
        term118408 = new Integer(0);
        term118410 = new Integer(0);
        term118412 = new Boolean(false);
        term118414 = new Boolean(false);
        term118416 = new Boolean(false);
        term118418 = new Integer(0);
        term118420 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
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
        args[1] = term118408;
        args[2] = term118410;
        args[3] = term118412;
        args[4] = term118414;
        args[5] = term118416;
        args[6] = term118418;
        args[7] = term118420;
        callMethod(klass, "newInstance", argTypes, term118397, args);
    }

};


