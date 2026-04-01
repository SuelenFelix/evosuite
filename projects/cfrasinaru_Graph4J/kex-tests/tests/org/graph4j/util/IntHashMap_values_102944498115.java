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

public class IntHashMap_values_102944498115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154619;

    public IntHashMap_values_102944498115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154619 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154620 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term154619, term154619.getClass(), "table", term154620);
        setIntField(term154619, term154619.getClass(), "count", 1772915021);
        setIntField(term154619, term154619.getClass(), "threshold", 15);
        setFloatField(term154619, term154619.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, term154619, args);
    }

};


