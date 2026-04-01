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

public class CycleFinder_findLongCycle_29229012712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4046;

    public CycleFinder_findLongCycle_29229012712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4060 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term4059 = ((Class) term4060).getDeclaredField((String) "DFS");
        ((Field) term4059).setAccessible(true);
        Object enum15 = ((Field) term4059).get((Object) null);
        term4046 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term4046, term4046.getClass(), "target", 529625347);
        setIntField(term4046, term4046.getClass(), "parity", 1409095253);
        setBooleanField(term4046, term4046.getClass(), "shortest", false);
        setBooleanField(term4046, term4046.getClass(), "longer", false);
        setField(term4046, term4046.getClass(), "strategy", enum15);
        setField(term4046, term4046.getClass(), "graph", null);
        setBooleanField(term4046, term4046.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLongCycle", argTypes, term4046, args);
    }

};


