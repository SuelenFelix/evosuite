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
import java.lang.Integer;

public class CycleFinder_findAnyCycle_10990812557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2704;
     Object term2717;
     Object enum10;

    public CycleFinder_findAnyCycle_10990812557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2727 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term2726 = ((Class) term2727).getDeclaredField((String) "BFS");
        ((Field) term2726).setAccessible(true);
        Object enum9 = ((Field) term2726).get((Object) null);
        term2704 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term2704, term2704.getClass(), "target", -1292704466);
        setIntField(term2704, term2704.getClass(), "parity", 1991858584);
        setBooleanField(term2704, term2704.getClass(), "shortest", true);
        setBooleanField(term2704, term2704.getClass(), "longer", false);
        setField(term2704, term2704.getClass(), "strategy", enum9);
        setField(term2704, term2704.getClass(), "graph", null);
        setBooleanField(term2704, term2704.getClass(), "directed", true);
        term2717 = new Integer(-1300947782);
        Class<? extends Object> term2938 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term2937 = ((Class) term2938).getDeclaredField((String) "DFS");
        ((Field) term2937).setAccessible(true);
        enum10 = ((Field) term2937).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.TraversalStrategy");
        Object[] args = new Object[2];
        args[0] = term2717;
        args[1] = enum10;
        callMethod(klass, "findAnyCycle", argTypes, term2704, args);
    }

};


