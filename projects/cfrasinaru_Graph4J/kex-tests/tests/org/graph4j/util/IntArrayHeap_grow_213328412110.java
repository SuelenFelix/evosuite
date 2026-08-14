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

public class IntArrayHeap_grow_213328412110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5984;

    public IntArrayHeap_grow_213328412110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5984 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term5985 = (int[]) newIntArray(101);
        setField(term5984, term5984.getClass(), "comparator", null);
        setIntElement(term5985, 0, -2147483648);
        setField(term5984, term5984.getClass(), "heap", term5985);
        setIntField(term5984, term5984.getClass(), "size", -1413291732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "grow", argTypes, term5984, args);
    }

};


