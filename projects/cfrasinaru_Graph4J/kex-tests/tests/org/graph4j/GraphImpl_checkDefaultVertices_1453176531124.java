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

public class GraphImpl_checkDefaultVertices_1453176531124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44781;

    public GraphImpl_checkDefaultVertices_1453176531124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44781 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        setField(term44781, term44781.getClass(), "name", null);
        setIntField(term44781, term44781.getClass(), "maxVertices", 0);
        setIntField(term44781, term44781.getClass(), "numVertices", 0);
        setLongField(term44781, term44781.getClass(), "numEdges", 0L);
        setField(term44781, term44781.getClass(), "vertices", null);
        setField(term44781, term44781.getClass(), "degree", null);
        setField(term44781, term44781.getClass(), "adjList", null);
        setField(term44781, term44781.getClass(), "adjPos", null);
        setField(term44781, term44781.getClass(), "vertexWeight", null);
        setIntField(term44781, term44781.getClass(), "vertexDataSize", 0);
        setField(term44781, term44781.getClass(), "edgeData", null);
        setIntField(term44781, term44781.getClass(), "edgeDataSize", 0);
        setField(term44781, term44781.getClass(), "vertexLabel", null);
        setField(term44781, term44781.getClass(), "edgeLabel", null);
        setField(term44781, term44781.getClass(), "vertexIndex", null);
        setField(term44781, term44781.getClass(), "adjSet", null);
        setField(term44781, term44781.getClass(), "adjMap", null);
        setField(term44781, term44781.getClass(), "maxVertexNumber", null);
        setField(term44781, term44781.getClass(), "labelVertexMap", null);
        setField(term44781, term44781.getClass(), "labelEdgeMap", null);
        setBooleanField(term44781, term44781.getClass(), "directed", false);
        setBooleanField(term44781, term44781.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term44781, term44781.getClass(), "allowingSelfLoops", false);
        setIntField(term44781, term44781.getClass(), "avgDegree", 0);
        setBooleanField(term44781, term44781.getClass(), "safeMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkDefaultVertices", argTypes, term44781, args);
    }

};


