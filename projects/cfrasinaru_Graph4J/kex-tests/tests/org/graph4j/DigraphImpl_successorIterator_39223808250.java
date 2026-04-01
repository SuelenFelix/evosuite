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

public class DigraphImpl_successorIterator_39223808250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172486;
     Object term172497;
     Object term172499;

    public DigraphImpl_successorIterator_39223808250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172486 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172486, term172486.getClass(), "predList", null);
        setField(term172486, term172486.getClass(), "predPos", null);
        setField(term172486, term172486.getClass(), "indegree", null);
        setField(term172486, term172486.getClass(), "name", null);
        setIntField(term172486, term172486.getClass(), "maxVertices", 0);
        setIntField(term172486, term172486.getClass(), "numVertices", 0);
        setLongField(term172486, term172486.getClass(), "numEdges", 0L);
        setField(term172486, term172486.getClass(), "vertices", null);
        setField(term172486, term172486.getClass(), "degree", null);
        setField(term172486, term172486.getClass(), "adjList", null);
        setField(term172486, term172486.getClass(), "adjPos", null);
        setField(term172486, term172486.getClass(), "vertexWeight", null);
        setIntField(term172486, term172486.getClass(), "vertexDataSize", 0);
        setField(term172486, term172486.getClass(), "edgeData", null);
        setIntField(term172486, term172486.getClass(), "edgeDataSize", 0);
        setField(term172486, term172486.getClass(), "vertexLabel", null);
        setField(term172486, term172486.getClass(), "edgeLabel", null);
        setField(term172486, term172486.getClass(), "vertexIndex", null);
        setField(term172486, term172486.getClass(), "adjSet", null);
        setField(term172486, term172486.getClass(), "adjMap", null);
        setField(term172486, term172486.getClass(), "maxVertexNumber", null);
        setField(term172486, term172486.getClass(), "labelVertexMap", null);
        setField(term172486, term172486.getClass(), "labelEdgeMap", null);
        setBooleanField(term172486, term172486.getClass(), "directed", false);
        setBooleanField(term172486, term172486.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172486, term172486.getClass(), "allowingSelfLoops", false);
        setIntField(term172486, term172486.getClass(), "avgDegree", 0);
        setBooleanField(term172486, term172486.getClass(), "safeMode", false);
        term172497 = new Integer(0);
        term172499 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term172497;
        args[1] = term172499;
        callMethod(klass, "successorIterator", argTypes, term172486, args);
    }

};


