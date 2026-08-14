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

public class DirectedPseudographImpl_newInstance_164119054015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84781;

    public DirectedPseudographImpl_newInstance_164119054015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84781 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84781, term84781.getClass(), "selfLoops", null);
        setField(term84781, term84781.getClass(), "predList", null);
        setField(term84781, term84781.getClass(), "predPos", null);
        setField(term84781, term84781.getClass(), "indegree", null);
        setField(term84781, term84781.getClass(), "name", null);
        setIntField(term84781, term84781.getClass(), "maxVertices", 0);
        setIntField(term84781, term84781.getClass(), "numVertices", 0);
        setLongField(term84781, term84781.getClass(), "numEdges", 0L);
        setField(term84781, term84781.getClass(), "vertices", null);
        setField(term84781, term84781.getClass(), "degree", null);
        setField(term84781, term84781.getClass(), "adjList", null);
        setField(term84781, term84781.getClass(), "adjPos", null);
        setField(term84781, term84781.getClass(), "vertexWeight", null);
        setIntField(term84781, term84781.getClass(), "vertexDataSize", 0);
        setField(term84781, term84781.getClass(), "edgeData", null);
        setIntField(term84781, term84781.getClass(), "edgeDataSize", 0);
        setField(term84781, term84781.getClass(), "vertexLabel", null);
        setField(term84781, term84781.getClass(), "edgeLabel", null);
        setField(term84781, term84781.getClass(), "vertexIndex", null);
        setField(term84781, term84781.getClass(), "adjSet", null);
        setField(term84781, term84781.getClass(), "adjMap", null);
        setField(term84781, term84781.getClass(), "maxVertexNumber", null);
        setField(term84781, term84781.getClass(), "labelVertexMap", null);
        setField(term84781, term84781.getClass(), "labelEdgeMap", null);
        setBooleanField(term84781, term84781.getClass(), "directed", false);
        setBooleanField(term84781, term84781.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84781, term84781.getClass(), "allowingSelfLoops", false);
        setIntField(term84781, term84781.getClass(), "avgDegree", 0);
        setBooleanField(term84781, term84781.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term84781, args);
    }

};


