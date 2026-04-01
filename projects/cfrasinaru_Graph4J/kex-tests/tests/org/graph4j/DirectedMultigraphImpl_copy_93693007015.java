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
import java.lang.Boolean;

public class DirectedMultigraphImpl_copy_93693007015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133680;
     Object term133691;
     Object term133693;
     Object term133695;
     Object term133697;
     Object term133699;

    public DirectedMultigraphImpl_copy_93693007015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133680 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133680, term133680.getClass(), "predList", null);
        setField(term133680, term133680.getClass(), "predPos", null);
        setField(term133680, term133680.getClass(), "indegree", null);
        setField(term133680, term133680.getClass(), "name", null);
        setIntField(term133680, term133680.getClass(), "maxVertices", 0);
        setIntField(term133680, term133680.getClass(), "numVertices", 0);
        setLongField(term133680, term133680.getClass(), "numEdges", 0L);
        setField(term133680, term133680.getClass(), "vertices", null);
        setField(term133680, term133680.getClass(), "degree", null);
        setField(term133680, term133680.getClass(), "adjList", null);
        setField(term133680, term133680.getClass(), "adjPos", null);
        setField(term133680, term133680.getClass(), "vertexWeight", null);
        setIntField(term133680, term133680.getClass(), "vertexDataSize", 0);
        setField(term133680, term133680.getClass(), "edgeData", null);
        setIntField(term133680, term133680.getClass(), "edgeDataSize", 0);
        setField(term133680, term133680.getClass(), "vertexLabel", null);
        setField(term133680, term133680.getClass(), "edgeLabel", null);
        setField(term133680, term133680.getClass(), "vertexIndex", null);
        setField(term133680, term133680.getClass(), "adjSet", null);
        setField(term133680, term133680.getClass(), "adjMap", null);
        setField(term133680, term133680.getClass(), "maxVertexNumber", null);
        setField(term133680, term133680.getClass(), "labelVertexMap", null);
        setField(term133680, term133680.getClass(), "labelEdgeMap", null);
        setBooleanField(term133680, term133680.getClass(), "directed", false);
        setBooleanField(term133680, term133680.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133680, term133680.getClass(), "allowingSelfLoops", false);
        setIntField(term133680, term133680.getClass(), "avgDegree", 0);
        setBooleanField(term133680, term133680.getClass(), "safeMode", false);
        term133691 = new Boolean(false);
        term133693 = new Boolean(false);
        term133695 = new Boolean(false);
        term133697 = new Boolean(false);
        term133699 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term133691;
        args[1] = term133693;
        args[2] = term133695;
        args[3] = term133697;
        args[4] = term133699;
        callMethod(klass, "copy", argTypes, term133680, args);
    }

};


