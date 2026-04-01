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

public class CycleFinder_findOddCycle_139707128210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3598;

    public CycleFinder_findOddCycle_139707128210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3612 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term3611 = ((Class) term3612).getDeclaredField((String) "BFS");
        ((Field) term3611).setAccessible(true);
        Object enum13 = ((Field) term3611).get((Object) null);
        term3598 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term3598, term3598.getClass(), "target", -365784998);
        setIntField(term3598, term3598.getClass(), "parity", -1893236300);
        setBooleanField(term3598, term3598.getClass(), "shortest", true);
        setBooleanField(term3598, term3598.getClass(), "longer", false);
        setField(term3598, term3598.getClass(), "strategy", enum13);
        setField(term3598, term3598.getClass(), "graph", null);
        setBooleanField(term3598, term3598.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findOddCycle", argTypes, term3598, args);
    }

};


