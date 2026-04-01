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

public class CycleFinder_findAnyCycle_15962443656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2478;
     Object term2491;

    public CycleFinder_findAnyCycle_15962443656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2494 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term2493 = ((Class) term2494).getDeclaredField((String) "DFS");
        ((Field) term2493).setAccessible(true);
        Object enum8 = ((Field) term2493).get((Object) null);
        term2478 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term2478, term2478.getClass(), "target", -222012928);
        setIntField(term2478, term2478.getClass(), "parity", -146564963);
        setBooleanField(term2478, term2478.getClass(), "shortest", false);
        setBooleanField(term2478, term2478.getClass(), "longer", false);
        setField(term2478, term2478.getClass(), "strategy", enum8);
        setField(term2478, term2478.getClass(), "graph", null);
        setBooleanField(term2478, term2478.getClass(), "directed", true);
        term2491 = new Integer(-83178716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2491;
        callMethod(klass, "findAnyCycle", argTypes, term2478, args);
    }

};


