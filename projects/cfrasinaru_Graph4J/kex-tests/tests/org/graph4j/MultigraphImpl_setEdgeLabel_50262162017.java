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

public class MultigraphImpl_setEdgeLabel_50262162017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127328;
     Object term127339;
     Object term127341;

    public MultigraphImpl_setEdgeLabel_50262162017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127328 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127328, term127328.getClass(), "name", null);
        setIntField(term127328, term127328.getClass(), "maxVertices", 0);
        setIntField(term127328, term127328.getClass(), "numVertices", 0);
        setLongField(term127328, term127328.getClass(), "numEdges", 0L);
        setField(term127328, term127328.getClass(), "vertices", null);
        setField(term127328, term127328.getClass(), "degree", null);
        setField(term127328, term127328.getClass(), "adjList", null);
        setField(term127328, term127328.getClass(), "adjPos", null);
        setField(term127328, term127328.getClass(), "vertexWeight", null);
        setIntField(term127328, term127328.getClass(), "vertexDataSize", 0);
        setField(term127328, term127328.getClass(), "edgeData", null);
        setIntField(term127328, term127328.getClass(), "edgeDataSize", 0);
        setField(term127328, term127328.getClass(), "vertexLabel", null);
        setField(term127328, term127328.getClass(), "edgeLabel", null);
        setField(term127328, term127328.getClass(), "vertexIndex", null);
        setField(term127328, term127328.getClass(), "adjSet", null);
        setField(term127328, term127328.getClass(), "adjMap", null);
        setField(term127328, term127328.getClass(), "maxVertexNumber", null);
        setField(term127328, term127328.getClass(), "labelVertexMap", null);
        setField(term127328, term127328.getClass(), "labelEdgeMap", null);
        setBooleanField(term127328, term127328.getClass(), "directed", false);
        setBooleanField(term127328, term127328.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127328, term127328.getClass(), "allowingSelfLoops", false);
        setIntField(term127328, term127328.getClass(), "avgDegree", 0);
        setBooleanField(term127328, term127328.getClass(), "safeMode", false);
        term127339 = new Integer(0);
        term127341 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term127339;
        args[1] = term127341;
        args[2] = null;
        callMethod(klass, "setEdgeLabel", argTypes, term127328, args);
    }

};


