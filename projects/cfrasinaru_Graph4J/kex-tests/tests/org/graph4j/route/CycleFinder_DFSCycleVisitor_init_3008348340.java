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

public class CycleFinder_DFSCycleVisitor_init_3008348340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;

    public CycleFinder_DFSCycleVisitor_init_3008348340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term952 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term951 = ((Class) term952).getDeclaredField((String) "DFS");
        ((Field) term951).setAccessible(true);
        Object enum2 = ((Field) term951).get((Object) null);
        term938 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term938, term938.getClass(), "target", -507944154);
        setIntField(term938, term938.getClass(), "parity", -1736183862);
        setBooleanField(term938, term938.getClass(), "shortest", false);
        setBooleanField(term938, term938.getClass(), "longer", true);
        setField(term938, term938.getClass(), "strategy", enum2);
        setField(term938, term938.getClass(), "graph", null);
        setBooleanField(term938, term938.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.route.CycleFinder");
        Object[] args = new Object[1];
        args[0] = term938;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


