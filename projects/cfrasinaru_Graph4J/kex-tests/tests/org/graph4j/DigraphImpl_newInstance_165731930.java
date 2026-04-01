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
     Object term172206;
     Object term172217;
     Object term172219;
     Object term172221;
     Object term172223;
     Object term172225;
     Object term172227;
     Object term172229;

    public DigraphImpl_newInstance_165731930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172206 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172206, term172206.getClass(), "predList", null);
        setField(term172206, term172206.getClass(), "predPos", null);
        setField(term172206, term172206.getClass(), "indegree", null);
        setField(term172206, term172206.getClass(), "name", null);
        setIntField(term172206, term172206.getClass(), "maxVertices", 0);
        setIntField(term172206, term172206.getClass(), "numVertices", 0);
        setLongField(term172206, term172206.getClass(), "numEdges", 0L);
        setField(term172206, term172206.getClass(), "vertices", null);
        setField(term172206, term172206.getClass(), "degree", null);
        setField(term172206, term172206.getClass(), "adjList", null);
        setField(term172206, term172206.getClass(), "adjPos", null);
        setField(term172206, term172206.getClass(), "vertexWeight", null);
        setIntField(term172206, term172206.getClass(), "vertexDataSize", 0);
        setField(term172206, term172206.getClass(), "edgeData", null);
        setIntField(term172206, term172206.getClass(), "edgeDataSize", 0);
        setField(term172206, term172206.getClass(), "vertexLabel", null);
        setField(term172206, term172206.getClass(), "edgeLabel", null);
        setField(term172206, term172206.getClass(), "vertexIndex", null);
        setField(term172206, term172206.getClass(), "adjSet", null);
        setField(term172206, term172206.getClass(), "adjMap", null);
        setField(term172206, term172206.getClass(), "maxVertexNumber", null);
        setField(term172206, term172206.getClass(), "labelVertexMap", null);
        setField(term172206, term172206.getClass(), "labelEdgeMap", null);
        setBooleanField(term172206, term172206.getClass(), "directed", false);
        setBooleanField(term172206, term172206.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172206, term172206.getClass(), "allowingSelfLoops", false);
        setIntField(term172206, term172206.getClass(), "avgDegree", 0);
        setBooleanField(term172206, term172206.getClass(), "safeMode", false);
        term172217 = new Integer(0);
        term172219 = new Integer(0);
        term172221 = new Boolean(false);
        term172223 = new Boolean(false);
        term172225 = new Boolean(false);
        term172227 = new Integer(0);
        term172229 = new Integer(0);
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
        args[1] = term172217;
        args[2] = term172219;
        args[3] = term172221;
        args[4] = term172223;
        args[5] = term172225;
        args[6] = term172227;
        args[7] = term172229;
        callMethod(klass, "newInstance", argTypes, term172206, args);
    }

};


