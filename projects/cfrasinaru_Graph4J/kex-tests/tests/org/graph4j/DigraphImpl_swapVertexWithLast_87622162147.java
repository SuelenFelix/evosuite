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

public class DigraphImpl_swapVertexWithLast_87622162147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172451;
     Object term172462;

    public DigraphImpl_swapVertexWithLast_87622162147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172451 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172451, term172451.getClass(), "predList", null);
        setField(term172451, term172451.getClass(), "predPos", null);
        setField(term172451, term172451.getClass(), "indegree", null);
        setField(term172451, term172451.getClass(), "name", null);
        setIntField(term172451, term172451.getClass(), "maxVertices", 0);
        setIntField(term172451, term172451.getClass(), "numVertices", 0);
        setLongField(term172451, term172451.getClass(), "numEdges", 0L);
        setField(term172451, term172451.getClass(), "vertices", null);
        setField(term172451, term172451.getClass(), "degree", null);
        setField(term172451, term172451.getClass(), "adjList", null);
        setField(term172451, term172451.getClass(), "adjPos", null);
        setField(term172451, term172451.getClass(), "vertexWeight", null);
        setIntField(term172451, term172451.getClass(), "vertexDataSize", 0);
        setField(term172451, term172451.getClass(), "edgeData", null);
        setIntField(term172451, term172451.getClass(), "edgeDataSize", 0);
        setField(term172451, term172451.getClass(), "vertexLabel", null);
        setField(term172451, term172451.getClass(), "edgeLabel", null);
        setField(term172451, term172451.getClass(), "vertexIndex", null);
        setField(term172451, term172451.getClass(), "adjSet", null);
        setField(term172451, term172451.getClass(), "adjMap", null);
        setField(term172451, term172451.getClass(), "maxVertexNumber", null);
        setField(term172451, term172451.getClass(), "labelVertexMap", null);
        setField(term172451, term172451.getClass(), "labelEdgeMap", null);
        setBooleanField(term172451, term172451.getClass(), "directed", false);
        setBooleanField(term172451, term172451.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172451, term172451.getClass(), "allowingSelfLoops", false);
        setIntField(term172451, term172451.getClass(), "avgDegree", 0);
        setBooleanField(term172451, term172451.getClass(), "safeMode", false);
        term172462 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term172462;
        callMethod(klass, "swapVertexWithLast", argTypes, term172451, args);
    }

};


