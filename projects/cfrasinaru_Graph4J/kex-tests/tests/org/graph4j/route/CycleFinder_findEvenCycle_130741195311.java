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

public class CycleFinder_findEvenCycle_130741195311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3822;

    public CycleFinder_findEvenCycle_130741195311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3836 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term3835 = ((Class) term3836).getDeclaredField((String) "DFS");
        ((Field) term3835).setAccessible(true);
        Object enum14 = ((Field) term3835).get((Object) null);
        term3822 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term3822, term3822.getClass(), "target", -1858909368);
        setIntField(term3822, term3822.getClass(), "parity", -280113263);
        setBooleanField(term3822, term3822.getClass(), "shortest", false);
        setBooleanField(term3822, term3822.getClass(), "longer", false);
        setField(term3822, term3822.getClass(), "strategy", enum14);
        setField(term3822, term3822.getClass(), "graph", null);
        setBooleanField(term3822, term3822.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findEvenCycle", argTypes, term3822, args);
    }

};


