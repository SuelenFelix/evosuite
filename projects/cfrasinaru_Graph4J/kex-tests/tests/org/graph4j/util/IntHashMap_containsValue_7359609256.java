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
import java.lang.Integer;

public class IntHashMap_containsValue_7359609256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8588;
     Object term8593;

    public IntHashMap_containsValue_7359609256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8588 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8589 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term8588, term8588.getClass(), "table", term8589);
        setIntField(term8588, term8588.getClass(), "count", -1284079635);
        setIntField(term8588, term8588.getClass(), "threshold", 15);
        setFloatField(term8588, term8588.getClass(), "loadFactor", 0.75F);
        term8593 = new Integer(-2130090775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8593;
        callMethod(klass, "containsValue", argTypes, term8588, args);
    }

};


