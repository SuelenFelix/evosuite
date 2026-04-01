package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DijkstraShortestPathHeap_preCompute_5586548365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1963;

    public DijkstraShortestPathHeap_preCompute_5586548365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1963 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap"));
        setField(term1963, term1963.getClass(), "heap", null);
        setIntField(term1963, term1963.getClass(), "source", 0);
        setField(term1963, term1963.getClass(), "vertices", null);
        setField(term1963, term1963.getClass(), "cost", null);
        setField(term1963, term1963.getClass(), "before", null);
        setField(term1963, term1963.getClass(), "size", null);
        setField(term1963, term1963.getClass(), "solved", null);
        setIntField(term1963, term1963.getClass(), "numSolved", 0);
        setField(term1963, term1963.getClass(), "graph", null);
        setBooleanField(term1963, term1963.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preCompute", argTypes, term1963, args);
    }

};


