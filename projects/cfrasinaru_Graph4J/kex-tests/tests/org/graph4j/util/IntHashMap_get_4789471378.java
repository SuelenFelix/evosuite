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

public class IntHashMap_get_4789471378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8602;
     Object term8607;

    public IntHashMap_get_4789471378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8602 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8603 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term8602, term8602.getClass(), "table", term8603);
        setIntField(term8602, term8602.getClass(), "count", 951748736);
        setIntField(term8602, term8602.getClass(), "threshold", 15);
        setFloatField(term8602, term8602.getClass(), "loadFactor", 0.75F);
        term8607 = new Integer(787260842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8607;
        callMethod(klass, "get", argTypes, term8602, args);
    }

};


