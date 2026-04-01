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
     Object term133644;
     Object term133655;
     Object term133657;
     Object term133659;
     Object term133661;
     Object term133663;
     Object term133665;
     Object term133667;

    public DirectedMultigraphImpl_newInstance_53340551613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133644 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133644, term133644.getClass(), "predList", null);
        setField(term133644, term133644.getClass(), "predPos", null);
        setField(term133644, term133644.getClass(), "indegree", null);
        setField(term133644, term133644.getClass(), "name", null);
        setIntField(term133644, term133644.getClass(), "maxVertices", 0);
        setIntField(term133644, term133644.getClass(), "numVertices", 0);
        setLongField(term133644, term133644.getClass(), "numEdges", 0L);
        setField(term133644, term133644.getClass(), "vertices", null);
        setField(term133644, term133644.getClass(), "degree", null);
        setField(term133644, term133644.getClass(), "adjList", null);
        setField(term133644, term133644.getClass(), "adjPos", null);
        setField(term133644, term133644.getClass(), "vertexWeight", null);
        setIntField(term133644, term133644.getClass(), "vertexDataSize", 0);
        setField(term133644, term133644.getClass(), "edgeData", null);
        setIntField(term133644, term133644.getClass(), "edgeDataSize", 0);
        setField(term133644, term133644.getClass(), "vertexLabel", null);
        setField(term133644, term133644.getClass(), "edgeLabel", null);
        setField(term133644, term133644.getClass(), "vertexIndex", null);
        setField(term133644, term133644.getClass(), "adjSet", null);
        setField(term133644, term133644.getClass(), "adjMap", null);
        setField(term133644, term133644.getClass(), "maxVertexNumber", null);
        setField(term133644, term133644.getClass(), "labelVertexMap", null);
        setField(term133644, term133644.getClass(), "labelEdgeMap", null);
        setBooleanField(term133644, term133644.getClass(), "directed", false);
        setBooleanField(term133644, term133644.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133644, term133644.getClass(), "allowingSelfLoops", false);
        setIntField(term133644, term133644.getClass(), "avgDegree", 0);
        setBooleanField(term133644, term133644.getClass(), "safeMode", false);
        term133655 = new Integer(0);
        term133657 = new Integer(0);
        term133659 = new Boolean(false);
        term133661 = new Boolean(false);
        term133663 = new Boolean(false);
        term133665 = new Integer(0);
        term133667 = new Integer(0);
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
        args[1] = term133655;
        args[2] = term133657;
        args[3] = term133659;
        args[4] = term133661;
        args[5] = term133663;
        args[6] = term133665;
        args[7] = term133667;
        callMethod(klass, "newInstance", argTypes, term133644, args);
    }

};


