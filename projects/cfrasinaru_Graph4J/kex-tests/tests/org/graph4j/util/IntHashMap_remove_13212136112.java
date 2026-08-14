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

public class IntHashMap_remove_13212136112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8632;
     Object term8637;

    public IntHashMap_remove_13212136112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8632 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8633 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term8632, term8632.getClass(), "table", term8633);
        setIntField(term8632, term8632.getClass(), "count", -520737857);
        setIntField(term8632, term8632.getClass(), "threshold", 15);
        setFloatField(term8632, term8632.getClass(), "loadFactor", 0.75F);
        term8637 = new Integer(-2038325814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8637;
        callMethod(klass, "remove", argTypes, term8632, args);
    }

};


