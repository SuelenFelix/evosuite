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

public class IntHashMap_size_5212114784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154548;

    public IntHashMap_size_5212114784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154548 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154549 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term154548, term154548.getClass(), "table", term154549);
        setIntField(term154548, term154548.getClass(), "count", 28010955);
        setIntField(term154548, term154548.getClass(), "threshold", 15);
        setFloatField(term154548, term154548.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term154548, args);
    }

};


