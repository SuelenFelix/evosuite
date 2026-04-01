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

public class DigraphImpl_predListPosOf_211105607241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172375;
     Object term172386;
     Object term172388;

    public DigraphImpl_predListPosOf_211105607241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172375 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172375, term172375.getClass(), "predList", null);
        setField(term172375, term172375.getClass(), "predPos", null);
        setField(term172375, term172375.getClass(), "indegree", null);
        setField(term172375, term172375.getClass(), "name", null);
        setIntField(term172375, term172375.getClass(), "maxVertices", 0);
        setIntField(term172375, term172375.getClass(), "numVertices", 0);
        setLongField(term172375, term172375.getClass(), "numEdges", 0L);
        setField(term172375, term172375.getClass(), "vertices", null);
        setField(term172375, term172375.getClass(), "degree", null);
        setField(term172375, term172375.getClass(), "adjList", null);
        setField(term172375, term172375.getClass(), "adjPos", null);
        setField(term172375, term172375.getClass(), "vertexWeight", null);
        setIntField(term172375, term172375.getClass(), "vertexDataSize", 0);
        setField(term172375, term172375.getClass(), "edgeData", null);
        setIntField(term172375, term172375.getClass(), "edgeDataSize", 0);
        setField(term172375, term172375.getClass(), "vertexLabel", null);
        setField(term172375, term172375.getClass(), "edgeLabel", null);
        setField(term172375, term172375.getClass(), "vertexIndex", null);
        setField(term172375, term172375.getClass(), "adjSet", null);
        setField(term172375, term172375.getClass(), "adjMap", null);
        setField(term172375, term172375.getClass(), "maxVertexNumber", null);
        setField(term172375, term172375.getClass(), "labelVertexMap", null);
        setField(term172375, term172375.getClass(), "labelEdgeMap", null);
        setBooleanField(term172375, term172375.getClass(), "directed", false);
        setBooleanField(term172375, term172375.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172375, term172375.getClass(), "allowingSelfLoops", false);
        setIntField(term172375, term172375.getClass(), "avgDegree", 0);
        setBooleanField(term172375, term172375.getClass(), "safeMode", false);
        term172386 = new Integer(0);
        term172388 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172386;
        args[1] = term172388;
        callMethod(klass, "predListPosOf", argTypes, term172375, args);
    }

};


