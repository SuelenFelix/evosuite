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

public class DFSTraverser_traverse_2865830195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1963;
     Object term1969;

    public DFSTraverser_traverse_2865830195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1963 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        setField(term1963, term1963.getClass(), "graph", null);
        setBooleanField(term1963, term1963.getClass(), "directed", false);
        setField(term1963, term1963.getClass(), "visitor", null);
        setIntField(term1963, term1963.getClass(), "orderIndex", 0);
        setIntField(term1963, term1963.getClass(), "compIndex", 0);
        setField(term1963, term1963.getClass(), "visited", null);
        setField(term1963, term1963.getClass(), "nextPos", null);
        setIntField(term1963, term1963.getClass(), "restartIndex", 0);
        setField(term1963, term1963.getClass(), "stack", null);
        setField(term1963, term1963.getClass(), "instack", null);
        setBooleanField(term1963, term1963.getClass(), "interrupted", false);
        term1969 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.DFSVisitor");
        Object[] args = new Object[2];
        args[0] = term1969;
        args[1] = null;
        callMethod(klass, "traverse", argTypes, term1963, args);
    }

};


