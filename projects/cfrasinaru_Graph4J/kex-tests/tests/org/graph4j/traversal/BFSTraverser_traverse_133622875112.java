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
     Object term87306;
     Object term87313;

    public BFSTraverser_traverse_133622875112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87306 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term87306, term87306.getClass(), "graph", null);
        setBooleanField(term87306, term87306.getClass(), "directed", false);
        setField(term87306, term87306.getClass(), "visitor", null);
        setField(term87306, term87306.getClass(), "queue", null);
        setIntField(term87306, term87306.getClass(), "orderIndex", 0);
        setIntField(term87306, term87306.getClass(), "compIndex", 0);
        setField(term87306, term87306.getClass(), "visited", null);
        setIntField(term87306, term87306.getClass(), "restartIndex", 0);
        setIntField(term87306, term87306.getClass(), "maxLevel", 0);
        setBooleanField(term87306, term87306.getClass(), "interrupted", false);
        term87313 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87313;
        callMethod(klass, "traverse", argTypes, term87306, args);
    }

};


