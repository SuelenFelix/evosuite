package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PrimMinimumSpanningTree_getEdges_20608299804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public PrimMinimumSpanningTree_getEdges_20608299804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("org.graph4j.spanning.PrimMinimumSpanningTree"));
        setField(term293, term293.getClass(), "minHeap", null);
        setField(term293, term293.getClass(), "solved", null);
        setField(term293, term293.getClass(), "weight", null);
        setField(term293, term293.getClass(), "peer", null);
        setField(term293, term293.getClass(), "tree", null);
        setField(term293, term293.getClass(), "treeEdges", null);
        setField(term293, term293.getClass(), "minWeight", null);
        setField(term293, term293.getClass(), "graph", null);
        setBooleanField(term293, term293.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.PrimMinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdges", argTypes, term293, args);
    }

};


