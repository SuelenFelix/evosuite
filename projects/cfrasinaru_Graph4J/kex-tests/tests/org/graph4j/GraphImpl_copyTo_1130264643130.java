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

public class GraphImpl_copyTo_1130264643130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44871;
     Object term44882;
     Object term44884;
     Object term44886;
     Object term44888;
     Object term44890;

    public GraphImpl_copyTo_1130264643130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44871 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44871, term44871.getClass(), "name", null);
        setIntField(term44871, term44871.getClass(), "maxVertices", 0);
        setIntField(term44871, term44871.getClass(), "numVertices", 0);
        setLongField(term44871, term44871.getClass(), "numEdges", 0L);
        setField(term44871, term44871.getClass(), "vertices", null);
        setField(term44871, term44871.getClass(), "degree", null);
        setField(term44871, term44871.getClass(), "adjList", null);
        setField(term44871, term44871.getClass(), "adjPos", null);
        setField(term44871, term44871.getClass(), "vertexWeight", null);
        setIntField(term44871, term44871.getClass(), "vertexDataSize", 0);
        setField(term44871, term44871.getClass(), "edgeData", null);
        setIntField(term44871, term44871.getClass(), "edgeDataSize", 0);
        setField(term44871, term44871.getClass(), "vertexLabel", null);
        setField(term44871, term44871.getClass(), "edgeLabel", null);
        setField(term44871, term44871.getClass(), "vertexIndex", null);
        setField(term44871, term44871.getClass(), "adjSet", null);
        setField(term44871, term44871.getClass(), "adjMap", null);
        setField(term44871, term44871.getClass(), "maxVertexNumber", null);
        setField(term44871, term44871.getClass(), "labelVertexMap", null);
        setField(term44871, term44871.getClass(), "labelEdgeMap", null);
        setBooleanField(term44871, term44871.getClass(), "directed", false);
        setBooleanField(term44871, term44871.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44871, term44871.getClass(), "allowingSelfLoops", false);
        setIntField(term44871, term44871.getClass(), "avgDegree", 0);
        setBooleanField(term44871, term44871.getClass(), "safeMode", false);
        term44882 = new Boolean(false);
        term44884 = new Boolean(false);
        term44886 = new Boolean(false);
        term44888 = new Boolean(false);
        term44890 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.graph4j.GraphImpl");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term44882;
        args[2] = term44884;
        args[3] = term44886;
        args[4] = term44888;
        args[5] = term44890;
        callMethod(klass, "copyTo", argTypes, term44871, args);
    }

};


