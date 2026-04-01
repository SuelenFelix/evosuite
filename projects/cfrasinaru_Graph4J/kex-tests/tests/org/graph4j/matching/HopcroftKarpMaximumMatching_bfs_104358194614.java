package org.graph4j.matching;

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
import static org.graph4j.matching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HopcroftKarpMaximumMatching_bfs_104358194614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1159;

    public HopcroftKarpMaximumMatching_bfs_104358194614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1159 = newInstance(Class.forName("org.graph4j.matching.HopcroftKarpMaximumMatching"));
        setField(term1159, term1159.getClass(), "leftSide", null);
        setField(term1159, term1159.getClass(), "rightSide", null);
        setField(term1159, term1159.getClass(), "matching", null);
        setField(term1159, term1159.getClass(), "maxStable", null);
        setField(term1159, term1159.getClass(), "minCover", null);
        setField(term1159, term1159.getClass(), "peer", null);
        setField(term1159, term1159.getClass(), "queue", null);
        setField(term1159, term1159.getClass(), "stack", null);
        setField(term1159, term1159.getClass(), "target", null);
        setField(term1159, term1159.getClass(), "dist", null);
        setField(term1159, term1159.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.HopcroftKarpMaximumMatching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bfs", argTypes, term1159, args);
    }

};


