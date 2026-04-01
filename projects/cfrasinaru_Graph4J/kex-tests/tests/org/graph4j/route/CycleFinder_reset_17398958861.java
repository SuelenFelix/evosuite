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
import java.lang.String;
import java.lang.Object;

public class CycleFinder_reset_17398958861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1358;

    public CycleFinder_reset_17398958861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1372 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term1371 = ((Class) term1372).getDeclaredField((String) "DFS");
        ((Field) term1371).setAccessible(true);
        Object enum3 = ((Field) term1371).get((Object) null);
        term1358 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term1358, term1358.getClass(), "target", 1611734632);
        setIntField(term1358, term1358.getClass(), "parity", 868908117);
        setBooleanField(term1358, term1358.getClass(), "shortest", false);
        setBooleanField(term1358, term1358.getClass(), "longer", false);
        setField(term1358, term1358.getClass(), "strategy", enum3);
        setField(term1358, term1358.getClass(), "graph", null);
        setBooleanField(term1358, term1358.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term1358, args);
    }

};


