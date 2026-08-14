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

public class DirectedPseudographImpl_selfLoops_146646878222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84884;
     Object term84895;

    public DirectedPseudographImpl_selfLoops_146646878222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84884 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84884, term84884.getClass(), "selfLoops", null);
        setField(term84884, term84884.getClass(), "predList", null);
        setField(term84884, term84884.getClass(), "predPos", null);
        setField(term84884, term84884.getClass(), "indegree", null);
        setField(term84884, term84884.getClass(), "name", null);
        setIntField(term84884, term84884.getClass(), "maxVertices", 0);
        setIntField(term84884, term84884.getClass(), "numVertices", 0);
        setLongField(term84884, term84884.getClass(), "numEdges", 0L);
        setField(term84884, term84884.getClass(), "vertices", null);
        setField(term84884, term84884.getClass(), "degree", null);
        setField(term84884, term84884.getClass(), "adjList", null);
        setField(term84884, term84884.getClass(), "adjPos", null);
        setField(term84884, term84884.getClass(), "vertexWeight", null);
        setIntField(term84884, term84884.getClass(), "vertexDataSize", 0);
        setField(term84884, term84884.getClass(), "edgeData", null);
        setIntField(term84884, term84884.getClass(), "edgeDataSize", 0);
        setField(term84884, term84884.getClass(), "vertexLabel", null);
        setField(term84884, term84884.getClass(), "edgeLabel", null);
        setField(term84884, term84884.getClass(), "vertexIndex", null);
        setField(term84884, term84884.getClass(), "adjSet", null);
        setField(term84884, term84884.getClass(), "adjMap", null);
        setField(term84884, term84884.getClass(), "maxVertexNumber", null);
        setField(term84884, term84884.getClass(), "labelVertexMap", null);
        setField(term84884, term84884.getClass(), "labelEdgeMap", null);
        setBooleanField(term84884, term84884.getClass(), "directed", false);
        setBooleanField(term84884, term84884.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84884, term84884.getClass(), "allowingSelfLoops", false);
        setIntField(term84884, term84884.getClass(), "avgDegree", 0);
        setBooleanField(term84884, term84884.getClass(), "safeMode", false);
        term84895 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84895;
        callMethod(klass, "selfLoops", argTypes, term84884, args);
    }

};


