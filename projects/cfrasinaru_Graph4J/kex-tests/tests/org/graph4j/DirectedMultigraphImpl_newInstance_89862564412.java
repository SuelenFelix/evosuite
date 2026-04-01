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

public class DirectedMultigraphImpl_newInstance_89862564412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133633;

    public DirectedMultigraphImpl_newInstance_89862564412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133633 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133633, term133633.getClass(), "predList", null);
        setField(term133633, term133633.getClass(), "predPos", null);
        setField(term133633, term133633.getClass(), "indegree", null);
        setField(term133633, term133633.getClass(), "name", null);
        setIntField(term133633, term133633.getClass(), "maxVertices", 0);
        setIntField(term133633, term133633.getClass(), "numVertices", 0);
        setLongField(term133633, term133633.getClass(), "numEdges", 0L);
        setField(term133633, term133633.getClass(), "vertices", null);
        setField(term133633, term133633.getClass(), "degree", null);
        setField(term133633, term133633.getClass(), "adjList", null);
        setField(term133633, term133633.getClass(), "adjPos", null);
        setField(term133633, term133633.getClass(), "vertexWeight", null);
        setIntField(term133633, term133633.getClass(), "vertexDataSize", 0);
        setField(term133633, term133633.getClass(), "edgeData", null);
        setIntField(term133633, term133633.getClass(), "edgeDataSize", 0);
        setField(term133633, term133633.getClass(), "vertexLabel", null);
        setField(term133633, term133633.getClass(), "edgeLabel", null);
        setField(term133633, term133633.getClass(), "vertexIndex", null);
        setField(term133633, term133633.getClass(), "adjSet", null);
        setField(term133633, term133633.getClass(), "adjMap", null);
        setField(term133633, term133633.getClass(), "maxVertexNumber", null);
        setField(term133633, term133633.getClass(), "labelVertexMap", null);
        setField(term133633, term133633.getClass(), "labelEdgeMap", null);
        setBooleanField(term133633, term133633.getClass(), "directed", false);
        setBooleanField(term133633, term133633.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133633, term133633.getClass(), "allowingSelfLoops", false);
        setIntField(term133633, term133633.getClass(), "avgDegree", 0);
        setBooleanField(term133633, term133633.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term133633, args);
    }

};


