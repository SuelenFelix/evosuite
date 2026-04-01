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

public class CycleFinder_BFSCycleVisitor_init_13219031880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public CycleFinder_BFSCycleVisitor_init_13219031880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term305 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term304 = ((Class) term305).getDeclaredField((String) "DFS");
        ((Field) term304).setAccessible(true);
        Object enum1 = ((Field) term304).get((Object) null);
        term291 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term291, term291.getClass(), "target", -481533957);
        setIntField(term291, term291.getClass(), "parity", 1240914516);
        setBooleanField(term291, term291.getClass(), "shortest", false);
        setBooleanField(term291, term291.getClass(), "longer", true);
        setField(term291, term291.getClass(), "strategy", enum1);
        setField(term291, term291.getClass(), "graph", null);
        setBooleanField(term291, term291.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.route.CycleFinder");
        Object[] args = new Object[1];
        args[0] = term291;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


