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

public class BoruvkaMinimumSpanningTreeParallel_updateCheapestEdges_9863009337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;

    public BoruvkaMinimumSpanningTreeParallel_updateCheapestEdges_9863009337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1301 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel"));
        setField(term1301, term1301.getClass(), "allEdges", null);
        setIntField(term1301, term1301.getClass(), "nrThreads", 0);
        setField(term1301, term1301.getClass(), "executor", null);
        setField(term1301, term1301.getClass(), "uf", null);
        setField(term1301, term1301.getClass(), "cheapest", null);
        setField(term1301, term1301.getClass(), "tree", null);
        setField(term1301, term1301.getClass(), "treeEdges", null);
        setField(term1301, term1301.getClass(), "minWeight", null);
        setField(term1301, term1301.getClass(), "graph", null);
        setBooleanField(term1301, term1301.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateCheapestEdges", argTypes, term1301, args);
    }

};


