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

public class WeightedSpanningTreeIterator_hasNext_11805697769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63403;

    public WeightedSpanningTreeIterator_hasNext_11805697769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63403 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        setField(term63403, term63403.getClass(), "graph", null);
        setIntField(term63403, term63403.getClass(), "numVertices", 0);
        setField(term63403, term63403.getClass(), "edges", null);
        setField(term63403, term63403.getClass(), "queue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term63403, args);
    }

};


