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

public class IntHashMap_remove_13212136129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8711;
     Object term8715;

    public IntHashMap_remove_13212136129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8711 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        setField(term8711, term8711.getClass(), "table", null);
        setIntField(term8711, term8711.getClass(), "count", 0);
        setIntField(term8711, term8711.getClass(), "threshold", 0);
        setFloatField(term8711, term8711.getClass(), "loadFactor", 0.0F);
        term8715 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8715;
        callMethod(klass, "remove", argTypes, term8711, args);
    }

};


