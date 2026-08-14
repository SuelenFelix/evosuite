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
import java.lang.Object;

public class IntHashMap_init_922340853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8573;

    public IntHashMap_init_922340853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8573 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8574 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term8573, term8573.getClass(), "table", term8574);
        setIntField(term8573, term8573.getClass(), "count", -1983330479);
        setIntField(term8573, term8573.getClass(), "threshold", 15);
        setFloatField(term8573, term8573.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.IntHashMap");
        Object[] args = new Object[1];
        args[0] = term8573;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


