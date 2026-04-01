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
import java.lang.Double;

public class MultigraphImpl_setEdgeWeight_62859150418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127340;
     Object term127351;
     Object term127353;
     Object term127355;

    public MultigraphImpl_setEdgeWeight_62859150418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127340 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127340, term127340.getClass(), "name", null);
        setIntField(term127340, term127340.getClass(), "maxVertices", 0);
        setIntField(term127340, term127340.getClass(), "numVertices", 0);
        setLongField(term127340, term127340.getClass(), "numEdges", 0L);
        setField(term127340, term127340.getClass(), "vertices", null);
        setField(term127340, term127340.getClass(), "degree", null);
        setField(term127340, term127340.getClass(), "adjList", null);
        setField(term127340, term127340.getClass(), "adjPos", null);
        setField(term127340, term127340.getClass(), "vertexWeight", null);
        setIntField(term127340, term127340.getClass(), "vertexDataSize", 0);
        setField(term127340, term127340.getClass(), "edgeData", null);
        setIntField(term127340, term127340.getClass(), "edgeDataSize", 0);
        setField(term127340, term127340.getClass(), "vertexLabel", null);
        setField(term127340, term127340.getClass(), "edgeLabel", null);
        setField(term127340, term127340.getClass(), "vertexIndex", null);
        setField(term127340, term127340.getClass(), "adjSet", null);
        setField(term127340, term127340.getClass(), "adjMap", null);
        setField(term127340, term127340.getClass(), "maxVertexNumber", null);
        setField(term127340, term127340.getClass(), "labelVertexMap", null);
        setField(term127340, term127340.getClass(), "labelEdgeMap", null);
        setBooleanField(term127340, term127340.getClass(), "directed", false);
        setBooleanField(term127340, term127340.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127340, term127340.getClass(), "allowingSelfLoops", false);
        setIntField(term127340, term127340.getClass(), "avgDegree", 0);
        setBooleanField(term127340, term127340.getClass(), "safeMode", false);
        term127351 = new Integer(0);
        term127353 = new Integer(0);
        term127355 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term127351;
        args[1] = term127353;
        args[2] = term127355;
        callMethod(klass, "setEdgeWeight", argTypes, term127340, args);
    }

};


