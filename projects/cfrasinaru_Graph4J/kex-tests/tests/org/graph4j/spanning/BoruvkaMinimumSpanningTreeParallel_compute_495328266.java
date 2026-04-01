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

public class BoruvkaMinimumSpanningTreeParallel_compute_495328266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100936;

    public BoruvkaMinimumSpanningTreeParallel_compute_495328266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100936 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel"));
        setField(term100936, term100936.getClass(), "allEdges", null);
        setIntField(term100936, term100936.getClass(), "nrThreads", 0);
        setField(term100936, term100936.getClass(), "executor", null);
        setField(term100936, term100936.getClass(), "uf", null);
        setField(term100936, term100936.getClass(), "cheapest", null);
        setField(term100936, term100936.getClass(), "tree", null);
        setField(term100936, term100936.getClass(), "treeEdges", null);
        setField(term100936, term100936.getClass(), "minWeight", null);
        setField(term100936, term100936.getClass(), "graph", null);
        setBooleanField(term100936, term100936.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term100936, args);
    }

};


