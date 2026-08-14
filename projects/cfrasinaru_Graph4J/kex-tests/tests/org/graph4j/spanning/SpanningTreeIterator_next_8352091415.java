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

public class SpanningTreeIterator_next_8352091415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3844;

    public SpanningTreeIterator_next_8352091415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3844 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator"));
        setField(term3844, term3844.getClass(), "graph", null);
        setField(term3844, term3844.getClass(), "edges", null);
        setField(term3844, term3844.getClass(), "workTree", null);
        setField(term3844, term3844.getClass(), "nextTree", null);
        setIntField(term3844, term3844.getClass(), "currentPos", 0);
        setField(term3844, term3844.getClass(), "stack", null);
        setField(term3844, term3844.getClass(), "unionFind", null);
        setBooleanField(term3844, term3844.getClass(), "finished", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term3844, args);
    }

};


