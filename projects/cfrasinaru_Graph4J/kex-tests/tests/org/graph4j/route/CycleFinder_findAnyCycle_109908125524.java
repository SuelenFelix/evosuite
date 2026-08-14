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
import java.lang.Integer;

public class CycleFinder_findAnyCycle_109908125524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5304;
     Object term5310;

    public CycleFinder_findAnyCycle_109908125524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5304 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5304, term5304.getClass(), "target", 0);
        setIntField(term5304, term5304.getClass(), "parity", 0);
        setBooleanField(term5304, term5304.getClass(), "shortest", false);
        setBooleanField(term5304, term5304.getClass(), "longer", false);
        setField(term5304, term5304.getClass(), "strategy", null);
        setField(term5304, term5304.getClass(), "graph", null);
        setBooleanField(term5304, term5304.getClass(), "directed", false);
        term5310 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.TraversalStrategy");
        Object[] args = new Object[2];
        args[0] = term5310;
        args[1] = null;
        callMethod(klass, "findAnyCycle", argTypes, term5304, args);
    }

};


