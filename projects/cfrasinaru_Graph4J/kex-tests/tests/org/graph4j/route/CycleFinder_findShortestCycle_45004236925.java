package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CycleFinder_findShortestCycle_45004236925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5312;

    public CycleFinder_findShortestCycle_45004236925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5312 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5312, term5312.getClass(), "target", 0);
        setIntField(term5312, term5312.getClass(), "parity", 0);
        setBooleanField(term5312, term5312.getClass(), "shortest", false);
        setBooleanField(term5312, term5312.getClass(), "longer", false);
        setField(term5312, term5312.getClass(), "strategy", null);
        setField(term5312, term5312.getClass(), "graph", null);
        setBooleanField(term5312, term5312.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findShortestCycle", argTypes, term5312, args);
    }

};


