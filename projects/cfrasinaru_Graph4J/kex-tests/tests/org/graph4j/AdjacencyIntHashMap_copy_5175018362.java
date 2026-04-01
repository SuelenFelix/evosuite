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

public class AdjacencyIntHashMap_copy_5175018362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101002;

    public AdjacencyIntHashMap_copy_5175018362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101002 = newInstance(Class.forName("org.graph4j.AdjacencyIntHashMap"));
        Object term101003 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term101004 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term101003, term101003.getClass(), "table", term101004);
        setIntField(term101003, term101003.getClass(), "count", 0);
        setIntField(term101003, term101003.getClass(), "threshold", 15);
        setFloatField(term101003, term101003.getClass(), "loadFactor", 0.75F);
        setField(term101002, term101002.getClass(), "hashMap", term101003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyIntHashMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term101002, args);
    }

};


