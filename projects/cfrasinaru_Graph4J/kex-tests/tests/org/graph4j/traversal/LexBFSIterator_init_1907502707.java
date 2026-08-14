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

public class LexBFSIterator_init_1907502707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3684;

    public LexBFSIterator_init_1907502707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3684 = newInstance(Class.forName("org.graph4j.traversal.LexBFSIterator"));
        setField(term3684, term3684.getClass(), "graph", null);
        setIntField(term3684, term3684.getClass(), "startVertex", 0);
        setIntField(term3684, term3684.getClass(), "compIndex", 0);
        setIntField(term3684, term3684.getClass(), "orderNumber", 0);
        setField(term3684, term3684.getClass(), "visited", null);
        setField(term3684, term3684.getClass(), "head", null);
        setField(term3684, term3684.getClass(), "vertexSlice", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.LexBFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term3684, args);
    }

};


