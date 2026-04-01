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

public class DigraphImpl_copy_184437327034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172264;
     Object term172275;
     Object term172277;
     Object term172279;
     Object term172281;
     Object term172283;

    public DigraphImpl_copy_184437327034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172264 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172264, term172264.getClass(), "predList", null);
        setField(term172264, term172264.getClass(), "predPos", null);
        setField(term172264, term172264.getClass(), "indegree", null);
        setField(term172264, term172264.getClass(), "name", null);
        setIntField(term172264, term172264.getClass(), "maxVertices", 0);
        setIntField(term172264, term172264.getClass(), "numVertices", 0);
        setLongField(term172264, term172264.getClass(), "numEdges", 0L);
        setField(term172264, term172264.getClass(), "vertices", null);
        setField(term172264, term172264.getClass(), "degree", null);
        setField(term172264, term172264.getClass(), "adjList", null);
        setField(term172264, term172264.getClass(), "adjPos", null);
        setField(term172264, term172264.getClass(), "vertexWeight", null);
        setIntField(term172264, term172264.getClass(), "vertexDataSize", 0);
        setField(term172264, term172264.getClass(), "edgeData", null);
        setIntField(term172264, term172264.getClass(), "edgeDataSize", 0);
        setField(term172264, term172264.getClass(), "vertexLabel", null);
        setField(term172264, term172264.getClass(), "edgeLabel", null);
        setField(term172264, term172264.getClass(), "vertexIndex", null);
        setField(term172264, term172264.getClass(), "adjSet", null);
        setField(term172264, term172264.getClass(), "adjMap", null);
        setField(term172264, term172264.getClass(), "maxVertexNumber", null);
        setField(term172264, term172264.getClass(), "labelVertexMap", null);
        setField(term172264, term172264.getClass(), "labelEdgeMap", null);
        setBooleanField(term172264, term172264.getClass(), "directed", false);
        setBooleanField(term172264, term172264.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172264, term172264.getClass(), "allowingSelfLoops", false);
        setIntField(term172264, term172264.getClass(), "avgDegree", 0);
        setBooleanField(term172264, term172264.getClass(), "safeMode", false);
        term172275 = new Boolean(false);
        term172277 = new Boolean(false);
        term172279 = new Boolean(false);
        term172281 = new Boolean(false);
        term172283 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term172275;
        args[1] = term172277;
        args[2] = term172279;
        args[3] = term172281;
        args[4] = term172283;
        callMethod(klass, "copy", argTypes, term172264, args);
    }

};


