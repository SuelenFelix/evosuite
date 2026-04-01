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

public class DirectedPseudographImpl_complement_209250668320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84857;

    public DirectedPseudographImpl_complement_209250668320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84857 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84857, term84857.getClass(), "selfLoops", null);
        setField(term84857, term84857.getClass(), "predList", null);
        setField(term84857, term84857.getClass(), "predPos", null);
        setField(term84857, term84857.getClass(), "indegree", null);
        setField(term84857, term84857.getClass(), "name", null);
        setIntField(term84857, term84857.getClass(), "maxVertices", 0);
        setIntField(term84857, term84857.getClass(), "numVertices", 0);
        setLongField(term84857, term84857.getClass(), "numEdges", 0L);
        setField(term84857, term84857.getClass(), "vertices", null);
        setField(term84857, term84857.getClass(), "degree", null);
        setField(term84857, term84857.getClass(), "adjList", null);
        setField(term84857, term84857.getClass(), "adjPos", null);
        setField(term84857, term84857.getClass(), "vertexWeight", null);
        setIntField(term84857, term84857.getClass(), "vertexDataSize", 0);
        setField(term84857, term84857.getClass(), "edgeData", null);
        setIntField(term84857, term84857.getClass(), "edgeDataSize", 0);
        setField(term84857, term84857.getClass(), "vertexLabel", null);
        setField(term84857, term84857.getClass(), "edgeLabel", null);
        setField(term84857, term84857.getClass(), "vertexIndex", null);
        setField(term84857, term84857.getClass(), "adjSet", null);
        setField(term84857, term84857.getClass(), "adjMap", null);
        setField(term84857, term84857.getClass(), "maxVertexNumber", null);
        setField(term84857, term84857.getClass(), "labelVertexMap", null);
        setField(term84857, term84857.getClass(), "labelEdgeMap", null);
        setBooleanField(term84857, term84857.getClass(), "directed", false);
        setBooleanField(term84857, term84857.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84857, term84857.getClass(), "allowingSelfLoops", false);
        setIntField(term84857, term84857.getClass(), "avgDegree", 0);
        setBooleanField(term84857, term84857.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "complement", argTypes, term84857, args);
    }

};


