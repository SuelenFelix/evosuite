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

public class DFSTraverser_dfs_1565522067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110577;

    public DFSTraverser_dfs_1565522067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110577 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        setField(term110577, term110577.getClass(), "graph", null);
        setBooleanField(term110577, term110577.getClass(), "directed", false);
        setField(term110577, term110577.getClass(), "visitor", null);
        setIntField(term110577, term110577.getClass(), "orderIndex", 0);
        setIntField(term110577, term110577.getClass(), "compIndex", 0);
        setField(term110577, term110577.getClass(), "visited", null);
        setField(term110577, term110577.getClass(), "nextPos", null);
        setIntField(term110577, term110577.getClass(), "restartIndex", 0);
        setField(term110577, term110577.getClass(), "stack", null);
        setField(term110577, term110577.getClass(), "instack", null);
        setBooleanField(term110577, term110577.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dfs", argTypes, term110577, args);
    }

};


