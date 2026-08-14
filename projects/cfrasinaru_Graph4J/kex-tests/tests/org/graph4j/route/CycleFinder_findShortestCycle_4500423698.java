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

public class CycleFinder_findShortestCycle_4500423698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3148;

    public CycleFinder_findShortestCycle_4500423698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3162 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term3161 = ((Class) term3162).getDeclaredField((String) "BFS");
        ((Field) term3161).setAccessible(true);
        Object enum11 = ((Field) term3161).get((Object) null);
        term3148 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term3148, term3148.getClass(), "target", 188512644);
        setIntField(term3148, term3148.getClass(), "parity", 1851127634);
        setBooleanField(term3148, term3148.getClass(), "shortest", true);
        setBooleanField(term3148, term3148.getClass(), "longer", true);
        setField(term3148, term3148.getClass(), "strategy", enum11);
        setField(term3148, term3148.getClass(), "graph", null);
        setBooleanField(term3148, term3148.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findShortestCycle", argTypes, term3148, args);
    }

};


