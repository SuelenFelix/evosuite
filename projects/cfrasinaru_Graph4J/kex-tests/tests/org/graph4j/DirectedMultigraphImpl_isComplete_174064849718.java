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

public class DirectedMultigraphImpl_isComplete_174064849718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133723;

    public DirectedMultigraphImpl_isComplete_174064849718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133723 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133723, term133723.getClass(), "predList", null);
        setField(term133723, term133723.getClass(), "predPos", null);
        setField(term133723, term133723.getClass(), "indegree", null);
        setField(term133723, term133723.getClass(), "name", null);
        setIntField(term133723, term133723.getClass(), "maxVertices", 0);
        setIntField(term133723, term133723.getClass(), "numVertices", 0);
        setLongField(term133723, term133723.getClass(), "numEdges", 0L);
        setField(term133723, term133723.getClass(), "vertices", null);
        setField(term133723, term133723.getClass(), "degree", null);
        setField(term133723, term133723.getClass(), "adjList", null);
        setField(term133723, term133723.getClass(), "adjPos", null);
        setField(term133723, term133723.getClass(), "vertexWeight", null);
        setIntField(term133723, term133723.getClass(), "vertexDataSize", 0);
        setField(term133723, term133723.getClass(), "edgeData", null);
        setIntField(term133723, term133723.getClass(), "edgeDataSize", 0);
        setField(term133723, term133723.getClass(), "vertexLabel", null);
        setField(term133723, term133723.getClass(), "edgeLabel", null);
        setField(term133723, term133723.getClass(), "vertexIndex", null);
        setField(term133723, term133723.getClass(), "adjSet", null);
        setField(term133723, term133723.getClass(), "adjMap", null);
        setField(term133723, term133723.getClass(), "maxVertexNumber", null);
        setField(term133723, term133723.getClass(), "labelVertexMap", null);
        setField(term133723, term133723.getClass(), "labelEdgeMap", null);
        setBooleanField(term133723, term133723.getClass(), "directed", false);
        setBooleanField(term133723, term133723.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133723, term133723.getClass(), "allowingSelfLoops", false);
        setIntField(term133723, term133723.getClass(), "avgDegree", 0);
        setBooleanField(term133723, term133723.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term133723, args);
    }

};


