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

public class DirectedMultigraphImpl_copy_93693007015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133683;
     Object term133694;
     Object term133696;
     Object term133698;
     Object term133700;
     Object term133702;

    public DirectedMultigraphImpl_copy_93693007015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133683 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133683, term133683.getClass(), "predList", null);
        setField(term133683, term133683.getClass(), "predPos", null);
        setField(term133683, term133683.getClass(), "indegree", null);
        setField(term133683, term133683.getClass(), "name", null);
        setIntField(term133683, term133683.getClass(), "maxVertices", 0);
        setIntField(term133683, term133683.getClass(), "numVertices", 0);
        setLongField(term133683, term133683.getClass(), "numEdges", 0L);
        setField(term133683, term133683.getClass(), "vertices", null);
        setField(term133683, term133683.getClass(), "degree", null);
        setField(term133683, term133683.getClass(), "adjList", null);
        setField(term133683, term133683.getClass(), "adjPos", null);
        setField(term133683, term133683.getClass(), "vertexWeight", null);
        setIntField(term133683, term133683.getClass(), "vertexDataSize", 0);
        setField(term133683, term133683.getClass(), "edgeData", null);
        setIntField(term133683, term133683.getClass(), "edgeDataSize", 0);
        setField(term133683, term133683.getClass(), "vertexLabel", null);
        setField(term133683, term133683.getClass(), "edgeLabel", null);
        setField(term133683, term133683.getClass(), "vertexIndex", null);
        setField(term133683, term133683.getClass(), "adjSet", null);
        setField(term133683, term133683.getClass(), "adjMap", null);
        setField(term133683, term133683.getClass(), "maxVertexNumber", null);
        setField(term133683, term133683.getClass(), "labelVertexMap", null);
        setField(term133683, term133683.getClass(), "labelEdgeMap", null);
        setBooleanField(term133683, term133683.getClass(), "directed", false);
        setBooleanField(term133683, term133683.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133683, term133683.getClass(), "allowingSelfLoops", false);
        setIntField(term133683, term133683.getClass(), "avgDegree", 0);
        setBooleanField(term133683, term133683.getClass(), "safeMode", false);
        term133694 = new Boolean(false);
        term133696 = new Boolean(false);
        term133698 = new Boolean(false);
        term133700 = new Boolean(false);
        term133702 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term133694;
        args[1] = term133696;
        args[2] = term133698;
        args[3] = term133700;
        args[4] = term133702;
        callMethod(klass, "copy", argTypes, term133683, args);
    }

};


