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

public class NetworkImpl_newInstance_122151594826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97258;
     Object term97271;
     Object term97273;
     Object term97275;
     Object term97277;
     Object term97279;
     Object term97281;
     Object term97283;

    public NetworkImpl_newInstance_122151594826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97258 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97258, term97258.getClass(), "source", 0);
        setIntField(term97258, term97258.getClass(), "sink", 0);
        setField(term97258, term97258.getClass(), "predList", null);
        setField(term97258, term97258.getClass(), "predPos", null);
        setField(term97258, term97258.getClass(), "indegree", null);
        setField(term97258, term97258.getClass(), "name", null);
        setIntField(term97258, term97258.getClass(), "maxVertices", 0);
        setIntField(term97258, term97258.getClass(), "numVertices", 0);
        setLongField(term97258, term97258.getClass(), "numEdges", 0L);
        setField(term97258, term97258.getClass(), "vertices", null);
        setField(term97258, term97258.getClass(), "degree", null);
        setField(term97258, term97258.getClass(), "adjList", null);
        setField(term97258, term97258.getClass(), "adjPos", null);
        setField(term97258, term97258.getClass(), "vertexWeight", null);
        setIntField(term97258, term97258.getClass(), "vertexDataSize", 0);
        setField(term97258, term97258.getClass(), "edgeData", null);
        setIntField(term97258, term97258.getClass(), "edgeDataSize", 0);
        setField(term97258, term97258.getClass(), "vertexLabel", null);
        setField(term97258, term97258.getClass(), "edgeLabel", null);
        setField(term97258, term97258.getClass(), "vertexIndex", null);
        setField(term97258, term97258.getClass(), "adjSet", null);
        setField(term97258, term97258.getClass(), "adjMap", null);
        setField(term97258, term97258.getClass(), "maxVertexNumber", null);
        setField(term97258, term97258.getClass(), "labelVertexMap", null);
        setField(term97258, term97258.getClass(), "labelEdgeMap", null);
        setBooleanField(term97258, term97258.getClass(), "directed", false);
        setBooleanField(term97258, term97258.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97258, term97258.getClass(), "allowingSelfLoops", false);
        setIntField(term97258, term97258.getClass(), "avgDegree", 0);
        setBooleanField(term97258, term97258.getClass(), "safeMode", false);
        term97271 = new Integer(0);
        term97273 = new Integer(0);
        term97275 = new Boolean(false);
        term97277 = new Boolean(false);
        term97279 = new Boolean(false);
        term97281 = new Integer(0);
        term97283 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
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
        args[1] = term97271;
        args[2] = term97273;
        args[3] = term97275;
        args[4] = term97277;
        args[5] = term97279;
        args[6] = term97281;
        args[7] = term97283;
        callMethod(klass, "newInstance", argTypes, term97258, args);
    }

};


