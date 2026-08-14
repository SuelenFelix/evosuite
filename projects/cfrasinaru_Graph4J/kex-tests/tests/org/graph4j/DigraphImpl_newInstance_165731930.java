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

public class DigraphImpl_newInstance_165731930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172209;
     Object term172220;
     Object term172222;
     Object term172224;
     Object term172226;
     Object term172228;
     Object term172230;
     Object term172232;

    public DigraphImpl_newInstance_165731930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172209 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172209, term172209.getClass(), "predList", null);
        setField(term172209, term172209.getClass(), "predPos", null);
        setField(term172209, term172209.getClass(), "indegree", null);
        setField(term172209, term172209.getClass(), "name", null);
        setIntField(term172209, term172209.getClass(), "maxVertices", 0);
        setIntField(term172209, term172209.getClass(), "numVertices", 0);
        setLongField(term172209, term172209.getClass(), "numEdges", 0L);
        setField(term172209, term172209.getClass(), "vertices", null);
        setField(term172209, term172209.getClass(), "degree", null);
        setField(term172209, term172209.getClass(), "adjList", null);
        setField(term172209, term172209.getClass(), "adjPos", null);
        setField(term172209, term172209.getClass(), "vertexWeight", null);
        setIntField(term172209, term172209.getClass(), "vertexDataSize", 0);
        setField(term172209, term172209.getClass(), "edgeData", null);
        setIntField(term172209, term172209.getClass(), "edgeDataSize", 0);
        setField(term172209, term172209.getClass(), "vertexLabel", null);
        setField(term172209, term172209.getClass(), "edgeLabel", null);
        setField(term172209, term172209.getClass(), "vertexIndex", null);
        setField(term172209, term172209.getClass(), "adjSet", null);
        setField(term172209, term172209.getClass(), "adjMap", null);
        setField(term172209, term172209.getClass(), "maxVertexNumber", null);
        setField(term172209, term172209.getClass(), "labelVertexMap", null);
        setField(term172209, term172209.getClass(), "labelEdgeMap", null);
        setBooleanField(term172209, term172209.getClass(), "directed", false);
        setBooleanField(term172209, term172209.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172209, term172209.getClass(), "allowingSelfLoops", false);
        setIntField(term172209, term172209.getClass(), "avgDegree", 0);
        setBooleanField(term172209, term172209.getClass(), "safeMode", false);
        term172220 = new Integer(0);
        term172222 = new Integer(0);
        term172224 = new Boolean(false);
        term172226 = new Boolean(false);
        term172228 = new Boolean(false);
        term172230 = new Integer(0);
        term172232 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
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
        args[1] = term172220;
        args[2] = term172222;
        args[3] = term172224;
        args[4] = term172226;
        args[5] = term172228;
        args[6] = term172230;
        args[7] = term172232;
        callMethod(klass, "newInstance", argTypes, term172209, args);
    }

};


