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

public class GraphImpl_newInstance_1126455636127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44814;
     Object term44825;
     Object term44827;
     Object term44829;
     Object term44831;
     Object term44833;
     Object term44835;
     Object term44837;

    public GraphImpl_newInstance_1126455636127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44814 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44814, term44814.getClass(), "name", null);
        setIntField(term44814, term44814.getClass(), "maxVertices", 0);
        setIntField(term44814, term44814.getClass(), "numVertices", 0);
        setLongField(term44814, term44814.getClass(), "numEdges", 0L);
        setField(term44814, term44814.getClass(), "vertices", null);
        setField(term44814, term44814.getClass(), "degree", null);
        setField(term44814, term44814.getClass(), "adjList", null);
        setField(term44814, term44814.getClass(), "adjPos", null);
        setField(term44814, term44814.getClass(), "vertexWeight", null);
        setIntField(term44814, term44814.getClass(), "vertexDataSize", 0);
        setField(term44814, term44814.getClass(), "edgeData", null);
        setIntField(term44814, term44814.getClass(), "edgeDataSize", 0);
        setField(term44814, term44814.getClass(), "vertexLabel", null);
        setField(term44814, term44814.getClass(), "edgeLabel", null);
        setField(term44814, term44814.getClass(), "vertexIndex", null);
        setField(term44814, term44814.getClass(), "adjSet", null);
        setField(term44814, term44814.getClass(), "adjMap", null);
        setField(term44814, term44814.getClass(), "maxVertexNumber", null);
        setField(term44814, term44814.getClass(), "labelVertexMap", null);
        setField(term44814, term44814.getClass(), "labelEdgeMap", null);
        setBooleanField(term44814, term44814.getClass(), "directed", false);
        setBooleanField(term44814, term44814.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44814, term44814.getClass(), "allowingSelfLoops", false);
        setIntField(term44814, term44814.getClass(), "avgDegree", 0);
        setBooleanField(term44814, term44814.getClass(), "safeMode", false);
        term44825 = new Integer(0);
        term44827 = new Integer(0);
        term44829 = new Boolean(false);
        term44831 = new Boolean(false);
        term44833 = new Boolean(false);
        term44835 = new Integer(0);
        term44837 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
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
        args[1] = term44825;
        args[2] = term44827;
        args[3] = term44829;
        args[4] = term44831;
        args[5] = term44833;
        args[6] = term44835;
        args[7] = term44837;
        callMethod(klass, "newInstance", argTypes, term44814, args);
    }

};


