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
import java.lang.Integer;

public class BFSTraverser_traverse_133622875112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520;
     Object term527;

    public BFSTraverser_traverse_133622875112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term520, term520.getClass(), "graph", null);
        setBooleanField(term520, term520.getClass(), "directed", false);
        setField(term520, term520.getClass(), "visitor", null);
        setField(term520, term520.getClass(), "queue", null);
        setIntField(term520, term520.getClass(), "orderIndex", 0);
        setIntField(term520, term520.getClass(), "compIndex", 0);
        setField(term520, term520.getClass(), "visited", null);
        setIntField(term520, term520.getClass(), "restartIndex", 0);
        setIntField(term520, term520.getClass(), "maxLevel", 0);
        setBooleanField(term520, term520.getClass(), "interrupted", false);
        term527 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term527;
        callMethod(klass, "traverse", argTypes, term520, args);
    }

};


