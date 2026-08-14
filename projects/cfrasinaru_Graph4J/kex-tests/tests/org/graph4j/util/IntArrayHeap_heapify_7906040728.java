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
     Object term5568;
     Object term5672;

    public IntArrayHeap_heapify_7906040728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5568 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term5569 = (int[]) newIntArray(101);
        setField(term5568, term5568.getClass(), "comparator", null);
        setIntElement(term5569, 0, -2147483648);
        setField(term5568, term5568.getClass(), "heap", term5569);
        setIntField(term5568, term5568.getClass(), "size", -2117361140);
        term5672 = new Integer(407708341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5672;
        callMethod(klass, "heapify", argTypes, term5568, args);
    }

};


