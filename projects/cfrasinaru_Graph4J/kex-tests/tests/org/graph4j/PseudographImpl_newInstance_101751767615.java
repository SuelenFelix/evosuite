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
     Object term118400;
     Object term118411;
     Object term118413;
     Object term118415;
     Object term118417;
     Object term118419;
     Object term118421;
     Object term118423;

    public PseudographImpl_newInstance_101751767615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118400 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118400, term118400.getClass(), "selfLoops", null);
        setField(term118400, term118400.getClass(), "name", null);
        setIntField(term118400, term118400.getClass(), "maxVertices", 0);
        setIntField(term118400, term118400.getClass(), "numVertices", 0);
        setLongField(term118400, term118400.getClass(), "numEdges", 0L);
        setField(term118400, term118400.getClass(), "vertices", null);
        setField(term118400, term118400.getClass(), "degree", null);
        setField(term118400, term118400.getClass(), "adjList", null);
        setField(term118400, term118400.getClass(), "adjPos", null);
        setField(term118400, term118400.getClass(), "vertexWeight", null);
        setIntField(term118400, term118400.getClass(), "vertexDataSize", 0);
        setField(term118400, term118400.getClass(), "edgeData", null);
        setIntField(term118400, term118400.getClass(), "edgeDataSize", 0);
        setField(term118400, term118400.getClass(), "vertexLabel", null);
        setField(term118400, term118400.getClass(), "edgeLabel", null);
        setField(term118400, term118400.getClass(), "vertexIndex", null);
        setField(term118400, term118400.getClass(), "adjSet", null);
        setField(term118400, term118400.getClass(), "adjMap", null);
        setField(term118400, term118400.getClass(), "maxVertexNumber", null);
        setField(term118400, term118400.getClass(), "labelVertexMap", null);
        setField(term118400, term118400.getClass(), "labelEdgeMap", null);
        setBooleanField(term118400, term118400.getClass(), "directed", false);
        setBooleanField(term118400, term118400.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118400, term118400.getClass(), "allowingSelfLoops", false);
        setIntField(term118400, term118400.getClass(), "avgDegree", 0);
        setBooleanField(term118400, term118400.getClass(), "safeMode", false);
        term118411 = new Integer(0);
        term118413 = new Integer(0);
        term118415 = new Boolean(false);
        term118417 = new Boolean(false);
        term118419 = new Boolean(false);
        term118421 = new Integer(0);
        term118423 = new Integer(0);
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
        args[1] = term118411;
        args[2] = term118413;
        args[3] = term118415;
        args[4] = term118417;
        args[5] = term118419;
        args[6] = term118421;
        args[7] = term118423;
        callMethod(klass, "newInstance", argTypes, term118400, args);
    }

};


