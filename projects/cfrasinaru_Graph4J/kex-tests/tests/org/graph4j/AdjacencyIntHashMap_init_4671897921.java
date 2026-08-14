package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AdjacencyIntHashMap_init_4671897921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101000;

    public AdjacencyIntHashMap_init_4671897921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101000 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term101001 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term101000, term101000.getClass(), "table", term101001);
        setIntField(term101000, term101000.getClass(), "count", 882451306);
        setIntField(term101000, term101000.getClass(), "threshold", 15);
        setFloatField(term101000, term101000.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyIntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.IntHashMap");
        Object[] args = new Object[1];
        args[0] = term101000;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


