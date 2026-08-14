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

public class CycleFinder_findEvenCycle_130741195328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5332;

    public CycleFinder_findEvenCycle_130741195328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5332 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5332, term5332.getClass(), "target", 0);
        setIntField(term5332, term5332.getClass(), "parity", 0);
        setBooleanField(term5332, term5332.getClass(), "shortest", false);
        setBooleanField(term5332, term5332.getClass(), "longer", false);
        setField(term5332, term5332.getClass(), "strategy", null);
        setField(term5332, term5332.getClass(), "graph", null);
        setBooleanField(term5332, term5332.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findEvenCycle", argTypes, term5332, args);
    }

};


