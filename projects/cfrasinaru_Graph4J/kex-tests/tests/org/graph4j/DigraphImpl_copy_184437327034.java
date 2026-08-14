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

public class DigraphImpl_copy_184437327034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172267;
     Object term172278;
     Object term172280;
     Object term172282;
     Object term172284;
     Object term172286;

    public DigraphImpl_copy_184437327034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172267 = newInstance(Class.forName("org.graph4j.DigraphImpl"));
        setField(term172267, term172267.getClass(), "predList", null);
        setField(term172267, term172267.getClass(), "predPos", null);
        setField(term172267, term172267.getClass(), "indegree", null);
        setField(term172267, term172267.getClass(), "name", null);
        setIntField(term172267, term172267.getClass(), "maxVertices", 0);
        setIntField(term172267, term172267.getClass(), "numVertices", 0);
        setLongField(term172267, term172267.getClass(), "numEdges", 0L);
        setField(term172267, term172267.getClass(), "vertices", null);
        setField(term172267, term172267.getClass(), "degree", null);
        setField(term172267, term172267.getClass(), "adjList", null);
        setField(term172267, term172267.getClass(), "adjPos", null);
        setField(term172267, term172267.getClass(), "vertexWeight", null);
        setIntField(term172267, term172267.getClass(), "vertexDataSize", 0);
        setField(term172267, term172267.getClass(), "edgeData", null);
        setIntField(term172267, term172267.getClass(), "edgeDataSize", 0);
        setField(term172267, term172267.getClass(), "vertexLabel", null);
        setField(term172267, term172267.getClass(), "edgeLabel", null);
        setField(term172267, term172267.getClass(), "vertexIndex", null);
        setField(term172267, term172267.getClass(), "adjSet", null);
        setField(term172267, term172267.getClass(), "adjMap", null);
        setField(term172267, term172267.getClass(), "maxVertexNumber", null);
        setField(term172267, term172267.getClass(), "labelVertexMap", null);
        setField(term172267, term172267.getClass(), "labelEdgeMap", null);
        setBooleanField(term172267, term172267.getClass(), "directed", false);
        setBooleanField(term172267, term172267.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term172267, term172267.getClass(), "allowingSelfLoops", false);
        setIntField(term172267, term172267.getClass(), "avgDegree", 0);
        setBooleanField(term172267, term172267.getClass(), "safeMode", false);
        term172278 = new Boolean(false);
        term172280 = new Boolean(false);
        term172282 = new Boolean(false);
        term172284 = new Boolean(false);
        term172286 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term172278;
        args[1] = term172280;
        args[2] = term172282;
        args[3] = term172284;
        args[4] = term172286;
        callMethod(klass, "copy", argTypes, term172267, args);
    }

};


