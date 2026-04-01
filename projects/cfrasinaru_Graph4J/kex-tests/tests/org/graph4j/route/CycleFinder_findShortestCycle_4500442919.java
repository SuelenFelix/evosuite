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

public class CycleFinder_findShortestCycle_4500442919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3372;
     Object term3385;

    public CycleFinder_findShortestCycle_4500442919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3388 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term3387 = ((Class) term3388).getDeclaredField((String) "DFS");
        ((Field) term3387).setAccessible(true);
        Object enum12 = ((Field) term3387).get((Object) null);
        term3372 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term3372, term3372.getClass(), "target", 783730213);
        setIntField(term3372, term3372.getClass(), "parity", 1815951606);
        setBooleanField(term3372, term3372.getClass(), "shortest", true);
        setBooleanField(term3372, term3372.getClass(), "longer", false);
        setField(term3372, term3372.getClass(), "strategy", enum12);
        setField(term3372, term3372.getClass(), "graph", null);
        setBooleanField(term3372, term3372.getClass(), "directed", false);
        term3385 = new Integer(1105016932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3385;
        callMethod(klass, "findShortestCycle", argTypes, term3372, args);
    }

};


