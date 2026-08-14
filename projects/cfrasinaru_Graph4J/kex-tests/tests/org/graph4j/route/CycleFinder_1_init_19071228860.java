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

public class CycleFinder_1_init_19071228860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CycleFinder_1_init_19071228860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term28 = ((Class) term29).getDeclaredField((String) "DFS");
        ((Field) term28).setAccessible(true);
        Object enum0 = ((Field) term28).get((Object) null);
        term1 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term1, term1.getClass(), "target", 568599855);
        setIntField(term1, term1.getClass(), "parity", 1162663216);
        setBooleanField(term1, term1.getClass(), "shortest", false);
        setBooleanField(term1, term1.getClass(), "longer", false);
        setField(term1, term1.getClass(), "strategy", enum0);
        setField(term1, term1.getClass(), "graph", null);
        setBooleanField(term1, term1.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.route.CycleFinder");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


