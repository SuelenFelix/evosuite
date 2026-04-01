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

public class MaximumInducedPath_findRec_19365726755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;

    public MaximumInducedPath_findRec_19365726755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term909 = newInstance(Class.forName("org.graph4j.route.MaximumInducedPath"));
        setField(term909, term909.getClass(), "currentPath", null);
        setField(term909, term909.getClass(), "maxPath", null);
        setField(term909, term909.getClass(), "graph", null);
        setBooleanField(term909, term909.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.MaximumInducedPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findRec", argTypes, term909, args);
    }

};


