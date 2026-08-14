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
     Object term97261;
     Object term97274;
     Object term97276;
     Object term97278;
     Object term97280;
     Object term97282;
     Object term97284;
     Object term97286;

    public NetworkImpl_newInstance_122151594826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97261 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97261, term97261.getClass(), "source", 0);
        setIntField(term97261, term97261.getClass(), "sink", 0);
        setField(term97261, term97261.getClass(), "predList", null);
        setField(term97261, term97261.getClass(), "predPos", null);
        setField(term97261, term97261.getClass(), "indegree", null);
        setField(term97261, term97261.getClass(), "name", null);
        setIntField(term97261, term97261.getClass(), "maxVertices", 0);
        setIntField(term97261, term97261.getClass(), "numVertices", 0);
        setLongField(term97261, term97261.getClass(), "numEdges", 0L);
        setField(term97261, term97261.getClass(), "vertices", null);
        setField(term97261, term97261.getClass(), "degree", null);
        setField(term97261, term97261.getClass(), "adjList", null);
        setField(term97261, term97261.getClass(), "adjPos", null);
        setField(term97261, term97261.getClass(), "vertexWeight", null);
        setIntField(term97261, term97261.getClass(), "vertexDataSize", 0);
        setField(term97261, term97261.getClass(), "edgeData", null);
        setIntField(term97261, term97261.getClass(), "edgeDataSize", 0);
        setField(term97261, term97261.getClass(), "vertexLabel", null);
        setField(term97261, term97261.getClass(), "edgeLabel", null);
        setField(term97261, term97261.getClass(), "vertexIndex", null);
        setField(term97261, term97261.getClass(), "adjSet", null);
        setField(term97261, term97261.getClass(), "adjMap", null);
        setField(term97261, term97261.getClass(), "maxVertexNumber", null);
        setField(term97261, term97261.getClass(), "labelVertexMap", null);
        setField(term97261, term97261.getClass(), "labelEdgeMap", null);
        setBooleanField(term97261, term97261.getClass(), "directed", false);
        setBooleanField(term97261, term97261.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97261, term97261.getClass(), "allowingSelfLoops", false);
        setIntField(term97261, term97261.getClass(), "avgDegree", 0);
        setBooleanField(term97261, term97261.getClass(), "safeMode", false);
        term97274 = new Integer(0);
        term97276 = new Integer(0);
        term97278 = new Boolean(false);
        term97280 = new Boolean(false);
        term97282 = new Boolean(false);
        term97284 = new Integer(0);
        term97286 = new Integer(0);
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
        args[1] = term97274;
        args[2] = term97276;
        args[3] = term97278;
        args[4] = term97280;
        args[5] = term97282;
        args[6] = term97284;
        args[7] = term97286;
        callMethod(klass, "newInstance", argTypes, term97261, args);
    }

};


