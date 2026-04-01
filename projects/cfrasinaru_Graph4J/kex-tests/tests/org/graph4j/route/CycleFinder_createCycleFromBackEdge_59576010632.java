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

public class CycleFinder_createCycleFromBackEdge_59576010632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5356;

    public CycleFinder_createCycleFromBackEdge_59576010632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5356 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5356, term5356.getClass(), "target", 0);
        setIntField(term5356, term5356.getClass(), "parity", 0);
        setBooleanField(term5356, term5356.getClass(), "shortest", false);
        setBooleanField(term5356, term5356.getClass(), "longer", false);
        setField(term5356, term5356.getClass(), "strategy", null);
        setField(term5356, term5356.getClass(), "graph", null);
        setBooleanField(term5356, term5356.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createCycleFromBackEdge", argTypes, term5356, args);
    }

};


