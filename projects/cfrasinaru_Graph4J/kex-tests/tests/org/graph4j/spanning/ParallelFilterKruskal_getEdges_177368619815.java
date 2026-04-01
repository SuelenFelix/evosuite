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

public class ParallelFilterKruskal_getEdges_177368619815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149842;

    public ParallelFilterKruskal_getEdges_177368619815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149842 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        setField(term149842, term149842.getClass(), "tree", null);
        setField(term149842, term149842.getClass(), "unionFind", null);
        setField(term149842, term149842.getClass(), "edges", null);
        setLongField(term149842, term149842.getClass(), "finalNrOfEdges", 0L);
        setField(term149842, term149842.getClass(), "totalWeight", null);
        setBooleanField(term149842, term149842.getClass(), "calculated", false);
        setField(term149842, term149842.getClass(), "graph", null);
        setBooleanField(term149842, term149842.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdges", argTypes, term149842, args);
    }

};


