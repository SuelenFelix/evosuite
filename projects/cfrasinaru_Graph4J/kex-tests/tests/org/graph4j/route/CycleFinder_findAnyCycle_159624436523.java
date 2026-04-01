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

public class CycleFinder_findAnyCycle_159624436523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5296;
     Object term5302;

    public CycleFinder_findAnyCycle_159624436523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5296 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5296, term5296.getClass(), "target", 0);
        setIntField(term5296, term5296.getClass(), "parity", 0);
        setBooleanField(term5296, term5296.getClass(), "shortest", false);
        setBooleanField(term5296, term5296.getClass(), "longer", false);
        setField(term5296, term5296.getClass(), "strategy", null);
        setField(term5296, term5296.getClass(), "graph", null);
        setBooleanField(term5296, term5296.getClass(), "directed", false);
        term5302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5302;
        callMethod(klass, "findAnyCycle", argTypes, term5296, args);
    }

};


