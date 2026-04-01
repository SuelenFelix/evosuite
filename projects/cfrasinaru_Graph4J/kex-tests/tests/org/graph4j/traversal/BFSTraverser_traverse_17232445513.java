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

public class BFSTraverser_traverse_17232445513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87315;
     Object term87322;

    public BFSTraverser_traverse_17232445513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87315 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        setField(term87315, term87315.getClass(), "graph", null);
        setBooleanField(term87315, term87315.getClass(), "directed", false);
        setField(term87315, term87315.getClass(), "visitor", null);
        setField(term87315, term87315.getClass(), "queue", null);
        setIntField(term87315, term87315.getClass(), "orderIndex", 0);
        setIntField(term87315, term87315.getClass(), "compIndex", 0);
        setField(term87315, term87315.getClass(), "visited", null);
        setIntField(term87315, term87315.getClass(), "restartIndex", 0);
        setIntField(term87315, term87315.getClass(), "maxLevel", 0);
        setBooleanField(term87315, term87315.getClass(), "interrupted", false);
        term87322 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.BFSVisitor");
        Object[] args = new Object[2];
        args[0] = term87322;
        args[1] = null;
        callMethod(klass, "traverse", argTypes, term87315, args);
    }

};


