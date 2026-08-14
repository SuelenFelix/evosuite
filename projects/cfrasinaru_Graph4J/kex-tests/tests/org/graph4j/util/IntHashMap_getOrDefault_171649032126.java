package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class IntHashMap_getOrDefault_171649032126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8691;
     Object term8695;
     Object term8697;

    public IntHashMap_getOrDefault_171649032126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8691 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        setField(term8691, term8691.getClass(), "table", null);
        setIntField(term8691, term8691.getClass(), "count", 0);
        setIntField(term8691, term8691.getClass(), "threshold", 0);
        setFloatField(term8691, term8691.getClass(), "loadFactor", 0.0F);
        term8695 = new Integer(0);
        term8697 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8695;
        args[1] = term8697;
        callMethod(klass, "getOrDefault", argTypes, term8691, args);
    }

};


