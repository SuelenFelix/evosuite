package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BipartiteGraphSupport_isBipartite_76408135412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104444;

    public BipartiteGraphSupport_isBipartite_76408135412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104444 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport"));
        setField(term104444, term104444.getClass(), "color", null);
        setField(term104444, term104444.getClass(), "bipartite", null);
        setField(term104444, term104444.getClass(), "oddCycle", null);
        setField(term104444, term104444.getClass(), "leftSide", null);
        setField(term104444, term104444.getClass(), "rightSide", null);
        setField(term104444, term104444.getClass(), "coloring", null);
        setField(term104444, term104444.getClass(), "maximumMatchingAlg", null);
        setField(term104444, term104444.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBipartite", argTypes, term104444, args);
    }

};


