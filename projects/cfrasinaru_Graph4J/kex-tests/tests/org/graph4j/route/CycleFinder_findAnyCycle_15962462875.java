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

public class CycleFinder_findAnyCycle_15962462875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2254;

    public CycleFinder_findAnyCycle_15962462875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2268 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term2267 = ((Class) term2268).getDeclaredField((String) "BFS");
        ((Field) term2267).setAccessible(true);
        Object enum7 = ((Field) term2267).get((Object) null);
        term2254 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term2254, term2254.getClass(), "target", 1342808731);
        setIntField(term2254, term2254.getClass(), "parity", -64893740);
        setBooleanField(term2254, term2254.getClass(), "shortest", true);
        setBooleanField(term2254, term2254.getClass(), "longer", true);
        setField(term2254, term2254.getClass(), "strategy", enum7);
        setField(term2254, term2254.getClass(), "graph", null);
        setBooleanField(term2254, term2254.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findAnyCycle", argTypes, term2254, args);
    }

};


