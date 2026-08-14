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

public class IntHashMap_containsValue_73596092523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8673;
     Object term8677;

    public IntHashMap_containsValue_73596092523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8673 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        setField(term8673, term8673.getClass(), "table", null);
        setIntField(term8673, term8673.getClass(), "count", 0);
        setIntField(term8673, term8673.getClass(), "threshold", 0);
        setFloatField(term8673, term8673.getClass(), "loadFactor", 0.0F);
        term8677 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8677;
        callMethod(klass, "containsValue", argTypes, term8673, args);
    }

};


