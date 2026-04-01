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

public class NetworkImpl_newInstance_158673607625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97245;

    public NetworkImpl_newInstance_158673607625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97245 = newInstance(Class.forName("org.graph4j.NetworkImpl"));
        setIntField(term97245, term97245.getClass(), "source", 0);
        setIntField(term97245, term97245.getClass(), "sink", 0);
        setField(term97245, term97245.getClass(), "predList", null);
        setField(term97245, term97245.getClass(), "predPos", null);
        setField(term97245, term97245.getClass(), "indegree", null);
        setField(term97245, term97245.getClass(), "name", null);
        setIntField(term97245, term97245.getClass(), "maxVertices", 0);
        setIntField(term97245, term97245.getClass(), "numVertices", 0);
        setLongField(term97245, term97245.getClass(), "numEdges", 0L);
        setField(term97245, term97245.getClass(), "vertices", null);
        setField(term97245, term97245.getClass(), "degree", null);
        setField(term97245, term97245.getClass(), "adjList", null);
        setField(term97245, term97245.getClass(), "adjPos", null);
        setField(term97245, term97245.getClass(), "vertexWeight", null);
        setIntField(term97245, term97245.getClass(), "vertexDataSize", 0);
        setField(term97245, term97245.getClass(), "edgeData", null);
        setIntField(term97245, term97245.getClass(), "edgeDataSize", 0);
        setField(term97245, term97245.getClass(), "vertexLabel", null);
        setField(term97245, term97245.getClass(), "edgeLabel", null);
        setField(term97245, term97245.getClass(), "vertexIndex", null);
        setField(term97245, term97245.getClass(), "adjSet", null);
        setField(term97245, term97245.getClass(), "adjMap", null);
        setField(term97245, term97245.getClass(), "maxVertexNumber", null);
        setField(term97245, term97245.getClass(), "labelVertexMap", null);
        setField(term97245, term97245.getClass(), "labelEdgeMap", null);
        setBooleanField(term97245, term97245.getClass(), "directed", false);
        setBooleanField(term97245, term97245.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term97245, term97245.getClass(), "allowingSelfLoops", false);
        setIntField(term97245, term97245.getClass(), "avgDegree", 0);
        setBooleanField(term97245, term97245.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term97245, args);
    }

};


