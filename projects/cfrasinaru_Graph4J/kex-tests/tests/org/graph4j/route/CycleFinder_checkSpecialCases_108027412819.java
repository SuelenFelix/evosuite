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

public class CycleFinder_checkSpecialCases_108027412819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5272;

    public CycleFinder_checkSpecialCases_108027412819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5272 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5272, term5272.getClass(), "target", 0);
        setIntField(term5272, term5272.getClass(), "parity", 0);
        setBooleanField(term5272, term5272.getClass(), "shortest", false);
        setBooleanField(term5272, term5272.getClass(), "longer", false);
        setField(term5272, term5272.getClass(), "strategy", null);
        setField(term5272, term5272.getClass(), "graph", null);
        setBooleanField(term5272, term5272.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkSpecialCases", argTypes, term5272, args);
    }

};


