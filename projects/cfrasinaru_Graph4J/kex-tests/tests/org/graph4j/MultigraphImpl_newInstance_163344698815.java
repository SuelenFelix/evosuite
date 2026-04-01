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
     Object term127289;
     Object term127300;
     Object term127302;
     Object term127304;
     Object term127306;
     Object term127308;
     Object term127310;
     Object term127312;

    public MultigraphImpl_newInstance_163344698815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127289 = newInstance(Class.forName("org.graph4j.MultigraphImpl"));
        setField(term127289, term127289.getClass(), "name", null);
        setIntField(term127289, term127289.getClass(), "maxVertices", 0);
        setIntField(term127289, term127289.getClass(), "numVertices", 0);
        setLongField(term127289, term127289.getClass(), "numEdges", 0L);
        setField(term127289, term127289.getClass(), "vertices", null);
        setField(term127289, term127289.getClass(), "degree", null);
        setField(term127289, term127289.getClass(), "adjList", null);
        setField(term127289, term127289.getClass(), "adjPos", null);
        setField(term127289, term127289.getClass(), "vertexWeight", null);
        setIntField(term127289, term127289.getClass(), "vertexDataSize", 0);
        setField(term127289, term127289.getClass(), "edgeData", null);
        setIntField(term127289, term127289.getClass(), "edgeDataSize", 0);
        setField(term127289, term127289.getClass(), "vertexLabel", null);
        setField(term127289, term127289.getClass(), "edgeLabel", null);
        setField(term127289, term127289.getClass(), "vertexIndex", null);
        setField(term127289, term127289.getClass(), "adjSet", null);
        setField(term127289, term127289.getClass(), "adjMap", null);
        setField(term127289, term127289.getClass(), "maxVertexNumber", null);
        setField(term127289, term127289.getClass(), "labelVertexMap", null);
        setField(term127289, term127289.getClass(), "labelEdgeMap", null);
        setBooleanField(term127289, term127289.getClass(), "directed", false);
        setBooleanField(term127289, term127289.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term127289, term127289.getClass(), "allowingSelfLoops", false);
        setIntField(term127289, term127289.getClass(), "avgDegree", 0);
        setBooleanField(term127289, term127289.getClass(), "safeMode", false);
        term127300 = new Integer(0);
        term127302 = new Integer(0);
        term127304 = new Boolean(false);
        term127306 = new Boolean(false);
        term127308 = new Boolean(false);
        term127310 = new Integer(0);
        term127312 = new Integer(0);
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
        args[1] = term127300;
        args[2] = term127302;
        args[3] = term127304;
        args[4] = term127306;
        args[5] = term127308;
        args[6] = term127310;
        args[7] = term127312;
        callMethod(klass, "newInstance", argTypes, term127289, args);
    }

};


