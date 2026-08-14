package org.graph4j.ordering;

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
import static org.graph4j.ordering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TopologicalOrdering_findOrdering_647112465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;

    public TopologicalOrdering_findOrdering_647112465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108 = newInstance(Class.forName("org.graph4j.ordering.TopologicalOrdering"));
        setField(term108, term108.getClass(), "ordering", null);
        setField(term108, term108.getClass(), "levels", null);
        setBooleanField(term108, term108.getClass(), "unique", false);
        setBooleanField(term108, term108.getClass(), "computed", false);
        setField(term108, term108.getClass(), "graph", null);
        setField(term108, term108.getClass(), "stronglyConnected", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.ordering.TopologicalOrdering");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findOrdering", argTypes, term108, args);
    }

};


