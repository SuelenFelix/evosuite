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

public class PseudographImpl_addEdge_36238348520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118483;
     Object term118494;
     Object term118496;

    public PseudographImpl_addEdge_36238348520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118483 = newInstance(Class.forName("org.graph4j.PseudographImpl"));
        setField(term118483, term118483.getClass(), "selfLoops", null);
        setField(term118483, term118483.getClass(), "name", null);
        setIntField(term118483, term118483.getClass(), "maxVertices", 0);
        setIntField(term118483, term118483.getClass(), "numVertices", 0);
        setLongField(term118483, term118483.getClass(), "numEdges", 0L);
        setField(term118483, term118483.getClass(), "vertices", null);
        setField(term118483, term118483.getClass(), "degree", null);
        setField(term118483, term118483.getClass(), "adjList", null);
        setField(term118483, term118483.getClass(), "adjPos", null);
        setField(term118483, term118483.getClass(), "vertexWeight", null);
        setIntField(term118483, term118483.getClass(), "vertexDataSize", 0);
        setField(term118483, term118483.getClass(), "edgeData", null);
        setIntField(term118483, term118483.getClass(), "edgeDataSize", 0);
        setField(term118483, term118483.getClass(), "vertexLabel", null);
        setField(term118483, term118483.getClass(), "edgeLabel", null);
        setField(term118483, term118483.getClass(), "vertexIndex", null);
        setField(term118483, term118483.getClass(), "adjSet", null);
        setField(term118483, term118483.getClass(), "adjMap", null);
        setField(term118483, term118483.getClass(), "maxVertexNumber", null);
        setField(term118483, term118483.getClass(), "labelVertexMap", null);
        setField(term118483, term118483.getClass(), "labelEdgeMap", null);
        setBooleanField(term118483, term118483.getClass(), "directed", false);
        setBooleanField(term118483, term118483.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term118483, term118483.getClass(), "allowingSelfLoops", false);
        setIntField(term118483, term118483.getClass(), "avgDegree", 0);
        setBooleanField(term118483, term118483.getClass(), "safeMode", false);
        term118494 = new Integer(0);
        term118496 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term118494;
        args[1] = term118496;
        callMethod(klass, "addEdge", argTypes, term118483, args);
    }

};


