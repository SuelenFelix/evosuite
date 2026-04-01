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

public class IntArrayHeap_heapify_7906040728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111529;
     Object term111633;

    public IntArrayHeap_heapify_7906040728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111529 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term111530 = (int[]) newIntArray(101);
        setField(term111529, term111529.getClass(), "comparator", null);
        setIntElement(term111530, 0, -2147483648);
        setField(term111529, term111529.getClass(), "heap", term111530);
        setIntField(term111529, term111529.getClass(), "size", 71852904);
        term111633 = new Integer(-22064897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term111633;
        callMethod(klass, "heapify", argTypes, term111529, args);
    }

};


