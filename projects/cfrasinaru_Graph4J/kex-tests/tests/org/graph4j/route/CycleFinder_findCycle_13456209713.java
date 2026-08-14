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

public class CycleFinder_findCycle_13456209713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806;

    public CycleFinder_findCycle_13456209713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1820 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term1819 = ((Class) term1820).getDeclaredField((String) "BFS");
        ((Field) term1819).setAccessible(true);
        Object enum5 = ((Field) term1819).get((Object) null);
        term1806 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term1806, term1806.getClass(), "target", -585773976);
        setIntField(term1806, term1806.getClass(), "parity", 852806940);
        setBooleanField(term1806, term1806.getClass(), "shortest", true);
        setBooleanField(term1806, term1806.getClass(), "longer", true);
        setField(term1806, term1806.getClass(), "strategy", enum5);
        setField(term1806, term1806.getClass(), "graph", null);
        setBooleanField(term1806, term1806.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findCycle", argTypes, term1806, args);
    }

};


