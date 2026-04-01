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

public class IntArrayHeap_swap_18138780557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111320;
     Object term111424;
     Object term111426;

    public IntArrayHeap_swap_18138780557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111320 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term111321 = (int[]) newIntArray(101);
        setField(term111320, term111320.getClass(), "comparator", null);
        setIntElement(term111321, 0, -2147483648);
        setField(term111320, term111320.getClass(), "heap", term111321);
        setIntField(term111320, term111320.getClass(), "size", 1407318663);
        term111424 = new Integer(879663317);
        term111426 = new Integer(-503337456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term111424;
        args[1] = term111426;
        callMethod(klass, "swap", argTypes, term111320, args);
    }

};


