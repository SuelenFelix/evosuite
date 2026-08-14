package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TopologicalOrderIterator_init_7877154736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2362;

    public TopologicalOrderIterator_init_7877154736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2362 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        setField(term2362, term2362.getClass(), "graph", null);
        setBooleanField(term2362, term2362.getClass(), "computeLevels", false);
        setField(term2362, term2362.getClass(), "indegrees", null);
        setField(term2362, term2362.getClass(), "levels", null);
        setField(term2362, term2362.getClass(), "queue", null);
        setIntField(term2362, term2362.getClass(), "currentVertex", 0);
        setIntField(term2362, term2362.getClass(), "counter", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term2362, args);
    }

};


