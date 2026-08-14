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

public class DirectedMultigraphImpl_newInstance_53340551613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133647;
     Object term133658;
     Object term133660;
     Object term133662;
     Object term133664;
     Object term133666;
     Object term133668;
     Object term133670;

    public DirectedMultigraphImpl_newInstance_53340551613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133647 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133647, term133647.getClass(), "predList", null);
        setField(term133647, term133647.getClass(), "predPos", null);
        setField(term133647, term133647.getClass(), "indegree", null);
        setField(term133647, term133647.getClass(), "name", null);
        setIntField(term133647, term133647.getClass(), "maxVertices", 0);
        setIntField(term133647, term133647.getClass(), "numVertices", 0);
        setLongField(term133647, term133647.getClass(), "numEdges", 0L);
        setField(term133647, term133647.getClass(), "vertices", null);
        setField(term133647, term133647.getClass(), "degree", null);
        setField(term133647, term133647.getClass(), "adjList", null);
        setField(term133647, term133647.getClass(), "adjPos", null);
        setField(term133647, term133647.getClass(), "vertexWeight", null);
        setIntField(term133647, term133647.getClass(), "vertexDataSize", 0);
        setField(term133647, term133647.getClass(), "edgeData", null);
        setIntField(term133647, term133647.getClass(), "edgeDataSize", 0);
        setField(term133647, term133647.getClass(), "vertexLabel", null);
        setField(term133647, term133647.getClass(), "edgeLabel", null);
        setField(term133647, term133647.getClass(), "vertexIndex", null);
        setField(term133647, term133647.getClass(), "adjSet", null);
        setField(term133647, term133647.getClass(), "adjMap", null);
        setField(term133647, term133647.getClass(), "maxVertexNumber", null);
        setField(term133647, term133647.getClass(), "labelVertexMap", null);
        setField(term133647, term133647.getClass(), "labelEdgeMap", null);
        setBooleanField(term133647, term133647.getClass(), "directed", false);
        setBooleanField(term133647, term133647.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133647, term133647.getClass(), "allowingSelfLoops", false);
        setIntField(term133647, term133647.getClass(), "avgDegree", 0);
        setBooleanField(term133647, term133647.getClass(), "safeMode", false);
        term133658 = new Integer(0);
        term133660 = new Integer(0);
        term133662 = new Boolean(false);
        term133664 = new Boolean(false);
        term133666 = new Boolean(false);
        term133668 = new Integer(0);
        term133670 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
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
        args[1] = term133658;
        args[2] = term133660;
        args[3] = term133662;
        args[4] = term133664;
        args[5] = term133666;
        args[6] = term133668;
        args[7] = term133670;
        callMethod(klass, "newInstance", argTypes, term133647, args);
    }

};


