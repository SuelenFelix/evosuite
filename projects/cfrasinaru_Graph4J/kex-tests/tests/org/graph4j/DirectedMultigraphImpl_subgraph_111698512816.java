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

public class DirectedMultigraphImpl_subgraph_111698512816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133704;

    public DirectedMultigraphImpl_subgraph_111698512816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133704 = newInstance(Class.forName("org.graph4j.DirectedMultigraphImpl"));
        setField(term133704, term133704.getClass(), "predList", null);
        setField(term133704, term133704.getClass(), "predPos", null);
        setField(term133704, term133704.getClass(), "indegree", null);
        setField(term133704, term133704.getClass(), "name", null);
        setIntField(term133704, term133704.getClass(), "maxVertices", 0);
        setIntField(term133704, term133704.getClass(), "numVertices", 0);
        setLongField(term133704, term133704.getClass(), "numEdges", 0L);
        setField(term133704, term133704.getClass(), "vertices", null);
        setField(term133704, term133704.getClass(), "degree", null);
        setField(term133704, term133704.getClass(), "adjList", null);
        setField(term133704, term133704.getClass(), "adjPos", null);
        setField(term133704, term133704.getClass(), "vertexWeight", null);
        setIntField(term133704, term133704.getClass(), "vertexDataSize", 0);
        setField(term133704, term133704.getClass(), "edgeData", null);
        setIntField(term133704, term133704.getClass(), "edgeDataSize", 0);
        setField(term133704, term133704.getClass(), "vertexLabel", null);
        setField(term133704, term133704.getClass(), "edgeLabel", null);
        setField(term133704, term133704.getClass(), "vertexIndex", null);
        setField(term133704, term133704.getClass(), "adjSet", null);
        setField(term133704, term133704.getClass(), "adjMap", null);
        setField(term133704, term133704.getClass(), "maxVertexNumber", null);
        setField(term133704, term133704.getClass(), "labelVertexMap", null);
        setField(term133704, term133704.getClass(), "labelEdgeMap", null);
        setBooleanField(term133704, term133704.getClass(), "directed", false);
        setBooleanField(term133704, term133704.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term133704, term133704.getClass(), "allowingSelfLoops", false);
        setIntField(term133704, term133704.getClass(), "avgDegree", 0);
        setBooleanField(term133704, term133704.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subgraph", argTypes, term133704, args);
    }

};


