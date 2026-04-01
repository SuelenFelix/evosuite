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

public class CycleFinder_checkSpecialCases_10802741282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1582;

    public CycleFinder_checkSpecialCases_10802741282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1596 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term1595 = ((Class) term1596).getDeclaredField((String) "BFS");
        ((Field) term1595).setAccessible(true);
        Object enum4 = ((Field) term1595).get((Object) null);
        term1582 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term1582, term1582.getClass(), "target", 1789351397);
        setIntField(term1582, term1582.getClass(), "parity", 2145528170);
        setBooleanField(term1582, term1582.getClass(), "shortest", true);
        setBooleanField(term1582, term1582.getClass(), "longer", true);
        setField(term1582, term1582.getClass(), "strategy", enum4);
        setField(term1582, term1582.getClass(), "graph", null);
        setBooleanField(term1582, term1582.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkSpecialCases", argTypes, term1582, args);
    }

};


