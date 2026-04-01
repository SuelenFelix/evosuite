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

public class DFSTraverser_traverse_2865234373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110409;

    public DFSTraverser_traverse_2865234373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110409 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        setField(term110409, term110409.getClass(), "graph", null);
        setBooleanField(term110409, term110409.getClass(), "directed", false);
        setField(term110409, term110409.getClass(), "visitor", null);
        setIntField(term110409, term110409.getClass(), "orderIndex", 0);
        setIntField(term110409, term110409.getClass(), "compIndex", 0);
        setField(term110409, term110409.getClass(), "visited", null);
        setField(term110409, term110409.getClass(), "nextPos", null);
        setIntField(term110409, term110409.getClass(), "restartIndex", 0);
        setField(term110409, term110409.getClass(), "stack", null);
        setField(term110409, term110409.getClass(), "instack", null);
        setBooleanField(term110409, term110409.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.DFSVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverse", argTypes, term110409, args);
    }

};


