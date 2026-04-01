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
import java.lang.Integer;

public class AdjacencyIntHashMap_add_1020900513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101008;
     Object term101014;
     Object term101016;

    public AdjacencyIntHashMap_add_1020900513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101008 = newInstance(Class.forName("org.graph4j.AdjacencyIntHashMap"));
        Object term101009 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term101010 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term101009, term101009.getClass(), "table", term101010);
        setIntField(term101009, term101009.getClass(), "count", 0);
        setIntField(term101009, term101009.getClass(), "threshold", 15);
        setFloatField(term101009, term101009.getClass(), "loadFactor", 0.75F);
        setField(term101008, term101008.getClass(), "hashMap", term101009);
        term101014 = new Integer(1363101790);
        term101016 = new Integer(877478140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyIntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term101014;
        args[1] = term101016;
        callMethod(klass, "add", argTypes, term101008, args);
    }

};


