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

public class BipartiteGraphSupport_compute_175002182321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5864;

    public BipartiteGraphSupport_compute_175002182321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5864 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport"));
        setField(term5864, term5864.getClass(), "color", null);
        setField(term5864, term5864.getClass(), "bipartite", null);
        setField(term5864, term5864.getClass(), "oddCycle", null);
        setField(term5864, term5864.getClass(), "leftSide", null);
        setField(term5864, term5864.getClass(), "rightSide", null);
        setField(term5864, term5864.getClass(), "coloring", null);
        setField(term5864, term5864.getClass(), "maximumMatchingAlg", null);
        setField(term5864, term5864.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term5864, args);
    }

};


