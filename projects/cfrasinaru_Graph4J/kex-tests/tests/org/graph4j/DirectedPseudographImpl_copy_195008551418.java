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

public class DirectedPseudographImpl_copy_195008551418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84828;
     Object term84839;
     Object term84841;
     Object term84843;
     Object term84845;
     Object term84847;

    public DirectedPseudographImpl_copy_195008551418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84828 = newInstance(Class.forName("org.graph4j.DirectedPseudographImpl"));
        setField(term84828, term84828.getClass(), "selfLoops", null);
        setField(term84828, term84828.getClass(), "predList", null);
        setField(term84828, term84828.getClass(), "predPos", null);
        setField(term84828, term84828.getClass(), "indegree", null);
        setField(term84828, term84828.getClass(), "name", null);
        setIntField(term84828, term84828.getClass(), "maxVertices", 0);
        setIntField(term84828, term84828.getClass(), "numVertices", 0);
        setLongField(term84828, term84828.getClass(), "numEdges", 0L);
        setField(term84828, term84828.getClass(), "vertices", null);
        setField(term84828, term84828.getClass(), "degree", null);
        setField(term84828, term84828.getClass(), "adjList", null);
        setField(term84828, term84828.getClass(), "adjPos", null);
        setField(term84828, term84828.getClass(), "vertexWeight", null);
        setIntField(term84828, term84828.getClass(), "vertexDataSize", 0);
        setField(term84828, term84828.getClass(), "edgeData", null);
        setIntField(term84828, term84828.getClass(), "edgeDataSize", 0);
        setField(term84828, term84828.getClass(), "vertexLabel", null);
        setField(term84828, term84828.getClass(), "edgeLabel", null);
        setField(term84828, term84828.getClass(), "vertexIndex", null);
        setField(term84828, term84828.getClass(), "adjSet", null);
        setField(term84828, term84828.getClass(), "adjMap", null);
        setField(term84828, term84828.getClass(), "maxVertexNumber", null);
        setField(term84828, term84828.getClass(), "labelVertexMap", null);
        setField(term84828, term84828.getClass(), "labelEdgeMap", null);
        setBooleanField(term84828, term84828.getClass(), "directed", false);
        setBooleanField(term84828, term84828.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term84828, term84828.getClass(), "allowingSelfLoops", false);
        setIntField(term84828, term84828.getClass(), "avgDegree", 0);
        setBooleanField(term84828, term84828.getClass(), "safeMode", false);
        term84839 = new Boolean(false);
        term84841 = new Boolean(false);
        term84843 = new Boolean(false);
        term84845 = new Boolean(false);
        term84847 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term84839;
        args[1] = term84841;
        args[2] = term84843;
        args[3] = term84845;
        args[4] = term84847;
        callMethod(klass, "copy", argTypes, term84828, args);
    }

};


