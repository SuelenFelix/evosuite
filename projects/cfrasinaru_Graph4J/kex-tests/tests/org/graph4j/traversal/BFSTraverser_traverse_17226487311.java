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

public class BFSTraverser_traverse_17226487311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;

    public BFSTraverser_traverse_17226487311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term513, term513.getClass(), "graph", null);
        setBooleanField(term513, term513.getClass(), "directed", false);
        setField(term513, term513.getClass(), "visitor", null);
        setField(term513, term513.getClass(), "queue", null);
        setIntField(term513, term513.getClass(), "orderIndex", 0);
        setIntField(term513, term513.getClass(), "compIndex", 0);
        setField(term513, term513.getClass(), "visited", null);
        setIntField(term513, term513.getClass(), "restartIndex", 0);
        setIntField(term513, term513.getClass(), "maxLevel", 0);
        setBooleanField(term513, term513.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.BFSVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverse", argTypes, term513, args);
    }

};


