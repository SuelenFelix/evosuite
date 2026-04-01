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

public class CycleFinder_containsCycle_14895194024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2030;

    public CycleFinder_containsCycle_14895194024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2044 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term2043 = ((Class) term2044).getDeclaredField((String) "BFS");
        ((Field) term2043).setAccessible(true);
        Object enum6 = ((Field) term2043).get((Object) null);
        term2030 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term2030, term2030.getClass(), "target", 698551724);
        setIntField(term2030, term2030.getClass(), "parity", -1631048635);
        setBooleanField(term2030, term2030.getClass(), "shortest", false);
        setBooleanField(term2030, term2030.getClass(), "longer", true);
        setField(term2030, term2030.getClass(), "strategy", enum6);
        setField(term2030, term2030.getClass(), "graph", null);
        setBooleanField(term2030, term2030.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "containsCycle", argTypes, term2030, args);
    }

};


