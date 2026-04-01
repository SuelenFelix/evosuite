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

public class DijkstraShortestPathDefault_findMinIndex_9668714183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public DijkstraShortestPathDefault_findMinIndex_9668714183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathDefault"));
        setIntField(term403, term403.getClass(), "source", 0);
        setField(term403, term403.getClass(), "vertices", null);
        setField(term403, term403.getClass(), "cost", null);
        setField(term403, term403.getClass(), "before", null);
        setField(term403, term403.getClass(), "size", null);
        setField(term403, term403.getClass(), "solved", null);
        setIntField(term403, term403.getClass(), "numSolved", 0);
        setField(term403, term403.getClass(), "graph", null);
        setBooleanField(term403, term403.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findMinIndex", argTypes, term403, args);
    }

};


