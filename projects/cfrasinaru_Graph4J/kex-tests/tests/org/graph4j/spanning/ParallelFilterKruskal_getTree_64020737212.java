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
     Object term149830;

    public ParallelFilterKruskal_getTree_64020737212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149830 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        setField(term149830, term149830.getClass(), "tree", null);
        setField(term149830, term149830.getClass(), "unionFind", null);
        setField(term149830, term149830.getClass(), "edges", null);
        setLongField(term149830, term149830.getClass(), "finalNrOfEdges", 0L);
        setField(term149830, term149830.getClass(), "totalWeight", null);
        setBooleanField(term149830, term149830.getClass(), "calculated", false);
        setField(term149830, term149830.getClass(), "graph", null);
        setBooleanField(term149830, term149830.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree", argTypes, term149830, args);
    }

};


