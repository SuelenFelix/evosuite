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

public class ParallelFilterKruskal_getTree_64020737212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;

    public ParallelFilterKruskal_getTree_64020737212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2284 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        setField(term2284, term2284.getClass(), "tree", null);
        setField(term2284, term2284.getClass(), "unionFind", null);
        setField(term2284, term2284.getClass(), "edges", null);
        setLongField(term2284, term2284.getClass(), "finalNrOfEdges", 0L);
        setField(term2284, term2284.getClass(), "totalWeight", null);
        setBooleanField(term2284, term2284.getClass(), "calculated", false);
        setField(term2284, term2284.getClass(), "graph", null);
        setBooleanField(term2284, term2284.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree", argTypes, term2284, args);
    }

};


