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
import java.lang.Boolean;

public class MultigraphImpl_newInstance_163344698815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127292;
     Object term127303;
     Object term127305;
     Object term127307;
     Object term127309;
     Object term127311;
     Object term127313;
     Object term127315;

    public MultigraphImpl_newInstance_163344698815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127292 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127292, term127292.getClass(), "name", null);
        setIntField(term127292, term127292.getClass(), "maxVertices", 0);
        setIntField(term127292, term127292.getClass(), "numVertices", 0);
        setLongField(term127292, term127292.getClass(), "numEdges", 0L);
        setField(term127292, term127292.getClass(), "vertices", null);
        setField(term127292, term127292.getClass(), "degree", null);
        setField(term127292, term127292.getClass(), "adjList", null);
        setField(term127292, term127292.getClass(), "adjPos", null);
        setField(term127292, term127292.getClass(), "vertexWeight", null);
        setIntField(term127292, term127292.getClass(), "vertexDataSize", 0);
        setField(term127292, term127292.getClass(), "edgeData", null);
        setIntField(term127292, term127292.getClass(), "edgeDataSize", 0);
        setField(term127292, term127292.getClass(), "vertexLabel", null);
        setField(term127292, term127292.getClass(), "edgeLabel", null);
        setField(term127292, term127292.getClass(), "vertexIndex", null);
        setField(term127292, term127292.getClass(), "adjSet", null);
        setField(term127292, term127292.getClass(), "adjMap", null);
        setField(term127292, term127292.getClass(), "maxVertexNumber", null);
        setField(term127292, term127292.getClass(), "labelVertexMap", null);
        setField(term127292, term127292.getClass(), "labelEdgeMap", null);
        setBooleanField(term127292, term127292.getClass(), "directed", false);
        setBooleanField(term127292, term127292.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127292, term127292.getClass(), "allowingSelfLoops", false);
        setIntField(term127292, term127292.getClass(), "avgDegree", 0);
        setBooleanField(term127292, term127292.getClass(), "safeMode", false);
        term127303 = new Integer(0);
        term127305 = new Integer(0);
        term127307 = new Boolean(false);
        term127309 = new Boolean(false);
        term127311 = new Boolean(false);
        term127313 = new Integer(0);
        term127315 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = term127303;
        args[2] = term127305;
        args[3] = term127307;
        args[4] = term127309;
        args[5] = term127311;
        args[6] = term127313;
        args[7] = term127315;
        callMethod(klass, "newInstance", argTypes, term127292, args);
    }

};


