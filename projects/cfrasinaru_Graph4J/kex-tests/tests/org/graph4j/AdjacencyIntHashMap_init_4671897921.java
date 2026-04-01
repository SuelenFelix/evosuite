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
     Object term100997;

    public AdjacencyIntHashMap_init_4671897921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100997 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term100998 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term100997, term100997.getClass(), "table", term100998);
        setIntField(term100997, term100997.getClass(), "count", 882451306);
        setIntField(term100997, term100997.getClass(), "threshold", 15);
        setFloatField(term100997, term100997.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyIntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.IntHashMap");
        Object[] args = new Object[1];
        args[0] = term100997;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


